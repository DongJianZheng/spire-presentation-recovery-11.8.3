#!/usr/bin/env python3
"""Compile an explicit source closure without vendor JARs or class caches."""
import argparse
import hashlib
import json
from pathlib import Path
import subprocess
import time

p = argparse.ArgumentParser()
p.add_argument('--source', type=Path, required=True)
p.add_argument('--closure', type=Path, required=True)
p.add_argument('--output', type=Path, required=True)
p.add_argument('--javac', type=Path, required=True)
p.add_argument('--timeout-seconds', type=int, default=300)
p.add_argument('--max-errors', type=int, default=20000)
p.add_argument('--add-export', action='append', default=[])
p.add_argument('--progress-plugin', type=Path,
               help='optional RecoveryProgress tooling JAR; never a business classpath input')
p.add_argument('--source-level', type=int,
               help='explicit javac source and target level; warnings are retained')
a = p.parse_args()
if a.timeout_seconds <= 0:
    raise ValueError('timeout-seconds must be positive')
if a.max_errors <= 0:
    raise ValueError('max-errors must be positive')
if a.progress_plugin is not None and not a.progress_plugin.is_file():
    raise ValueError('progress-plugin must be an existing tooling JAR')
if a.source_level is not None and a.source_level <= 0:
    raise ValueError('source-level must be positive')
a.output.mkdir(parents=True, exist_ok=False)
source = a.source.resolve()
keys = json.loads(a.closure.read_text())
if not isinstance(keys, list) or any(not isinstance(k, str) for k in keys):
    raise ValueError('closure must be a JSON array of internal class names')
files = sorted({source / (k + '.java') for k in keys})
missing = [str(f) for f in files if not f.is_file()]
if missing:
    raise ValueError('missing explicit closure sources: ' + repr(missing))
bridge = Path('tools/build-support/recovery/build/EnumBase.java').resolve()
files.append(bridge)
def hashes():
    return {str(f): hashlib.sha256(f.read_bytes()).hexdigest() for f in files}
before = hashes()
empty = (a.output / 'empty-classpath').resolve()
empty.mkdir()
classes = (a.output / 'classes').resolve()
classes.mkdir()
args = (a.output / 'sources.args').resolve()
args.write_text(''.join('"' + str(f).replace('\\', '\\\\').replace('"', '\\"') + '"\n' for f in files))
cmd = [str(a.javac.resolve()), '-J-Xmx4g', '-g', '-encoding', 'UTF-8',
       '-proc:none', '-implicit:none', '-Xmaxerrs', str(a.max_errors), '-XDrawDiagnostics',
       '-classpath', str(empty), '-sourcepath', str(empty), '-d', str(classes), '@' + str(args)]
for export in a.add_export:
    cmd[1:1] = ['--add-exports', export]
if a.source_level is not None:
    cmd[1:1] = ['-source', str(a.source_level), '-target', str(a.source_level)]
tool_inputs = []
if a.progress_plugin is not None:
    plugin = a.progress_plugin.resolve()
    events = (a.output / 'compiler-events.tsv').resolve()
    cmd[1:1] = ['-processorpath', str(plugin),
                '-Xplugin:RecoveryProgress ' + str(events)]
    tool_inputs.append({'path': str(plugin),
                        'sha256': hashlib.sha256(plugin.read_bytes()).hexdigest(),
                        'role': 'compiler phase evidence only'})
record = {'argv': cmd, 'sourceHashesBefore': before, 'jarInputs': [],
          'compilerToolInputs': tool_inputs,
          'classCacheInputs': [], 'timeoutSeconds': a.timeout_seconds,
          'scope': 'explicit source closure; generated classes are unaccepted'}
(a.output / 'provenance.json').write_text(json.dumps(record, indent=2))
with (a.output / 'compile.log').open('w') as log:
    started = time.monotonic()
    process = subprocess.Popen(cmd, stdout=log, stderr=subprocess.STDOUT)
    record['compilerPid'] = process.pid
    (a.output / 'provenance.json').write_text(json.dumps(record, indent=2))
    try:
        exit_code = process.wait(timeout=a.timeout_seconds)
    except subprocess.TimeoutExpired:
        jcmd = a.javac.resolve().parent / 'jcmd'
        if jcmd.is_file():
            try:
                snapshot = subprocess.run([str(jcmd), str(process.pid), 'Thread.print'],
                                          capture_output=True, text=True, timeout=10)
                (a.output / 'timeout-thread.txt').write_text(snapshot.stdout + snapshot.stderr)
                record['timeoutThreadSnapshotExit'] = snapshot.returncode
            except (subprocess.TimeoutExpired, OSError) as error:
                record['timeoutThreadSnapshotError'] = str(error)
        process.terminate()
        try:
            process.wait(timeout=5)
        except subprocess.TimeoutExpired:
            process.kill()
            process.wait()
        exit_code = 124
        record.update(incomplete=True, terminationReason='compile timeout')
    record['elapsedSeconds'] = time.monotonic() - started
if exit_code < 0 or exit_code in (124, 130, 137, 143):
    record['incomplete'] = True
record.update(exitCode=exit_code, sourceHashesStable=before == hashes(),
              generatedClasses=len(list(classes.rglob('*.class'))))
(a.output / 'provenance.json').write_text(json.dumps(record, indent=2))
print(json.dumps({k: record[k] for k in ['exitCode', 'sourceHashesStable', 'generatedClasses']}))
raise SystemExit(exit_code)

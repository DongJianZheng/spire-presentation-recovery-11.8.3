#!/usr/bin/env python3
"""Build the recovered enum/API initialization cluster, never the entire library.

Only Java sources, JDK and explicit metadata are inputs. No JAR/class cache input.
"""
import argparse
import hashlib
import json
import subprocess
import sys
from pathlib import Path


def sha(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--javac', required=True, type=Path)
    parser.add_argument('--output', required=True, type=Path)
    parser.add_argument('--source-root', type=Path)
    parser.add_argument('--map', type=Path)
    args = parser.parse_args()
    root = Path(__file__).resolve().parent.parent
    output = args.output.resolve()
    if output.exists():
        raise SystemExit('Refusing to overwrite output')
    source_root = args.source_root.resolve() if args.source_root else root / 'src'
    sources = [source_root / p for p in (
        'com/spire/presentation/FileFormat.java',
        'com/spire/presentation/packages/sprrrd.java',
        'com/spire/presentation/packages/sprfto.java',
        'com/spire/presentation/packages/sprtea.java')]
    sources.append(root / 'tools/build-support/recovery/build/EnumBase.java')
    mapping = args.map.resolve() if args.map else root / 'tools/member-name-map.json'
    restore = root / 'tools/restore-member-names.py'
    inputs = sources + [mapping, restore, Path(__file__).resolve()]
    hashes = {str(p): sha(p) for p in inputs}
    output.mkdir(parents=True)
    empty = output / 'empty-classpath'
    empty.mkdir()
    classes = output / 'compiled-classes'
    classes.mkdir()
    argfile = output / 'sources.args'
    for p in sources:
        if '\n' in str(p) or '\r' in str(p):
            raise ValueError('Unsupported newline in source path')
    argfile.write_text(''.join('"' + str(p).replace('\\', '\\\\').replace('"', '\\"') + '"\n' for p in sources))
    argv = [str(args.javac.resolve()), '-g', '-encoding', 'UTF-8', '-proc:none',
            '-classpath', str(empty), '-sourcepath', str(empty), '-d', str(classes), '@' + str(argfile)]
    version = subprocess.run([str(args.javac.resolve()), '-version'], capture_output=True, text=True, check=True)
    report = {'scope': 'Four-class enum initialization cluster; NOT a complete source build',
              'inputs': hashes, 'javacVersion': (version.stdout + version.stderr).strip(),
              'javacArgv': argv, 'jarInputs': [], 'classCacheInputs': [], 'sourceHashesStable': False}
    with (output / 'build.log').open('xb') as log:
        result = subprocess.run(argv, stdout=log, stderr=subprocess.STDOUT)
    report['compileExit'] = result.returncode
    if result.returncode == 0:
        remap = [sys.executable, str(restore), '--input', str(classes), '--output', str(output / 'runtime-classes'), '--map', str(mapping)]
        report['metadataArgv'] = remap
        with (output / 'metadata.log').open('xb') as log:
            result = subprocess.run(remap, stdout=log, stderr=subprocess.STDOUT)
        report['metadataExit'] = result.returncode
    stable = all(sha(Path(p)) == digest for p, digest in hashes.items())
    report['sourceHashesStable'] = stable
    report['classes'] = [{'path': str(p.relative_to(output / 'runtime-classes')), 'sha256': sha(p),
                          'source': str(source_root / (str(p.relative_to(output / 'runtime-classes')).removesuffix('.class') + '.java'))}
                         for p in sorted((output / 'runtime-classes').rglob('*.class'))]
    report['contractVerification'] = 'UNKNOWN until fresh probes run against these exact output hashes'
    (output / 'provenance.json').write_text(json.dumps(report, indent=2))
    print(json.dumps({'compileExit': report['compileExit'], 'metadataExit': report.get('metadataExit'),
                      'sourceHashesStable': stable, 'runtimeClasses': len(report['classes']), 'scope': report['scope']}))
    if result.returncode or not stable:
        raise SystemExit(result.returncode or 1)


if __name__ == '__main__':
    main()

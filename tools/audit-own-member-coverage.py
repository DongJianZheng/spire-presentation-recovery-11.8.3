#!/usr/bin/env python3
"""Read-only own-member coverage guard for fresh source-emitted classes."""
import argparse
import hashlib
import importlib.util
import json
from pathlib import Path
import zipfile

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--original-jar', required=True)
parser.add_argument('--class-file', required=True)
parser.add_argument('--owner', required=True)
parser.add_argument('--output', required=True)
args = parser.parse_args()
output = Path(args.output)
if output.exists():
    parser.error('refusing to overwrite evidence: ' + str(output))
spec = importlib.util.spec_from_file_location('restore', Path(__file__).with_name('restore-member-names.py'))
module = importlib.util.module_from_spec(spec)
spec.loader.exec_module(module)
def alias(name):
    if name.startswith('<'):
        return name
    return ''.join(c if c.isascii() and (c.isalnum() or c == '_') else '_u%04X_' % ord(c) for c in name)
with zipfile.ZipFile(args.original_jar) as archive:
    original = module.ClassFile(archive.read(args.owner + '.class'))
data = Path(args.class_file).read_bytes()
emitted = module.ClassFile(data)
rules = {(k, args.owner, alias(n), d): n for k, p, n, d, attrs in original.members()}
flags = {(k, args.owner, n, d): module.u2(original.tail, p) for k, p, n, d, attrs in original.members()}
restored_data, _ = emitted.restore(rules, None, {}, flags, {})
restored = module.ClassFile(restored_data)
def identities(cf):
    return {(k, n, d, module.u2(cf.tail, p)) for k, p, n, d, attrs in cf.members()}
missing = sorted(identities(original) - identities(restored))
extra = sorted(identities(restored) - identities(original))
report = {'owner': args.owner, 'classSha256': hashlib.sha256(data).hexdigest(),
          'major': int.from_bytes(emitted.header[6:8], 'big'),
          'missing': missing, 'extra': extra,
          'coverage': 'FAIL' if missing or extra else 'PASS',
          'scope': 'Own-member identities after generic alias/access restoration only; full ABI and behavior unverified.'}
output.parent.mkdir(parents=True, exist_ok=True)
with output.open('x') as handle:
    json.dump(report, handle, ensure_ascii=False, indent=2)
print(json.dumps({'coverage': report['coverage'], 'missing': len(missing), 'extra': len(extra), 'major': report['major']}))
raise SystemExit(1 if missing or extra else 0)

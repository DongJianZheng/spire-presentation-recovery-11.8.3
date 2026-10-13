#!/usr/bin/env python3
"""Replay descriptor-specific CP field guards on a source-generated class.

No original JAR input. Require an exact input hash, tuples and CP indices;
preserve all Code payloads and write exclusively to a fresh directory.
Run before general member-name restoration.
"""
import argparse
import hashlib
import importlib.util
import json
import struct
from pathlib import Path

spec = importlib.util.spec_from_file_location('member_restore', Path(__file__).with_name('restore-member-names.py'))
module = importlib.util.module_from_spec(spec)
spec.loader.exec_module(module)


def digest(data):
    return hashlib.sha256(data).hexdigest()


def tuple_at(cf, index):
    tag, raw = cf.cp[index]
    if tag != 9:
        raise ValueError('guard is not a Fieldref')
    owner, nat = struct.unpack('>HH', raw)
    name, descriptor = struct.unpack('>HH', cf.cp[nat][1])
    return [cf.utf(module.u2(cf.cp[owner][1], 0)), cf.utf(name), cf.utf(descriptor)]


def replay(data, manifest, expected_hash):
    if digest(data) != expected_hash:
        raise ValueError('input SHA-256 mismatch')
    cf = module.ClassFile(data)
    before = [code for *_, code in cf.members()]
    guards = [g for g in manifest['guards'] if g['caller'] == cf.owner]
    if not guards:
        raise ValueError('no guards for input owner')
    indices = set()
    # Validate every guard before changing anything.
    for g in guards:
        index = g['cpIndex']
        if index in indices:
            raise ValueError('duplicate guarded CP index')
        indices.add(index)
        if tuple_at(cf, index) != g['sourceTuple']:
            raise ValueError('source tuple mismatch at CP index ' + str(index))
        matches = [i for i, e in enumerate(cf.cp) if e and e[0] == 9 and tuple_at(cf, i) == g['sourceTuple']]
        if matches != [index]:
            raise ValueError('source tuple is not unique')
        if g['sourceTuple'][2] != g['targetTuple'][2]:
            raise ValueError('field descriptor change rejected')
    for g in guards:
        owner, name, desc = g['targetTuple']
        owner_index = cf.add(7, struct.pack('>H', cf.add_utf(owner)))
        nat = cf.add(12, struct.pack('>HH', cf.add_utf(name), cf.add_utf(desc)))
        cf.cp[g['cpIndex']] = (9, struct.pack('>HH', owner_index, nat))
    # Use the existing serializer without additional metadata changes.
    restored, changes = cf.restore({})
    assert not changes
    final = module.ClassFile(restored)
    if before != [code for *_, code in final.members()]:
        raise ValueError('Code payload changed')
    for g in guards:
        if tuple_at(final, g['cpIndex']) != g['targetTuple']:
            raise ValueError('target tuple mismatch')
    return restored, {'owner': cf.owner, 'inputSHA256': digest(data),
                      'outputSHA256': digest(restored), 'guardCount': len(guards),
                      'codePayloadsPreserved': True,
                      'scope': 'exact hashed input and descriptor-specific CP tuples; runtime/full ABI UNKNOWN'}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--classfile', required=True, type=Path)
    parser.add_argument('--guards', required=True, type=Path)
    parser.add_argument('--expected-sha256', required=True)
    parser.add_argument('--output', required=True, type=Path)
    args = parser.parse_args()
    data = args.classfile.read_bytes()
    manifest_bytes = args.guards.read_bytes()
    result, audit = replay(data, json.loads(manifest_bytes), args.expected_sha256)
    audit['guardsSHA256'] = digest(manifest_bytes)
    args.output.mkdir(parents=True, exist_ok=False)
    path = args.output / (audit['owner'] + '.class')
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_bytes(result)
    (args.output / 'audit.json').write_text(json.dumps(audit, indent=2) + '\n')
    print(json.dumps(audit))


if __name__ == '__main__':
    main()

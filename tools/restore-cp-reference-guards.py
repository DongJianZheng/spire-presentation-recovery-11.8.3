#!/usr/bin/env python3
"""Apply hash-pinned, descriptor-specific JVM reference-name guards.

This tool only reads an already source-generated class, a JSON guard manifest,
and an expected input hash. It never reads an original JAR or copies code.
It updates the NameAndType name index for exact field/method/interface-method
reference entries, then checks that every Code attribute is byte-identical.
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


def reference_tuple(cf, index):
    tag, raw = cf.cp[index]
    if tag not in (9, 10, 11):
        raise ValueError(f'guard CP entry {index} has non-reference tag {tag}')
    class_index, nat_index = struct.unpack('>HH', raw)
    class_tag, class_raw = cf.cp[class_index]
    nat_tag, nat_raw = cf.cp[nat_index]
    if class_tag != 7 or nat_tag != 12:
        raise ValueError(f'malformed reference CP entry {index}')
    owner = cf.utf(module.u2(class_raw, 0))
    name_index, descriptor_index = struct.unpack('>HH', nat_raw)
    return [owner, cf.utf(name_index), cf.utf(descriptor_index)]


def replay(data, guards_doc, expected_sha):
    if digest(data) != expected_sha:
        raise ValueError('input SHA-256 mismatch')
    cf = module.ClassFile(data)
    caller = cf.owner
    if guards_doc.get('caller') != caller:
        raise ValueError('guard caller does not match class owner')
    guards = guards_doc.get('guards', [])
    if not guards:
        raise ValueError('empty guard set')
    code_before = [code for *_, code in cf.members()]
    indices = set()
    # Validate the whole manifest before changing a CP entry.
    for guard in guards:
        index = guard['cpIndex']
        if index in indices:
            raise ValueError(f'duplicate guarded CP index {index}')
        indices.add(index)
        tag = guard['tag']
        if tag not in (9, 10, 11):
            raise ValueError(f'unsupported reference tag {tag}')
        if cf.cp[index][0] != tag:
            raise ValueError(f'tag mismatch at CP index {index}')
        source = guard['sourceTuple']
        target = guard['targetTuple']
        if reference_tuple(cf, index) != source:
            raise ValueError(f'source tuple mismatch at CP index {index}')
        matches = [i for i, entry in enumerate(cf.cp)
                   if entry and entry[0] == tag and reference_tuple(cf, i) == source]
        if matches != [index]:
            raise ValueError(f'source tuple not unique at guarded CP index {index}: {matches}')
        if source[0] != target[0] or source[2] != target[2]:
            raise ValueError(f'guard changes owner or descriptor at CP index {index}')
        expected_kind = {9: 'Fieldref', 10: 'Methodref', 11: 'InterfaceMethodref'}[tag]
        if guard.get('kind') != expected_kind:
            raise ValueError(f'kind/tag mismatch at CP index {index}')
    for guard in guards:
        index = guard['cpIndex']
        tag, raw = cf.cp[index]
        class_index, _ = struct.unpack('>HH', raw)
        owner, name, descriptor = guard['targetTuple']
        name_index = cf.add_utf(name)
        descriptor_index = cf.add_utf(descriptor)
        nat_index = cf.add(12, struct.pack('>HH', name_index, descriptor_index))
        cf.cp[index] = (tag, struct.pack('>HH', class_index, nat_index))
    result, changes = cf.restore({})
    if changes:
        raise AssertionError('metadata-only serializer unexpectedly changed declarations')
    restored = module.ClassFile(result)
    if code_before != [code for *_, code in restored.members()]:
        raise ValueError('Code attribute payload changed')
    for guard in guards:
        if reference_tuple(restored, guard['cpIndex']) != guard['targetTuple']:
            raise ValueError(f'target tuple mismatch at CP index {guard["cpIndex"]}')
    return result, {
        'caller': caller,
        'inputSHA256': digest(data),
        'outputSHA256': digest(result),
        'guardCount': len(guards),
        'tags': {name: sum(1 for g in guards if g['kind'] == name)
                 for name in ('Fieldref', 'Methodref', 'InterfaceMethodref')},
        'codePayloadsPreserved': True,
        'scope': 'hash-pinned CP reference owner/name/descriptor guards; no runtime/full ABI claim',
    }


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--classfile', required=True, type=Path)
    parser.add_argument('--guards', required=True, type=Path)
    parser.add_argument('--expected-sha256', required=True)
    parser.add_argument('--output', required=True, type=Path)
    args = parser.parse_args()
    data = args.classfile.read_bytes()
    guard_bytes = args.guards.read_bytes()
    restored, audit = replay(data, json.loads(guard_bytes), args.expected_sha256)
    audit['guardsSHA256'] = digest(guard_bytes)
    args.output.mkdir(parents=True, exist_ok=False)
    path = args.output / (audit['caller'] + '.class')
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_bytes(restored)
    (args.output / 'audit.json').write_text(json.dumps(audit, indent=2) + '\n')
    print(json.dumps(audit))


if __name__ == '__main__':
    main()

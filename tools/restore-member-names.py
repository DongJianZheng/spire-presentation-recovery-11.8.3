#!/usr/bin/env python3
"""Restore source-compiled JVM member names using an explicit descriptor map.

No reference JAR/class input. Explicit name/type/access metadata may change;
strings and Code attributes remain byte-identical. Writes a fresh tree.
"""
import argparse
import hashlib
import json
import struct
from pathlib import Path


def u2(data, offset):
    return struct.unpack_from('>H', data, offset)[0]


def mutf_encode(value):
    units = value.encode('utf-16-be', 'surrogatepass')
    out = bytearray()
    for i in range(0, len(units), 2):
        n = u2(units, i)
        if 0 < n < 128:
            out.append(n)
        elif n < 2048:
            out.extend((0xc0 | (n >> 6), 0x80 | (n & 63)))
        else:
            out.extend((0xe0 | (n >> 12), 0x80 | ((n >> 6) & 63), 0x80 | (n & 63)))
    return bytes(out)


class ClassFile:
    def __init__(self, data):
        if data[:4] != b'\xca\xfe\xba\xbe':
            raise ValueError('not a class file')
        self.header = data[:8]
        self.cp = [None]
        pos = 10
        sizes = {3: 4, 4: 4, 5: 8, 6: 8, 7: 2, 8: 2, 9: 4, 10: 4,
                 11: 4, 12: 4, 15: 3, 16: 2, 17: 4, 18: 4, 19: 2, 20: 2}
        while len(self.cp) < u2(data, 8):
            tag = data[pos]
            pos += 1
            size = 2 + u2(data, pos) if tag == 1 else sizes[tag]
            self.cp.append((tag, data[pos:pos + size]))
            pos += size
            if tag in (5, 6):
                self.cp.append(None)
        self.tail = bytearray(data[pos:])
        self.owner = self.utf(u2(self.cp[u2(self.tail, 2)][1], 0))

    def utf(self, index):
        tag, raw = self.cp[index]
        assert tag == 1
        value = raw[2:].replace(b'\xc0\x80', b'\x00').decode('utf-8', 'surrogatepass')
        return value.encode('utf-16-be', 'surrogatepass').decode('utf-16-be', 'surrogatepass')

    def add(self, tag, raw):
        entry = (tag, raw)
        try:
            return self.cp.index(entry)
        except ValueError:
            if len(self.cp) >= 65535:
                raise ValueError('constant pool overflow')
            self.cp.append(entry)
            return len(self.cp) - 1

    def add_utf(self, value):
        raw = mutf_encode(value)
        if len(raw) > 65535:
            raise ValueError('UTF8 constant too long')
        return self.add(1, struct.pack('>H', len(raw)) + raw)

    def members(self):
        pos = 8 + 2 * u2(self.tail, 6)
        for kind in ('field', 'method'):
            count = u2(self.tail, pos)
            pos += 2
            for _ in range(count):
                member_pos = pos
                name = self.utf(u2(self.tail, pos + 2))
                desc = self.utf(u2(self.tail, pos + 4))
                attrs = u2(self.tail, pos + 6)
                pos += 8
                code = []
                for _ in range(attrs):
                    attr_name = self.utf(u2(self.tail, pos))
                    length = struct.unpack_from('>I', self.tail, pos + 2)[0]
                    if attr_name == 'Code':
                        code.append(bytes(self.tail[pos + 6:pos + 6 + length]))
                    pos += 6 + length
                yield kind, member_pos, name, desc, code

    def restore(self, rules, resolve_reference=None, class_rules=None, member_flags=None, class_flags=None, member_signatures=None):
        before = [code for *_, code in self.members()]
        members = list(self.members())
        identities = set()
        for kind, _, name, desc, _ in members:
            key = (kind, self.owner, name, desc)
            identity = (kind, rules.get(key, name), desc)
            if identity in identities:
                raise ValueError('restored member collision: ' + str(identity))
            identities.add(identity)
        changed = []
        for index, entry in enumerate(list(self.cp)):
            if not entry or entry[0] not in (9, 10, 11):
                continue
            tag, raw = entry
            owner_index, nt_index = struct.unpack('>HH', raw)
            owner = self.utf(u2(self.cp[owner_index][1], 0))
            name_index, desc_index = struct.unpack('>HH', self.cp[nt_index][1])
            kind = 'field' if tag == 9 else 'method'
            key = (kind, owner, self.utf(name_index), self.utf(desc_index))
            replacement_name = rules.get(key) if resolve_reference is None else resolve_reference(key)
            if replacement_name is not None:
                replacement = self.add_utf(replacement_name)
                nt = self.add(12, struct.pack('>HH', replacement, desc_index))
                self.cp[index] = (tag, struct.pack('>HH', owner_index, nt))
                changed.append({'reference': list(key), 'to': replacement_name})
        for kind, pos, name, desc, _ in list(self.members()):
            key = (kind, self.owner, name, desc)
            if key in rules:
                struct.pack_into('>H', self.tail, pos + 2, self.add_utf(rules[key]))
                changed.append({'declaration': list(key), 'to': rules[key]})
        class_rules = class_rules or {}

        def descriptor(value):
            for old, new in class_rules.items():
                value = value.replace('L' + old + ';', 'L' + new + ';')
                value = value.replace('L' + old + '<', 'L' + new + '<')
            return value

        for index, entry in enumerate(list(self.cp)):
            if not entry:
                continue
            tag, raw = entry
            if tag == 7:
                old = self.utf(u2(raw, 0))
                new = class_rules.get(old, descriptor(old))
                if new != old:
                    self.cp[index] = (tag, struct.pack('>H', self.add_utf(new)))
                    changed.append({'classReference': old, 'to': new})
            elif tag in (12, 16):
                offset = 2 if tag == 12 else 0
                old = self.utf(u2(raw, offset))
                new = descriptor(old)
                if new != old:
                    payload = bytearray(raw)
                    struct.pack_into('>H', payload, offset, self.add_utf(new))
                    self.cp[index] = (tag, bytes(payload))
                    changed.append({'descriptorReference': old, 'to': new})

        def attributes(pos, count):
            for _ in range(count):
                name = self.utf(u2(self.tail, pos))
                length = struct.unpack_from('>I', self.tail, pos + 2)[0]
                if name == 'Signature':
                    old = self.utf(u2(self.tail, pos + 6))
                    new = descriptor(old)
                    if new != old:
                        struct.pack_into('>H', self.tail, pos + 6, self.add_utf(new))
                        changed.append({'signature': old, 'to': new})
                pos += 6 + length
            return pos

        pos = 8 + 2 * u2(self.tail, 6)
        for kind in ('field', 'method'):
            count = u2(self.tail, pos)
            pos += 2
            for _ in range(count):
                old = self.utf(u2(self.tail, pos + 4))
                new = descriptor(old)
                if new != old:
                    struct.pack_into('>H', self.tail, pos + 4, self.add_utf(new))
                key = (kind, class_rules.get(self.owner, self.owner), self.utf(u2(self.tail, pos + 2)), new)
                if key in (member_flags or {}):
                    flags = member_flags[key]
                    changed.append({'memberFlags': list(key), 'from': u2(self.tail, pos), 'to': flags})
                    struct.pack_into('>H', self.tail, pos, flags)
                attr_count = u2(self.tail, pos + 6)
                pos = attributes(pos + 8, attr_count)
        attributes(pos + 2, u2(self.tail, pos))
        if self.owner in (class_flags or {}):
            flags = class_flags[self.owner]
            changed.append({'classFlags': self.owner, 'from': u2(self.tail, 0), 'to': flags})
            struct.pack_into('>H', self.tail, 0, flags)
        if member_signatures:
            pos = 8 + 2 * u2(self.tail, 6)
            rebuilt = bytearray(self.tail[:pos])
            for kind in ('field', 'method'):
                count = u2(self.tail, pos)
                rebuilt.extend(self.tail[pos:pos + 2])
                pos += 2
                for _ in range(count):
                    header = bytearray(self.tail[pos:pos + 8])
                    key = (kind, class_rules.get(self.owner, self.owner), self.utf(u2(header, 2)), self.utf(u2(header, 4)))
                    wanted = member_signatures.get(key)
                    attr_count = u2(header, 6)
                    pos += 8
                    attrs = []
                    found = False
                    for _ in range(attr_count):
                        attr_name = self.utf(u2(self.tail, pos))
                        size = 6 + struct.unpack_from('>I', self.tail, pos + 2)[0]
                        payload = bytes(self.tail[pos:pos + size])
                        if attr_name == 'Signature' and wanted is not None:
                            payload = struct.pack('>HIH', self.add_utf('Signature'), 2, self.add_utf(wanted))
                            found = True
                        attrs.append(payload)
                        pos += size
                    if wanted is not None and not found:
                        attrs.append(struct.pack('>HIH', self.add_utf('Signature'), 2, self.add_utf(wanted)))
                    if wanted is not None:
                        changed.append({'memberSignature': list(key), 'to': wanted})
                    struct.pack_into('>H', header, 6, len(attrs))
                    rebuilt.extend(header)
                    rebuilt.extend(b''.join(attrs))
            rebuilt.extend(self.tail[pos:])
            self.tail = rebuilt
        after = [code for *_, code in self.members()]
        if before != after:
            raise AssertionError('Code attribute changed')
        data = self.header + struct.pack('>H', len(self.cp))
        data += b''.join(bytes([tag]) + raw for entry in self.cp[1:] if entry for tag, raw in [entry])
        return data + self.tail, changed


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--input', required=True, type=Path)
    parser.add_argument('--output', required=True, type=Path)
    parser.add_argument('--map', required=True, type=Path)
    parser.add_argument('--allow-absent-owners', action='store_true',
                        help='Explicitly allow a subset of a larger member map')
    args = parser.parse_args()
    if not args.input.is_dir():
        raise SystemExit('Input class directory does not exist')
    if args.output.exists():
        raise SystemExit('Refusing to overwrite output')
    config = json.loads(args.map.read_text())
    entries = config['members']
    class_rules = config.get('classes', {})
    excluded = set(config.get('buildOnlyClasses', []))
    if excluded - set(class_rules):
        raise SystemExit('Every excluded build-only class needs an explicit replacement')
    member_flags = {(e['kind'], e['owner'], e['name'], e['descriptor']): e['access']
                    for e in config.get('memberFlags', [])}
    member_signatures = {(e['kind'], e['owner'], e['name'], e['descriptor']): e['signature']
                         for e in config.get('memberSignatures', [])}
    rules = {}
    for entry in entries:
        key = (entry['kind'], entry['owner'], entry['sourceName'], entry['descriptor'])
        if key in rules:
            raise ValueError('duplicate member map: ' + str(key))
        rules[key] = entry['jvmName']
    paths = sorted(args.input.rglob('*.class'))
    if not paths:
        raise SystemExit('Input contains no classes')
    declared = set()
    owners = set()
    hierarchy = {}
    for path in paths:
        cf = ClassFile(path.read_bytes())
        owners.add(cf.owner)
        parents = []
        super_index = u2(cf.tail, 4)
        if super_index:
            parents.append(cf.utf(u2(cf.cp[super_index][1], 0)))
        interfaces = [cf.utf(u2(cf.cp[u2(cf.tail, 8 + 2 * i)][1], 0))
                      for i in range(u2(cf.tail, 6))]
        hierarchy[cf.owner] = (parents, interfaces)
        declared.update((kind, cf.owner, name, desc) for kind, _, name, desc, _ in cf.members())
    missing = [key for key in rules if key[1] in owners and key not in declared]
    if missing:
        raise SystemExit('Descriptor map does not match compiled declarations: ' + str(missing))
    absent = sorted({key[1] for key in rules} - owners)
    if absent and not args.allow_absent_owners:
        raise SystemExit('Map owners absent from compiled input: ' + str(absent))

    def resolve_reference(key):
        kind, owner, name, desc = key
        seen = set()

        def find(current):
            if current in seen:
                return []
            seen.add(current)
            candidate = (kind, current, name, desc)
            if candidate in declared:
                return [candidate]
            parents, interfaces = hierarchy.get(current, ([], []))
            # Field resolution searches interfaces before the superclass;
            # class method resolution searches the superclass first.
            groups = (interfaces, parents) if kind == 'field' else (parents, interfaces)
            for group in groups:
                found = [item for parent in group for item in find(parent)]
                if found:
                    return found
            return []

        matches = find(owner)
        names = {rules.get(match, name) for match in matches}
        if len(names) > 1:
            raise ValueError('Ambiguous inherited member mapping: ' + str(key))
        replacement = next(iter(names)) if names else None
        return replacement if replacement != name else None
    args.output.mkdir(parents=True)
    reports = []
    for path in paths:
        original = path.read_bytes()
        cf = ClassFile(original)
        if cf.owner in excluded:
            continue
        result, changes = cf.restore(rules, resolve_reference, class_rules, member_flags,
                                     config.get('classFlags', {}), member_signatures)
        transformed = ClassFile(result)
        residual = [transformed.utf(u2(entry[1], 0)) for entry in transformed.cp if entry and entry[0] == 7
                    and transformed.utf(u2(entry[1], 0)) in excluded]
        if residual:
            raise ValueError('Runtime class retains build-only class reference: ' + str(residual))
        target = args.output / (transformed.owner + '.class')
        if target.exists():
            raise ValueError('Class output collision: ' + str(target))
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_bytes(result)
        reports.append({'class': str(path.relative_to(args.input)), 'before': hashlib.sha256(original).hexdigest(),
                        'after': hashlib.sha256(result).hexdigest(), 'codeAttributesIdentical': True, 'changes': changes})
    (args.output / 'member-name-restoration.json').write_text(json.dumps(reports, indent=2, ensure_ascii=False))
    print(json.dumps({'classes': len(reports), 'changes': sum(len(r['changes']) for r in reports),
                      'codeAttributesIdentical': True}))


if __name__ == '__main__':
    main()

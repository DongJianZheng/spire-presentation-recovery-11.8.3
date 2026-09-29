import fs from 'node:fs';
import cp from 'node:child_process';

const [leftJar, rightJar, outFile] = process.argv.slice(2);
if (!leftJar || !rightJar || !outFile) throw new Error('usage: compare-class-structure.mjs LEFT.jar RIGHT.jar OUT');
const u16 = (b, p) => b.readUInt16BE(p);
const u32 = (b, p) => b.readUInt32BE(p);
function parse(file) {
  const b = Buffer.isBuffer(file) ? file : fs.readFileSync(file); if (u32(b, 0) !== 0xcafebabe) throw new Error('not class');
  const cp = []; let p = 10; const n = u16(b, 8);
  for (let i = 1; i < n; i++) {
    const tag = b[p++];
    if (tag === 1) { const len = u16(b, p); cp[i] = b.subarray(p + 2, p + 2 + len).toString('utf8'); p += 2 + len; }
    else if (tag === 3 || tag === 4) p += 4;
    else if (tag === 5 || tag === 6) { p += 8; i++; }
    else if (tag === 7 || tag === 8 || tag === 16 || tag === 19 || tag === 20) { cp[i] = u16(b, p); p += 2; }
    else if (tag === 9 || tag === 10 || tag === 11 || tag === 12 || tag === 17 || tag === 18) { cp[i] = [u16(b, p), u16(b, p + 2)]; p += 4; }
    else if (tag === 15) p += 3; else throw new Error(`constant tag ${tag}`);
  }
  const cls = i => cp[cp[i]];
  const access = u16(b, p); const thisClass = cls(u16(b, p + 2)); const superClass = cls(u16(b, p + 4)); p += 6;
  const ic = u16(b, p); p += 2; const interfaces = []; for (let i = 0; i < ic; i++, p += 2) interfaces.push(cls(u16(b, p)));
  const readMembers = () => { const count = u16(b, p); p += 2; const result = [];
    for (let i = 0; i < count; i++) { const a = u16(b, p), name = cp[u16(b, p + 2)], desc = cp[u16(b, p + 4)]; p += 6;
      const ac = u16(b, p); p += 2; const throwsList = [];
      for (let j = 0; j < ac; j++) { const an = cp[u16(b, p)], len = u32(b, p + 2); p += 6;
        if (an === 'Exceptions') { const ec = u16(b, p); for (let k = 0; k < ec; k++) throwsList.push(cls(u16(b, p + 2 + k * 2))); }
        p += len;
      }
      result.push({ a, name, desc, throws: throwsList.sort() });
    } return result;
  };
  const fields = readMembers(); const methods = readMembers();
  return { access, thisClass, superClass, interfaces: interfaces.sort(), fields, methods };
}
function jarClasses(jar) {
  if (fs.statSync(jar).isDirectory()) {
    const result = [];
    const walk = dir => { for (const name of fs.readdirSync(dir)) { const full = `${dir}/${name}`; const stat = fs.statSync(full); if (stat.isDirectory()) walk(full); else if (name.endsWith('.class')) result.push(full.slice(jar.length + 1)); } };
    walk(jar); return result;
  }
  return cp.execFileSync('jar', ['tf', jar], {
    encoding: 'utf8',
    maxBuffer: 128 * 1024 * 1024
  }).split('\n').filter(x => x.endsWith('.class'));
}
function extract(jar, entry) { return fs.statSync(jar).isDirectory() ? fs.readFileSync(`${jar}/${entry}`) : cp.execFileSync('unzip', ['-p', jar, entry]); }
const left = new Map(), right = new Map();
for (const [jar, map] of [[leftJar, left], [rightJar, right]]) for (const entry of jarClasses(jar)) map.set(entry, parse(extract(jar, entry)));
const keys = [...new Set([...left.keys(), ...right.keys()])].sort(); const diffs = [];
for (const key of keys) if (JSON.stringify(left.get(key)) !== JSON.stringify(right.get(key))) diffs.push({ key, left: left.get(key), right: right.get(key) });
fs.writeFileSync(outFile, JSON.stringify({ leftClasses: left.size, rightClasses: right.size, structuralDiffs: diffs }, null, 2));
console.log(`left=${left.size} right=${right.size} diffs=${diffs.length}`);

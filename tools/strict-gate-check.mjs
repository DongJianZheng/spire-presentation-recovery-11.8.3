#!/usr/bin/env node

import fs from 'node:fs';
import path from 'node:path';

function usage() {
  console.error('usage: strict-gate-check.mjs <original-events.log> <recovered-events.log> [source-root]');
  process.exit(2);
}

const [originalPath, recoveredPath, sourceRoot] = process.argv.slice(2);
if (!originalPath || !recoveredPath) usage();

function parse(file) {
  const stack = [];
  const nullReturns = new Map();
  const swallowed = new Map();
  let throws = 0;
  let pendingMeta = null;
  for (const line of fs.readFileSync(file, 'utf8').split(/\r?\n/)) {
    const fields = line.split('|');
    if (fields[0] === 'ENTER') {
      stack.push(`${fields[1] ?? ''}|${fields[2] ?? ''}|${fields[3] ?? ''}`);
    } else if (fields[0] === 'RETURN_FULL') {
      // TraceAgent records the exact owner/method/descriptor on this line;
      // use it instead of inferring from a nesting stack.  This also works
      // when a method returns through an exception handler.
      const method = fields.slice(1, 4).join('|') || '<unknown>';
      if (fields[4] === 'null')
        nullReturns.set(method, (nullReturns.get(method) ?? 0) + 1);
      pendingMeta = null;
    } else if (fields[0] === 'RETURN' || fields[0] === 'RETURN_META' || fields[0] === 'THROW') {
      const method = stack.length ? stack[stack.length - 1] : '<unknown>';
      if (fields[0] === 'RETURN' && fields[1] === 'null')
        nullReturns.set(pendingMeta ?? method, (nullReturns.get(pendingMeta ?? method) ?? 0) + 1);
      if (fields[0] === 'RETURN_META') pendingMeta = fields.slice(1, 4).join('|');
      if (fields[0] === 'THROW') throws++;
      if (stack.length) stack.pop();
    } else if (fields[0] === 'EXCEPTION' || fields[0] === 'CATCH') {
      const method = stack.length ? stack[stack.length - 1] : '<unknown>';
      swallowed.set(method, (swallowed.get(method) ?? 0) + 1);
    }
  }
  return { nullReturns, swallowed, throws };
}

function sortedObject(map) {
  return Object.fromEntries([...map.entries()].sort(([a], [b]) => a.localeCompare(b)));
}

const left = parse(originalPath);
const right = parse(recoveredPath);
const nullEqual = JSON.stringify(sortedObject(left.nullReturns)) === JSON.stringify(sortedObject(right.nullReturns));
const catchEqual = JSON.stringify(sortedObject(left.swallowed)) === JSON.stringify(sortedObject(right.swallowed));
const result = {
  original: {
    nullReturns: sortedObject(left.nullReturns),
    swallowedMarkers: sortedObject(left.swallowed),
    throws: left.throws,
  },
  recovered: {
    nullReturns: sortedObject(right.nullReturns),
    swallowedMarkers: sortedObject(right.swallowed),
    throws: right.throws,
  },
  behavioralReturnParity: nullEqual,
  behavioralCatchParity: catchEqual,
  strictNoNullGate: left.nullReturns.size === 0 && right.nullReturns.size === 0,
};

if (sourceRoot) {
  const sourceFiles = [];
  function walk(dir) {
    for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
      const full = path.join(dir, entry.name);
      if (entry.isDirectory()) walk(full);
      else if (entry.name.endsWith('.java')) sourceFiles.push(full);
    }
  }
  walk(sourceRoot);
  result.sourceJavaFiles = sourceFiles.length;
  result.sourceReturnNullStatements = sourceFiles.reduce((n, file) =>
    n + (fs.readFileSync(file, 'utf8').match(/\breturn\s+null\s*;/g) ?? []).length, 0);
}

console.log(JSON.stringify(result, null, 2));
process.exit(result.behavioralReturnParity && result.behavioralCatchParity && result.strictNoNullGate ? 0 : 1);

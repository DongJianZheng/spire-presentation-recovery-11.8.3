# Strict gate recheck — 2026-09-29

Candidate:

- Reference: `input/spire.presentation-11.8.3.jar`
- Candidate: `artifacts/recovered-source-347/spire.presentation-11.8.3-recovery-source-1863-methodnames.jar`
- Reference SHA-256: `c5ba7fb5b91bd099c766c4f2fbae970432753cf8a71f30d3aa70cf3a8c71ecf5`
- Candidate SHA-256: `9aaf4f4b3e038a7d9c34190c74fff7cd78de5f9ec2a66c1690975f32539a5a32`

## Evidence status

| Layer | Status | Evidence |
|---|---|---|
| Structure | PASS for the recorded normalized gate | `reports/three-layer-acceptance-2026-09-29.md`: 25,604/25,604 classes; normalized diff 0; raw diff 344 before the documented name/flag normalization |
| JVM behavior | PASS for the executed matrix, with ordering qualification | `build/three-layer-363`, `366`, `368`, `371`, `373`, `379`, `381`: matching normalized traces, field-write multisets, exception paths, and return classifications; strict event order is not proven because the original run is nondeterministic |
| Outputs | PASS for the executed matrix | `build/final-acceptance`: 24 successful formats on both sides, two expected video failures, matching HTML/TIFF, normalized OOXML/ODP metadata, and pixel-identical first-page render for the complex fixture |
| Strict source gate | FAIL | The executed path contains behaviorally real `null` returns and an exception-swallowing branch that are also present in the reference JAR |

## State-value probe

`tests/InternalStateTrace.java` was run against both artifacts in
`build/three-layer-386`. It emitted 7,124 bounded reflection records per side
and six public state records per side. The public state records were identical:

- 2 slides, 720×540;
- slide 2: `id=257`, 2 shapes after reopen;
- test shape: `id=2`, `left=31.25`, `top=42.75`, `width=280.5`,
  `height=66.75`, `rotation=18.75`, `z=0`.

The raw private-object snapshot had 159 diff lines, all in volatile or
identity-bearing state observed during this probe: file paths, generated
object identities, serialized byte-array ordering, and timestamp/offset-like
long values. It is therefore not treated as a matrix-equivalence pass. The
existing bytecode/JVM trace remains the authority for method arguments and
field-write multisets; this probe adds a reproducible public-state/value
baseline without claiming that every private matrix value is proven.

## Strict-gate blockers

The return-value trace (`build/three-layer-379/{original,recovered}/events.log`)
records the same `null` return set on both sides:

- `ParagraphList` font lookup: 1,097 returns;
- `ParagraphList` text/XML helper: 62 returns;
- `Shape.getPlaceholder()`: 9 returns;
- `Shape.getClick()`: 6 returns;
- an internal `Presentation` accessor: 3 returns.

These are observed JVM returns, not inferred from source text. Replacing them
with defaults would violate behavioral equivalence.

The original bytecode for
`com.spire.presentation.packages.sprenr.appendTextFrame(String)` has an
exception handler at bytecode offsets 22–33 → 35 that calls
`Exception.printStackTrace()` and returns. The reconstructed source preserves
that behavior at `analysis/cfr-norename-normalized/com/spire/presentation/packages/sprenr.java:655-667`.
The null-text probe enters this branch on both JARs and produces the same
observable result.

## Conclusion

The candidate is **behaviorally equivalent over the executed matrix**, but it
is not eligible for the stronger label **fully recovered** under the strict
gate. The strict gate conflicts with preserving reference behavior for the
observed optional-null and swallowed-exception paths. Removing those paths
would be a product behavior change, not a recovery repair.

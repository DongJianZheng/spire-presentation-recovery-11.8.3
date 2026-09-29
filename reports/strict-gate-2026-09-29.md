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

The follow-up agent run in `build/three-layer-388` intercepted 15 returned
`com.spire.presentation.packages.sprqgp` (`DrMatrix`) objects per side and
recorded 120 primitive matrix-field records per side. After filtering the
agent's binary-name diagnostic, the sorted matrix records were byte-identical
(`cmp=0`). This is a successful matrix-value check for the exercised shape/save
path, not proof of every rendering path.

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

## Real-user PPTX acceptance

Input fixture: `/Users/lifengyuan/Documents/第1节 免疫系统的组成和功能 生物  周柳老师.pptx`.
The acceptance run is recorded in `build/three-layer-389`; the input file is
not copied into the repository.

- Both recovered and reference runs produced 21-slide PPTX/ODP structures.
- PPTX slide XML: all 21 slide files matched byte-for-byte; text-node count
  was 387 on each side, with 5,897 extracted characters.
- ODP `content.xml`, `styles.xml`, and `settings.xml` matched byte-for-byte;
  each had 21 pages, 408 frames, 365 paragraphs, and 5,070 extracted text
  characters.
- HTML had identical extracted text statistics (3,016 characters, 11 media
  tags, 36 occurrences of “免疫”, and 9 of “周柳”). Its only normalized
  difference was generated UUID media filenames.
- Spire-generated PDF output was byte-identical on both sides, reported as a
  10-page PDF, and the legacy PPT output was identically empty.
- Both generated PPTX files opened successfully in LibreOffice headless and
  converted to PDF without an error.

This fixture therefore passes the three output checks for the exercised
conversion paths without using the original JAR as a runtime dependency of
the recovered artifact. The reference JAR is used only by the side-by-side
acceptance harness.

The independent exception probe in `build/three-layer-392` also matched
line-for-line at the normalized `PROBE` record level: missing input throws the
same custom exception and message; `appendTextFrame(null)` follows the same
NPE stack path and returns from the outer probe; null format throws the same
NPE and message; and saving to a missing parent returns on both sides. The
stack-trace class line numbers are intentionally normalized as volatile.

## Dependency-isolation acceptance

The format matrix was rerun in `build/three-layer-391` with IntelliJ IDEA's
JDK 17. The class path contained only the recovered JAR and the test harness;
the reference JAR was absent. The candidate produced 24 successful formats
including PDF, PPTX, ODP, HTML, TIFF, SVG, OFD, XPS, and Markdown. MP4 and
WMV produced the expected `IllegalArgumentException` and are counted as the
two defined negative cases. The candidate archive contains no nested `.jar`
entries.

## Null-return source classification

The five dynamically observed null-return methods were mapped back to the
recovered source. They are not missing decompiler bodies: `Shape.getPlaceholder`
and `Shape.getClick` return optional backing fields and their callers perform
explicit null checks; the `ParagraphList` font lookup returns null when the
requested XML node is absent; its text parser returns null when no delimiter
is found; and detached paragraph objects return null from `getPresentation`
or `getSlide` when their parent is absent. The `Presentation` internal
accessor transparently returns the underlying optional object. Replacing
these values with defaults would change the caller control flow and violate
the observed reference behavior.

## Dynamic empty/default implementation scan

The executed trace contained 177 unique methods. A conservative source-to-
trace intersection found zero executed empty method bodies and zero executed
methods whose entire body is a trivial literal default (`0`, `false`, an empty
string, or equivalent). The separate exception probe still records the
reference `appendTextFrame(null)` catch-and-print path, and the recovery keeps
that path bytecode/behaviorally aligned rather than silently changing it.

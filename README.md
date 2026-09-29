# Spire Presentation 11.8.3 — recovered source

This repository contains the readable Java source recovered from the authorized
`spire.presentation-11.8.3.jar` compatibility/migration work.

## Contents

- `src/com/`: CFR decompiled and normalized Java source (`cfr-full-consistent`)
- `tools/PptxSourceConvert.java`: source-based PPTX to PDF/HTML conversion utility
- `tests/InternalStateTrace.java`: bounded public/private state comparison probe
- `tests/TraceAgent.java`: JVM method/field/matrix trace agent
- `reports/strict-gate-2026-09-29.md`: current three-layer acceptance result

The repository intentionally excludes the original JAR, recovered JARs,
build output, temporary diagnostics, acceptance logs, and user documents.

## Conversion utility

The launcher itself compiles with the JDK only. At runtime, put the recovered
implementation's extracted class directory (including its resources) on the
classpath; the original `spire.presentation-11.8.3.jar` is not required:

Do not put an old `recovered-classes` or historical `build/classes` directory
on the runtime class path. Compile the JDK-only launcher into a fresh
directory, then run only against the latest self-contained recovered JAR
(JDK 17+ is required for this build):

```sh
JDK=/opt/homebrew/Cellar/openjdk@17/17.0.20.1/libexec/openjdk.jdk/Contents/Home
RECOVERY_JAR=path/to/spire.presentation-11.8.3-recovery-source-1863-methodnames.jar
FRESH_CLASSES=$(mktemp -d)
"$JDK/bin/javac" -encoding UTF-8 -d "$FRESH_CLASSES" tools/PptxSourceConvert.java
"$JDK/bin/java" -cp "$RECOVERY_JAR:$FRESH_CLASSES" PptxSourceConvert \
  input.pptx output.pdf output.html
```

The original `spire.presentation-11.8.3.jar` is intentionally absent from
both commands. It is used only by the side-by-side acceptance harness.

> Source-only build status: the published decompiled source is not yet a
> clean full-source build. The commands above are compatibility-artifact
> verification commands, not proof that every published `.java` file compiles.
> A source-only deliverable must use a newly compiled output directory after
> the remaining decompiler errors are repaired; no historical class directory
> or recovered JAR may be substituted for that step.

The utility emits PDF and HTML through the recovered Spire Presentation API.
DOCX conversion is a separate HTML-to-DOCX step because this API's
`FileFormat` does not expose a DOCX output format.

## Recovery note

Decompiled source is a reconstruction. The current CFR source snapshot still
contains methods requiring further bytecode-guided repair before a clean
source-only build. The launcher is intentionally independent of that build and
uses the recovered class directory at runtime. Licensing, quota, watermark,
and access-control behavior was not altered by this repository.

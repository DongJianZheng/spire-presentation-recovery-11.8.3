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

```sh
javac -encoding UTF-8 -d build/classes tools/PptxSourceConvert.java
java -cp recovered-classes:build/classes PptxSourceConvert \
  input.pptx output.pdf output.html
```

The same launcher can run directly from the self-contained recovered JAR
(JDK 17+ is required for this build):

```sh
JDK=/opt/homebrew/Cellar/openjdk@17/17.0.20.1/libexec/openjdk.jdk/Contents/Home
RECOVERY_JAR=path/to/spire.presentation-11.8.3-recovery-source-1863-methodnames.jar
"$JDK/bin/javac" -encoding UTF-8 -d build/classes tools/PptxSourceConvert.java
"$JDK/bin/java" -cp "$RECOVERY_JAR:build/classes" PptxSourceConvert \
  input.pptx output.pdf output.html
```

The original `spire.presentation-11.8.3.jar` is intentionally absent from
both commands. It is used only by the side-by-side acceptance harness.

The utility emits PDF and HTML through the recovered Spire Presentation API.
DOCX conversion is a separate HTML-to-DOCX step because this API's
`FileFormat` does not expose a DOCX output format.

## Recovery note

Decompiled source is a reconstruction. The current CFR source snapshot still
contains methods requiring further bytecode-guided repair before a clean
source-only build. The launcher is intentionally independent of that build and
uses the recovered class directory at runtime. Licensing, quota, watermark,
and access-control behavior was not altered by this repository.

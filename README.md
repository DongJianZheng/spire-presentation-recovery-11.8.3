# Spire Presentation 11.8.3 — recovered source

This repository contains the readable Java source recovered from the authorized
`spire.presentation-11.8.3.jar` compatibility/migration work.

## Contents

- `src/com/`: CFR decompiled and normalized Java source (`cfr-full-consistent`)
- `tools/PptxSourceConvert.java`: source-based PPTX to PDF/HTML conversion utility

The repository intentionally excludes the original JAR, recovered JARs,
build output, temporary diagnostics, acceptance logs, and user documents.

## Conversion utility

Compile the utility against the matching Spire Presentation API/JAR, then run
it with the recovered runtime JAR on the classpath:

```sh
javac -encoding UTF-8 -cp spire.presentation-11.8.3.jar \
  -d build/classes tools/PptxSourceConvert.java
java -cp recovered-runtime.jar:build/classes PptxSourceConvert \
  input.pptx output.pdf output.html
```

The utility emits PDF and HTML through the recovered Spire Presentation API.
DOCX conversion is a separate HTML-to-DOCX step because this API's
`FileFormat` does not expose a DOCX output format.

## Recovery note

Decompiled source is a reconstruction and should be validated against the
authorized bytecode and representative conversion fixtures before production
use. Licensing, quota, watermark, and access-control behavior was not altered
by this repository.

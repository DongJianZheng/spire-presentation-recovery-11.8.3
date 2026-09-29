import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.reflect.Method;

public final class PptxSourceConvert {
    private PptxSourceConvert() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            throw new IllegalArgumentException("Usage: PptxSourceConvert <input.pptx> <output.pdf> <output.html>");
        }
        Path input = Path.of(args[0]);
        Path pdf = Path.of(args[1]);
        Path html = Path.of(args[2]);
        Files.createDirectories(pdf.toAbsolutePath().getParent());
        Files.createDirectories(html.toAbsolutePath().getParent());

        // Keep this launcher JDK-only. The recovered implementation is supplied
        // as a class directory on the runtime classpath; no original Spire JAR
        // is needed to compile this tool.
        Class<?> fileFormat = Class.forName("com.spire.presentation.FileFormat");
        Object pptx2013 = fileFormat.getField("PPTX_2013").get(null);
        Object pdfFormat = fileFormat.getField("PDF").get(null);
        Object htmlFormat = fileFormat.getField("HTML").get(null);
        Class<?> presentationType = Class.forName("com.spire.presentation.Presentation");
        Object presentation = presentationType
                .getConstructor(String.class, fileFormat)
                .newInstance(input.toString(), pptx2013);
        try {
            Method saveToFile = presentationType.getMethod("saveToFile", String.class, fileFormat);
            saveToFile.invoke(presentation, pdf.toString(), pdfFormat);
            saveToFile.invoke(presentation, html.toString(), htmlFormat);
        } finally {
            presentationType.getMethod("dispose").invoke(presentation);
        }
        System.out.println("PDF=" + pdf + " bytes=" + Files.size(pdf));
        System.out.println("HTML=" + html + " bytes=" + Files.size(html));
    }
}

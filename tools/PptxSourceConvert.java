import com.spire.presentation.FileFormat;
import com.spire.presentation.Presentation;

import java.nio.file.Files;
import java.nio.file.Path;

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

        Presentation presentation = new Presentation(input.toString(), FileFormat.PPTX_2013);
        try {
            presentation.saveToFile(pdf.toString(), FileFormat.PDF);
            presentation.saveToFile(html.toString(), FileFormat.HTML);
        } finally {
            presentation.dispose();
        }
        System.out.println("PDF=" + pdf + " bytes=" + Files.size(pdf));
        System.out.println("HTML=" + html + " bytes=" + Files.size(html));
    }
}

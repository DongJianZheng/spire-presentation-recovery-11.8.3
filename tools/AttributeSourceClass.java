import com.sun.source.util.*;
import com.sun.tools.javac.api.JavacTaskImpl;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;
import javax.lang.model.element.*;
import javax.tools.*;

/** Diagnostic attribution of one class. Never establishes SCC/build acceptance. */
public final class AttributeSourceClass {
    public static void main(String[] args) throws Exception {
        Path source = Path.of(args[0]).toAbsolutePath();
        String owner = args[1];
        Path out = Path.of(args[2]).toAbsolutePath();
        Files.createDirectory(out);
        Path empty = Files.createDirectory(out.resolve("empty-classpath"));
        Set<Path> parsed = new TreeSet<>();
        Set<String> analyzed = new TreeSet<>();
        int[] errors = {0};
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticListener<JavaFileObject> diagnostics = d -> {
            if (d.getKind() == Diagnostic.Kind.ERROR) errors[0]++;
            System.out.println(d.getKind()+"|"+(d.getSource()==null?"<unknown>":d.getSource().toUri())
                +"|"+d.getLineNumber()+"|"+d.getColumnNumber()+"|"+d.getCode()+"|"
                +d.getMessage(Locale.ROOT).replace('\n',' '));
        };
        try (StandardJavaFileManager manager = compiler.getStandardFileManager(diagnostics, Locale.ROOT, StandardCharsets.UTF_8)) {
            List<String> options = List.of("-encoding", "UTF-8", "-g", "-proc:none", "-implicit:none",
                "-Xmaxerrs", "20000", "-classpath", empty.toString(),
                "-sourcepath", source+java.io.File.pathSeparator
                    +(args.length>3 ? Path.of(args[3]).toAbsolutePath()+java.io.File.pathSeparator : "")
                    +Path.of("tools/build-support").toAbsolutePath(),
                "--add-exports", "java.base/sun.security.x509=ALL-UNNAMED",
                "--add-exports", "java.desktop/com.sun.imageio.plugins.png=ALL-UNNAMED");
            Files.write(out.resolve("compiler-options.txt"), options, StandardCharsets.UTF_8);
            JavacTaskImpl task = (JavacTaskImpl) compiler.getTask(null, manager, diagnostics, options,
                null, manager.getJavaFileObjects(source.resolve(owner.replace('.','/')+".java").toFile()));
            task.addTaskListener(new TaskListener() {
                public void finished(TaskEvent e) {
                    if (e.getKind()==TaskEvent.Kind.PARSE && e.getSourceFile()!=null
                            && e.getSourceFile().toUri().getScheme().equals("file"))
                        parsed.add(Path.of(e.getSourceFile().toUri()));
                    if (e.getKind()==TaskEvent.Kind.ANALYZE && e.getTypeElement()!=null)
                        analyzed.add(e.getTypeElement().getQualifiedName().toString());
                }
            });
            task.parse();
            List<Element> targets = new ArrayList<>();
            for (Element element : task.enter())
                if (element instanceof TypeElement type && type.getQualifiedName().contentEquals(owner)) targets.add(element);
            if (targets.size()!=1) throw new IllegalStateException("expected one target, found "+targets.size());
            task.analyze(targets);
        } finally {
            List<String> manifest = new ArrayList<>();
            for (Path path : parsed) {
                String hash = HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(path)));
                manifest.add(hash+"\t"+path);
            }
            Files.write(out.resolve("parsed-source-hashes.tsv"), manifest, StandardCharsets.UTF_8);
            Files.write(out.resolve("analyzed-classes.txt"), analyzed, StandardCharsets.UTF_8);
            Files.writeString(out.resolve("summary.txt"), "scope=diagnostic attribution only; SCC acceptance UNKNOWN\n"
                +"parsedSources="+parsed.size()+"\nerrors="+errors[0]+"\ntargetAnalyzed="+analyzed.contains(owner)+"\n");
        }
        if (!analyzed.contains(owner) || errors[0]!=0) System.exit(1);
    }
}

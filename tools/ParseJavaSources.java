import com.sun.source.util.JavacTask;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import javax.tools.*;

/** Bounded-memory syntax inventory. Does not claim compilation/type checking. */
public final class ParseJavaSources {
    public static void main(String[] args) throws Exception {
        List<Path> paths;
        try (var walk = Files.walk(Path.of(args[0]))) {
            paths = walk.filter(p -> p.toString().endsWith(".java")).sorted().toList();
        }
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int[] errors = {0};
        Set<String> affected = new TreeSet<>();
        DiagnosticListener<JavaFileObject> listener = d -> {
            if (d.getKind() != Diagnostic.Kind.ERROR) return;
            errors[0]++;
            String path = d.getSource() == null ? "<unknown>" : d.getSource().toUri().getPath();
            affected.add(path);
            System.out.println(path + ":" + d.getLineNumber() + ":" + d.getColumnNumber()
                + ": " + d.getCode() + ": " + d.getMessage(Locale.ROOT).replace('\n', ' '));
        };
        int batchSize = 256;
        for (int start = 0; start < paths.size(); start += batchSize) {
            int end = Math.min(start + batchSize, paths.size());
            try (StandardJavaFileManager manager = compiler.getStandardFileManager(listener, Locale.ROOT, StandardCharsets.UTF_8)) {
                JavacTask task = (JavacTask)compiler.getTask(null, manager, listener,
                    List.of("-proc:none", "-encoding", "UTF-8", "-Xmaxerrs", "20000"),
                    null, manager.getJavaFileObjectsFromPaths(paths.subList(start, end)));
                for (var ignored : task.parse()) { }
            }
            System.err.println("PARSED " + end + "/" + paths.size() + " errors=" + errors[0]);
        }
        System.err.println("SYNTAX_ONLY files=" + paths.size() + " errors=" + errors[0] + " affectedFiles=" + affected.size());
        if (errors[0] != 0) System.exit(1);
    }
}

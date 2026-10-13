import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/** Append-only compiler phase evidence; a started phase does not prove causality. */
public final class CompilerProgressPlugin implements Plugin {
    public String getName() { return "RecoveryProgress"; }
    public void init(JavacTask task, String... args) {
        if (args.length != 1) throw new IllegalArgumentException("expected fresh event output path");
        Path output = Path.of(args[0]).toAbsolutePath();
        try { Files.createFile(output); }
        catch (IOException ex) { throw new IllegalStateException("refusing existing/unwritable log", ex); }
        task.addTaskListener(new TaskListener() {
            private long sequence;
            private synchronized void record(String edge, TaskEvent event) {
                if (event.getKind() != TaskEvent.Kind.ANALYZE
                        && event.getKind() != TaskEvent.Kind.GENERATE
                        && event.getKind() != TaskEvent.Kind.COMPILATION) return;
                String owner = event.getTypeElement() == null ? "" : event.getTypeElement().getQualifiedName().toString();
                String source = event.getSourceFile() == null ? "" : event.getSourceFile().toUri().toString();
                String row = (++sequence)+"\t"+System.nanoTime()+"\t"+edge+"\t"+event.getKind()+"\t"+owner+"\t"+source+"\n";
                try { Files.writeString(output, row, StandardCharsets.UTF_8, StandardOpenOption.APPEND); }
                catch (IOException ex) { throw new IllegalStateException("cannot preserve compiler evidence", ex); }
            }
            public void started(TaskEvent event) { record("START", event); }
            public void finished(TaskEvent event) { record("END", event); }
        });
    }
}

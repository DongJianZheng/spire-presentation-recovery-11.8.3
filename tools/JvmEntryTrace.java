import com.sun.jdi.*;
import com.sun.jdi.connect.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/** JDK JDI observer: no Java agent or instrumentation JAR on the target path.
 * Args: trace.tsv classpath comma-separated-owners mainClass [main arguments...]
 */
public final class JvmEntryTrace {
    private final Map<Long, Integer> objects = new HashMap<>();
    private long sequence;
    private String value(Value value) {
        if (value == null) return "null";
        if (value instanceof VoidValue) return "void";
        if (value instanceof StringReference string) {
            String text = string.value();
            byte[] units = new byte[text.length() * 2];
            for (int i = 0; i < text.length(); i++) {
                units[2 * i] = (byte)(text.charAt(i) >>> 8);
                units[2 * i + 1] = (byte)text.charAt(i);
            }
            return "String:utf16:" + Base64.getEncoder().encodeToString(units) + ":id=" + identity(string);
        }
        if (value instanceof ObjectReference object) return object.referenceType().name() + ":id=" + identity(object);
        if (value instanceof DoubleValue number) return "double:" + Long.toHexString(Double.doubleToRawLongBits(number.value()));
        if (value instanceof FloatValue number) return "float:" + Integer.toHexString(Float.floatToRawIntBits(number.value()));
        return value.type().name() + ":" + value;
    }
    private int identity(ObjectReference object) {
        return objects.computeIfAbsent(object.uniqueID(), ignored -> objects.size() + 1);
    }
    private static String quote(String text) { return "\"" + text.replace("\\", "\\\\").replace("\"", "\\\"") + "\""; }
    private String arguments(ThreadReference thread) throws IncompatibleThreadStateException {
        StringBuilder data = new StringBuilder();
        try {
            for (Value arg : thread.frame(0).getArgumentValues()) data.append(value(arg)).append(';');
        } catch (InternalException unavailable) {
            data.append("ARGS_UNKNOWN:").append(unavailable.getClass().getSimpleName())
                .append(':').append(unavailable.getMessage());
        }
        return data.toString();
    }
    private static Thread drain(InputStream input, Path output) throws IOException {
        OutputStream file = Files.newOutputStream(output, StandardOpenOption.CREATE_NEW);
        Thread thread = new Thread(() -> {
            try (input; file) { input.transferTo(file); }
            catch (IOException error) { throw new UncheckedIOException(error); }
        });
        thread.start();
        return thread;
    }
    private void run(String[] args) throws Exception {
        if (args.length < 4) throw new IllegalArgumentException("trace.tsv classpath owners mainClass [arguments]");
        Path output = Path.of(args[0]);
        if (Files.exists(output)) throw new IllegalArgumentException("Refusing to overwrite " + output);
        Files.createDirectories(output.toAbsolutePath().getParent());
        LaunchingConnector launcher = Bootstrap.virtualMachineManager().defaultConnector();
        Map<String, Connector.Argument> options = launcher.defaultArguments();
        StringBuilder main = new StringBuilder(quote(args[3]));
        for (int i = 4; i < args.length; i++) main.append(' ').append(quote(args[i]));
        options.get("main").setValue(main.toString());
        options.get("options").setValue("-Djava.awt.headless=true -Dfile.encoding=UTF-8 -Xverify:all -cp " + quote(args[1]));
        options.get("suspend").setValue("true");
        VirtualMachine vm = launcher.launch(options);
        Process process = vm.process();
        Thread stdout = drain(process.getInputStream(), Path.of(args[0] + ".stdout"));
        Thread stderr = drain(process.getErrorStream(), Path.of(args[0] + ".stderr"));
        try (PrintWriter log = new PrintWriter(Files.newBufferedWriter(output, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW))) {
            log.println("META\tpid=" + process.pid() + "\tjdk=" + vm.version() + "\tclasspath=" + args[1]);
            EventRequestManager requests = vm.eventRequestManager();
            boolean breakpoints = Boolean.getBoolean("spire.jdi.breakpoints");
            Set<String> selected = Set.of(System.getProperty("spire.jdi.methods", "<init>,<clinit>,saveToFile,loadFromFile,dispose").split(","));
            for (String owner : args[2].split(",")) {
                if (breakpoints) {
                    ClassPrepareRequest prepare = requests.createClassPrepareRequest();
                    prepare.addClassFilter(owner); prepare.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD); prepare.enable();
                } else {
                    MethodEntryRequest entry = requests.createMethodEntryRequest();
                    entry.addClassFilter(owner); entry.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD); entry.enable();
                }
                if (!breakpoints && vm.canGetMethodReturnValues()) {
                    MethodExitRequest exit = requests.createMethodExitRequest();
                    exit.addClassFilter(owner); exit.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD); exit.enable();
                }
                ExceptionRequest exception = requests.createExceptionRequest(null, true, true);
                exception.addClassFilter(owner); exception.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD); exception.enable();
            }
            log.println("META\treturnValues=" + (!breakpoints && vm.canGetMethodReturnValues()) + "\towners=" + args[2]
                + "\tmode=" + (breakpoints ? "entry-breakpoints" : "method-events"));
            log.flush();
            vm.resume();
            boolean done = false;
            while (!done) {
                EventSet events;
                try { events = vm.eventQueue().remove(1000); }
                catch (VMDisconnectedException disconnected) { break; }
                if (events == null) continue;
                for (Event event : events) {
                    if (event instanceof ClassPrepareEvent prepare) {
                        for (Method method : prepare.referenceType().methods()) {
                            if (!selected.contains(method.name()) || method.isAbstract() || method.isNative()) continue;
                            Location entry = method.locationOfCodeIndex(0);
                            if (entry == null) continue;
                            BreakpointRequest breakpoint = requests.createBreakpointRequest(entry);
                            breakpoint.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD);
                            breakpoint.enable();
                        }
                    } else if (event instanceof BreakpointEvent entry) {
                        Method method = entry.location().method();
                        log.println(++sequence + "\t" + entry.thread().uniqueID() + "\tENTRY_BREAKPOINT\t"
                            + method.declaringType().name() + "\t" + method.name() + "\t" + method.signature() + "\t" + arguments(entry.thread()));
                    } else if (event instanceof MethodEntryEvent entry) {
                        Method method = entry.method();
                        log.println(++sequence + "\t" + entry.thread().uniqueID() + "\tENTER\t"
                            + method.declaringType().name() + "\t" + method.name() + "\t" + method.signature() + "\t" + arguments(entry.thread()));
                    } else if (event instanceof MethodExitEvent exit) {
                        Method method = exit.method();
                        log.println(++sequence + "\t" + exit.thread().uniqueID() + "\tEXIT\t"
                            + method.declaringType().name() + "\t" + method.name() + "\t" + method.signature() + "\t" + value(exit.returnValue()));
                    } else if (event instanceof ExceptionEvent exception) {
                        Location location = exception.location();
                        log.println(++sequence + "\t" + exception.thread().uniqueID() + "\tTHROW\t"
                            + location.declaringType().name() + "\t" + location.method().name() + "\t"
                            + location.method().signature() + "\t" + value(exception.exception())
                            + "\tcaught=" + (exception.catchLocation() != null));
                    } else if (event instanceof VMDeathEvent || event instanceof VMDisconnectEvent) {
                        done = true;
                    }
                }
                log.flush();
                try { events.resume(); } catch (VMDisconnectedException ignored) { done = true; }
            }
            int exit = process.waitFor();
            stdout.join(); stderr.join();
            log.println("TERMINAL\texit=" + exit + "\tevents=" + sequence);
            if (exit != 0) throw new IllegalStateException("Debuggee exit " + exit);
        } finally {
            try { vm.dispose(); } catch (VMDisconnectedException ignored) { }
            if (process.isAlive()) process.destroy();
        }
    }
    public static void main(String[] args) throws Exception { new JvmEntryTrace().run(args); }
}

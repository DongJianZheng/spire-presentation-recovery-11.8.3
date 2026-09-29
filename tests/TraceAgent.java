import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;

public final class TraceAgent {
    private static PrintWriter output;
    private static final ThreadLocal<String> pendingReturn = new ThreadLocal<>();

    public static void premain(String args, Instrumentation instrumentation) throws Exception {
        output = new PrintWriter(new FileWriter(args == null ? "build/jvm-trace.log" : args, false), false);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> { synchronized (TraceAgent.class) { output.flush(); output.close(); } }));
        instrumentation.addTransformer(new Transformer(), false);
    }

    public static synchronized void enter(String owner, String name, String descriptor) {
        output.println("ENTER|" + owner + "|" + name + "|" + descriptor);
    }

    public static synchronized void write(String owner, String name, String descriptor, int opcode) {
        output.println("WRITE|" + owner + "|" + name + "|" + descriptor + "|" + opcode);
    }

    public static synchronized void args(String owner, String name, String descriptor, Object[] values) {
        StringBuilder line = new StringBuilder("ARGS|").append(owner).append('|').append(name).append('|').append(descriptor).append('|');
        for (int i = 0; i < values.length; i++) {
            if (i > 0) line.append(',');
            Object value = values[i];
            if (value == null || value instanceof Number || value instanceof Boolean
                    || value instanceof Character || value instanceof String) line.append(String.valueOf(value));
            else line.append(value.getClass().getName());
        }
        output.println(line);
    }

    public static synchronized void line(String owner, String method, int line) {
        output.println("LINE|" + owner + "|" + method + "|" + line);
    }

    public static synchronized void returned(Object value) {
        output.println("RETURN_FULL|" + pendingReturn.get() + "|"
                + (value == null ? "null" : value.getClass().getName()));
        if (value != null && value.getClass().getName()
                .equals("com.spire.presentation.packages.sprqgp")) {
            matrixFields(value);
        }
        pendingReturn.remove();
    }

    private static void matrixFields(Object value) {
        Class<?> type = value.getClass();
        List<Field> fields = new ArrayList<>();
        for (Class<?> c = type; c != null && c != Object.class; c = c.getSuperclass()) {
            for (Field field : c.getDeclaredFields()) fields.add(field);
        }
        fields.sort(Comparator.comparing((Field f) -> f.getDeclaringClass().getName())
                .thenComparing(Field::getName));
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) || !field.getType().isPrimitive()) continue;
            try {
                if (field.trySetAccessible()) {
                    output.println("MATRIX_RETURN|" + type.getName() + "|"
                            + field.getName() + "|" + field.getType().getName()
                            + "|" + String.valueOf(field.get(value)));
                }
            } catch (Throwable ignored) {
                output.println("MATRIX_RETURN|" + type.getName() + "|"
                        + field.getName() + "|unreadable");
            }
        }
    }

    public static synchronized void returnedVoid() {
        output.println("RETURN_FULL|" + pendingReturn.get() + "|void");
        pendingReturn.remove();
    }

    public static synchronized void returnMeta(String owner, String method, String descriptor) {
        String value = owner + "|" + method + "|" + descriptor;
        pendingReturn.set(value);
        output.println("RETURN_META|" + value);
    }

    private static final class Transformer implements ClassFileTransformer {
        @Override
        public byte[] transform(Module module, ClassLoader loader, String className,
                Class<?> classBeingRedefined, ProtectionDomain domain, byte[] bytes) {
            if (!isTracked(className)) return null;
            ClassReader reader = new ClassReader(bytes);
            ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
            reader.accept(new ClassVisitor(Opcodes.ASM7, writer) {
                @Override
                public MethodVisitor visitMethod(int access, String name, String descriptor,
                        String signature, String[] exceptions) {
                    MethodVisitor next = super.visitMethod(access, name, descriptor, signature, exceptions);
                    if ((access & (Opcodes.ACC_ABSTRACT | Opcodes.ACC_NATIVE)) != 0) return next;
                    return new MethodVisitor(Opcodes.ASM7, next) {
                        @Override
                        public void visitCode() {
                            super.visitCode();
                            visitLdcInsn(className);
                            visitLdcInsn(name);
                            visitLdcInsn(descriptor);
                            visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "enter",
                                    "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
                            Type[] parameters = Type.getArgumentTypes(descriptor);
                            visitLdcInsn(className);
                            visitLdcInsn(name);
                            visitLdcInsn(descriptor);
                            pushInt(parameters.length);
                            visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
                            int local = (access & Opcodes.ACC_STATIC) == 0 ? 1 : 0;
                            for (int i = 0; i < parameters.length; i++) {
                                Type parameter = parameters[i];
                                visitInsn(Opcodes.DUP);
                                pushInt(i);
                                int loadOpcode = parameter.getSort() == Type.LONG ? Opcodes.LLOAD
                                        : parameter.getSort() == Type.FLOAT ? Opcodes.FLOAD
                                        : parameter.getSort() == Type.DOUBLE ? Opcodes.DLOAD
                                        : parameter.getSort() >= Type.ARRAY ? Opcodes.ALOAD : Opcodes.ILOAD;
                                visitVarInsn(loadOpcode, local);
                                box(parameter);
                                visitInsn(Opcodes.AASTORE);
                                local += parameter.getSize();
                            }
                            visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "args",
                                    "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", false);
                        }

                        private void box(Type type) {
                            switch (type.getSort()) {
                                case Type.BOOLEAN -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                                case Type.BYTE -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                                case Type.CHAR -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                                case Type.SHORT -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                                case Type.INT -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                                case Type.FLOAT -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                                case Type.LONG -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                                case Type.DOUBLE -> visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                            }
                        }

                        private void pushInt(int value) {
                            if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) visitIntInsn(Opcodes.BIPUSH, value);
                            else visitIntInsn(Opcodes.SIPUSH, value);
                        }

                        @Override
                        public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                            if ((opcode == Opcodes.PUTFIELD || opcode == Opcodes.PUTSTATIC)
                                    && owner.startsWith("com/spire/presentation/")) {
                                visitLdcInsn(owner);
                                visitLdcInsn(name);
                                visitLdcInsn(descriptor);
                                visitIntInsn(Opcodes.SIPUSH, opcode);
                                visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "write",
                                        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
                            }
                            super.visitFieldInsn(opcode, owner, name, descriptor);
                        }

                        @Override
                        public void visitLineNumber(int line, jdk.internal.org.objectweb.asm.Label start) {
                            visitLdcInsn(className);
                            visitLdcInsn(name);
                            visitIntInsn(Opcodes.SIPUSH, line);
                            visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "line",
                                    "(Ljava/lang/String;Ljava/lang/String;I)V", false);
                            super.visitLineNumber(line, start);
                        }

                        @Override
                        public void visitInsn(int opcode) {
                            if (opcode == Opcodes.ARETURN || opcode == Opcodes.IRETURN
                                    || opcode == Opcodes.FRETURN || opcode == Opcodes.LRETURN
                                    || opcode == Opcodes.DRETURN || opcode == Opcodes.RETURN) {
                                visitLdcInsn(className);
                                visitLdcInsn(name);
                                visitLdcInsn(descriptor);
                                visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returnMeta",
                                        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
                            }
                            switch (opcode) {
                                case Opcodes.ARETURN:
                                    visitInsn(Opcodes.DUP);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returned",
                                            "(Ljava/lang/Object;)V", false);
                                    break;
                                case Opcodes.IRETURN:
                                    visitInsn(Opcodes.DUP);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf",
                                            "(I)Ljava/lang/Integer;", false);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returned",
                                            "(Ljava/lang/Object;)V", false);
                                    break;
                                case Opcodes.FRETURN:
                                    visitInsn(Opcodes.DUP);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf",
                                            "(F)Ljava/lang/Float;", false);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returned",
                                            "(Ljava/lang/Object;)V", false);
                                    break;
                                case Opcodes.LRETURN:
                                    visitInsn(Opcodes.DUP2);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf",
                                            "(J)Ljava/lang/Long;", false);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returned",
                                            "(Ljava/lang/Object;)V", false);
                                    break;
                                case Opcodes.DRETURN:
                                    visitInsn(Opcodes.DUP2);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf",
                                            "(D)Ljava/lang/Double;", false);
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returned",
                                            "(Ljava/lang/Object;)V", false);
                                    break;
                                case Opcodes.RETURN:
                                    visitMethodInsn(Opcodes.INVOKESTATIC, "TraceAgent", "returnedVoid", "()V", false);
                                    break;
                                default:
                                    break;
                            }
                            super.visitInsn(opcode);
                        }
                    };
                }
            }, 0);
            return writer.toByteArray();
        }

        private static boolean isTracked(String className) {
            if (className == null || !className.startsWith("com/spire/presentation/")) return false;
            return className.equals("com/spire/presentation/Presentation")
                    || className.equals("com/spire/presentation/SlideList")
                    || className.equals("com/spire/presentation/Shape")
                    || className.equals("com/spire/presentation/packages/sprenr")
                    || className.startsWith("com/spire/presentation/collections/")
                    || className.startsWith("com/spire/presentation/converter/");
        }
    }
}

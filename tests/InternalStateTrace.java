import com.spire.presentation.FileFormat;
import com.spire.presentation.IAutoShape;
import com.spire.presentation.ISlide;
import com.spire.presentation.Presentation;
import com.spire.presentation.Shape;
import com.spire.presentation.ShapeType;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;

/** Read-only bounded state snapshot for original/recovered JVM comparison. */
public final class InternalStateTrace {
    private static final int MAX_DEPTH = 3;
    private static final int MAX_ARRAY = 32;

    public static void main(String[] args) throws Exception {
        Path output = Path.of(args.length == 0 ? "build/internal-state" : args[0]);
        Presentation presentation = new Presentation();
        try {
            var slide = presentation.getSlides().append();
            IAutoShape shape = slide.getShapes().appendShape(
                    ShapeType.ROUND_CORNER_RECTANGLE,
                    new Rectangle2D.Double(31.25, 42.75, 280.5, 66.75));
            shape.setRotation(18.75f);
            shape.setName("state-probe");
            shape.appendTextFrame("矩阵状态 callback probe");
            snapshot("before-save", presentation, slide, shape);
            presentation.saveToFile(output.toString(), FileFormat.PPTX_2013);
            Presentation reopened = new Presentation(output.toString(), FileFormat.PPTX_2013);
            try {
                var reopenedSlide = reopened.getSlides().get(1);
                var reopenedShape = reopenedSlide.getShapes().get(0);
                snapshot("after-reopen", reopened, reopenedSlide, reopenedShape);
            } finally {
                reopened.dispose();
            }
        } finally {
            presentation.dispose();
        }
    }

    private static void snapshot(String phase, Object... roots) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < roots.length; i++) {
            publicState(phase + "/root" + i, roots[i], lines);
            walk(phase + "/root" + i, roots[i], 0,
                    new IdentityHashMap<>(), lines);
        }
        lines.sort(Comparator.naturalOrder());
        for (String line : lines) System.out.println(line);
    }

    private static void publicState(String path, Object value, List<String> lines) {
        if (value instanceof Presentation presentation) {
            var size = presentation.getSlideSize().getSize();
            lines.add("PUBLIC|" + path + "|slides=" + presentation.getSlides().size()
                    + "|width=" + size.getWidth() + "|height=" + size.getHeight());
        } else if (value instanceof ISlide slide) {
            lines.add("PUBLIC|" + path + "|name=" + slide.getName()
                    + "|hidden=" + slide.getHidden() + "|number=" + slide.getSlideNumber()
                    + "|id=" + slide.getSlideID() + "|shapes=" + slide.getShapes().size());
        } else if (value instanceof Shape shape) {
            lines.add("PUBLIC|" + path + "|id=" + shape.getId()
                    + "|name=" + shape.getName() + "|left=" + shape.getLeft()
                    + "|top=" + shape.getTop() + "|width=" + shape.getWidth()
                    + "|height=" + shape.getHeight() + "|rotation=" + shape.getRotation()
                    + "|hidden=" + shape.isHidden() + "|z=" + shape.getZOrderPosition());
        }
    }

    private static void walk(String path, Object value, int depth,
                             IdentityHashMap<Object, Boolean> seen,
                             List<String> lines) {
        if (value == null || depth > MAX_DEPTH || seen.put(value, Boolean.TRUE) != null) return;
        Class<?> type = value.getClass();
        if (isScalar(value)) {
            lines.add("STATE|" + path + "|" + type.getName() + "|" + scalar(value));
            return;
        }
        if (!isInspectable(type)) return;
        lines.add("OBJECT|" + path + "|" + type.getName());
        for (Field field : allFields(type)) {
            if (Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) continue;
            if (!field.trySetAccessible()) continue;
            Object child;
            try {
                child = field.get(value);
            } catch (Throwable ignored) {
                lines.add("FIELD|" + path + "|" + field.getName() + "|<unreadable>");
                continue;
            }
            String childPath = path + "/" + field.getDeclaringClass().getName()
                    + "." + field.getName();
            if (child == null) {
                lines.add("FIELD|" + childPath + "|null");
            } else if (child.getClass().isArray()) {
                lines.add("FIELD|" + childPath + "|" + arrayValue(child));
            } else if (isScalar(child)) {
                lines.add("FIELD|" + childPath + "|" + child.getClass().getName()
                        + "|" + scalar(child));
            } else if (child instanceof AffineTransform) {
                lines.add("MATRIX|" + childPath + "|"
                        + matrix((AffineTransform) child));
            } else if (isInspectable(child.getClass())) {
                walk(childPath, child, depth + 1, seen, lines);
            }
        }
    }

    private static List<Field> allFields(Class<?> type) {
        List<Field> fields = new ArrayList<>();
        for (Class<?> c = type; c != null && c != Object.class; c = c.getSuperclass()) {
            for (Field field : c.getDeclaredFields()) fields.add(field);
        }
        fields.sort(Comparator.comparing((Field f) -> f.getDeclaringClass().getName())
                .thenComparing(Field::getName));
        return fields;
    }

    private static boolean isInspectable(Class<?> type) {
        Package p = type.getPackage();
        return p != null && (p.getName().startsWith("com.spire.presentation")
                || type == AffineTransform.class || type == Rectangle2D.Double.class);
    }

    private static boolean isScalar(Object value) {
        return value instanceof String || value instanceof Number || value instanceof Boolean
                || value instanceof Character || value instanceof Enum<?>;
    }

    private static String scalar(Object value) {
        return String.valueOf(value).replace("\n", "\\n").replace("\r", "\\r");
    }

    private static String matrix(AffineTransform transform) {
        double[] m = new double[6];
        transform.getMatrix(m);
        return java.util.Arrays.toString(m);
    }

    private static String arrayValue(Object array) {
        int length = Array.getLength(array);
        StringBuilder result = new StringBuilder("length=").append(length).append("[");
        for (int i = 0; i < Math.min(length, MAX_ARRAY); i++) {
            if (i > 0) result.append(',');
            Object item = Array.get(array, i);
            if (item == null) result.append("null");
            else if (isScalar(item)) result.append(scalar(item));
            else result.append(item.getClass().getName());
        }
        if (length > MAX_ARRAY) result.append(",...");
        return result.append(']').toString();
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprwho {
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 8;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 4;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprriia.cfr_renamed_9("B\u0015b\u001f");
            }
            case 1: {
                return sprppy.cfr_renamed_9("U8q1U6l7q\r|)`\u001dd*m\u0014j=`");
            }
            case 2: {
                return sprriia.cfr_renamed_9("*m\u000ed*c\u0013b\u000eX\u0003|\u001f\\\u001bx\u0012A\u001b~\u0011i\b");
            }
            case 8: {
                return sprppy.cfr_renamed_9("U8q1U6l7q\r|)`\u001ai6v<V,g)d-m");
            }
        }
        return sprriia.cfr_renamed_9("Y\u0014g\u0014c\rbZI\u0017j*`\u000f\u007f*m\u000ed*c\u0013b\u000eX\u0003|\u001fJ\u0016m\u001d\u007fZz\u001b`\u000fiT");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sprppy.cfr_renamed_9("\u0017j7`"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add(sprriia.cfr_renamed_9("*m\u000ed*c\u0013b\u000eX\u0003|\u001fH\u001b\u007f\u0012A\u0015h\u001f"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprppy.cfr_renamed_9("U8q1U6l7q\r|)`\td-m\u0014d+n<w"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprriia.cfr_renamed_9("*m\u000ed*c\u0013b\u000eX\u0003|\u001fO\u0016c\ti)y\u0018|\u001bx\u0012"));
        }
        return hashSet;
    }

    private /* synthetic */ sprwho() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprppy.cfr_renamed_9("\u0017j7`").equals(arg0)) {
            return 0;
        }
        if (sprriia.cfr_renamed_9("*m\u000ed*c\u0013b\u000eX\u0003|\u001fH\u001b\u007f\u0012A\u0015h\u001f").equals(arg0)) {
            return 1;
        }
        if (sprppy.cfr_renamed_9("U8q1U6l7q\r|)`\td-m\u0014d+n<w").equals(arg0)) {
            return 2;
        }
        if (sprriia.cfr_renamed_9("*m\u000ed*c\u0013b\u000eX\u0003|\u001fO\u0016c\ti)y\u0018|\u001bx\u0012").equals(arg0)) {
            return 8;
        }
        throw new IllegalArgumentException(sprppy.cfr_renamed_9("P7n7j.ky@4c\ti,v\td-m\tj0k-Q u<C5d>vyk8h<+"));
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprwho.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprriia.cfr_renamed_9("B\u0015b\u001f");
            }
            case 1: {
                return sprppy.cfr_renamed_9("U8q1U6l7q\r|)`\u001dd*m\u0014j=`");
            }
            case 2: {
                return sprriia.cfr_renamed_9("*m\u000ed*c\u0013b\u000eX\u0003|\u001f\\\u001bx\u0012A\u001b~\u0011i\b");
            }
            case 8: {
                return sprppy.cfr_renamed_9("U8q1U6l7q\r|)`\u001ai6v<V,g)d-m");
            }
        }
        return sprriia.cfr_renamed_9("Y\u0014g\u0014c\rbZI\u0017j*`\u000f\u007f*m\u000ed*c\u0013b\u000eX\u0003|\u001fJ\u0016m\u001d\u007fZz\u001b`\u000fiT");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 8;
        return nArray;
    }
}


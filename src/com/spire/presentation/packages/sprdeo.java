/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmfa;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtza;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprdeo {
    public static final int cfr_renamed_112 = 16;
    public static final int cfr_renamed_119 = 7;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 128;
    public static final int cfr_renamed_1 = 1024;
    public static final int cfr_renamed_2 = 2048;
    public static final int cfr_renamed_3 = 8192;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 2: {
                return sprtza.cfr_renamed_9("_&q'e3");
            }
            case 4: {
                return sprcmfa.cfr_renamed_9("6j\u001cv\u0005c\u0011");
            }
            case 16: {
                return sprtza.cfr_renamed_9("W:i&x\u001f~2u.");
            }
            case 128: {
                return sprcmfa.cfr_renamed_9("T\u0001j'c\u0014b\u001ch\u0012");
            }
            case 1024: {
                return sprtza.cfr_renamed_9("\u0018e;u$y5c\u001a\u007f5q:");
            }
            case 2048: {
                return sprcmfa.cfr_renamed_9(";s\u0018c\u0007o\u0016u9g\u0001o\u001b");
            }
            case 8192: {
                return sprtza.cfr_renamed_9("\u0006t/");
            }
        }
        return sprcmfa.cfr_renamed_9(" h\u001eh\u001aq\u001b&\"k\u0013C\rr!c\rr:s\u0001I\u0005r\u001ci\u001buUp\u0014j\u0000c[");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 2: {
                return sprtza.cfr_renamed_9("_&q'e3");
            }
            case 4: {
                return sprcmfa.cfr_renamed_9("6j\u001cv\u0005c\u0011");
            }
            case 16: {
                return sprtza.cfr_renamed_9("W:i&x\u001f~2u.");
            }
            case 128: {
                return sprcmfa.cfr_renamed_9("T\u0001j'c\u0014b\u001ch\u0012");
            }
            case 1024: {
                return sprtza.cfr_renamed_9("\u0018e;u$y5c\u001a\u007f5q:");
            }
            case 2048: {
                return sprcmfa.cfr_renamed_9(";s\u0018c\u0007o\u0016u9g\u0001o\u001b");
            }
            case 8192: {
                return sprtza.cfr_renamed_9("\u0006t/");
            }
        }
        return sprcmfa.cfr_renamed_9(" h\u001eh\u001aq\u001b&\"k\u0013C\rr!c\rr:s\u0001I\u0005r\u001ci\u001buUp\u0014j\u0000c[");
    }

    private /* synthetic */ sprdeo() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[7];
        nArray[0] = 2;
        nArray[1] = 4;
        nArray[2] = 16;
        nArray[3] = 128;
        nArray[4] = 1024;
        nArray[5] = 2048;
        nArray[6] = 8192;
        return nArray;
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprdeo.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((2 & arg0) == 2) {
            hashSet.add(sprtza.cfr_renamed_9("_&q'e3"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprcmfa.cfr_renamed_9("6j\u001cv\u0005c\u0011"));
        }
        if ((0x10 & arg0) == 16) {
            hashSet.add(sprtza.cfr_renamed_9("W:i&x\u001f~2u."));
        }
        if ((0x80 & arg0) == 128) {
            hashSet.add(sprcmfa.cfr_renamed_9("T\u0001j'c\u0014b\u001ch\u0012"));
        }
        if ((0x400 & arg0) == 1024) {
            hashSet.add(sprtza.cfr_renamed_9("\u0018e;u$y5c\u001a\u007f5q:"));
        }
        if ((0x800 & arg0) == 2048) {
            hashSet.add(sprcmfa.cfr_renamed_9(";s\u0018c\u0007o\u0016u9g\u0001o\u001b"));
        }
        if ((0x2000 & arg0) == 8192) {
            hashSet.add(sprtza.cfr_renamed_9("\u0006t/"));
        }
        return hashSet;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprcmfa.cfr_renamed_9("I\u0005g\u0004s\u0010").equals(arg0)) {
            return 2;
        }
        if (sprtza.cfr_renamed_9("\u0015|?`&u2").equals(arg0)) {
            return 4;
        }
        if (sprcmfa.cfr_renamed_9("A\u0019\u007f\u0005n<h\u0011c\r").equals(arg0)) {
            return 16;
        }
        if (sprtza.cfr_renamed_9("B\"|\u0004u7t?~1").equals(arg0)) {
            return 128;
        }
        if (sprcmfa.cfr_renamed_9(";s\u0018c\u0007o\u0016u9i\u0016g\u0019").equals(arg0)) {
            return 1024;
        }
        if (sprtza.cfr_renamed_9("\u0018e;u$y5c\u001aq\"y8").equals(arg0)) {
            return 2048;
        }
        if (sprcmfa.cfr_renamed_9("%b\f").equals(arg0)) {
            return 8192;
        }
        throw new IllegalArgumentException(sprtza.cfr_renamed_9("E8{8\u007f!~vG;v\u0013h\"D3h\"_#d\u0019`\"y9~%08q;ux"));
    }
}


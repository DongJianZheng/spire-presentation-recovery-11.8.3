/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvws;
import com.spire.presentation.packages.sprzaq;

@sprtea
public final class sprseo {
    public static final int cfr_renamed_112 = 5;
    public static final int cfr_renamed_119 = 7;
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 6;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 2;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 4 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprvws.cfr_renamed_9("/l\u0013v.{\ng-m\bn\u001e");
            }
            case 1: {
                return sprzaq.cfr_renamed_9("o\u0003S\u0019n\u0014J\b~\u0004I\u001dV\fC");
            }
            case 2: {
                return sprvws.cfr_renamed_9("/l\u0013v.{\ng*k\u0002g\u0016");
            }
            case 3: {
                return sprzaq.cfr_renamed_9("o\u0003S\u0019n\u0014J\bj\u0002S\u0003N");
            }
            case 4: {
                return sprvws.cfr_renamed_9("W\u0014k\u000eV\u0003r\u001fK\u0014a\u0012");
            }
            case 5: {
                return sprzaq.cfr_renamed_9("8T\u0004N9C\u001d_)U\u000eO\u0000_\u0003N");
            }
            case 6: {
                return sprvws.cfr_renamed_9("W\u0014k\u000eV\u0003r\u001fO\u0013n\u0016k\u0017g\u000eg\b");
            }
        }
        return sprzaq.cfr_renamed_9("8T\u0006T\u0002M\u0003\u001a(W\u000bj\u0001O\u001eo\u0003S\u0019n\u0014J\b\u001a\u001b[\u0001O\b\u0014");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprvws.cfr_renamed_9("/l\u0013v.{\ng-m\bn\u001e");
            }
            case 1: {
                return sprzaq.cfr_renamed_9("o\u0003S\u0019n\u0014J\b~\u0004I\u001dV\fC");
            }
            case 2: {
                return sprvws.cfr_renamed_9("/l\u0013v.{\ng*k\u0002g\u0016");
            }
            case 3: {
                return sprzaq.cfr_renamed_9("o\u0003S\u0019n\u0014J\bj\u0002S\u0003N");
            }
            case 4: {
                return sprvws.cfr_renamed_9("W\u0014k\u000eV\u0003r\u001fK\u0014a\u0012");
            }
            case 5: {
                return sprzaq.cfr_renamed_9("8T\u0004N9C\u001d_)U\u000eO\u0000_\u0003N");
            }
            case 6: {
                return sprvws.cfr_renamed_9("W\u0014k\u000eV\u0003r\u001fO\u0013n\u0016k\u0017g\u000eg\b");
            }
        }
        return sprzaq.cfr_renamed_9("8T\u0006T\u0002M\u0003\u001a(W\u000bj\u0001O\u001eo\u0003S\u0019n\u0014J\b\u001a\u001b[\u0001O\b\u0014");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[7];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        return nArray;
    }

    private /* synthetic */ sprseo() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprvws.cfr_renamed_9("/l\u0013v.{\ng-m\bn\u001e").equals(arg0)) {
            return 0;
        }
        if (sprzaq.cfr_renamed_9("o\u0003S\u0019n\u0014J\b~\u0004I\u001dV\fC").equals(arg0)) {
            return 1;
        }
        if (sprvws.cfr_renamed_9("/l\u0013v.{\ng*k\u0002g\u0016").equals(arg0)) {
            return 2;
        }
        if (sprzaq.cfr_renamed_9("o\u0003S\u0019n\u0014J\bj\u0002S\u0003N").equals(arg0)) {
            return 3;
        }
        if (sprvws.cfr_renamed_9("W\u0014k\u000eV\u0003r\u001fK\u0014a\u0012").equals(arg0)) {
            return 4;
        }
        if (sprzaq.cfr_renamed_9("8T\u0004N9C\u001d_)U\u000eO\u0000_\u0003N").equals(arg0)) {
            return 5;
        }
        if (sprvws.cfr_renamed_9("W\u0014k\u000eV\u0003r\u001fO\u0013n\u0016k\u0017g\u000eg\b").equals(arg0)) {
            return 6;
        }
        throw new IllegalArgumentException(sprzaq.cfr_renamed_9("o\u0003Q\u0003U\u001aTM\u007f\u0000\\=V\u0018I8T\u0004N9C\u001d_MT\fW\b\u0014"));
    }
}


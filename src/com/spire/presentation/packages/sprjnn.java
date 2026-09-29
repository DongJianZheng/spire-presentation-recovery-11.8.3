/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnkr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzos;

@sprtea
public final class sprjnn {
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprzos.cfr_renamed_9("\"0\u001a,\u0018%\u0003'\u0001");
            }
            case 1: {
                return sprnkr.cfr_renamed_9("X\bt\u0019D\u0004k\u0005`\u0004k\u0005x");
            }
            case 2: {
                return sprzos.cfr_renamed_9("\u000f\u0003%\u000f\b\u001e=\u000b*\u0002$\u000f'\u001e");
            }
        }
        return sprnkr.cfr_renamed_9("Y\u0003g\u0003c\u001abM\\\u001eM\u0003b\u0002x\fx\u0004c\u0003X\u0014|\b,\u001bm\u0001y\b\"");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprzos.cfr_renamed_9("\"0\u001a,\u0018%\u0003'\u0001").equals(arg0)) {
            return 0;
        }
        if (sprnkr.cfr_renamed_9("9i\u0015x2D\u0004k\u0005`\u0004k\u0005x").equals(arg0)) {
            return 1;
        }
        if (sprzos.cfr_renamed_9(", \u0006,5\b\u001e=\u000b*\u0002$\u000f'\u001e").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprnkr.cfr_renamed_9("8b\u0006b\u0002{\u0003,=\u007f,b\u0003c\u0019m\u0019e\u0002b9u\u001diMb\fa\b\""));
    }

    private /* synthetic */ sprjnn() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5 << 1;
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

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprzos.cfr_renamed_9("\"0\u001a,\u0018%\u0003'\u0001");
            }
            case 1: {
                return sprnkr.cfr_renamed_9("9i\u0015x2D\u0004k\u0005`\u0004k\u0005x");
            }
            case 2: {
                return sprzos.cfr_renamed_9(", \u0006,5\b\u001e=\u000b*\u0002$\u000f'\u001e");
            }
        }
        return sprnkr.cfr_renamed_9("Y\u0003g\u0003c\u001abM\\\u001eM\u0003b\u0002x\fx\u0004c\u0003X\u0014|\b,\u001bm\u0001y\b\"");
    }
}


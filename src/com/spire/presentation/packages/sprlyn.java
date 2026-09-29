/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbme;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruuy;

@sprtea
public final class sprlyn {
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 2;

    private /* synthetic */ sprlyn() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[4];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        return nArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 3 ^ 1;
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
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprbme.cfr_renamed_9("\b\u001b$");
            }
            case 1: {
                return spruuy.cfr_renamed_9("1\n");
            }
            case 2: {
                return sprbme.cfr_renamed_9(",\"");
            }
            case 3: {
                return spruuy.cfr_renamed_9("!\f\u0015");
            }
        }
        return sprbme.cfr_renamed_9("\u001f\u0001!\u0001%\u0018$O\u001a\u000b,.)\u001d%)%\u001d')#\n&\u000b\u001e\u0016:\nj\u0019+\u0003?\nd");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (spruuy.cfr_renamed_9("0\u0011\u001c").equals(arg0)) {
            return 0;
        }
        if (sprbme.cfr_renamed_9(";2").equals(arg0)) {
            return 1;
        }
        if (spruuy.cfr_renamed_9("&\u001a").equals(arg0)) {
            return 2;
        }
        if (sprbme.cfr_renamed_9("\u0019\u0006-").equals(arg0)) {
            return 3;
        }
        throw new IllegalArgumentException(spruuy.cfr_renamed_9("0\u001c\u000e\u001c\n\u0005\u000bR5\u0016\u00033\u0006\u0000\n4\n\u0000\b4\f\u0017\t\u00161\u000b\u0015\u0017E\u001c\u0004\u001f\u0000\\"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprbme.cfr_renamed_9("\b\u001b$");
            }
            case 1: {
                return spruuy.cfr_renamed_9("1\n");
            }
            case 2: {
                return sprbme.cfr_renamed_9(",\"");
            }
            case 3: {
                return spruuy.cfr_renamed_9("!\f\u0015");
            }
        }
        return sprbme.cfr_renamed_9("\u001f\u0001!\u0001%\u0018$O\u001a\u000b,.)\u001d%)%\u001d')#\n&\u000b\u001e\u0016:\nj\u0019+\u0003?\nd");
    }
}


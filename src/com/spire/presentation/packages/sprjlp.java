/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkpy;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxqr;

@sprtea
public final class sprjlp {
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("Default".equals(arg0)) {
            return 0;
        }
        if (sprxqr.cfr_renamed_9("\u0016\u0004(\b4").equals(arg0)) {
            return 1;
        }
        if (sprkpy.cfr_renamed_9("syWqDzI}").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprxqr.cfr_renamed_9("\u0005\u0003;\u0003?\u001a>M\u0016\u0002>\u0019\u0000\u0004$\u000e8.?\u001f5M>\f=\b~"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return "Default";
            }
            case 1: {
                return sprkpy.cfr_renamed_9("^L`@|");
            }
            case 2: {
                return sprxqr.cfr_renamed_9(";1\u001f9\f2\u00015");
            }
        }
        return sprkpy.cfr_renamed_9("pvNvJoK8cwKluqQ{M[Jj@8SyIm@6");
    }

    private /* synthetic */ sprjlp() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5) << 1;
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
                return "Default";
            }
            case 1: {
                return sprxqr.cfr_renamed_9("\u0016\u0004(\b4");
            }
            case 2: {
                return sprkpy.cfr_renamed_9("syWqDzI}");
            }
        }
        return sprxqr.cfr_renamed_9("8>\u0006>\u0002'\u0003p+?\u0003$=9\u00193\u0005\u0013\u0002\"\bp\u001b1\u0001%\b~");
    }
}


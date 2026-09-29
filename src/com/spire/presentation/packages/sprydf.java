/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbaf;
import com.spire.presentation.packages.sprnwe;

public final class sprydf {
    public static String cfr_renamed_897(int[] arg0) {
        return sprnwe.cfr_renamed_503(sprbaf.cfr_renamed_898(arg0));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = 1 << 3 ^ 5;
        int n4 = n2;
        int n5 = 1 << 3;
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
     * WARNING - void declaration
     */
    private static /* synthetic */ int cfr_renamed_893(int[] nArray, int n, int n2, int n3) {
        int n4;
        void arg1;
        void arg2;
        int[] arg0;
        int n5 = nArray[n3];
        nArray[arg3] = arg0[arg2];
        arg0[arg2] = n5;
        void var5_5 = arg1;
        int n6 = n4 = arg1;
        while (n6 < arg2) {
            if (arg0[n4] <= n5) {
                int n7 = arg0[var5_5];
                arg0[var5_5] = arg0[n4];
                ++var5_5;
                arg0[n4] = n7;
            }
            n6 = ++n4;
        }
        n4 = arg0[var5_5];
        arg0[var5_5] = arg0[arg2];
        arg0[arg2] = n4;
        return (int)var5_5;
    }

    public static void cfr_renamed_556(int[] arg0, int arg1) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            arg0[n--] = arg1;
            n2 = n;
        }
    }

    public static String cfr_renamed_895(int[] arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(arg0[n]);
            string = stringBuilder.append(" ").toString();
            n2 = ++n;
        }
        return string;
    }

    public static int[] cfr_renamed_899(int[] arg0, int arg1, int arg2) {
        int[] nArray = new int[arg2 - arg1];
        System.arraycopy(arg0, arg1, nArray, 0, arg2 - arg1);
        return nArray;
    }

    public static void cfr_renamed_892(int[] arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int n = arg2;
            int n2 = sprydf.cfr_renamed_893(arg0, arg1, n, n);
            sprydf.cfr_renamed_892(arg0, arg1, n2 - 1);
            sprydf.cfr_renamed_892(arg0, n2 + 1, arg2);
        }
    }

    public static void cfr_renamed_894(int[] nArray) {
        int[] arg0;
        sprydf.cfr_renamed_892(arg0, 0, arg0.length - 1);
    }

    private /* synthetic */ sprydf() {
    }

    public static boolean cfr_renamed_874(int[] arg0, int[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            bl &= arg0[n] == arg1[n];
            n2 = --n;
        }
        return bl;
    }

    public static int[] cfr_renamed_535(int[] arg0) {
        int[] nArray = new int[arg0.length];
        System.arraycopy(arg0, 0, nArray, 0, arg0.length);
        return nArray;
    }
}


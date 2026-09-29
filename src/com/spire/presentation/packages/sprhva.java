/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkwa;
import com.spire.presentation.packages.sprnta;
import java.math.BigInteger;

public final class sprhva {
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

    public static void cfr_renamed_892(int[] arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int n = arg2;
            int n2 = sprhva.cfr_renamed_893(arg0, arg1, n, n);
            sprhva.cfr_renamed_892(arg0, arg1, n2 - 1);
            sprhva.cfr_renamed_892(arg0, n2 + 1, arg2);
        }
    }

    public static void cfr_renamed_894(int[] nArray) {
        int[] arg0;
        sprhva.cfr_renamed_892(arg0, 0, arg0.length - 1);
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

    public static BigInteger[] cfr_renamed_896(int[] arg0) {
        int n;
        BigInteger[] bigIntegerArray = new BigInteger[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            bigIntegerArray[n3] = BigInteger.valueOf(arg0[n3]);
            n2 = n;
        }
        return bigIntegerArray;
    }

    public static String cfr_renamed_897(int[] arg0) {
        return sprnta.cfr_renamed_503(sprkwa.cfr_renamed_898(arg0));
    }

    public static void cfr_renamed_556(int[] arg0, int arg1) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            arg0[n--] = arg1;
            n2 = n;
        }
    }

    private /* synthetic */ sprhva() {
    }

    public static int[] cfr_renamed_899(int[] arg0, int arg1, int arg2) {
        int[] nArray = new int[arg2 - arg1];
        System.arraycopy(arg0, arg1, nArray, 0, arg2 - arg1);
        return nArray;
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
}


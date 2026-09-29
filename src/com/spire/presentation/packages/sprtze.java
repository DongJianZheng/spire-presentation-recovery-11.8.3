/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public final class sprtze {
    public static void cfr_renamed_1127(BigInteger[] arg0, BigInteger arg1) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            arg0[n--] = arg1;
            n2 = n;
        }
    }

    public static int[] cfr_renamed_1128(int arg0, BigInteger[] arg1) {
        int n;
        BigInteger bigInteger = BigInteger.valueOf(arg0);
        int[] nArray = new int[arg1.length];
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3 = n++;
            nArray[n3] = arg1[n3].mod(bigInteger).intValue();
            n2 = n;
        }
        return nArray;
    }

    public static BigInteger[] cfr_renamed_1123(BigInteger[] arg0, int arg1, int arg2) {
        BigInteger[] bigIntegerArray = new BigInteger[arg2 - arg1];
        System.arraycopy(arg0, arg1, bigIntegerArray, 0, arg2 - arg1);
        return bigIntegerArray;
    }

    public static byte[] cfr_renamed_1126(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (byArray.length == 1 || (arg0.bitLength() & 7) != 0) {
            return byArray;
        }
        byte[] byArray2 = new byte[arg0.bitLength() >> 3];
        System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
        return byArray2;
    }

    private /* synthetic */ sprtze() {
    }

    public static int[] cfr_renamed_1125(BigInteger[] arg0) {
        int n;
        int[] nArray = new int[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            nArray[n3] = arg0[n3].intValue();
            n2 = n;
        }
        return nArray;
    }

    public static boolean cfr_renamed_1124(BigInteger[] arg0, BigInteger[] arg1) {
        int n;
        int n2 = 0;
        if (arg0.length != arg1.length) {
            return false;
        }
        int n3 = n = 0;
        while (n3 < arg0.length) {
            BigInteger bigInteger = arg0[n];
            BigInteger bigInteger2 = arg1[n];
            n2 |= bigInteger.compareTo(bigInteger2);
            n3 = ++n;
        }
        return n2 == 0;
    }
}


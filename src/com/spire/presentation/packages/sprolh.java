/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import java.math.BigInteger;

public abstract class sprolh {
    public static long[] cfr_renamed_8534() {
        return new long[9];
    }

    public static boolean cfr_renamed_8535(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 8;
        while (n2 >= 0) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    public static long[] cfr_renamed_8536() {
        return new long[18];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8537(long[] lArray, int n, long[] lArray2, int n2) {
        void arg1;
        long[] arg0;
        void arg3;
        void arg2;
        void v0 = arg2;
        void v1 = arg3;
        void v2 = arg2;
        void v3 = arg3;
        void v4 = arg2;
        void v5 = arg3;
        arg2[v5 + false] = arg0[arg1 + false];
        v4[v5 + true] = arg0[arg1 + true];
        v4[arg3 + 2] = arg0[arg1 + 2];
        arg2[v3 + 3] = arg0[arg1 + 3];
        v2[v3 + 4] = arg0[arg1 + 4];
        v2[arg3 + 5] = arg0[arg1 + 5];
        arg2[v1 + 6] = arg0[arg1 + 6];
        v0[v1 + 7] = arg0[arg1 + 7];
        v0[n2 + 8] = arg0[arg1 + 8];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8538(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        void v2 = arg1;
        void v3 = arg1;
        arg1[0] = arg0[0];
        v3[1] = arg0[1];
        v3[2] = arg0[2];
        v2[3] = arg0[3];
        v2[4] = arg0[4];
        v1[5] = arg0[5];
        v1[6] = arg0[6];
        v0[7] = arg0[7];
        v0[8] = arg0[8];
    }

    public static long[] cfr_renamed_8539(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] lArray = sprolh.cfr_renamed_8534();
        int n2 = n = 0;
        while (n2 < 9) {
            lArray[n++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
            n2 = n;
        }
        return lArray;
    }

    public static boolean cfr_renamed_8540(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 9) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static boolean cfr_renamed_8541(long[] arg0) {
        int n;
        if (arg0[0] != 1L) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 9) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static BigInteger cfr_renamed_8542(long[] arg0) {
        int n;
        byte[] byArray = new byte[72];
        int n2 = n = 0;
        while (n2 < 9) {
            long l = arg0[n];
            if (l != 0L) {
                sprpxe.cfr_renamed_450(l, byArray, 8 - n << 3);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }
}


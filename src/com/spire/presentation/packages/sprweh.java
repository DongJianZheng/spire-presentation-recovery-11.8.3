/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;

public abstract class sprweh {
    public static boolean cfr_renamed_8541(long[] arg0) {
        int n;
        if (arg0[0] != 1L) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 7) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        sprekh.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg2);
        sprekh.cfr_renamed_1637(arg0, 7, (int[])arg1, 7, (int[])arg2, 14);
        int n = sprekh.cfr_renamed_1629(nArray3, 7, (int[])arg2, 14);
        void v0 = arg2;
        int n2 = n + sprekh.cfr_renamed_1630((int[])v0, 0, (int[])v0, 7, 0);
        void v1 = arg2;
        n += sprekh.cfr_renamed_1630((int[])v1, 21, (int[])v1, 14, n2);
        int[] nArray4 = sprekh.cfr_renamed_1631();
        int[] nArray5 = sprekh.cfr_renamed_1631();
        void v2 = arg1;
        boolean bl = sprekh.cfr_renamed_1632(arg0, 7, arg0, 0, nArray4, 0) != sprekh.cfr_renamed_1632((int[])v2, 7, (int[])v2, 0, nArray5, 0);
        int[] nArray6 = sprekh.cfr_renamed_1633();
        sprekh.cfr_renamed_1636(nArray4, nArray5, nArray6);
        sprvih.cfr_renamed_1634(28, n += bl ? sprvih.cfr_renamed_1638(14, nArray6, 0, (int[])arg2, 7) : sprvih.cfr_renamed_1635(14, nArray6, 0, (int[])arg2, 7), (int[])arg2, 21);
    }

    public static long[] cfr_renamed_8534() {
        return new long[7];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1627(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        sprekh.cfr_renamed_1627(arg0, (int[])arg1);
        sprekh.cfr_renamed_1628(arg0, 7, (int[])arg1, 14);
        int n = sprekh.cfr_renamed_1629(nArray2, 7, (int[])arg1, 14);
        void v0 = arg1;
        int n2 = n + sprekh.cfr_renamed_1630((int[])v0, 0, (int[])v0, 7, 0);
        void v1 = arg1;
        n += sprekh.cfr_renamed_1630((int[])v1, 21, (int[])v1, 14, n2);
        int[] nArray3 = sprekh.cfr_renamed_1631();
        sprekh.cfr_renamed_1632(arg0, 7, arg0, 0, nArray3, 0);
        int[] nArray4 = sprekh.cfr_renamed_1633();
        sprekh.cfr_renamed_1627(nArray3, nArray4);
        sprvih.cfr_renamed_1634(28, n += sprvih.cfr_renamed_1635(14, nArray4, 0, (int[])arg1, 7), (int[])arg1, 21);
    }

    public static boolean cfr_renamed_8535(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 6;
        while (n2 >= 0) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    public static long[] cfr_renamed_8536() {
        return new long[14];
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
        arg2[arg3 + false] = arg0[arg1 + false];
        arg2[v3 + true] = arg0[arg1 + true];
        v2[v3 + 2] = arg0[arg1 + 2];
        v2[arg3 + 3] = arg0[arg1 + 3];
        arg2[v1 + 4] = arg0[arg1 + 4];
        v0[v1 + 5] = arg0[arg1 + 5];
        v0[n2 + 6] = arg0[arg1 + 6];
    }

    public static long[] cfr_renamed_8539(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] lArray = sprweh.cfr_renamed_8534();
        int n2 = n = 0;
        while (n2 < 7) {
            lArray[n++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
            n2 = n;
        }
        return lArray;
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
        arg1[0] = arg0[0];
        v2[1] = arg0[1];
        v2[2] = arg0[2];
        v1[3] = arg0[3];
        v1[4] = arg0[4];
        v0[5] = arg0[5];
        v0[6] = arg0[6];
    }

    public static boolean cfr_renamed_8540(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 7) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static BigInteger cfr_renamed_8542(long[] arg0) {
        int n;
        byte[] byArray = new byte[56];
        int n2 = n = 0;
        while (n2 < 7) {
            long l = arg0[n];
            if (l != 0L) {
                sprpxe.cfr_renamed_450(l, byArray, 6 - n << 3);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }
}


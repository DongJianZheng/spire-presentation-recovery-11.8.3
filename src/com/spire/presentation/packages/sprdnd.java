/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprzra;

public abstract class sprdnd {
    private static final int cfr_renamed_1 = -520093696;
    private static final long cfr_renamed_2 = 0xE1000000000000L;
    private static final int[] cfr_renamed_3 = sprdnd.cfr_renamed_3431();
    private static final byte cfr_renamed_4 = -31;

    public static int cfr_renamed_3432(int[] arg0, int arg1) {
        int[] nArray = arg0;
        int n = arg0[0];
        int n2 = 32 - arg1;
        nArray[0] = n >>> arg1;
        int n3 = n << n2;
        n = arg0[1];
        nArray[1] = n >>> arg1 | n3;
        n3 = n << n2;
        n = arg0[2];
        nArray[2] = n >>> arg1 | n3;
        n3 = n << n2;
        n = arg0[3];
        nArray[3] = n >>> arg1 | n3;
        return n << n2;
    }

    public static void cfr_renamed_3421(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n = arg3;
        while (true) {
            --arg3;
            if (n <= 0) break;
            int n2 = arg3;
            byte[] byArray = arg0;
            n = n2;
            byArray[n2] = (byte)(byArray[n2] ^ arg1[arg2 + arg3]);
        }
    }

    public static int cfr_renamed_3433(int[] arg0, int[] arg1) {
        int n = arg0[0];
        arg1[0] = n >>> 1;
        int n2 = n << 31;
        n = arg0[1];
        arg1[1] = n >>> 1 | n2;
        n2 = n << 31;
        n = arg0[2];
        arg1[2] = n >>> 1 | n2;
        n2 = n << 31;
        n = arg0[3];
        arg1[3] = n >>> 1 | n2;
        return n << 31;
    }

    public static void cfr_renamed_3423(byte[] arg0, int[] arg1) {
        sprtsa.cfr_renamed_445(arg0, 0, arg1);
    }

    public static void cfr_renamed_3434(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = new long[2];
        lArray[0] = arg0[0];
        lArray[1] = arg0[1];
        long[] lArray2 = lArray;
        long[] lArray3 = new long[2];
        int n2 = n = 0;
        while (n2 < 2) {
            int n3;
            long l = arg1[n];
            int n4 = n3 = 63;
            while (n4 >= 0) {
                if ((l & 1L << n3) != 0L) {
                    sprdnd.cfr_renamed_3435(lArray3, lArray2);
                }
                if (sprdnd.cfr_renamed_3436(lArray2) != 0L) {
                    lArray2[0] = lArray2[0] ^ 0xE1000000000000L;
                }
                n4 = --n3;
            }
            n2 = ++n;
        }
        arg0[0] = lArray3[0];
        arg0[1] = lArray3[1];
    }

    public static int cfr_renamed_3437(int[] arg0) {
        int[] nArray = arg0;
        int n = arg0[0];
        nArray[0] = n >>> 1;
        int n2 = n << 31;
        n = arg0[1];
        nArray[1] = n >>> 1 | n2;
        n2 = n << 31;
        n = arg0[2];
        nArray[2] = n >>> 1 | n2;
        n2 = n << 31;
        n = arg0[3];
        nArray[3] = n >>> 1 | n2;
        return n << 31;
    }

    public static void cfr_renamed_855(int[] arg0, int[] arg1) {
        int n;
        int[] nArray = sprzra.cfr_renamed_535(arg0);
        int[] nArray2 = new int[4];
        int n2 = n = 0;
        while (n2 < 4) {
            int n3;
            int n4 = arg1[n];
            int n5 = n3 = 31;
            while (n5 >= 0) {
                if ((n4 & 1 << n3) != 0) {
                    sprdnd.cfr_renamed_3438(nArray2, nArray);
                }
                if (sprdnd.cfr_renamed_3437(nArray) != 0) {
                    nArray[0] = nArray[0] ^ 0xE1000000;
                }
                n5 = --n3;
            }
            n2 = ++n;
        }
        System.arraycopy(nArray2, 0, arg0, 0, 4);
    }

    public static byte[] cfr_renamed_3379() {
        byte[] byArray = new byte[16];
        byArray[0] = -128;
        return byArray;
    }

    public static void cfr_renamed_3426(int[] arg0, int[] arg1) {
        int[] nArray = arg1;
        int n = sprdnd.cfr_renamed_3439(arg0, 8, arg1);
        nArray[0] = nArray[0] ^ cfr_renamed_3[n >>> 24];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_3438(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        int[] nArray3 = arg0;
        int[] nArray4 = arg0;
        int[] nArray5 = arg0;
        int[] nArray6 = arg0;
        nArray5[0] = nArray5[0] ^ arg1[0];
        nArray6[1] = nArray6[1] ^ arg1[1];
        nArray3[2] = nArray3[2] ^ arg1[2];
        nArray4[3] = nArray4[3] ^ arg1[3];
    }

    public static void cfr_renamed_3440(int[] arg0) {
        if (sprdnd.cfr_renamed_3437(arg0) != 0) {
            arg0[0] = arg0[0] ^ 0xE1000000;
        }
    }

    public static long[] cfr_renamed_3441(byte[] arg0) {
        long[] lArray = new long[2];
        sprtsa.cfr_renamed_455(arg0, 0, lArray);
        return lArray;
    }

    public static void cfr_renamed_3424(int[] arg0, int[] arg1) {
        if (sprdnd.cfr_renamed_3433(arg0, arg1) != 0) {
            arg1[0] = arg1[0] ^ 0xE1000000;
        }
    }

    private static /* synthetic */ int[] cfr_renamed_3431() {
        int n;
        int[] nArray = new int[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            int n4 = 0;
            int n5 = n3 = 7;
            while (n5 >= 0) {
                if ((n & 1 << n3) != 0) {
                    n4 ^= -520093696 >>> 7 - n3;
                }
                n5 = --n3;
            }
            nArray[n++] = n4;
            n2 = n;
        }
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_3425(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg1;
        int[] arg0;
        void arg2;
        void v0 = arg2;
        void v1 = arg2;
        v1[0] = arg0[0] ^ arg1[0];
        v1[1] = arg0[1] ^ arg1[1];
        v0[2] = arg0[2] ^ arg1[2];
        v0[3] = arg0[3] ^ arg1[3];
    }

    public static void cfr_renamed_3442(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n = 0;
        do {
            byte[] byArray = arg2;
            byte[] byArray2 = arg2;
            int n2 = n;
            byte by = (byte)(arg0[n] ^ arg1[n2]);
            byArray[n2] = by;
            int n3 = ++n;
            byte by2 = (byte)(arg0[n] ^ arg1[n3]);
            byArray2[n3] = by2;
            int n4 = ++n;
            byte by3 = (byte)(arg0[n] ^ arg1[n4]);
            byArray[n4] = by3;
            int n5 = ++n;
            byte by4 = byArray2[n5] = (byte)(arg0[n] ^ arg1[n5]);
        } while (++n < 16);
    }

    public static void cfr_renamed_3443(long[] arg0, byte[] arg1) {
        sprtsa.cfr_renamed_441(arg0, arg1, 0);
    }

    public static long cfr_renamed_3436(long[] arg0) {
        long[] lArray = arg0;
        long l = arg0[0];
        lArray[0] = l >>> 1;
        long l2 = l << 63;
        l = arg0[1];
        lArray[1] = l >>> 1 | l2;
        return l << 63;
    }

    public static void cfr_renamed_3444(int[] arg0) {
        int[] nArray = arg0;
        int n = sprdnd.cfr_renamed_3432(arg0, 8);
        nArray[0] = nArray[0] ^ cfr_renamed_3[n >>> 24];
    }

    public static void cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n = 0;
        do {
            byte[] byArray = arg0;
            byte[] byArray2 = arg0;
            int n2 = n;
            byte by = (byte)(byArray[n2] ^ arg1[n]);
            byArray[n2] = by;
            int n3 = ++n;
            byte by2 = (byte)(byArray2[n3] ^ arg1[n]);
            byArray2[n3] = by2;
            int n4 = ++n;
            byte by3 = (byte)(byArray[n4] ^ arg1[n]);
            byArray[n4] = by3;
            int n5 = ++n;
            byte by4 = byArray2[n5] = (byte)(byArray2[n5] ^ arg1[n]);
        } while (++n < 16);
    }

    public static byte cfr_renamed_3422(byte[] arg0) {
        int n = 0;
        int n2 = 0;
        do {
            byte[] byArray = arg0;
            int n3 = arg0[n] & 0xFF;
            byArray[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
            n3 = arg0[n] & 0xFF;
            byArray[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
            n3 = arg0[n] & 0xFF;
            byArray[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
            n3 = arg0[n] & 0xFF;
            byArray[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
        } while (n < 16);
        return (byte)n2;
    }

    public static void cfr_renamed_3430(int[] arg0, byte[] arg1) {
        sprtsa.cfr_renamed_457(arg0, arg1, 0);
    }

    public static int cfr_renamed_3439(int[] arg0, int arg1, int[] arg2) {
        int n = arg0[0];
        int n2 = 32 - arg1;
        arg2[0] = n >>> arg1;
        int n3 = n << n2;
        n = arg0[1];
        arg2[1] = n >>> arg1 | n3;
        n3 = n << n2;
        n = arg0[2];
        arg2[2] = n >>> arg1 | n3;
        n3 = n << n2;
        n = arg0[3];
        arg2[3] = n >>> arg1 | n3;
        return n << n2;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_3435(long[] lArray, long[] lArray2) {
        void arg1;
        long[] arg0;
        long[] lArray3 = arg0;
        long[] lArray4 = arg0;
        lArray3[0] = lArray3[0] ^ arg1[0];
        lArray4[1] = lArray4[1] ^ arg1[1];
    }

    public static long[] cfr_renamed_3445() {
        long[] lArray = new long[2];
        lArray[0] = Long.MIN_VALUE;
        return lArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_3446(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        v0[0] = arg0[0] ^ arg1[0];
        v0[1] = arg0[1] ^ arg1[1];
    }

    public static long cfr_renamed_3447(long[] arg0, long[] arg1) {
        long l = arg0[0];
        arg1[0] = l >>> 1;
        long l2 = l << 63;
        l = arg0[1];
        arg1[1] = l >>> 1 | l2;
        return l << 63;
    }

    public static int[] cfr_renamed_3429() {
        int[] nArray = new int[4];
        nArray[0] = Integer.MIN_VALUE;
        return nArray;
    }

    public static int[] cfr_renamed_3428(byte[] arg0) {
        int[] nArray = new int[4];
        sprtsa.cfr_renamed_445(arg0, 0, nArray);
        return nArray;
    }

    public static byte[] cfr_renamed_3448(int[] arg0) {
        byte[] byArray = new byte[16];
        sprtsa.cfr_renamed_457(arg0, byArray, 0);
        return byArray;
    }

    public static byte[] cfr_renamed_3449(long[] arg0) {
        byte[] byArray = new byte[16];
        sprtsa.cfr_renamed_441(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_3450(byte[] arg0, long[] arg1) {
        sprtsa.cfr_renamed_455(arg0, 0, arg1);
    }

    public static void cfr_renamed_3420(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = sprzra.cfr_renamed_158(arg0);
        byte[] byArray2 = new byte[16];
        int n2 = n = 0;
        while (n2 < 16) {
            int n3;
            byte by = arg1[n];
            int n4 = n3 = 7;
            while (n4 >= 0) {
                if ((by & 1 << n3) != 0) {
                    sprdnd.cfr_renamed_1122(byArray2, byArray);
                }
                if (sprdnd.cfr_renamed_3422(byArray) != 0) {
                    byArray[0] = (byte)(byArray[0] ^ 0xFFFFFFE1);
                }
                n4 = --n3;
            }
            n2 = ++n;
        }
        System.arraycopy(byArray2, 0, arg0, 0, 16);
    }

    public static byte cfr_renamed_3451(byte[] arg0, byte[] arg1) {
        int n = 0;
        int n2 = 0;
        do {
            int n3 = arg0[n] & 0xFF;
            arg1[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
            n3 = arg0[n] & 0xFF;
            arg1[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
            n3 = arg0[n] & 0xFF;
            arg1[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
            n3 = arg0[n] & 0xFF;
            arg1[n++] = (byte)(n3 >>> 1 | n2);
            n2 = (n3 & 1) << 7;
        } while (n < 16);
        return (byte)n2;
    }
}


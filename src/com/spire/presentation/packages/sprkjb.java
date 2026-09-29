/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprtsa;
import java.math.BigInteger;

public abstract class sprkjb {
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    public static int[] cfr_renamed_1633() {
        return new int[14];
    }

    public static int cfr_renamed_1661(int arg0, int[] arg1) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        int[] nArray = arg1;
        int[] nArray2 = arg1;
        arg1[0] = (int)(l += l2 * ((long)arg1[0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg1[1] = (int)(l += l2 * ((long)arg1[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[2] = (int)(l += l2 * ((long)arg1[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += l2 * ((long)arg1[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[4] = (int)(l += l2 * ((long)arg1[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += l2 * ((long)arg1[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[6] = (int)(l += l2 * ((long)arg1[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1646(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        int[] nArray = arg3;
        int[] nArray2 = arg3;
        arg3[arg4 + 0] = (int)(l += l2 * ((long)arg1[arg2 + 0] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg3[arg4 + 1] = (int)(l += l2 * ((long)arg1[arg2 + 1] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg4 + 2] = (int)(l += l2 * ((long)arg1[arg2 + 2] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg4 + 3] = (int)(l += l2 * ((long)arg1[arg2 + 3] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg4 + 4] = (int)(l += l2 * ((long)arg1[arg2 + 4] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg4 + 5] = (int)(l += l2 * ((long)arg1[arg2 + 5] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg4 + 6] = (int)(l += l2 * ((long)arg1[arg2 + 6] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1657(int arg0, long arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        long l3 = l += l2 * (arg1 & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL);
        arg2[arg3 + 0] = (int)l3;
        l = l3 >>> 32;
        arg2[arg3 + 1] = (int)(l += l2 * (arg1 >>> 32) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 2] = (int)(l += (long)arg2[arg3 + 2] & 0xFFFFFFFFL);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(7, arg2, arg3, 3);
    }

    public static int cfr_renamed_1668(int[] arg0, int[] arg1) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + ((long)arg1[0] & 0xFFFFFFFFL));
        int[] nArray = arg1;
        int[] nArray2 = arg1;
        arg1[0] = (int)l;
        l >>>= 32;
        arg1[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[4] = (int)(l += ((long)arg0[4] & 0xFFFFFFFFL) + ((long)arg1[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += ((long)arg0[5] & 0xFFFFFFFFL) + ((long)arg1[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[6] = (int)(l += ((long)arg0[6] & 0xFFFFFFFFL) + ((long)arg1[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1640(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg4;
        int[] nArray2 = arg4;
        arg4[arg5 + 0] = (int)l;
        l >>= 32;
        arg4[arg5 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg5 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[arg5 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg5 + 4] = (int)(l += ((long)arg0[arg1 + 4] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[arg5 + 5] = (int)(l += ((long)arg0[arg1 + 5] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg5 + 6] = (int)(l += ((long)arg0[arg1 + 6] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static boolean cfr_renamed_1639(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n;
        int n2 = n = 6;
        while (n2 >= 0) {
            int n3 = arg0[arg1 + n] ^ Integer.MIN_VALUE;
            int n4 = arg2[arg3 + n] ^ Integer.MIN_VALUE;
            if (n3 < n4) {
                return false;
            }
            if (n3 > n4) {
                return true;
            }
            n2 = --n;
        }
        return true;
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        long l;
        long l2;
        long l3 = (long)arg0[0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 6;
        int n3 = 14;
        do {
            long l4 = arg0[n2];
            --n2;
            l2 = l4 & 0xFFFFFFFFL;
            l = l2 * l2;
            int n4 = --n3;
            arg1[n4] = n << 31 | (int)(l >>> 33);
            arg1[--n3] = (int)(l >>> 1);
            n = (int)l;
        } while (n2 > 0);
        long l5 = l3;
        l2 = l5 * l5;
        long l6 = (long)(n << 31) & 0xFFFFFFFFL | l2 >>> 33;
        int[] nArray = arg1;
        int[] nArray2 = arg1;
        int[] nArray3 = arg1;
        int[] nArray4 = arg1;
        int[] nArray5 = arg1;
        int[] nArray6 = arg1;
        long l7 = l2;
        arg1[0] = (int)l7;
        n = (int)(l7 >>> 32) & 1;
        long l8 = (long)arg0[1] & 0xFFFFFFFFL;
        l2 = (long)arg1[2] & 0xFFFFFFFFL;
        int n5 = (int)(l6 += l8 * l3);
        nArray6[1] = n5 << 1 | n;
        n = n5 >>> 31;
        l2 += l6 >>> 32;
        l = (long)arg0[2] & 0xFFFFFFFFL;
        long l9 = (long)arg1[3] & 0xFFFFFFFFL;
        long l10 = (long)nArray6[4] & 0xFFFFFFFFL;
        n5 = (int)(l2 += l * l3);
        nArray5[2] = n5 << 1 | n;
        n = n5 >>> 31;
        l10 += (l9 += (l2 >>> 32) + l * l8) >>> 32;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)arg0[3] & 0xFFFFFFFFL;
        long l12 = (long)arg1[5] & 0xFFFFFFFFL;
        long l13 = (long)nArray5[6] & 0xFFFFFFFFL;
        n5 = (int)(l9 += l11 * l3);
        nArray4[3] = n5 << 1 | n;
        n = n5 >>> 31;
        l10 &= 0xFFFFFFFFL;
        l13 += (l12 += ((l10 += (l9 >>> 32) + l11 * l8) >>> 32) + l11 * l) >>> 32;
        l12 &= 0xFFFFFFFFL;
        long l14 = (long)arg0[4] & 0xFFFFFFFFL;
        long l15 = (long)arg1[7] & 0xFFFFFFFFL;
        long l16 = (long)nArray4[8] & 0xFFFFFFFFL;
        n5 = (int)(l10 += l14 * l3);
        nArray3[4] = n5 << 1 | n;
        n = n5 >>> 31;
        l12 &= 0xFFFFFFFFL;
        l13 &= 0xFFFFFFFFL;
        l16 += (l15 += ((l13 += ((l12 += (l10 >>> 32) + l14 * l8) >>> 32) + l14 * l) >>> 32) + l14 * l11) >>> 32;
        l15 &= 0xFFFFFFFFL;
        long l17 = (long)arg0[5] & 0xFFFFFFFFL;
        long l18 = (long)arg1[9] & 0xFFFFFFFFL;
        long l19 = (long)nArray3[10] & 0xFFFFFFFFL;
        n5 = (int)(l12 += l17 * l3);
        arg1[5] = n5 << 1 | n;
        n = n5 >>> 31;
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        l16 &= 0xFFFFFFFFL;
        l19 += (l18 += ((l16 += ((l15 += ((l13 += (l12 >>> 32) + l17 * l8) >>> 32) + l17 * l) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32;
        l18 &= 0xFFFFFFFFL;
        long l20 = (long)arg0[6] & 0xFFFFFFFFL;
        long l21 = (long)nArray[11] & 0xFFFFFFFFL;
        long l22 = (long)arg1[12] & 0xFFFFFFFFL;
        n5 = (int)(l13 += l20 * l3);
        nArray2[6] = n5 << 1 | n;
        n = n5 >>> 31;
        l22 += (l21 += ((l19 += ((l18 += ((l16 += ((l15 += (l13 >>> 32) + l20 * l8) >>> 32) + l20 * l) >>> 32) + l20 * l11) >>> 32) + l20 * l14) >>> 32) + l20 * l17) >>> 32;
        n5 = (int)l15;
        nArray[7] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l16;
        nArray2[8] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l18;
        nArray[9] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l19;
        nArray2[10] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l21;
        nArray[11] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l22;
        nArray2[12] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = nArray[13] + (int)(l22 >> 32);
        nArray2[13] = n5 << 1 | n;
    }

    public static boolean cfr_renamed_1648(int[] arg0, int[] arg1) {
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

    public static boolean cfr_renamed_1659(int[] arg0) {
        int n;
        if (arg0[0] != 1) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 7) {
            if (arg0[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_1664(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        l = 0L + (((long)arg2[arg3 + 0] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[arg3 + 0] = (int)l;
        l >>= 32;
        arg2[arg3 + 1] = (int)(l += ((long)arg2[arg3 + 1] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg3 + 2] = (int)(l += ((long)arg2[arg3 + 2] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[arg3 + 3] = (int)(l += ((long)arg2[arg3 + 3] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[arg3 + 4] = (int)(l += ((long)arg2[arg3 + 4] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg3 + 5] = (int)(l += ((long)arg2[arg3 + 5] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[arg3 + 6] = (int)(l += ((long)arg2[arg3 + 6] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int cfr_renamed_1650(int[] arg0, int[] arg1) {
        long l = 0L;
        l = 0L + (((long)arg1[0] & 0xFFFFFFFFL) - ((long)arg0[0] & 0xFFFFFFFFL));
        int[] nArray = arg1;
        int[] nArray2 = arg1;
        arg1[0] = (int)l;
        l >>= 32;
        arg1[1] = (int)(l += ((long)arg1[1] & 0xFFFFFFFFL) - ((long)arg0[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[2] = (int)(l += ((long)arg1[2] & 0xFFFFFFFFL) - ((long)arg0[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg1[3] = (int)(l += ((long)arg1[3] & 0xFFFFFFFFL) - ((long)arg0[3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[4] = (int)(l += ((long)arg1[4] & 0xFFFFFFFFL) - ((long)arg0[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[5] = (int)(l += ((long)arg1[5] & 0xFFFFFFFFL) - ((long)arg0[5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[6] = (int)(l += ((long)arg1[6] & 0xFFFFFFFFL) - ((long)arg0[6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static BigInteger cfr_renamed_1651(int[] arg0) {
        int n;
        byte[] byArray = new byte[28];
        int n2 = n = 0;
        while (n2 < 7) {
            int n3 = arg0[n];
            if (n3 != 0) {
                sprtsa.cfr_renamed_442(n3, byArray, 6 - n << 2);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }

    public static int cfr_renamed_1669(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        int n;
        long l = (long)arg2[arg3 + 0] & 0xFFFFFFFFL;
        long l2 = (long)arg2[arg3 + 1] & 0xFFFFFFFFL;
        long l3 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        long l4 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l5 = (long)arg2[arg3 + 4] & 0xFFFFFFFFL;
        long l6 = (long)arg2[arg3 + 5] & 0xFFFFFFFFL;
        long l7 = (long)arg2[arg3 + 6] & 0xFFFFFFFFL;
        long l8 = 0L;
        int n2 = n = 0;
        while (n2 < 7) {
            long l9 = 0L;
            long l10 = (long)arg0[arg1 + n] & 0xFFFFFFFFL;
            int[] nArray = arg4;
            arg4[arg5 + 0] = (int)(l9 += l10 * l + ((long)arg4[arg5 + 0] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg4[arg5 + 1] = (int)(l9 += l10 * l2 + ((long)arg4[arg5 + 1] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg4[arg5 + 2] = (int)(l9 += l10 * l3 + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg4[arg5 + 3] = (int)(l9 += l10 * l4 + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray[arg5 + 4] = (int)(l9 += l10 * l5 + ((long)arg4[arg5 + 4] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg4[arg5 + 5] = (int)(l9 += l10 * l6 + ((long)arg4[arg5 + 5] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray[arg5 + 6] = (int)(l9 += l10 * l7 + ((long)arg4[arg5 + 6] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray[arg5 + 7] = (int)(l9 += l8 + ((long)arg4[arg5 + 7] & 0xFFFFFFFFL));
            ++arg5;
            l8 = l9 >>> 32;
            n2 = ++n;
        }
        return (int)l8;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1637(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        int n4;
        void arg4;
        void arg1;
        void arg3;
        void arg2;
        void v0 = arg2;
        long l = (long)v0[arg3 + false] & 0xFFFFFFFFL;
        long l2 = (long)v0[arg3 + true] & 0xFFFFFFFFL;
        long l3 = (long)v0[arg3 + 2] & 0xFFFFFFFFL;
        long l4 = (long)v0[arg3 + 3] & 0xFFFFFFFFL;
        long l5 = (long)v0[arg3 + 4] & 0xFFFFFFFFL;
        long l6 = (long)v0[arg3 + 5] & 0xFFFFFFFFL;
        long l7 = (long)v0[arg3 + 6] & 0xFFFFFFFFL;
        long l8 = 0L;
        long l9 = (long)nArray[arg1 + false] & 0xFFFFFFFFL;
        void v1 = arg4;
        void v2 = arg4;
        void v3 = arg4;
        v3[arg5 + false] = (int)(l8 += l9 * l);
        l8 >>>= 32;
        v3[arg5 + true] = (int)(l8 += l9 * l2);
        l8 >>>= 32;
        v2[arg5 + 2] = (int)(l8 += l9 * l3);
        l8 >>>= 32;
        v2[arg5 + 3] = (int)(l8 += l9 * l4);
        l8 >>>= 32;
        v1[arg5 + 4] = (int)(l8 += l9 * l5);
        l8 >>>= 32;
        v1[arg5 + 5] = (int)(l8 += l9 * l6);
        l8 >>>= 32;
        v1[arg5 + 6] = (int)(l8 += l9 * l7);
        v1[arg5 + 7] = (int)(l8 >>>= 32);
        int n5 = n4 = 1;
        while (n5 < 7) {
            void arg5;
            int[] arg0;
            long l10 = 0L;
            long l11 = (long)arg0[arg1 + n4] & 0xFFFFFFFFL;
            void v5 = arg4;
            void v6 = arg4;
            void v7 = arg4;
            v7[arg5 + false] = (int)(l10 += l11 * l + ((long)arg4[++arg5 + false] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v7[arg5 + true] = (int)(l10 += l11 * l2 + ((long)arg4[arg5 + true] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v6[arg5 + 2] = (int)(l10 += l11 * l3 + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v6[arg5 + 3] = (int)(l10 += l11 * l4 + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v5[arg5 + 4] = (int)(l10 += l11 * l5 + ((long)arg4[arg5 + 4] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v5[arg5 + 5] = (int)(l10 += l11 * l6 + ((long)arg4[arg5 + 5] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v5[arg5 + 6] = (int)(l10 += l11 * l7 + ((long)arg4[arg5 + 6] & 0xFFFFFFFFL));
            v5[arg5 + 7] = (int)(l10 >>>= 32);
            n5 = ++n4;
        }
    }

    public static int cfr_renamed_1667(int arg0, long arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        long l3 = arg1 & 0xFFFFFFFFL;
        int[] nArray = arg2;
        nArray[arg3 + 0] = (int)(l += l2 * l3 + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        long l4 = arg1 >>> 32;
        nArray[arg3 + 1] = (int)(l += l2 * l4 + l3 + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 2] = (int)(l += l4 + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 3] = (int)(l += (long)arg2[arg3 + 3] & 0xFFFFFFFFL);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(7, arg2, arg3, 4);
    }

    public static int cfr_renamed_1644(int arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        long l3 = (long)arg1 & 0xFFFFFFFFL;
        long l4 = l += l3 * l2 + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL);
        arg2[arg3 + 0] = (int)l4;
        l = l4 >>> 32;
        arg2[arg3 + 1] = (int)(l += l3 + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 2] = (int)(l += (long)arg2[arg3 + 2] & 0xFFFFFFFFL);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprrpb.cfr_renamed_1645(7, arg2, arg3, 3);
    }

    public static long cfr_renamed_1666(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        long l3 = (long)arg1[arg2 + 0] & 0xFFFFFFFFL;
        arg5[arg6 + 0] = (int)(l += l2 * l3 + ((long)arg3[arg4 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        long l4 = (long)arg1[arg2 + 1] & 0xFFFFFFFFL;
        arg5[arg6 + 1] = (int)(l += l2 * l4 + l3 + ((long)arg3[arg4 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        long l5 = (long)arg1[arg2 + 2] & 0xFFFFFFFFL;
        arg5[arg6 + 2] = (int)(l += l2 * l5 + l4 + ((long)arg3[arg4 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        long l6 = (long)arg1[arg2 + 3] & 0xFFFFFFFFL;
        arg5[arg6 + 3] = (int)(l += l2 * l6 + l5 + ((long)arg3[arg4 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        long l7 = (long)arg1[arg2 + 4] & 0xFFFFFFFFL;
        arg5[arg6 + 4] = (int)(l += l2 * l7 + l6 + ((long)arg3[arg4 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        long l8 = (long)arg1[arg2 + 5] & 0xFFFFFFFFL;
        arg5[arg6 + 5] = (int)(l += l2 * l8 + l7 + ((long)arg3[arg4 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        long l9 = (long)arg1[arg2 + 6] & 0xFFFFFFFFL;
        arg5[arg6 + 6] = (int)(l += l2 * l9 + l8 + ((long)arg3[arg4 + 6] & 0xFFFFFFFFL));
        l >>>= 32;
        return l += l9;
    }

    public static int cfr_renamed_1642(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg4;
        int[] nArray2 = arg4;
        arg4[arg5 + 0] = (int)l;
        l >>>= 32;
        arg4[arg5 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg5 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg5 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg5 + 4] = (int)(l += ((long)arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 4] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg5 + 5] = (int)(l += ((long)arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 5] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg5 + 6] = (int)(l += ((long)arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 6] & 0xFFFFFFFFL) + ((long)arg4[arg5 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static boolean cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 7) {
            if (arg0[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static boolean cfr_renamed_1649(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 6;
        while (n2 >= 0) {
            int n3 = arg0[n] ^ Integer.MIN_VALUE;
            int n4 = arg1[n] ^ Integer.MIN_VALUE;
            if (n3 < n4) {
                return false;
            }
            if (n3 > n4) {
                return true;
            }
            n2 = --n;
        }
        return true;
    }

    public static int cfr_renamed_1655(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg4;
        int[] nArray2 = arg4;
        arg4[arg5 + 0] = (int)l;
        l >>>= 32;
        arg4[arg5 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg5 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg5 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg5 + 4] = (int)(l += ((long)arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg5 + 5] = (int)(l += ((long)arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg5 + 6] = (int)(l += ((long)arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        int n;
        void arg2;
        void arg1;
        void v0 = arg1;
        long l = (long)v0[0] & 0xFFFFFFFFL;
        long l2 = (long)v0[1] & 0xFFFFFFFFL;
        long l3 = (long)v0[2] & 0xFFFFFFFFL;
        long l4 = (long)v0[3] & 0xFFFFFFFFL;
        long l5 = (long)v0[4] & 0xFFFFFFFFL;
        long l6 = (long)v0[5] & 0xFFFFFFFFL;
        long l7 = (long)v0[6] & 0xFFFFFFFFL;
        long l8 = 0L;
        long l9 = (long)nArray[0] & 0xFFFFFFFFL;
        void v1 = arg2;
        void v2 = arg2;
        void v3 = arg2;
        v3[0] = (int)(l8 += l9 * l);
        l8 >>>= 32;
        v3[1] = (int)(l8 += l9 * l2);
        l8 >>>= 32;
        v2[2] = (int)(l8 += l9 * l3);
        l8 >>>= 32;
        v2[3] = (int)(l8 += l9 * l4);
        l8 >>>= 32;
        v1[4] = (int)(l8 += l9 * l5);
        l8 >>>= 32;
        v1[5] = (int)(l8 += l9 * l6);
        l8 >>>= 32;
        v1[6] = (int)(l8 += l9 * l7);
        v1[7] = (int)(l8 >>>= 32);
        int n2 = n = 1;
        while (n2 < 7) {
            int[] arg0;
            long l10 = 0L;
            long l11 = (long)arg0[n] & 0xFFFFFFFFL;
            void v5 = arg2;
            void v6 = arg2;
            void v7 = arg2;
            v7[n + 0] = (int)(l10 += l11 * l + ((long)arg2[n + 0] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v7[n + 1] = (int)(l10 += l11 * l2 + ((long)arg2[n + 1] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v6[n + 2] = (int)(l10 += l11 * l3 + ((long)arg2[n + 2] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v6[n + 3] = (int)(l10 += l11 * l4 + ((long)arg2[n + 3] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v5[n + 4] = (int)(l10 += l11 * l5 + ((long)arg2[n + 4] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v5[n + 5] = (int)(l10 += l11 * l6 + ((long)arg2[n + 5] & 0xFFFFFFFFL));
            l10 >>>= 32;
            v5[n + 6] = (int)(l10 += l11 * l7 + ((long)arg2[n + 6] & 0xFFFFFFFFL));
            int n3 = n + 7;
            v5[n3] = (int)(l10 >>>= 32);
            n2 = ++n;
        }
    }

    public static int cfr_renamed_1665(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        long l = (long)arg1[0] & 0xFFFFFFFFL;
        long l2 = (long)arg1[1] & 0xFFFFFFFFL;
        long l3 = (long)arg1[2] & 0xFFFFFFFFL;
        long l4 = (long)arg1[3] & 0xFFFFFFFFL;
        long l5 = (long)arg1[4] & 0xFFFFFFFFL;
        long l6 = (long)arg1[5] & 0xFFFFFFFFL;
        long l7 = (long)arg1[6] & 0xFFFFFFFFL;
        long l8 = 0L;
        int n2 = n = 0;
        while (n2 < 7) {
            long l9 = 0L;
            long l10 = (long)arg0[n] & 0xFFFFFFFFL;
            int[] nArray = arg2;
            arg2[n + 0] = (int)(l9 += l10 * l + ((long)arg2[n + 0] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg2[n + 1] = (int)(l9 += l10 * l2 + ((long)arg2[n + 1] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg2[n + 2] = (int)(l9 += l10 * l3 + ((long)arg2[n + 2] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg2[n + 3] = (int)(l9 += l10 * l4 + ((long)arg2[n + 3] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray[n + 4] = (int)(l9 += l10 * l5 + ((long)arg2[n + 4] & 0xFFFFFFFFL));
            l9 >>>= 32;
            arg2[n + 5] = (int)(l9 += l10 * l6 + ((long)arg2[n + 5] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray[n + 6] = (int)(l9 += l10 * l7 + ((long)arg2[n + 6] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray[n + 7] = (int)(l9 += l8 + ((long)arg2[n + 7] & 0xFFFFFFFFL));
            l8 = l9 >>> 32;
            n2 = ++n;
        }
        return (int)l8;
    }

    public static int cfr_renamed_1630(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long l = (long)arg4 & 0xFFFFFFFFL;
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[arg3 + 0] = (int)(l += ((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg3 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg3 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg3 + 4] = (int)(l += ((long)arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[arg3 + 5] = (int)(l += ((long)arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[arg3 + 6] = (int)(l += ((long)arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static void cfr_renamed_1628(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l;
        long l2;
        long l3 = (long)arg0[arg1 + 0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 6;
        int n3 = 14;
        do {
            int n4 = arg1 + n2;
            --n2;
            l2 = (long)arg0[n4] & 0xFFFFFFFFL;
            l = l2 * l2;
            int n5 = arg3 + --n3;
            arg2[n5] = n << 31 | (int)(l >>> 33);
            arg2[arg3 + --n3] = (int)(l >>> 1);
            n = (int)l;
        } while (n2 > 0);
        long l4 = l3;
        l2 = l4 * l4;
        long l5 = (long)(n << 31) & 0xFFFFFFFFL | l2 >>> 33;
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        int[] nArray3 = arg2;
        int[] nArray4 = arg2;
        int[] nArray5 = arg2;
        int[] nArray6 = arg2;
        long l6 = l2;
        arg2[arg3 + 0] = (int)l6;
        n = (int)(l6 >>> 32) & 1;
        long l7 = (long)arg0[arg1 + 1] & 0xFFFFFFFFL;
        l2 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        int n6 = (int)(l5 += l7 * l3);
        nArray6[arg3 + 1] = n6 << 1 | n;
        n = n6 >>> 31;
        l2 += l5 >>> 32;
        l = (long)arg0[arg1 + 2] & 0xFFFFFFFFL;
        long l8 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l9 = (long)nArray6[arg3 + 4] & 0xFFFFFFFFL;
        n6 = (int)(l2 += l * l3);
        nArray5[arg3 + 2] = n6 << 1 | n;
        n = n6 >>> 31;
        l9 += (l8 += (l2 >>> 32) + l * l7) >>> 32;
        l8 &= 0xFFFFFFFFL;
        long l10 = (long)arg0[arg1 + 3] & 0xFFFFFFFFL;
        long l11 = (long)arg2[arg3 + 5] & 0xFFFFFFFFL;
        long l12 = (long)nArray5[arg3 + 6] & 0xFFFFFFFFL;
        n6 = (int)(l8 += l10 * l3);
        nArray4[arg3 + 3] = n6 << 1 | n;
        n = n6 >>> 31;
        l9 &= 0xFFFFFFFFL;
        l12 += (l11 += ((l9 += (l8 >>> 32) + l10 * l7) >>> 32) + l10 * l) >>> 32;
        l11 &= 0xFFFFFFFFL;
        long l13 = (long)arg0[arg1 + 4] & 0xFFFFFFFFL;
        long l14 = (long)arg2[arg3 + 7] & 0xFFFFFFFFL;
        long l15 = (long)nArray4[arg3 + 8] & 0xFFFFFFFFL;
        n6 = (int)(l9 += l13 * l3);
        nArray3[arg3 + 4] = n6 << 1 | n;
        n = n6 >>> 31;
        l11 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        l15 += (l14 += ((l12 += ((l11 += (l9 >>> 32) + l13 * l7) >>> 32) + l13 * l) >>> 32) + l13 * l10) >>> 32;
        l14 &= 0xFFFFFFFFL;
        long l16 = (long)arg0[arg1 + 5] & 0xFFFFFFFFL;
        long l17 = (long)arg2[arg3 + 9] & 0xFFFFFFFFL;
        long l18 = (long)nArray3[arg3 + 10] & 0xFFFFFFFFL;
        n6 = (int)(l11 += l16 * l3);
        arg2[arg3 + 5] = n6 << 1 | n;
        n = n6 >>> 31;
        l12 &= 0xFFFFFFFFL;
        l14 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        l18 += (l17 += ((l15 += ((l14 += ((l12 += (l11 >>> 32) + l16 * l7) >>> 32) + l16 * l) >>> 32) + l16 * l10) >>> 32) + l16 * l13) >>> 32;
        l17 &= 0xFFFFFFFFL;
        long l19 = (long)arg0[arg1 + 6] & 0xFFFFFFFFL;
        long l20 = (long)nArray[arg3 + 11] & 0xFFFFFFFFL;
        long l21 = (long)arg2[arg3 + 12] & 0xFFFFFFFFL;
        n6 = (int)(l12 += l19 * l3);
        nArray2[arg3 + 6] = n6 << 1 | n;
        n = n6 >>> 31;
        l21 += (l20 += ((l18 += ((l17 += ((l15 += ((l14 += (l12 >>> 32) + l19 * l7) >>> 32) + l19 * l) >>> 32) + l19 * l10) >>> 32) + l19 * l13) >>> 32) + l19 * l16) >>> 32;
        n6 = (int)l14;
        nArray[arg3 + 7] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l15;
        nArray2[arg3 + 8] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l17;
        nArray[arg3 + 9] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l18;
        nArray2[arg3 + 10] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l20;
        nArray[arg3 + 11] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l21;
        nArray2[arg3 + 12] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = nArray[arg3 + 13] + (int)(l21 >> 32);
        nArray2[arg3 + 13] = n6 << 1 | n;
    }

    public static void cfr_renamed_1643(int[] nArray) {
        arg0[0] = 0;
        arg0[1] = 0;
        arg0[2] = 0;
        arg0[3] = 0;
        arg0[4] = 0;
        arg0[5] = 0;
        arg0[6] = 0;
    }

    public static int cfr_renamed_1629(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg0[arg1 + 0] = (int)l;
        long l2 = l;
        arg2[arg3 + 0] = (int)l2;
        l = l2 >>> 32;
        arg0[arg1 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        nArray[arg3 + 1] = (int)l;
        l >>>= 32;
        arg0[arg1 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        nArray2[arg3 + 2] = (int)l;
        l >>>= 32;
        arg0[arg1 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        nArray[arg3 + 3] = (int)l;
        l >>>= 32;
        arg0[arg1 + 4] = (int)(l += ((long)arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 4] & 0xFFFFFFFFL));
        nArray2[arg3 + 4] = (int)l;
        l >>>= 32;
        arg0[arg1 + 5] = (int)(l += ((long)arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 5] & 0xFFFFFFFFL));
        arg2[arg3 + 5] = (int)l;
        l >>>= 32;
        arg0[arg1 + 6] = (int)(l += ((long)arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 6] & 0xFFFFFFFFL));
        arg2[arg3 + 6] = (int)l;
        return (int)(l >>>= 32);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] nArray = sprkjb.cfr_renamed_1631();
        int n = 0;
        BigInteger bigInteger = arg0;
        while (bigInteger.signum() != 0) {
            BigInteger bigInteger2 = arg0;
            nArray[++n] = bigInteger2.intValue();
            bigInteger = bigInteger2.shiftRight(32);
        }
        return nArray;
    }

    public static int cfr_renamed_1647(int arg0, int[] arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg1[n] & 0xFFFFFFFFL);
            arg2[arg3 + n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < 7);
        return (int)l;
    }

    public static boolean cfr_renamed_1632(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        boolean bl = sprkjb.cfr_renamed_1639(arg0, arg1, arg2, arg3);
        if (bl) {
            sprkjb.cfr_renamed_1640(arg0, arg1, arg2, arg3, arg4, arg5);
            return bl;
        }
        sprkjb.cfr_renamed_1640(arg2, arg3, arg0, arg1, arg4, arg5);
        return bl;
    }

    public static int cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + ((long)arg1[0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[0] = (int)l;
        l >>>= 32;
        arg2[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[4] = (int)(l += ((long)arg0[4] & 0xFFFFFFFFL) + ((long)arg1[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += ((long)arg0[5] & 0xFFFFFFFFL) + ((long)arg1[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[6] = (int)(l += ((long)arg0[6] & 0xFFFFFFFFL) + ((long)arg1[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1656(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg2[0] & 0xFFFFFFFFL) - ((long)arg0[0] & 0xFFFFFFFFL) - ((long)arg1[0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[0] = (int)l;
        l >>= 32;
        arg2[1] = (int)(l += ((long)arg2[1] & 0xFFFFFFFFL) - ((long)arg0[1] & 0xFFFFFFFFL) - ((long)arg1[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[2] = (int)(l += ((long)arg2[2] & 0xFFFFFFFFL) - ((long)arg0[2] & 0xFFFFFFFFL) - ((long)arg1[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[3] = (int)(l += ((long)arg2[3] & 0xFFFFFFFFL) - ((long)arg0[3] & 0xFFFFFFFFL) - ((long)arg1[3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[4] = (int)(l += ((long)arg2[4] & 0xFFFFFFFFL) - ((long)arg0[4] & 0xFFFFFFFFL) - ((long)arg1[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[5] = (int)(l += ((long)arg2[5] & 0xFFFFFFFFL) - ((long)arg0[5] & 0xFFFFFFFFL) - ((long)arg1[5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[6] = (int)(l += ((long)arg2[6] & 0xFFFFFFFFL) - ((long)arg0[6] & 0xFFFFFFFFL) - ((long)arg1[6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int[] cfr_renamed_1631() {
        return new int[7];
    }

    public static int cfr_renamed_1663(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + ((long)arg1[0] & 0xFFFFFFFFL) + ((long)arg2[0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[0] = (int)l;
        l >>>= 32;
        arg2[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL) + ((long)arg2[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL) + ((long)arg2[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL) + ((long)arg2[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[4] = (int)(l += ((long)arg0[4] & 0xFFFFFFFFL) + ((long)arg1[4] & 0xFFFFFFFFL) + ((long)arg2[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += ((long)arg0[5] & 0xFFFFFFFFL) + ((long)arg1[5] & 0xFFFFFFFFL) + ((long)arg2[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[6] = (int)(l += ((long)arg0[6] & 0xFFFFFFFFL) + ((long)arg1[6] & 0xFFFFFFFFL) + ((long)arg2[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1653(int[] nArray, int[] nArray2) {
        int[] arg0;
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

    public static int cfr_renamed_1641(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) - ((long)arg1[0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[0] = (int)l;
        l >>= 32;
        arg2[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) - ((long)arg1[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) - ((long)arg1[2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) - ((long)arg1[3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[4] = (int)(l += ((long)arg0[4] & 0xFFFFFFFFL) - ((long)arg1[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[5] = (int)(l += ((long)arg0[5] & 0xFFFFFFFFL) - ((long)arg1[5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[6] = (int)(l += ((long)arg0[6] & 0xFFFFFFFFL) - ((long)arg1[6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int cfr_renamed_1658(int arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        arg2[0] = (int)(l += l2 * ((long)arg2[0] & 0xFFFFFFFFL) + ((long)arg1[0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[1] = (int)(l += l2 * ((long)arg2[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[2] = (int)(l += l2 * ((long)arg2[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += l2 * ((long)arg2[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[4] = (int)(l += l2 * ((long)arg2[4] & 0xFFFFFFFFL) + ((long)arg1[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += l2 * ((long)arg2[5] & 0xFFFFFFFFL) + ((long)arg1[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[6] = (int)(l += l2 * ((long)arg2[6] & 0xFFFFFFFFL) + ((long)arg1[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1662(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 1;
        }
        int n = arg1 >> 5;
        if (n < 0 || n >= 7) {
            return 0;
        }
        int n2 = arg1 & 0x1F;
        return arg0[n] >>> n2 & 1;
    }
}


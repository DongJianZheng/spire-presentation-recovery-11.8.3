/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;

public abstract class sprinh {
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    public static long[] cfr_renamed_8536() {
        return new long[6];
    }

    public static void cfr_renamed_1643(int[] nArray) {
        arg0[0] = 0;
        arg0[1] = 0;
        arg0[2] = 0;
        arg0[3] = 0;
        arg0[4] = 0;
        arg0[5] = 0;
    }

    public static int cfr_renamed_1664(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        l = 0L + (((long)arg2[arg3 + 0] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        arg2[arg3 + 0] = (int)l;
        l >>= 32;
        arg2[arg3 + 1] = (int)(l += ((long)arg2[arg3 + 1] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg3 + 2] = (int)(l += ((long)arg2[arg3 + 2] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[arg3 + 3] = (int)(l += ((long)arg2[arg3 + 3] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 3] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[arg3 + 4] = (int)(l += ((long)arg2[arg3 + 4] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[arg3 + 5] = (int)(l += ((long)arg2[arg3 + 5] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 5] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int cfr_renamed_1656(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg2[0] & 0xFFFFFFFFL) - ((long)arg0[0] & 0xFFFFFFFFL) - ((long)arg1[0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        arg2[0] = (int)l;
        l >>= 32;
        arg2[1] = (int)(l += ((long)arg2[1] & 0xFFFFFFFFL) - ((long)arg0[1] & 0xFFFFFFFFL) - ((long)arg1[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[2] = (int)(l += ((long)arg2[2] & 0xFFFFFFFFL) - ((long)arg0[2] & 0xFFFFFFFFL) - ((long)arg1[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[3] = (int)(l += ((long)arg2[3] & 0xFFFFFFFFL) - ((long)arg0[3] & 0xFFFFFFFFL) - ((long)arg1[3] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[4] = (int)(l += ((long)arg2[4] & 0xFFFFFFFFL) - ((long)arg0[4] & 0xFFFFFFFFL) - ((long)arg1[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[5] = (int)(l += ((long)arg2[5] & 0xFFFFFFFFL) - ((long)arg0[5] & 0xFFFFFFFFL) - ((long)arg1[5] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
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
        return (int)(l >>>= 32);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8538(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        arg1[0] = arg0[0];
        v0[1] = arg0[1];
        v0[2] = arg0[2];
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5 << 1;
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

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] nArray = sprinh.cfr_renamed_1631();
        int n2 = n = 0;
        while (n2 < 6) {
            nArray[n++] = arg0.intValue();
            arg0 = arg0.shiftRight(32);
            n2 = n;
        }
        return nArray;
    }

    public static boolean cfr_renamed_8540(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 3) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        long l;
        long l2;
        long l3 = (long)arg0[0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 5;
        int n3 = 12;
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
        long l7 = l2;
        arg1[0] = (int)l7;
        n = (int)(l7 >>> 32) & 1;
        long l8 = (long)arg0[1] & 0xFFFFFFFFL;
        l2 = (long)arg1[2] & 0xFFFFFFFFL;
        int n5 = (int)(l6 += l8 * l3);
        nArray5[1] = n5 << 1 | n;
        n = n5 >>> 31;
        l2 += l6 >>> 32;
        l = (long)arg0[2] & 0xFFFFFFFFL;
        long l9 = (long)arg1[3] & 0xFFFFFFFFL;
        long l10 = (long)nArray5[4] & 0xFFFFFFFFL;
        n5 = (int)(l2 += l * l3);
        nArray4[2] = n5 << 1 | n;
        n = n5 >>> 31;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)arg0[3] & 0xFFFFFFFFL;
        long l12 = ((long)arg1[5] & 0xFFFFFFFFL) + ((l10 += (l9 += (l2 >>> 32) + l * l8) >>> 32) >>> 32);
        l10 &= 0xFFFFFFFFL;
        long l13 = ((long)nArray4[6] & 0xFFFFFFFFL) + (l12 >>> 32);
        l12 &= 0xFFFFFFFFL;
        n5 = (int)(l9 += l11 * l3);
        nArray3[3] = n5 << 1 | n;
        n = n5 >>> 31;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        long l14 = (long)arg0[4] & 0xFFFFFFFFL;
        long l15 = ((long)arg1[7] & 0xFFFFFFFFL) + ((l13 += (l12 += ((l10 += (l9 >>> 32) + l11 * l8) >>> 32) + l11 * l) >>> 32) >>> 32);
        l13 &= 0xFFFFFFFFL;
        long l16 = ((long)nArray3[8] & 0xFFFFFFFFL) + (l15 >>> 32);
        l15 &= 0xFFFFFFFFL;
        n5 = (int)(l10 += l14 * l3);
        arg1[4] = n5 << 1 | n;
        n = n5 >>> 31;
        l12 &= 0xFFFFFFFFL;
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        long l17 = (long)arg0[5] & 0xFFFFFFFFL;
        long l18 = ((long)nArray[9] & 0xFFFFFFFFL) + ((l16 += (l15 += ((l13 += ((l12 += (l10 >>> 32) + l14 * l8) >>> 32) + l14 * l) >>> 32) + l14 * l11) >>> 32) >>> 32);
        l16 &= 0xFFFFFFFFL;
        long l19 = ((long)arg1[10] & 0xFFFFFFFFL) + (l18 >>> 32);
        l18 &= 0xFFFFFFFFL;
        n5 = (int)(l12 += l17 * l3);
        nArray2[5] = n5 << 1 | n;
        n = n5 >>> 31;
        l19 += (l18 += ((l16 += ((l15 += ((l13 += (l12 >>> 32) + l17 * l8) >>> 32) + l17 * l) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32;
        n5 = (int)l13;
        nArray[6] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l15;
        nArray2[7] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l16;
        nArray[8] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l18;
        nArray2[9] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l19;
        nArray[10] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = nArray2[11] + (int)(l19 >>> 32);
        nArray[11] = n5 << 1 | n;
    }

    public static int cfr_renamed_1662(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 1;
        }
        int n = arg1 >> 5;
        if (n < 0 || n >= 6) {
            return 0;
        }
        int n2 = arg1 & 0x1F;
        return arg0[n] >>> n2 & 1;
    }

    public static int[] cfr_renamed_1631() {
        return new int[6];
    }

    public static boolean cfr_renamed_1659(int[] arg0) {
        int n;
        if (arg0[0] != 1) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 6) {
            if (arg0[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_1650(int[] arg0, int[] arg1) {
        long l = 0L;
        l = 0L + (((long)arg1[0] & 0xFFFFFFFFL) - ((long)arg0[0] & 0xFFFFFFFFL));
        int[] nArray = arg1;
        arg1[0] = (int)l;
        l >>= 32;
        arg1[1] = (int)(l += ((long)arg1[1] & 0xFFFFFFFFL) - ((long)arg0[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[2] = (int)(l += ((long)arg1[2] & 0xFFFFFFFFL) - ((long)arg0[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg1[3] = (int)(l += ((long)arg1[3] & 0xFFFFFFFFL) - ((long)arg0[3] & 0xFFFFFFFFL));
        l >>= 32;
        arg1[4] = (int)(l += ((long)arg1[4] & 0xFFFFFFFFL) - ((long)arg0[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray[5] = (int)(l += ((long)arg1[5] & 0xFFFFFFFFL) - ((long)arg0[5] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static boolean cfr_renamed_8541(long[] arg0) {
        int n;
        if (arg0[0] != 1L) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 3) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static void cfr_renamed_1628(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l;
        long l2;
        long l3 = (long)arg0[arg1 + 0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 5;
        int n3 = 12;
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
        long l6 = l2;
        arg2[arg3 + 0] = (int)l6;
        n = (int)(l6 >>> 32) & 1;
        long l7 = (long)arg0[arg1 + 1] & 0xFFFFFFFFL;
        l2 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        int n6 = (int)(l5 += l7 * l3);
        nArray5[arg3 + 1] = n6 << 1 | n;
        n = n6 >>> 31;
        l2 += l5 >>> 32;
        l = (long)arg0[arg1 + 2] & 0xFFFFFFFFL;
        long l8 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l9 = (long)nArray5[arg3 + 4] & 0xFFFFFFFFL;
        n6 = (int)(l2 += l * l3);
        nArray4[arg3 + 2] = n6 << 1 | n;
        n = n6 >>> 31;
        l8 &= 0xFFFFFFFFL;
        long l10 = (long)arg0[arg1 + 3] & 0xFFFFFFFFL;
        long l11 = ((long)arg2[arg3 + 5] & 0xFFFFFFFFL) + ((l9 += (l8 += (l2 >>> 32) + l * l7) >>> 32) >>> 32);
        l9 &= 0xFFFFFFFFL;
        long l12 = ((long)nArray4[arg3 + 6] & 0xFFFFFFFFL) + (l11 >>> 32);
        l11 &= 0xFFFFFFFFL;
        n6 = (int)(l8 += l10 * l3);
        nArray3[arg3 + 3] = n6 << 1 | n;
        n = n6 >>> 31;
        l9 &= 0xFFFFFFFFL;
        l11 &= 0xFFFFFFFFL;
        long l13 = (long)arg0[arg1 + 4] & 0xFFFFFFFFL;
        long l14 = ((long)arg2[arg3 + 7] & 0xFFFFFFFFL) + ((l12 += (l11 += ((l9 += (l8 >>> 32) + l10 * l7) >>> 32) + l10 * l) >>> 32) >>> 32);
        l12 &= 0xFFFFFFFFL;
        long l15 = ((long)nArray3[arg3 + 8] & 0xFFFFFFFFL) + (l14 >>> 32);
        l14 &= 0xFFFFFFFFL;
        n6 = (int)(l9 += l13 * l3);
        arg2[arg3 + 4] = n6 << 1 | n;
        n = n6 >>> 31;
        l11 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        l14 &= 0xFFFFFFFFL;
        long l16 = (long)arg0[arg1 + 5] & 0xFFFFFFFFL;
        long l17 = ((long)nArray[arg3 + 9] & 0xFFFFFFFFL) + ((l15 += (l14 += ((l12 += ((l11 += (l9 >>> 32) + l13 * l7) >>> 32) + l13 * l) >>> 32) + l13 * l10) >>> 32) >>> 32);
        l15 &= 0xFFFFFFFFL;
        long l18 = ((long)arg2[arg3 + 10] & 0xFFFFFFFFL) + (l17 >>> 32);
        l17 &= 0xFFFFFFFFL;
        n6 = (int)(l11 += l16 * l3);
        nArray2[arg3 + 5] = n6 << 1 | n;
        n = n6 >>> 31;
        l18 += (l17 += ((l15 += ((l14 += ((l12 += (l11 >>> 32) + l16 * l7) >>> 32) + l16 * l) >>> 32) + l16 * l10) >>> 32) + l16 * l13) >>> 32;
        n6 = (int)l12;
        nArray[arg3 + 6] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l14;
        nArray2[arg3 + 7] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l15;
        nArray[arg3 + 8] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l17;
        nArray2[arg3 + 9] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l18;
        nArray[arg3 + 10] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = nArray2[arg3 + 11] + (int)(l18 >>> 32);
        nArray[arg3 + 11] = n6 << 1 | n;
    }

    public static int cfr_renamed_1665(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        long l = (long)arg1[0] & 0xFFFFFFFFL;
        long l2 = (long)arg1[1] & 0xFFFFFFFFL;
        long l3 = (long)arg1[2] & 0xFFFFFFFFL;
        long l4 = (long)arg1[3] & 0xFFFFFFFFL;
        long l5 = (long)arg1[4] & 0xFFFFFFFFL;
        long l6 = (long)arg1[5] & 0xFFFFFFFFL;
        long l7 = 0L;
        int n2 = n = 0;
        while (n2 < 6) {
            long l8 = 0L;
            long l9 = (long)arg0[n] & 0xFFFFFFFFL;
            int[] nArray = arg2;
            int[] nArray2 = arg2;
            nArray2[n + 0] = (int)(l8 += l9 * l + ((long)arg2[n + 0] & 0xFFFFFFFFL));
            l8 >>>= 32;
            nArray2[n + 1] = (int)(l8 += l9 * l2 + ((long)arg2[n + 1] & 0xFFFFFFFFL));
            l8 >>>= 32;
            arg2[n + 2] = (int)(l8 += l9 * l3 + ((long)arg2[n + 2] & 0xFFFFFFFFL));
            l8 >>>= 32;
            nArray[n + 3] = (int)(l8 += l9 * l4 + ((long)arg2[n + 3] & 0xFFFFFFFFL));
            l8 >>>= 32;
            arg2[n + 4] = (int)(l8 += l9 * l5 + ((long)arg2[n + 4] & 0xFFFFFFFFL));
            l8 >>>= 32;
            nArray[n + 5] = (int)(l8 += l9 * l6 + ((long)arg2[n + 5] & 0xFFFFFFFFL));
            nArray[n + 6] = (int)(l7 += (l8 >>>= 32) + ((long)arg2[n + 6] & 0xFFFFFFFFL));
            l7 >>>= 32;
            n2 = ++n;
        }
        return (int)l7;
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
        long l7 = 0L;
        long l8 = (long)nArray[arg1 + false] & 0xFFFFFFFFL;
        void v1 = arg4;
        void v2 = arg4;
        v2[arg5 + false] = (int)(l7 += l8 * l);
        l7 >>>= 32;
        v2[arg5 + true] = (int)(l7 += l8 * l2);
        l7 >>>= 32;
        v2[arg5 + 2] = (int)(l7 += l8 * l3);
        l7 >>>= 32;
        v1[arg5 + 3] = (int)(l7 += l8 * l4);
        l7 >>>= 32;
        v1[arg5 + 4] = (int)(l7 += l8 * l5);
        l7 >>>= 32;
        v1[arg5 + 5] = (int)(l7 += l8 * l6);
        v1[arg5 + 6] = (int)(l7 >>>= 32);
        int n5 = n4 = 1;
        while (n5 < 6) {
            void arg5;
            int[] arg0;
            long l9 = 0L;
            long l10 = (long)arg0[arg1 + n4] & 0xFFFFFFFFL;
            void v4 = arg4;
            void v5 = arg4;
            v5[arg5 + false] = (int)(l9 += l10 * l + ((long)arg4[++arg5 + false] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v5[arg5 + true] = (int)(l9 += l10 * l2 + ((long)arg4[arg5 + true] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v5[arg5 + 2] = (int)(l9 += l10 * l3 + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v4[arg5 + 3] = (int)(l9 += l10 * l4 + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v4[arg5 + 4] = (int)(l9 += l10 * l5 + ((long)arg4[arg5 + 4] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v4[arg5 + 5] = (int)(l9 += l10 * l6 + ((long)arg4[arg5 + 5] & 0xFFFFFFFFL));
            v4[arg5 + 6] = (int)(l9 >>>= 32);
            n5 = ++n4;
        }
    }

    public static boolean cfr_renamed_1649(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 5;
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

    public static int cfr_renamed_1629(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        arg0[arg1 + 0] = (int)l;
        long l2 = l;
        arg2[arg3 + 0] = (int)l2;
        l = l2 >>> 32;
        arg0[arg1 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        nArray[arg3 + 1] = (int)l;
        l >>>= 32;
        arg0[arg1 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        arg2[arg3 + 2] = (int)l;
        l >>>= 32;
        arg0[arg1 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        nArray[arg3 + 3] = (int)l;
        l >>>= 32;
        arg0[arg1 + 4] = (int)(l += ((long)arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 4] & 0xFFFFFFFFL));
        arg2[arg3 + 4] = (int)l;
        l >>>= 32;
        arg0[arg1 + 5] = (int)(l += ((long)arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 5] & 0xFFFFFFFFL));
        arg2[arg3 + 5] = (int)l;
        return (int)(l >>>= 32);
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
        return (int)(l >>>= 32);
    }

    public static boolean cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 6) {
            if (arg0[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
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
        return (int)(l >>= 32);
    }

    public static boolean cfr_renamed_1648(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 5;
        while (n2 >= 0) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    public static int[] cfr_renamed_1633() {
        return new int[12];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8546(int[] nArray, int n, int[] nArray2, int n2) {
        void arg1;
        int[] arg0;
        void arg3;
        void arg2;
        void v0 = arg2;
        void v1 = arg3;
        void v2 = arg2;
        void v3 = arg3;
        arg2[v3 + false] = arg0[arg1 + false];
        v2[v3 + true] = arg0[arg1 + true];
        v2[arg3 + 2] = arg0[arg1 + 2];
        arg2[v1 + 3] = arg0[arg1 + 3];
        v0[v1 + 4] = arg0[arg1 + 4];
        v0[n2 + 5] = arg0[arg1 + 5];
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
        return sprvih.cfr_renamed_1645(6, arg2, arg3, 3);
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
        v2[0] = arg0[0];
        v2[1] = arg0[1];
        v1[2] = arg0[2];
        v1[3] = arg0[3];
        v0[4] = arg0[4];
        v0[5] = arg0[5];
    }

    public static long[] cfr_renamed_8534() {
        return new long[3];
    }

    public static boolean cfr_renamed_1632(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        boolean bl = sprinh.cfr_renamed_1639(arg0, arg1, arg2, arg3);
        if (bl) {
            sprinh.cfr_renamed_1640(arg0, arg1, arg2, arg3, arg4, arg5);
            return bl;
        }
        sprinh.cfr_renamed_1640(arg2, arg3, arg0, arg1, arg4, arg5);
        return bl;
    }

    public static boolean cfr_renamed_1639(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n;
        int n2 = n = 5;
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

    public static int cfr_renamed_1669(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        int n;
        long l = (long)arg2[arg3 + 0] & 0xFFFFFFFFL;
        long l2 = (long)arg2[arg3 + 1] & 0xFFFFFFFFL;
        long l3 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        long l4 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l5 = (long)arg2[arg3 + 4] & 0xFFFFFFFFL;
        long l6 = (long)arg2[arg3 + 5] & 0xFFFFFFFFL;
        long l7 = 0L;
        int n2 = n = 0;
        while (n2 < 6) {
            long l8 = 0L;
            long l9 = (long)arg0[arg1 + n] & 0xFFFFFFFFL;
            int[] nArray = arg4;
            int[] nArray2 = arg4;
            nArray2[arg5 + 0] = (int)(l8 += l9 * l + ((long)arg4[arg5 + 0] & 0xFFFFFFFFL));
            l8 >>>= 32;
            nArray2[arg5 + 1] = (int)(l8 += l9 * l2 + ((long)arg4[arg5 + 1] & 0xFFFFFFFFL));
            l8 >>>= 32;
            arg4[arg5 + 2] = (int)(l8 += l9 * l3 + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
            l8 >>>= 32;
            nArray[arg5 + 3] = (int)(l8 += l9 * l4 + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
            l8 >>>= 32;
            arg4[arg5 + 4] = (int)(l8 += l9 * l5 + ((long)arg4[arg5 + 4] & 0xFFFFFFFFL));
            l8 >>>= 32;
            nArray[arg5 + 5] = (int)(l8 += l9 * l6 + ((long)arg4[arg5 + 5] & 0xFFFFFFFFL));
            nArray[arg5 + 6] = (int)(l7 += (l8 >>>= 32) + ((long)arg4[arg5 + 6] & 0xFFFFFFFFL));
            ++arg5;
            l7 >>>= 32;
            n2 = ++n;
        }
        return (int)l7;
    }

    public static int cfr_renamed_1670(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
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
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1647(int arg0, int[] arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg1[n] & 0xFFFFFFFFL);
            arg2[arg3 + n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < 6);
        return (int)l;
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
        return l += l8;
    }

    public static BigInteger cfr_renamed_1651(int[] arg0) {
        int n;
        byte[] byArray = new byte[24];
        int n2 = n = 0;
        while (n2 < 6) {
            int n3 = arg0[n];
            if (n3 != 0) {
                sprpxe.cfr_renamed_442(n3, byArray, 5 - n << 2);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
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
        return sprvih.cfr_renamed_1645(6, arg2, arg3, 3);
    }

    public static long[] cfr_renamed_8539(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] lArray = sprinh.cfr_renamed_8534();
        int n2 = n = 0;
        while (n2 < 3) {
            lArray[n++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
            n2 = n;
        }
        return lArray;
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
        arg2[v1 + false] = arg0[arg1 + false];
        v0[v1 + true] = arg0[arg1 + true];
        v0[n2 + 2] = arg0[arg1 + 2];
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
        long l7 = 0L;
        long l8 = (long)nArray[0] & 0xFFFFFFFFL;
        void v1 = arg2;
        void v2 = arg2;
        v2[0] = (int)(l7 += l8 * l);
        l7 >>>= 32;
        v2[1] = (int)(l7 += l8 * l2);
        l7 >>>= 32;
        v2[2] = (int)(l7 += l8 * l3);
        l7 >>>= 32;
        v1[3] = (int)(l7 += l8 * l4);
        l7 >>>= 32;
        v1[4] = (int)(l7 += l8 * l5);
        l7 >>>= 32;
        v1[5] = (int)(l7 += l8 * l6);
        v1[6] = (int)(l7 >>>= 32);
        int n2 = n = 1;
        while (n2 < 6) {
            int[] arg0;
            long l9 = 0L;
            long l10 = (long)arg0[n] & 0xFFFFFFFFL;
            void v4 = arg2;
            void v5 = arg2;
            v5[n + 0] = (int)(l9 += l10 * l + ((long)arg2[n + 0] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v5[n + 1] = (int)(l9 += l10 * l2 + ((long)arg2[n + 1] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v5[n + 2] = (int)(l9 += l10 * l3 + ((long)arg2[n + 2] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v4[n + 3] = (int)(l9 += l10 * l4 + ((long)arg2[n + 3] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v4[n + 4] = (int)(l9 += l10 * l5 + ((long)arg2[n + 4] & 0xFFFFFFFFL));
            l9 >>>= 32;
            v4[n + 5] = (int)(l9 += l10 * l6 + ((long)arg2[n + 5] & 0xFFFFFFFFL));
            int n3 = n + 6;
            v4[n3] = (int)(l9 >>>= 32);
            n2 = ++n;
        }
    }

    public static boolean cfr_renamed_8535(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 2;
        while (n2 >= 0) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
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
        return (int)(l >>= 32);
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
        return (int)(l >>>= 32);
    }

    public static BigInteger cfr_renamed_8542(long[] arg0) {
        int n;
        byte[] byArray = new byte[24];
        int n2 = n = 0;
        while (n2 < 3) {
            long l = arg0[n];
            if (l != 0L) {
                sprpxe.cfr_renamed_450(l, byArray, 2 - n << 3);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
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
        return sprvih.cfr_renamed_1645(6, arg2, arg3, 4);
    }
}


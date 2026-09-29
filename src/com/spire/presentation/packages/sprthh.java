/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;

public abstract class sprthh {
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    public static int cfr_renamed_1640(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        arg4[arg5 + 0] = (int)l;
        l >>= 32;
        arg4[arg5 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>= 32;
        arg4[arg5 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        l >>= 32;
        arg4[arg5 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) - ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int cfr_renamed_1630(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long l = (long)arg4 & 0xFFFFFFFFL;
        arg2[arg3 + 0] = (int)(l += ((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
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
        long l5 = 0L;
        long l6 = (long)nArray[arg1 + false] & 0xFFFFFFFFL;
        void v1 = arg4;
        long l7 = l5 += l6 * l;
        arg4[arg5 + false] = (int)l7;
        l5 = l7 >>> 32;
        v1[arg5 + true] = (int)(l5 += l6 * l2);
        l5 >>>= 32;
        v1[arg5 + 2] = (int)(l5 += l6 * l3);
        l5 >>>= 32;
        v1[arg5 + 3] = (int)(l5 += l6 * l4);
        v1[arg5 + 4] = (int)(l5 >>>= 32);
        int n5 = n4 = 1;
        while (n5 < 4) {
            void arg5;
            int[] arg0;
            long l8 = 0L;
            long l9 = (long)arg0[arg1 + n4] & 0xFFFFFFFFL;
            void v4 = arg4;
            long l10 = l8 += l9 * l + ((long)arg4[++arg5 + false] & 0xFFFFFFFFL);
            arg4[arg5 + false] = (int)l10;
            l8 = l10 >>> 32;
            v4[arg5 + true] = (int)(l8 += l9 * l2 + ((long)arg4[arg5 + true] & 0xFFFFFFFFL));
            l8 >>>= 32;
            v4[arg5 + 2] = (int)(l8 += l9 * l3 + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
            l8 >>>= 32;
            v4[arg5 + 3] = (int)(l8 += l9 * l4 + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
            v4[arg5 + 4] = (int)(l8 >>>= 32);
            n5 = ++n4;
        }
    }

    public static int cfr_renamed_1670(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        arg3[arg4 + 0] = (int)(l += l2 * ((long)arg1[arg2 + 0] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg3[arg4 + 1] = (int)(l += l2 * ((long)arg1[arg2 + 1] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg3[arg4 + 2] = (int)(l += l2 * ((long)arg1[arg2 + 2] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        arg3[arg4 + 3] = (int)(l += l2 * ((long)arg1[arg2 + 3] & 0xFFFFFFFFL) + ((long)arg3[arg4 + 3] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1641(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) - ((long)arg1[0] & 0xFFFFFFFFL));
        arg2[0] = (int)l;
        l >>= 32;
        arg2[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) - ((long)arg1[1] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) - ((long)arg1[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) - ((long)arg1[3] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static boolean cfr_renamed_1648(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 3;
        while (n2 >= 0) {
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    public static int cfr_renamed_8547(int arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        long l3 = (long)arg1 & 0xFFFFFFFFL;
        arg2[arg3 + 0] = (int)(l += l3 * l2 + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[arg3 + 1] = (int)(l += (long)arg2[arg3 + 1] & 0xFFFFFFFFL);
        if ((l >>>= 32) == 0L) {
            return 0;
        }
        return sprvih.cfr_renamed_1645(4, arg2, arg3, 2);
    }

    public static boolean cfr_renamed_1639(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n;
        int n2 = n = 3;
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
        arg2[arg3 + false] = arg0[arg1 + false];
        arg2[v1 + true] = arg0[arg1 + true];
        v0[v1 + 2] = arg0[arg1 + 2];
        v0[n2 + 3] = arg0[arg1 + 3];
    }

    public static boolean cfr_renamed_1632(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        boolean bl = sprthh.cfr_renamed_1639(arg0, arg1, arg2, arg3);
        if (bl) {
            sprthh.cfr_renamed_1640(arg0, arg1, arg2, arg3, arg4, arg5);
            return bl;
        }
        sprthh.cfr_renamed_1640(arg2, arg3, arg0, arg1, arg4, arg5);
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8537(long[] lArray, int n, long[] lArray2, int n2) {
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        v0[arg3 + false] = arg0[arg1 + false];
        v0[n2 + 1] = arg0[arg1 + true];
    }

    public static boolean cfr_renamed_8540(long[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 2) {
            if (arg0[n] != 0L) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static int cfr_renamed_1668(int[] arg0, int[] arg1) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + ((long)arg1[0] & 0xFFFFFFFFL));
        arg1[0] = (int)l;
        l >>>= 32;
        arg1[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg1[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL));
        l >>>= 32;
        arg1[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static long[] cfr_renamed_8534() {
        return new long[2];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8538(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        v0[0] = arg0[0];
        v0[1] = arg0[1];
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
        long l5 = 0L;
        long l6 = (long)nArray[0] & 0xFFFFFFFFL;
        void v1 = arg2;
        long l7 = l5 += l6 * l;
        arg2[0] = (int)l7;
        l5 = l7 >>> 32;
        v1[1] = (int)(l5 += l6 * l2);
        l5 >>>= 32;
        v1[2] = (int)(l5 += l6 * l3);
        l5 >>>= 32;
        v1[3] = (int)(l5 += l6 * l4);
        v1[4] = (int)(l5 >>>= 32);
        int n2 = n = 1;
        while (n2 < 4) {
            int[] arg0;
            long l8 = 0L;
            long l9 = (long)arg0[n] & 0xFFFFFFFFL;
            void v4 = arg2;
            long l10 = l8 += l9 * l + ((long)arg2[n + 0] & 0xFFFFFFFFL);
            arg2[n + 0] = (int)l10;
            l8 = l10 >>> 32;
            v4[n + 1] = (int)(l8 += l9 * l2 + ((long)arg2[n + 1] & 0xFFFFFFFFL));
            l8 >>>= 32;
            v4[n + 2] = (int)(l8 += l9 * l3 + ((long)arg2[n + 2] & 0xFFFFFFFFL));
            l8 >>>= 32;
            v4[n + 3] = (int)(l8 += l9 * l4 + ((long)arg2[n + 3] & 0xFFFFFFFFL));
            int n3 = n + 4;
            v4[n3] = (int)(l8 >>>= 32);
            n2 = ++n;
        }
    }

    public static void cfr_renamed_1643(int[] nArray) {
        arg0[0] = 0;
        arg0[1] = 0;
        arg0[2] = 0;
        arg0[3] = 0;
    }

    public static int[] cfr_renamed_1633() {
        return new int[8];
    }

    public static boolean cfr_renamed_8535(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 1;
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
        while (n2 < 4) {
            if (arg0[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
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
        return l += l6;
    }

    public static int cfr_renamed_1665(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        long l = (long)arg1[0] & 0xFFFFFFFFL;
        long l2 = (long)arg1[1] & 0xFFFFFFFFL;
        long l3 = (long)arg1[2] & 0xFFFFFFFFL;
        long l4 = (long)arg1[3] & 0xFFFFFFFFL;
        long l5 = 0L;
        int n2 = n = 0;
        while (n2 < 4) {
            long l6 = 0L;
            long l7 = (long)arg0[n] & 0xFFFFFFFFL;
            int[] nArray = arg2;
            long l8 = l6 += l7 * l + ((long)arg2[n + 0] & 0xFFFFFFFFL);
            arg2[n + 0] = (int)l8;
            l6 = l8 >>> 32;
            nArray[n + 1] = (int)(l6 += l7 * l2 + ((long)arg2[n + 1] & 0xFFFFFFFFL));
            l6 >>>= 32;
            arg2[n + 2] = (int)(l6 += l7 * l3 + ((long)arg2[n + 2] & 0xFFFFFFFFL));
            l6 >>>= 32;
            nArray[n + 3] = (int)(l6 += l7 * l4 + ((long)arg2[n + 3] & 0xFFFFFFFFL));
            nArray[n + 4] = (int)(l5 += (l6 >>>= 32) + ((long)arg2[n + 4] & 0xFFFFFFFFL));
            l5 >>>= 32;
            n2 = ++n;
        }
        return (int)l5;
    }

    public static boolean cfr_renamed_1649(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 3;
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

    public static int cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + ((long)arg1[0] & 0xFFFFFFFFL));
        arg2[0] = (int)l;
        l >>>= 32;
        arg2[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int cfr_renamed_1664(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        l = 0L + (((long)arg2[arg3 + 0] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        nArray[arg3 + 0] = (int)l;
        l >>= 32;
        nArray[arg3 + 1] = (int)(l += ((long)arg2[arg3 + 1] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 1] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[arg3 + 2] = (int)(l += ((long)arg2[arg3 + 2] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[arg3 + 3] = (int)(l += ((long)arg2[arg3 + 3] & 0xFFFFFFFFL) - ((long)arg0[arg1 + 3] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static void cfr_renamed_1628(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l;
        long l2;
        long l3 = (long)arg0[arg1 + 0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 3;
        int n3 = 8;
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
        long l6 = l2;
        arg2[arg3 + 0] = (int)l6;
        n = (int)(l6 >>> 32) & 1;
        long l7 = (long)arg0[arg1 + 1] & 0xFFFFFFFFL;
        l2 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        int n6 = (int)(l5 += l7 * l3);
        nArray3[arg3 + 1] = n6 << 1 | n;
        n = n6 >>> 31;
        l2 += l5 >>> 32;
        l = (long)arg0[arg1 + 2] & 0xFFFFFFFFL;
        long l8 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l9 = (long)nArray3[arg3 + 4] & 0xFFFFFFFFL;
        n6 = (int)(l2 += l * l3);
        arg2[arg3 + 2] = n6 << 1 | n;
        n = n6 >>> 31;
        l8 &= 0xFFFFFFFFL;
        long l10 = (long)arg0[arg1 + 3] & 0xFFFFFFFFL;
        long l11 = ((long)nArray[arg3 + 5] & 0xFFFFFFFFL) + ((l9 += (l8 += (l2 >>> 32) + l * l7) >>> 32) >>> 32);
        l9 &= 0xFFFFFFFFL;
        long l12 = ((long)arg2[arg3 + 6] & 0xFFFFFFFFL) + (l11 >>> 32);
        l11 &= 0xFFFFFFFFL;
        n6 = (int)(l8 += l10 * l3);
        nArray2[arg3 + 3] = n6 << 1 | n;
        n = n6 >>> 31;
        l12 += (l11 += ((l9 += (l8 >>> 32) + l10 * l7) >>> 32) + l10 * l) >>> 32;
        n6 = (int)l9;
        nArray[arg3 + 4] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l11;
        nArray2[arg3 + 5] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = (int)l12;
        nArray[arg3 + 6] = n6 << 1 | n;
        n = n6 >>> 31;
        n6 = nArray2[arg3 + 7] + (int)(l12 >>> 32);
        nArray[arg3 + 7] = n6 << 1 | n;
    }

    public static boolean cfr_renamed_8541(long[] arg0) {
        int n;
        if (arg0[0] != 1L) {
            return false;
        }
        int n2 = n = 1;
        while (n2 < 2) {
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
    public static void cfr_renamed_1653(int[] nArray, int[] nArray2) {
        int[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = arg0[0];
        v1[1] = arg0[1];
        v0[2] = arg0[2];
        v0[3] = arg0[3];
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
        return sprvih.cfr_renamed_1645(4, arg2, arg3, 3);
    }

    public static long[] cfr_renamed_8539(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] lArray = sprthh.cfr_renamed_8534();
        int n2 = n = 0;
        while (n2 < 2) {
            lArray[n++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
            n2 = n;
        }
        return lArray;
    }

    public static long[] cfr_renamed_8536() {
        return new long[4];
    }

    public static int cfr_renamed_1650(int[] arg0, int[] arg1) {
        long l = 0L;
        l = 0L + (((long)arg1[0] & 0xFFFFFFFFL) - ((long)arg0[0] & 0xFFFFFFFFL));
        int[] nArray = arg1;
        nArray[0] = (int)l;
        l >>= 32;
        nArray[1] = (int)(l += ((long)arg1[1] & 0xFFFFFFFFL) - ((long)arg0[1] & 0xFFFFFFFFL));
        l >>= 32;
        arg1[2] = (int)(l += ((long)arg1[2] & 0xFFFFFFFFL) - ((long)arg0[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg1[3] = (int)(l += ((long)arg1[3] & 0xFFFFFFFFL) - ((long)arg0[3] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int cfr_renamed_1662(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 1;
        }
        int n = arg1 >> 5;
        if (n < 0 || n >= 4) {
            return 0;
        }
        int n2 = arg1 & 0x1F;
        return arg0[n] >>> n2 & 1;
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        long l;
        long l2;
        long l3 = (long)arg0[0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 3;
        int n3 = 8;
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
        long l7 = l2;
        arg1[0] = (int)l7;
        n = (int)(l7 >>> 32) & 1;
        long l8 = (long)arg0[1] & 0xFFFFFFFFL;
        l2 = (long)arg1[2] & 0xFFFFFFFFL;
        int n5 = (int)(l6 += l8 * l3);
        nArray3[1] = n5 << 1 | n;
        n = n5 >>> 31;
        l2 += l6 >>> 32;
        l = (long)arg0[2] & 0xFFFFFFFFL;
        long l9 = (long)arg1[3] & 0xFFFFFFFFL;
        long l10 = (long)nArray3[4] & 0xFFFFFFFFL;
        n5 = (int)(l2 += l * l3);
        arg1[2] = n5 << 1 | n;
        n = n5 >>> 31;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)arg0[3] & 0xFFFFFFFFL;
        long l12 = ((long)nArray[5] & 0xFFFFFFFFL) + ((l10 += (l9 += (l2 >>> 32) + l * l8) >>> 32) >>> 32);
        l10 &= 0xFFFFFFFFL;
        long l13 = ((long)arg1[6] & 0xFFFFFFFFL) + (l12 >>> 32);
        l12 &= 0xFFFFFFFFL;
        n5 = (int)(l9 += l11 * l3);
        nArray2[3] = n5 << 1 | n;
        n = n5 >>> 31;
        l13 += (l12 += ((l10 += (l9 >>> 32) + l11 * l8) >>> 32) + l11 * l) >>> 32;
        n5 = (int)l10;
        nArray[4] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)(l12 &= 0xFFFFFFFFL);
        nArray2[5] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = (int)l13;
        nArray[6] = n5 << 1 | n;
        n = n5 >>> 31;
        n5 = nArray2[7] + (int)(l13 >>> 32);
        nArray[7] = n5 << 1 | n;
    }

    public static int cfr_renamed_1656(int[] arg0, int[] arg1, int[] arg2) {
        long l = 0L;
        l = 0L + (((long)arg2[0] & 0xFFFFFFFFL) - ((long)arg0[0] & 0xFFFFFFFFL) - ((long)arg1[0] & 0xFFFFFFFFL));
        int[] nArray = arg2;
        nArray[0] = (int)l;
        l >>= 32;
        nArray[1] = (int)(l += ((long)arg2[1] & 0xFFFFFFFFL) - ((long)arg0[1] & 0xFFFFFFFFL) - ((long)arg1[1] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[2] = (int)(l += ((long)arg2[2] & 0xFFFFFFFFL) - ((long)arg0[2] & 0xFFFFFFFFL) - ((long)arg1[2] & 0xFFFFFFFFL));
        l >>= 32;
        arg2[3] = (int)(l += ((long)arg2[3] & 0xFFFFFFFFL) - ((long)arg0[3] & 0xFFFFFFFFL) - ((long)arg1[3] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int cfr_renamed_1647(int arg0, int[] arg1, int[] arg2, int arg3) {
        long l = 0L;
        long l2 = (long)arg0 & 0xFFFFFFFFL;
        int n = 0;
        do {
            long l3 = l += l2 * ((long)arg1[n] & 0xFFFFFFFFL);
            arg2[arg3 + n] = (int)l3;
            l = l3 >>> 32;
        } while (++n < 4);
        return (int)l;
    }

    public static BigInteger cfr_renamed_8542(long[] arg0) {
        int n;
        byte[] byArray = new byte[16];
        int n2 = n = 0;
        while (n2 < 2) {
            long l = arg0[n];
            if (l != 0L) {
                sprpxe.cfr_renamed_450(l, byArray, 1 - n << 3);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }

    public static boolean cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
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
        arg2[0] = (int)l;
        l >>>= 32;
        arg2[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + ((long)arg1[1] & 0xFFFFFFFFL) + ((long)arg2[1] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + ((long)arg1[2] & 0xFFFFFFFFL) + ((long)arg2[2] & 0xFFFFFFFFL));
        l >>>= 32;
        arg2[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + ((long)arg1[3] & 0xFFFFFFFFL) + ((long)arg2[3] & 0xFFFFFFFFL));
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
        return sprvih.cfr_renamed_1645(4, arg2, arg3, 3);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int n;
        if (arg0.signum() < 0 || arg0.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] nArray = sprthh.cfr_renamed_1631();
        int n2 = n = 0;
        while (n2 < 4) {
            nArray[n++] = arg0.intValue();
            arg0 = arg0.shiftRight(32);
            n2 = n;
        }
        return nArray;
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
        return (int)(l >>>= 32);
    }

    public static int[] cfr_renamed_1631() {
        return new int[4];
    }

    public static int cfr_renamed_1669(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        int n;
        long l = (long)arg2[arg3 + 0] & 0xFFFFFFFFL;
        long l2 = (long)arg2[arg3 + 1] & 0xFFFFFFFFL;
        long l3 = (long)arg2[arg3 + 2] & 0xFFFFFFFFL;
        long l4 = (long)arg2[arg3 + 3] & 0xFFFFFFFFL;
        long l5 = 0L;
        int n2 = n = 0;
        while (n2 < 4) {
            long l6 = 0L;
            long l7 = (long)arg0[arg1 + n] & 0xFFFFFFFFL;
            int[] nArray = arg4;
            long l8 = l6 += l7 * l + ((long)arg4[arg5 + 0] & 0xFFFFFFFFL);
            arg4[arg5 + 0] = (int)l8;
            l6 = l8 >>> 32;
            nArray[arg5 + 1] = (int)(l6 += l7 * l2 + ((long)arg4[arg5 + 1] & 0xFFFFFFFFL));
            l6 >>>= 32;
            arg4[arg5 + 2] = (int)(l6 += l7 * l3 + ((long)arg4[arg5 + 2] & 0xFFFFFFFFL));
            l6 >>>= 32;
            nArray[arg5 + 3] = (int)(l6 += l7 * l4 + ((long)arg4[arg5 + 3] & 0xFFFFFFFFL));
            nArray[arg5 + 4] = (int)(l5 += (l6 >>>= 32) + ((long)arg4[arg5 + 4] & 0xFFFFFFFFL));
            ++arg5;
            l5 >>>= 32;
            n2 = ++n;
        }
        return (int)l5;
    }

    public static int cfr_renamed_1629(int[] arg0, int arg1, int[] arg2, int arg3) {
        long l = 0L;
        l = 0L + (((long)arg0[arg1 + 0] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 0] & 0xFFFFFFFFL));
        arg0[arg1 + 0] = (int)l;
        arg2[arg3 + 0] = (int)l;
        l >>>= 32;
        arg0[arg1 + 1] = (int)(l += ((long)arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 1] & 0xFFFFFFFFL));
        arg2[arg3 + 1] = (int)l;
        l >>>= 32;
        arg0[arg1 + 2] = (int)(l += ((long)arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 2] & 0xFFFFFFFFL));
        arg2[arg3 + 2] = (int)l;
        l >>>= 32;
        arg0[arg1 + 3] = (int)(l += ((long)arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long)arg2[arg3 + 3] & 0xFFFFFFFFL));
        arg2[arg3 + 3] = (int)l;
        return (int)(l >>>= 32);
    }

    public static BigInteger cfr_renamed_1651(int[] arg0) {
        int n;
        byte[] byArray = new byte[16];
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = arg0[n];
            if (n3 != 0) {
                sprpxe.cfr_renamed_442(n3, byArray, 3 - n << 2);
            }
            n2 = ++n;
        }
        return new BigInteger(1, byArray);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxlh;

public class sprxqk {
    public static final int cfr_renamed_4 = 4;

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7206(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        void v1 = arg2;
        v1[0] = arg0[0] ^ arg1[0];
        v1[1] = arg0[1] ^ arg1[1];
        v0[2] = arg0[2] ^ arg1[2];
        v0[3] = arg0[3] ^ arg1[3];
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        long l;
        long l2;
        int n2;
        long l3 = arg0[0];
        long l4 = arg0[1];
        long l5 = arg0[2];
        long l6 = arg0[3];
        long l7 = arg1[0];
        long l8 = arg1[1];
        long l9 = arg1[2];
        long l10 = arg1[3];
        long l11 = 0L;
        long l12 = 0L;
        long l13 = 0L;
        long l14 = 0L;
        long l15 = 0L;
        int n3 = n2 = 0;
        while (n3 < 64) {
            long l16 = -(l3 & 1L);
            l3 >>>= 1;
            l11 ^= l7 & l16;
            l12 ^= l8 & l16;
            l13 ^= l9 & l16;
            l14 ^= l10 & l16;
            l2 = -(l4 & 1L);
            l4 >>>= 1;
            l12 ^= l7 & l2;
            l13 ^= l8 & l2;
            l14 ^= l9 & l2;
            l15 ^= l10 & l2;
            l = l10 >> 63;
            l10 = l10 << 1 | l9 >>> 63;
            l9 = l9 << 1 | l8 >>> 63;
            l8 = l8 << 1 | l7 >>> 63;
            l7 = l7 << 1 ^ l & 0x425L;
            n3 = ++n2;
        }
        long l17 = l10;
        l10 = l9;
        l9 = l8;
        l8 = l7 ^ l17 >>> 62 ^ l17 >>> 59 ^ l17 >>> 54;
        long l18 = l17;
        l7 = l18 ^ l18 << 2 ^ l17 << 5 ^ l17 << 10;
        int n4 = n = 0;
        while (n4 < 64) {
            l2 = -(l5 & 1L);
            l5 >>>= 1;
            l11 ^= l7 & l2;
            l12 ^= l8 & l2;
            l13 ^= l9 & l2;
            l14 ^= l10 & l2;
            l = -(l6 & 1L);
            l6 >>>= 1;
            l12 ^= l7 & l;
            l13 ^= l8 & l;
            l14 ^= l9 & l;
            l15 ^= l10 & l;
            long l19 = l10 >> 63;
            l10 = l10 << 1 | l9 >>> 63;
            l9 = l9 << 1 | l8 >>> 63;
            l8 = l8 << 1 | l7 >>> 63;
            l7 = l7 << 1 ^ l19 & 0x425L;
            n4 = ++n;
        }
        long l20 = l15;
        arg2[0] = l11 ^= l20 ^ l20 << 2 ^ l15 << 5 ^ l15 << 10;
        arg2[1] = l12 ^= l15 >>> 62 ^ l15 >>> 59 ^ l15 >>> 54;
        arg2[2] = l13;
        arg2[3] = l14;
    }

    public static void cfr_renamed_10023(long[] lArray) {
        arg0[0] = 0L;
        arg0[1] = 0L;
        arg0[2] = 0L;
        arg0[3] = 0L;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7203(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = arg0[0];
        v1[1] = arg0[1];
        v0[2] = arg0[2];
        v0[3] = arg0[3];
    }

    public static void cfr_renamed_10025(long[] lArray) {
        arg0[0] = 1L;
        arg0[1] = 0L;
        arg0[2] = 0L;
        arg0[3] = 0L;
    }

    public static void cfr_renamed_10020(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = l4 >>> 56;
        arg1[0] = l << 8 ^ l5 ^ l5 << 2 ^ l5 << 5 ^ l5 << 10;
        arg1[1] = l2 << 8 | l >>> 56;
        arg1[2] = l3 << 8 | l2 >>> 56;
        arg1[3] = l4 << 8 | l3 >>> 56;
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = new long[8];
        int n2 = n = 0;
        while (n2 < 4) {
            sprxlh.cfr_renamed_8596(arg0[n], lArray, n++ << 1);
            n2 = n;
        }
        n = 8;
        while (--n >= 4) {
            long[] lArray2 = lArray;
            long[] lArray3 = lArray;
            long l = lArray2[n];
            int n3 = n - 4;
            long l2 = l;
            lArray3[n3] = lArray3[n3] ^ (l2 ^ l2 << 2 ^ l << 5 ^ l << 10);
            int n4 = n - 4 + 1;
            lArray2[n4] = lArray2[n4] ^ (l >>> 62 ^ l >>> 59 ^ l >>> 54);
        }
        sprxqk.cfr_renamed_7203(lArray, arg1);
    }

    public static void cfr_renamed_10022(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = l4 >> 63;
        arg1[0] = l << 1 ^ l5 & 0x425L;
        arg1[1] = l2 << 1 | l >>> 63;
        arg1[2] = l3 << 1 | l2 >>> 63;
        arg1[3] = l4 << 1 | l3 >>> 63;
    }

    public static void cfr_renamed_10024(long[] lArray) {
        arg0[0] = 2L;
        arg0[1] = 0L;
        arg0[2] = 0L;
        arg0[3] = 0L;
    }

    public static boolean cfr_renamed_10021(long[] arg0, long[] arg1) {
        long l = 0L;
        l = 0L | arg0[0] ^ arg1[0];
        l |= arg0[1] ^ arg1[1];
        l |= arg0[2] ^ arg1[2];
        return (l |= arg0[3] ^ arg1[3]) == 0L;
    }
}


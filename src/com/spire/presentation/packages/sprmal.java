/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxlh;

public class sprmal {
    public static final int cfr_renamed_4 = 8;

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        long l = arg1[0];
        long l2 = arg1[1];
        long l3 = arg1[2];
        long l4 = arg1[3];
        long l5 = arg1[4];
        long l6 = arg1[5];
        long l7 = arg1[6];
        long l8 = arg1[7];
        long l9 = 0L;
        long l10 = 0L;
        long l11 = 0L;
        long l12 = 0L;
        long l13 = 0L;
        long l14 = 0L;
        long l15 = 0L;
        long l16 = 0L;
        long l17 = 0L;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3;
            long l18 = arg0[n];
            long l19 = arg0[n + 1];
            int n4 = n3 = 0;
            while (n4 < 64) {
                long l20 = -(l18 & 1L);
                l18 >>>= 1;
                l9 ^= l & l20;
                l10 ^= l2 & l20;
                l11 ^= l3 & l20;
                l12 ^= l4 & l20;
                l13 ^= l5 & l20;
                l14 ^= l6 & l20;
                l15 ^= l7 & l20;
                l16 ^= l8 & l20;
                long l21 = -(l19 & 1L);
                l19 >>>= 1;
                l10 ^= l & l21;
                l11 ^= l2 & l21;
                l12 ^= l3 & l21;
                l13 ^= l4 & l21;
                l14 ^= l5 & l21;
                l15 ^= l6 & l21;
                l16 ^= l7 & l21;
                l17 ^= l8 & l21;
                long l22 = l8 >> 63;
                l8 = l8 << 1 | l7 >>> 63;
                l7 = l7 << 1 | l6 >>> 63;
                l6 = l6 << 1 | l5 >>> 63;
                l5 = l5 << 1 | l4 >>> 63;
                l4 = l4 << 1 | l3 >>> 63;
                l3 = l3 << 1 | l2 >>> 63;
                l2 = l2 << 1 | l >>> 63;
                l = l << 1 ^ l22 & 0x125L;
                n4 = ++n3;
            }
            long l23 = l8;
            l8 = l7;
            l7 = l6;
            l6 = l5;
            l5 = l4;
            l4 = l3;
            l3 = l2;
            l2 = l ^ l23 >>> 62 ^ l23 >>> 59 ^ l23 >>> 56;
            long l24 = l23;
            l = l24 ^ l24 << 2 ^ l23 << 5 ^ l23 << 8;
            n2 = n += 2;
        }
        long l25 = l17;
        arg2[0] = l9 ^= l25 ^ l25 << 2 ^ l17 << 5 ^ l17 << 8;
        arg2[1] = l10 ^= l17 >>> 62 ^ l17 >>> 59 ^ l17 >>> 56;
        arg2[2] = l11;
        arg2[3] = l12;
        arg2[4] = l13;
        arg2[5] = l14;
        arg2[6] = l15;
        arg2[7] = l16;
    }

    public static void cfr_renamed_10023(long[] lArray) {
        arg0[0] = 0L;
        arg0[1] = 0L;
        arg0[2] = 0L;
        arg0[3] = 0L;
        arg0[4] = 0L;
        arg0[5] = 0L;
        arg0[6] = 0L;
        arg0[7] = 0L;
    }

    public static boolean cfr_renamed_10021(long[] arg0, long[] arg1) {
        long l = 0L;
        l = 0L | arg0[0] ^ arg1[0];
        l |= arg0[1] ^ arg1[1];
        l |= arg0[2] ^ arg1[2];
        l |= arg0[3] ^ arg1[3];
        l |= arg0[4] ^ arg1[4];
        l |= arg0[5] ^ arg1[5];
        l |= arg0[6] ^ arg1[6];
        return (l |= arg0[7] ^ arg1[7]) == 0L;
    }

    public static void cfr_renamed_10020(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        long l7 = arg0[6];
        long l8 = arg0[7];
        long l9 = l8 >>> 56;
        arg1[0] = l << 8 ^ l9 ^ l9 << 2 ^ l9 << 5 ^ l9 << 8;
        arg1[1] = l2 << 8 | l >>> 56;
        arg1[2] = l3 << 8 | l2 >>> 56;
        arg1[3] = l4 << 8 | l3 >>> 56;
        arg1[4] = l5 << 8 | l4 >>> 56;
        arg1[5] = l6 << 8 | l5 >>> 56;
        arg1[6] = l7 << 8 | l6 >>> 56;
        arg1[7] = l8 << 8 | l7 >>> 56;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7206(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        void v1 = arg2;
        void v2 = arg2;
        void v3 = arg2;
        v3[0] = arg0[0] ^ arg1[0];
        v3[1] = arg0[1] ^ arg1[1];
        v2[2] = arg0[2] ^ arg1[2];
        v2[3] = arg0[3] ^ arg1[3];
        v1[4] = arg0[4] ^ arg1[4];
        v1[5] = arg0[5] ^ arg1[5];
        v0[6] = arg0[6] ^ arg1[6];
        v0[7] = arg0[7] ^ arg1[7];
    }

    public static void cfr_renamed_10024(long[] lArray) {
        arg0[0] = 2L;
        arg0[1] = 0L;
        arg0[2] = 0L;
        arg0[3] = 0L;
        arg0[4] = 0L;
        arg0[5] = 0L;
        arg0[6] = 0L;
        arg0[7] = 0L;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7203(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        void v2 = arg1;
        void v3 = arg1;
        v3[0] = arg0[0];
        v3[1] = arg0[1];
        v2[2] = arg0[2];
        v2[3] = arg0[3];
        v1[4] = arg0[4];
        v1[5] = arg0[5];
        v0[6] = arg0[6];
        v0[7] = arg0[7];
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = new long[16];
        int n2 = n = 0;
        while (n2 < 8) {
            sprxlh.cfr_renamed_8596(arg0[n], lArray, n++ << 1);
            n2 = n;
        }
        n = 16;
        while (--n >= 8) {
            long[] lArray2 = lArray;
            long[] lArray3 = lArray;
            long l = lArray2[n];
            int n3 = n - 8;
            long l2 = l;
            lArray3[n3] = lArray3[n3] ^ (l2 ^ l2 << 2 ^ l << 5 ^ l << 8);
            int n4 = n - 8 + 1;
            lArray2[n4] = lArray2[n4] ^ (l >>> 62 ^ l >>> 59 ^ l >>> 56);
        }
        sprmal.cfr_renamed_7203(lArray, arg1);
    }

    public static void cfr_renamed_10022(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        long l7 = arg0[6];
        long l8 = arg0[7];
        long l9 = l8 >> 63;
        arg1[0] = l << 1 ^ l9 & 0x125L;
        arg1[1] = l2 << 1 | l >>> 63;
        arg1[2] = l3 << 1 | l2 >>> 63;
        arg1[3] = l4 << 1 | l3 >>> 63;
        arg1[4] = l5 << 1 | l4 >>> 63;
        arg1[5] = l6 << 1 | l5 >>> 63;
        arg1[6] = l7 << 1 | l6 >>> 63;
        arg1[7] = l8 << 1 | l7 >>> 63;
    }

    public static void cfr_renamed_10025(long[] lArray) {
        arg0[0] = 1L;
        arg0[1] = 0L;
        arg0[2] = 0L;
        arg0[3] = 0L;
        arg0[4] = 0L;
        arg0[5] = 0L;
        arg0[6] = 0L;
        arg0[7] = 0L;
    }
}


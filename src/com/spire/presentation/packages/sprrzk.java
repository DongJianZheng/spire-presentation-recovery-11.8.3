/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprxlh;

public abstract class sprrzk {
    public static final int cfr_renamed_0 = 4;
    private static final int cfr_renamed_1 = -520093696;
    private static final long cfr_renamed_2 = -2233785415175766016L;
    public static final int cfr_renamed_3 = 16;
    public static final int cfr_renamed_4 = 2;

    public static void cfr_renamed_3424(int[] arg0, int[] arg1) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = n4 << 31 >> 31;
        arg1[0] = n >>> 1 ^ n5 & 0xE1000000;
        arg1[1] = n2 >>> 1 | n << 31;
        arg1[2] = n3 >>> 1 | n2 << 31;
        arg1[3] = n4 >>> 1 | n3 << 31;
    }

    public static void cfr_renamed_10068(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = n++;
            arg1[n3] = arg0[n3];
            n2 = n;
        }
    }

    public static byte[] cfr_renamed_3448(int[] arg0) {
        byte[] byArray = new byte[16];
        sprpxe.cfr_renamed_5169(arg0, 0, 4, byArray, 0);
        return byArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
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

    public static void cfr_renamed_10067(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        while (--arg4 >= 0) {
            int n = arg1 + arg4;
            arg0[n] = (byte)(arg0[n] ^ arg2[arg3 + arg4]);
        }
    }

    public static int cfr_renamed_549(int[] arg0, int[] arg1) {
        int n = 0;
        n = 0 | arg0[0] ^ arg1[0];
        n |= arg0[1] ^ arg1[1];
        n |= arg0[2] ^ arg1[2];
        n |= arg0[3] ^ arg1[3];
        n = n >>> 1 | n & 1;
        return n - 1 >> 31;
    }

    public static long[] cfr_renamed_3445() {
        long[] lArray = new long[2];
        lArray[0] = Long.MIN_VALUE;
        return lArray;
    }

    public static void cfr_renamed_3426(int[] arg0, int[] arg1) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = n4 << 24;
        arg1[0] = n >>> 8 ^ n5 ^ n5 >>> 1 ^ n5 >>> 2 ^ n5 >>> 7;
        arg1[1] = n2 >>> 8 | n << 24;
        arg1[2] = n3 >>> 8 | n2 << 24;
        arg1[3] = n4 >>> 8 | n3 << 24;
    }

    public static void cfr_renamed_3430(int[] arg0, byte[] arg1) {
        sprpxe.cfr_renamed_5169(arg0, 0, 4, arg1, 0);
    }

    public static void cfr_renamed_10073(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 << 63 >> 63;
        arg1[0] = l >>> 1 ^ l3 & 0xE100000000000000L;
        arg1[1] = l2 >>> 1 | l << 63;
    }

    public static long[] cfr_renamed_3441(byte[] arg0) {
        long[] lArray = new long[2];
        sprpxe.cfr_renamed_5175(arg0, 0, lArray, 0, 2);
        return lArray;
    }

    public static byte cfr_renamed_92(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 16) {
            byte by = arg0[n];
            byte by2 = arg1[n];
            n2 |= by ^ by2;
            n3 = ++n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return (byte)(n2 - 1 >> 31);
    }

    public static void cfr_renamed_10074(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 << 60;
        arg1[0] = l >>> 4 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
        arg1[1] = l2 >>> 4 | l << 60;
    }

    public static void cfr_renamed_10075(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[0];
        long l2 = lArray2[1];
        long l3 = l2 << 48;
        lArray[0] = l >>> 16 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
        lArray2[1] = l2 >>> 16 | l << 48;
    }

    public static void cfr_renamed_3423(byte[] arg0, int[] arg1) {
        sprpxe.cfr_renamed_5163(arg0, 0, arg1, 0, 4);
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

    public static void cfr_renamed_3444(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = nArray[0];
        int n2 = nArray2[1];
        int n3 = nArray[2];
        int n4 = nArray2[3];
        int n5 = n4 << 24;
        nArray[0] = n >>> 8 ^ n5 ^ n5 >>> 1 ^ n5 >>> 2 ^ n5 >>> 7;
        nArray2[1] = n2 >>> 8 | n << 24;
        nArray[2] = n3 >>> 8 | n2 << 24;
        nArray2[3] = n4 >>> 8 | n3 << 24;
    }

    public static void cfr_renamed_3443(long[] arg0, byte[] arg1) {
        sprpxe.cfr_renamed_5170(arg0, 0, 2, arg1, 0);
    }

    public static void cfr_renamed_3421(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        while (--arg3 >= 0) {
            int n = arg3;
            arg0[n] = (byte)(arg0[n] ^ arg1[arg2 + arg3]);
        }
    }

    public static byte[] cfr_renamed_3379() {
        byte[] byArray = new byte[16];
        byArray[0] = -128;
        return byArray;
    }

    public static void cfr_renamed_10071(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l >> 63;
        arg1[0] = (l ^= l3 & 0xE100000000000000L) << 1 | l2 >>> 63;
        arg1[1] = l2 << 1 | -l3;
    }

    public static long[] cfr_renamed_10076() {
        long[] lArray = new long[2];
        lArray[0] = 0x4000000000000000L;
        return lArray;
    }

    public static void cfr_renamed_3420(byte[] arg0, byte[] arg1) {
        long[] lArray = sprrzk.cfr_renamed_3441(arg0);
        long[] lArray2 = sprrzk.cfr_renamed_3441(arg1);
        sprrzk.cfr_renamed_3434(lArray, lArray2);
        sprrzk.cfr_renamed_3443(lArray, arg0);
    }

    private static /* synthetic */ long cfr_renamed_10077(long arg0, long arg1) {
        long l = arg0 & 0x1111111111111111L;
        long l2 = arg0 & 0x2222222222222222L;
        long l3 = arg0 & 0x4444444444444444L;
        long l4 = arg0 & 0x8888888888888888L;
        long l5 = arg1 & 0x1111111111111111L;
        long l6 = arg1 & 0x2222222222222222L;
        long l7 = arg1 & 0x4444444444444444L;
        long l8 = arg1 & 0x8888888888888888L;
        long l9 = l * l5 ^ l2 * l8 ^ l3 * l7 ^ l4 * l6;
        long l10 = l * l6 ^ l2 * l5 ^ l3 * l8 ^ l4 * l7;
        long l11 = l * l7 ^ l2 * l6 ^ l3 * l5 ^ l4 * l8;
        long l12 = l * l8 ^ l2 * l7 ^ l3 * l6 ^ l4 * l5;
        return (l9 &= 0x1111111111111111L) | (l10 &= 0x2222222222222222L) | (l11 &= 0x4444444444444444L) | (l12 &= 0x8888888888888888L);
    }

    public static void cfr_renamed_3440(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = nArray[0];
        int n2 = nArray2[1];
        int n3 = nArray[2];
        int n4 = nArray2[3];
        int n5 = n4 << 31 >> 31;
        nArray[0] = n >>> 1 ^ n5 & 0xE1000000;
        nArray2[1] = n2 >>> 1 | n << 31;
        nArray[2] = n3 >>> 1 | n2 << 31;
        nArray2[3] = n4 >>> 1 | n3 << 31;
    }

    public static void cfr_renamed_3450(byte[] arg0, long[] arg1) {
        sprpxe.cfr_renamed_5175(arg0, 0, arg1, 0, 2);
    }

    public static byte[] cfr_renamed_3449(long[] arg0) {
        byte[] byArray = new byte[16];
        sprpxe.cfr_renamed_5170(arg0, 0, 2, byArray, 0);
        return byArray;
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

    public static long cfr_renamed_565(long[] arg0, long[] arg1) {
        long l = 0L;
        l = 0L | arg0[0] ^ arg1[0];
        l |= arg0[1] ^ arg1[1];
        l = l >>> 1 | l & 1L;
        return l - 1L >> 63;
    }

    public static void cfr_renamed_10069(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 << 57;
        arg1[0] = l >>> 7 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
        arg1[1] = l2 >>> 7 | l << 57;
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long l;
        long[] lArray = new long[4];
        sprxlh.cfr_renamed_8603(arg0[0], lArray, 0);
        sprxlh.cfr_renamed_8603(arg0[1], lArray, 2);
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = l = lArray[3];
        l3 ^= l5 ^ l5 >>> 1 ^ l >>> 2 ^ l >>> 7;
        long l6 = l4 ^= l << 63 ^ l << 62 ^ l << 57;
        arg1[0] = l2 ^= l6 ^ l6 >>> 1 ^ l4 >>> 2 ^ l4 >>> 7;
        arg1[1] = l3 ^= l4 << 63 ^ l4 << 62 ^ l4 << 57;
    }

    public static void cfr_renamed_10062(byte[] arg0, byte[] arg1, int arg2) {
        int n = 0;
        do {
            byte[] byArray = arg0;
            byte[] byArray2 = arg0;
            int n2 = n;
            byte by = (byte)(byArray[n2] ^ arg1[arg2 + n]);
            byArray[n2] = by;
            int n3 = ++n;
            byte by2 = (byte)(byArray2[n3] ^ arg1[arg2 + n]);
            byArray2[n3] = by2;
            int n4 = ++n;
            byte by3 = (byte)(byArray[n4] ^ arg1[arg2 + n]);
            byArray[n4] = by3;
            int n5 = ++n;
            byte by4 = byArray2[n5] = (byte)(byArray2[n5] ^ arg1[arg2 + n]);
        } while (++n < 16);
    }

    public static int[] cfr_renamed_3429() {
        int[] nArray = new int[4];
        nArray[0] = Integer.MIN_VALUE;
        return nArray;
    }

    public static void cfr_renamed_10078(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 << 61;
        arg1[0] = l >>> 3 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
        arg1[1] = l2 >>> 3 | l << 61;
    }

    public static void cfr_renamed_10070(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 << 56;
        arg1[0] = l >>> 8 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
        arg1[1] = l2 >>> 8 | l << 56;
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

    public static void cfr_renamed_10079(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[0];
        long l2 = lArray2[1];
        long l3 = l2 << 56;
        lArray[0] = l >>> 8 ^ l3 ^ l3 >>> 1 ^ l3 >>> 2 ^ l3 >>> 7;
        lArray2[1] = l2 >>> 8 | l << 56;
    }

    public static void cfr_renamed_855(int[] arg0, int[] arg1) {
        int n;
        int n2 = arg1[0];
        int n3 = arg1[1];
        int n4 = arg1[2];
        int n5 = arg1[3];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = n = 0;
        while (n10 < 4) {
            int n11;
            int n12 = arg0[n];
            int n13 = n11 = 0;
            while (n13 < 32) {
                int n14 = n12 >> 31;
                n12 <<= 1;
                n6 ^= n2 & n14;
                n7 ^= n3 & n14;
                n8 ^= n4 & n14;
                n9 ^= n5 & n14;
                int n15 = n5 << 31 >> 8;
                n5 = n5 >>> 1 | n4 << 31;
                n4 = n4 >>> 1 | n3 << 31;
                n3 = n3 >>> 1 | n2 << 31;
                n2 = n2 >>> 1 ^ n15 & 0xE1000000;
                n13 = ++n11;
            }
            n10 = ++n;
        }
        arg0[0] = n6;
        arg0[1] = n7;
        arg0[2] = n8;
        arg0[3] = n9;
    }

    public static void cfr_renamed_10064(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int n = 0;
        do {
            byte[] byArray = arg4;
            byte[] byArray2 = arg4;
            int n2 = arg5 + n;
            byte by = (byte)(arg0[arg1 + n] ^ arg2[arg3 + n]);
            byArray[n2] = by;
            int n3 = arg5 + ++n;
            byte by2 = (byte)(arg0[arg1 + n] ^ arg2[arg3 + n]);
            byArray2[n3] = by2;
            int n4 = arg5 + ++n;
            byte by3 = (byte)(arg0[arg1 + n] ^ arg2[arg3 + n]);
            byArray[n4] = by3;
            int n5 = arg5 + ++n;
            byte by4 = byArray2[n5] = (byte)(arg0[arg1 + n] ^ arg2[arg3 + n]);
        } while (++n < 16);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_10080(byte[] byArray, long[] lArray) {
        long l;
        void arg1;
        byte[] arg0;
        long l2 = sprpxe.cfr_renamed_456(arg0, 0);
        long l3 = sprpxe.cfr_renamed_456(arg0, 8);
        void var6_4 = arg1[0];
        long l4 = lArray[1];
        long l5 = sprtwe.cfr_renamed_5189(l2);
        long l6 = sprtwe.cfr_renamed_5189(l3);
        long l7 = sprtwe.cfr_renamed_5189((long)var6_4);
        long l8 = sprtwe.cfr_renamed_5189(l4);
        long l9 = sprtwe.cfr_renamed_5189(sprrzk.cfr_renamed_10077(l5, l7));
        long l10 = sprrzk.cfr_renamed_10077(l2, (long)var6_4) << 1;
        long l11 = sprtwe.cfr_renamed_5189(sprrzk.cfr_renamed_10077(l6, l8));
        long l12 = sprrzk.cfr_renamed_10077(l3, l4) << 1;
        long l13 = sprtwe.cfr_renamed_5189(sprrzk.cfr_renamed_10077(l5 ^ l6, l7 ^ l8));
        long l14 = sprrzk.cfr_renamed_10077(l2 ^ l3, (long)(var6_4 ^ l4)) << 1;
        long l15 = l9;
        long l16 = l10 ^ l9 ^ l11 ^ l13;
        long l17 = l11 ^ l10 ^ l12 ^ l14;
        long l18 = l = l12;
        l16 ^= l18 ^ l18 >>> 1 ^ l >>> 2 ^ l >>> 7;
        long l19 = l17 ^= l << 62 ^ l << 57;
        sprpxe.cfr_renamed_450(l15 ^= l19 ^ l19 >>> 1 ^ l17 >>> 2 ^ l17 >>> 7, arg0, 0);
        sprpxe.cfr_renamed_450(l16 ^= l17 << 63 ^ l17 << 62 ^ l17 << 57, arg0, 8);
    }

    public static int[] cfr_renamed_3428(byte[] arg0) {
        int[] nArray = new int[4];
        sprpxe.cfr_renamed_5163(arg0, 0, nArray, 0, 4);
        return nArray;
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

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7203(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        v0[0] = arg0[0];
        v0[1] = arg0[1];
    }

    public static void cfr_renamed_10081(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[0];
        long l2 = lArray2[1];
        long l3 = l2 << 63 >> 63;
        lArray[0] = l >>> 1 ^ l3 & 0xE100000000000000L;
        lArray2[1] = l2 >>> 1 | l << 63;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_3434(long[] lArray, long[] lArray2) {
        long l;
        void arg1;
        long[] arg0;
        long[] lArray3 = arg0;
        long l2 = arg0[0];
        long l3 = lArray3[1];
        void var6_4 = arg1[0];
        long l4 = lArray2[1];
        long l5 = sprtwe.cfr_renamed_5189(l2);
        long l6 = sprtwe.cfr_renamed_5189(l3);
        long l7 = sprtwe.cfr_renamed_5189((long)var6_4);
        long l8 = sprtwe.cfr_renamed_5189(l4);
        long l9 = sprtwe.cfr_renamed_5189(sprrzk.cfr_renamed_10077(l5, l7));
        long l10 = sprrzk.cfr_renamed_10077(l2, (long)var6_4) << 1;
        long l11 = sprtwe.cfr_renamed_5189(sprrzk.cfr_renamed_10077(l6, l8));
        long l12 = sprrzk.cfr_renamed_10077(l3, l4) << 1;
        long l13 = sprtwe.cfr_renamed_5189(sprrzk.cfr_renamed_10077(l5 ^ l6, l7 ^ l8));
        long l14 = sprrzk.cfr_renamed_10077(l2 ^ l3, (long)(var6_4 ^ l4)) << 1;
        long l15 = l9;
        long l16 = l10 ^ l9 ^ l11 ^ l13;
        long l17 = l11 ^ l10 ^ l12 ^ l14;
        long l18 = l = l12;
        l16 ^= l18 ^ l18 >>> 1 ^ l >>> 2 ^ l >>> 7;
        long l19 = l17 ^= l << 62 ^ l << 57;
        arg0[0] = l15 ^= l19 ^ l19 >>> 1 ^ l17 >>> 2 ^ l17 >>> 7;
        lArray3[1] = l16 ^= l17 << 63 ^ l17 << 62 ^ l17 << 57;
    }
}


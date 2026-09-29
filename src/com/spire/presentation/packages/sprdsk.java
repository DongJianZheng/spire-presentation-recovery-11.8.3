/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxlh;

public class sprdsk {
    public static final int cfr_renamed_4 = 2;

    public static boolean cfr_renamed_10021(long[] arg0, long[] arg1) {
        long l = 0L;
        l = 0L | arg0[0] ^ arg1[0];
        return (l |= arg0[1] ^ arg1[1]) == 0L;
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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

    public static void cfr_renamed_10023(long[] lArray) {
        arg0[0] = 0L;
        arg0[1] = 0L;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7206(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        v0[0] = arg0[0] ^ arg1[0];
        v0[1] = arg0[1] ^ arg1[1];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7200(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg2;
        int n;
        void arg1;
        long[] arg0;
        long l = arg0[0];
        long l2 = arg0[1];
        void var7_5 = arg1[0];
        long l3 = lArray2[1];
        long l4 = 0L;
        long l5 = 0L;
        long l6 = 0L;
        int n2 = n = 0;
        while (n2 < 64) {
            long l7 = -(l & 1L);
            l >>>= 1;
            l4 ^= var7_5 & l7;
            l5 ^= l3 & l7;
            long l8 = -(l2 & 1L);
            l2 >>>= 1;
            l5 ^= var7_5 & l8;
            l6 ^= l3 & l8;
            long l9 = l3 >> 63;
            l3 = l3 << 1 | var7_5 >>> 63;
            var7_5 = var7_5 << 1 ^ l9 & 0x87L;
            n2 = ++n;
        }
        long l10 = l6;
        void v2 = arg2;
        v2[0] = l4 ^= l10 ^ l10 << 1 ^ l6 << 2 ^ l6 << 7;
        v2[1] = l5 ^= l6 >>> 63 ^ l6 >>> 62 ^ l6 >>> 57;
    }

    public static void cfr_renamed_10020(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 >>> 56;
        arg1[0] = l << 8 ^ l3 ^ l3 << 1 ^ l3 << 2 ^ l3 << 7;
        arg1[1] = l2 << 8 | l >>> 56;
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long l;
        long[] lArray = new long[4];
        sprxlh.cfr_renamed_8596(arg0[0], lArray, 0);
        sprxlh.cfr_renamed_8596(arg0[1], lArray, 2);
        long l2 = lArray[0];
        long l3 = lArray[1];
        long l4 = lArray[2];
        long l5 = l = lArray[3];
        l3 ^= l5 ^ l5 << 1 ^ l << 2 ^ l << 7;
        long l6 = l4 ^= l >>> 63 ^ l >>> 62 ^ l >>> 57;
        arg1[0] = l2 ^= l6 ^ l6 << 1 ^ l4 << 2 ^ l4 << 7;
        arg1[1] = l3 ^= l4 >>> 63 ^ l4 >>> 62 ^ l4 >>> 57;
    }

    public static void cfr_renamed_10024(long[] lArray) {
        arg0[0] = 2L;
        arg0[1] = 0L;
    }

    public static void cfr_renamed_10025(long[] lArray) {
        arg0[0] = 1L;
        arg0[1] = 0L;
    }

    public static void cfr_renamed_10022(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = l2 >> 63;
        arg1[0] = l << 1 ^ l3 & 0x87L;
        arg1[1] = l2 << 1 | l >>> 63;
    }
}


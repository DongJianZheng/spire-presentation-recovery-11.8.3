/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprthh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class sprqyh {
    private static final long cfr_renamed_3 = 0x1FFFFFFFFFFFFFFL;
    private static final long cfr_renamed_4 = 0x1FFFFFFFFFFFFL;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = 3 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3;
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

    public static void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        long[] lArray = sprthh.cfr_renamed_8536();
        sprqyh.cfr_renamed_7198(arg0, lArray);
        sprqyh.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            sprqyh.cfr_renamed_7198(arg2, lArray);
            sprqyh.cfr_renamed_6593(lArray, arg2);
        }
    }

    public static void cfr_renamed_8973(long[] arg0, long[] arg1) {
        long l = sprxlh.cfr_renamed_8604(arg0[0]);
        long l2 = sprxlh.cfr_renamed_8604(arg0[1]);
        long l3 = l & 0xFFFFFFFFL | l2 << 32;
        long l4 = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        arg1[0] = l3 ^ l4 << 57 ^ l4 << 5;
        arg1[1] = l4 >>> 7 ^ l4 >>> 59;
    }

    public static int cfr_renamed_8974(long[] arg0) {
        return (int)arg0[0] & 1;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8984(long[] lArray, long l, long l2, long[] lArray2, int n) {
        void arg3;
        void arg1;
        long[] arg0;
        void arg2;
        arg0[1] = arg2;
        arg0[2] = arg0[1] << 1;
        arg0[3] = arg0[2] ^ arg2;
        arg0[4] = arg0[2] << 1;
        arg0[5] = arg0[4] ^ arg2;
        arg0[6] = arg0[3] << 1;
        arg0[7] = arg0[6] ^ arg2;
        int n2 = (int)l;
        long l3 = 0L;
        long l4 = arg0[n2 & 7];
        int n3 = 48;
        do {
            n2 = (int)(arg1 >>> n3);
            long l5 = arg0[n2 & 7] ^ arg0[n2 >>> 3 & 7] << 3 ^ arg0[n2 >>> 6 & 7] << 6;
            l4 ^= l5 << n3;
            int n4 = -n3;
            l3 ^= l5 >>> n4;
        } while ((n3 -= 9) > 0);
        void v1 = arg3;
        v1[arg4] = l4 & 0x1FFFFFFFFFFFFFFL;
        v1[arg4 + true] = l4 >>> 57 ^ (l3 ^= (arg1 & 0x100804020100800L & arg2 << 7 >> 63) >>> 8) << 7;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_7196(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        v0[0] = v0[0] ^ arg0[0];
        v0[1] = v0[1] ^ arg0[1];
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long[] lArray = sprthh.cfr_renamed_8536();
        sprqyh.cfr_renamed_7198(arg0, lArray);
        sprqyh.cfr_renamed_6593(lArray, arg1);
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = new long[8];
        sprqyh.cfr_renamed_8979(arg0, arg1, lArray);
        sprqyh.cfr_renamed_6593(lArray, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8979(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg2;
        void var11_7;
        void arg1;
        long[] arg0;
        long l = arg0[0];
        long l2 = arg0[1];
        l2 = (l >>> 57 ^ l2 << 7) & 0x1FFFFFFFFFFFFFFL;
        l &= 0x1FFFFFFFFFFFFFFL;
        void var7_5 = arg1[0];
        long l3 = lArray2[1];
        l3 = (var7_5 >>> 57 ^ l3 << 7) & 0x1FFFFFFFFFFFFFFL;
        var7_5 &= 0x1FFFFFFFFFFFFFFL;
        void v0 = var11_7 = arg2;
        long[] lArray4 = new long[6];
        void v1 = var11_7;
        sprqyh.cfr_renamed_8984((long[])var11_7, l, (long)var7_5, lArray4, 0);
        sprqyh.cfr_renamed_8984((long[])v1, l2, l3, lArray4, 2);
        sprqyh.cfr_renamed_8984((long[])v1, l ^ l2, (long)(var7_5 ^ l3), lArray4, 4);
        long l4 = lArray4[1] ^ lArray4[2];
        long l5 = lArray4[0];
        long l6 = lArray4[3];
        long l7 = lArray4[4] ^ l5 ^ l4;
        long l8 = lArray4[5] ^ l6 ^ l4;
        v0[0] = l5 ^ l7 << 57;
        v0[1] = l7 >>> 7 ^ l8 << 50;
        v0[2] = l8 >>> 14 ^ l6 << 43;
        v0[3] = l6 >>> 21;
    }

    public static void cfr_renamed_8970(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprthh.cfr_renamed_8536();
        sprthh.cfr_renamed_8538(arg0, arg1);
        int n2 = n = 1;
        while (n2 < 113) {
            long[] lArray2 = arg1;
            long[] lArray3 = lArray;
            sprqyh.cfr_renamed_7198(arg1, lArray3);
            sprqyh.cfr_renamed_6593(lArray, arg1);
            sprqyh.cfr_renamed_7198(lArray2, lArray3);
            sprqyh.cfr_renamed_6593(lArray, arg1);
            sprqyh.cfr_renamed_7196(arg0, lArray2);
            n2 = n += 2;
        }
    }

    public static long[] cfr_renamed_1652(BigInteger arg0) {
        return sprvih.cfr_renamed_8557(113, arg0);
    }

    public static void cfr_renamed_8966(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = new long[8];
        sprqyh.cfr_renamed_8979(arg0, arg1, lArray);
        sprqyh.cfr_renamed_8978(arg2, lArray, arg2);
    }

    public static void cfr_renamed_7198(long[] arg0, long[] arg1) {
        sprxlh.cfr_renamed_7199(arg0, 0, 2, arg1, 0);
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

    public static void cfr_renamed_6593(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        l2 ^= l4 << 15 ^ l4 << 24;
        long l5 = (l2 ^= l3 >>> 49 ^ l3 >>> 40) >>> 49;
        arg1[0] = (l ^= (l3 ^= l4 >>> 49 ^ l4 >>> 40) << 15 ^ l3 << 24) ^ l5 ^ l5 << 9;
        arg1[1] = l2 & 0x1FFFFFFFFFFFFL;
    }

    public static void cfr_renamed_8965(long[] arg0, long[] arg1) {
        long[] lArray = sprthh.cfr_renamed_8536();
        sprqyh.cfr_renamed_7198(arg0, lArray);
        sprqyh.cfr_renamed_8978(arg1, lArray, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8978(long[] lArray, long[] lArray2, long[] lArray3) {
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

    public static void cfr_renamed_8991(long[] arg0, int arg1) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1 + 1];
        long l2 = l >>> 49;
        int n = arg1;
        long l3 = l2;
        lArray2[n] = lArray2[n] ^ (l3 ^ l3 << 9);
        lArray[arg1 + 1] = l & 0x1FFFFFFFFFFFFL;
    }

    public static void cfr_renamed_8971(long[] arg0, long[] arg1) {
        if (sprthh.cfr_renamed_8540(arg0)) {
            throw new IllegalStateException();
        }
        long[] lArray = sprthh.cfr_renamed_8534();
        long[] lArray2 = sprthh.cfr_renamed_8534();
        long[] lArray3 = lArray;
        sprqyh.cfr_renamed_7210(arg0, lArray3);
        long[] lArray4 = lArray;
        long[] lArray5 = lArray;
        long[] lArray6 = lArray;
        sprqyh.cfr_renamed_7200(lArray6, arg0, lArray);
        sprqyh.cfr_renamed_7210(lArray, lArray);
        sprqyh.cfr_renamed_7200(lArray5, arg0, lArray6);
        sprqyh.cfr_renamed_7209(lArray5, 3, lArray2);
        long[] lArray7 = lArray2;
        long[] lArray8 = lArray2;
        sprqyh.cfr_renamed_7200(lArray2, lArray, lArray8);
        sprqyh.cfr_renamed_7210(lArray7, lArray8);
        sprqyh.cfr_renamed_7200(lArray7, arg0, lArray2);
        sprqyh.cfr_renamed_7209(lArray2, 7, lArray);
        sprqyh.cfr_renamed_7200(lArray4, lArray2, lArray);
        sprqyh.cfr_renamed_7209(lArray4, 14, lArray2);
        sprqyh.cfr_renamed_7200(lArray2, lArray, lArray2);
        sprqyh.cfr_renamed_7209(lArray2, 28, lArray);
        sprqyh.cfr_renamed_7200(lArray, lArray2, lArray);
        sprqyh.cfr_renamed_7209(lArray3, 56, lArray2);
        sprqyh.cfr_renamed_7200(lArray2, lArray, lArray2);
        sprqyh.cfr_renamed_7210(lArray2, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8969(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        v0[0] = arg0[0] ^ 1L;
        v0[1] = arg0[1];
    }
}


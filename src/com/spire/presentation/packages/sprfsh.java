/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class sprfsh {
    private static final long cfr_renamed_2 = 0x7FFFFFFFFL;
    private static final long[] cfr_renamed_3;
    private static final long cfr_renamed_4 = 0x7FFFFFFFFFFFFFL;

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long[] lArray = sprinh.cfr_renamed_8536();
        sprfsh.cfr_renamed_7198(arg0, lArray);
        sprfsh.cfr_renamed_6593(lArray, arg1);
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = new long[8];
        sprfsh.cfr_renamed_8979(arg0, arg1, lArray);
        sprfsh.cfr_renamed_6593(lArray, arg2);
    }

    public static void cfr_renamed_6593(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        l3 ^= l6 << 29 ^ l6 << 32 ^ l6 << 35 ^ l6 << 36;
        l2 ^= l5 << 29 ^ l5 << 32 ^ l5 << 35 ^ l5 << 36;
        long l7 = (l3 ^= l5 >>> 35 ^ l5 >>> 32 ^ l5 >>> 29 ^ l5 >>> 28) >>> 35;
        arg1[0] = (l ^= (l4 ^= l6 >>> 35 ^ l6 >>> 32 ^ l6 >>> 29 ^ l6 >>> 28) << 29 ^ l4 << 32 ^ l4 << 35 ^ l4 << 36) ^ l7 ^ l7 << 3 ^ l7 << 6 ^ l7 << 7;
        arg1[1] = l2 ^= l4 >>> 35 ^ l4 >>> 32 ^ l4 >>> 29 ^ l4 >>> 28;
        arg1[2] = l3 & 0x7FFFFFFFFL;
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
        void v2 = arg2;
        v2[0] = arg0[0] ^ arg1[0];
        v2[1] = arg0[1] ^ arg1[1];
        v1[2] = arg0[2] ^ arg1[2];
        v1[3] = arg0[3] ^ arg1[3];
        v0[4] = arg0[4] ^ arg1[4];
        v0[5] = arg0[5] ^ arg1[5];
    }

    public static void cfr_renamed_8973(long[] arg0, long[] arg1) {
        long[] lArray = sprinh.cfr_renamed_8534();
        long[] lArray2 = lArray;
        long l = sprxlh.cfr_renamed_8604(arg0[0]);
        long l2 = sprxlh.cfr_renamed_8604(arg0[1]);
        long l3 = l & 0xFFFFFFFFL | l2 << 32;
        lArray[0] = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[2]);
        long l4 = l & 0xFFFFFFFFL;
        lArray2[1] = l >>> 32;
        long[] lArray3 = arg1;
        sprfsh.cfr_renamed_7200(lArray, cfr_renamed_3, arg1);
        arg1[0] = arg1[0] ^ l3;
        lArray3[1] = lArray3[1] ^ l4;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8969(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        arg1[0] = arg0[0] ^ 1L;
        v0[1] = arg0[1];
        v0[2] = arg0[2];
    }

    public static void cfr_renamed_8989(long[] arg0, int arg1) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1 + 2];
        long l2 = l >>> 35;
        int n = arg1;
        long l3 = l2;
        lArray2[n] = lArray2[n] ^ (l3 ^ l3 << 3 ^ l2 << 6 ^ l2 << 7);
        lArray[arg1 + 2] = l & 0x7FFFFFFFFL;
    }

    public static void cfr_renamed_8981(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[0];
        long l2 = lArray2[1];
        long l3 = lArray[2];
        long l4 = lArray2[3];
        long l5 = lArray[4];
        long l6 = lArray2[5];
        lArray[0] = l ^ l2 << 55;
        lArray2[1] = l2 >>> 9 ^ l3 << 46;
        lArray[2] = l3 >>> 18 ^ l4 << 37;
        lArray2[3] = l4 >>> 27 ^ l5 << 28;
        lArray[4] = l5 >>> 36 ^ l6 << 19;
        lArray2[5] = l6 >>> 45;
    }

    public static void cfr_renamed_8966(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = new long[8];
        sprfsh.cfr_renamed_8979(arg0, arg1, lArray);
        sprfsh.cfr_renamed_8978(arg2, lArray, arg2);
    }

    public static void cfr_renamed_8971(long[] arg0, long[] arg1) {
        if (sprinh.cfr_renamed_8540(arg0)) {
            throw new IllegalStateException();
        }
        long[] lArray = sprinh.cfr_renamed_8534();
        long[] lArray2 = sprinh.cfr_renamed_8534();
        sprfsh.cfr_renamed_7210(arg0, lArray);
        long[] lArray3 = lArray;
        long[] lArray4 = lArray;
        long[] lArray5 = lArray;
        sprfsh.cfr_renamed_7209(lArray, 1, lArray2);
        sprfsh.cfr_renamed_7200(lArray, lArray2, lArray);
        sprfsh.cfr_renamed_7209(lArray2, 1, lArray2);
        sprfsh.cfr_renamed_7200(lArray5, lArray2, lArray);
        sprfsh.cfr_renamed_7209(lArray, 3, lArray2);
        sprfsh.cfr_renamed_7200(lArray, lArray2, lArray5);
        sprfsh.cfr_renamed_7209(lArray2, 3, lArray2);
        sprfsh.cfr_renamed_7200(lArray4, lArray2, lArray);
        sprfsh.cfr_renamed_7209(lArray, 9, lArray2);
        sprfsh.cfr_renamed_7200(lArray, lArray2, lArray4);
        sprfsh.cfr_renamed_7209(lArray2, 9, lArray2);
        sprfsh.cfr_renamed_7200(lArray3, lArray2, lArray);
        sprfsh.cfr_renamed_7209(lArray, 27, lArray2);
        sprfsh.cfr_renamed_7200(lArray, lArray2, lArray3);
        sprfsh.cfr_renamed_7209(lArray2, 27, lArray2);
        sprfsh.cfr_renamed_7200(lArray, lArray2, lArray);
        sprfsh.cfr_renamed_7209(lArray, 81, lArray2);
        sprfsh.cfr_renamed_7200(lArray, lArray2, arg1);
    }

    public static void cfr_renamed_8965(long[] arg0, long[] arg1) {
        long[] lArray = sprinh.cfr_renamed_8536();
        sprfsh.cfr_renamed_7198(arg0, lArray);
        sprfsh.cfr_renamed_8978(arg1, lArray, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7206(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg1;
        long[] arg0;
        void arg2;
        void v0 = arg2;
        arg2[0] = arg0[0] ^ arg1[0];
        v0[1] = arg0[1] ^ arg1[1];
        v0[2] = arg0[2] ^ arg1[2];
    }

    public static long[] cfr_renamed_1652(BigInteger arg0) {
        return sprvih.cfr_renamed_8557(163, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8984(long[] lArray, long l, long l2, long[] lArray2, int n) {
        void arg3;
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
        long l4 = arg0[n2 & 3];
        int n3 = 47;
        do {
            void arg1;
            n2 = (int)(arg1 >>> n3);
            long l5 = arg0[n2 & 7] ^ arg0[n2 >>> 3 & 7] << 3 ^ arg0[n2 >>> 6 & 7] << 6;
            l4 ^= l5 << n3;
            int n4 = -n3;
            l3 ^= l5 >>> n4;
        } while ((n3 -= 9) > 0);
        void v1 = arg3;
        v1[arg4] = l4 & 0x7FFFFFFFFFFFFFL;
        v1[arg4 + true] = l4 >>> 55 ^ l3 << 9;
    }

    static {
        long[] lArray = new long[3];
        lArray[0] = -5270498306774157648L;
        lArray[1] = 5270498306774195053L;
        lArray[2] = 0x492492492L;
        cfr_renamed_3 = lArray;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_7196(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = v1[0] ^ arg0[0];
        v0[1] = v0[1] ^ arg0[1];
        v0[2] = v0[2] ^ arg0[2];
    }

    public static void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        long[] lArray = sprinh.cfr_renamed_8536();
        sprfsh.cfr_renamed_7198(arg0, lArray);
        sprfsh.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            sprfsh.cfr_renamed_7198(arg2, lArray);
            sprfsh.cfr_renamed_6593(lArray, arg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8979(long[] lArray, long[] lArray2, long[] lArray3) {
        void arg2;
        void arg1;
        long[] arg0;
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        l3 = l2 >>> 46 ^ l3 << 18;
        l2 = (l >>> 55 ^ l2 << 9) & 0x7FFFFFFFFFFFFFL;
        l &= 0x7FFFFFFFFFFFFFL;
        void v0 = arg1;
        void var9_6 = v0[0];
        void var11_7 = v0[1];
        long l4 = lArray2[2];
        l4 = var11_7 >>> 46 ^ l4 << 18;
        var11_7 = (var9_6 >>> 55 ^ var11_7 << 9) & 0x7FFFFFFFFFFFFFL;
        var9_6 &= 0x7FFFFFFFFFFFFFL;
        void v1 = arg2;
        void v2 = arg2;
        void var15_9 = v2;
        long[] lArray4 = new long[10];
        void v3 = var15_9;
        void v4 = var15_9;
        sprfsh.cfr_renamed_8984((long[])var15_9, l, (long)var9_6, lArray4, 0);
        sprfsh.cfr_renamed_8984((long[])v4, l3, l4, lArray4, 2);
        long l5 = l ^ l2 ^ l3;
        void var19_12 = var9_6 ^ var11_7 ^ l4;
        sprfsh.cfr_renamed_8984((long[])v4, l5, (long)var19_12, lArray4, 4);
        long l6 = l2 << 1 ^ l3 << 2;
        void var23_14 = var11_7 << 1 ^ l4 << 2;
        sprfsh.cfr_renamed_8984((long[])v3, l ^ l6, (long)(var9_6 ^ var23_14), lArray4, 6);
        sprfsh.cfr_renamed_8984((long[])v3, l5 ^ l6, (long)(var19_12 ^ var23_14), lArray4, 8);
        long l7 = lArray4[6] ^ lArray4[8];
        long l8 = lArray4[7] ^ lArray4[9];
        long l9 = l7 << 1 ^ lArray4[6];
        long l10 = l7 ^ l8 << 1 ^ lArray4[7];
        long l11 = l8;
        long l12 = lArray4[0];
        long l13 = lArray4[1] ^ lArray4[0] ^ lArray4[4];
        long l14 = lArray4[1] ^ lArray4[5];
        long l15 = l12 ^ l9 ^ lArray4[2] << 4 ^ lArray4[2] << 1;
        long l16 = l13 ^ l10 ^ lArray4[3] << 4 ^ lArray4[3] << 1;
        long l17 = l14 ^ l11;
        l16 ^= l15 >>> 55;
        l15 &= 0x7FFFFFFFFFFFFFL;
        l17 ^= l16 >>> 55;
        l15 = l15 >>> 1 ^ ((l16 &= 0x7FFFFFFFFFFFFFL) & 1L) << 54;
        l16 = l16 >>> 1 ^ (l17 & 1L) << 54;
        l17 >>>= 1;
        long l18 = l15;
        l15 = l18 ^ l18 << 1;
        l15 ^= l15 << 2;
        l15 ^= l15 << 4;
        l15 ^= l15 << 8;
        l15 ^= l15 << 16;
        l15 ^= l15 << 32;
        l16 ^= (l15 &= 0x7FFFFFFFFFFFFFL) >>> 54;
        l16 ^= l16 << 1;
        l16 ^= l16 << 2;
        l16 ^= l16 << 4;
        l16 ^= l16 << 8;
        l16 ^= l16 << 16;
        l16 ^= l16 << 32;
        l17 ^= (l16 &= 0x7FFFFFFFFFFFFFL) >>> 54;
        l17 ^= l17 << 1;
        l17 ^= l17 << 2;
        l17 ^= l17 << 4;
        l17 ^= l17 << 8;
        l17 ^= l17 << 16;
        l17 ^= l17 << 32;
        v2[0] = l12;
        v2[1] = l13 ^ l15 ^ lArray4[2];
        v2[2] = l14 ^ l16 ^ l15 ^ lArray4[3];
        v1[3] = l17 ^ l16;
        v1[4] = l17 ^ lArray4[2];
        v1[5] = lArray4[3];
        sprfsh.cfr_renamed_8981((long[])v1);
    }

    public static void cfr_renamed_8970(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprinh.cfr_renamed_8536();
        sprinh.cfr_renamed_8538(arg0, arg1);
        int n2 = n = 1;
        while (n2 < 163) {
            long[] lArray2 = arg1;
            long[] lArray3 = lArray;
            sprfsh.cfr_renamed_7198(arg1, lArray3);
            sprfsh.cfr_renamed_6593(lArray, arg1);
            sprfsh.cfr_renamed_7198(lArray2, lArray3);
            sprfsh.cfr_renamed_6593(lArray, arg1);
            sprfsh.cfr_renamed_7196(arg0, lArray2);
            n2 = n += 2;
        }
    }

    public static int cfr_renamed_8974(long[] arg0) {
        return (int)(arg0[0] ^ arg0[2] >>> 29) & 1;
    }

    public static void cfr_renamed_7198(long[] arg0, long[] arg1) {
        sprxlh.cfr_renamed_7199(arg0, 0, 3, arg1, 0);
    }
}


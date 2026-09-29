/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdih;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class sprjxh {
    private static final long cfr_renamed_2 = 0x1FFFFFFFFFFFFFFL;
    private static final long[] cfr_renamed_3;
    private static final long cfr_renamed_4 = 0x7FFFFFFL;

    public static void cfr_renamed_8981(long[] arg0) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[0];
        long l2 = lArray2[1];
        long l3 = lArray[2];
        long l4 = lArray2[3];
        long l5 = lArray[4];
        long l6 = lArray2[5];
        long l7 = lArray[6];
        long l8 = lArray2[7];
        long l9 = lArray[8];
        long l10 = lArray2[9];
        lArray[0] = l ^ l2 << 57;
        lArray2[1] = l2 >>> 7 ^ l3 << 50;
        lArray[2] = l3 >>> 14 ^ l4 << 43;
        lArray2[3] = l4 >>> 21 ^ l5 << 36;
        lArray[4] = l5 >>> 28 ^ l6 << 29;
        lArray2[5] = l6 >>> 35 ^ l7 << 22;
        lArray[6] = l7 >>> 42 ^ l8 << 15;
        lArray2[7] = l8 >>> 49 ^ l9 << 8;
        lArray[8] = l9 >>> 56 ^ l10 << 1;
        lArray2[9] = l10 >>> 63;
    }

    public static void cfr_renamed_8965(long[] arg0, long[] arg1) {
        long[] lArray = sprvih.cfr_renamed_8558(9);
        sprjxh.cfr_renamed_7198(arg0, lArray);
        sprjxh.cfr_renamed_8978(arg1, lArray, arg1);
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

    public static void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        long[] lArray = sprvih.cfr_renamed_8558(9);
        sprjxh.cfr_renamed_7198(arg0, lArray);
        sprjxh.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            sprjxh.cfr_renamed_7198(arg2, lArray);
            sprjxh.cfr_renamed_6593(lArray, arg2);
        }
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long[] lArray = sprvih.cfr_renamed_8558(9);
        sprjxh.cfr_renamed_7198(arg0, lArray);
        sprjxh.cfr_renamed_6593(lArray, arg1);
    }

    static {
        long[] lArray = new long[5];
        lArray[0] = 878416384462358536L;
        lArray[1] = 0x30C30C30C30C30C3L;
        lArray[2] = -9076969306111048948L;
        lArray[3] = 0x820820820820820L;
        lArray[4] = 0x2082082L;
        cfr_renamed_3 = lArray;
    }

    public static void cfr_renamed_8970(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprvih.cfr_renamed_8558(9);
        sprdih.cfr_renamed_8538(arg0, arg1);
        int n2 = n = 1;
        while (n2 < 283) {
            long[] lArray2 = arg1;
            long[] lArray3 = lArray;
            sprjxh.cfr_renamed_7198(arg1, lArray3);
            sprjxh.cfr_renamed_6593(lArray, arg1);
            sprjxh.cfr_renamed_7198(lArray2, lArray3);
            sprjxh.cfr_renamed_6593(lArray, arg1);
            sprjxh.cfr_renamed_7196(arg0, lArray2);
            n2 = n += 2;
        }
    }

    public static void cfr_renamed_8979(long[] arg0, long[] arg1, long[] arg2) {
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long[] lArray = new long[5];
        long[] lArray2 = new long[5];
        sprjxh.cfr_renamed_8983(arg0, lArray);
        sprjxh.cfr_renamed_8983(arg1, lArray2);
        long[] lArray3 = arg2;
        long[] lArray4 = arg2;
        long[] lArray5 = arg2;
        long[] lArray6 = lArray4;
        long[] lArray7 = new long[26];
        long[] lArray8 = lArray6;
        long[] lArray9 = lArray6;
        sprjxh.cfr_renamed_8984(lArray6, lArray[0], lArray2[0], lArray7, 0);
        sprjxh.cfr_renamed_8984(lArray6, lArray[1], lArray2[1], lArray7, 2);
        sprjxh.cfr_renamed_8984(lArray6, lArray[2], lArray2[2], lArray7, 4);
        sprjxh.cfr_renamed_8984(lArray6, lArray[3], lArray2[3], lArray7, 6);
        sprjxh.cfr_renamed_8984(lArray6, lArray[4], lArray2[4], lArray7, 8);
        long l9 = lArray[0] ^ lArray[1];
        long l10 = lArray2[0] ^ lArray2[1];
        long l11 = lArray[0] ^ lArray[2];
        long l12 = lArray2[0] ^ lArray2[2];
        long l13 = lArray[2] ^ lArray[4];
        long l14 = lArray2[2] ^ lArray2[4];
        long l15 = lArray[3] ^ lArray[4];
        long l16 = lArray2[3] ^ lArray2[4];
        sprjxh.cfr_renamed_8984(lArray8, l11 ^ lArray[3], l12 ^ lArray2[3], lArray7, 18);
        sprjxh.cfr_renamed_8984(lArray9, l13 ^ lArray[1], l14 ^ lArray2[1], lArray7, 20);
        long l17 = l9 ^ l15;
        long l18 = l10 ^ l16;
        long l19 = l17 ^ lArray[2];
        long l20 = l18 ^ lArray2[2];
        sprjxh.cfr_renamed_8984(lArray8, l17, l18, lArray7, 22);
        sprjxh.cfr_renamed_8984(lArray9, l19, l20, lArray7, 24);
        sprjxh.cfr_renamed_8984(lArray8, l9, l10, lArray7, 10);
        sprjxh.cfr_renamed_8984(lArray9, l11, l12, lArray7, 12);
        sprjxh.cfr_renamed_8984(lArray8, l13, l14, lArray7, 14);
        sprjxh.cfr_renamed_8984(lArray9, l15, l16, lArray7, 16);
        lArray5[0] = lArray7[0];
        lArray4[9] = lArray7[9];
        long l21 = lArray7[0] ^ lArray7[1];
        long l22 = l21 ^ lArray7[2];
        lArray5[1] = l8 = l22 ^ lArray7[10];
        long l23 = lArray7[3] ^ lArray7[4];
        long l24 = lArray7[11] ^ lArray7[12];
        long l25 = l23 ^ l24;
        lArray4[2] = l7 = l22 ^ l25;
        long l26 = l21 ^ l23;
        long l27 = lArray7[5] ^ lArray7[6];
        long l28 = l26 ^ l27 ^ lArray7[8];
        long l29 = lArray7[13] ^ lArray7[14];
        long l30 = l28 ^ l29;
        long l31 = lArray7[18] ^ lArray7[22] ^ lArray7[24];
        lArray5[3] = l6 = l30 ^ l31;
        long l32 = lArray7[7] ^ lArray7[8] ^ lArray7[9];
        lArray4[8] = l5 = l32 ^ lArray7[17];
        long l33 = l32 ^ l27;
        long l34 = lArray7[15] ^ lArray7[16];
        lArray5[7] = l4 = l33 ^ l34;
        long l35 = l4 ^ l8;
        long l36 = lArray7[19] ^ lArray7[20];
        long l37 = lArray7[25] ^ lArray7[24];
        long l38 = lArray7[18] ^ lArray7[23];
        long l39 = l36 ^ l37;
        lArray3[4] = l3 = l39 ^ l38 ^ l35;
        long l40 = l7 ^ l5;
        long l41 = l39 ^ l40;
        long l42 = lArray7[21] ^ lArray7[22];
        arg2[5] = l2 = l41 ^ l42;
        arg2[6] = l = l28 ^ lArray7[0] ^ lArray7[9] ^ l29 ^ lArray7[21] ^ lArray7[23] ^ lArray7[25];
        sprjxh.cfr_renamed_8981(lArray3);
    }

    public static int cfr_renamed_8974(long[] arg0) {
        return (int)(arg0[0] ^ arg0[4] >>> 15) & 1;
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
        arg2[0] = arg0[0] ^ arg1[0];
        v1[1] = arg0[1] ^ arg1[1];
        v1[2] = arg0[2] ^ arg1[2];
        v0[3] = arg0[3] ^ arg1[3];
        v0[4] = arg0[4] ^ arg1[4];
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
        void v3 = arg2;
        arg2[0] = arg0[0] ^ arg1[0];
        v3[1] = arg0[1] ^ arg1[1];
        v3[2] = arg0[2] ^ arg1[2];
        v2[3] = arg0[3] ^ arg1[3];
        v2[4] = arg0[4] ^ arg1[4];
        v1[5] = arg0[5] ^ arg1[5];
        v1[6] = arg0[6] ^ arg1[6];
        v0[7] = arg0[7] ^ arg1[7];
        v0[8] = arg0[8] ^ arg1[8];
    }

    public static void cfr_renamed_8966(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprdih.cfr_renamed_8536();
        sprjxh.cfr_renamed_8979(arg0, arg1, lArray);
        sprjxh.cfr_renamed_8978(arg2, lArray, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8969(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        arg1[0] = arg0[0] ^ 1L;
        v1[1] = arg0[1];
        v1[2] = arg0[2];
        v0[3] = arg0[3];
        v0[4] = arg0[4];
    }

    public static void cfr_renamed_6593(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        long l7 = arg0[6];
        long l8 = arg0[7];
        long l9 = arg0[8];
        l4 ^= l9 << 37 ^ l9 << 42 ^ l9 << 44 ^ l9 << 49;
        l3 ^= l8 << 37 ^ l8 << 42 ^ l8 << 44 ^ l8 << 49;
        l4 ^= l8 >>> 27 ^ l8 >>> 22 ^ l8 >>> 20 ^ l8 >>> 15;
        l2 ^= l7 << 37 ^ l7 << 42 ^ l7 << 44 ^ l7 << 49;
        long l10 = (l5 ^= l9 >>> 27 ^ l9 >>> 22 ^ l9 >>> 20 ^ l9 >>> 15) >>> 27;
        arg1[0] = (l ^= l6 << 37 ^ l6 << 42 ^ l6 << 44 ^ l6 << 49) ^ l10 ^ l10 << 5 ^ l10 << 7 ^ l10 << 12;
        arg1[1] = l2 ^= l6 >>> 27 ^ l6 >>> 22 ^ l6 >>> 20 ^ l6 >>> 15;
        arg1[2] = l3 ^= l7 >>> 27 ^ l7 >>> 22 ^ l7 >>> 20 ^ l7 >>> 15;
        arg1[3] = l4;
        arg1[4] = l5 & 0x7FFFFFFL;
    }

    public static void cfr_renamed_8973(long[] arg0, long[] arg1) {
        long[] lArray = sprdih.cfr_renamed_8534();
        long[] lArray2 = lArray;
        long l = sprxlh.cfr_renamed_8604(arg0[0]);
        long l2 = sprxlh.cfr_renamed_8604(arg0[1]);
        long l3 = l & 0xFFFFFFFFL | l2 << 32;
        lArray2[0] = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[2]);
        l2 = sprxlh.cfr_renamed_8604(arg0[3]);
        long l4 = l & 0xFFFFFFFFL | l2 << 32;
        lArray[1] = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[4]);
        long l5 = l & 0xFFFFFFFFL;
        lArray2[2] = l >>> 32;
        long[] lArray3 = arg1;
        sprjxh.cfr_renamed_7200(lArray, cfr_renamed_3, arg1);
        long[] lArray4 = arg1;
        long[] lArray5 = arg1;
        lArray4[0] = lArray4[0] ^ l3;
        lArray5[1] = lArray5[1] ^ l4;
        lArray3[2] = lArray3[2] ^ l5;
    }

    public static void cfr_renamed_8983(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        arg1[0] = l & 0x1FFFFFFFFFFFFFFL;
        arg1[1] = (l >>> 57 ^ l2 << 7) & 0x1FFFFFFFFFFFFFFL;
        arg1[2] = (l2 >>> 50 ^ l3 << 14) & 0x1FFFFFFFFFFFFFFL;
        arg1[3] = (l3 >>> 43 ^ l4 << 21) & 0x1FFFFFFFFFFFFFFL;
        arg1[4] = l4 >>> 36 ^ l5 << 28;
    }

    public static void cfr_renamed_8971(long[] arg0, long[] arg1) {
        if (sprdih.cfr_renamed_8540(arg0)) {
            throw new IllegalStateException();
        }
        long[] lArray = sprdih.cfr_renamed_8534();
        long[] lArray2 = sprdih.cfr_renamed_8534();
        long[] lArray3 = lArray;
        sprjxh.cfr_renamed_7210(arg0, lArray3);
        long[] lArray4 = lArray;
        long[] lArray5 = lArray;
        long[] lArray6 = lArray;
        sprjxh.cfr_renamed_7200(lArray6, arg0, lArray);
        sprjxh.cfr_renamed_7209(lArray6, 2, lArray2);
        sprjxh.cfr_renamed_7200(lArray2, lArray, lArray2);
        sprjxh.cfr_renamed_7209(lArray2, 4, lArray);
        sprjxh.cfr_renamed_7200(lArray, lArray2, lArray);
        sprjxh.cfr_renamed_7209(lArray, 8, lArray2);
        long[] lArray7 = lArray2;
        sprjxh.cfr_renamed_7200(lArray7, lArray, lArray2);
        sprjxh.cfr_renamed_7210(lArray2, lArray2);
        sprjxh.cfr_renamed_7200(lArray2, arg0, lArray7);
        sprjxh.cfr_renamed_7209(lArray2, 17, lArray);
        sprjxh.cfr_renamed_7200(lArray5, lArray2, lArray);
        sprjxh.cfr_renamed_7210(lArray, lArray);
        sprjxh.cfr_renamed_7200(lArray, arg0, lArray5);
        sprjxh.cfr_renamed_7209(lArray, 35, lArray2);
        sprjxh.cfr_renamed_7200(lArray2, lArray, lArray2);
        sprjxh.cfr_renamed_7209(lArray2, 70, lArray);
        sprjxh.cfr_renamed_7200(lArray4, lArray2, lArray);
        sprjxh.cfr_renamed_7210(lArray, lArray);
        sprjxh.cfr_renamed_7200(lArray, arg0, lArray4);
        sprjxh.cfr_renamed_7209(lArray3, 141, lArray2);
        sprjxh.cfr_renamed_7200(lArray2, lArray, lArray2);
        sprjxh.cfr_renamed_7210(lArray2, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7198(long[] lArray, long[] lArray2) {
        void arg1;
        long[] arg0;
        sprxlh.cfr_renamed_7199(arg0, 0, 4, (long[])arg1, 0);
        lArray2[8] = sprxlh.cfr_renamed_8599((int)arg0[4]);
    }

    public static long[] cfr_renamed_1652(BigInteger arg0) {
        return sprvih.cfr_renamed_8557(283, arg0);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_7196(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        void v2 = arg1;
        v2[0] = v2[0] ^ arg0[0];
        v1[1] = v1[1] ^ arg0[1];
        v1[2] = v1[2] ^ arg0[2];
        v0[3] = v0[3] ^ arg0[3];
        v0[4] = v0[4] ^ arg0[4];
    }

    public static void cfr_renamed_8985(long[] arg0, int arg1) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1 + 4];
        long l2 = l >>> 27;
        int n = arg1;
        long l3 = l2;
        lArray2[n] = lArray2[n] ^ (l3 ^ l3 << 5 ^ l2 << 7 ^ l2 << 12);
        lArray[arg1 + 4] = l & 0x7FFFFFFL;
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprdih.cfr_renamed_8536();
        sprjxh.cfr_renamed_8979(arg0, arg1, lArray);
        sprjxh.cfr_renamed_6593(lArray, arg2);
    }
}


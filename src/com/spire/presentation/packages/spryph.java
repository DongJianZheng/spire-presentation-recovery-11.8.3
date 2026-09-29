/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class spryph {
    private static final long cfr_renamed_3 = 1L;
    private static final long cfr_renamed_4 = 0x1FFFFFFFFFFFFL;

    public static void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        long[] lArray = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_7198(arg0, lArray);
        spryph.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            spryph.cfr_renamed_7198(arg2, lArray);
            spryph.cfr_renamed_6593(lArray, arg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7198(long[] lArray, long[] lArray2) {
        void arg1;
        long[] arg0;
        sprxlh.cfr_renamed_7199(arg0, 0, 3, (long[])arg1, 0);
        lArray2[6] = arg0[3] & 1L;
    }

    public static void cfr_renamed_8966(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_8979(arg0, arg1, lArray);
        spryph.cfr_renamed_8978(arg2, lArray, arg2);
    }

    public static void cfr_renamed_8973(long[] arg0, long[] arg1) {
        long l = sprxlh.cfr_renamed_8604(arg0[0]);
        long l2 = sprxlh.cfr_renamed_8604(arg0[1]);
        long l3 = l & 0xFFFFFFFFL | l2 << 32;
        long l4 = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[2]);
        long l5 = l & 0xFFFFFFFFL ^ arg0[3] << 32;
        long l6 = l >>> 32;
        arg1[0] = l3 ^ l4 << 8;
        arg1[1] = l5 ^ l6 << 8 ^ l4 >>> 56 ^ l4 << 33;
        arg1[2] = l6 >>> 56 ^ l6 << 33 ^ l4 >>> 31;
        arg1[3] = l6 >>> 31;
    }

    public static void cfr_renamed_8970(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprmeh.cfr_renamed_8536();
        sprmeh.cfr_renamed_8538(arg0, arg1);
        int n2 = n = 1;
        while (n2 < 193) {
            long[] lArray2 = arg1;
            long[] lArray3 = lArray;
            spryph.cfr_renamed_7198(arg1, lArray3);
            spryph.cfr_renamed_6593(lArray, arg1);
            spryph.cfr_renamed_7198(lArray2, lArray3);
            spryph.cfr_renamed_6593(lArray, arg1);
            spryph.cfr_renamed_7196(arg0, lArray2);
            n2 = n += 2;
        }
    }

    public static long[] cfr_renamed_1652(BigInteger arg0) {
        return sprvih.cfr_renamed_8557(193, arg0);
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
        long l7 = lArray[6];
        long l8 = lArray2[7];
        lArray[0] = l ^ l2 << 49;
        lArray2[1] = l2 >>> 15 ^ l3 << 34;
        lArray[2] = l3 >>> 30 ^ l4 << 19;
        lArray2[3] = l4 >>> 45 ^ l5 << 4 ^ l6 << 53;
        lArray[4] = l5 >>> 60 ^ l7 << 38 ^ l6 >>> 11;
        lArray2[5] = l7 >>> 26 ^ l8 << 23;
        lArray[6] = l8 >>> 41;
        lArray2[7] = 0L;
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
        v1[1] = v1[1] ^ arg0[1];
        v0[2] = v0[2] ^ arg0[2];
        v0[3] = v0[3] ^ arg0[3];
    }

    public static void cfr_renamed_6593(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        long l7 = arg0[6];
        l3 ^= l7 << 63;
        l4 ^= l7 >>> 1 ^ l7 << 14;
        l2 ^= l6 << 63;
        l3 ^= l6 >>> 1 ^ l6 << 14;
        long l8 = (l4 ^= l6 >>> 50) >>> 1;
        arg1[0] = (l ^= (l5 ^= l7 >>> 50) << 63) ^ l8 ^ l8 << 15;
        arg1[1] = (l2 ^= l5 >>> 1 ^ l5 << 14) ^ l8 >>> 49;
        arg1[2] = l3 ^= l5 >>> 50;
        arg1[3] = l4 & 1L;
    }

    public static void cfr_renamed_8971(long[] arg0, long[] arg1) {
        if (sprmeh.cfr_renamed_8540(arg0)) {
            throw new IllegalStateException();
        }
        long[] lArray = sprmeh.cfr_renamed_8534();
        long[] lArray2 = sprmeh.cfr_renamed_8534();
        spryph.cfr_renamed_7210(arg0, lArray);
        long[] lArray3 = lArray;
        long[] lArray4 = lArray;
        long[] lArray5 = lArray;
        long[] lArray6 = lArray;
        long[] lArray7 = lArray;
        spryph.cfr_renamed_7209(lArray, 1, lArray2);
        spryph.cfr_renamed_7200(lArray, lArray2, lArray);
        spryph.cfr_renamed_7209(lArray2, 1, lArray2);
        spryph.cfr_renamed_7200(lArray7, lArray2, lArray);
        spryph.cfr_renamed_7209(lArray, 3, lArray2);
        spryph.cfr_renamed_7200(lArray6, lArray2, lArray7);
        spryph.cfr_renamed_7209(lArray, 6, lArray2);
        spryph.cfr_renamed_7200(lArray5, lArray2, lArray6);
        spryph.cfr_renamed_7209(lArray, 12, lArray2);
        spryph.cfr_renamed_7200(lArray4, lArray2, lArray5);
        spryph.cfr_renamed_7209(lArray, 24, lArray2);
        spryph.cfr_renamed_7200(lArray3, lArray2, lArray4);
        spryph.cfr_renamed_7209(lArray, 48, lArray2);
        spryph.cfr_renamed_7200(lArray, lArray2, lArray3);
        spryph.cfr_renamed_7209(lArray, 96, lArray2);
        spryph.cfr_renamed_7200(lArray, lArray2, arg1);
    }

    public static void cfr_renamed_8965(long[] arg0, long[] arg1) {
        long[] lArray = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_7198(arg0, lArray);
        spryph.cfr_renamed_8978(arg1, lArray, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8969(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = arg0[0] ^ 1L;
        v1[1] = arg0[1];
        v0[2] = arg0[2];
        v0[3] = arg0[3];
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long[] lArray = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_7198(arg0, lArray);
        spryph.cfr_renamed_6593(lArray, arg1);
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprmeh.cfr_renamed_8536();
        spryph.cfr_renamed_8979(arg0, arg1, lArray);
        spryph.cfr_renamed_6593(lArray, arg2);
    }

    public static void cfr_renamed_8983(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        arg1[0] = l & 0x1FFFFFFFFFFFFL;
        arg1[1] = (l >>> 49 ^ l2 << 15) & 0x1FFFFFFFFFFFFL;
        arg1[2] = (l2 >>> 34 ^ l3 << 30) & 0x1FFFFFFFFFFFFL;
        arg1[3] = l3 >>> 19 ^ l4 << 45;
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
        arg2[0] = arg0[0] ^ arg1[0];
        v2[1] = arg0[1] ^ arg1[1];
        v2[2] = arg0[2] ^ arg1[2];
        v1[3] = arg0[3] ^ arg1[3];
        v1[4] = arg0[4] ^ arg1[4];
        v0[5] = arg0[5] ^ arg1[5];
        v0[6] = arg0[6] ^ arg1[6];
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
        v1[0] = arg0[0] ^ arg1[0];
        v1[1] = arg0[1] ^ arg1[1];
        v0[2] = arg0[2] ^ arg1[2];
        v0[3] = arg0[3] ^ arg1[3];
    }

    public static int cfr_renamed_8974(long[] arg0) {
        return (int)arg0[0] & 1;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7205(long[] lArray, long l, long l2, long[] lArray2, int n) {
        void arg4;
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
        long l4 = arg0[n2 & 7] ^ arg0[n2 >>> 3 & 7] << 3;
        int n3 = 36;
        do {
            void arg1;
            n2 = (int)(arg1 >>> n3);
            long l5 = arg0[n2 & 7] ^ arg0[n2 >>> 3 & 7] << 3 ^ arg0[n2 >>> 6 & 7] << 6 ^ arg0[n2 >>> 9 & 7] << 9 ^ arg0[n2 >>> 12 & 7] << 12;
            l4 ^= l5 << n3;
            int n4 = -n3;
            l3 ^= l5 >>> n4;
        } while ((n3 -= 15) > 0);
        void v1 = arg3;
        void v2 = arg4;
        v1[v2] = v1[v2] ^ l4 & 0x1FFFFFFFFFFFFL;
        void v3 = arg4 + true;
        v1[v3] = v1[v3] ^ (l4 >>> 49 ^ l3 << 15);
    }

    public static void cfr_renamed_8979(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        long[] lArray = new long[4];
        long[] lArray2 = new long[4];
        spryph.cfr_renamed_8983(arg0, lArray);
        spryph.cfr_renamed_8983(arg1, lArray2);
        long[] lArray3 = new long[8];
        spryph.cfr_renamed_7205(lArray3, lArray[0], lArray2[0], arg2, 0);
        spryph.cfr_renamed_7205(lArray3, lArray[1], lArray2[1], arg2, 1);
        spryph.cfr_renamed_7205(lArray3, lArray[2], lArray2[2], arg2, 2);
        spryph.cfr_renamed_7205(lArray3, lArray[3], lArray2[3], arg2, 3);
        int n2 = n = 5;
        while (n2 > 0) {
            int n3 = n;
            long l = arg2[n3] ^ arg2[n - 1];
            arg2[n3] = l;
            n2 = --n;
        }
        spryph.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[1], lArray2[0] ^ lArray2[1], arg2, 1);
        spryph.cfr_renamed_7205(lArray3, lArray[2] ^ lArray[3], lArray2[2] ^ lArray2[3], arg2, 3);
        int n4 = n = 7;
        while (n4 > 1) {
            int n5 = n;
            long l = arg2[n5] ^ arg2[n - 2];
            arg2[n5] = l;
            n4 = --n;
        }
        long l = lArray[0] ^ lArray[2];
        long l2 = lArray[1] ^ lArray[3];
        long l3 = lArray2[0] ^ lArray2[2];
        long l4 = lArray2[1] ^ lArray2[3];
        long[] lArray4 = lArray3;
        spryph.cfr_renamed_7205(lArray4, l ^ l2, l3 ^ l4, arg2, 3);
        long[] lArray5 = new long[3];
        spryph.cfr_renamed_7205(lArray3, l, l3, lArray5, 0);
        spryph.cfr_renamed_7205(lArray4, l2, l4, lArray5, 1);
        long l5 = lArray5[0];
        long l6 = lArray5[1];
        long l7 = lArray5[2];
        long[] lArray6 = arg2;
        long[] lArray7 = arg2;
        long[] lArray8 = arg2;
        long[] lArray9 = arg2;
        lArray8[2] = lArray8[2] ^ l5;
        lArray9[3] = lArray9[3] ^ (l5 ^ l6);
        lArray6[4] = lArray6[4] ^ (l7 ^ l6);
        lArray7[5] = lArray7[5] ^ l7;
        spryph.cfr_renamed_8981(lArray6);
    }

    public static void cfr_renamed_8988(long[] arg0, int arg1) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1 + 3];
        long l2 = l >>> 1;
        int n = arg1;
        long l3 = l2;
        lArray2[n] = lArray2[n] ^ (l3 ^ l3 << 15);
        int n2 = arg1 + 1;
        lArray[n2] = lArray[n2] ^ l2 >>> 49;
        lArray2[arg1 + 3] = l & 1L;
    }
}


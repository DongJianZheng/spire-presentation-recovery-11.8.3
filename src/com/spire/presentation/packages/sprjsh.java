/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprweh;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class sprjsh {
    private static final long cfr_renamed_3 = 0x7FFFFFFFFFFFFFFL;
    private static final long cfr_renamed_4 = 0x1FFFFFFL;

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long[] lArray = sprvih.cfr_renamed_8558(13);
        sprjsh.cfr_renamed_7198(arg0, lArray);
        sprjsh.cfr_renamed_6593(lArray, arg1);
    }

    public static void cfr_renamed_8965(long[] arg0, long[] arg1) {
        long[] lArray = sprvih.cfr_renamed_8558(13);
        sprjsh.cfr_renamed_7198(arg0, lArray);
        sprjsh.cfr_renamed_8978(arg1, lArray, arg1);
    }

    public static void cfr_renamed_8973(long[] arg0, long[] arg1) {
        long l = sprxlh.cfr_renamed_8604(arg0[0]);
        long l2 = sprxlh.cfr_renamed_8604(arg0[1]);
        long l3 = l & 0xFFFFFFFFL | l2 << 32;
        long l4 = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[2]);
        l2 = sprxlh.cfr_renamed_8604(arg0[3]);
        long l5 = l & 0xFFFFFFFFL | l2 << 32;
        long l6 = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[4]);
        l2 = sprxlh.cfr_renamed_8604(arg0[5]);
        long l7 = l & 0xFFFFFFFFL | l2 << 32;
        long l8 = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
        l = sprxlh.cfr_renamed_8604(arg0[6]);
        long l9 = l & 0xFFFFFFFFL;
        long l10 = l >>> 32;
        arg1[0] = l3 ^ l4 << 44;
        arg1[1] = l5 ^ l6 << 44 ^ l4 >>> 20;
        arg1[2] = l7 ^ l8 << 44 ^ l6 >>> 20;
        arg1[3] = l9 ^ l10 << 44 ^ l8 >>> 20 ^ l4 << 13;
        arg1[4] = l10 >>> 20 ^ l6 << 13 ^ l4 >>> 51;
        arg1[5] = l8 << 13 ^ l6 >>> 51;
        arg1[6] = l10 << 13 ^ l8 >>> 51;
    }

    public static int cfr_renamed_8974(long[] arg0) {
        return (int)arg0[0] & 1;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7198(long[] lArray, long[] lArray2) {
        void arg1;
        long[] arg0;
        sprxlh.cfr_renamed_7199(arg0, 0, 6, (long[])arg1, 0);
        lArray2[12] = sprxlh.cfr_renamed_8599((int)arg0[6]);
    }

    public static void cfr_renamed_8971(long[] arg0, long[] arg1) {
        if (sprweh.cfr_renamed_8540(arg0)) {
            throw new IllegalStateException();
        }
        long[] lArray = sprweh.cfr_renamed_8534();
        long[] lArray2 = sprweh.cfr_renamed_8534();
        long[] lArray3 = sprweh.cfr_renamed_8534();
        sprjsh.cfr_renamed_7210(arg0, lArray);
        long[] lArray4 = lArray;
        long[] lArray5 = lArray;
        long[] lArray6 = lArray;
        long[] lArray7 = lArray;
        long[] lArray8 = lArray;
        long[] lArray9 = lArray;
        long[] lArray10 = lArray;
        sprjsh.cfr_renamed_7209(lArray, 1, lArray2);
        sprjsh.cfr_renamed_7200(lArray10, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray2, 1, lArray2);
        sprjsh.cfr_renamed_7200(lArray10, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray9, 3, lArray2);
        sprjsh.cfr_renamed_7200(lArray9, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray8, 6, lArray2);
        sprjsh.cfr_renamed_7200(lArray8, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray, 12, lArray2);
        sprjsh.cfr_renamed_7200(lArray, lArray2, lArray3);
        sprjsh.cfr_renamed_7209(lArray3, 24, lArray);
        sprjsh.cfr_renamed_7209(lArray7, 24, lArray2);
        sprjsh.cfr_renamed_7200(lArray7, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray6, 48, lArray2);
        sprjsh.cfr_renamed_7200(lArray6, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray5, 96, lArray2);
        sprjsh.cfr_renamed_7200(lArray5, lArray2, lArray);
        sprjsh.cfr_renamed_7209(lArray4, 192, lArray2);
        sprjsh.cfr_renamed_7200(lArray4, lArray2, lArray);
        sprjsh.cfr_renamed_7200(lArray, lArray3, arg1);
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
        long l9 = arg0[12];
        l6 ^= l9 << 39;
        l7 ^= l9 >>> 25 ^ l9 << 62;
        l8 ^= l9 >>> 2;
        l9 = arg0[11];
        l5 ^= l9 << 39;
        l6 ^= l9 >>> 25 ^ l9 << 62;
        l7 ^= l9 >>> 2;
        l9 = arg0[10];
        l4 ^= l9 << 39;
        l5 ^= l9 >>> 25 ^ l9 << 62;
        l6 ^= l9 >>> 2;
        l9 = arg0[9];
        l3 ^= l9 << 39;
        l4 ^= l9 >>> 25 ^ l9 << 62;
        l5 ^= l9 >>> 2;
        l9 = arg0[8];
        l2 ^= l9 << 39;
        l3 ^= l9 >>> 25 ^ l9 << 62;
        l4 ^= l9 >>> 2;
        l9 = l8;
        long l10 = l7 >>> 25;
        arg1[0] = (l ^= l9 << 39) ^ l10;
        arg1[1] = (l2 ^= l9 >>> 25 ^ l9 << 62) ^ l10 << 23;
        arg1[2] = l3 ^= l9 >>> 2;
        arg1[3] = l4;
        arg1[4] = l5;
        arg1[5] = l6;
        arg1[6] = l7 & 0x1FFFFFFL;
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
        long l9 = lArray[8];
        long l10 = lArray2[9];
        long l11 = lArray[10];
        long l12 = lArray2[11];
        long l13 = lArray[12];
        long l14 = lArray2[13];
        lArray[0] = l ^ l2 << 59;
        lArray2[1] = l2 >>> 5 ^ l3 << 54;
        lArray[2] = l3 >>> 10 ^ l4 << 49;
        lArray2[3] = l4 >>> 15 ^ l5 << 44;
        lArray[4] = l5 >>> 20 ^ l6 << 39;
        lArray2[5] = l6 >>> 25 ^ l7 << 34;
        lArray[6] = l7 >>> 30 ^ l8 << 29;
        lArray2[7] = l8 >>> 35 ^ l9 << 24;
        lArray[8] = l9 >>> 40 ^ l10 << 19;
        lArray2[9] = l10 >>> 45 ^ l11 << 14;
        lArray[10] = l11 >>> 50 ^ l12 << 9;
        lArray2[11] = l12 >>> 55 ^ l13 << 4 ^ l14 << 63;
        lArray[12] = l14 >>> 1;
    }

    public static void cfr_renamed_8978(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 13) {
            int n3 = n;
            long l = arg0[n3] ^ arg1[n];
            arg2[n3] = l;
            n2 = ++n;
        }
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
        arg2[0] = arg0[0] ^ arg1[0];
        v2[1] = arg0[1] ^ arg1[1];
        v2[2] = arg0[2] ^ arg1[2];
        v1[3] = arg0[3] ^ arg1[3];
        v1[4] = arg0[4] ^ arg1[4];
        v0[5] = arg0[5] ^ arg1[5];
        v0[6] = arg0[6] ^ arg1[6];
    }

    public static long[] cfr_renamed_1652(BigInteger arg0) {
        return sprvih.cfr_renamed_8557(409, arg0);
    }

    public static void cfr_renamed_8970(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprvih.cfr_renamed_8558(13);
        sprweh.cfr_renamed_8538(arg0, arg1);
        int n2 = n = 1;
        while (n2 < 409) {
            long[] lArray2 = arg1;
            long[] lArray3 = lArray;
            sprjsh.cfr_renamed_7198(arg1, lArray3);
            sprjsh.cfr_renamed_6593(lArray, arg1);
            sprjsh.cfr_renamed_7198(lArray2, lArray3);
            sprjsh.cfr_renamed_6593(lArray, arg1);
            sprjsh.cfr_renamed_7196(arg0, lArray2);
            n2 = n += 2;
        }
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
        int n3 = 54;
        do {
            void arg1;
            n2 = (int)(arg1 >>> n3);
            long l5 = arg0[n2 & 7] ^ arg0[n2 >>> 3 & 7] << 3;
            l4 ^= l5 << n3;
            int n4 = -n3;
            l3 ^= l5 >>> n4;
        } while ((n3 -= 6) > 0);
        void v1 = arg3;
        void v2 = arg4;
        v1[v2] = v1[v2] ^ l4 & 0x7FFFFFFFFFFFFFFL;
        void v3 = arg4 + true;
        v1[v3] = v1[v3] ^ (l4 >>> 59 ^ l3 << 5);
    }

    public static void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        long[] lArray = sprvih.cfr_renamed_8558(13);
        sprjsh.cfr_renamed_7198(arg0, lArray);
        sprjsh.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            sprjsh.cfr_renamed_7198(arg2, lArray);
            sprjsh.cfr_renamed_6593(lArray, arg2);
        }
    }

    public static void cfr_renamed_8982(long[] arg0, int arg1) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1 + 6];
        long l2 = l >>> 25;
        int n = arg1;
        lArray2[n] = lArray2[n] ^ l2;
        int n2 = arg1 + 1;
        lArray[n2] = lArray[n2] ^ l2 << 23;
        lArray2[arg1 + 6] = l & 0x1FFFFFFL;
    }

    public static void cfr_renamed_8966(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprweh.cfr_renamed_8536();
        sprjsh.cfr_renamed_8979(arg0, arg1, lArray);
        sprjsh.cfr_renamed_8978(arg2, lArray, arg2);
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprweh.cfr_renamed_8536();
        sprjsh.cfr_renamed_8979(arg0, arg1, lArray);
        sprjsh.cfr_renamed_6593(lArray, arg2);
    }

    public static void cfr_renamed_8983(long[] arg0, long[] arg1) {
        long l = arg0[0];
        long l2 = arg0[1];
        long l3 = arg0[2];
        long l4 = arg0[3];
        long l5 = arg0[4];
        long l6 = arg0[5];
        long l7 = arg0[6];
        arg1[0] = l & 0x7FFFFFFFFFFFFFFL;
        arg1[1] = (l >>> 59 ^ l2 << 5) & 0x7FFFFFFFFFFFFFFL;
        arg1[2] = (l2 >>> 54 ^ l3 << 10) & 0x7FFFFFFFFFFFFFFL;
        arg1[3] = (l3 >>> 49 ^ l4 << 15) & 0x7FFFFFFFFFFFFFFL;
        arg1[4] = (l4 >>> 44 ^ l5 << 20) & 0x7FFFFFFFFFFFFFFL;
        arg1[5] = (l5 >>> 39 ^ l6 << 25) & 0x7FFFFFFFFFFFFFFL;
        arg1[6] = l6 >>> 34 ^ l7 << 30;
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
        void v3 = arg1;
        v3[0] = v3[0] ^ arg0[0];
        v2[1] = v2[1] ^ arg0[1];
        v2[2] = v2[2] ^ arg0[2];
        v1[3] = v1[3] ^ arg0[3];
        v1[4] = v1[4] ^ arg0[4];
        v0[5] = v0[5] ^ arg0[5];
        v0[6] = v0[6] ^ arg0[6];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8969(long[] lArray, long[] lArray2) {
        long[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        void v2 = arg1;
        arg1[0] = arg0[0] ^ 1L;
        v2[1] = arg0[1];
        v2[2] = arg0[2];
        v1[3] = arg0[3];
        v1[4] = arg0[4];
        v0[5] = arg0[5];
        v0[6] = arg0[6];
    }

    public static void cfr_renamed_8979(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        long[] lArray = new long[7];
        long[] lArray2 = new long[7];
        sprjsh.cfr_renamed_8983(arg0, lArray);
        sprjsh.cfr_renamed_8983(arg1, lArray2);
        long[] lArray3 = new long[8];
        int n2 = n = 0;
        while (n2 < 7) {
            sprjsh.cfr_renamed_7205(lArray3, lArray[n], lArray2[n], arg2, n++ << 1);
            n2 = n;
        }
        long[] lArray4 = arg2;
        long[] lArray5 = arg2;
        long l = lArray4[0];
        long l2 = lArray5[1];
        arg2[1] = (l ^= arg2[2]) ^ l2;
        lArray4[2] = (l ^= arg2[4]) ^ (l2 ^= arg2[3]);
        lArray5[3] = (l ^= arg2[6]) ^ (l2 ^= arg2[5]);
        lArray4[4] = (l ^= arg2[8]) ^ (l2 ^= arg2[7]);
        lArray5[5] = (l ^= arg2[10]) ^ (l2 ^= arg2[9]);
        lArray4[6] = (l ^= arg2[12]) ^ (l2 ^= arg2[11]);
        long l3 = l ^ (l2 ^= arg2[13]);
        lArray5[7] = arg2[0] ^ l3;
        lArray4[8] = arg2[1] ^ l3;
        lArray5[9] = arg2[2] ^ l3;
        lArray4[10] = arg2[3] ^ l3;
        lArray5[11] = arg2[4] ^ l3;
        lArray4[12] = arg2[5] ^ l3;
        lArray5[13] = arg2[6] ^ l3;
        sprjsh.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[1], lArray2[0] ^ lArray2[1], arg2, 1);
        sprjsh.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[2], lArray2[0] ^ lArray2[2], arg2, 2);
        sprjsh.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[3], lArray2[0] ^ lArray2[3], arg2, 3);
        sprjsh.cfr_renamed_7205(lArray3, lArray[1] ^ lArray[2], lArray2[1] ^ lArray2[2], arg2, 3);
        sprjsh.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[4], lArray2[0] ^ lArray2[4], arg2, 4);
        sprjsh.cfr_renamed_7205(lArray3, lArray[1] ^ lArray[3], lArray2[1] ^ lArray2[3], arg2, 4);
        sprjsh.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[5], lArray2[0] ^ lArray2[5], arg2, 5);
        sprjsh.cfr_renamed_7205(lArray3, lArray[1] ^ lArray[4], lArray2[1] ^ lArray2[4], arg2, 5);
        sprjsh.cfr_renamed_7205(lArray3, lArray[2] ^ lArray[3], lArray2[2] ^ lArray2[3], arg2, 5);
        sprjsh.cfr_renamed_7205(lArray3, lArray[0] ^ lArray[6], lArray2[0] ^ lArray2[6], arg2, 6);
        sprjsh.cfr_renamed_7205(lArray3, lArray[1] ^ lArray[5], lArray2[1] ^ lArray2[5], arg2, 6);
        sprjsh.cfr_renamed_7205(lArray3, lArray[2] ^ lArray[4], lArray2[2] ^ lArray2[4], arg2, 6);
        sprjsh.cfr_renamed_7205(lArray3, lArray[1] ^ lArray[6], lArray2[1] ^ lArray2[6], arg2, 7);
        sprjsh.cfr_renamed_7205(lArray3, lArray[2] ^ lArray[5], lArray2[2] ^ lArray2[5], arg2, 7);
        sprjsh.cfr_renamed_7205(lArray3, lArray[3] ^ lArray[4], lArray2[3] ^ lArray2[4], arg2, 7);
        sprjsh.cfr_renamed_7205(lArray3, lArray[2] ^ lArray[6], lArray2[2] ^ lArray2[6], arg2, 8);
        sprjsh.cfr_renamed_7205(lArray3, lArray[3] ^ lArray[5], lArray2[3] ^ lArray2[5], arg2, 8);
        sprjsh.cfr_renamed_7205(lArray3, lArray[3] ^ lArray[6], lArray2[3] ^ lArray2[6], arg2, 9);
        sprjsh.cfr_renamed_7205(lArray3, lArray[4] ^ lArray[5], lArray2[4] ^ lArray2[5], arg2, 9);
        sprjsh.cfr_renamed_7205(lArray3, lArray[4] ^ lArray[6], lArray2[4] ^ lArray2[6], arg2, 10);
        sprjsh.cfr_renamed_7205(lArray3, lArray[5] ^ lArray[6], lArray2[5] ^ lArray2[6], arg2, 11);
        sprjsh.cfr_renamed_8981(lArray4);
    }
}


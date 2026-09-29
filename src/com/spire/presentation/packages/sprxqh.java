/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprolh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxlh;
import java.math.BigInteger;

public class sprxqh {
    private static final long[] cfr_renamed_3;
    private static final long cfr_renamed_4 = 0x7FFFFFFFFFFFFFFL;

    public static void cfr_renamed_7198(long[] arg0, long[] arg1) {
        sprxlh.cfr_renamed_7199(arg0, 0, 9, arg1, 0);
    }

    public static void cfr_renamed_8975(long[] arg0, int arg1) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long l = lArray[arg1 + 8];
        long l2 = l >>> 59;
        int n = arg1;
        long l3 = l2;
        lArray2[n] = lArray2[n] ^ (l3 ^ l3 << 2 ^ l2 << 5 ^ l2 << 10);
        lArray[arg1 + 8] = l & 0x7FFFFFFFFFFFFFFL;
    }

    public static long[] cfr_renamed_1652(BigInteger arg0) {
        return sprvih.cfr_renamed_8557(571, arg0);
    }

    public static long[] cfr_renamed_8963(long[] arg0) {
        int n;
        int n2 = 144;
        long[] lArray = new long[144 << 1];
        System.arraycopy(arg0, 0, lArray, 9, 9);
        int n3 = 0;
        int n4 = n = 7;
        while (n4 > 0) {
            sprvih.cfr_renamed_8567(9, lArray, (n3 += 18) >>> 1, 0L, lArray, n3);
            sprxqh.cfr_renamed_8975(lArray, n3);
            int n5 = n3;
            sprxqh.cfr_renamed_8976(lArray, 9, lArray, n5, lArray, n5 + 9);
            n4 = --n;
        }
        sprvih.cfr_renamed_7195(n2, lArray, 0, 4, 0L, lArray, n2);
        return lArray;
    }

    public static void cfr_renamed_8968(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_8977(arg0, arg1, lArray);
        sprxqh.cfr_renamed_8978(arg2, lArray, arg2);
    }

    static {
        long[] lArray = new long[9];
        lArray[0] = 3161836309350906777L;
        lArray[1] = -7642453882179322845L;
        lArray[2] = -3821226941089661423L;
        lArray[3] = 7312758566309945096L;
        lArray[4] = -556661012383879292L;
        lArray[5] = 8945041530681231562L;
        lArray[6] = -4750851271514160027L;
        lArray[7] = 6847946401097695794L;
        lArray[8] = 541669439031730457L;
        cfr_renamed_3 = lArray;
    }

    private static /* synthetic */ void cfr_renamed_7196(long[] arg0, long[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 9) {
            int n3 = n;
            long l = arg1[n3] ^ arg0[n];
            arg1[n3] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_7210(long[] arg0, long[] arg1) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_7198(arg0, lArray);
        sprxqh.cfr_renamed_6593(lArray, arg1);
    }

    public static void cfr_renamed_8979(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        long[] lArray = new long[16];
        int n2 = n = 0;
        while (n2 < 9) {
            sprxqh.cfr_renamed_7205(lArray, arg0[n], arg1[n], arg2, n++ << 1);
            n2 = n;
        }
        long[] lArray2 = arg2;
        long[] lArray3 = arg2;
        long l = lArray2[0];
        long l2 = lArray3[1];
        arg2[1] = (l ^= arg2[2]) ^ l2;
        lArray2[2] = (l ^= arg2[4]) ^ (l2 ^= arg2[3]);
        lArray3[3] = (l ^= arg2[6]) ^ (l2 ^= arg2[5]);
        lArray2[4] = (l ^= arg2[8]) ^ (l2 ^= arg2[7]);
        lArray3[5] = (l ^= arg2[10]) ^ (l2 ^= arg2[9]);
        lArray2[6] = (l ^= arg2[12]) ^ (l2 ^= arg2[11]);
        lArray3[7] = (l ^= arg2[14]) ^ (l2 ^= arg2[13]);
        lArray2[8] = (l ^= arg2[16]) ^ (l2 ^= arg2[15]);
        long l3 = l ^ (l2 ^= arg2[17]);
        lArray3[9] = arg2[0] ^ l3;
        lArray2[10] = arg2[1] ^ l3;
        lArray3[11] = arg2[2] ^ l3;
        lArray2[12] = arg2[3] ^ l3;
        lArray3[13] = arg2[4] ^ l3;
        lArray2[14] = arg2[5] ^ l3;
        lArray3[15] = arg2[6] ^ l3;
        lArray2[16] = arg2[7] ^ l3;
        lArray3[17] = arg2[8] ^ l3;
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[1], arg1[0] ^ arg1[1], arg2, 1);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[2], arg1[0] ^ arg1[2], arg2, 2);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[3], arg1[0] ^ arg1[3], arg2, 3);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[2], arg1[1] ^ arg1[2], arg2, 3);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[4], arg1[0] ^ arg1[4], arg2, 4);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[3], arg1[1] ^ arg1[3], arg2, 4);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[5], arg1[0] ^ arg1[5], arg2, 5);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[4], arg1[1] ^ arg1[4], arg2, 5);
        sprxqh.cfr_renamed_7205(lArray, arg0[2] ^ arg0[3], arg1[2] ^ arg1[3], arg2, 5);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[6], arg1[0] ^ arg1[6], arg2, 6);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[5], arg1[1] ^ arg1[5], arg2, 6);
        sprxqh.cfr_renamed_7205(lArray, arg0[2] ^ arg0[4], arg1[2] ^ arg1[4], arg2, 6);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[7], arg1[0] ^ arg1[7], arg2, 7);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[6], arg1[1] ^ arg1[6], arg2, 7);
        sprxqh.cfr_renamed_7205(lArray, arg0[2] ^ arg0[5], arg1[2] ^ arg1[5], arg2, 7);
        sprxqh.cfr_renamed_7205(lArray, arg0[3] ^ arg0[4], arg1[3] ^ arg1[4], arg2, 7);
        sprxqh.cfr_renamed_7205(lArray, arg0[0] ^ arg0[8], arg1[0] ^ arg1[8], arg2, 8);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[7], arg1[1] ^ arg1[7], arg2, 8);
        sprxqh.cfr_renamed_7205(lArray, arg0[2] ^ arg0[6], arg1[2] ^ arg1[6], arg2, 8);
        sprxqh.cfr_renamed_7205(lArray, arg0[3] ^ arg0[5], arg1[3] ^ arg1[5], arg2, 8);
        sprxqh.cfr_renamed_7205(lArray, arg0[1] ^ arg0[8], arg1[1] ^ arg1[8], arg2, 9);
        sprxqh.cfr_renamed_7205(lArray, arg0[2] ^ arg0[7], arg1[2] ^ arg1[7], arg2, 9);
        sprxqh.cfr_renamed_7205(lArray, arg0[3] ^ arg0[6], arg1[3] ^ arg1[6], arg2, 9);
        sprxqh.cfr_renamed_7205(lArray, arg0[4] ^ arg0[5], arg1[4] ^ arg1[5], arg2, 9);
        sprxqh.cfr_renamed_7205(lArray, arg0[2] ^ arg0[8], arg1[2] ^ arg1[8], arg2, 10);
        sprxqh.cfr_renamed_7205(lArray, arg0[3] ^ arg0[7], arg1[3] ^ arg1[7], arg2, 10);
        sprxqh.cfr_renamed_7205(lArray, arg0[4] ^ arg0[6], arg1[4] ^ arg1[6], arg2, 10);
        sprxqh.cfr_renamed_7205(lArray, arg0[3] ^ arg0[8], arg1[3] ^ arg1[8], arg2, 11);
        sprxqh.cfr_renamed_7205(lArray, arg0[4] ^ arg0[7], arg1[4] ^ arg1[7], arg2, 11);
        sprxqh.cfr_renamed_7205(lArray, arg0[5] ^ arg0[6], arg1[5] ^ arg1[6], arg2, 11);
        sprxqh.cfr_renamed_7205(lArray, arg0[4] ^ arg0[8], arg1[4] ^ arg1[8], arg2, 12);
        sprxqh.cfr_renamed_7205(lArray, arg0[5] ^ arg0[7], arg1[5] ^ arg1[7], arg2, 12);
        sprxqh.cfr_renamed_7205(lArray, arg0[5] ^ arg0[8], arg1[5] ^ arg1[8], arg2, 13);
        sprxqh.cfr_renamed_7205(lArray, arg0[6] ^ arg0[7], arg1[6] ^ arg1[7], arg2, 13);
        sprxqh.cfr_renamed_7205(lArray, arg0[6] ^ arg0[8], arg1[6] ^ arg1[8], arg2, 14);
        sprxqh.cfr_renamed_7205(lArray, arg0[7] ^ arg0[8], arg1[7] ^ arg1[8], arg2, 15);
    }

    public static void cfr_renamed_8966(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_8979(arg0, arg1, lArray);
        sprxqh.cfr_renamed_8978(arg2, lArray, arg2);
    }

    public static void cfr_renamed_8970(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprolh.cfr_renamed_8536();
        sprolh.cfr_renamed_8538(arg0, arg1);
        int n2 = n = 1;
        while (n2 < 571) {
            long[] lArray2 = arg1;
            long[] lArray3 = lArray;
            sprxqh.cfr_renamed_7198(arg1, lArray3);
            sprxqh.cfr_renamed_6593(lArray, arg1);
            sprxqh.cfr_renamed_7198(lArray2, lArray3);
            sprxqh.cfr_renamed_6593(lArray, arg1);
            sprxqh.cfr_renamed_7196(arg0, lArray2);
            n2 = n += 2;
        }
    }

    public static void cfr_renamed_7209(long[] arg0, int arg1, long[] arg2) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_7198(arg0, lArray);
        sprxqh.cfr_renamed_6593(lArray, arg2);
        while (--arg1 > 0) {
            sprxqh.cfr_renamed_7198(arg2, lArray);
            sprxqh.cfr_renamed_6593(lArray, arg2);
        }
    }

    public static void cfr_renamed_6593(long[] arg0, long[] arg1) {
        int n;
        long l = arg0[9];
        long l2 = arg0[17];
        long l3 = l;
        l = l3 ^ l2 >>> 59 ^ l2 >>> 57 ^ l2 >>> 54 ^ l2 >>> 49;
        l3 = arg0[8] ^ l2 << 5 ^ l2 << 7 ^ l2 << 10 ^ l2 << 15;
        int n2 = n = 16;
        while (n2 >= 10) {
            l2 = arg0[n];
            arg1[n - 8] = l3 ^ l2 >>> 59 ^ l2 >>> 57 ^ l2 >>> 54 ^ l2 >>> 49;
            long l4 = arg0[n - 9] ^ l2 << 5 ^ l2 << 7 ^ l2 << 10;
            l3 = l4 ^ l2 << 15;
            n2 = --n;
        }
        l2 = l;
        arg1[1] = l3 ^ l2 >>> 59 ^ l2 >>> 57 ^ l2 >>> 54 ^ l2 >>> 49;
        l3 = arg0[0] ^ l2 << 5 ^ l2 << 7 ^ l2 << 10 ^ l2 << 15;
        long l5 = arg1[8];
        long l6 = l5 >>> 59;
        arg1[0] = l3 ^ l6 ^ l6 << 2 ^ l6 << 5 ^ l6 << 10;
        arg1[8] = l5 & 0x7FFFFFFFFFFFFFFL;
    }

    public static void cfr_renamed_8967(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 9) {
            int n3 = n;
            long l = arg2[n3] ^ (arg0[n] ^ arg1[n]);
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    private static /* synthetic */ void cfr_renamed_8976(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5) {
        int n;
        int n2 = n = 0;
        while (n2 < 9) {
            int n3 = arg5 + n;
            long l = arg0[arg1 + n] ^ arg2[arg3 + n];
            arg4[n3] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_8969(long[] lArray, long[] lArray2) {
        int n;
        long[] arg0;
        arg1[0] = arg0[0] ^ 1L;
        int n2 = n = 1;
        while (n2 < 9) {
            int n3 = n++;
            arg1[n3] = arg0[n3];
            n2 = n;
        }
    }

    public static void cfr_renamed_8978(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 18) {
            int n3 = n;
            long l = arg0[n3] ^ arg1[n];
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_8965(long[] arg0, long[] arg1) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_7198(arg0, lArray);
        sprxqh.cfr_renamed_8978(arg1, lArray, arg1);
    }

    public static void cfr_renamed_8973(long[] arg0, long[] arg1) {
        int n;
        long[] lArray = sprolh.cfr_renamed_8534();
        long[] lArray2 = sprolh.cfr_renamed_8534();
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 4) {
            long l = sprxlh.cfr_renamed_8604(arg0[n2]);
            long l2 = sprxlh.cfr_renamed_8604(arg0[++n2]);
            ++n2;
            lArray[n] = l & 0xFFFFFFFFL | l2 << 32;
            lArray2[n++] = l >>> 32 | l2 & 0xFFFFFFFF00000000L;
            n3 = n;
        }
        long l = sprxlh.cfr_renamed_8604(arg0[n2]);
        lArray[4] = l & 0xFFFFFFFFL;
        lArray2[4] = l >>> 32;
        sprxqh.cfr_renamed_7200(lArray2, cfr_renamed_3, arg1);
        sprxqh.cfr_renamed_7206(arg1, lArray, arg1);
    }

    public static void cfr_renamed_8964(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_8977(arg0, arg1, lArray);
        sprxqh.cfr_renamed_6593(lArray, arg2);
    }

    public static void cfr_renamed_8971(long[] arg0, long[] arg1) {
        if (sprolh.cfr_renamed_8540(arg0)) {
            throw new IllegalStateException();
        }
        long[] lArray = sprolh.cfr_renamed_8534();
        long[] lArray2 = sprolh.cfr_renamed_8534();
        long[] lArray3 = sprolh.cfr_renamed_8534();
        sprxqh.cfr_renamed_7210(arg0, lArray3);
        sprxqh.cfr_renamed_7210(lArray3, lArray);
        long[] lArray4 = lArray;
        long[] lArray5 = lArray;
        sprxqh.cfr_renamed_7210(lArray, lArray2);
        sprxqh.cfr_renamed_7200(lArray, lArray2, lArray);
        sprxqh.cfr_renamed_7209(lArray, 2, lArray2);
        sprxqh.cfr_renamed_7200(lArray, lArray2, lArray5);
        sprxqh.cfr_renamed_7200(lArray4, lArray3, lArray5);
        sprxqh.cfr_renamed_7209(lArray, 5, lArray2);
        sprxqh.cfr_renamed_7200(lArray, lArray2, lArray4);
        sprxqh.cfr_renamed_7209(lArray2, 5, lArray2);
        sprxqh.cfr_renamed_7200(lArray, lArray2, lArray);
        sprxqh.cfr_renamed_7209(lArray, 15, lArray2);
        sprxqh.cfr_renamed_7200(lArray, lArray2, lArray3);
        sprxqh.cfr_renamed_7209(lArray3, 30, lArray);
        long[] lArray6 = lArray;
        long[] lArray7 = lArray;
        long[] lArray8 = lArray;
        sprxqh.cfr_renamed_7209(lArray, 30, lArray2);
        sprxqh.cfr_renamed_7200(lArray8, lArray2, lArray);
        sprxqh.cfr_renamed_7209(lArray, 60, lArray2);
        sprxqh.cfr_renamed_7200(lArray, lArray2, lArray8);
        sprxqh.cfr_renamed_7209(lArray2, 60, lArray2);
        sprxqh.cfr_renamed_7200(lArray7, lArray2, lArray);
        sprxqh.cfr_renamed_7209(lArray, 180, lArray2);
        sprxqh.cfr_renamed_7200(lArray6, lArray2, lArray7);
        sprxqh.cfr_renamed_7209(lArray2, 180, lArray2);
        sprxqh.cfr_renamed_7200(lArray6, lArray2, lArray);
        sprxqh.cfr_renamed_7200(lArray, lArray3, arg1);
    }

    public static void cfr_renamed_8977(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 15;
        int n7 = n5 = 56;
        while (n7 >= 0) {
            int n8 = n4 = 1;
            while (n8 < 9) {
                n3 = (int)(arg0[n4] >>> n5);
                n2 = n3 & n6;
                n = n3 >>> 4 & n6;
                int n9 = n4;
                sprxqh.cfr_renamed_8980(arg1, 9 * n2, arg1, 9 * (n + 16), arg2, n9 - 1);
                n8 = n4 += 2;
            }
            sprvih.cfr_renamed_8566(16, arg2, 0, 8, 0L);
            n7 = n5 -= 8;
        }
        int n10 = n5 = 56;
        while (n10 >= 0) {
            int n11 = n4 = 0;
            while (n11 < 9) {
                n3 = (int)(arg0[n4] >>> n5);
                n2 = n3 & n6;
                n = n3 >>> 4 & n6;
                int n12 = n4;
                sprxqh.cfr_renamed_8980(arg1, 9 * n2, arg1, 9 * (n + 16), arg2, n12);
                n11 = n4 += 2;
            }
            if (n5 > 0) {
                sprvih.cfr_renamed_8566(18, arg2, 0, 8, 0L);
            }
            n10 = n5 -= 8;
        }
    }

    public static int cfr_renamed_8974(long[] arg0) {
        return (int)(arg0[0] ^ arg0[8] >>> 49 ^ arg0[8] >>> 57) & 1;
    }

    public static void cfr_renamed_7206(long[] arg0, long[] arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 9) {
            int n3 = n;
            long l = arg0[n3] ^ arg1[n];
            arg2[n3] = l;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7205(long[] lArray, long l, long l2, long[] lArray2, int n) {
        void arg4;
        void arg3;
        int n2;
        void arg1;
        long[] arg0;
        int n3;
        void arg2;
        arg0[1] = arg2;
        int n4 = n3 = 2;
        while (n4 < 16) {
            int n5 = n3;
            arg0[n5] = arg0[n3 >>> 1] << 1;
            long l3 = arg0[n3] ^ arg2;
            arg0[n5 + 1] = l3;
            n4 = n3 += 2;
        }
        n3 = (int)arg1;
        long l4 = 0L;
        long l5 = arg0[n3 & 0xF] ^ arg0[n3 >>> 4 & 0xF] << 4;
        int n6 = 56;
        do {
            n3 = (int)(arg1 >>> n6);
            long l6 = arg0[n3 & 0xF] ^ arg0[n3 >>> 4 & 0xF] << 4;
            l5 ^= l6 << n6;
            int n7 = -n6;
            l4 ^= l6 >>> n7;
        } while ((n6 -= 8) > 0);
        int n8 = n2 = 0;
        while (n8 < 7) {
            arg1 = (arg1 & 0xFEFEFEFEFEFEFEFEL) >>> 1;
            void v5 = arg2 << n2 >> 63;
            l4 ^= arg1 & v5;
            n8 = ++n2;
        }
        void v6 = arg3;
        void v7 = arg4;
        v6[v7] = v6[v7] ^ l5;
        void v8 = v7 + true;
        v6[v8] = v6[v8] ^ l4;
    }

    private static /* synthetic */ void cfr_renamed_8980(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5) {
        int n;
        int n2 = n = 0;
        while (n2 < 9) {
            int n3 = arg5 + n;
            long l = arg4[n3] ^ (arg0[arg1 + n] ^ arg2[arg3 + n]);
            arg4[n3] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_7200(long[] arg0, long[] arg1, long[] arg2) {
        long[] lArray = sprolh.cfr_renamed_8536();
        sprxqh.cfr_renamed_8979(arg0, arg1, lArray);
        sprxqh.cfr_renamed_6593(lArray, arg2);
    }
}


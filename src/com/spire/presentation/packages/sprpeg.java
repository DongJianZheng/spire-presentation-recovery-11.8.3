/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpbg;

public abstract class sprpeg {
    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_6662(long[] lArray, int n, long l, long l2, long l3, long l4) {
        void arg5;
        void arg3;
        void arg4;
        void arg2;
        void arg1;
        long[] arg0;
        long[] lArray2 = arg0;
        void v1 = arg1;
        long[] lArray3 = arg0;
        void v3 = arg1;
        sprpeg.cfr_renamed_6663(arg0, (int)v3, (long)arg2, (long)arg4);
        sprpeg.cfr_renamed_6663(arg0, (int)(v3 + 2), (long)arg3, (long)arg5);
        void v4 = arg1 + 2;
        lArray3[v4] = lArray3[v4] ^ arg0[arg1 + true];
        arg0[v1 + true] = arg0[arg1] ^ arg0[arg1 + 2];
        void v5 = v1 + 2;
        lArray2[v5] = lArray2[v5] ^ arg0[arg1 + 3];
        sprpeg.cfr_renamed_6664(arg0, n + 1, (long)(arg2 ^ arg3), (long)(arg4 ^ arg5));
    }

    private static /* synthetic */ long cfr_renamed_6665(long arg0, long arg1) {
        long l = -(arg1 & 1L) & arg0;
        l ^= (-(arg1 >>> 1 & 1L) & arg0) << 1;
        l ^= (-(arg1 >>> 2 & 1L) & arg0) << 2;
        l ^= (-(arg1 >>> 3 & 1L) & arg0) << 3;
        l ^= (-(arg1 >>> 4 & 1L) & arg0) << 4;
        l ^= (-(arg1 >>> 5 & 1L) & arg0) << 5;
        l ^= (-(arg1 >>> 6 & 1L) & arg0) << 6;
        l ^= (-(arg1 >>> 7 & 1L) & arg0) << 7;
        l ^= (-(arg1 >>> 8 & 1L) & arg0) << 8;
        l ^= (-(arg1 >>> 9 & 1L) & arg0) << 9;
        l ^= (-(arg1 >>> 10 & 1L) & arg0) << 10;
        l ^= (-(arg1 >>> 11 & 1L) & arg0) << 11;
        l ^= (-(arg1 >>> 12 & 1L) & arg0) << 12;
        l ^= (-(arg1 >>> 13 & 1L) & arg0) << 13;
        l ^= (-(arg1 >>> 14 & 1L) & arg0) << 14;
        l ^= (-(arg1 >>> 15 & 1L) & arg0) << 15;
        l ^= (-(arg1 >>> 16 & 1L) & arg0) << 16;
        l ^= (-(arg1 >>> 17 & 1L) & arg0) << 17;
        l ^= (-(arg1 >>> 18 & 1L) & arg0) << 18;
        l ^= (-(arg1 >>> 19 & 1L) & arg0) << 19;
        l ^= (-(arg1 >>> 20 & 1L) & arg0) << 20;
        l ^= (-(arg1 >>> 21 & 1L) & arg0) << 21;
        l ^= (-(arg1 >>> 22 & 1L) & arg0) << 22;
        l ^= (-(arg1 >>> 23 & 1L) & arg0) << 23;
        l ^= (-(arg1 >>> 24 & 1L) & arg0) << 24;
        l ^= (-(arg1 >>> 25 & 1L) & arg0) << 25;
        l ^= (-(arg1 >>> 26 & 1L) & arg0) << 26;
        l ^= (-(arg1 >>> 27 & 1L) & arg0) << 27;
        l ^= (-(arg1 >>> 28 & 1L) & arg0) << 28;
        l ^= (-(arg1 >>> 29 & 1L) & arg0) << 29;
        l ^= (-(arg1 >>> 30 & 1L) & arg0) << 30;
        return l ^= (-(arg1 >>> 31 & 1L) & arg0) << 31;
    }

    public static /* synthetic */ void cfr_renamed_6666(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5, long[] arg6) {
        sprpeg.cfr_renamed_6667(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static /* synthetic */ void cfr_renamed_6668(long[] arg0, int arg1, long[] arg2, int arg3) {
        sprpeg.cfr_renamed_6669(arg0, arg1, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_6670(long[] lArray, long[] lArray2, int n, long[] lArray3, int n2, long[] lArray4, long[] lArray5, long[] lArray6, long[] lArray7) {
        void arg6;
        void arg5;
        long[] arg0;
        void arg8;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg7;
        void v0 = arg7;
        void v1 = arg7;
        void v2 = arg7;
        void v3 = arg7;
        void v4 = arg7;
        void v5 = arg7;
        sprpeg.cfr_renamed_6662((long[])v5, 0, (long)arg1[arg2], (long)arg1[arg2 + true], (long)arg3[arg4], (long)arg3[arg4 + true]);
        sprpeg.cfr_renamed_6662((long[])v5, 4, (long)arg1[arg2 + 2], (long)arg1[arg2 + 3], (long)arg3[arg4 + 2], (long)arg3[arg4 + 3]);
        v4[4] = v4[4] ^ arg7[2];
        v4[5] = v4[5] ^ arg7[3];
        void v6 = arg7;
        v6[2] = v6[4] ^ arg7[0];
        v3[3] = arg7[5] ^ arg7[1];
        v3[4] = v3[4] ^ arg7[6];
        v2[5] = v2[5] ^ arg7[7];
        sprpeg.cfr_renamed_6671((long[])v2, 2, (long)(arg1[arg2] ^ arg1[arg2 + 2]), (long)(arg1[arg2 + true] ^ arg1[arg2 + 3]), (long)(arg3[arg4] ^ arg3[arg4 + 2]), (long)(arg3[arg4 + true] ^ arg3[arg4 + 3]), (long[])arg8);
        sprpeg.cfr_renamed_6672((long[])v1, 8, (long[])arg1, (int)(arg2 + 4), (long[])arg3, (int)(arg4 + 4), (long[])arg8);
        v1[8] = v1[8] ^ arg7[4];
        v0[9] = v0[9] ^ arg7[5];
        v0[10] = v0[10] ^ arg7[6];
        v0[11] = v0[11] ^ arg7[7];
        long[] lArray8 = arg0;
        long[] lArray9 = arg0;
        long[] lArray10 = arg0;
        long[] lArray11 = arg0;
        long[] lArray12 = arg0;
        long[] lArray13 = arg0;
        long[] lArray14 = arg0;
        long[] lArray15 = arg0;
        long[] lArray16 = arg0;
        long[] lArray17 = arg0;
        long[] lArray18 = arg0;
        long[] lArray19 = arg0;
        long[] lArray20 = arg0;
        long[] lArray21 = arg0;
        long[] lArray22 = arg0;
        long[] lArray23 = arg0;
        lArray22[0] = lArray22[0] ^ arg7[0];
        lArray23[1] = lArray23[1] ^ arg7[1];
        lArray20[2] = lArray20[2] ^ arg7[2];
        lArray21[3] = lArray21[3] ^ arg7[3];
        lArray18[4] = lArray18[4] ^ (arg7[8] ^ arg7[0]);
        lArray19[5] = lArray19[5] ^ (arg7[9] ^ arg7[1]);
        lArray16[6] = lArray16[6] ^ (arg7[10] ^ arg7[2]);
        lArray17[7] = lArray17[7] ^ (arg7[11] ^ arg7[3]);
        lArray14[8] = lArray14[8] ^ (arg7[8] ^ arg7[12]);
        lArray15[9] = lArray15[9] ^ (arg7[9] ^ arg7[13]);
        lArray12[10] = lArray12[10] ^ (arg7[10] ^ arg7[14]);
        lArray13[11] = lArray13[11] ^ (arg7[11] ^ arg7[15]);
        lArray10[12] = lArray10[12] ^ (arg7[12] ^ arg7[16]);
        lArray11[13] = lArray11[13] ^ arg7[13];
        lArray8[14] = lArray8[14] ^ arg7[14];
        lArray8[15] = lArray8[15] ^ arg7[15];
        lArray9[16] = lArray9[16] ^ arg7[16];
        void v23 = arg5;
        void v24 = arg5;
        v24[0] = arg1[arg2] ^ arg1[arg2 + 4];
        v24[1] = arg1[arg2 + true] ^ arg1[arg2 + 5];
        v23[2] = arg1[arg2 + 2] ^ arg1[arg2 + 6];
        v23[3] = arg1[arg2 + 3] ^ arg1[arg2 + 7];
        arg5[4] = arg1[arg2 + 8];
        void v25 = arg6;
        void v26 = arg6;
        v26[0] = arg3[arg4] ^ arg3[arg4 + 4];
        v26[1] = arg3[arg4 + true] ^ arg3[arg4 + 5];
        v25[2] = arg3[arg4 + 2] ^ arg3[arg4 + 6];
        v25[3] = arg3[arg4 + 3] ^ arg3[arg4 + 7];
        v25[4] = arg3[arg4 + 8];
        sprpeg.cfr_renamed_6673(lArray, 4, (long[])arg5, 0, (long[])arg6, 0, (long[])arg7);
    }

    private static /* synthetic */ void cfr_renamed_6674(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long[] lArray3 = arg0;
        long[] lArray4 = arg0;
        long[] lArray5 = arg0;
        sprpeg.cfr_renamed_6675(arg0, 0, arg1, arg2, arg3, arg4);
        sprpeg.cfr_renamed_6675(arg0, 6, arg1, arg2 + 3, arg3, arg4 + 3);
        long l = arg1[arg2] ^ arg1[arg2 + 3];
        long l2 = arg1[arg2 + 1] ^ arg1[arg2 + 4];
        long l3 = arg1[arg2 + 2] ^ arg1[arg2 + 5];
        long l4 = arg3[arg4] ^ arg3[arg4 + 3];
        long l5 = arg3[arg4 + 1] ^ arg3[arg4 + 4];
        long l6 = arg3[arg4 + 2] ^ arg3[arg4 + 5];
        lArray5[6] = lArray5[6] ^ arg0[3];
        lArray3[7] = lArray3[7] ^ arg0[4];
        lArray4[8] = lArray4[8] ^ arg0[5];
        sprpeg.cfr_renamed_6663(arg5, 0, l, l4);
        sprpeg.cfr_renamed_6663(arg5, 4, l3, l6);
        sprpeg.cfr_renamed_6663(arg5, 2, l2, l5);
        lArray3[3] = arg0[6] ^ arg0[0] ^ arg5[0];
        long[] lArray6 = arg5;
        long[] lArray7 = arg5;
        arg5[1] = arg5[1] ^ arg5[2];
        lArray6[0] = lArray6[0] ^ arg5[1];
        lArray7[3] = lArray7[3] ^ arg5[4];
        arg5[4] = arg5[3] ^ arg5[5];
        arg0[5] = arg0[8] ^ arg0[2] ^ arg5[3] ^ arg5[0];
        lArray[6] = lArray[6] ^ (arg0[9] ^ arg5[1] ^ arg5[4]);
        arg0[4] = arg0[7] ^ arg0[1] ^ arg5[0];
        lArray2[7] = lArray2[7] ^ (arg0[10] ^ arg5[4]);
        lArray[8] = lArray[8] ^ (arg0[11] ^ arg5[5]);
        sprpeg.cfr_renamed_6664(lArray2, 4, l ^ l2, l4 ^ l5);
        sprpeg.cfr_renamed_6664(lArray, 6, l2 ^ l3, l5 ^ l6);
        sprpeg.cfr_renamed_6664(lArray2, 5, l ^ l3, l4 ^ l6);
    }

    public static /* synthetic */ void cfr_renamed_6676(long[] arg0, int arg1, long[] arg2, int arg3) {
        sprpeg.cfr_renamed_6677(arg0, arg1, arg2, arg3);
    }

    public abstract void cfr_renamed_6678(sprpbg var1, sprpbg var2, sprpbg var3);

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_6679(long[] lArray, int n, long[] lArray2, int n2, long[] lArray3, int n3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        long[] arg0;
        long[] lArray4 = arg0;
        void v1 = arg1;
        long[] lArray5 = arg0;
        void v3 = arg1;
        sprpeg.cfr_renamed_6663(arg0, (int)v3, (long)arg2[arg3], (long)arg4[arg5]);
        sprpeg.cfr_renamed_6663(arg0, (int)(v3 + 2), (long)arg2[arg3 + true], (long)arg4[arg5 + true]);
        void v4 = arg1 + 2;
        lArray5[v4] = lArray5[v4] ^ arg0[arg1 + true];
        arg0[v1 + true] = arg0[arg1] ^ arg0[arg1 + 2];
        void v5 = v1 + 2;
        lArray4[v5] = lArray4[v5] ^ arg0[arg1 + 3];
        sprpeg.cfr_renamed_6664(arg0, n + 1, (long)(arg2[arg3] ^ arg2[arg3 + true]), (long)(arg4[arg5] ^ arg4[arg5 + true]));
    }

    public abstract void cfr_renamed_6680(sprpbg var1, sprpbg var2, sprpbg var3);

    public abstract void cfr_renamed_6681(long[] var1, long[] var2, int var3);

    private static /* synthetic */ long cfr_renamed_6682(long arg0) {
        long l = arg0;
        arg0 = (l ^ l << 16) & 0xFFFF0000FFFFL;
        arg0 = (arg0 ^ arg0 << 8) & 0xFF00FF00FF00FFL;
        arg0 = (arg0 ^ arg0 << 4) & 0xF0F0F0F0F0F0F0FL;
        arg0 = (arg0 ^ arg0 << 2) & 0x3333333333333333L;
        return (arg0 ^ arg0 << 1) & 0x5555555555555555L;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_6677(long[] lArray, int n, long[] lArray2, int n2) {
        void arg3;
        void arg2;
        void arg1;
        long[] arg0;
        sprpeg.cfr_renamed_6669(arg0, (int)(arg1 + 4), (long[])arg2, (int)(arg3 + 2));
        sprpeg.cfr_renamed_6669(arg0, n, (long[])arg2, (int)arg3);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_6669(long[] lArray, int n, long[] lArray2, int n2) {
        void arg3;
        void arg2;
        void arg1;
        long[] arg0;
        sprpeg.cfr_renamed_6683(arg0, (int)(arg1 + 2), (long)arg2[arg3 + true]);
        sprpeg.cfr_renamed_6683(arg0, n, (long)arg2[arg3]);
    }

    private static /* synthetic */ void cfr_renamed_6667(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5, long[] arg6) {
        long[] lArray = arg0;
        long[] lArray2 = arg5;
        long[] lArray3 = arg5;
        long[] lArray4 = arg5;
        long[] lArray5 = arg5;
        long[] lArray6 = arg5;
        long[] lArray7 = arg5;
        long[] lArray8 = arg5;
        long[] lArray9 = arg5;
        long[] lArray10 = arg5;
        sprpeg.cfr_renamed_6675(arg5, 0, arg1, arg2, arg3, arg4);
        sprpeg.cfr_renamed_6662(arg5, 6, arg1[arg2 + 3], arg1[arg2 + 4], arg3[arg4 + 3], arg3[arg4 + 4]);
        sprpeg.cfr_renamed_6663(arg5, 10, arg1[arg2 + 5], arg3[arg4 + 5]);
        arg5[12] = sprpeg.cfr_renamed_6665(arg1[arg2 + 6], arg3[arg4 + 6]) ^ arg5[11];
        arg5[11] = arg5[10] ^ arg5[12];
        sprpeg.cfr_renamed_6664(arg5, 11, arg1[arg2 + 5] ^ arg1[arg2 + 6], arg3[arg4 + 5] ^ arg3[arg4 + 6]);
        lArray9[8] = lArray9[8] ^ arg5[10];
        lArray10[11] = lArray10[11] ^ arg5[9];
        arg5[10] = arg5[8] ^ arg5[12];
        lArray8[8] = lArray8[8] ^ arg5[6];
        arg5[9] = arg5[11] ^ arg5[7];
        lArray7[6] = lArray7[6] ^ arg5[3];
        lArray6[7] = lArray6[7] ^ arg5[4];
        lArray6[8] = lArray6[8] ^ arg5[5];
        sprpeg.cfr_renamed_6671(arg5, 8, arg1[arg2 + 3] ^ arg1[arg2 + 5], arg1[arg2 + 4] ^ arg1[arg2 + 6], arg3[arg4 + 3] ^ arg3[arg4 + 5], arg3[arg4 + 4] ^ arg3[arg4 + 6], arg6);
        long[] lArray11 = arg0;
        long[] lArray12 = arg0;
        long[] lArray13 = arg0;
        long[] lArray14 = arg0;
        long[] lArray15 = arg0;
        long[] lArray16 = arg0;
        long[] lArray17 = arg0;
        long[] lArray18 = arg0;
        long[] lArray19 = arg0;
        long[] lArray20 = arg0;
        long[] lArray21 = arg0;
        long[] lArray22 = arg0;
        lArray21[0] = lArray21[0] ^ arg5[0];
        lArray22[1] = lArray22[1] ^ arg5[1];
        lArray19[2] = lArray19[2] ^ arg5[2];
        lArray20[3] = lArray20[3] ^ (arg5[6] ^ arg5[0]);
        lArray17[4] = lArray17[4] ^ (arg5[7] ^ arg5[1]);
        lArray18[5] = lArray18[5] ^ (arg5[8] ^ arg5[2]);
        lArray15[6] = lArray15[6] ^ (arg5[6] ^ arg5[9]);
        lArray16[7] = lArray16[7] ^ (arg5[7] ^ arg5[10]);
        lArray13[8] = lArray13[8] ^ (arg5[8] ^ arg5[11]);
        lArray14[9] = lArray14[9] ^ (arg5[9] ^ arg5[12]);
        lArray11[10] = lArray11[10] ^ arg5[10];
        lArray12[11] = lArray12[11] ^ arg5[11];
        arg0[12] = arg0[12] ^ arg5[12];
        long l = arg1[arg2] ^ arg1[arg2 + 3];
        long l2 = arg1[arg2 + 1] ^ arg1[arg2 + 4];
        long l3 = arg1[arg2 + 2] ^ arg1[arg2 + 5];
        long l4 = arg1[arg2 + 6];
        long l5 = arg3[arg4] ^ arg3[arg4 + 3];
        long l6 = arg3[arg4 + 1] ^ arg3[arg4 + 4];
        long l7 = arg3[arg4 + 2] ^ arg3[arg4 + 5];
        long l8 = arg3[arg4 + 6];
        sprpeg.cfr_renamed_6662(lArray4, 0, l, l2, l5, l6);
        sprpeg.cfr_renamed_6663(lArray5, 4, l3, l7);
        lArray4[6] = sprpeg.cfr_renamed_6665(l4, l8) ^ arg5[5];
        lArray5[5] = arg5[4] ^ arg5[6];
        sprpeg.cfr_renamed_6664(lArray4, 5, l3 ^ l4, l7 ^ l8);
        arg0[3] = arg0[3] ^ arg5[0];
        lArray[4] = lArray[4] ^ arg5[1];
        lArray2[2] = lArray2[2] ^ arg5[4];
        lArray3[3] = lArray3[3] ^ arg5[5];
        long[] lArray23 = arg0;
        long[] lArray24 = arg0;
        long[] lArray25 = arg0;
        long[] lArray26 = arg0;
        arg0[5] = arg0[5] ^ (arg5[2] ^ arg5[0]);
        lArray25[6] = lArray25[6] ^ (arg5[3] ^ arg5[1]);
        lArray26[7] = lArray26[7] ^ (arg5[2] ^ arg5[6]);
        lArray23[8] = lArray23[8] ^ arg5[3];
        lArray24[9] = lArray24[9] ^ arg5[6];
        sprpeg.cfr_renamed_6671(arg0, 5, l ^ l3, l2 ^ l4, l5 ^ l7, l6 ^ l8, arg5);
    }

    public static /* synthetic */ void cfr_renamed_6684(long[] arg0, int arg1, long arg2) {
        sprpeg.cfr_renamed_6683(arg0, arg1, arg2);
    }

    private static /* synthetic */ void cfr_renamed_6671(long[] arg0, int arg1, long arg2, long arg3, long arg4, long arg5, long[] arg6) {
        long[] lArray = arg0;
        long[] lArray2 = arg6;
        int n = arg1;
        sprpeg.cfr_renamed_6663(arg6, 0, arg2, arg4);
        sprpeg.cfr_renamed_6663(arg6, 2, arg3, arg5);
        lArray[n] = lArray[n] ^ arg6[0];
        lArray2[2] = lArray2[2] ^ arg6[1];
        long[] lArray3 = arg0;
        long[] lArray4 = arg0;
        int n2 = arg1;
        long[] lArray5 = arg0;
        int n3 = n2 + 1;
        lArray5[n3] = lArray5[n3] ^ (arg6[0] ^ arg6[2]);
        int n4 = n2 + 2;
        lArray3[n4] = lArray3[n4] ^ (arg6[2] ^ arg6[3]);
        int n5 = arg1 + 3;
        lArray4[n5] = lArray4[n5] ^ arg6[3];
        sprpeg.cfr_renamed_6664(arg0, arg1 + 1, arg2 ^ arg3, arg4 ^ arg5);
    }

    public static /* synthetic */ void cfr_renamed_6685(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, long[] arg6) {
        sprpeg.cfr_renamed_6672(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_6683(long[] lArray, int n, long l) {
        void arg2;
        arg0[arg1 + true] = sprpeg.cfr_renamed_6682((long)(arg2 >>> 32));
        arg0[n] = sprpeg.cfr_renamed_6686((long)arg2);
    }

    private static /* synthetic */ void cfr_renamed_6673(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, long[] arg6) {
        long[] lArray = arg6;
        long[] lArray2 = arg6;
        long[] lArray3 = arg6;
        long[] lArray4 = arg6;
        long[] lArray5 = arg6;
        long[] lArray6 = arg6;
        long[] lArray7 = arg6;
        sprpeg.cfr_renamed_6662(arg6, 0, arg2[arg3], arg2[arg3 + 1], arg4[arg5], arg4[arg5 + 1]);
        sprpeg.cfr_renamed_6663(arg6, 4, arg2[arg3 + 2], arg4[arg5 + 2]);
        sprpeg.cfr_renamed_6663(arg6, 7, arg2[arg3 + 3], arg4[arg5 + 3]);
        lArray6[7] = lArray6[7] ^ arg6[5];
        lArray7[8] = lArray7[8] ^ sprpeg.cfr_renamed_6665(arg2[arg3 + 4], arg4[arg5 + 4]);
        arg6[5] = arg6[7] ^ arg6[4];
        lArray5[7] = lArray5[7] ^ arg6[8];
        arg6[6] = arg6[7] ^ arg6[4];
        lArray3[4] = lArray3[4] ^ arg6[2];
        lArray4[5] = lArray4[5] ^ arg6[3];
        long[] lArray8 = arg0;
        long[] lArray9 = arg0;
        long[] lArray10 = arg0;
        int n = arg1;
        lArray8[n] = lArray8[n] ^ arg6[0];
        int n2 = arg1 + 1;
        lArray9[n2] = lArray9[n2] ^ arg6[1];
        int n3 = arg1 + 2;
        lArray10[n3] = lArray10[n3] ^ (arg6[4] ^ arg6[0]);
        sprpeg.cfr_renamed_6664(arg6, 5, arg2[arg3 + 2] ^ arg2[arg3 + 3], arg4[arg5 + 2] ^ arg4[arg5 + 3]);
        sprpeg.cfr_renamed_6664(arg6, 7, arg2[arg3 + 3] ^ arg2[arg3 + 4], arg4[arg5 + 3] ^ arg4[arg5 + 4]);
        sprpeg.cfr_renamed_6664(arg6, 6, arg2[arg3 + 2] ^ arg2[arg3 + 4], arg4[arg5 + 2] ^ arg4[arg5 + 4]);
        long[] lArray11 = arg0;
        long[] lArray12 = arg0;
        long[] lArray13 = arg0;
        int n4 = arg1;
        long[] lArray14 = arg0;
        long[] lArray15 = arg0;
        long[] lArray16 = arg0;
        int n5 = arg1 + 3;
        lArray15[n5] = lArray15[n5] ^ (arg6[5] ^ arg6[1]);
        int n6 = arg1 + 4;
        lArray16[n6] = lArray16[n6] ^ (arg6[4] ^ arg6[6]);
        int n7 = n4 + 5;
        lArray14[n7] = lArray14[n7] ^ (arg6[5] ^ arg6[7]);
        int n8 = n4 + 6;
        lArray11[n8] = lArray11[n8] ^ (arg6[6] ^ arg6[8]);
        int n9 = arg1 + 7;
        lArray12[n9] = lArray12[n9] ^ arg6[7];
        int n10 = arg1 + 8;
        lArray13[n10] = lArray13[n10] ^ arg6[8];
        long l = arg2[arg3] ^ arg2[arg3 + 2];
        long l2 = arg2[arg3 + 1] ^ arg2[arg3 + 3];
        long l3 = arg4[arg5] ^ arg4[arg5 + 2];
        long l4 = arg4[arg5 + 1] ^ arg4[arg5 + 3];
        sprpeg.cfr_renamed_6663(lArray, 0, l, l3);
        sprpeg.cfr_renamed_6663(lArray2, 2, l2, l4);
        lArray[2] = lArray[2] ^ arg6[1];
        lArray2[3] = lArray2[3] ^ sprpeg.cfr_renamed_6665(arg2[arg3 + 4], arg4[arg5 + 4]);
        long[] lArray17 = arg0;
        long[] lArray18 = arg0;
        int n11 = arg1 + 2;
        lArray17[n11] = lArray17[n11] ^ arg6[0];
        int n12 = arg1 + 3;
        lArray18[n12] = lArray18[n12] ^ (arg6[2] ^ arg6[0]);
        lArray[2] = lArray[2] ^ arg6[3];
        int n13 = arg1;
        long[] lArray19 = arg0;
        long[] lArray20 = arg0;
        int n14 = arg1;
        long[] lArray21 = arg0;
        int n15 = n14 + 4;
        lArray21[n15] = lArray21[n15] ^ (arg6[2] ^ arg6[0]);
        int n16 = n14 + 5;
        lArray19[n16] = lArray19[n16] ^ arg6[2];
        int n17 = arg1 + 6;
        lArray20[n17] = lArray20[n17] ^ arg6[3];
        sprpeg.cfr_renamed_6664(arg0, n13 + 3, l ^ l2, l3 ^ l4);
        sprpeg.cfr_renamed_6664(arg0, n13 + 5, l2 ^ arg2[arg3 + 4], l4 ^ arg4[arg5 + 4]);
        sprpeg.cfr_renamed_6664(arg0, arg1 + 4, l ^ arg2[arg3 + 4], l3 ^ arg4[arg5 + 4]);
    }

    private static /* synthetic */ long cfr_renamed_6686(long arg0) {
        arg0 = (arg0 & 0xFFFFFFFFL ^ arg0 << 16) & 0xFFFF0000FFFFL;
        arg0 = (arg0 ^ arg0 << 8) & 0xFF00FF00FF00FFL;
        arg0 = (arg0 ^ arg0 << 4) & 0xF0F0F0F0F0F0F0FL;
        arg0 = (arg0 ^ arg0 << 2) & 0x3333333333333333L;
        return (arg0 ^ arg0 << 1) & 0x5555555555555555L;
    }

    public static /* synthetic */ void cfr_renamed_6687(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5) {
        sprpeg.cfr_renamed_6688(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6675(long[] lArray, int n, long[] lArray2, int n2, long[] lArray3, int n3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        long[] arg0;
        void arg1;
        void v0 = arg1;
        long[] lArray4 = arg0;
        void v2 = arg1;
        void v3 = arg1;
        long[] lArray5 = arg0;
        long[] lArray6 = arg0;
        void v6 = arg1;
        sprpeg.cfr_renamed_6663(arg0, (int)arg1, (long)arg2[arg3], (long)arg4[arg5]);
        sprpeg.cfr_renamed_6663(arg0, (int)(arg1 + 4), (long)arg2[arg3 + 2], (long)arg4[arg5 + 2]);
        sprpeg.cfr_renamed_6663(arg0, (int)(v6 + 2), (long)arg2[arg3 + true], (long)arg4[arg5 + true]);
        void v7 = v6 + true;
        lArray5[v7] = lArray5[v7] ^ arg0[arg1 + 2];
        void v8 = v3 + 3;
        lArray6[v8] = lArray6[v8] ^ arg0[arg1 + 4];
        arg0[v3 + 4] = arg0[arg1 + 3] ^ arg0[arg1 + 5];
        arg0[v2 + 2] = arg0[arg1 + 3] ^ arg0[arg1 + true] ^ arg0[arg1];
        arg0[v2 + 3] = arg0[arg1 + true] ^ arg0[arg1 + 4];
        void v9 = arg1 + true;
        lArray4[v9] = lArray4[v9] ^ arg0[arg1];
        sprpeg.cfr_renamed_6664(arg0, (int)(v0 + true), (long)(arg2[arg3] ^ arg2[arg3 + true]), (long)(arg4[arg5] ^ arg4[arg5 + true]));
        sprpeg.cfr_renamed_6664(arg0, (int)(v0 + 3), (long)(arg2[arg3 + true] ^ arg2[arg3 + 2]), (long)(arg4[arg5 + true] ^ arg4[arg5 + 2]));
        sprpeg.cfr_renamed_6664(arg0, n + 2, (long)(arg2[arg3] ^ arg2[arg3 + 2]), (long)(arg4[arg5] ^ arg4[arg5 + 2]));
    }

    private static /* synthetic */ void cfr_renamed_6688(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5) {
        long[] lArray = arg5;
        long[] lArray2 = arg5;
        long[] lArray3 = arg0;
        long[] lArray4 = arg5;
        long[] lArray5 = arg5;
        long[] lArray6 = arg0;
        long[] lArray7 = arg5;
        long[] lArray8 = arg5;
        sprpeg.cfr_renamed_6675(arg5, 0, arg1, arg2, arg3, arg4);
        sprpeg.cfr_renamed_6675(arg5, 6, arg1, arg2 + 3, arg3, arg4 + 3);
        long l = arg1[arg2] ^ arg1[arg2 + 3];
        long l2 = arg1[arg2 + 1] ^ arg1[arg2 + 4];
        long l3 = arg1[arg2 + 2] ^ arg1[arg2 + 5];
        long l4 = arg3[arg4] ^ arg3[arg4 + 3];
        long l5 = arg3[arg4 + 1] ^ arg3[arg4 + 4];
        long l6 = arg3[arg4 + 2] ^ arg3[arg4 + 5];
        lArray7[6] = lArray7[6] ^ arg5[3];
        lArray8[7] = lArray8[7] ^ arg5[4];
        lArray5[8] = lArray5[8] ^ arg5[5];
        long[] lArray9 = arg0;
        long[] lArray10 = arg0;
        long[] lArray11 = arg0;
        long[] lArray12 = arg0;
        long[] lArray13 = arg0;
        long[] lArray14 = arg0;
        long[] lArray15 = arg0;
        long[] lArray16 = arg0;
        long[] lArray17 = arg0;
        long[] lArray18 = arg0;
        arg0[0] = arg0[0] ^ arg5[0];
        lArray17[1] = lArray17[1] ^ arg5[1];
        lArray18[2] = lArray18[2] ^ arg5[2];
        lArray15[3] = lArray15[3] ^ (arg5[6] ^ arg5[0]);
        lArray16[5] = lArray16[5] ^ (arg5[8] ^ arg5[2]);
        lArray13[6] = lArray13[6] ^ (arg5[6] ^ arg5[9]);
        lArray14[4] = lArray14[4] ^ (arg5[7] ^ arg5[1]);
        lArray11[7] = lArray11[7] ^ (arg5[7] ^ arg5[10]);
        lArray12[8] = lArray12[8] ^ (arg5[8] ^ arg5[11]);
        lArray9[9] = lArray9[9] ^ arg5[9];
        lArray10[10] = lArray10[10] ^ arg5[10];
        lArray6[11] = lArray6[11] ^ arg5[11];
        sprpeg.cfr_renamed_6663(arg5, 0, l, l4);
        sprpeg.cfr_renamed_6663(lArray5, 4, l3, l6);
        sprpeg.cfr_renamed_6663(arg5, 2, l2, l5);
        lArray3[3] = lArray3[3] ^ arg5[0];
        lArray[1] = lArray[1] ^ arg5[2];
        lArray4[0] = lArray4[0] ^ arg5[1];
        lArray2[3] = lArray2[3] ^ arg5[4];
        lArray[4] = arg5[3] ^ arg5[5];
        long[] lArray19 = arg0;
        long[] lArray20 = arg0;
        long[] lArray21 = arg0;
        long[] lArray22 = arg0;
        long[] lArray23 = arg0;
        lArray22[5] = lArray22[5] ^ (arg5[3] ^ arg5[0]);
        lArray23[6] = lArray23[6] ^ (arg5[1] ^ arg5[4]);
        lArray20[4] = lArray20[4] ^ arg5[0];
        lArray21[7] = lArray21[7] ^ arg5[4];
        lArray19[8] = lArray19[8] ^ arg5[5];
        sprpeg.cfr_renamed_6664(arg0, 4, l ^ l2, l4 ^ l5);
        sprpeg.cfr_renamed_6664(arg0, 6, l2 ^ l3, l5 ^ l6);
        sprpeg.cfr_renamed_6664(arg0, 5, l ^ l3, l4 ^ l6);
    }

    public static /* synthetic */ void cfr_renamed_6689(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5) {
        sprpeg.cfr_renamed_6674(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static /* synthetic */ void cfr_renamed_6690(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5, long[] arg6, long[] arg7) {
        sprpeg.cfr_renamed_6691(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    private static /* synthetic */ void cfr_renamed_6664(long[] arg0, int arg1, long arg2, long arg3) {
        long l = -(arg3 & 1L) & arg2;
        long l2 = -(arg3 >>> 63) & arg2;
        l ^= l2 << 63;
        long l3 = l2 >>> 1;
        l2 = -(arg3 >>> 1 & 1L) & arg2;
        l ^= l2 << 1;
        l3 ^= l2 >>> 63;
        l2 = -(arg3 >>> 2 & 1L) & arg2;
        l ^= l2 << 2;
        l3 ^= l2 >>> 62;
        l2 = -(arg3 >>> 3 & 1L) & arg2;
        l ^= l2 << 3;
        l3 ^= l2 >>> 61;
        l2 = -(arg3 >>> 4 & 1L) & arg2;
        l ^= l2 << 4;
        l3 ^= l2 >>> 60;
        l2 = -(arg3 >>> 5 & 1L) & arg2;
        l ^= l2 << 5;
        l3 ^= l2 >>> 59;
        l2 = -(arg3 >>> 6 & 1L) & arg2;
        l ^= l2 << 6;
        l3 ^= l2 >>> 58;
        l2 = -(arg3 >>> 7 & 1L) & arg2;
        l ^= l2 << 7;
        l3 ^= l2 >>> 57;
        l2 = -(arg3 >>> 8 & 1L) & arg2;
        l ^= l2 << 8;
        l3 ^= l2 >>> 56;
        l2 = -(arg3 >>> 9 & 1L) & arg2;
        l ^= l2 << 9;
        l3 ^= l2 >>> 55;
        l2 = -(arg3 >>> 10 & 1L) & arg2;
        l ^= l2 << 10;
        l3 ^= l2 >>> 54;
        l2 = -(arg3 >>> 11 & 1L) & arg2;
        l ^= l2 << 11;
        l3 ^= l2 >>> 53;
        l2 = -(arg3 >>> 12 & 1L) & arg2;
        l ^= l2 << 12;
        l3 ^= l2 >>> 52;
        l2 = -(arg3 >>> 13 & 1L) & arg2;
        l ^= l2 << 13;
        l3 ^= l2 >>> 51;
        l2 = -(arg3 >>> 14 & 1L) & arg2;
        l ^= l2 << 14;
        l3 ^= l2 >>> 50;
        l2 = -(arg3 >>> 15 & 1L) & arg2;
        l ^= l2 << 15;
        l3 ^= l2 >>> 49;
        l2 = -(arg3 >>> 16 & 1L) & arg2;
        l ^= l2 << 16;
        l3 ^= l2 >>> 48;
        l2 = -(arg3 >>> 17 & 1L) & arg2;
        l ^= l2 << 17;
        l3 ^= l2 >>> 47;
        l2 = -(arg3 >>> 18 & 1L) & arg2;
        l ^= l2 << 18;
        l3 ^= l2 >>> 46;
        l2 = -(arg3 >>> 19 & 1L) & arg2;
        l ^= l2 << 19;
        l3 ^= l2 >>> 45;
        l2 = -(arg3 >>> 20 & 1L) & arg2;
        l ^= l2 << 20;
        l3 ^= l2 >>> 44;
        l2 = -(arg3 >>> 21 & 1L) & arg2;
        l ^= l2 << 21;
        l3 ^= l2 >>> 43;
        l2 = -(arg3 >>> 22 & 1L) & arg2;
        l ^= l2 << 22;
        l3 ^= l2 >>> 42;
        l2 = -(arg3 >>> 23 & 1L) & arg2;
        l ^= l2 << 23;
        l3 ^= l2 >>> 41;
        l2 = -(arg3 >>> 24 & 1L) & arg2;
        l ^= l2 << 24;
        l3 ^= l2 >>> 40;
        l2 = -(arg3 >>> 25 & 1L) & arg2;
        l ^= l2 << 25;
        l3 ^= l2 >>> 39;
        l2 = -(arg3 >>> 26 & 1L) & arg2;
        l ^= l2 << 26;
        l3 ^= l2 >>> 38;
        l2 = -(arg3 >>> 27 & 1L) & arg2;
        l ^= l2 << 27;
        l3 ^= l2 >>> 37;
        l2 = -(arg3 >>> 28 & 1L) & arg2;
        l ^= l2 << 28;
        l3 ^= l2 >>> 36;
        l2 = -(arg3 >>> 29 & 1L) & arg2;
        l ^= l2 << 29;
        l3 ^= l2 >>> 35;
        l2 = -(arg3 >>> 30 & 1L) & arg2;
        l ^= l2 << 30;
        l3 ^= l2 >>> 34;
        l2 = -(arg3 >>> 31 & 1L) & arg2;
        l ^= l2 << 31;
        l3 ^= l2 >>> 33;
        l2 = -(arg3 >>> 32 & 1L) & arg2;
        l ^= l2 << 32;
        l3 ^= l2 >>> 32;
        l2 = -(arg3 >>> 33 & 1L) & arg2;
        l ^= l2 << 33;
        l3 ^= l2 >>> 31;
        l2 = -(arg3 >>> 34 & 1L) & arg2;
        l ^= l2 << 34;
        l3 ^= l2 >>> 30;
        l2 = -(arg3 >>> 35 & 1L) & arg2;
        l ^= l2 << 35;
        l3 ^= l2 >>> 29;
        l2 = -(arg3 >>> 36 & 1L) & arg2;
        l ^= l2 << 36;
        l3 ^= l2 >>> 28;
        l2 = -(arg3 >>> 37 & 1L) & arg2;
        l ^= l2 << 37;
        l3 ^= l2 >>> 27;
        l2 = -(arg3 >>> 38 & 1L) & arg2;
        l ^= l2 << 38;
        l3 ^= l2 >>> 26;
        l2 = -(arg3 >>> 39 & 1L) & arg2;
        l ^= l2 << 39;
        l3 ^= l2 >>> 25;
        l2 = -(arg3 >>> 40 & 1L) & arg2;
        l ^= l2 << 40;
        l3 ^= l2 >>> 24;
        l2 = -(arg3 >>> 41 & 1L) & arg2;
        l ^= l2 << 41;
        l3 ^= l2 >>> 23;
        l2 = -(arg3 >>> 42 & 1L) & arg2;
        l ^= l2 << 42;
        l3 ^= l2 >>> 22;
        l2 = -(arg3 >>> 43 & 1L) & arg2;
        l ^= l2 << 43;
        l3 ^= l2 >>> 21;
        l2 = -(arg3 >>> 44 & 1L) & arg2;
        l ^= l2 << 44;
        l3 ^= l2 >>> 20;
        l2 = -(arg3 >>> 45 & 1L) & arg2;
        l ^= l2 << 45;
        l3 ^= l2 >>> 19;
        l2 = -(arg3 >>> 46 & 1L) & arg2;
        l ^= l2 << 46;
        l3 ^= l2 >>> 18;
        l2 = -(arg3 >>> 47 & 1L) & arg2;
        l ^= l2 << 47;
        l3 ^= l2 >>> 17;
        l2 = -(arg3 >>> 48 & 1L) & arg2;
        l ^= l2 << 48;
        l3 ^= l2 >>> 16;
        l2 = -(arg3 >>> 49 & 1L) & arg2;
        l ^= l2 << 49;
        l3 ^= l2 >>> 15;
        l2 = -(arg3 >>> 50 & 1L) & arg2;
        l ^= l2 << 50;
        l3 ^= l2 >>> 14;
        l2 = -(arg3 >>> 51 & 1L) & arg2;
        l ^= l2 << 51;
        l3 ^= l2 >>> 13;
        l2 = -(arg3 >>> 52 & 1L) & arg2;
        l ^= l2 << 52;
        l3 ^= l2 >>> 12;
        l2 = -(arg3 >>> 53 & 1L) & arg2;
        l ^= l2 << 53;
        l3 ^= l2 >>> 11;
        l2 = -(arg3 >>> 54 & 1L) & arg2;
        l ^= l2 << 54;
        l3 ^= l2 >>> 10;
        l2 = -(arg3 >>> 55 & 1L) & arg2;
        l ^= l2 << 55;
        l3 ^= l2 >>> 9;
        l2 = -(arg3 >>> 56 & 1L) & arg2;
        l ^= l2 << 56;
        l3 ^= l2 >>> 8;
        l2 = -(arg3 >>> 57 & 1L) & arg2;
        l ^= l2 << 57;
        l3 ^= l2 >>> 7;
        l2 = -(arg3 >>> 58 & 1L) & arg2;
        l ^= l2 << 58;
        l3 ^= l2 >>> 6;
        l2 = -(arg3 >>> 59 & 1L) & arg2;
        l ^= l2 << 59;
        l3 ^= l2 >>> 5;
        l2 = -(arg3 >>> 60 & 1L) & arg2;
        l ^= l2 << 60;
        l3 ^= l2 >>> 4;
        l2 = -(arg3 >>> 61 & 1L) & arg2;
        l ^= l2 << 61;
        l3 ^= l2 >>> 3;
        l2 = -(arg3 >>> 62 & 1L) & arg2;
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        int n = arg1;
        lArray[n] = lArray[n] ^ (l ^ l2 << 62);
        int n2 = arg1 + 1;
        lArray2[n2] = lArray2[n2] ^ (l3 ^ l2 >>> 2);
    }

    private static /* synthetic */ void cfr_renamed_6692(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long[] lArray3 = arg5;
        long[] lArray4 = arg0;
        long[] lArray5 = arg0;
        long[] lArray6 = arg0;
        long[] lArray7 = arg0;
        long[] lArray8 = arg0;
        long[] lArray9 = arg0;
        long[] lArray10 = arg0;
        sprpeg.cfr_renamed_6675(arg0, 0, arg1, arg2, arg3, arg4);
        sprpeg.cfr_renamed_6662(arg0, 6, arg1[arg2 + 3], arg1[arg2 + 4], arg3[arg4 + 3], arg3[arg4 + 4]);
        sprpeg.cfr_renamed_6663(arg0, 10, arg1[arg2 + 5], arg3[arg4 + 5]);
        arg0[12] = sprpeg.cfr_renamed_6665(arg1[arg2 + 6], arg3[arg4 + 6]) ^ arg0[11];
        arg0[11] = arg0[10] ^ arg0[12];
        sprpeg.cfr_renamed_6664(arg0, 11, arg1[arg2 + 5] ^ arg1[arg2 + 6], arg3[arg4 + 5] ^ arg3[arg4 + 6]);
        lArray9[8] = lArray9[8] ^ arg0[10];
        lArray10[11] = lArray10[11] ^ arg0[9];
        arg0[10] = arg0[8] ^ arg0[12];
        lArray8[8] = lArray8[8] ^ arg0[6];
        arg0[9] = arg0[11] ^ arg0[7];
        sprpeg.cfr_renamed_6671(arg0, 8, arg1[arg2 + 3] ^ arg1[arg2 + 5], arg1[arg2 + 4] ^ arg1[arg2 + 6], arg3[arg4 + 3] ^ arg3[arg4 + 5], arg3[arg4 + 4] ^ arg3[arg4 + 6], arg5);
        long l = arg1[arg2] ^ arg1[arg2 + 3];
        long l2 = arg1[arg2 + 1] ^ arg1[arg2 + 4];
        long l3 = arg1[arg2 + 2] ^ arg1[arg2 + 5];
        long l4 = arg1[arg2 + 6];
        long l5 = arg3[arg4] ^ arg3[arg4 + 3];
        long l6 = arg3[arg4 + 1] ^ arg3[arg4 + 4];
        long l7 = arg3[arg4 + 2] ^ arg3[arg4 + 5];
        long l8 = arg3[arg4 + 6];
        lArray7[6] = lArray7[6] ^ arg0[3];
        lArray5[7] = lArray5[7] ^ arg0[4];
        lArray6[8] = lArray6[8] ^ arg0[5];
        sprpeg.cfr_renamed_6662(arg5, 0, l, l2, l5, l6);
        sprpeg.cfr_renamed_6663(arg5, 4, l3, l7);
        arg5[6] = sprpeg.cfr_renamed_6665(l4, l8) ^ arg5[5];
        arg5[5] = arg5[4] ^ arg5[6];
        sprpeg.cfr_renamed_6664(arg5, 5, l3 ^ l4, l7 ^ l8);
        lArray5[3] = arg0[6] ^ arg0[0] ^ arg5[0];
        arg0[4] = arg0[7] ^ arg0[1] ^ arg5[1];
        arg5[2] = arg5[2] ^ arg5[4];
        lArray3[3] = lArray3[3] ^ arg5[5];
        lArray[5] = arg0[8] ^ arg0[2] ^ arg5[2] ^ arg5[0];
        lArray4[6] = lArray4[6] ^ (arg0[9] ^ arg5[3] ^ arg5[1]);
        lArray2[7] = lArray2[7] ^ (arg0[10] ^ arg5[2] ^ arg5[6]);
        lArray[8] = lArray[8] ^ (arg0[11] ^ arg5[3]);
        lArray2[9] = lArray2[9] ^ (arg0[12] ^ arg5[6]);
        sprpeg.cfr_renamed_6671(lArray, 5, l ^ l3, l2 ^ l4, l5 ^ l7, l6 ^ l8, arg5);
    }

    private static /* synthetic */ void cfr_renamed_6691(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5, long[] arg6, long[] arg7) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long[] lArray3 = arg0;
        long[] lArray4 = arg0;
        long[] lArray5 = arg0;
        long[] lArray6 = arg0;
        long[] lArray7 = arg0;
        long[] lArray8 = arg0;
        long[] lArray9 = arg0;
        long[] lArray10 = arg0;
        long[] lArray11 = arg0;
        long[] lArray12 = arg0;
        long[] lArray13 = arg0;
        sprpeg.cfr_renamed_6662(arg0, 0, arg1[arg2], arg1[arg2 + 1], arg3[arg4], arg3[arg4 + 1]);
        sprpeg.cfr_renamed_6662(arg0, 4, arg1[arg2 + 2], arg1[arg2 + 3], arg3[arg4 + 2], arg3[arg4 + 3]);
        lArray12[4] = lArray12[4] ^ arg0[2];
        lArray13[5] = lArray13[5] ^ arg0[3];
        arg0[2] = arg0[4] ^ arg0[0];
        arg0[3] = arg0[5] ^ arg0[1];
        lArray10[4] = lArray10[4] ^ arg0[6];
        lArray11[5] = lArray11[5] ^ arg0[7];
        sprpeg.cfr_renamed_6671(arg0, 2, arg1[arg2] ^ arg1[arg2 + 2], arg1[arg2 + 1] ^ arg1[arg2 + 3], arg3[arg4] ^ arg3[arg4 + 2], arg3[arg4 + 1] ^ arg3[arg4 + 3], arg7);
        sprpeg.cfr_renamed_6672(arg0, 8, arg1, arg2 + 4, arg3, arg4 + 4, arg7);
        lArray8[8] = lArray8[8] ^ arg0[4];
        lArray9[9] = lArray9[9] ^ arg0[5];
        lArray6[10] = lArray6[10] ^ arg0[6];
        lArray7[11] = lArray7[11] ^ arg0[7];
        arg0[4] = arg0[8] ^ arg0[0];
        arg0[5] = arg0[9] ^ arg0[1];
        arg0[6] = arg0[10] ^ arg0[2];
        arg0[7] = arg0[11] ^ arg0[3];
        lArray5[8] = lArray5[8] ^ arg0[12];
        lArray3[9] = lArray3[9] ^ arg0[13];
        lArray4[10] = lArray4[10] ^ arg0[14];
        lArray[11] = lArray[11] ^ arg0[15];
        lArray2[12] = lArray2[12] ^ arg0[16];
        arg5[0] = arg1[arg2] ^ arg1[arg2 + 4];
        arg5[1] = arg1[arg2 + 1] ^ arg1[arg2 + 5];
        arg5[2] = arg1[arg2 + 2] ^ arg1[arg2 + 6];
        arg5[3] = arg1[arg2 + 3] ^ arg1[arg2 + 7];
        arg5[4] = arg1[arg2 + 8];
        arg6[0] = arg3[arg4] ^ arg3[arg4 + 4];
        arg6[1] = arg3[arg4 + 1] ^ arg3[arg4 + 5];
        arg6[2] = arg3[arg4 + 2] ^ arg3[arg4 + 6];
        arg6[3] = arg3[arg4 + 3] ^ arg3[arg4 + 7];
        arg6[4] = arg3[arg4 + 8];
        sprpeg.cfr_renamed_6673(arg0, 4, arg5, 0, arg6, 0, arg7);
    }

    public static /* synthetic */ long cfr_renamed_6693(long arg0) {
        return sprpeg.cfr_renamed_6682(arg0);
    }

    public static /* synthetic */ void cfr_renamed_6694(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5) {
        sprpeg.cfr_renamed_6692(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static /* synthetic */ void cfr_renamed_6695(long[] arg0, long[] arg1, int arg2, long[] arg3, int arg4, long[] arg5, long[] arg6, long[] arg7, long[] arg8) {
        sprpeg.cfr_renamed_6670(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6696(long[] lArray, int n, long[] lArray2, int n2, long[] lArray3, int n3, long[] lArray4) {
        long[] arg0;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg6;
        void v0 = arg6;
        void v1 = arg6;
        void v2 = arg1;
        void v3 = arg6;
        sprpeg.cfr_renamed_6663((long[])arg6, 0, (long)arg2[arg3], (long)arg4[arg5]);
        sprpeg.cfr_renamed_6663((long[])v3, 4, (long)arg2[arg3 + 2], (long)arg4[arg5 + 2]);
        sprpeg.cfr_renamed_6663((long[])v3, 2, (long)arg2[arg3 + true], (long)arg4[arg5 + true]);
        arg0[v2] = arg0[v2] ^ arg6[0];
        v1[1] = v1[1] ^ arg6[2];
        v1[3] = v1[3] ^ arg6[4];
        v0[4] = arg6[3] ^ arg6[5];
        v0[0] = v0[0] ^ arg6[1];
        void v4 = arg1;
        long[] lArray5 = arg0;
        long[] lArray6 = arg0;
        long[] lArray7 = arg0;
        void v8 = arg1;
        long[] lArray8 = arg0;
        void v10 = arg1 + true;
        arg0[v10] = arg0[v10] ^ arg6[0];
        void v11 = v8 + 2;
        lArray8[v11] = lArray8[v11] ^ (arg6[3] ^ arg6[0]);
        void v12 = v8 + 3;
        lArray6[v12] = lArray6[v12] ^ (arg6[1] ^ arg6[4]);
        void v13 = arg1 + 4;
        lArray7[v13] = lArray7[v13] ^ arg6[4];
        void v14 = v4 + 5;
        lArray5[v14] = lArray5[v14] ^ arg6[5];
        sprpeg.cfr_renamed_6664(arg0, (int)(v4 + true), (long)(arg2[arg3] ^ arg2[arg3 + true]), (long)(arg4[arg5] ^ arg4[arg5 + true]));
        sprpeg.cfr_renamed_6664(lArray, (int)(arg1 + 3), (long)(arg2[arg3 + true] ^ arg2[arg3 + 2]), (long)(arg4[arg5 + true] ^ arg4[arg5 + 2]));
        sprpeg.cfr_renamed_6664(arg0, (int)(arg1 + 2), (long)(arg2[arg3] ^ arg2[arg3 + 2]), (long)(arg4[arg5] ^ arg4[arg5 + 2]));
    }

    private static /* synthetic */ void cfr_renamed_6663(long[] arg0, int arg1, long arg2, long arg3) {
        long l = -(arg3 & 1L) & arg2;
        long l2 = -(arg3 >>> 63) & arg2;
        l ^= l2 << 63;
        long l3 = l2 >>> 1;
        l2 = -(arg3 >>> 1 & 1L) & arg2;
        l ^= l2 << 1;
        l3 ^= l2 >>> 63;
        l2 = -(arg3 >>> 2 & 1L) & arg2;
        l ^= l2 << 2;
        l3 ^= l2 >>> 62;
        l2 = -(arg3 >>> 3 & 1L) & arg2;
        l ^= l2 << 3;
        l3 ^= l2 >>> 61;
        l2 = -(arg3 >>> 4 & 1L) & arg2;
        l ^= l2 << 4;
        l3 ^= l2 >>> 60;
        l2 = -(arg3 >>> 5 & 1L) & arg2;
        l ^= l2 << 5;
        l3 ^= l2 >>> 59;
        l2 = -(arg3 >>> 6 & 1L) & arg2;
        l ^= l2 << 6;
        l3 ^= l2 >>> 58;
        l2 = -(arg3 >>> 7 & 1L) & arg2;
        l ^= l2 << 7;
        l3 ^= l2 >>> 57;
        l2 = -(arg3 >>> 8 & 1L) & arg2;
        l ^= l2 << 8;
        l3 ^= l2 >>> 56;
        l2 = -(arg3 >>> 9 & 1L) & arg2;
        l ^= l2 << 9;
        l3 ^= l2 >>> 55;
        l2 = -(arg3 >>> 10 & 1L) & arg2;
        l ^= l2 << 10;
        l3 ^= l2 >>> 54;
        l2 = -(arg3 >>> 11 & 1L) & arg2;
        l ^= l2 << 11;
        l3 ^= l2 >>> 53;
        l2 = -(arg3 >>> 12 & 1L) & arg2;
        l ^= l2 << 12;
        l3 ^= l2 >>> 52;
        l2 = -(arg3 >>> 13 & 1L) & arg2;
        l ^= l2 << 13;
        l3 ^= l2 >>> 51;
        l2 = -(arg3 >>> 14 & 1L) & arg2;
        l ^= l2 << 14;
        l3 ^= l2 >>> 50;
        l2 = -(arg3 >>> 15 & 1L) & arg2;
        l ^= l2 << 15;
        l3 ^= l2 >>> 49;
        l2 = -(arg3 >>> 16 & 1L) & arg2;
        l ^= l2 << 16;
        l3 ^= l2 >>> 48;
        l2 = -(arg3 >>> 17 & 1L) & arg2;
        l ^= l2 << 17;
        l3 ^= l2 >>> 47;
        l2 = -(arg3 >>> 18 & 1L) & arg2;
        l ^= l2 << 18;
        l3 ^= l2 >>> 46;
        l2 = -(arg3 >>> 19 & 1L) & arg2;
        l ^= l2 << 19;
        l3 ^= l2 >>> 45;
        l2 = -(arg3 >>> 20 & 1L) & arg2;
        l ^= l2 << 20;
        l3 ^= l2 >>> 44;
        l2 = -(arg3 >>> 21 & 1L) & arg2;
        l ^= l2 << 21;
        l3 ^= l2 >>> 43;
        l2 = -(arg3 >>> 22 & 1L) & arg2;
        l ^= l2 << 22;
        l3 ^= l2 >>> 42;
        l2 = -(arg3 >>> 23 & 1L) & arg2;
        l ^= l2 << 23;
        l3 ^= l2 >>> 41;
        l2 = -(arg3 >>> 24 & 1L) & arg2;
        l ^= l2 << 24;
        l3 ^= l2 >>> 40;
        l2 = -(arg3 >>> 25 & 1L) & arg2;
        l ^= l2 << 25;
        l3 ^= l2 >>> 39;
        l2 = -(arg3 >>> 26 & 1L) & arg2;
        l ^= l2 << 26;
        l3 ^= l2 >>> 38;
        l2 = -(arg3 >>> 27 & 1L) & arg2;
        l ^= l2 << 27;
        l3 ^= l2 >>> 37;
        l2 = -(arg3 >>> 28 & 1L) & arg2;
        l ^= l2 << 28;
        l3 ^= l2 >>> 36;
        l2 = -(arg3 >>> 29 & 1L) & arg2;
        l ^= l2 << 29;
        l3 ^= l2 >>> 35;
        l2 = -(arg3 >>> 30 & 1L) & arg2;
        l ^= l2 << 30;
        l3 ^= l2 >>> 34;
        l2 = -(arg3 >>> 31 & 1L) & arg2;
        l ^= l2 << 31;
        l3 ^= l2 >>> 33;
        l2 = -(arg3 >>> 32 & 1L) & arg2;
        l ^= l2 << 32;
        l3 ^= l2 >>> 32;
        l2 = -(arg3 >>> 33 & 1L) & arg2;
        l ^= l2 << 33;
        l3 ^= l2 >>> 31;
        l2 = -(arg3 >>> 34 & 1L) & arg2;
        l ^= l2 << 34;
        l3 ^= l2 >>> 30;
        l2 = -(arg3 >>> 35 & 1L) & arg2;
        l ^= l2 << 35;
        l3 ^= l2 >>> 29;
        l2 = -(arg3 >>> 36 & 1L) & arg2;
        l ^= l2 << 36;
        l3 ^= l2 >>> 28;
        l2 = -(arg3 >>> 37 & 1L) & arg2;
        l ^= l2 << 37;
        l3 ^= l2 >>> 27;
        l2 = -(arg3 >>> 38 & 1L) & arg2;
        l ^= l2 << 38;
        l3 ^= l2 >>> 26;
        l2 = -(arg3 >>> 39 & 1L) & arg2;
        l ^= l2 << 39;
        l3 ^= l2 >>> 25;
        l2 = -(arg3 >>> 40 & 1L) & arg2;
        l ^= l2 << 40;
        l3 ^= l2 >>> 24;
        l2 = -(arg3 >>> 41 & 1L) & arg2;
        l ^= l2 << 41;
        l3 ^= l2 >>> 23;
        l2 = -(arg3 >>> 42 & 1L) & arg2;
        l ^= l2 << 42;
        l3 ^= l2 >>> 22;
        l2 = -(arg3 >>> 43 & 1L) & arg2;
        l ^= l2 << 43;
        l3 ^= l2 >>> 21;
        l2 = -(arg3 >>> 44 & 1L) & arg2;
        l ^= l2 << 44;
        l3 ^= l2 >>> 20;
        l2 = -(arg3 >>> 45 & 1L) & arg2;
        l ^= l2 << 45;
        l3 ^= l2 >>> 19;
        l2 = -(arg3 >>> 46 & 1L) & arg2;
        l ^= l2 << 46;
        l3 ^= l2 >>> 18;
        l2 = -(arg3 >>> 47 & 1L) & arg2;
        l ^= l2 << 47;
        l3 ^= l2 >>> 17;
        l2 = -(arg3 >>> 48 & 1L) & arg2;
        l ^= l2 << 48;
        l3 ^= l2 >>> 16;
        l2 = -(arg3 >>> 49 & 1L) & arg2;
        l ^= l2 << 49;
        l3 ^= l2 >>> 15;
        l2 = -(arg3 >>> 50 & 1L) & arg2;
        l ^= l2 << 50;
        l3 ^= l2 >>> 14;
        l2 = -(arg3 >>> 51 & 1L) & arg2;
        l ^= l2 << 51;
        l3 ^= l2 >>> 13;
        l2 = -(arg3 >>> 52 & 1L) & arg2;
        l ^= l2 << 52;
        l3 ^= l2 >>> 12;
        l2 = -(arg3 >>> 53 & 1L) & arg2;
        l ^= l2 << 53;
        l3 ^= l2 >>> 11;
        l2 = -(arg3 >>> 54 & 1L) & arg2;
        l ^= l2 << 54;
        l3 ^= l2 >>> 10;
        l2 = -(arg3 >>> 55 & 1L) & arg2;
        l ^= l2 << 55;
        l3 ^= l2 >>> 9;
        l2 = -(arg3 >>> 56 & 1L) & arg2;
        l ^= l2 << 56;
        l3 ^= l2 >>> 8;
        l2 = -(arg3 >>> 57 & 1L) & arg2;
        l ^= l2 << 57;
        l3 ^= l2 >>> 7;
        l2 = -(arg3 >>> 58 & 1L) & arg2;
        l ^= l2 << 58;
        l3 ^= l2 >>> 6;
        l2 = -(arg3 >>> 59 & 1L) & arg2;
        l ^= l2 << 59;
        l3 ^= l2 >>> 5;
        l2 = -(arg3 >>> 60 & 1L) & arg2;
        l ^= l2 << 60;
        l3 ^= l2 >>> 4;
        l2 = -(arg3 >>> 61 & 1L) & arg2;
        l ^= l2 << 61;
        l3 ^= l2 >>> 3;
        l2 = -(arg3 >>> 62 & 1L) & arg2;
        arg0[arg1] = l ^ l2 << 62;
        arg0[arg1 + 1] = l3 ^ l2 >>> 2;
    }

    public static /* synthetic */ void cfr_renamed_6697(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, long[] arg6) {
        sprpeg.cfr_renamed_6673(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    private static /* synthetic */ void cfr_renamed_6672(long[] arg0, int arg1, long[] arg2, int arg3, long[] arg4, int arg5, long[] arg6) {
        long[] lArray = arg0;
        long[] lArray2 = arg0;
        long[] lArray3 = arg6;
        long[] lArray4 = arg0;
        long[] lArray5 = arg0;
        long[] lArray6 = arg0;
        int n = arg1;
        int n2 = arg1;
        long[] lArray7 = arg0;
        int n3 = arg1;
        long[] lArray8 = arg0;
        long[] lArray9 = arg0;
        int n4 = arg1;
        sprpeg.cfr_renamed_6662(arg0, arg1, arg2[arg3], arg2[arg3 + 1], arg4[arg5], arg4[arg5 + 1]);
        sprpeg.cfr_renamed_6663(arg0, n4 + 4, arg2[arg3 + 2], arg4[arg5 + 2]);
        sprpeg.cfr_renamed_6663(arg0, n4 + 7, arg2[arg3 + 3], arg4[arg5 + 3]);
        int n5 = arg1 + 7;
        lArray9[n5] = lArray9[n5] ^ arg0[arg1 + 5];
        int n6 = n3 + 8;
        lArray8[n6] = lArray8[n6] ^ sprpeg.cfr_renamed_6665(arg2[arg3 + 4], arg4[arg5 + 4]);
        arg0[n3 + 5] = arg0[arg1 + 7] ^ arg0[arg1 + 4];
        int n7 = arg1 + 7;
        lArray7[n7] = lArray7[n7] ^ arg0[arg1 + 8];
        arg0[n2 + 6] = arg0[arg1 + 7] ^ arg0[arg1 + 4];
        sprpeg.cfr_renamed_6664(arg0, n2 + 5, arg2[arg3 + 2] ^ arg2[arg3 + 3], arg4[arg5 + 2] ^ arg4[arg5 + 3]);
        sprpeg.cfr_renamed_6664(arg0, arg1 + 7, arg2[arg3 + 3] ^ arg2[arg3 + 4], arg4[arg5 + 3] ^ arg4[arg5 + 4]);
        sprpeg.cfr_renamed_6664(arg0, n + 6, arg2[arg3 + 2] ^ arg2[arg3 + 4], arg4[arg5 + 2] ^ arg4[arg5 + 4]);
        int n8 = n + 4;
        lArray5[n8] = lArray5[n8] ^ arg0[arg1 + 2];
        int n9 = arg1 + 5;
        lArray6[n9] = lArray6[n9] ^ arg0[arg1 + 3];
        long l = arg2[arg3] ^ arg2[arg3 + 2];
        long l2 = arg2[arg3 + 1] ^ arg2[arg3 + 3];
        long l3 = arg4[arg5] ^ arg4[arg5 + 2];
        long l4 = arg4[arg5 + 1] ^ arg4[arg5 + 3];
        long[] lArray10 = arg6;
        sprpeg.cfr_renamed_6663(arg6, 0, l, l3);
        sprpeg.cfr_renamed_6663(arg6, 2, l2, l4);
        lArray10[2] = lArray10[2] ^ arg6[1];
        arg6[3] = arg6[3] ^ sprpeg.cfr_renamed_6665(arg2[arg3 + 4], arg4[arg5 + 4]);
        arg0[arg1 + 2] = arg0[arg1 + 4] ^ arg0[arg1] ^ arg6[0];
        arg0[arg1 + 3] = arg0[arg1 + 5] ^ arg0[arg1 + 1] ^ arg6[2] ^ arg6[0];
        lArray3[2] = lArray3[2] ^ arg6[3];
        int n10 = arg1 + 4;
        lArray[n10] = lArray[n10] ^ (arg0[arg1 + 6] ^ arg6[2] ^ arg6[0]);
        int n11 = arg1 + 5;
        lArray4[n11] = lArray4[n11] ^ (arg0[arg1 + 7] ^ arg6[2]);
        int n12 = arg1 + 6;
        lArray2[n12] = lArray2[n12] ^ (arg0[arg1 + 8] ^ arg6[3]);
        sprpeg.cfr_renamed_6664(lArray, arg1 + 3, l ^ l2, l3 ^ l4);
        sprpeg.cfr_renamed_6664(lArray2, arg1 + 5, l2 ^ arg2[arg3 + 4], l4 ^ arg4[arg5 + 4]);
        sprpeg.cfr_renamed_6664(lArray, arg1 + 4, l ^ arg2[arg3 + 4], l3 ^ arg4[arg5 + 4]);
    }
}


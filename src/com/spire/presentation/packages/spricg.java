/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazf;
import com.spire.presentation.packages.sproze;

public class spricg {
    public static int cfr_renamed_6432(int arg0) {
        int n = arg0 * 2730;
        int n2 = n >> 27;
        n = arg0 - n2 * 49156;
        n = 49155 - n;
        int n3 = (n2 -= (n >>= 31)) & 1;
        n2 = (n2 >> 1) + n3;
        return spricg.cfr_renamed_6433((n2 *= 98312) - arg0);
    }

    public static int cfr_renamed_6434(int[] arg0, int arg1, int arg2, int arg3) {
        int n = arg3 * 2730;
        int n2 = n >> 25;
        n = arg3 - n2 * 12289;
        n = 12288 - n;
        int n3 = (n2 -= (n >>= 31)) & 1;
        int n4 = n2 >> 1;
        arg0[arg1] = n4 + n3;
        n3 = --n2 & 1;
        arg0[arg2] = (n2 >> 1) + n3;
        return spricg.cfr_renamed_6433(arg3 - arg0[arg1] * 2 * 12289);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6430(byte[] byArray, short[] sArray, short[] sArray2) {
        int n;
        byte[] arg0;
        sproze.cfr_renamed_492(arg0, (byte)0);
        int[] nArray = new int[4];
        int n2 = n = 0;
        while (n2 < 256) {
            void arg2;
            void arg1;
            nArray[0] = 196624 + 8 * arg1[0 + n] - 12289 * (2 * arg2[0 + n] + arg2[768 + n]);
            nArray[1] = 196624 + 8 * arg1[256 + n] - 12289 * (2 * arg2[256 + n] + arg2[768 + n]);
            nArray[2] = 196624 + 8 * arg1[512 + n] - 12289 * (2 * arg2[512 + n] + arg2[768 + n]);
            nArray[3] = 196624 + 8 * arg1[768 + n] - 12289 * arg2[768 + n];
            int n3 = n >>> 3;
            byte by = (byte)(arg0[n3] | spricg.cfr_renamed_6435(nArray[0], nArray[1], nArray[2], nArray[3]) << (n & 7));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6428(short[] arg0, short[] arg1, byte[] arg2, byte arg3) {
        int n;
        byte[] byArray = new byte[8];
        byArray[0] = arg3;
        byte[] byArray2 = new byte[32];
        sprazf.cfr_renamed_6413(arg2, byArray, byArray2, 0, byArray2.length);
        int[] nArray = new int[8];
        int[] nArray2 = new int[4];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = byArray2[n >>> 3] >>> (n & 7) & 1;
            int n4 = spricg.cfr_renamed_6434(nArray, 0, 4, 8 * arg1[0 + n] + 4 * n3);
            n4 += spricg.cfr_renamed_6434(nArray, 1, 5, 8 * arg1[256 + n] + 4 * n3);
            n4 += spricg.cfr_renamed_6434(nArray, 2, 6, 8 * arg1[512 + n] + 4 * n3);
            n4 += spricg.cfr_renamed_6434(nArray, 3, 7, 8 * arg1[768 + n] + 4 * n3);
            n4 = 24577 - n4 >> 31;
            int[] nArray3 = nArray2;
            nArray2[0] = ~n4 & nArray[0] ^ n4 & nArray[4];
            nArray3[1] = ~n4 & nArray[1] ^ n4 & nArray[5];
            nArray3[2] = ~n4 & nArray[2] ^ n4 & nArray[6];
            nArray2[3] = ~n4 & nArray[3] ^ n4 & nArray[7];
            arg0[0 + n] = (short)(nArray2[0] - nArray2[3] & 3);
            arg0[256 + n] = (short)(nArray2[1] - nArray2[3] & 3);
            arg0[512 + n] = (short)(nArray2[2] - nArray2[3] & 3);
            int n5 = 768 + n;
            arg0[n5] = (short)(-n4 + 2 * nArray2[3] & 3);
            n2 = ++n;
        }
    }

    public static short cfr_renamed_6435(int arg0, int arg1, int arg2, int arg3) {
        int n = spricg.cfr_renamed_6432(arg0);
        n += spricg.cfr_renamed_6432(arg1);
        n += spricg.cfr_renamed_6432(arg2);
        n += spricg.cfr_renamed_6432(arg3);
        return (short)((n -= 98312) >>> 31);
    }

    public static int cfr_renamed_6433(int arg0) {
        int n = arg0 >> 31;
        return (arg0 ^ n) - n;
    }
}


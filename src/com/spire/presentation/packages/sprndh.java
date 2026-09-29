/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlnh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprpuh;
import com.spire.presentation.packages.spruch;
import com.spire.presentation.packages.sprvih;

public abstract class sprndh {
    private static final int cfr_renamed_102 = 127719000;
    private static final int cfr_renamed_93 = -50998291;
    private static final long cfr_renamed_86 = 255L;
    private static final int cfr_renamed_152 = 19280294;
    private static final int cfr_renamed_112 = 5343;
    public static final int cfr_renamed_119 = 8;
    private static final int[] cfr_renamed_91;
    private static final long cfr_renamed_0 = 0xFFFFFFFL;
    private static final int cfr_renamed_1 = -6428113;
    private static final int[] cfr_renamed_2;
    private static final long cfr_renamed_3 = 0xFFFFFFFFL;
    private static final int cfr_renamed_4 = 254;

    public static void cfr_renamed_8726(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray;
        int[] nArray2 = new int[16];
        System.arraycopy(cfr_renamed_2, 0, nArray2, 0, 16);
        int[] nArray3 = nArray = new int[16];
        sprmeh.cfr_renamed_1627(arg0, nArray);
        nArray3[0] = nArray3[0] + 1;
        int[] nArray4 = new int[16];
        sprmeh.cfr_renamed_1636(cfr_renamed_91, arg0, nArray4);
        int[] nArray5 = new int[4];
        System.arraycopy(cfr_renamed_91, 0, nArray5, 0, 4);
        int[] nArray6 = new int[4];
        int[] nArray7 = new int[4];
        System.arraycopy(arg0, 0, nArray7, 0, 4);
        int[] nArray8 = new int[4];
        nArray8[0] = 1;
        int n = 15;
        int n2 = spruch.cfr_renamed_8713(15, nArray);
        while (n2 > 254) {
            int n3;
            int n4 = spruch.cfr_renamed_8716(n, nArray4) - n2;
            n4 &= ~(n4 >> 31);
            if (nArray4[n] < 0) {
                spruch.cfr_renamed_8714(n, n4, nArray2, nArray, nArray4);
                spruch.cfr_renamed_8712(3, n4, nArray5, nArray6, nArray7, nArray8);
                n3 = n;
            } else {
                spruch.cfr_renamed_8717(n, n4, nArray2, nArray, nArray4);
                spruch.cfr_renamed_8715(3, n4, nArray5, nArray6, nArray7, nArray8);
                n3 = n;
            }
            if (!spruch.cfr_renamed_8550(n3, nArray2, nArray)) continue;
            int[] nArray9 = nArray5;
            nArray5 = nArray7;
            nArray7 = nArray9;
            int[] nArray10 = nArray6;
            nArray6 = nArray8;
            nArray8 = nArray10;
            int[] nArray11 = nArray2;
            nArray2 = nArray;
            nArray = nArray11;
            n = n2 >>> 5;
            n2 = spruch.cfr_renamed_8713(n, nArray);
        }
        System.arraycopy(nArray7, 0, arg1, 0, 4);
        System.arraycopy(nArray8, 0, arg2, 0, 4);
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = 1559614445;
        nArray[1] = 1477600026;
        nArray[2] = -1560830762;
        nArray[3] = 350157278;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[6] = 0;
        nArray[7] = 0x10000000;
        cfr_renamed_91 = nArray;
        int[] nArray2 = new int[16];
        nArray2[0] = -1424848535;
        nArray2[1] = -487721339;
        nArray2[2] = 580428573;
        nArray2[3] = 1745064566;
        nArray2[4] = -770181698;
        nArray2[5] = 1036971123;
        nArray2[6] = 461123738;
        nArray2[7] = -1582065343;
        nArray2[8] = 1268693629;
        nArray2[9] = -889041821;
        nArray2[10] = -731974758;
        nArray2[11] = 43769659;
        nArray2[12] = 0;
        nArray2[13] = 0;
        nArray2[14] = 0;
        nArray2[15] = 0x1000000;
        cfr_renamed_2 = nArray2;
    }

    public static void cfr_renamed_8725(int arg0, byte[] arg1) {
        sprlnh.cfr_renamed_8711(cfr_renamed_91, arg0, arg1);
    }

    public static void cfr_renamed_8723(int arg0, int[] arg1, int[] arg2) {
        sprvih.cfr_renamed_8576(8, ~arg1[0] & 1, arg1, cfr_renamed_91, arg2);
        sprvih.cfr_renamed_1725(8, arg2, 1);
    }

    public static void cfr_renamed_8731(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = new int[12];
        sprmeh.cfr_renamed_8543(arg0, arg1, nArray);
        if (arg1[3] < 0) {
            sprmeh.cfr_renamed_1630(cfr_renamed_91, 0, nArray, 4, 0);
            sprmeh.cfr_renamed_8310(arg0, 0, nArray, 4, 0);
        }
        byte[] byArray = new byte[64];
        sprpuh.cfr_renamed_8719(nArray, 0, 12, byArray, 0);
        sprndh.cfr_renamed_8720(sprndh.cfr_renamed_8721(byArray), arg2);
    }

    public static void cfr_renamed_8720(byte[] arg0, int[] arg1) {
        sprpuh.cfr_renamed_8722(arg0, 0, arg1, 0, 8);
    }

    public static byte[] cfr_renamed_8721(byte[] arg0) {
        long l = (long)sprpuh.cfr_renamed_8727(arg0, 0) & 0xFFFFFFFFL;
        long l2 = (long)(sprpuh.cfr_renamed_8728(arg0, 4) << 4) & 0xFFFFFFFFL;
        long l3 = (long)sprpuh.cfr_renamed_8727(arg0, 7) & 0xFFFFFFFFL;
        long l4 = (long)(sprpuh.cfr_renamed_8728(arg0, 11) << 4) & 0xFFFFFFFFL;
        long l5 = (long)sprpuh.cfr_renamed_8727(arg0, 14) & 0xFFFFFFFFL;
        long l6 = (long)(sprpuh.cfr_renamed_8728(arg0, 18) << 4) & 0xFFFFFFFFL;
        long l7 = (long)sprpuh.cfr_renamed_8727(arg0, 21) & 0xFFFFFFFFL;
        long l8 = (long)(sprpuh.cfr_renamed_8728(arg0, 25) << 4) & 0xFFFFFFFFL;
        long l9 = (long)sprpuh.cfr_renamed_8727(arg0, 28) & 0xFFFFFFFFL;
        long l10 = (long)(sprpuh.cfr_renamed_8728(arg0, 32) << 4) & 0xFFFFFFFFL;
        long l11 = (long)sprpuh.cfr_renamed_8727(arg0, 35) & 0xFFFFFFFFL;
        long l12 = (long)(sprpuh.cfr_renamed_8728(arg0, 39) << 4) & 0xFFFFFFFFL;
        long l13 = (long)sprpuh.cfr_renamed_8727(arg0, 42) & 0xFFFFFFFFL;
        long l14 = (long)(sprpuh.cfr_renamed_8728(arg0, 46) << 4) & 0xFFFFFFFFL;
        long l15 = (long)sprpuh.cfr_renamed_8727(arg0, 49) & 0xFFFFFFFFL;
        long l16 = (long)(sprpuh.cfr_renamed_8728(arg0, 53) << 4) & 0xFFFFFFFFL;
        long l17 = (long)sprpuh.cfr_renamed_8727(arg0, 56) & 0xFFFFFFFFL;
        long l18 = (long)(sprpuh.cfr_renamed_8728(arg0, 60) << 4) & 0xFFFFFFFFL;
        long l19 = (long)arg0[63] & 0xFFL;
        l10 -= l19 * -50998291L;
        l11 -= l19 * 19280294L;
        l12 -= l19 * 127719000L;
        l13 -= l19 * -6428113L;
        l14 -= l19 * 5343L;
        l18 += l17 >> 28;
        l17 &= 0xFFFFFFFL;
        l9 -= l18 * -50998291L;
        l10 -= l18 * 19280294L;
        l11 -= l18 * 127719000L;
        l12 -= l18 * -6428113L;
        l13 -= l18 * 5343L;
        l8 -= l17 * -50998291L;
        l9 -= l17 * 19280294L;
        l10 -= l17 * 127719000L;
        l11 -= l17 * -6428113L;
        l12 -= l17 * 5343L;
        l16 += l15 >> 28;
        l15 &= 0xFFFFFFFL;
        l7 -= l16 * -50998291L;
        l8 -= l16 * 19280294L;
        l9 -= l16 * 127719000L;
        l10 -= l16 * -6428113L;
        l11 -= l16 * 5343L;
        l6 -= l15 * -50998291L;
        l7 -= l15 * 19280294L;
        l8 -= l15 * 127719000L;
        l9 -= l15 * -6428113L;
        l10 -= l15 * 5343L;
        l14 += l13 >> 28;
        l13 &= 0xFFFFFFFL;
        l5 -= l14 * -50998291L;
        l6 -= l14 * 19280294L;
        l7 -= l14 * 127719000L;
        l8 -= l14 * -6428113L;
        l9 -= l14 * 5343L;
        l13 += l12 >> 28;
        l12 &= 0xFFFFFFFL;
        l4 -= l13 * -50998291L;
        l5 -= l13 * 19280294L;
        l6 -= l13 * 127719000L;
        l7 -= l13 * -6428113L;
        l8 -= l13 * 5343L;
        l12 += l11 >> 28;
        l11 &= 0xFFFFFFFL;
        l3 -= l12 * -50998291L;
        l4 -= l12 * 19280294L;
        l5 -= l12 * 127719000L;
        l6 -= l12 * -6428113L;
        l7 -= l12 * 5343L;
        l11 += l10 >> 28;
        l10 &= 0xFFFFFFFL;
        l2 -= l11 * -50998291L;
        l3 -= l11 * 19280294L;
        l4 -= l11 * 127719000L;
        l5 -= l11 * -6428113L;
        l6 -= l11 * 5343L;
        l9 += l8 >> 28;
        l8 &= 0xFFFFFFFL;
        l10 += l9 >> 28;
        long l20 = (l9 &= 0xFFFFFFFL) >>> 27;
        l2 -= l10 * 19280294L;
        l3 -= l10 * 127719000L;
        l4 -= l10 * -6428113L;
        l5 -= l10 * 5343L;
        l &= 0xFFFFFFFL;
        l2 &= 0xFFFFFFFL;
        l3 &= 0xFFFFFFFL;
        l4 &= 0xFFFFFFFL;
        l5 &= 0xFFFFFFFL;
        l6 &= 0xFFFFFFFL;
        l7 &= 0xFFFFFFFL;
        l8 &= 0xFFFFFFFL;
        l10 = (l9 += (l8 += (l7 += (l6 += (l5 += (l4 += (l3 += (l2 += (l -= (l10 += l20) * -50998291L) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28;
        l9 &= 0xFFFFFFFL;
        l2 += l10 & 0x12631A6L;
        l3 += l10 & 0x79CD658L;
        l4 += l10 & 0xFFFFFFFFFF9DEA2FL;
        l5 += l10 & 0x14DFL;
        l &= 0xFFFFFFFL;
        l2 &= 0xFFFFFFFL;
        l3 &= 0xFFFFFFFL;
        l4 &= 0xFFFFFFFL;
        l5 &= 0xFFFFFFFL;
        l6 &= 0xFFFFFFFL;
        l7 &= 0xFFFFFFFL;
        l9 += (l8 += (l7 += (l6 += (l5 += (l4 += (l3 += (l2 += (l += (l10 -= l20) & 0xFFFFFFFFFCF5D3EDL) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28) >> 28;
        l8 &= 0xFFFFFFFL;
        byte[] byArray = new byte[64];
        sprpuh.cfr_renamed_8730(l | l2 << 28, byArray, 0);
        sprpuh.cfr_renamed_8730(l3 | l4 << 28, byArray, 7);
        sprpuh.cfr_renamed_8730(l5 | l6 << 28, byArray, 14);
        sprpuh.cfr_renamed_8730(l7 | l8 << 28, byArray, 21);
        sprpuh.cfr_renamed_8732((int)l9, byArray, 28);
        return byArray;
    }

    public static boolean cfr_renamed_8724(byte[] arg0, int[] arg1) {
        sprndh.cfr_renamed_8720(arg0, arg1);
        return !sprmeh.cfr_renamed_1649(arg1, cfr_renamed_91);
    }
}


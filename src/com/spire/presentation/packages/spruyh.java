/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprevh;
import com.spire.presentation.packages.spriqh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprzmh;
import java.security.SecureRandom;

public abstract class spruyh {
    private static final int cfr_renamed_1 = 156326;
    private static final int cfr_renamed_2 = 39082;
    public static final int cfr_renamed_3 = 56;
    public static final int cfr_renamed_4 = 56;

    private static /* synthetic */ void cfr_renamed_8878(byte[] arg0, int arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 14) {
            int n3 = n++;
            arg2[n3] = spruyh.cfr_renamed_8727(arg0, arg1 + n3 * 4);
            n2 = n;
        }
        arg2[0] = arg2[0] & 0xFFFFFFFC;
        arg2[13] = arg2[13] | Integer.MIN_VALUE;
    }

    private static /* synthetic */ int cfr_renamed_8727(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16 | arg0[++arg1] << 24;
        return n4;
    }

    public static void cfr_renamed_8735(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        spruyh.cfr_renamed_8879(arg0, arg1, arg2, arg3);
    }

    public static void cfr_renamed_8879(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int[] nArray = spriqh.cfr_renamed_1631();
        int[] nArray2 = spriqh.cfr_renamed_1631();
        sprzmh.cfr_renamed_8792(sprevh.cfr_renamed_2413(), arg0, arg1, nArray, nArray2);
        spriqh.cfr_renamed_8805(nArray, nArray);
        spriqh.cfr_renamed_1636(nArray, nArray2, nArray);
        spriqh.cfr_renamed_8743(nArray, nArray);
        spriqh.cfr_renamed_8746(nArray);
        spriqh.cfr_renamed_8799(nArray, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean cfr_renamed_8880(byte[] byArray, int n, byte[] byArray2, int n2, byte[] byArray3, int n3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        byte[] arg0;
        spruyh.cfr_renamed_8881(arg0, (int)arg1, (byte[])arg2, (int)arg3, (byte[])arg4, (int)arg5);
        return !sproze.cfr_renamed_5269(byArray3, (int)arg5, 56);
    }

    public static void cfr_renamed_8775() {
        sprzmh.cfr_renamed_8775();
    }

    public static void cfr_renamed_8881(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int n;
        int[] nArray = new int[14];
        spruyh.cfr_renamed_8878(arg0, arg1, nArray);
        int[] nArray2 = spriqh.cfr_renamed_1631();
        spriqh.cfr_renamed_8876(arg2, arg3, nArray2);
        int[] nArray3 = spriqh.cfr_renamed_1631();
        spriqh.cfr_renamed_8546(nArray2, 0, nArray3, 0);
        int[] nArray4 = spriqh.cfr_renamed_1631();
        int[] nArray5 = nArray4;
        nArray4[0] = 1;
        int[] nArray6 = spriqh.cfr_renamed_1631();
        int[] nArray7 = nArray6;
        nArray6[0] = 1;
        int[] nArray8 = spriqh.cfr_renamed_1631();
        int[] nArray9 = spriqh.cfr_renamed_1631();
        int[] nArray10 = spriqh.cfr_renamed_1631();
        int n2 = 447;
        int n3 = 1;
        do {
            int[] nArray11 = nArray7;
            spriqh.cfr_renamed_1654(nArray11, nArray8, nArray9);
            spriqh.cfr_renamed_1641(nArray11, nArray8, nArray7);
            int[] nArray12 = nArray3;
            spriqh.cfr_renamed_1654(nArray12, nArray5, nArray8);
            spriqh.cfr_renamed_1641(nArray12, nArray5, nArray3);
            spriqh.cfr_renamed_1636(nArray9, nArray3, nArray9);
            spriqh.cfr_renamed_1636(nArray7, nArray8, nArray7);
            spriqh.cfr_renamed_8743(nArray8, nArray8);
            spriqh.cfr_renamed_8743(nArray3, nArray3);
            spriqh.cfr_renamed_1641(nArray8, nArray3, nArray10);
            spriqh.cfr_renamed_8744(nArray10, 39082, nArray5);
            int[] nArray13 = nArray5;
            spriqh.cfr_renamed_1654(nArray13, nArray3, nArray5);
            spriqh.cfr_renamed_1636(nArray13, nArray10, nArray5);
            spriqh.cfr_renamed_1636(nArray3, nArray8, nArray3);
            spriqh.cfr_renamed_1641(nArray9, nArray7, nArray8);
            spriqh.cfr_renamed_1654(nArray9, nArray7, nArray7);
            spriqh.cfr_renamed_8743(nArray7, nArray7);
            int[] nArray14 = nArray8;
            spriqh.cfr_renamed_8743(nArray14, nArray8);
            spriqh.cfr_renamed_1636(nArray14, nArray2, nArray8);
            n = --n2 >>> 5;
            int n4 = n2 & 0x1F;
            int n5 = nArray[n] >>> n4 & 1;
            spriqh.cfr_renamed_8851(n3 ^= n5, nArray3, nArray7);
            spriqh.cfr_renamed_8851(n3, nArray5, nArray8);
            n3 = n5;
        } while (n2 >= 2);
        int n6 = n = 0;
        while (n6 < 2) {
            spruyh.cfr_renamed_8882(nArray3, nArray5);
            n6 = ++n;
        }
        spriqh.cfr_renamed_8805(nArray5, nArray5);
        spriqh.cfr_renamed_1636(nArray3, nArray5, nArray3);
        spriqh.cfr_renamed_8746(nArray3);
        spriqh.cfr_renamed_8799(nArray3, arg4, arg5);
    }

    public static void cfr_renamed_8800(SecureRandom arg0, byte[] arg1) {
        if (arg1.length != 56) {
            throw new IllegalArgumentException("k");
        }
        arg0.nextBytes(arg1);
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[0] = (byte)(byArray[0] & 0xFC);
        byArray2[55] = (byte)(byArray2[55] | 0x80);
    }

    private static /* synthetic */ void cfr_renamed_8882(int[] arg0, int[] arg1) {
        int[] nArray = spriqh.cfr_renamed_1631();
        int[] nArray2 = spriqh.cfr_renamed_1631();
        spriqh.cfr_renamed_1654(arg0, arg1, nArray);
        spriqh.cfr_renamed_1641(arg0, arg1, nArray2);
        spriqh.cfr_renamed_8743(nArray, nArray);
        spriqh.cfr_renamed_8743(nArray2, nArray2);
        spriqh.cfr_renamed_1636(nArray, nArray2, arg0);
        spriqh.cfr_renamed_1641(nArray, nArray2, nArray);
        spriqh.cfr_renamed_8744(nArray, 39082, arg1);
        int[] nArray3 = arg1;
        spriqh.cfr_renamed_1654(nArray3, nArray2, arg1);
        spriqh.cfr_renamed_1636(nArray3, nArray, arg1);
    }
}


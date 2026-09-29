/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjrh;
import com.spire.presentation.packages.sprmyh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprxuh;
import java.security.SecureRandom;

public abstract class sprhsh {
    public static final int cfr_renamed_1 = 32;
    private static final int cfr_renamed_2 = 486662;
    public static final int cfr_renamed_3 = 32;
    private static final int cfr_renamed_4 = 121666;

    public static void cfr_renamed_8735(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprhsh.cfr_renamed_8879(arg0, arg1, arg2, arg3);
    }

    public static void cfr_renamed_8881(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int n;
        int[] nArray = new int[8];
        sprhsh.cfr_renamed_8878(arg0, arg1, nArray);
        int[] nArray2 = sprmyh.cfr_renamed_1631();
        sprmyh.cfr_renamed_8876(arg2, arg3, nArray2);
        int[] nArray3 = sprmyh.cfr_renamed_1631();
        sprmyh.cfr_renamed_8546(nArray2, 0, nArray3, 0);
        int[] nArray4 = sprmyh.cfr_renamed_1631();
        int[] nArray5 = nArray4;
        nArray4[0] = 1;
        int[] nArray6 = sprmyh.cfr_renamed_1631();
        int[] nArray7 = nArray6;
        nArray6[0] = 1;
        int[] nArray8 = sprmyh.cfr_renamed_1631();
        int[] nArray9 = sprmyh.cfr_renamed_1631();
        int[] nArray10 = sprmyh.cfr_renamed_1631();
        int n2 = 254;
        int n3 = 1;
        do {
            sprmyh.cfr_renamed_8838(nArray7, nArray8, nArray9, nArray7);
            sprmyh.cfr_renamed_8838(nArray3, nArray5, nArray8, nArray3);
            sprmyh.cfr_renamed_1636(nArray9, nArray3, nArray9);
            sprmyh.cfr_renamed_1636(nArray7, nArray8, nArray7);
            sprmyh.cfr_renamed_8743(nArray8, nArray8);
            sprmyh.cfr_renamed_8743(nArray3, nArray3);
            sprmyh.cfr_renamed_1641(nArray8, nArray3, nArray10);
            sprmyh.cfr_renamed_8744(nArray10, 121666, nArray5);
            int[] nArray11 = nArray5;
            sprmyh.cfr_renamed_1654(nArray11, nArray3, nArray5);
            sprmyh.cfr_renamed_1636(nArray11, nArray10, nArray5);
            sprmyh.cfr_renamed_1636(nArray3, nArray8, nArray3);
            sprmyh.cfr_renamed_8838(nArray9, nArray7, nArray7, nArray8);
            sprmyh.cfr_renamed_8743(nArray7, nArray7);
            int[] nArray12 = nArray8;
            sprmyh.cfr_renamed_8743(nArray12, nArray8);
            sprmyh.cfr_renamed_1636(nArray12, nArray2, nArray8);
            n = --n2 >>> 5;
            int n4 = n2 & 0x1F;
            int n5 = nArray[n] >>> n4 & 1;
            sprmyh.cfr_renamed_8851(n3 ^= n5, nArray3, nArray7);
            sprmyh.cfr_renamed_8851(n3, nArray5, nArray8);
            n3 = n5;
        } while (n2 >= 3);
        int n6 = n = 0;
        while (n6 < 3) {
            sprhsh.cfr_renamed_8882(nArray3, nArray5);
            n6 = ++n;
        }
        sprmyh.cfr_renamed_8805(nArray5, nArray5);
        sprmyh.cfr_renamed_1636(nArray3, nArray5, nArray3);
        sprmyh.cfr_renamed_8746(nArray3);
        sprmyh.cfr_renamed_8799(nArray3, arg4, arg5);
    }

    public static void cfr_renamed_8775() {
        sprjrh.cfr_renamed_8775();
    }

    private static /* synthetic */ void cfr_renamed_8882(int[] arg0, int[] arg1) {
        int[] nArray = sprmyh.cfr_renamed_1631();
        int[] nArray2 = sprmyh.cfr_renamed_1631();
        sprmyh.cfr_renamed_8838(arg0, arg1, nArray, nArray2);
        sprmyh.cfr_renamed_8743(nArray, nArray);
        sprmyh.cfr_renamed_8743(nArray2, nArray2);
        sprmyh.cfr_renamed_1636(nArray, nArray2, arg0);
        sprmyh.cfr_renamed_1641(nArray, nArray2, nArray);
        sprmyh.cfr_renamed_8744(nArray, 121666, arg1);
        int[] nArray3 = arg1;
        sprmyh.cfr_renamed_1654(nArray3, nArray2, arg1);
        sprmyh.cfr_renamed_1636(nArray3, nArray, arg1);
    }

    public static void cfr_renamed_8800(SecureRandom arg0, byte[] arg1) {
        if (arg1.length != 32) {
            throw new IllegalArgumentException("k");
        }
        arg0.nextBytes(arg1);
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        arg1[0] = (byte)(arg1[0] & 0xF8);
        byArray[31] = (byte)(byArray[31] & 0x7F);
        byArray2[31] = (byte)(byArray2[31] | 0x40);
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

    private static /* synthetic */ void cfr_renamed_8878(byte[] arg0, int arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3 = n++;
            arg2[n3] = sprhsh.cfr_renamed_8727(arg0, arg1 + n3 * 4);
            n2 = n;
        }
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        nArray[0] = nArray[0] & 0xFFFFFFF8;
        nArray2[7] = nArray2[7] & Integer.MAX_VALUE;
        arg2[7] = arg2[7] | 0x40000000;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 3 << 3 ^ 4;
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
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

    public static void cfr_renamed_8879(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int[] nArray = sprmyh.cfr_renamed_1631();
        int[] nArray2 = sprmyh.cfr_renamed_1631();
        sprjrh.cfr_renamed_8861(sprxuh.cfr_renamed_2413(), arg0, arg1, nArray, nArray2);
        sprmyh.cfr_renamed_8838(nArray2, nArray, nArray, nArray2);
        sprmyh.cfr_renamed_8805(nArray2, nArray2);
        sprmyh.cfr_renamed_1636(nArray, nArray2, nArray);
        sprmyh.cfr_renamed_8746(nArray);
        sprmyh.cfr_renamed_8799(nArray, arg2, arg3);
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
        sprhsh.cfr_renamed_8881(arg0, (int)arg1, (byte[])arg2, (int)arg3, (byte[])arg4, (int)arg5);
        return !sproze.cfr_renamed_5269(byArray3, (int)arg5, 32);
    }
}


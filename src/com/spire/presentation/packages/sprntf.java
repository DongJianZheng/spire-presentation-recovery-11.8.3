/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbg;
import com.spire.presentation.packages.spricg;
import com.spire.presentation.packages.sprzfl;
import java.security.SecureRandom;

public class sprntf {
    public static final int cfr_renamed_0 = 1024;
    public static final int cfr_renamed_1 = 1824;
    public static final int cfr_renamed_2 = 2048;
    private static final boolean cfr_renamed_3 = false;
    public static final int cfr_renamed_4 = 32;

    public static void cfr_renamed_6424(byte[] arg0) {
        sprzfl sprzfl2;
        sprzfl sprzfl3 = sprzfl2 = new sprzfl(256);
        sprzfl3.cfr_renamed_1197(arg0, 0, 32);
        sprzfl3.cfr_renamed_1219(arg0, 0);
    }

    public static void cfr_renamed_6425(short[] arg0, byte[] arg1) {
        sprcbg.cfr_renamed_6409(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6426(short[] sArray, short[] sArray2, byte[] byArray) {
        int n;
        void arg2;
        short[] arg0;
        sprcbg.cfr_renamed_6414(arg0, (byte[])arg2);
        int n2 = n = 0;
        while (n2 < 256) {
            void arg1;
            int n3 = 4 * n;
            int n4 = arg2[1792 + n] & 0xFF;
            void v1 = arg1;
            int n5 = n3;
            arg1[n3 + 0] = (short)(n4 & 3);
            arg1[n5 + 1] = (short)(n4 >>> 2 & 3);
            v1[n5 + 2] = (short)(n4 >>> 4 & 3);
            v1[n3 + 3] = (short)(n4 >>> 6);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6427(short[] sArray, byte[] byArray, byte[] byArray2) {
        void arg1;
        short[] arg0;
        void arg2;
        void v0 = arg2;
        sprcbg.cfr_renamed_6414(arg0, (byte[])v0);
        System.arraycopy(v0, 1792, arg1, 0, 32);
    }

    public static void cfr_renamed_6421(SecureRandom arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        short[] sArray;
        short[] sArray2 = new short[1024];
        byte[] byArray = new byte[32];
        sprntf.cfr_renamed_6427(sArray2, byArray, arg3);
        short[] sArray3 = new short[1024];
        sprntf.cfr_renamed_6425(sArray3, byArray);
        byte[] byArray2 = new byte[32];
        arg0.nextBytes(byArray2);
        short[] sArray4 = sArray = new short[1024];
        sprcbg.cfr_renamed_6412(sArray4, byArray2, (byte)0);
        sprcbg.cfr_renamed_6416(sArray);
        short[] sArray5 = new short[1024];
        sprcbg.cfr_renamed_6412(sArray5, byArray2, (byte)1);
        sprcbg.cfr_renamed_6416(sArray5);
        short[] sArray6 = new short[1024];
        sprcbg.cfr_renamed_6415(sArray3, sArray4, sArray6);
        sprcbg.cfr_renamed_6411(sArray6, sArray5, sArray6);
        short[] sArray7 = new short[1024];
        sprcbg.cfr_renamed_6415(sArray2, sArray, sArray7);
        sprcbg.cfr_renamed_6403(sArray7);
        short[] sArray8 = new short[1024];
        sprcbg.cfr_renamed_6412(sArray8, byArray2, (byte)2);
        sprcbg.cfr_renamed_6411(sArray7, sArray8, sArray7);
        short[] sArray9 = new short[1024];
        spricg.cfr_renamed_6428(sArray9, sArray7, byArray2, (byte)3);
        sprntf.cfr_renamed_6429(arg2, sArray6, sArray9);
        spricg.cfr_renamed_6430(arg1, sArray7, sArray9);
        sprntf.cfr_renamed_6424(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6431(byte[] byArray, short[] sArray, byte[] byArray2) {
        void arg1;
        byte[] arg0;
        sprcbg.cfr_renamed_6407(arg0, (short[])arg1);
        System.arraycopy(byArray2, 0, arg0, 1792, 32);
    }

    public static void cfr_renamed_6423(byte[] arg0, short[] arg1, byte[] arg2) {
        short[] sArray = new short[1024];
        short[] sArray2 = new short[1024];
        sprntf.cfr_renamed_6426(sArray, sArray2, arg2);
        short[] sArray3 = new short[1024];
        sprcbg.cfr_renamed_6415(arg1, sArray, sArray3);
        sprcbg.cfr_renamed_6403(sArray3);
        spricg.cfr_renamed_6430(arg0, sArray3, sArray2);
        sprntf.cfr_renamed_6424(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6429(byte[] byArray, short[] sArray, short[] sArray2) {
        int n;
        void arg1;
        byte[] arg0;
        sprcbg.cfr_renamed_6407(arg0, (short[])arg1);
        int n2 = n = 0;
        while (n2 < 256) {
            void arg2;
            int n3 = 4 * n;
            int n4 = 1792 + n;
            arg0[n4] = (byte)(arg2[n3] | arg2[n3 + 1] << 2 | arg2[n3 + 2] << 4 | arg2[n3 + 3] << 6);
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6420(SecureRandom arg0, byte[] arg1, short[] arg2) {
        byte[] byArray = new byte[32];
        SecureRandom secureRandom = arg0;
        secureRandom.nextBytes(byArray);
        sprntf.cfr_renamed_6424(byArray);
        short[] sArray = new short[1024];
        sprntf.cfr_renamed_6425(sArray, byArray);
        byte[] byArray2 = new byte[32];
        secureRandom.nextBytes(byArray2);
        sprcbg.cfr_renamed_6412(arg2, byArray2, (byte)0);
        sprcbg.cfr_renamed_6416(arg2);
        short[] sArray2 = new short[1024];
        sprcbg.cfr_renamed_6412(sArray2, byArray2, (byte)1);
        sprcbg.cfr_renamed_6416(sArray2);
        short[] sArray3 = new short[1024];
        sprcbg.cfr_renamed_6415(sArray, arg2, sArray3);
        short[] sArray4 = new short[1024];
        sprcbg.cfr_renamed_6411(sArray3, sArray2, sArray4);
        sprntf.cfr_renamed_6431(arg1, sArray4, byArray);
    }
}


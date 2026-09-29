/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;

public class sprbfg {
    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7129(byte[] byArray, int n, long l) {
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        arg0[arg1 + false] = (byte)(arg2 >> 0 & 0xFFL);
        arg0[arg1 + true] = (byte)(arg2 >> 8 & 0xFFL);
        arg0[v1 + 2] = (byte)(arg2 >> 16 & 0xFFL);
        arg0[v1 + 3] = (byte)(arg2 >> 24 & 0xFFL);
        arg0[arg1 + 4] = (byte)(arg2 >> 32 & 0xFFL);
        arg0[v0 + 5] = (byte)(arg2 >> 40 & 0xFFL);
        arg0[v0 + 6] = (byte)(arg2 >> 48 & 0xFFL);
        arg0[n + 7] = (byte)(arg2 >> 56 & 0xFFL);
    }

    public static short cfr_renamed_7130(byte[] arg0, int arg1, int arg2) {
        return (short)(sprpxe.cfr_renamed_5180(arg0, arg1) & arg2);
    }

    public static int cfr_renamed_7131(byte[] arg0, int arg1) {
        return sprpxe.cfr_renamed_439(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7132(byte[] byArray, int n, short s) {
        void arg2;
        arg0[arg1 + false] = (byte)(arg2 & 0xFF);
        arg0[n + 1] = (byte)(arg2 >> 8);
    }

    public static short cfr_renamed_7133(short arg0, int arg1) {
        arg0 = (short)((arg0 & 0xFF) << 8 | (arg0 & 0xFF00) >> 8);
        arg0 = (short)((arg0 & 0xF0F) << 4 | (arg0 & 0xF0F0) >> 4);
        arg0 = (short)((arg0 & 0x3333) << 2 | (arg0 & 0xCCCC) >> 2);
        arg0 = (short)((arg0 & 0x5555) << 1 | (arg0 & 0xAAAA) >> 1);
        if (arg1 == 12) {
            return (short)(arg0 >> 4);
        }
        return (short)(arg0 >> 3);
    }

    public static long cfr_renamed_7134(byte[] arg0, int arg1) {
        return sprpxe.cfr_renamed_443(arg0, arg1);
    }
}


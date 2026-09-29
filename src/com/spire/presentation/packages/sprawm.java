/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprawm {
    public static int[] cfr_renamed_3;
    private static byte[] cfr_renamed_4;

    public static short cfr_renamed_12177(int arg0) {
        return (short)((cfr_renamed_4[arg0 & 0xF] & 0xFF) << 12 | (cfr_renamed_4[arg0 >> 4 & 0xF] & 0xFF) << 8 | (cfr_renamed_4[arg0 >> 8 & 0xF] & 0xFF) << 4 | cfr_renamed_4[arg0 >> 12] & 0xFF);
    }

    static {
        byte[] byArray = new byte[16];
        byArray[0] = 0;
        byArray[1] = 8;
        byArray[2] = 4;
        byArray[3] = 12;
        byArray[4] = 2;
        byArray[5] = 10;
        byArray[6] = 6;
        byArray[7] = 14;
        byArray[8] = 1;
        byArray[9] = 9;
        byArray[10] = 5;
        byArray[11] = 13;
        byArray[12] = 3;
        byArray[13] = 11;
        byArray[14] = 7;
        byArray[15] = 15;
        cfr_renamed_4 = byArray;
        int[] nArray = new int[19];
        nArray[0] = 16;
        nArray[1] = 17;
        nArray[2] = 18;
        nArray[3] = 0;
        nArray[4] = 8;
        nArray[5] = 7;
        nArray[6] = 9;
        nArray[7] = 6;
        nArray[8] = 10;
        nArray[9] = 5;
        nArray[10] = 11;
        nArray[11] = 4;
        nArray[12] = 12;
        nArray[13] = 3;
        nArray[14] = 13;
        nArray[15] = 2;
        nArray[16] = 14;
        nArray[17] = 1;
        nArray[18] = 15;
        cfr_renamed_3 = nArray;
    }
}


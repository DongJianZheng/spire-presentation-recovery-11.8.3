/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcim;

public class sprajm
extends sprcim {
    private static final int[] cfr_renamed_2;
    private static final int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    static {
        int n;
        int n2;
        int n3;
        int[] nArray = new int[256];
        int[] nArray2 = new int[256];
        int[] nArray3 = new int[256];
        int n4 = 0x800000;
        int n5 = n3 = 1;
        while (n5 < 256) {
            n2 = n4 << 8 >> 31 & 0x1864CFB;
            n4 = n4 << 1 ^ n2;
            int n6 = n = 0;
            while (n6 < n3) {
                nArray[n3 + ++n] = n4 ^ nArray[n];
                n6 = n;
            }
            n5 = n3 << 1;
        }
        int n7 = n3 = 1;
        while (n7 < 256) {
            n2 = nArray[n3];
            n = (n2 & 0xFFFF) << 8 ^ nArray[n2 >> 16 & 0xFF];
            int n8 = (n & 0xFFFF) << 8 ^ nArray[n >> 16 & 0xFF];
            nArray2[n3] = n;
            nArray3[n3++] = n8;
            n7 = n3;
        }
        cfr_renamed_2 = nArray;
        cfr_renamed_4 = nArray2;
        cfr_renamed_3 = nArray3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11083(byte[] byArray, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_2 = (int[])(cfr_renamed_3[(byArray[n + 0] ^ this.cfr_renamed_2 >> 16) & 0xFF] ^ cfr_renamed_4[(arg0[arg1 + true] ^ this.cfr_renamed_2 >> 8) & 0xFF] ^ cfr_renamed_2[(arg0[arg1 + 2] ^ this.cfr_renamed_2) & 0xFF]);
    }

    @Override
    public void cfr_renamed_11084(int arg0) {
        int n = (arg0 ^ this.cfr_renamed_2 >> 16) & 0xFF;
        this.cfr_renamed_2 = (int[])(this.cfr_renamed_2 << 8 ^ cfr_renamed_2[n]);
    }
}


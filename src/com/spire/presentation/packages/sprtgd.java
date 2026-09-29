/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddd;
import com.spire.presentation.packages.spryoy;

public final class sprtgd
extends sprddd {
    public int[] cfr_renamed_119;
    public int[] cfr_renamed_137;
    private int[] cfr_renamed_91;
    public int[] cfr_renamed_4;
    public static final int cfr_renamed_102 = 16;
    public static final int cfr_renamed_2 = 12;
    public int[] cfr_renamed_3;

    public sprtgd() {
        sprtgd sprtgd2 = this;
        sprtgd sprtgd3 = this;
        this.cfr_renamed_4 = new int[48];
        sprtgd3.cfr_renamed_137 = new int[48];
        sprtgd3.cfr_renamed_3 = new int[192];
        sprtgd2.cfr_renamed_119 = new int[192];
        sprtgd2.cfr_renamed_91 = new int[8];
    }

    @Override
    public int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int[] nArray = new int[4];
        sprtgd sprtgd2 = this;
        sprtgd sprtgd3 = this;
        sprtgd sprtgd4 = this;
        int n = sprtgd4.cfr_renamed_3699(arg0, arg1);
        int n2 = sprtgd4.cfr_renamed_3699(arg0, arg1 + 4);
        int n3 = this.cfr_renamed_3699(arg0, arg1 + 8);
        int n4 = sprtgd3.cfr_renamed_3699(arg0, arg1 + 12);
        sprtgd3.cfr_renamed_3700(n, n2, n3, n4, nArray);
        sprtgd3.cfr_renamed_3548(nArray[0], arg2, arg3);
        this.cfr_renamed_3548(nArray[1], arg2, arg3 + 4);
        sprtgd2.cfr_renamed_3548(nArray[2], arg2, arg3 + 8);
        sprtgd2.cfr_renamed_3548(nArray[3], arg2, arg3 + 12);
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return spryoy.cfr_renamed_9("\u0019H\t]l");
    }

    @Override
    public void cfr_renamed_2402(byte[] arg0) {
        int n;
        int n2;
        int n3;
        int n4 = 1518500249;
        int n5 = 1859775393;
        int n6 = 19;
        int n7 = 17;
        int n8 = n3 = 0;
        while (n8 < 24) {
            int n9 = n2 = 0;
            while (n9 < 8) {
                sprtgd sprtgd2 = this;
                sprtgd2.cfr_renamed_119[n3 * 8 + n2] = n4;
                n4 += n5;
                sprtgd2.cfr_renamed_3[n3 * 8 + n2] = n6;
                n6 = n6 + n7 & 0x1F;
                n9 = ++n2;
            }
            n8 = ++n3;
        }
        byte[] byArray = new byte[64];
        n2 = arg0.length;
        System.arraycopy(arg0, 0, byArray, 0, n2);
        int n10 = n = 0;
        while (n10 < 8) {
            int n11 = n++;
            this.cfr_renamed_91[n11] = this.cfr_renamed_3699(byArray, n11 * 4);
            n10 = n;
        }
        int n12 = n = 0;
        while (n12 < 12) {
            int n13 = n * 2 * 8;
            sprtgd sprtgd3 = this;
            sprtgd sprtgd4 = this;
            sprtgd sprtgd5 = this;
            sprtgd sprtgd6 = this;
            sprtgd5.cfr_renamed_91[6] = sprtgd5.cfr_renamed_91[6] ^ sprtgd6.cfr_renamed_3701(this.cfr_renamed_91[7], this.cfr_renamed_119[n13], sprtgd6.cfr_renamed_3[n13]);
            sprtgd sprtgd7 = this;
            sprtgd5.cfr_renamed_91[5] = sprtgd5.cfr_renamed_91[5] ^ sprtgd7.cfr_renamed_3702(this.cfr_renamed_91[6], this.cfr_renamed_119[n13 + 1], sprtgd7.cfr_renamed_3[n13 + 1]);
            sprtgd sprtgd8 = this;
            sprtgd5.cfr_renamed_91[4] = sprtgd5.cfr_renamed_91[4] ^ sprtgd8.cfr_renamed_3703(this.cfr_renamed_91[5], this.cfr_renamed_119[n13 + 2], sprtgd8.cfr_renamed_3[n13 + 2]);
            sprtgd sprtgd9 = this;
            sprtgd5.cfr_renamed_91[3] = sprtgd5.cfr_renamed_91[3] ^ sprtgd9.cfr_renamed_3701(this.cfr_renamed_91[4], this.cfr_renamed_119[n13 + 3], sprtgd9.cfr_renamed_3[n13 + 3]);
            sprtgd sprtgd10 = this;
            sprtgd5.cfr_renamed_91[2] = sprtgd5.cfr_renamed_91[2] ^ sprtgd10.cfr_renamed_3702(this.cfr_renamed_91[3], this.cfr_renamed_119[n13 + 4], sprtgd10.cfr_renamed_3[n13 + 4]);
            sprtgd sprtgd11 = this;
            sprtgd5.cfr_renamed_91[1] = sprtgd5.cfr_renamed_91[1] ^ sprtgd11.cfr_renamed_3703(this.cfr_renamed_91[2], this.cfr_renamed_119[n13 + 5], sprtgd11.cfr_renamed_3[n13 + 5]);
            sprtgd sprtgd12 = this;
            sprtgd5.cfr_renamed_91[0] = sprtgd5.cfr_renamed_91[0] ^ sprtgd12.cfr_renamed_3701(this.cfr_renamed_91[1], this.cfr_renamed_119[n13 + 6], sprtgd12.cfr_renamed_3[n13 + 6]);
            sprtgd sprtgd13 = this;
            sprtgd4.cfr_renamed_91[7] = sprtgd4.cfr_renamed_91[7] ^ sprtgd13.cfr_renamed_3702(this.cfr_renamed_91[0], this.cfr_renamed_119[n13 + 7], sprtgd13.cfr_renamed_3[n13 + 7]);
            n13 = (n * 2 + 1) * 8;
            sprtgd sprtgd14 = this;
            sprtgd3.cfr_renamed_91[6] = sprtgd3.cfr_renamed_91[6] ^ sprtgd14.cfr_renamed_3701(this.cfr_renamed_91[7], this.cfr_renamed_119[n13], sprtgd14.cfr_renamed_3[n13]);
            sprtgd sprtgd15 = this;
            sprtgd4.cfr_renamed_91[5] = sprtgd4.cfr_renamed_91[5] ^ sprtgd15.cfr_renamed_3702(this.cfr_renamed_91[6], this.cfr_renamed_119[n13 + 1], sprtgd15.cfr_renamed_3[n13 + 1]);
            sprtgd sprtgd16 = this;
            sprtgd3.cfr_renamed_91[4] = sprtgd3.cfr_renamed_91[4] ^ sprtgd16.cfr_renamed_3703(this.cfr_renamed_91[5], this.cfr_renamed_119[n13 + 2], sprtgd16.cfr_renamed_3[n13 + 2]);
            sprtgd sprtgd17 = this;
            sprtgd3.cfr_renamed_91[3] = sprtgd3.cfr_renamed_91[3] ^ sprtgd17.cfr_renamed_3701(this.cfr_renamed_91[4], this.cfr_renamed_119[n13 + 3], sprtgd17.cfr_renamed_3[n13 + 3]);
            sprtgd sprtgd18 = this;
            sprtgd3.cfr_renamed_91[2] = sprtgd3.cfr_renamed_91[2] ^ sprtgd18.cfr_renamed_3702(this.cfr_renamed_91[3], this.cfr_renamed_119[n13 + 4], sprtgd18.cfr_renamed_3[n13 + 4]);
            sprtgd sprtgd19 = this;
            sprtgd3.cfr_renamed_91[1] = sprtgd3.cfr_renamed_91[1] ^ sprtgd19.cfr_renamed_3703(this.cfr_renamed_91[2], this.cfr_renamed_119[n13 + 5], sprtgd19.cfr_renamed_3[n13 + 5]);
            sprtgd sprtgd20 = this;
            sprtgd3.cfr_renamed_91[0] = sprtgd3.cfr_renamed_91[0] ^ sprtgd20.cfr_renamed_3701(this.cfr_renamed_91[1], this.cfr_renamed_119[n13 + 6], sprtgd20.cfr_renamed_3[n13 + 6]);
            sprtgd sprtgd21 = this;
            sprtgd3.cfr_renamed_91[7] = sprtgd3.cfr_renamed_91[7] ^ sprtgd21.cfr_renamed_3702(this.cfr_renamed_91[0], this.cfr_renamed_119[n13 + 7], sprtgd21.cfr_renamed_3[n13 + 7]);
            sprtgd3.cfr_renamed_4[n * 4] = this.cfr_renamed_91[0] & 0x1F;
            sprtgd3.cfr_renamed_4[n * 4 + 1] = this.cfr_renamed_91[2] & 0x1F;
            sprtgd3.cfr_renamed_4[n * 4 + 2] = this.cfr_renamed_91[4] & 0x1F;
            sprtgd3.cfr_renamed_4[n * 4 + 3] = this.cfr_renamed_91[6] & 0x1F;
            sprtgd3.cfr_renamed_137[n * 4] = this.cfr_renamed_91[7];
            sprtgd3.cfr_renamed_137[n * 4 + 1] = this.cfr_renamed_91[5];
            sprtgd3.cfr_renamed_137[n * 4 + 2] = this.cfr_renamed_91[3];
            int n14 = n * 4 + 3;
            sprtgd3.cfr_renamed_137[n14] = this.cfr_renamed_91[1];
            n12 = ++n;
        }
    }

    public final void cfr_renamed_3704(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 6) {
            n = (11 - n2) * 4;
            sprtgd sprtgd2 = this;
            sprtgd sprtgd3 = this;
            sprtgd sprtgd4 = this;
            sprtgd sprtgd5 = this;
            arg3 ^= sprtgd5.cfr_renamed_3701(arg0 ^= sprtgd4.cfr_renamed_3703(arg1 ^= sprtgd3.cfr_renamed_3702(arg2 ^= sprtgd2.cfr_renamed_3701(arg3, this.cfr_renamed_137[n], sprtgd2.cfr_renamed_4[n]), this.cfr_renamed_137[n + 1], sprtgd3.cfr_renamed_4[n + 1]), this.cfr_renamed_137[n + 2], sprtgd4.cfr_renamed_4[n + 2]), this.cfr_renamed_137[n + 3], sprtgd5.cfr_renamed_4[n + 3]);
            n3 = ++n2;
        }
        int n4 = n2 = 6;
        while (n4 < 12) {
            n = (11 - n2) * 4;
            sprtgd sprtgd6 = this;
            arg3 ^= sprtgd6.cfr_renamed_3701(arg0, this.cfr_renamed_137[n + 3], sprtgd6.cfr_renamed_4[n + 3]);
            sprtgd sprtgd7 = this;
            arg0 ^= sprtgd7.cfr_renamed_3703(arg1, this.cfr_renamed_137[n + 2], sprtgd7.cfr_renamed_4[n + 2]);
            sprtgd sprtgd8 = this;
            arg1 ^= sprtgd8.cfr_renamed_3702(arg2, this.cfr_renamed_137[n + 1], sprtgd8.cfr_renamed_4[n + 1]);
            sprtgd sprtgd9 = this;
            arg2 ^= sprtgd9.cfr_renamed_3701(arg3, this.cfr_renamed_137[n], sprtgd9.cfr_renamed_4[n]);
            n4 = ++n2;
        }
        arg4[0] = arg0;
        arg4[1] = arg1;
        arg4[2] = arg2;
        arg4[3] = arg3;
    }

    @Override
    public int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int[] nArray = new int[4];
        sprtgd sprtgd2 = this;
        sprtgd sprtgd3 = this;
        sprtgd sprtgd4 = this;
        int n = sprtgd4.cfr_renamed_3699(arg0, arg1);
        int n2 = sprtgd4.cfr_renamed_3699(arg0, arg1 + 4);
        int n3 = this.cfr_renamed_3699(arg0, arg1 + 8);
        int n4 = sprtgd3.cfr_renamed_3699(arg0, arg1 + 12);
        sprtgd3.cfr_renamed_3704(n, n2, n3, n4, nArray);
        sprtgd3.cfr_renamed_3548(nArray[0], arg2, arg3);
        this.cfr_renamed_3548(nArray[1], arg2, arg3 + 4);
        sprtgd2.cfr_renamed_3548(nArray[2], arg2, arg3 + 8);
        sprtgd2.cfr_renamed_3548(nArray[3], arg2, arg3 + 12);
        return 16;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
    }

    public final void cfr_renamed_3700(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 6) {
            n = n2 * 4;
            sprtgd sprtgd2 = this;
            sprtgd sprtgd3 = this;
            sprtgd sprtgd4 = this;
            sprtgd sprtgd5 = this;
            arg3 ^= sprtgd5.cfr_renamed_3701(arg0 ^= sprtgd4.cfr_renamed_3703(arg1 ^= sprtgd3.cfr_renamed_3702(arg2 ^= sprtgd2.cfr_renamed_3701(arg3, this.cfr_renamed_137[n], sprtgd2.cfr_renamed_4[n]), this.cfr_renamed_137[n + 1], sprtgd3.cfr_renamed_4[n + 1]), this.cfr_renamed_137[n + 2], sprtgd4.cfr_renamed_4[n + 2]), this.cfr_renamed_137[n + 3], sprtgd5.cfr_renamed_4[n + 3]);
            n3 = ++n2;
        }
        int n4 = n2 = 6;
        while (n4 < 12) {
            n = n2 * 4;
            sprtgd sprtgd6 = this;
            arg3 ^= sprtgd6.cfr_renamed_3701(arg0, this.cfr_renamed_137[n + 3], sprtgd6.cfr_renamed_4[n + 3]);
            sprtgd sprtgd7 = this;
            arg0 ^= sprtgd7.cfr_renamed_3703(arg1, this.cfr_renamed_137[n + 2], sprtgd7.cfr_renamed_4[n + 2]);
            sprtgd sprtgd8 = this;
            arg1 ^= sprtgd8.cfr_renamed_3702(arg2, this.cfr_renamed_137[n + 1], sprtgd8.cfr_renamed_4[n + 1]);
            sprtgd sprtgd9 = this;
            arg2 ^= sprtgd9.cfr_renamed_3701(arg3, this.cfr_renamed_137[n], sprtgd9.cfr_renamed_4[n]);
            n4 = ++n2;
        }
        arg4[0] = arg0;
        arg4[1] = arg1;
        arg4[2] = arg2;
        arg4[3] = arg3;
    }
}


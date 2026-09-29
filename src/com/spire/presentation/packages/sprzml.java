/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgcl;
import com.spire.presentation.packages.sprvro;

public final class sprzml
extends sprgcl {
    public static final int cfr_renamed_1 = 12;
    public int[] cfr_renamed_2;
    public int[] cfr_renamed_79;
    public static final int cfr_renamed_86 = 16;
    public int[] cfr_renamed_3;
    public int[] cfr_renamed_91;
    private int[] cfr_renamed_4;

    @Override
    public int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int[] nArray = new int[4];
        sprzml sprzml2 = this;
        sprzml sprzml3 = this;
        sprzml sprzml4 = this;
        int n = sprzml4.cfr_renamed_3699(arg0, arg1);
        int n2 = sprzml4.cfr_renamed_3699(arg0, arg1 + 4);
        int n3 = this.cfr_renamed_3699(arg0, arg1 + 8);
        int n4 = sprzml3.cfr_renamed_3699(arg0, arg1 + 12);
        sprzml3.cfr_renamed_3700(n, n2, n3, n4, nArray);
        sprzml3.cfr_renamed_3548(nArray[0], arg2, arg3);
        this.cfr_renamed_3548(nArray[1], arg2, arg3 + 4);
        sprzml2.cfr_renamed_3548(nArray[2], arg2, arg3 + 8);
        sprzml2.cfr_renamed_3548(nArray[3], arg2, arg3 + 12);
        return 16;
    }

    public sprzml() {
        sprzml sprzml2 = this;
        sprzml sprzml3 = this;
        this.cfr_renamed_79 = new int[48];
        sprzml3.cfr_renamed_91 = new int[48];
        sprzml3.cfr_renamed_3 = new int[192];
        sprzml2.cfr_renamed_2 = new int[192];
        sprzml2.cfr_renamed_4 = new int[8];
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
            sprzml sprzml2 = this;
            sprzml sprzml3 = this;
            sprzml sprzml4 = this;
            sprzml sprzml5 = this;
            arg3 ^= sprzml5.cfr_renamed_3701(arg0 ^= sprzml4.cfr_renamed_3703(arg1 ^= sprzml3.cfr_renamed_3702(arg2 ^= sprzml2.cfr_renamed_3701(arg3, this.cfr_renamed_91[n], sprzml2.cfr_renamed_79[n]), this.cfr_renamed_91[n + 1], sprzml3.cfr_renamed_79[n + 1]), this.cfr_renamed_91[n + 2], sprzml4.cfr_renamed_79[n + 2]), this.cfr_renamed_91[n + 3], sprzml5.cfr_renamed_79[n + 3]);
            n3 = ++n2;
        }
        int n4 = n2 = 6;
        while (n4 < 12) {
            n = n2 * 4;
            sprzml sprzml6 = this;
            arg3 ^= sprzml6.cfr_renamed_3701(arg0, this.cfr_renamed_91[n + 3], sprzml6.cfr_renamed_79[n + 3]);
            sprzml sprzml7 = this;
            arg0 ^= sprzml7.cfr_renamed_3703(arg1, this.cfr_renamed_91[n + 2], sprzml7.cfr_renamed_79[n + 2]);
            sprzml sprzml8 = this;
            arg1 ^= sprzml8.cfr_renamed_3702(arg2, this.cfr_renamed_91[n + 1], sprzml8.cfr_renamed_79[n + 1]);
            sprzml sprzml9 = this;
            arg2 ^= sprzml9.cfr_renamed_3701(arg3, this.cfr_renamed_91[n], sprzml9.cfr_renamed_79[n]);
            n4 = ++n2;
        }
        arg4[0] = arg0;
        arg4[1] = arg1;
        arg4[2] = arg2;
        arg4[3] = arg3;
    }

    public final void cfr_renamed_3704(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 6) {
            n = (11 - n2) * 4;
            sprzml sprzml2 = this;
            sprzml sprzml3 = this;
            sprzml sprzml4 = this;
            sprzml sprzml5 = this;
            arg3 ^= sprzml5.cfr_renamed_3701(arg0 ^= sprzml4.cfr_renamed_3703(arg1 ^= sprzml3.cfr_renamed_3702(arg2 ^= sprzml2.cfr_renamed_3701(arg3, this.cfr_renamed_91[n], sprzml2.cfr_renamed_79[n]), this.cfr_renamed_91[n + 1], sprzml3.cfr_renamed_79[n + 1]), this.cfr_renamed_91[n + 2], sprzml4.cfr_renamed_79[n + 2]), this.cfr_renamed_91[n + 3], sprzml5.cfr_renamed_79[n + 3]);
            n3 = ++n2;
        }
        int n4 = n2 = 6;
        while (n4 < 12) {
            n = (11 - n2) * 4;
            sprzml sprzml6 = this;
            arg3 ^= sprzml6.cfr_renamed_3701(arg0, this.cfr_renamed_91[n + 3], sprzml6.cfr_renamed_79[n + 3]);
            sprzml sprzml7 = this;
            arg0 ^= sprzml7.cfr_renamed_3703(arg1, this.cfr_renamed_91[n + 2], sprzml7.cfr_renamed_79[n + 2]);
            sprzml sprzml8 = this;
            arg1 ^= sprzml8.cfr_renamed_3702(arg2, this.cfr_renamed_91[n + 1], sprzml8.cfr_renamed_79[n + 1]);
            sprzml sprzml9 = this;
            arg2 ^= sprzml9.cfr_renamed_3701(arg3, this.cfr_renamed_91[n], sprzml9.cfr_renamed_79[n]);
            n4 = ++n2;
        }
        arg4[0] = arg0;
        arg4[1] = arg1;
        arg4[2] = arg2;
        arg4[3] = arg3;
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
                sprzml sprzml2 = this;
                sprzml2.cfr_renamed_2[n3 * 8 + n2] = n4;
                n4 += n5;
                sprzml2.cfr_renamed_3[n3 * 8 + n2] = n6;
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
            this.cfr_renamed_4[n11] = this.cfr_renamed_3699(byArray, n11 * 4);
            n10 = n;
        }
        int n12 = n = 0;
        while (n12 < 12) {
            int n13 = n * 2 * 8;
            sprzml sprzml3 = this;
            sprzml sprzml4 = this;
            sprzml sprzml5 = this;
            sprzml sprzml6 = this;
            sprzml5.cfr_renamed_4[6] = sprzml5.cfr_renamed_4[6] ^ sprzml6.cfr_renamed_3701(this.cfr_renamed_4[7], this.cfr_renamed_2[n13], sprzml6.cfr_renamed_3[n13]);
            sprzml sprzml7 = this;
            sprzml5.cfr_renamed_4[5] = sprzml5.cfr_renamed_4[5] ^ sprzml7.cfr_renamed_3702(this.cfr_renamed_4[6], this.cfr_renamed_2[n13 + 1], sprzml7.cfr_renamed_3[n13 + 1]);
            sprzml sprzml8 = this;
            sprzml5.cfr_renamed_4[4] = sprzml5.cfr_renamed_4[4] ^ sprzml8.cfr_renamed_3703(this.cfr_renamed_4[5], this.cfr_renamed_2[n13 + 2], sprzml8.cfr_renamed_3[n13 + 2]);
            sprzml sprzml9 = this;
            sprzml5.cfr_renamed_4[3] = sprzml5.cfr_renamed_4[3] ^ sprzml9.cfr_renamed_3701(this.cfr_renamed_4[4], this.cfr_renamed_2[n13 + 3], sprzml9.cfr_renamed_3[n13 + 3]);
            sprzml sprzml10 = this;
            sprzml5.cfr_renamed_4[2] = sprzml5.cfr_renamed_4[2] ^ sprzml10.cfr_renamed_3702(this.cfr_renamed_4[3], this.cfr_renamed_2[n13 + 4], sprzml10.cfr_renamed_3[n13 + 4]);
            sprzml sprzml11 = this;
            sprzml5.cfr_renamed_4[1] = sprzml5.cfr_renamed_4[1] ^ sprzml11.cfr_renamed_3703(this.cfr_renamed_4[2], this.cfr_renamed_2[n13 + 5], sprzml11.cfr_renamed_3[n13 + 5]);
            sprzml sprzml12 = this;
            sprzml5.cfr_renamed_4[0] = sprzml5.cfr_renamed_4[0] ^ sprzml12.cfr_renamed_3701(this.cfr_renamed_4[1], this.cfr_renamed_2[n13 + 6], sprzml12.cfr_renamed_3[n13 + 6]);
            sprzml sprzml13 = this;
            sprzml4.cfr_renamed_4[7] = sprzml4.cfr_renamed_4[7] ^ sprzml13.cfr_renamed_3702(this.cfr_renamed_4[0], this.cfr_renamed_2[n13 + 7], sprzml13.cfr_renamed_3[n13 + 7]);
            n13 = (n * 2 + 1) * 8;
            sprzml sprzml14 = this;
            sprzml3.cfr_renamed_4[6] = sprzml3.cfr_renamed_4[6] ^ sprzml14.cfr_renamed_3701(this.cfr_renamed_4[7], this.cfr_renamed_2[n13], sprzml14.cfr_renamed_3[n13]);
            sprzml sprzml15 = this;
            sprzml4.cfr_renamed_4[5] = sprzml4.cfr_renamed_4[5] ^ sprzml15.cfr_renamed_3702(this.cfr_renamed_4[6], this.cfr_renamed_2[n13 + 1], sprzml15.cfr_renamed_3[n13 + 1]);
            sprzml sprzml16 = this;
            sprzml3.cfr_renamed_4[4] = sprzml3.cfr_renamed_4[4] ^ sprzml16.cfr_renamed_3703(this.cfr_renamed_4[5], this.cfr_renamed_2[n13 + 2], sprzml16.cfr_renamed_3[n13 + 2]);
            sprzml sprzml17 = this;
            sprzml3.cfr_renamed_4[3] = sprzml3.cfr_renamed_4[3] ^ sprzml17.cfr_renamed_3701(this.cfr_renamed_4[4], this.cfr_renamed_2[n13 + 3], sprzml17.cfr_renamed_3[n13 + 3]);
            sprzml sprzml18 = this;
            sprzml3.cfr_renamed_4[2] = sprzml3.cfr_renamed_4[2] ^ sprzml18.cfr_renamed_3702(this.cfr_renamed_4[3], this.cfr_renamed_2[n13 + 4], sprzml18.cfr_renamed_3[n13 + 4]);
            sprzml sprzml19 = this;
            sprzml3.cfr_renamed_4[1] = sprzml3.cfr_renamed_4[1] ^ sprzml19.cfr_renamed_3703(this.cfr_renamed_4[2], this.cfr_renamed_2[n13 + 5], sprzml19.cfr_renamed_3[n13 + 5]);
            sprzml sprzml20 = this;
            sprzml3.cfr_renamed_4[0] = sprzml3.cfr_renamed_4[0] ^ sprzml20.cfr_renamed_3701(this.cfr_renamed_4[1], this.cfr_renamed_2[n13 + 6], sprzml20.cfr_renamed_3[n13 + 6]);
            sprzml sprzml21 = this;
            sprzml3.cfr_renamed_4[7] = sprzml3.cfr_renamed_4[7] ^ sprzml21.cfr_renamed_3702(this.cfr_renamed_4[0], this.cfr_renamed_2[n13 + 7], sprzml21.cfr_renamed_3[n13 + 7]);
            sprzml3.cfr_renamed_79[n * 4] = this.cfr_renamed_4[0] & 0x1F;
            sprzml3.cfr_renamed_79[n * 4 + 1] = this.cfr_renamed_4[2] & 0x1F;
            sprzml3.cfr_renamed_79[n * 4 + 2] = this.cfr_renamed_4[4] & 0x1F;
            sprzml3.cfr_renamed_79[n * 4 + 3] = this.cfr_renamed_4[6] & 0x1F;
            sprzml3.cfr_renamed_91[n * 4] = this.cfr_renamed_4[7];
            sprzml3.cfr_renamed_91[n * 4 + 1] = this.cfr_renamed_4[5];
            sprzml3.cfr_renamed_91[n * 4 + 2] = this.cfr_renamed_4[3];
            int n14 = n * 4 + 3;
            sprzml3.cfr_renamed_91[n14] = this.cfr_renamed_4[1];
            n12 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvro.cfr_renamed_9("\u000e\u0003\u001e\u0016{");
    }

    @Override
    public int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int[] nArray = new int[4];
        sprzml sprzml2 = this;
        sprzml sprzml3 = this;
        sprzml sprzml4 = this;
        int n = sprzml4.cfr_renamed_3699(arg0, arg1);
        int n2 = sprzml4.cfr_renamed_3699(arg0, arg1 + 4);
        int n3 = this.cfr_renamed_3699(arg0, arg1 + 8);
        int n4 = sprzml3.cfr_renamed_3699(arg0, arg1 + 12);
        sprzml3.cfr_renamed_3704(n, n2, n3, n4, nArray);
        sprzml3.cfr_renamed_3548(nArray[0], arg2, arg3);
        this.cfr_renamed_3548(nArray[1], arg2, arg3 + 4);
        sprzml2.cfr_renamed_3548(nArray[2], arg2, arg3 + 8);
        sprzml2.cfr_renamed_3548(nArray[3], arg2, arg3 + 12);
        return 16;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }
}


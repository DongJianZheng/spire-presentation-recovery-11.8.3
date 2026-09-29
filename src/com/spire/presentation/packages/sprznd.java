/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdnd;
import com.spire.presentation.packages.sprmo;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprzra;

public class sprznd
implements sprmo {
    private int[][][] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_3237(byte[] arg0) {
        int n;
        int[] nArray = new int[4];
        int n2 = n = 15;
        while (n2 >= 0) {
            sprznd sprznd2 = this;
            int n3 = n;
            int[] nArray2 = sprznd2.cfr_renamed_3[n3 + n3][arg0[n] & 0xF];
            int[] nArray3 = nArray;
            int[] nArray4 = nArray;
            int[] nArray5 = nArray;
            int[] nArray6 = nArray;
            nArray5[0] = nArray5[0] ^ nArray2[0];
            nArray6[1] = nArray6[1] ^ nArray2[1];
            nArray3[2] = nArray3[2] ^ nArray2[2];
            nArray4[3] = nArray4[3] ^ nArray2[3];
            int n4 = n;
            nArray2 = sprznd2.cfr_renamed_3[n4 + n4 + 1][(arg0[n] & 0xF0) >>> 4];
            int[] nArray7 = nArray;
            int[] nArray8 = nArray;
            int[] nArray9 = nArray;
            int[] nArray10 = nArray;
            nArray9[0] = nArray9[0] ^ nArray2[0];
            nArray10[1] = nArray10[1] ^ nArray2[1];
            nArray7[2] = nArray7[2] ^ nArray2[2];
            nArray8[3] = nArray8[3] ^ nArray2[3];
            n2 = --n;
        }
        sprtsa.cfr_renamed_457(nArray, arg0, 0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_148(byte[] arg0) {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = new int[32][16][4];
            v0 = this;
        } else {
            if (sprzra.cfr_renamed_92(this.cfr_renamed_4, arg0)) {
                return;
            }
            v0 = this;
        }
        v0.cfr_renamed_4 = sprzra.cfr_renamed_158(arg0);
        sprdnd.cfr_renamed_3423(arg0, this.cfr_renamed_3[1][8]);
        v1 = var2_2 = 4;
        while (v1 >= 1) {
            v2 = var2_2;
            sprdnd.cfr_renamed_3424(this.cfr_renamed_3[1][v2 + v2], this.cfr_renamed_3[1][var2_2]);
            v1 = v2 >> 1;
        }
        sprdnd.cfr_renamed_3424(this.cfr_renamed_3[1][1], this.cfr_renamed_3[0][8]);
        v3 = var2_2 = 4;
        while (v3 >= 1) {
            v4 = var2_2;
            sprdnd.cfr_renamed_3424(this.cfr_renamed_3[0][v4 + v4], this.cfr_renamed_3[0][var2_2]);
            v3 = v4 >> 1;
        }
        var2_2 = 0;
        block2: while (true) {
            v5 = var3_3 = 2;
            while (v5 < 16) {
                v6 = var4_4 = 1;
                while (v6 < var3_3) {
                    v7 = this.cfr_renamed_3[var2_2][var4_4];
                    v8 = var3_3 + var4_4;
                    sprdnd.cfr_renamed_3425(this.cfr_renamed_3[var2_2][var3_3], v7, this.cfr_renamed_3[var2_2][v8]);
                    v6 = ++var4_4;
                }
                v9 = var3_3;
                v5 = v9 + v9;
            }
            if (++var2_2 == 32) {
                return;
            }
            if (var2_2 <= 1) continue;
            v10 = var3_3 = 8;
            while (true) {
                if (v10 > 0) ** break;
                continue block2;
                v11 = var3_3;
                sprdnd.cfr_renamed_3426(this.cfr_renamed_3[var2_2 - 2][var3_3], this.cfr_renamed_3[var2_2][v11]);
                v10 = v11 >> 1;
            }
            break;
        }
    }
}


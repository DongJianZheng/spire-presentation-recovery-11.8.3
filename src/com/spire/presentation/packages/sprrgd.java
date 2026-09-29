/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdnd;
import com.spire.presentation.packages.sprmo;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprzra;

public class sprrgd
implements sprmo {
    private byte[] cfr_renamed_3;
    private int[][][] cfr_renamed_4;

    @Override
    public void cfr_renamed_3237(byte[] arg0) {
        int n;
        int[] nArray = new int[4];
        int n2 = n = 15;
        while (n2 >= 0) {
            int[] nArray2 = this.cfr_renamed_4[n][arg0[n] & 0xFF];
            int[] nArray3 = nArray;
            int[] nArray4 = nArray;
            int[] nArray5 = nArray;
            int[] nArray6 = nArray;
            nArray5[0] = nArray5[0] ^ nArray2[0];
            nArray6[1] = nArray6[1] ^ nArray2[1];
            nArray3[2] = nArray3[2] ^ nArray2[2];
            nArray4[3] = nArray4[3] ^ nArray2[3];
            n2 = --n;
        }
        sprtsa.cfr_renamed_457(nArray, arg0, 0);
    }

    @Override
    public void cfr_renamed_148(byte[] arg0) {
        int n;
        sprrgd sprrgd2;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new int[16][256][4];
            sprrgd2 = this;
        } else {
            if (sprzra.cfr_renamed_92(this.cfr_renamed_3, arg0)) {
                return;
            }
            sprrgd2 = this;
        }
        sprrgd2.cfr_renamed_3 = sprzra.cfr_renamed_158(arg0);
        sprdnd.cfr_renamed_3423(arg0, this.cfr_renamed_4[0][128]);
        int n2 = n = 64;
        while (n2 >= 1) {
            int n3 = n;
            sprdnd.cfr_renamed_3424(this.cfr_renamed_4[0][n3 + n3], this.cfr_renamed_4[0][n]);
            n2 = n3 >> 1;
        }
        n = 0;
        block1: while (true) {
            int n4;
            int n5 = n4 = 2;
            while (n5 < 256) {
                int n6;
                int n7 = n6 = 1;
                while (n7 < n4) {
                    int[] nArray = this.cfr_renamed_4[n][n6];
                    int n8 = n4 + n6;
                    sprdnd.cfr_renamed_3425(this.cfr_renamed_4[n][n4], nArray, this.cfr_renamed_4[n][n8]);
                    n7 = ++n6;
                }
                int n9 = n4;
                n5 = n9 + n9;
            }
            if (++n == 16) {
                return;
            }
            int n10 = n4 = 128;
            while (true) {
                if (n10 <= 0) continue block1;
                int n11 = n4;
                sprdnd.cfr_renamed_3426(this.cfr_renamed_4[n - 1][n4], this.cfr_renamed_4[n][n11]);
                n10 = n11 >> 1;
            }
            break;
        }
    }
}


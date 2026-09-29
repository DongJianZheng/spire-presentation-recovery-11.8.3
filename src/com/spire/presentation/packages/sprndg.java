/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprsyf;
import com.spire.presentation.packages.sprudg;

public class sprndg {
    public byte[][] cfr_renamed_1;
    private sprqag cfr_renamed_2;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprndg(sprqag sprqag2) {
        void arg0;
        sprndg sprndg2 = this;
        sprndg2.cfr_renamed_2 = arg0;
        sprndg2.cfr_renamed_1 = new byte[sprqag2.cfr_renamed_31][2 * arg0.cfr_renamed_93];
        sprndg sprndg3 = this;
        sprndg3.cfr_renamed_4 = 0;
        sprndg3.cfr_renamed_3 = arg0.cfr_renamed_31;
    }

    public void cfr_renamed_6240(byte[] arg0) {
        int n;
        sprndg sprndg2 = this;
        int n2 = sprndg2.cfr_renamed_2.cfr_renamed_31 - 1;
        int n3 = 0;
        int n4 = sprndg2.cfr_renamed_2.cfr_renamed_145;
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_2.cfr_renamed_1226) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < n4) {
                int n8 = n4;
                sprudg.cfr_renamed_6201(this.cfr_renamed_1[n2], n8 + n8 * 2 * n + n6, sprudg.cfr_renamed_714(arg0, n3));
                ++n3;
                n7 = ++n6;
            }
            n5 = ++n;
        }
    }

    public int cfr_renamed_6241() {
        int n = 0;
        sprndg sprndg2 = this;
        int n2 = sprndg2.cfr_renamed_4 >>> 3;
        int n3 = sprndg2.cfr_renamed_4 & 7 ^ 7;
        int n4 = 1 << n3;
        n |= (this.cfr_renamed_1[0][n2] & n4) << 7;
        n |= (this.cfr_renamed_1[1][n2] & n4) << 6;
        n |= (this.cfr_renamed_1[2][n2] & n4) << 5;
        n |= (this.cfr_renamed_1[3][n2] & n4) << 4;
        n |= (this.cfr_renamed_1[4][n2] & n4) << 3;
        n |= (this.cfr_renamed_1[5][n2] & n4) << 2;
        n |= (this.cfr_renamed_1[6][n2] & n4) << 1;
        n |= (this.cfr_renamed_1[7][n2] & n4) << 0;
        n |= (this.cfr_renamed_1[8][n2] & n4) << 15;
        n |= (this.cfr_renamed_1[9][n2] & n4) << 14;
        n |= (this.cfr_renamed_1[10][n2] & n4) << 13;
        n |= (this.cfr_renamed_1[11][n2] & n4) << 12;
        n |= (this.cfr_renamed_1[12][n2] & n4) << 11;
        n |= (this.cfr_renamed_1[13][n2] & n4) << 10;
        n |= (this.cfr_renamed_1[14][n2] & n4) << 9;
        sprndg sprndg3 = this;
        ++sprndg3.cfr_renamed_4;
        return (n |= (sprndg3.cfr_renamed_1[15][n2] & n4) << 8) >>> n3;
    }

    public void cfr_renamed_6242(byte[] arg0) {
        int n;
        int[] nArray = new int[16];
        int[] nArray2 = new int[16];
        int[] nArray3 = new int[16];
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[16];
        int[] nArray6 = nArray5;
        sprndg sprndg2 = this;
        nArray5[sprndg2.cfr_renamed_2.cfr_renamed_114 - 1] = 0;
        sprndg sprndg3 = this;
        sprndg3.cfr_renamed_6243(nArray6, sprndg3.cfr_renamed_2.cfr_renamed_145);
        sprsyf sprsyf2 = sprndg2.cfr_renamed_2.cfr_renamed_951.cfr_renamed_6244(this.cfr_renamed_2);
        sprndg2.cfr_renamed_2.cfr_renamed_6245(nArray4, nArray6, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
        if (arg0 != null) {
            sprpxe.cfr_renamed_5171(nArray4, 0, this.cfr_renamed_2.cfr_renamed_114, arg0, 0);
        }
        int n2 = n = this.cfr_renamed_2.cfr_renamed_1226;
        while (n2 > 0) {
            sprndg sprndg4;
            sprndg sprndg5 = this;
            sprndg sprndg6 = this;
            sprsyf2 = sprndg5.cfr_renamed_2.cfr_renamed_951.cfr_renamed_6247(sprndg6.cfr_renamed_2, n);
            sprndg5.cfr_renamed_2.cfr_renamed_6245(nArray, nArray4, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            sprndg6.cfr_renamed_2.cfr_renamed_6248(nArray2, nArray2, nArray, 0);
            sprsyf2 = sprndg5.cfr_renamed_2.cfr_renamed_951.cfr_renamed_6249(this.cfr_renamed_2, n - 1);
            sprndg5.cfr_renamed_2.cfr_renamed_6245(nArray3, nArray2, sprsyf2.cfr_renamed_2609(), sprsyf2.cfr_renamed_6246());
            if (n == 1) {
                System.arraycopy(nArray6, 0, nArray2, 0, nArray6.length);
                sprndg4 = this;
            } else {
                sprndg4 = this;
                sprndg sprndg7 = this;
                sprndg7.cfr_renamed_4 = this.cfr_renamed_2.cfr_renamed_145 * 2 * (n - 1);
                sprndg7.cfr_renamed_6243(nArray2, sprndg7.cfr_renamed_2.cfr_renamed_145);
            }
            sprndg4.cfr_renamed_4 = this.cfr_renamed_2.cfr_renamed_145 * 2 * (n - 1) + this.cfr_renamed_2.cfr_renamed_145;
            this.cfr_renamed_2.cfr_renamed_6250(nArray2, nArray3, this);
            n2 = --n;
        }
        this.cfr_renamed_4 = 0;
    }

    private /* synthetic */ void cfr_renamed_6243(int[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1) {
            sprudg.cfr_renamed_6212(arg0, n++, sprudg.cfr_renamed_6207(this.cfr_renamed_6241()));
            n2 = n;
        }
    }
}


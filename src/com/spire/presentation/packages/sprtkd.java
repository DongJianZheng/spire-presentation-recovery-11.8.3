/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreyc;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprmis;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spryn;
import com.spire.presentation.packages.sprzra;

public class sprtkd
implements spryn {
    private sprff cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprnld cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        sprt arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            arg1 = ((spraed)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprnld) {
            this.cfr_renamed_3 = (sprnld)arg1;
            return;
        }
        if (arg1 instanceof sprnjd) {
            this.cfr_renamed_2 = ((sprnjd)arg1).cfr_renamed_1205();
            this.cfr_renamed_3 = (sprnld)((sprnjd)arg1).cfr_renamed_284();
            if (this.cfr_renamed_2.length != 8) {
                throw new IllegalArgumentException(sprmis.cfr_renamed_9("\u0015>|\u00063\u001c|\r-\u001d=\u0004|\u001c3Hd"));
            }
        }
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(spreyc.cfr_renamed_9("SlI#NfI#[lO#Jq\\sMjSd"));
        }
        int n2 = arg2 / 8;
        if (n2 * 8 != arg2) {
            throw new sprjkd(sprmis.cfr_renamed_9("+\u001a=\u0018|\f=\u001c=H1\u001d/\u001c|\n9H=H1\u001d0\u001c5\u00180\r|\u0007:HdH>\u0011(\r/"));
        }
        byte[] byArray = new byte[arg2 + this.cfr_renamed_2.length];
        byte[] byArray2 = new byte[8 + this.cfr_renamed_2.length];
        System.arraycopy(this.cfr_renamed_2, 0, byArray, 0, this.cfr_renamed_2.length);
        System.arraycopy(arg0, arg1, byArray, this.cfr_renamed_2.length, arg2);
        this.cfr_renamed_1.cfr_renamed_1217(true, this.cfr_renamed_3);
        int n3 = n = 0;
        while (n3 != 6) {
            int n4;
            int n5 = n4 = 1;
            while (n5 <= n2) {
                System.arraycopy(byArray, 0, byArray2, 0, this.cfr_renamed_2.length);
                System.arraycopy(byArray, 8 * n4, byArray2, this.cfr_renamed_2.length, 8);
                this.cfr_renamed_1.cfr_renamed_3064(byArray2, 0, byArray2, 0);
                int n6 = n2 * n + n4;
                int n7 = 1;
                int n8 = n6;
                while (n8 != 0) {
                    byte by = (byte)n6;
                    int n9 = this.cfr_renamed_2.length - n7;
                    byArray2[n9] = (byte)(byArray2[n9] ^ by);
                    ++n7;
                    n8 = n6 >>>= 8;
                }
                System.arraycopy(byArray2, 0, byArray, 0, 8);
                int n10 = 8 * n4;
                System.arraycopy(byArray2, 8, byArray, n10, 8);
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return byArray;
    }

    public sprtkd(sprff sprff2) {
        sprtkd sprtkd2 = this;
        byte[] byArray = new byte[8];
        byArray[0] = -90;
        byArray[1] = -90;
        byArray[2] = -90;
        byArray[3] = -90;
        byArray[4] = -90;
        byArray[5] = -90;
        byArray[6] = -90;
        byArray[7] = -90;
        sprtkd2.cfr_renamed_2 = byArray;
        sprtkd2.cfr_renamed_1 = sprff2;
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(spreyc.cfr_renamed_9("SlI#NfI#[lO#HmJq\\sMjSd"));
        }
        int n2 = arg2 / 8;
        if (n2 * 8 != arg2) {
            throw new sprpjd(sprmis.cfr_renamed_9(")\u0006+\u001a=\u0018|\f=\u001c=H1\u001d/\u001c|\n9H=H1\u001d0\u001c5\u00180\r|\u0007:HdH>\u0011(\r/"));
        }
        byte[] byArray = new byte[arg2 - this.cfr_renamed_2.length];
        byte[] byArray2 = new byte[this.cfr_renamed_2.length];
        byte[] byArray3 = new byte[8 + this.cfr_renamed_2.length];
        System.arraycopy(arg0, arg1, byArray2, 0, this.cfr_renamed_2.length);
        System.arraycopy(arg0, arg1 + this.cfr_renamed_2.length, byArray, 0, arg2 - this.cfr_renamed_2.length);
        this.cfr_renamed_1.cfr_renamed_1217(false, this.cfr_renamed_3);
        --n2;
        int n3 = n = 5;
        while (n3 >= 0) {
            int n4 = n2;
            while (n4 >= 1) {
                int n5;
                System.arraycopy(byArray2, 0, byArray3, 0, this.cfr_renamed_2.length);
                System.arraycopy(byArray, 8 * (n5 - 1), byArray3, this.cfr_renamed_2.length, 8);
                int n6 = n2 * n + n5;
                int n7 = 1;
                int n8 = n6;
                while (n8 != 0) {
                    byte by = (byte)n6;
                    int n9 = this.cfr_renamed_2.length - n7;
                    byArray3[n9] = (byte)(byArray3[n9] ^ by);
                    ++n7;
                    n8 = n6 >>>= 8;
                }
                this.cfr_renamed_1.cfr_renamed_3064(byArray3, 0, byArray3, 0);
                System.arraycopy(byArray3, 0, byArray2, 0, 8);
                System.arraycopy(byArray3, 8, byArray, 8 * --n5, 8);
                n4 = n5;
            }
            n3 = --n;
        }
        if (!sprzra.cfr_renamed_559(byArray2, this.cfr_renamed_2)) {
            throw new sprpjd(spreyc.cfr_renamed_9("`Uf^hNvP#[bToXg"));
        }
        return byArray;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_1.cfr_renamed_1315();
    }
}


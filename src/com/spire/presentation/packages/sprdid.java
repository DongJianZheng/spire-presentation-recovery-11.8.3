/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbfc;
import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtkd;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spryn;
import com.spire.presentation.packages.sprzra;

public class sprdid
implements spryn {
    private byte[] cfr_renamed_91;
    private sprnld cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprff cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3632(byte[] arg0) {
        int n = arg0.length;
        int n2 = (8 - n % 8) % 8;
        byte[] byArray = new byte[n + n2];
        System.arraycopy(arg0, 0, byArray, 0, n);
        if (n2 != 0) {
            System.arraycopy(new byte[n2], 0, byArray, n, n2);
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        sprt arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (sprt2 instanceof spraed) {
            arg1 = ((spraed)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprnld) {
            this.cfr_renamed_0 = (sprnld)arg1;
            return;
        }
        if (arg1 instanceof sprnjd) {
            this.cfr_renamed_1 = ((sprnjd)arg1).cfr_renamed_1205();
            this.cfr_renamed_0 = (sprnld)((sprnjd)arg1).cfr_renamed_284();
            if (this.cfr_renamed_1.length != 4) {
                throw new IllegalArgumentException(sprdfj.cfr_renamed_9("S\u0005:?\u007f=}'rst<ns\u007f\"o2vsn<:g"));
            }
        }
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        int n2;
        byte[] byArray;
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprbfc.cfr_renamed_9("s|i3nvi3{|o3h}ja|cmzst"));
        }
        int n3 = arg2 / 8;
        if (n3 * 8 != arg2) {
            throw new sprpjd(sprdfj.cfr_renamed_9("&t$h2js~2n2:>o nsx6:2:>o?n:j?\u007fsu5:k:1c'\u007f "));
        }
        if (n3 == 1) {
            throw new sprpjd(sprbfc.cfr_renamed_9("fsdorm3yrir=~h`i3\u007fv=ri3qv|`i3,%=qdgx`"));
        }
        byte[] byArray2 = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray2, 0, arg2);
        byte[] byArray3 = new byte[arg2];
        if (n3 == 2) {
            int n4;
            this.cfr_renamed_3.cfr_renamed_1217(0 != 0, this.cfr_renamed_0);
            int n5 = n4 = 0;
            while (n5 < byArray2.length) {
                int n6 = n4;
                this.cfr_renamed_3.cfr_renamed_3064(byArray2, n6, byArray3, n6);
                n5 = n4 += this.cfr_renamed_3.cfr_renamed_1195();
            }
            this.cfr_renamed_4 = new byte[8];
            System.arraycopy(byArray3, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            byArray = new byte[byArray3.length - this.cfr_renamed_4.length];
            System.arraycopy(byArray3, this.cfr_renamed_4.length, byArray, 0, byArray.length);
        } else {
            byArray3 = this.cfr_renamed_3633(arg0, arg1, arg2);
            byArray = byArray3;
        }
        byte[] byArray4 = new byte[4];
        byte[] byArray5 = new byte[4];
        System.arraycopy(this.cfr_renamed_4, 0, byArray4, 0, byArray4.length);
        System.arraycopy(this.cfr_renamed_4, byArray4.length, byArray5, 0, byArray5.length);
        int n7 = sprtsa.cfr_renamed_446(byArray5, 0);
        boolean bl = true;
        if (!sprzra.cfr_renamed_559(byArray4, this.cfr_renamed_1)) {
            bl = false;
        }
        if (n7 <= (n2 = (n = byArray.length) - 8)) {
            bl = false;
        }
        if (n7 > n) {
            bl = false;
        }
        int n8 = n - n7;
        byte[] byArray6 = new byte[n8];
        byte[] byArray7 = new byte[n8];
        System.arraycopy(byArray, byArray.length - n8, byArray7, 0, n8);
        if (!sprzra.cfr_renamed_559(byArray7, byArray6)) {
            bl = false;
        }
        byte[] byArray8 = new byte[n7];
        System.arraycopy(byArray, 0, byArray8, 0, byArray8.length);
        if (!bl) {
            throw new sprpjd(sprdfj.cfr_renamed_9("0r6y8i&ws|2s?\u007f7"));
        }
        return byArray8;
    }

    public sprdid(sprff sprff2) {
        sprdid sprdid2 = this;
        sprdid sprdid3 = this;
        sprdid sprdid4 = this;
        byte[] byArray = new byte[4];
        byArray[0] = -90;
        byArray[1] = 89;
        byArray[2] = 89;
        byArray[3] = -90;
        sprdid3.cfr_renamed_91 = byArray;
        sprdid3.cfr_renamed_1 = sprdid4.cfr_renamed_91;
        sprdid2.cfr_renamed_4 = null;
        sprdid2.cfr_renamed_3 = sprff2;
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprbfc.cfr_renamed_9("s|i3nvi3{|o3ja|cmzst"));
        }
        byte[] byArray = new byte[8];
        byte[] byArray2 = sprtsa.cfr_renamed_453(arg2);
        System.arraycopy(this.cfr_renamed_1, 0, byArray, 0, this.cfr_renamed_1.length);
        System.arraycopy(byArray2, 0, byArray, this.cfr_renamed_1.length, byArray2.length);
        byte[] byArray3 = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray3, 0, arg2);
        byte[] byArray4 = this.cfr_renamed_3632(byArray3);
        if (byArray4.length == 8) {
            int n;
            byte[] byArray5 = new byte[byArray4.length + byArray.length];
            System.arraycopy(byArray, 0, byArray5, 0, byArray.length);
            System.arraycopy(byArray4, 0, byArray5, byArray.length, byArray4.length);
            this.cfr_renamed_3.cfr_renamed_1217(true, this.cfr_renamed_0);
            int n2 = n = 0;
            while (n2 < byArray5.length) {
                this.cfr_renamed_3.cfr_renamed_3064(byArray5, n, byArray5, n);
                n2 = n += this.cfr_renamed_3.cfr_renamed_1195();
            }
            return byArray5;
        }
        sprtkd sprtkd2 = new sprtkd(this.cfr_renamed_3);
        sprnjd sprnjd2 = new sprnjd(this.cfr_renamed_0, byArray);
        sprtkd sprtkd3 = sprtkd2;
        sprtkd3.cfr_renamed_1217(true, sprnjd2);
        return sprtkd3.cfr_renamed_1575(byArray4, arg1, byArray4.length);
    }

    private /* synthetic */ byte[] cfr_renamed_3633(byte[] arg0, int arg1, int arg2) {
        int n;
        byte[] byArray = new byte[8];
        byte[] byArray2 = new byte[arg2 - byArray.length];
        byte[] byArray3 = new byte[byArray.length];
        byte[] byArray4 = new byte[8 + byArray.length];
        System.arraycopy(arg0, arg1, byArray3, 0, byArray.length);
        System.arraycopy(arg0, arg1 + byArray.length, byArray2, 0, arg2 - byArray.length);
        this.cfr_renamed_3.cfr_renamed_1217(false, this.cfr_renamed_0);
        int n2 = arg2 / 8;
        --n2;
        int n3 = n = 5;
        while (n3 >= 0) {
            int n4 = n2;
            while (n4 >= 1) {
                int n5;
                System.arraycopy(byArray3, 0, byArray4, 0, byArray.length);
                System.arraycopy(byArray2, 8 * (n5 - 1), byArray4, byArray.length, 8);
                int n6 = n2 * n + n5;
                int n7 = 1;
                int n8 = n6;
                while (n8 != 0) {
                    byte by = (byte)n6;
                    int n9 = byArray.length - n7;
                    byArray4[n9] = (byte)(byArray4[n9] ^ by);
                    ++n7;
                    n8 = n6 >>>= 8;
                }
                this.cfr_renamed_3.cfr_renamed_3064(byArray4, 0, byArray4, 0);
                System.arraycopy(byArray4, 0, byArray3, 0, 8);
                System.arraycopy(byArray4, 8, byArray2, 8 * --n5, 8);
                n4 = n5;
            }
            n3 = --n;
        }
        this.cfr_renamed_4 = byArray3;
        return byArray2;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_3.cfr_renamed_1315();
    }
}


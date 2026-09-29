/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfmd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxsb;

public class sprcuca
extends sprxsb {
    private sprlc cfr_renamed_4;

    @Override
    public sprt cfr_renamed_1518(int arg0, int arg1) {
        byte[] byArray = this.cfr_renamed_3504((arg0 /= 8) + (arg1 /= 8));
        return new sprnjd(new sprnld(byArray, 0, arg0), byArray, arg0, arg1);
    }

    private /* synthetic */ byte[] cfr_renamed_3504(int arg0) {
        sprcuca sprcuca2 = this;
        sprcuca sprcuca3 = sprcuca2;
        byte[] byArray = new byte[sprcuca2.cfr_renamed_4.cfr_renamed_1218()];
        byte[] byArray2 = new byte[arg0];
        int n = 0;
        while (true) {
            sprcuca3.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            sprcuca sprcuca4 = this;
            sprcuca4.cfr_renamed_4.cfr_renamed_1197(sprcuca4.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            int n2 = arg0 > byArray.length ? byArray.length : arg0;
            System.arraycopy(byArray, 0, byArray2, n, n2);
            n += n2;
            if ((arg0 -= n2) == 0) {
                return byArray2;
            }
            sprcuca sprcuca5 = this;
            sprcuca5.cfr_renamed_4.cfr_renamed_41();
            sprcuca5.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
            sprcuca3 = this;
        }
    }

    public sprcuca() {
        sprcuca sprcuca2 = this;
        sprcuca2.cfr_renamed_4 = new sprfmd();
    }

    @Override
    public sprt cfr_renamed_1523(int arg0) {
        return this.cfr_renamed_249(arg0);
    }

    @Override
    public sprt cfr_renamed_249(int arg0) {
        byte[] byArray = this.cfr_renamed_3504(arg0 /= 8);
        return new sprnld(byArray, 0, arg0);
    }

    public void cfr_renamed_1608(byte[] arg0, byte[] arg1) {
        super.cfr_renamed_1515(arg0, arg1, 1);
    }
}


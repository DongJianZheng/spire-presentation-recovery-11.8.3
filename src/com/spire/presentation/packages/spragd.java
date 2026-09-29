/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprend;
import com.spire.presentation.packages.sprgrc;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlql;
import com.spire.presentation.packages.sprrj;

public class spragd
implements sprko,
sprrj {
    private sprend cfr_renamed_1;
    public static final int cfr_renamed_2 = 512;
    public static final int cfr_renamed_3 = 256;
    public static final int cfr_renamed_4 = 1024;

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_1.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public void cfr_renamed_3465(sprgrc arg0) {
        this.cfr_renamed_1.cfr_renamed_3465(arg0);
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new spragd(this);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        return this.cfr_renamed_1.cfr_renamed_1219(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public spragd(int n, int n2) {
        void arg1;
        void arg0;
        spragd spragd2 = this;
        spragd spragd3 = this;
        spragd2.cfr_renamed_1 = new sprend((int)arg0, (int)arg1);
        spragd2.cfr_renamed_3465(null);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_1.cfr_renamed_1221(arg0);
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_1.cfr_renamed_1195();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        spragd spragd2 = (spragd)arg0;
        this.cfr_renamed_1.cfr_renamed_462(spragd2.cfr_renamed_1);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprlql.cfr_renamed_9("4v\u0002t\t0")).append(this.cfr_renamed_1.cfr_renamed_1195() * 8).append("-").append(this.cfr_renamed_1.cfr_renamed_3466() * 8).toString();
    }

    /*
     * WARNING - void declaration
     */
    public spragd(spragd spragd2) {
        void arg0;
        spragd spragd3 = this;
        spragd3.cfr_renamed_1 = new sprend(arg0.cfr_renamed_1);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_1.cfr_renamed_3466();
    }
}


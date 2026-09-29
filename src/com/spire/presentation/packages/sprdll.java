/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahk;
import com.spire.presentation.packages.sprbml;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sproci;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprybl;

public class sprdll
implements sprpl,
sprhx {
    public static final int cfr_renamed_0 = 512;
    private sprbml cfr_renamed_1;
    public static final int cfr_renamed_2 = 1024;
    private final spriil cfr_renamed_3;
    public static final int cfr_renamed_4 = 256;

    public sprdll(int arg0, int arg1) {
        this(arg0, arg1, spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_1.cfr_renamed_3466();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_1.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprdll(this);
    }

    public sprdll(sprdll sprdll2) {
        sprdll sprdll3 = sprdll2;
        sprdll sprdll4 = this;
        this.cfr_renamed_1 = new sprbml(sprdll2.cfr_renamed_1);
        this.cfr_renamed_3 = sprdll3.cfr_renamed_3;
        sprdll sprdll5 = this;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprdll5, sprdll3.cfr_renamed_1218() * 4, sprdll5.cfr_renamed_3));
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1.cfr_renamed_41();
    }

    public sprdll(int arg0, int arg1, spriil arg2) {
        sprdll sprdll2 = this;
        sprdll sprdll3 = this;
        sprdll3.cfr_renamed_1 = new sprbml(arg0, arg1);
        this.cfr_renamed_3 = arg2;
        sprdll2.cfr_renamed_10111(null);
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprdll2, this.cfr_renamed_1218() * 4, arg2));
    }

    public void cfr_renamed_10111(sprahk arg0) {
        this.cfr_renamed_1.cfr_renamed_10111(arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sproci.cfr_renamed_9("\\\tj\u000baO")).append(this.cfr_renamed_1.cfr_renamed_1195() * 8).append("-").append(this.cfr_renamed_1.cfr_renamed_3466() * 8).toString();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        return this.cfr_renamed_1.cfr_renamed_1219(arg0, arg1);
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
    public void cfr_renamed_5183(sprhx arg0) {
        sprdll sprdll2 = (sprdll)arg0;
        this.cfr_renamed_1.cfr_renamed_5183(sprdll2.cfr_renamed_1);
    }
}


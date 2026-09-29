/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprade;
import com.spire.presentation.packages.spraje;
import com.spire.presentation.packages.spraxa;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprfdb;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprtke;
import com.spire.presentation.packages.sprtzd;
import java.io.IOException;

public class sprrcb {
    private sprlre cfr_renamed_2;
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public sprrcb(spreud arg0) throws IOException {
        this(arg0.cfr_renamed_568());
    }

    public sprrcb(sprmke arg0, sproa arg1) {
        sprrcb sprrcb2 = this;
        this.cfr_renamed_2 = new sprlre();
        sprrcb2.cfr_renamed_4 = sprm.cfr_renamed_614;
        this.cfr_renamed_3 = new spraxa(arg0).cfr_renamed_1441(arg1).cfr_renamed_568();
    }

    public sprfdb cfr_renamed_1451() {
        sprrcb sprrcb2 = this;
        return new sprfdb(new spraje(sprrcb2.cfr_renamed_4, sprrcb2.cfr_renamed_3, new sprcwe(this.cfr_renamed_2)));
    }

    public sprrcb(sprcyd arg0) throws IOException {
        this(arg0.cfr_renamed_568());
    }

    public sprrcb(sproje arg0) throws IOException {
        sprrcb sprrcb2 = this;
        this.cfr_renamed_2 = new sprlre();
        sprrcb2.cfr_renamed_4 = sprm.cfr_renamed_1452;
        this.cfr_renamed_3 = new sprtke(sprm.cfr_renamed_1453, new sprlqe(arg0.cfr_renamed_91()));
    }

    public sprrcb(sprmke sprmke2) {
        sprrcb sprrcb2 = this;
        sprrcb sprrcb3 = this;
        sprrcb2.cfr_renamed_2 = new sprlre();
        sprrcb2.cfr_renamed_4 = sprm.cfr_renamed_1328;
        sprrcb2.cfr_renamed_3 = sprmke2;
    }

    public sprrcb(sprcge arg0) throws IOException {
        sprrcb sprrcb2 = this;
        this.cfr_renamed_2 = new sprlre();
        sprrcb2.cfr_renamed_4 = sprm.cfr_renamed_114;
        this.cfr_renamed_3 = new sprtke(sprm.cfr_renamed_1454, new sprlqe(arg0.cfr_renamed_91()));
    }

    public sprrcb cfr_renamed_1455(sprtzd arg0, spra arg1) {
        sprrcb sprrcb2 = this;
        sprrcb2.cfr_renamed_2.cfr_renamed_49(new sprade(arg0, new sprcwe(arg1)));
        return sprrcb2;
    }
}


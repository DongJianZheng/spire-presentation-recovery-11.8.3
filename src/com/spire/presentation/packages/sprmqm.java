/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmqm
extends sprqqe {
    private sprkgn cfr_renamed_3;
    private sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmqm(sprlem sprlem2, sprkgn sprkgn2) {
        void arg0;
        sprmqm sprmqm2 = this;
        sprmqm2.cfr_renamed_4 = arg0;
        sprmqm2.cfr_renamed_3 = sprkgn2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public spraen cfr_renamed_4650() {
        if (null == this.cfr_renamed_3 || this.cfr_renamed_3 instanceof spraen) {
            return (spraen)this.cfr_renamed_3;
        }
        return new spraen(this.cfr_renamed_3.cfr_renamed_314());
    }

    public sprkgn cfr_renamed_11226() {
        return this.cfr_renamed_3;
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmqm(sprszm sprszm2) {
        void arg0;
        sprco sprco2 = sprszm2.cfr_renamed_85(0);
        if (sprco2.cfr_renamed_119() instanceof sprkgn) {
            sprmqm sprmqm2 = this;
            sprmqm2.cfr_renamed_3 = sprkgn.cfr_renamed_23(sprco2);
            sprmqm2.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
    }

    /*
     * WARNING - void declaration
     */
    public sprmqm(sprlem sprlem2) {
        void arg0;
        sprmqm sprmqm2 = this;
        sprmqm2.cfr_renamed_4 = arg0;
        sprmqm2.cfr_renamed_3 = null;
    }

    public static sprmqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmqm) {
            return (sprmqm)arg0;
        }
        if (arg0 != null) {
            return new sprmqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprcnm
extends sprqqe {
    private sprhgm cfr_renamed_3;
    private final sprikm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcnm(sprikm sprikm2, sprmbm sprmbm2) {
        void arg0;
        sprcnm sprcnm2 = this;
        sprcnm2.cfr_renamed_4 = arg0;
        sprcnm2.cfr_renamed_3 = sprhgm.cfr_renamed_23(sprmbm2.cfr_renamed_119());
    }

    public static sprcnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcnm) {
            return (sprcnm)arg0;
        }
        if (arg0 != null) {
            return new sprcnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprcnm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sprikm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = sprhgm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprhgm cfr_renamed_4849() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprcnm(sprikm sprikm2, sprhgm sprhgm2) {
        void arg0;
        sprcnm sprcnm2 = this;
        sprcnm2.cfr_renamed_4 = arg0;
        sprcnm2.cfr_renamed_3 = sprhgm2;
    }

    public sprikm cfr_renamed_4391() {
        return this.cfr_renamed_4;
    }

    public sprcnm(sprikm sprikm2) {
        this.cfr_renamed_4 = sprikm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprcnm sprcnm2 = this;
        sprrvm2.cfr_renamed_5004(sprcnm2.cfr_renamed_4);
        if (sprcnm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }
}


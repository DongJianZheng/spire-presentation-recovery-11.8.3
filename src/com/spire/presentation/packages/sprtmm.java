/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryrm;
import java.util.Enumeration;

public class sprtmm
extends sprqqe
implements sprdl {
    private sprddm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_2429() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtmm(sprddm sprddm2, sprddm sprddm3) {
        void arg0;
        sprtmm sprtmm2 = this;
        sprtmm2.cfr_renamed_4 = arg0;
        sprtmm2.cfr_renamed_3 = sprddm3;
    }

    public static sprtmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtmm) {
            return (sprtmm)arg0;
        }
        if (arg0 != null) {
            return new sprtmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprtmm(sprszm sprszm2) {
        sprtmm sprtmm2;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        sprszm sprszm3 = sprszm.cfr_renamed_23(((sprco)enumeration.nextElement()).cfr_renamed_119());
        if (sprszm3.cfr_renamed_85(0).equals(cfr_renamed_3247)) {
            sprtmm2 = this;
            this.cfr_renamed_4 = new sprddm(cfr_renamed_3247, spryrm.cfr_renamed_23(sprszm3.cfr_renamed_85(1)));
        } else {
            sprtmm2 = this;
            this.cfr_renamed_4 = sprddm.cfr_renamed_23(sprszm3);
        }
        sprtmm2.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration.nextElement());
    }

    public sprddm cfr_renamed_7408() {
        return this.cfr_renamed_3;
    }
}


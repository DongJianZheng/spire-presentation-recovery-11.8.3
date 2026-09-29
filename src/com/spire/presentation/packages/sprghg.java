/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprghg
extends sprqqe {
    private final sprddm cfr_renamed_3;
    private final sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprghg(sprszm sprszm2) {
        void arg0;
        sprghg sprghg2 = this;
        sprghg2.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprghg2.cfr_renamed_3 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    public sprghg(sprddm sprddm2) {
        sprghg sprghg2 = this;
        this.cfr_renamed_4 = new sprktm(0L);
        this.cfr_renamed_3 = sprddm2;
    }

    public static final sprghg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprghg) {
            return (sprghg)arg0;
        }
        if (arg0 != null) {
            return new sprghg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_3234() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }
}


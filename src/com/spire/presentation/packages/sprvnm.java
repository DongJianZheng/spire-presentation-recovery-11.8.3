/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;

public class sprvnm
extends sprqqe {
    private final sprxpm cfr_renamed_2;
    private final sprxpm cfr_renamed_3;
    private final sprxpm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvnm(sprxpm sprxpm2, sprxpm sprxpm3, sprxpm sprxpm4) {
        void arg1;
        void arg0;
        sprvnm sprvnm2 = this;
        this.cfr_renamed_2 = arg0;
        sprvnm2.cfr_renamed_3 = arg1;
        sprvnm2.cfr_renamed_4 = sprxpm4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvnm(sprszm sprszm2) {
        void arg0;
        sprvnm sprvnm2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sprxpm.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprvnm2.cfr_renamed_3 = sprxpm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprvnm2.cfr_renamed_4 = sprxpm.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
    }

    public sprxpm cfr_renamed_4902() {
        return this.cfr_renamed_2;
    }

    public sprxpm cfr_renamed_4901() {
        return this.cfr_renamed_3;
    }

    public sprxpm cfr_renamed_4900() {
        return this.cfr_renamed_4;
    }

    public static sprvnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvnm) {
            return (sprvnm)arg0;
        }
        if (arg0 != null) {
            return new sprvnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprvnm sprvnm2 = this;
        sprrvm2.cfr_renamed_5004(sprvnm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprvnm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }
}


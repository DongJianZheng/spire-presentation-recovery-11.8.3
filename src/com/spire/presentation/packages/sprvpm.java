/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprvpm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public sprszm cfr_renamed_4685() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprvpm sprvpm2 = this;
        sprrvm2.cfr_renamed_5004(sprvpm2.cfr_renamed_3);
        if (sprvpm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public static sprvpm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprvpm) {
            return (sprvpm)arg0;
        }
        return new sprvpm(sprszm.cfr_renamed_23(arg0));
    }

    public sprlem cfr_renamed_4684() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvpm(sprlem sprlem2, sprszm sprszm2) {
        void arg0;
        sprvpm sprvpm2 = this;
        sprvpm2.cfr_renamed_3 = arg0;
        sprvpm2.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvpm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprlem)sprszm2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = (sprszm)arg0.cfr_renamed_85(1);
        }
    }

    public sprvpm(sprlem sprlem2) {
        this.cfr_renamed_3 = sprlem2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprhvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprbum
extends sprqqe {
    private final sprdvm cfr_renamed_3;
    private final sprhvm cfr_renamed_4;

    public static sprbum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbum) {
            return (sprbum)arg0;
        }
        if (arg0 != null) {
            return new sprbum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbum(sprszm sprszm2) {
        void arg0;
        sprbum sprbum2 = this;
        sprbum2.cfr_renamed_4 = sprhvm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprbum2.cfr_renamed_3 = sprdvm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprbum(sprhvm sprhvm2, sprdvm sprdvm2) {
        void arg0;
        sprbum sprbum2 = this;
        sprbum2.cfr_renamed_4 = arg0;
        sprbum2.cfr_renamed_3 = sprdvm2;
    }

    public sprhvm cfr_renamed_4409() {
        return this.cfr_renamed_4;
    }

    public sprdvm cfr_renamed_2573() {
        return this.cfr_renamed_3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprdmm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    public sprco cfr_renamed_4654() {
        return this.cfr_renamed_4;
    }

    public sprlem cfr_renamed_4653() {
        return new sprlem(this.cfr_renamed_3.cfr_renamed_19());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdmm(sprszm sprszm2) {
        void arg0;
        sprdmm sprdmm2 = this;
        sprdmm2.cfr_renamed_3 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprdmm2.cfr_renamed_4 = sprszm2.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdmm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprdmm sprdmm2 = this;
        sprdmm2.cfr_renamed_3 = arg0;
        sprdmm2.cfr_renamed_4 = sprco2;
    }

    public static sprdmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdmm) {
            return (sprdmm)arg0;
        }
        if (arg0 != null) {
            return new sprdmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


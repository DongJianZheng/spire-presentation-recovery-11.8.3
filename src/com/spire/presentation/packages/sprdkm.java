/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprdkm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprlem cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprdkm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprdkm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdkm(sprszm sprszm2) {
        void arg0;
        sprdkm sprdkm2 = this;
        sprdkm2.cfr_renamed_4 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprdkm2.cfr_renamed_3 = sprszm2.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdkm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprdkm sprdkm2 = this;
        sprdkm2.cfr_renamed_4 = arg0;
        sprdkm2.cfr_renamed_3 = sprco2;
    }

    public sprlem cfr_renamed_4114() {
        return this.cfr_renamed_4;
    }

    public static sprdkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdkm) {
            return (sprdkm)arg0;
        }
        if (arg0 != null) {
            return new sprdkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco cfr_renamed_3365() {
        return this.cfr_renamed_3;
    }
}


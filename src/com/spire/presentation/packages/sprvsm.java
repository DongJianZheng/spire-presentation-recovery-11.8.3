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

public class sprvsm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvsm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprvsm sprvsm2 = this;
        sprvsm2.cfr_renamed_3 = arg0;
        sprvsm2.cfr_renamed_4 = sprco2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public static sprvsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvsm) {
            return (sprvsm)arg0;
        }
        if (arg0 != null) {
            return new sprvsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco cfr_renamed_4835() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvsm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_4 = arg0.cfr_renamed_85(1);
    }

    public sprlem cfr_renamed_4834() {
        return this.cfr_renamed_3;
    }
}


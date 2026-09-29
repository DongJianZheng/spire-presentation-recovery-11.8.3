/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprwpm
extends sprqqe {
    private sprddm cfr_renamed_4;

    public static sprwpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwpm) {
            return (sprwpm)arg0;
        }
        if (arg0 != null) {
            return new sprwpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprwpm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(sprszm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprwpm(sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        sprwpm sprwpm2 = this;
        sprwpm2.cfr_renamed_4 = new sprddm((sprlem)arg0, (sprco)arg1);
    }

    public sprco cfr_renamed_284() {
        return this.cfr_renamed_4.cfr_renamed_284();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprlem cfr_renamed_593() {
        return this.cfr_renamed_4.cfr_renamed_593();
    }
}


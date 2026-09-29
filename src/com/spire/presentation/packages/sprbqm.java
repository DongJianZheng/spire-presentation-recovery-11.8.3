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

public class sprbqm
extends sprqqe {
    private sprddm cfr_renamed_4;

    public sprlem cfr_renamed_593() {
        return this.cfr_renamed_4.cfr_renamed_593();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sprbqm(sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        sprbqm sprbqm2 = this;
        sprbqm2.cfr_renamed_4 = new sprddm((sprlem)arg0, (sprco)arg1);
    }

    private /* synthetic */ sprbqm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(sprszm2);
    }

    public static sprbqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbqm) {
            return (sprbqm)arg0;
        }
        if (arg0 != null) {
            return new sprbqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbqm(sprlem sprlem2) {
        void arg0;
        sprbqm sprbqm2 = this;
        sprbqm2.cfr_renamed_4 = new sprddm((sprlem)arg0);
    }

    public sprco cfr_renamed_284() {
        return this.cfr_renamed_4.cfr_renamed_284();
    }
}


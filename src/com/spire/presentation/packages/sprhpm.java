/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprhpm
extends sprqqe {
    private sprlvm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public static sprhpm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhpm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhpm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprhpm sprhpm2 = this;
        sprhpm2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        sprhpm2.cfr_renamed_2 = sprlvm.cfr_renamed_23(arg0.cfr_renamed_85(2));
    }

    public sprlvm cfr_renamed_2589() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprhpm sprhpm2 = this;
        sprrvm2.cfr_renamed_5004(sprhpm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprhpm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprqcn(sprrvm2);
    }

    public static sprhpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhpm) {
            return (sprhpm)arg0;
        }
        if (arg0 != null) {
            return new sprhpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public sprddm cfr_renamed_4187() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprhpm(sprddm sprddm2, sprlvm sprlvm2) {
        void arg0;
        sprhpm sprhpm2 = this;
        sprhpm sprhpm3 = this;
        sprhpm3.cfr_renamed_3 = new sprktm(0L);
        sprhpm2.cfr_renamed_4 = arg0;
        sprhpm2.cfr_renamed_2 = sprlvm2;
    }
}


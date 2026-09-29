/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtnm;
import com.spire.presentation.packages.sprxgf;

public class sprlsm
extends sprqqe {
    private sproug cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprtnm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprlsm(sprtnm sprtnm2, sprddm sprddm2, sproug sproug2) {
        void arg2;
        void arg1;
        void arg0;
        sprlsm sprlsm2;
        if (sprtnm2.cfr_renamed_119() instanceof sprnvm) {
            sprlsm2 = this;
            this.cfr_renamed_2 = new sprktm(2L);
        } else {
            sprlsm2 = this;
            this.cfr_renamed_2 = new sprktm(0L);
        }
        sprlsm2.cfr_renamed_3 = arg0;
        sprlsm sprlsm3 = this;
        sprlsm3.cfr_renamed_4 = arg1;
        sprlsm3.cfr_renamed_1 = arg2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprlsm sprlsm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprlsm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprlsm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    public sproug cfr_renamed_4010() {
        return this.cfr_renamed_1;
    }

    public static sprlsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlsm) {
            return (sprlsm)arg0;
        }
        if (arg0 != null) {
            return new sprlsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_4000() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlsm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_2 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprlsm sprlsm2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = sprtnm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprlsm2.cfr_renamed_4 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprlsm2.cfr_renamed_1 = (sproug)arg0.cfr_renamed_85(3);
    }

    public sprtnm cfr_renamed_4020() {
        return this.cfr_renamed_3;
    }
}


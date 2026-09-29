/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprlqm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmzh
extends sprqqe {
    public sprddm cfr_renamed_2;
    public sprlqm cfr_renamed_3;
    public sprgbf cfr_renamed_4;

    public sprmzh() {
        sprmzh sprmzh2 = this;
        this.cfr_renamed_3 = null;
        sprmzh2.cfr_renamed_2 = null;
        sprmzh2.cfr_renamed_4 = null;
    }

    public sprlqm cfr_renamed_1486() {
        return this.cfr_renamed_3;
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmzh(sprlqm sprlqm2, sprddm sprddm2, sprgbf sprgbf2) {
        void arg1;
        void arg0;
        sprmzh sprmzh2 = this;
        sprmzh sprmzh3 = this;
        sprmzh sprmzh4 = this;
        sprmzh4.cfr_renamed_3 = null;
        sprmzh4.cfr_renamed_2 = null;
        sprmzh3.cfr_renamed_4 = null;
        sprmzh3.cfr_renamed_3 = arg0;
        sprmzh2.cfr_renamed_2 = arg1;
        sprmzh2.cfr_renamed_4 = sprgbf2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprmzh sprmzh2 = this;
        sprrvm2.cfr_renamed_5004(sprmzh2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprmzh2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmzh(sprszm sprszm2) {
        void arg0;
        sprmzh sprmzh2 = this;
        void v1 = arg0;
        sprmzh sprmzh3 = this;
        this.cfr_renamed_3 = null;
        sprmzh3.cfr_renamed_2 = null;
        sprmzh3.cfr_renamed_4 = null;
        this.cfr_renamed_3 = sprlqm.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprmzh2.cfr_renamed_2 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprmzh2.cfr_renamed_4 = (sprdye)sprszm2.cfr_renamed_85(2);
    }

    public static sprmzh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmzh) {
            return (sprmzh)arg0;
        }
        if (arg0 != null) {
            return new sprmzh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprcmm
extends sprqqe {
    private sprktm cfr_renamed_1;
    private sproug cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcmm(sprddm sprddm2, sprddm sprddm3, sproug sproug2) {
        void arg1;
        void arg0;
        sprcmm sprcmm2 = this;
        sprcmm sprcmm3 = this;
        this.cfr_renamed_1 = new sprktm(0L);
        this.cfr_renamed_4 = arg0;
        sprcmm2.cfr_renamed_3 = arg1;
        sprcmm2.cfr_renamed_2 = sproug2;
    }

    public static sprcmm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprcmm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprcmm sprcmm2 = this;
        sprrvm2.cfr_renamed_5004(sprcmm2.cfr_renamed_1);
        if (sprcmm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprcmm sprcmm3 = this;
        sprrvm3.cfr_renamed_5004(sprcmm3.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(sprcmm3.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_4000() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprcmm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_1 = (sprktm)sprszm2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_85(1) instanceof sprnvm) {
            this.cfr_renamed_4 = sprddm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), false);
            sprcmm sprcmm2 = this;
            sprcmm2.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(2));
            sprcmm2.cfr_renamed_2 = (sproug)arg0.cfr_renamed_85(3);
            return;
        }
        void v1 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
        this.cfr_renamed_2 = (sproug)v1.cfr_renamed_85(2);
    }

    public static sprcmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcmm) {
            return (sprcmm)arg0;
        }
        if (arg0 != null) {
            return new sprcmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public sprddm cfr_renamed_4007() {
        return this.cfr_renamed_4;
    }

    public sproug cfr_renamed_4010() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprcmm(sprddm sprddm2, sproug sproug2) {
        void arg0;
        sprcmm sprcmm2 = this;
        sprcmm sprcmm3 = this;
        sprcmm3.cfr_renamed_1 = new sprktm(0L);
        sprcmm2.cfr_renamed_3 = arg0;
        sprcmm2.cfr_renamed_2 = sproug2;
    }
}


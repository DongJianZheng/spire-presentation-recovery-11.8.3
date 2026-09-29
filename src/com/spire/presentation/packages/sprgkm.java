/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprgkm
extends sprqqe {
    private sproug cfr_renamed_1;
    private sprddm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprplm cfr_renamed_4;

    public static sprgkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgkm) {
            return (sprgkm)arg0;
        }
        if (arg0 != null) {
            return new sprgkm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprgkm sprgkm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprgkm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprgkm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    public sprplm cfr_renamed_4036() {
        return this.cfr_renamed_4;
    }

    public static sprgkm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprgkm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public sproug cfr_renamed_4010() {
        return this.cfr_renamed_1;
    }

    public sprddm cfr_renamed_4000() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgkm(sprplm sprplm2, sprddm sprddm2, sproug sproug2) {
        void arg1;
        void arg0;
        sprgkm sprgkm2 = this;
        sprgkm sprgkm3 = this;
        this.cfr_renamed_3 = new sprktm(4L);
        this.cfr_renamed_4 = arg0;
        sprgkm2.cfr_renamed_2 = arg1;
        sprgkm2.cfr_renamed_1 = sproug2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgkm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprktm)sprszm2.cfr_renamed_85(0);
        sprgkm sprgkm2 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = sprplm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprgkm2.cfr_renamed_2 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprgkm2.cfr_renamed_1 = (sproug)arg0.cfr_renamed_85(3);
    }
}


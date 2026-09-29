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
import com.spire.presentation.packages.sprxgf;

public class sprssm
extends sprqqe {
    public sprktm cfr_renamed_1;
    public sproug cfr_renamed_2;
    public sproug cfr_renamed_3;
    public sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprssm(sprszm sprszm2) {
        void arg0;
        sprssm sprssm2 = this;
        sprssm2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprssm2.cfr_renamed_2 = (sproug)sprszm2.cfr_renamed_85(1);
        this.cfr_renamed_3 = (sproug)arg0.cfr_renamed_85(2);
        this.cfr_renamed_1 = (sprktm)arg0.cfr_renamed_85(3);
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_1;
    }

    public static sprssm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprssm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprssm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprssm) {
            return (sprssm)arg0;
        }
        if (arg0 != null) {
            return new sprssm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprssm sprssm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprssm2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprssm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    public sproug cfr_renamed_4302() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprssm(sprddm sprddm2, sproug sproug2, sproug sproug3, sprktm sprktm2) {
        void arg2;
        void arg1;
        void arg0;
        sprssm sprssm2 = this;
        sprssm sprssm3 = this;
        sprssm3.cfr_renamed_4 = arg0;
        sprssm3.cfr_renamed_2 = arg1;
        sprssm2.cfr_renamed_3 = arg2;
        sprssm2.cfr_renamed_1 = sprktm2;
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_4;
    }

    public sproug cfr_renamed_4306() {
        return this.cfr_renamed_3;
    }
}


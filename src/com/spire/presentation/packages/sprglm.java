/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprglm
extends sprqqe {
    public sprddm cfr_renamed_2;
    public sprdye cfr_renamed_3;
    public sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprglm(sprddm sprddm2, sprdye sprdye2) {
        void arg0;
        sprglm sprglm2 = this;
        sprglm2.cfr_renamed_2 = arg0;
        sprglm2.cfr_renamed_3 = sprdye2;
    }

    public static sprglm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprglm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprglm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprglm) {
            return (sprglm)arg0;
        }
        if (arg0 != null) {
            return new sprglm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprszm cfr_renamed_626() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprglm(sprddm sprddm2, sprdye sprdye2, sprszm sprszm2) {
        void arg1;
        void arg0;
        sprglm sprglm2 = this;
        this.cfr_renamed_2 = arg0;
        sprglm2.cfr_renamed_3 = arg1;
        sprglm2.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprglm(sprszm sprszm2) {
        void arg0;
        sprglm sprglm2 = this;
        sprglm2.cfr_renamed_2 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprglm2.cfr_renamed_3 = (sprdye)sprszm2.cfr_renamed_85(1);
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sprszm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(2), true);
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprglm sprglm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprglm2.cfr_renamed_3);
        if (sprglm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_2;
    }

    public sprdye cfr_renamed_79() {
        return this.cfr_renamed_3;
    }
}


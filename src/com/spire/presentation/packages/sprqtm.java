/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlm;
import com.spire.presentation.packages.sprwy;
import com.spire.presentation.packages.sprxgf;

public class sprqtm
extends sprqqe {
    private sprgbf cfr_renamed_3;
    private sprddm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprgbf cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqtm(sprtlm sprtlm2, sprdye sprdye2) {
        this(new sprddm(sprwy.cfr_renamed_137, (sprco)arg0), (sprdye)arg1);
        void arg1;
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprqtm(sprddm sprddm2, sprdye sprdye2) {
        void arg0;
        sprqtm sprqtm2 = this;
        sprqtm2.cfr_renamed_4 = arg0;
        sprqtm2.cfr_renamed_3 = sprdye2;
    }

    public sprddm cfr_renamed_4333() {
        return this.cfr_renamed_4;
    }

    public static sprqtm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprqtm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqtm(sprszm sprszm2) {
        void arg0;
        sprqtm sprqtm2 = this;
        sprqtm2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprqtm2.cfr_renamed_3 = sprgbf.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    public static sprqtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqtm) {
            return (sprqtm)arg0;
        }
        if (arg0 != null) {
            return new sprqtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


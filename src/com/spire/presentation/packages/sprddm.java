/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprddm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprddm sprddm2 = this;
        sprrvm2.cfr_renamed_5004(sprddm2.cfr_renamed_3);
        if (sprddm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public static sprddm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprddm) {
            return (sprddm)arg0;
        }
        if (arg0 != null) {
            return new sprddm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm(sprlem sprlem2) {
        this.cfr_renamed_3 = sprlem2;
    }

    /*
     * WARNING - void declaration
     */
    public sprddm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprddm sprddm2 = this;
        sprddm2.cfr_renamed_3 = arg0;
        sprddm2.cfr_renamed_4 = sprco2;
    }

    public sprco cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public sprlem cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    public static sprddm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprddm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprddm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcno.cfr_renamed_9("|4ZuM0O [;]0\u001e&W/[o\u001e")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = arg0.cfr_renamed_85(1);
            return;
        }
        this.cfr_renamed_4 = null;
    }
}


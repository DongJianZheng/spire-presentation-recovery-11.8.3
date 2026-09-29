/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruoo;
import com.spire.presentation.packages.sprxgf;

public class sprgnm
extends sprqqe {
    private sproug cfr_renamed_3;
    private sprddm cfr_renamed_4;

    public static sprgnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgnm) {
            return (sprgnm)arg0;
        }
        if (arg0 != null) {
            return new sprgnm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproug cfr_renamed_4669() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgnm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruoo.cfr_renamed_9("DGb\u0006uCwScHeC&Uo\\c\u001c&")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sproug.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprgnm(sprddm sprddm2, sproug sproug2) {
        void arg0;
        sprgnm sprgnm2 = this;
        sprgnm2.cfr_renamed_4 = arg0;
        sprgnm2.cfr_renamed_3 = sproug2;
    }
}


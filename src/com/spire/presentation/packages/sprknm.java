/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprmqr;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprknm
extends sprqqe {
    private sprco cfr_renamed_3;
    private sprjhm cfr_renamed_4;

    public static sprknm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprknm) {
            return (sprknm)arg0;
        }
        if (arg0 != null) {
            return new sprknm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprknm(sprddm sprddm2, byte[] byArray, sprjhm sprjhm2) {
        void arg1;
        void arg0;
        sprknm sprknm2 = this;
        this.cfr_renamed_3 = new sprdim((sprddm)arg0, (byte[])arg1);
        this.cfr_renamed_4 = sprjhm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprknm(sprddm sprddm2, byte[] byArray) {
        void arg1;
        void arg0;
        sprknm sprknm2 = this;
        sprknm2.cfr_renamed_3 = new sprdim((sprddm)arg0, (byte[])arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprknm(sprszm sprszm2) {
        void v1;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmqr.cfr_renamed_9("}'[fL#N3Z(\\#\u001f5V<Z|\u001f")).append(arg0.cfr_renamed_84()).toString());
        }
        if (arg0.cfr_renamed_85(0).cfr_renamed_119() instanceof sproug) {
            void v0 = arg0;
            v1 = v0;
            this.cfr_renamed_3 = sproug.cfr_renamed_23(v0.cfr_renamed_85(0));
        } else {
            this.cfr_renamed_3 = sprdim.cfr_renamed_23(arg0.cfr_renamed_85(0));
            v1 = arg0;
        }
        if (v1.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprjhm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprddm cfr_renamed_4649() {
        if (this.cfr_renamed_3.cfr_renamed_119() instanceof sproug) {
            return new sprddm(sprgt.cfr_renamed_0);
        }
        return sprdim.cfr_renamed_23(this.cfr_renamed_3).cfr_renamed_1473();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprknm sprknm2 = this;
        sprrvm2.cfr_renamed_5004(sprknm2.cfr_renamed_3);
        if (sprknm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public byte[] cfr_renamed_629() {
        if (this.cfr_renamed_3.cfr_renamed_119() instanceof sproug) {
            return ((sproug)this.cfr_renamed_3.cfr_renamed_119()).cfr_renamed_186();
        }
        return sprdim.cfr_renamed_23(this.cfr_renamed_3).cfr_renamed_580();
    }

    public sprjhm cfr_renamed_630() {
        return this.cfr_renamed_4;
    }
}


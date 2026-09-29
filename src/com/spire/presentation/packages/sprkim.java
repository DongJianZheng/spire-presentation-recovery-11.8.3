/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhcea;
import com.spire.presentation.packages.sprmfm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkim
extends sprqqe {
    public sprmfm cfr_renamed_2;
    public sprgbf cfr_renamed_3;
    public sprddm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprkim sprkim2 = this;
        sprrvm2.cfr_renamed_5004(sprkim2.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprkim2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkim(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhcea.cfr_renamed_9("C<e}r8p(d3b8!.h'dg!")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_2 = sprmfm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_3 = sprgbf.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public sprmfm cfr_renamed_83() {
        return this.cfr_renamed_2;
    }

    public static sprkim cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkim) {
            return (sprkim)arg0;
        }
        if (arg0 != null) {
            return new sprkim(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgbf cfr_renamed_80() {
        return this.cfr_renamed_3;
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprkim(sprmfm sprmfm2, sprddm sprddm2, sprgbf sprgbf2) {
        void arg1;
        void arg0;
        sprkim sprkim2 = this;
        this.cfr_renamed_2 = arg0;
        sprkim2.cfr_renamed_4 = arg1;
        sprkim2.cfr_renamed_3 = sprgbf2;
    }
}


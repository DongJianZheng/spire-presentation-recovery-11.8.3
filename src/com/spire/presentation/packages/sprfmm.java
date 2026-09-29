/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprfmm
extends sprqqe {
    private sprlem cfr_renamed_3;
    private sprco cfr_renamed_4;

    public sprlem cfr_renamed_4683() {
        return this.cfr_renamed_3;
    }

    public sprfmm(sprlem arg0) {
        this(arg0, null);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprfmm sprfmm2 = this;
        sprrvm2.cfr_renamed_5004(sprfmm2.cfr_renamed_3);
        if (sprfmm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public static sprfmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfmm) {
            return (sprfmm)arg0;
        }
        if (arg0 != null) {
            return new sprfmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco cfr_renamed_4502() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfmm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprlem)sprszm2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = arg0.cfr_renamed_85(1);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprfmm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprfmm sprfmm2 = this;
        sprfmm2.cfr_renamed_3 = arg0;
        sprfmm2.cfr_renamed_4 = sprco2;
    }
}


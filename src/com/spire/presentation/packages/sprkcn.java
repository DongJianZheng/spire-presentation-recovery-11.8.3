/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkcn
extends sprqqe {
    private final sprddm cfr_renamed_3;
    private final sproug cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public static sprkcn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkcn) {
            return (sprkcn)arg0;
        }
        if (arg0 != null) {
            return new sprkcn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_9286() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
    }

    public sprddm cfr_renamed_4000() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkcn(sprszm sprszm2) {
        void arg0;
        sprkcn sprkcn2 = this;
        sprkcn2.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprkcn2.cfr_renamed_4 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
    }

    /*
     * WARNING - void declaration
     */
    public sprkcn(sprddm sprddm2, byte[] byArray) {
        void arg1;
        this.cfr_renamed_3 = sprddm2;
        sprkcn sprkcn2 = this;
        this.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg1));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprqmm
extends sprqqe {
    public sprktm cfr_renamed_3;
    public sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqmm(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = (sproug)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_3 = (sprktm)arg0.cfr_renamed_85(1);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqmm(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprqmm sprqmm2 = this;
        this.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
        sprqmm2.cfr_renamed_3 = new sprktm((long)arg1);
    }

    public byte[] cfr_renamed_1205() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
    }

    public int cfr_renamed_4600() {
        return this.cfr_renamed_3.cfr_renamed_5023();
    }

    public static sprqmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqmm) {
            return (sprqmm)arg0;
        }
        if (arg0 != null) {
            return new sprqmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


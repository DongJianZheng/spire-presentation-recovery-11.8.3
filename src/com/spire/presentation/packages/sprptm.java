/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmpm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprptm
extends sprqqe {
    private sprikm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprmpm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprptm(sprktm sprktm2, sprikm sprikm2, sprmpm sprmpm2) {
        void arg1;
        void arg0;
        sprptm sprptm2 = this;
        this.cfr_renamed_3 = arg0;
        sprptm2.cfr_renamed_2 = arg1;
        sprptm2.cfr_renamed_4 = sprmpm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprptm sprptm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprptm2.cfr_renamed_2);
        if (sprptm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprptm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        sprptm sprptm2 = this;
        sprptm2.cfr_renamed_3 = new sprktm(sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_97());
        this.cfr_renamed_2 = sprikm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        if (sprszm2.cfr_renamed_84() > 2) {
            this.cfr_renamed_4 = sprmpm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public sprmpm cfr_renamed_4378() {
        return this.cfr_renamed_4;
    }

    public sprikm cfr_renamed_4351() {
        return this.cfr_renamed_2;
    }

    public static sprptm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprptm) {
            return (sprptm)arg0;
        }
        if (arg0 != null) {
            return new sprptm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_4420() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprptm(int n, sprikm sprikm2, sprmpm sprmpm2) {
        this(new sprktm((long)arg0), (sprikm)arg1, (sprmpm)arg2);
        void arg2;
        void arg1;
        void arg0;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprikm;
import com.spire.presentation.packages.sprndo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtym;
import com.spire.presentation.packages.sprxgf;

public class sprwtm
extends sprqqe {
    private final sprsvm cfr_renamed_1;
    private final sprikm cfr_renamed_2;
    private final boolean cfr_renamed_3;
    private final sprtym cfr_renamed_4;

    public sprtym cfr_renamed_11390() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprwtm sprwtm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm2.cfr_renamed_5004(sprwtm2.cfr_renamed_4);
        if (!sprwtm2.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(sprbxm.cfr_renamed_655(this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprwtm(sprsvm sprsvm2, sprtym sprtym2, boolean bl, sprikm sprikm2) {
        void arg2;
        void arg1;
        void arg0;
        sprwtm sprwtm2 = this;
        sprwtm sprwtm3 = this;
        sprwtm3.cfr_renamed_1 = arg0;
        sprwtm3.cfr_renamed_4 = arg1;
        sprwtm2.cfr_renamed_3 = arg2;
        sprwtm2.cfr_renamed_2 = sprikm2;
    }

    public static sprwtm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwtm) {
            return (sprwtm)arg0;
        }
        if (arg0 != null) {
            return new sprwtm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public boolean cfr_renamed_11391() {
        return this.cfr_renamed_3;
    }

    public sprikm cfr_renamed_4351() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwtm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprndo.cfr_renamed_9("H\bB\tS\u0014D\u0005UFR\u0003P\u0013D\bB\u0003\u0001\u0015H\u001cD"));
        }
        void v0 = arg0;
        this.cfr_renamed_1 = sprsvm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprtym.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 4) {
            sprwtm sprwtm2 = this;
            sprwtm2.cfr_renamed_3 = sprbxm.cfr_renamed_23(arg0.cfr_renamed_85(2)).cfr_renamed_587();
            sprwtm2.cfr_renamed_2 = sprikm.cfr_renamed_23(arg0.cfr_renamed_85(3));
            return;
        }
        this.cfr_renamed_3 = true;
        this.cfr_renamed_2 = sprikm.cfr_renamed_23(arg0.cfr_renamed_85(2));
    }

    public sprsvm cfr_renamed_11392() {
        return this.cfr_renamed_1;
    }
}


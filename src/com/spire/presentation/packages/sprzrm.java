/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spream;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprzrm
extends sprqqe {
    private final sprnbm cfr_renamed_3;
    private final spream cfr_renamed_4;

    public static sprzrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzrm) {
            return (sprzrm)arg0;
        }
        if (arg0 != null) {
            return new sprzrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprzrm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprnbm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = spream.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public spream cfr_renamed_11202() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprzrm sprzrm2 = this;
        sprrvm2.cfr_renamed_5004(sprzrm2.cfr_renamed_3);
        if (sprzrm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_3;
    }
}


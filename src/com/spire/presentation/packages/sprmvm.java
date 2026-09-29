/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmvm
extends sprqqe {
    private sprffm cfr_renamed_3;
    private sprlvm cfr_renamed_4;

    public sprmvm(sprlvm sprlvm2) {
        this.cfr_renamed_4 = sprlvm2;
    }

    public sprffm cfr_renamed_2126() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprmvm sprmvm2 = this;
        sprrvm2.cfr_renamed_5004(sprmvm2.cfr_renamed_4);
        if (sprmvm2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sprmvm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sprlvm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_3 = sprffm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public static sprmvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmvm) {
            return (sprmvm)arg0;
        }
        if (arg0 != null) {
            return new sprmvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprffm cfr_renamed_3095() {
        return this.cfr_renamed_3;
    }

    public sprlvm cfr_renamed_652() {
        return this.cfr_renamed_4;
    }
}


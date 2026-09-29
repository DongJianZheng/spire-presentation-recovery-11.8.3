/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcap;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprgu;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprmyo
implements sprgu {
    private double cfr_renamed_4;

    public sprmyo(double d) {
        this.cfr_renamed_4 = d;
    }

    @Override
    public double cfr_renamed_16535(sprcap arg0) {
        return this.cfr_renamed_4;
    }

    @Override
    public double cfr_renamed_16531(sprcap arg0) {
        sprcap sprcap2 = arg0;
        String string = sprcap2.toString();
        double d = sprcap2.cfr_renamed_13257().cfr_renamed_16534(string);
        return d += this.cfr_renamed_4 * (double)sprcop.cfr_renamed_16374(string);
    }
}


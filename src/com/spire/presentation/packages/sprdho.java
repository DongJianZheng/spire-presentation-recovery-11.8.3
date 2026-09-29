/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcap;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprgu;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprdho
implements sprgu {
    private double cfr_renamed_4;

    @Override
    public double cfr_renamed_16531(sprcap arg0) {
        sprcap sprcap2 = arg0;
        String string = sprcap2.toString();
        double d = sprcap2.cfr_renamed_16532().cfr_renamed_16533().cfr_renamed_13257().cfr_renamed_16534(string);
        return d *= this.cfr_renamed_4;
    }

    public sprdho(double d) {
        this.cfr_renamed_4 = d;
    }

    @Override
    public double cfr_renamed_16535(sprcap arg0) {
        String string = arg0.toString();
        if (!sprznp.cfr_renamed_12328(string)) {
            return 0.0;
        }
        double d = arg0.cfr_renamed_16532().cfr_renamed_16533().cfr_renamed_13257().cfr_renamed_16534(string);
        int n = sprcop.cfr_renamed_16374(string);
        return d * (this.cfr_renamed_4 - 1.0) / (double)n;
    }
}


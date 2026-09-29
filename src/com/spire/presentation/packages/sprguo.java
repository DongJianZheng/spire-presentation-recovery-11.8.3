/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreu;
import com.spire.presentation.packages.sprgro;
import com.spire.presentation.packages.sprrv;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruq;

@sprtea
public class sprguo
implements spreu {
    private double cfr_renamed_4;

    public sprguo(double d) {
        this.cfr_renamed_4 = d;
    }

    @Override
    public double cfr_renamed_17073(spruq arg0) {
        return this.cfr_renamed_4;
    }

    @Override
    public sprrv cfr_renamed_17074(sprrv arg0) {
        sprgro sprgro2 = new sprgro();
        sprgro2.cfr_renamed_17058(this.cfr_renamed_4);
        double d = 0.0;
        if (arg0.cfr_renamed_16762() != 0.0) {
            d = sprgro2.cfr_renamed_16762() / arg0.cfr_renamed_16762();
        }
        sprgro sprgro3 = sprgro2;
        sprgro3.cfr_renamed_17055(arg0.cfr_renamed_13490() * d);
        sprgro3.cfr_renamed_17057(arg0.cfr_renamed_13491() * d);
        return sprgro2;
    }
}


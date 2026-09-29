/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbs;
import com.spire.presentation.packages.spreu;
import com.spire.presentation.packages.sprgro;
import com.spire.presentation.packages.sprrv;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruq;

@sprtea
public class sprgso
implements spreu {
    private double cfr_renamed_4;

    public sprgso(double d) {
        this.cfr_renamed_4 = d;
    }

    @Override
    public sprrv cfr_renamed_17074(sprrv arg0) {
        sprgro sprgro2;
        sprgro sprgro3 = sprgro2 = new sprgro();
        sprrv sprrv2 = arg0;
        sprgro2.cfr_renamed_17055(sprrv2.cfr_renamed_13490() * this.cfr_renamed_4);
        sprgro3.cfr_renamed_17057(sprrv2.cfr_renamed_13491() * this.cfr_renamed_4);
        sprgro3.cfr_renamed_17058(arg0.cfr_renamed_16762() * this.cfr_renamed_4);
        return sprgro3;
    }

    @Override
    public double cfr_renamed_17073(spruq arg0) {
        double d = 0.0;
        for (sprbs sprbs2 : arg0.cfr_renamed_12635()) {
            if (!(d < (double)sprbs2.cfr_renamed_16533().cfr_renamed_13257().cfr_renamed_13265())) continue;
            d = sprbs2.cfr_renamed_16533().cfr_renamed_13257().cfr_renamed_13265();
        }
        return d * this.cfr_renamed_4;
    }
}


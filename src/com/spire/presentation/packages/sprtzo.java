/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcap;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprmu;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprtzo
extends sprcap {
    private double cfr_renamed_3;
    private String cfr_renamed_4;

    public sprtzo(sprmu sprmu2, sprhhp sprhhp2, String string, int n) {
        super(sprmu2, sprhhp2, n);
        this.cfr_renamed_4 = string;
        this.cfr_renamed_3 = sprmu2.cfr_renamed_16533().cfr_renamed_16763().cfr_renamed_16531(this);
    }

    @Override
    public double cfr_renamed_1942() {
        return this.cfr_renamed_3;
    }

    @Override
    public String cfr_renamed_13030() {
        return this.cfr_renamed_4;
    }
}


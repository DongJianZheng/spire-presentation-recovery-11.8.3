/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprieo;
import com.spire.presentation.packages.sprioo;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprsgo
extends sprieo {
    private sprwbp cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsgo(int n, sprwbp sprwbp2) {
        void arg0;
        sprsgo sprsgo2 = this;
        sprsgo2.cfr_renamed_4 = arg0;
        sprsgo2.cfr_renamed_3 = sprwbp2;
    }

    @Override
    public sprpln cfr_renamed_16280(sprioo arg0) {
        sprwbp sprwbp2 = arg0.cfr_renamed_16287() == 2 ? arg0.cfr_renamed_12676() : sprwbp.cfr_renamed_1447;
        sprsgo sprsgo2 = this;
        return new sprhlp(sprsgo2.cfr_renamed_4, sprsgo2.cfr_renamed_3, sprwbp2);
    }
}


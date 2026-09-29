/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfw;
import com.spire.presentation.packages.sprrz;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spraap
implements sprrz {
    private double cfr_renamed_2;
    private double cfr_renamed_3;
    private boolean cfr_renamed_4;

    public double cfr_renamed_17075() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spraap(sprfw sprfw2, double d) {
        void arg0;
        void arg1;
        spraap spraap2 = this;
        spraap2.cfr_renamed_4 = true;
        spraap2.cfr_renamed_3 = arg1 - arg0.cfr_renamed_16754() - arg0.cfr_renamed_16765();
        if (sprfw2.cfr_renamed_16759() >= 0.0) {
            this.cfr_renamed_2 = this.cfr_renamed_3 - arg0.cfr_renamed_16759();
            return;
        }
        this.cfr_renamed_2 = this.cfr_renamed_3 + arg0.cfr_renamed_16754();
    }

    @Override
    public double cfr_renamed_17076() {
        if (this.cfr_renamed_4) {
            this.cfr_renamed_4 = false;
            return this.cfr_renamed_17077();
        }
        return this.cfr_renamed_17075();
    }

    public double cfr_renamed_17077() {
        return this.cfr_renamed_2;
    }
}


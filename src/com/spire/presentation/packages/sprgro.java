/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrv;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgro
implements sprrv {
    private double cfr_renamed_2;
    private double cfr_renamed_3;
    private double cfr_renamed_4;

    public void cfr_renamed_17054(sprrv arg0) {
        if (arg0 == null) {
            return;
        }
        sprgro sprgro2 = this;
        sprgro2.cfr_renamed_17055(sprrgga.cfr_renamed_17056(sprgro2.cfr_renamed_2, arg0.cfr_renamed_13490()));
        sprgro2.cfr_renamed_17057(sprrgga.cfr_renamed_17056(sprgro2.cfr_renamed_3, arg0.cfr_renamed_13491()));
        sprgro2.cfr_renamed_17058(sprrgga.cfr_renamed_17056(sprgro2.cfr_renamed_4, arg0.cfr_renamed_16762()));
    }

    @Override
    public double cfr_renamed_13490() {
        return this.cfr_renamed_2;
    }

    @Override
    public double cfr_renamed_1452() {
        return this.cfr_renamed_2 + this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgro(double d, double d2, double d3) {
        void arg1;
        void arg0;
        sprgro sprgro2 = this;
        sprgro sprgro3 = this;
        sprgro3.cfr_renamed_17055((double)arg0);
        sprgro2.cfr_renamed_17057((double)arg1);
        sprgro2.cfr_renamed_17058(d3);
    }

    public void cfr_renamed_17055(double arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprgro() {
    }

    public void cfr_renamed_17057(double arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public double cfr_renamed_16762() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_41() {
        sprgro sprgro2 = this;
        this.cfr_renamed_17055(0.0);
        sprgro2.cfr_renamed_17057(0.0);
        sprgro2.cfr_renamed_17058(0.0);
    }

    @Override
    public double cfr_renamed_13491() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_17058(double arg0) {
        this.cfr_renamed_4 = arg0;
    }
}


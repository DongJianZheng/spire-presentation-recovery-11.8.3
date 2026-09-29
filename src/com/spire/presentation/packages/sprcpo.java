/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprcpo {
    private int cfr_renamed_4;

    public boolean cfr_renamed_16584(int arg0) {
        return sproup.cfr_renamed_16714(this.cfr_renamed_4, 1 << 15 - arg0);
    }

    public sprcpo() {
    }

    public boolean cfr_renamed_12123() {
        return this.cfr_renamed_16584(1);
    }

    public int cfr_renamed_16591(int arg0, int arg1) {
        return ((this.cfr_renamed_4 & 0xFFFF) << arg0 & 0xFFFF) >> 15 - (arg1 - arg0);
    }

    public int cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_16641(sprhio arg0) {
        this.cfr_renamed_4 = arg0.cfr_renamed_13218();
    }

    @sprtea
    public sprcpo(int n) {
        this.cfr_renamed_4 = n;
    }

    public boolean cfr_renamed_16656() {
        return this.cfr_renamed_16584(3);
    }

    public boolean cfr_renamed_16582() {
        return this.cfr_renamed_16584(4);
    }

    public int cfr_renamed_90() {
        return this.cfr_renamed_16591(8, 15);
    }
}


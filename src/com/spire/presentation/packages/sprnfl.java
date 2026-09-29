/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdjk;
import com.spire.presentation.packages.sprjgk;
import com.spire.presentation.packages.sprov;

public class sprnfl
implements sprov {
    private sprdjk cfr_renamed_3;
    private final sprov cfr_renamed_4;

    @Override
    public void cfr_renamed_8006(sprbj arg0, byte[] arg1, int arg2) {
        sprjgk sprjgk2 = (sprjgk)arg0;
        sprnfl sprnfl2 = this;
        sprnfl sprnfl3 = this;
        sprnfl2.cfr_renamed_4.cfr_renamed_5692(sprnfl3.cfr_renamed_3.cfr_renamed_2094());
        sprnfl2.cfr_renamed_4.cfr_renamed_8006(sprjgk2.cfr_renamed_2096(), arg1, arg2);
        sprnfl3.cfr_renamed_4.cfr_renamed_5692(this.cfr_renamed_3.cfr_renamed_2095());
        sprnfl2.cfr_renamed_4.cfr_renamed_8006(sprjgk2.cfr_renamed_3351(), arg1, arg2 + this.cfr_renamed_4.cfr_renamed_8005());
    }

    @Override
    public int cfr_renamed_8005() {
        return this.cfr_renamed_4.cfr_renamed_8005() * 2;
    }

    public sprnfl(sprov sprov2) {
        this.cfr_renamed_4 = sprov2;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_3 = (sprdjk)arg0;
        sprnfl sprnfl2 = this;
        sprnfl2.cfr_renamed_4.cfr_renamed_5692(sprnfl2.cfr_renamed_3.cfr_renamed_2095());
    }
}


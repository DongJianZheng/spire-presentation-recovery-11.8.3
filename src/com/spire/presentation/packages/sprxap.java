/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbv;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprxap
implements sprbv {
    private String cfr_renamed_2;
    private sprsso cfr_renamed_3;
    private byte cfr_renamed_4 = 1;

    @sprtea
    public void cfr_renamed_17299(boolean arg0) {
        this.cfr_renamed_4 = (byte)(this.cfr_renamed_4 & 0xFF & 0xDF | (arg0 ? 1 : 0) << 5);
    }

    @sprtea
    public void cfr_renamed_17300(sprsso arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprxap() {
        sprxap sprxap2 = this;
        this.cfr_renamed_3 = new sprsso();
    }

    @sprtea
    public boolean cfr_renamed_17301() {
        return (this.cfr_renamed_4 & 0xFF & 0x20) >> 5 != 0;
    }

    @sprtea
    public sprsso cfr_renamed_17302() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public void cfr_renamed_15489(String arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public void cfr_renamed_2637() {
    }

    @sprtea
    public String cfr_renamed_13030() {
        return this.cfr_renamed_2;
    }
}


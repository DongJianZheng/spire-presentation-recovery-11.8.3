/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;

@sprtea
public abstract class sprijo {
    private sprvjn cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public abstract sprvjn cfr_renamed_16698();

    public sprvjn cfr_renamed_16708() {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_16698();
        }
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_4;
    }

    public sprijo(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }
}


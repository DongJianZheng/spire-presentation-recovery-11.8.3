/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spriep;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprhkp
extends spriep {
    private byte[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_18488() {
        return this.cfr_renamed_2609() != null;
    }

    @Override
    public int cfr_renamed_2773() {
        if (!this.cfr_renamed_18488()) {
            return 0;
        }
        return this.cfr_renamed_2609().length;
    }

    public sprhkp(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_2609() {
        return this.cfr_renamed_4;
    }

    @Override
    public spreen cfr_renamed_15071() {
        return new sprpdja(this.cfr_renamed_2609());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spriep;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzdja;

@sprtea
public class sprxgp
extends spriep {
    private String cfr_renamed_4;

    @Override
    public int cfr_renamed_2773() {
        if (!this.cfr_renamed_18488()) {
            return 0;
        }
        return (int)new sprzdja(this.cfr_renamed_678()).cfr_renamed_806();
    }

    @Override
    public spreen cfr_renamed_15071() {
        return sprbhja.cfr_renamed_11773(this.cfr_renamed_678());
    }

    public sprxgp(String string) {
        this.cfr_renamed_4 = string;
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_18488() {
        if (this.cfr_renamed_678() == null) {
            return false;
        }
        return sprbhja.cfr_renamed_11642(this.cfr_renamed_678());
    }
}


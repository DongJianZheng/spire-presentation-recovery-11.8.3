/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhkp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqep;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;

@sprtea
public class sprcbp
extends sprqep {
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcbp(byte[] byArray, int n) {
        super((int)arg1);
        void arg1;
        this.cfr_renamed_4 = byArray;
    }

    @Override
    @sprtea
    public sprwvn cfr_renamed_14371() {
        sprwvn sprwvn2;
        sprwvn sprwvn3 = sprwvn2 = new sprwvn(1);
        sprovja.cfr_renamed_11658(sprwvn3, new sprhkp(this.cfr_renamed_4));
        return sprwvn3;
    }

    public sprcbp(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_18949() {
        return this.cfr_renamed_4;
    }
}


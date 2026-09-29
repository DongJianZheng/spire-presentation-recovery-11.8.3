/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;

@sprtea
public abstract class sprenn
extends sprvjn {
    private int cfr_renamed_3;
    private sprgeja cfr_renamed_4 = sprgeja.cfr_renamed_4;

    public sprenn(sprgeja sprgeja2) {
        this.cfr_renamed_4 = sprgeja2;
    }

    public abstract int cfr_renamed_14049();

    public sprgeja cfr_renamed_13543() {
        return this.cfr_renamed_4;
    }

    public abstract sprenn cfr_renamed_12099();

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        throw new UnsupportedOperationException();
    }

    public void cfr_renamed_13585(sprgeja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public int cfr_renamed_14051() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_14050(int arg0) {
        this.cfr_renamed_3 = arg0;
    }
}


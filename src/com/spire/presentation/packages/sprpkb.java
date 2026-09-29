/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprltd;
import com.spire.presentation.packages.sprw;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprwpa;
import java.util.Collection;

public class sprpkb
extends sprwlb {
    private sprltd cfr_renamed_4;

    @Override
    public Collection cfr_renamed_150(sprb arg0) {
        return this.cfr_renamed_4.cfr_renamed_152(arg0);
    }

    @Override
    public void cfr_renamed_151(sprw arg0) {
        if (!(arg0 instanceof sprwpa)) {
            throw new IllegalArgumentException(arg0.toString());
        }
        this.cfr_renamed_4 = new sprltd(((sprwpa)arg0).cfr_renamed_172());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprwve;
import com.spire.presentation.packages.sprxi;
import java.util.Collection;

public class sprioh
extends sprsvh {
    private sprtul cfr_renamed_4;

    @Override
    public Collection cfr_renamed_5028(sprhd arg0) {
        return this.cfr_renamed_4.cfr_renamed_3216(arg0);
    }

    @Override
    public void cfr_renamed_5027(sprxi arg0) {
        if (!(arg0 instanceof sprwve)) {
            throw new IllegalArgumentException(arg0.toString());
        }
        this.cfr_renamed_4 = new sprtul(((sprwve)arg0).cfr_renamed_172());
    }
}


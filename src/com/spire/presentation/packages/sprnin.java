/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwp;
import com.spire.presentation.packages.sprxdn;

@sprtea
public class sprnin
implements sprwp {
    private sprqt cfr_renamed_4 = sprxdn.cfr_renamed_4;

    public void cfr_renamed_14196(sprqt arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprqt cfr_renamed_12479() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = sprxdn.cfr_renamed_4;
        }
        return this.cfr_renamed_4;
    }
}


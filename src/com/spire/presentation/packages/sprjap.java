/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjt;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;

@sprtea
public class sprjap
implements sprjt {
    private boolean cfr_renamed_3 = true;
    private sprvrx<String> cfr_renamed_4;

    @sprtea
    public boolean cfr_renamed_17350() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprvrx<String> cfr_renamed_17102() {
        if (this.cfr_renamed_4 == null) {
            sprjap sprjap2 = this;
            sprjap2.cfr_renamed_4 = new sprvrx();
        }
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_17370(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public void cfr_renamed_2637() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.clear();
            this.cfr_renamed_4 = null;
        }
    }

    @sprtea
    public void cfr_renamed_17371(sprvrx arg0) {
        this.cfr_renamed_4 = arg0;
    }
}


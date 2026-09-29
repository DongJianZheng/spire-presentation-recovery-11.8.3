/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajn;
import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprzon;

@sprtea
public class sprnln
extends sprzon {
    private spralq cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13098(sprxln sprxln2) {
        void arg0;
        sprnln sprnln2 = this;
        super.cfr_renamed_13098((sprxln)arg0);
        sprnln2.cfr_renamed_13537(sprxln2);
    }

    public sprnln() {
        sprnln sprnln2 = this;
        sprnln2.cfr_renamed_4 = new spralq();
    }

    private /* synthetic */ void cfr_renamed_13537(sprxln arg0) {
        if (arg0.cfr_renamed_12551() == null || arg0.cfr_renamed_12551().cfr_renamed_13338() != 2 || this.cfr_renamed_4.containsKey(arg0.cfr_renamed_12551())) {
            return;
        }
        ((sprajn)arg0.cfr_renamed_12551()).cfr_renamed_12672().cfr_renamed_13255(this.cfr_renamed_13538(), this.cfr_renamed_13538(), 1);
        this.cfr_renamed_4.cfr_renamed_12160(arg0.cfr_renamed_12551(), null);
    }
}


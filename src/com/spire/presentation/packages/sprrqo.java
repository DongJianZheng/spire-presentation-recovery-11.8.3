/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbv;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprrqo {
    private sprvrx cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17322(sprvrx arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprvrx cfr_renamed_13978() {
        if (this.cfr_renamed_4 == null) {
            sprrqo sprrqo2 = this;
            sprrqo2.cfr_renamed_4 = new sprvrx();
        }
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_2637() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_13978().iterator();
        while (iterator2.hasNext()) {
            ((sprbv)iterator.next()).cfr_renamed_2637();
            iterator2 = iterator;
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.clear();
            this.cfr_renamed_4 = null;
        }
    }
}


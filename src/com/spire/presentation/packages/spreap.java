/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrqo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class spreap {
    private sprvrx cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17319(sprvrx arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprrqo cfr_renamed_17320() {
        sprrqo sprrqo2;
        sprrqo sprrqo3 = sprrqo2 = new sprrqo();
        this.cfr_renamed_17321().add(sprrqo3);
        return sprrqo3;
    }

    @sprtea
    public void cfr_renamed_2637() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            ((sprrqo)iterator.next()).cfr_renamed_2637();
            iterator2 = iterator;
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.clear();
            this.cfr_renamed_4 = null;
        }
    }

    @sprtea
    public sprvrx cfr_renamed_17321() {
        if (this.cfr_renamed_4 == null) {
            spreap spreap2 = this;
            spreap2.cfr_renamed_4 = new sprvrx();
        }
        return this.cfr_renamed_4;
    }
}


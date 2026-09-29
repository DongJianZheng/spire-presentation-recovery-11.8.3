/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprftfa;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprpsn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;

@sprtea
public abstract class sprbln {
    private sprgdo cfr_renamed_3;
    private int cfr_renamed_4;

    public sprpsn cfr_renamed_14408() {
        if (this.cfr_renamed_3.cfr_renamed_13097().cfr_renamed_14509()) {
            return this.cfr_renamed_3.cfr_renamed_14572().cfr_renamed_14573(this.cfr_renamed_19(), 0);
        }
        return null;
    }

    @sprtea
    public int cfr_renamed_19() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprgdo cfr_renamed_2820() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14291(sprfy sprfy2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        sprbln sprbln2 = this;
        arg0.cfr_renamed_14556(this.cfr_renamed_14408());
        v1.cfr_renamed_14553(sprbln2);
        sprbln2.cfr_renamed_14285(v1.cfr_renamed_14552());
        v0.cfr_renamed_14550();
        v0.cfr_renamed_14556(null);
        this.cfr_renamed_14295((sprfy)v0);
    }

    public void cfr_renamed_14295(sprfy arg0) {
    }

    public String cfr_renamed_4570() {
        return new StringBuilder().insert(0, sprebp.cfr_renamed_14063(this.cfr_renamed_4)).append(sprftfa.cfr_renamed_9("(n(\f")).toString();
    }

    public abstract void cfr_renamed_14285(spryjn var1);

    /*
     * WARNING - void declaration
     */
    public sprbln(sprgdo sprgdo2) {
        void arg0;
        sprbln sprbln2 = this;
        sprbln2.cfr_renamed_3 = arg0;
        sprbln2.cfr_renamed_4 = sprgdo2.cfr_renamed_13310();
    }
}


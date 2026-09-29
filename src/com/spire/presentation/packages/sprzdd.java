/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprygd;

public class sprzdd
extends sprhgb {
    private sprygd cfr_renamed_4;

    public int hashCode() {
        int n;
        int n2 = n = this.cfr_renamed_1352() ? 0 : 1;
        if (this.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        return n;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzdd)) {
            return false;
        }
        sprzdd sprzdd2 = (sprzdd)arg0;
        if (this.cfr_renamed_4 == null) {
            return sprzdd2.cfr_renamed_284() == null;
        }
        return this.cfr_renamed_4.equals(sprzdd2.cfr_renamed_284());
    }

    /*
     * WARNING - void declaration
     */
    public sprzdd(boolean bl, sprygd sprygd2) {
        super((boolean)arg0);
        void arg0;
        this.cfr_renamed_4 = sprygd2;
    }

    public sprygd cfr_renamed_284() {
        return this.cfr_renamed_4;
    }
}


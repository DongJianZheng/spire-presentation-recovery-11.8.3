/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprzmd;

public class sprnid
extends sprhgb {
    private sprzmd cfr_renamed_4;

    public int hashCode() {
        int n;
        int n2 = n = this.cfr_renamed_1352() ? 0 : 1;
        if (this.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        return n;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprnid)) {
            return false;
        }
        sprnid sprnid2 = (sprnid)arg0;
        if (this.cfr_renamed_4 == null) {
            return sprnid2.cfr_renamed_284() == null;
        }
        return this.cfr_renamed_4.equals(sprnid2.cfr_renamed_284());
    }

    /*
     * WARNING - void declaration
     */
    public sprnid(boolean bl, sprzmd sprzmd2) {
        super((boolean)arg0);
        void arg0;
        this.cfr_renamed_4 = sprzmd2;
    }

    public sprzmd cfr_renamed_284() {
        return this.cfr_renamed_4;
    }
}


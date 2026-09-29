/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzyk;

public class sprprk
extends spryye {
    private sprzyk cfr_renamed_4;

    public int hashCode() {
        int n;
        int n2 = n = this.cfr_renamed_1352() ? 0 : 1;
        if (this.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        return n;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprprk)) {
            return false;
        }
        sprprk sprprk2 = (sprprk)arg0;
        if (this.cfr_renamed_4 == null) {
            return sprprk2.cfr_renamed_284() == null;
        }
        return this.cfr_renamed_4.equals(sprprk2.cfr_renamed_284());
    }

    public sprzyk cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprprk(boolean bl, sprzyk sprzyk2) {
        super((boolean)arg0);
        void arg0;
        this.cfr_renamed_4 = sprzyk2;
    }
}


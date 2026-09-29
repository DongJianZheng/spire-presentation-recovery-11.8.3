/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmija;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spriso
implements Comparable {
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @sprtea
    public int cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public int cfr_renamed_12561() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spriso(int n, int n2) {
        void arg0;
        spriso spriso2 = this;
        spriso2.cfr_renamed_3 = arg0;
        spriso2.cfr_renamed_4 = n2;
    }

    public int compareTo(Object arg0) {
        if (arg0 == null) {
            return 1;
        }
        spriso spriso2 = (spriso)arg0;
        return sprmija.cfr_renamed_18684(this.cfr_renamed_320(), spriso2.cfr_renamed_320());
    }
}


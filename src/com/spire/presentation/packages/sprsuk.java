/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;

public class sprsuk {
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public int cfr_renamed_3374() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprsuk)) {
            return false;
        }
        sprsuk sprsuk2 = (sprsuk)arg0;
        if (sprsuk2.cfr_renamed_3 != this.cfr_renamed_3) {
            return false;
        }
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprsuk2.cfr_renamed_4);
    }

    public int hashCode() {
        sprsuk sprsuk2 = this;
        return sprsuk2.cfr_renamed_3 ^ sproze.cfr_renamed_95(sprsuk2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprsuk(byte[] byArray, int n) {
        void arg0;
        sprsuk sprsuk2 = this;
        sprsuk2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        sprsuk2.cfr_renamed_3 = n;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzra;

public class sprqnd {
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public int hashCode() {
        sprqnd sprqnd2 = this;
        return sprqnd2.cfr_renamed_4 ^ sprzra.cfr_renamed_95(sprqnd2.cfr_renamed_3);
    }

    public int cfr_renamed_3374() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprqnd)) {
            return false;
        }
        sprqnd sprqnd2 = (sprqnd)arg0;
        if (sprqnd2.cfr_renamed_4 != this.cfr_renamed_4) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_3, sprqnd2.cfr_renamed_3);
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqnd(byte[] byArray, int n) {
        void arg0;
        sprqnd sprqnd2 = this;
        sprqnd2.cfr_renamed_3 = arg0;
        sprqnd2.cfr_renamed_4 = n;
    }
}


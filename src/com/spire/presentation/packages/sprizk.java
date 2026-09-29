/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;

public class sprizk {
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public int hashCode() {
        sprizk sprizk2 = this;
        return sprizk2.cfr_renamed_4 ^ sproze.cfr_renamed_95(sprizk2.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprizk(byte[] byArray, int n, int n2) {
        void arg1;
        void arg0;
        sprizk sprizk2 = this;
        this.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
        sprizk2.cfr_renamed_4 = arg1;
        sprizk2.cfr_renamed_2 = n2;
    }

    public sprizk(byte[] arg0, int arg1) {
        this(arg0, arg1, -1);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprizk)) {
            return false;
        }
        sprizk sprizk2 = (sprizk)arg0;
        if (sprizk2.cfr_renamed_4 != this.cfr_renamed_4) {
            return false;
        }
        return sproze.cfr_renamed_92(this.cfr_renamed_3, sprizk2.cfr_renamed_3);
    }

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public int cfr_renamed_3374() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_3375() {
        return this.cfr_renamed_2;
    }
}


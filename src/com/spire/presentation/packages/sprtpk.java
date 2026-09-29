/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sproze;

public class sprtpk
implements sprbj {
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtpk(byte[] byArray, int n, int n2) {
        this((int)arg2);
        void arg1;
        void arg2;
        System.arraycopy(byArray, (int)arg1, this.cfr_renamed_4, 0, (int)arg2);
    }

    private /* synthetic */ sprtpk(int n) {
        this.cfr_renamed_4 = new byte[n];
    }

    public int cfr_renamed_4600() {
        return this.cfr_renamed_4.length;
    }

    public sprtpk(byte[] arg0) {
        this(arg0, 0, arg0.length);
    }

    public sprtpk cfr_renamed_9979() {
        sprtpk sprtpk2;
        sprtpk sprtpk3 = sprtpk2 = new sprtpk(this.cfr_renamed_4.length);
        sproze.cfr_renamed_5261(this.cfr_renamed_4, sprtpk3.cfr_renamed_4);
        return sprtpk3;
    }

    public void cfr_renamed_9980(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4.length != arg2) {
            throw new IllegalArgumentException("len");
        }
        System.arraycopy(this.cfr_renamed_4, 0, arg0, arg1, arg2);
    }

    public byte[] cfr_renamed_1521() {
        return this.cfr_renamed_4;
    }
}


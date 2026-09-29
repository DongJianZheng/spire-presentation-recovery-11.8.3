/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;

public class sprjik
implements sprbj {
    private byte[] cfr_renamed_3;
    private sprbj cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjik(sprbj sprbj2, byte[] byArray, int n, int n2) {
        void arg2;
        void arg0;
        void arg3;
        sprjik sprjik2 = this;
        sprjik2.cfr_renamed_3 = new byte[arg3];
        sprjik2.cfr_renamed_4 = arg0;
        System.arraycopy(byArray, (int)arg2, this.cfr_renamed_3, 0, (int)arg3);
    }

    public sprbj cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public sprjik(sprbj arg0, byte[] arg1) {
        this(arg0, arg1, 0, arg1.length);
    }

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_3;
    }
}


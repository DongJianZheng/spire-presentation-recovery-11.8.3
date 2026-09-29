/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;

public class sprknk
implements sprbj {
    private sprbj cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_9207() {
        return this.cfr_renamed_4;
    }

    public sprknk(sprbj arg0, byte[] arg1) {
        this(arg0, arg1, 0, arg1.length);
    }

    public sprbj cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprknk(sprbj sprbj2, byte[] byArray, int n, int n2) {
        void arg2;
        void arg0;
        void arg3;
        sprknk sprknk2 = this;
        sprknk2.cfr_renamed_4 = new byte[arg3];
        sprknk2.cfr_renamed_3 = arg0;
        System.arraycopy(byArray, (int)arg2, this.cfr_renamed_4, 0, (int)arg3);
    }
}


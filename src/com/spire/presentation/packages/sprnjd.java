/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprt;

public class sprnjd
implements sprt {
    private sprt cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprt cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprnjd(sprt sprt2, byte[] byArray, int n, int n2) {
        void arg2;
        void arg0;
        void arg3;
        sprnjd sprnjd2 = this;
        sprnjd2.cfr_renamed_4 = new byte[arg3];
        sprnjd2.cfr_renamed_3 = arg0;
        System.arraycopy(byArray, (int)arg2, this.cfr_renamed_4, 0, (int)arg3);
    }

    public sprnjd(sprt arg0, byte[] arg1) {
        this(arg0, arg1, 0, arg1.length);
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_4;
    }
}


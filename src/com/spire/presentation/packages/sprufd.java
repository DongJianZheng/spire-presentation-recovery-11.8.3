/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprt;

public class sprufd
implements sprt {
    private byte[] cfr_renamed_3;
    private sprt cfr_renamed_4;

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_3;
    }

    public sprufd(sprt arg0, byte[] arg1) {
        this(arg0, arg1, 0, arg1.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprufd(sprt sprt2, byte[] byArray, int n, int n2) {
        void arg2;
        void arg0;
        void arg3;
        sprufd sprufd2 = this;
        sprufd2.cfr_renamed_3 = new byte[arg3];
        sprufd2.cfr_renamed_4 = arg0;
        System.arraycopy(byArray, (int)arg2, this.cfr_renamed_3, 0, (int)arg3);
    }

    public sprt cfr_renamed_284() {
        return this.cfr_renamed_4;
    }
}


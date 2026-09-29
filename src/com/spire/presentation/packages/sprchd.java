/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;

public class sprchd
implements sprel {
    public byte[] cfr_renamed_4;

    public sprchd(byte[] arg0) {
        this(arg0, 0, arg0.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprchd(byte[] byArray, int n, int n2) {
        void arg1;
        void arg2;
        this.cfr_renamed_4 = new byte[arg2];
        System.arraycopy(byArray, (int)arg1, this.cfr_renamed_4, 0, (int)arg2);
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_4;
    }
}


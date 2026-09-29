/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprt;

public class sprkkd
implements sprt {
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_3344() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprkkd(byte[] byArray, int n) {
        void arg0;
        void arg1;
        this.cfr_renamed_3 = new byte[byArray.length];
        this.cfr_renamed_4 = arg1;
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 0, ((void)arg0).length);
    }

    public byte[] cfr_renamed_1521() {
        return this.cfr_renamed_3;
    }

    public sprkkd(byte[] arg0) {
        this(arg0, arg0.length > 128 ? 1024 : arg0.length * 8);
    }
}


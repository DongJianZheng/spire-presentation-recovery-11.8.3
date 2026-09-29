/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import javax.crypto.spec.IvParameterSpec;

public class sprnji
extends IvParameterSpec {
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public int cfr_renamed_9214() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_9215() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprnji(byte[] arg0, int arg1) {
        this(arg0, arg1, null);
    }

    public byte[] cfr_renamed_596() {
        return this.getIV();
    }

    /*
     * WARNING - void declaration
     */
    public sprnji(byte[] byArray, int n, byte[] byArray2) {
        void arg1;
        void arg0;
        sprnji sprnji2 = this;
        super((byte[])arg0);
        sprnji2.cfr_renamed_3 = arg1;
        sprnji2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray2);
    }
}


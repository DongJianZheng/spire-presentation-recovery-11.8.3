/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.security.spec.AlgorithmParameterSpec;

public class sprzgi
implements AlgorithmParameterSpec {
    private final boolean cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public boolean cfr_renamed_9202() {
        return this.cfr_renamed_3;
    }

    public sprzgi(byte[] arg0) {
        this(arg0, false);
    }

    public byte[] cfr_renamed_8278() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprzgi(byte[] byArray, boolean bl) {
        void arg0;
        sprzgi sprzgi2 = this;
        sprzgi2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        sprzgi2.cfr_renamed_3 = bl;
    }
}


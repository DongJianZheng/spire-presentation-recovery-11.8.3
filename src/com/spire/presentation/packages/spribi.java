/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpek;
import java.security.spec.AlgorithmParameterSpec;

public class spribi
implements AlgorithmParameterSpec {
    private final byte[] cfr_renamed_2;
    private final boolean cfr_renamed_3;
    private final sprpek cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spribi(int n, byte[] byArray, boolean bl) {
        this(new sprpek((int)arg0), (byte[])arg1, (boolean)arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    public boolean cfr_renamed_9208() {
        return this.cfr_renamed_3;
    }

    public sprpek cfr_renamed_9209() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_3339() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public spribi(sprpek sprpek2, byte[] byArray, boolean bl) {
        void arg1;
        void arg0;
        spribi spribi2 = this;
        this.cfr_renamed_4 = arg0;
        spribi2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg1);
        spribi2.cfr_renamed_3 = bl;
    }

    public int cfr_renamed_9210() {
        return this.cfr_renamed_4.cfr_renamed_9210();
    }

    public spribi(int arg0, byte[] arg1) {
        this(arg0, arg1, false);
    }
}


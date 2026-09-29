/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.security.spec.KeySpec;

public class sprdei
implements KeySpec {
    private final String cfr_renamed_91;
    public static final String cfr_renamed_0 = "key expansion";
    private final int cfr_renamed_1;
    public static final String cfr_renamed_2 = "master secret";
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public String cfr_renamed_8132() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_3880() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprdei(byte[] byArray, String string, int n, byte[] ... byArray2) {
        void arg2;
        void arg1;
        void arg0;
        sprdei sprdei2 = this;
        sprdei sprdei3 = this;
        sprdei3.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        sprdei3.cfr_renamed_91 = arg1;
        sprdei2.cfr_renamed_1 = arg2;
        sprdei2.cfr_renamed_3 = sproze.cfr_renamed_1120(byArray2);
    }
}


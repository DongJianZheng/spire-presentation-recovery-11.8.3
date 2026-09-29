/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.spec.AlgorithmParameterSpec;

public class spreze
implements AlgorithmParameterSpec {
    public static final spreze cfr_renamed_96;
    public static final spreze cfr_renamed_105;
    private final String cfr_renamed_137;
    public static final String cfr_renamed_79 = "SHA512";
    public static final spreze cfr_renamed_107;
    public static final spreze cfr_renamed_132;
    public static final spreze cfr_renamed_102;
    public static final spreze cfr_renamed_93;
    public static final String cfr_renamed_86 = "SHAKE128";
    public static final spreze cfr_renamed_152;
    public static final spreze cfr_renamed_112;
    public static final spreze cfr_renamed_119;
    public static final String cfr_renamed_91 = "SHA256";
    public static final spreze cfr_renamed_0;
    private final int cfr_renamed_1;
    public static final spreze cfr_renamed_2;
    public static final String cfr_renamed_3 = "SHAKE256";
    public static final spreze cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spreze(int n, String string) {
        void arg0;
        spreze spreze2 = this;
        spreze2.cfr_renamed_1 = arg0;
        spreze2.cfr_renamed_137 = string;
    }

    public String cfr_renamed_3234() {
        return this.cfr_renamed_137;
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_1;
    }

    static {
        cfr_renamed_152 = new spreze(10, cfr_renamed_91);
        cfr_renamed_0 = new spreze(16, cfr_renamed_91);
        cfr_renamed_93 = new spreze(20, cfr_renamed_91);
        cfr_renamed_112 = new spreze(10, cfr_renamed_86);
        cfr_renamed_107 = new spreze(16, cfr_renamed_86);
        cfr_renamed_132 = new spreze(20, cfr_renamed_86);
        cfr_renamed_4 = new spreze(10, cfr_renamed_79);
        cfr_renamed_96 = new spreze(16, cfr_renamed_79);
        cfr_renamed_2 = new spreze(20, cfr_renamed_79);
        cfr_renamed_105 = new spreze(10, cfr_renamed_3);
        cfr_renamed_102 = new spreze(16, cfr_renamed_3);
        cfr_renamed_119 = new spreze(20, cfr_renamed_3);
    }
}


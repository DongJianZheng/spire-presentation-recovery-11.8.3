/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.spec.AlgorithmParameterSpec;

public class sprcgf
implements AlgorithmParameterSpec {
    public static final sprcgf cfr_renamed_728;
    public static final sprcgf cfr_renamed_128;
    public static final sprcgf cfr_renamed_957;
    public static final sprcgf cfr_renamed_314;
    public static final sprcgf cfr_renamed_951;
    private final String cfr_renamed_84;
    public static final sprcgf cfr_renamed_723;
    public static final sprcgf cfr_renamed_1226;
    private final int cfr_renamed_287;
    public static final sprcgf cfr_renamed_724;
    public static final sprcgf cfr_renamed_953;
    public static final sprcgf cfr_renamed_133;
    public static final sprcgf cfr_renamed_185;
    public static final String spr\ufe34 = "SHA256";
    public static final sprcgf cfr_renamed_82;
    public static final sprcgf cfr_renamed_126;
    public static final sprcgf cfr_renamed_88;
    public static final sprcgf cfr_renamed_31;
    public static final sprcgf cfr_renamed_272;
    public static final sprcgf cfr_renamed_145;
    public static final sprcgf cfr_renamed_114;
    private final int cfr_renamed_96;
    public static final sprcgf cfr_renamed_105;
    public static final sprcgf cfr_renamed_137;
    public static final String cfr_renamed_79 = "SHA512";
    public static final sprcgf cfr_renamed_107;
    public static final sprcgf cfr_renamed_132;
    public static final sprcgf cfr_renamed_102;
    public static final String cfr_renamed_93 = "SHAKE128";
    public static final sprcgf cfr_renamed_86;
    public static final String cfr_renamed_152 = "SHAKE256";
    public static final sprcgf cfr_renamed_112;
    public static final sprcgf cfr_renamed_119;
    public static final sprcgf cfr_renamed_91;
    public static final sprcgf cfr_renamed_0;
    public static final sprcgf cfr_renamed_1;
    public static final sprcgf cfr_renamed_2;
    public static final sprcgf cfr_renamed_3;
    public static final sprcgf cfr_renamed_4;

    public int cfr_renamed_1452() {
        return this.cfr_renamed_287;
    }

    public String cfr_renamed_3234() {
        return this.cfr_renamed_84;
    }

    /*
     * WARNING - void declaration
     */
    public sprcgf(int n, int n2, String string) {
        void arg1;
        void arg0;
        sprcgf sprcgf2 = this;
        this.cfr_renamed_287 = arg0;
        sprcgf2.cfr_renamed_96 = arg1;
        sprcgf2.cfr_renamed_84 = string;
    }

    public int cfr_renamed_1134() {
        return this.cfr_renamed_96;
    }

    static {
        cfr_renamed_953 = new sprcgf(20, 2, spr\ufe34);
        cfr_renamed_272 = new sprcgf(20, 4, spr\ufe34);
        cfr_renamed_128 = new sprcgf(40, 2, spr\ufe34);
        cfr_renamed_1 = new sprcgf(40, 4, spr\ufe34);
        cfr_renamed_105 = new sprcgf(40, 8, spr\ufe34);
        cfr_renamed_314 = new sprcgf(60, 3, spr\ufe34);
        cfr_renamed_112 = new sprcgf(60, 6, spr\ufe34);
        cfr_renamed_137 = new sprcgf(60, 12, spr\ufe34);
        cfr_renamed_4 = new sprcgf(20, 2, cfr_renamed_79);
        cfr_renamed_724 = new sprcgf(20, 4, cfr_renamed_79);
        cfr_renamed_728 = new sprcgf(40, 2, cfr_renamed_79);
        cfr_renamed_114 = new sprcgf(40, 4, cfr_renamed_79);
        cfr_renamed_107 = new sprcgf(40, 8, cfr_renamed_79);
        cfr_renamed_133 = new sprcgf(60, 3, cfr_renamed_79);
        cfr_renamed_86 = new sprcgf(60, 6, cfr_renamed_79);
        cfr_renamed_82 = new sprcgf(60, 12, cfr_renamed_79);
        cfr_renamed_2 = new sprcgf(20, 2, cfr_renamed_93);
        cfr_renamed_145 = new sprcgf(20, 4, cfr_renamed_93);
        cfr_renamed_119 = new sprcgf(40, 2, cfr_renamed_93);
        cfr_renamed_3 = new sprcgf(40, 4, cfr_renamed_93);
        cfr_renamed_31 = new sprcgf(40, 8, cfr_renamed_93);
        cfr_renamed_957 = new sprcgf(60, 3, cfr_renamed_93);
        cfr_renamed_91 = new sprcgf(60, 6, cfr_renamed_93);
        cfr_renamed_88 = new sprcgf(60, 12, cfr_renamed_93);
        cfr_renamed_1226 = new sprcgf(20, 2, cfr_renamed_152);
        cfr_renamed_723 = new sprcgf(20, 4, cfr_renamed_152);
        cfr_renamed_951 = new sprcgf(40, 2, cfr_renamed_152);
        cfr_renamed_126 = new sprcgf(40, 4, cfr_renamed_152);
        cfr_renamed_0 = new sprcgf(40, 8, cfr_renamed_152);
        cfr_renamed_132 = new sprcgf(60, 3, cfr_renamed_152);
        cfr_renamed_185 = new sprcgf(60, 6, cfr_renamed_152);
        cfr_renamed_102 = new sprcgf(60, 12, cfr_renamed_152);
    }
}


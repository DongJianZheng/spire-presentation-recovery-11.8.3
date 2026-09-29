/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprxuf;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprvdf
implements AlgorithmParameterSpec {
    public static final sprvdf cfr_renamed_93;
    public static final sprvdf cfr_renamed_86;
    public static final sprvdf cfr_renamed_152;
    public static final sprvdf cfr_renamed_112;
    private static Map cfr_renamed_119;
    public static final sprvdf cfr_renamed_91;
    public static final sprvdf cfr_renamed_0;
    private final String cfr_renamed_1;
    public static final sprvdf cfr_renamed_2;
    public static final sprvdf cfr_renamed_3;
    public static final sprvdf cfr_renamed_4;

    private /* synthetic */ sprvdf(sprxuf sprxuf2) {
        this.cfr_renamed_1 = sprxuf2.cfr_renamed_313();
    }

    public static sprvdf cfr_renamed_5644(String arg0) {
        return (sprvdf)cfr_renamed_119.get(sprkoe.cfr_renamed_425(arg0));
    }

    static {
        cfr_renamed_91 = new sprvdf(sprxuf.cfr_renamed_137);
        cfr_renamed_3 = new sprvdf(sprxuf.cfr_renamed_1);
        cfr_renamed_4 = new sprvdf(sprxuf.cfr_renamed_105);
        cfr_renamed_93 = new sprvdf(sprxuf.cfr_renamed_2);
        cfr_renamed_86 = new sprvdf(sprxuf.cfr_renamed_112);
        cfr_renamed_112 = new sprvdf(sprxuf.cfr_renamed_79);
        cfr_renamed_0 = new sprvdf(sprxuf.cfr_renamed_102);
        cfr_renamed_152 = new sprvdf(sprxuf.cfr_renamed_0);
        cfr_renamed_2 = new sprvdf(sprxuf.cfr_renamed_145);
        cfr_renamed_119 = new HashMap();
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }
}


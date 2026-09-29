/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprogf;
import com.spire.presentation.packages.sprwwn;
import com.spire.presentation.packages.spryyf;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprjaf
implements AlgorithmParameterSpec {
    public static final sprjaf cfr_renamed_0 = new sprjaf(spryyf.cfr_renamed_152);
    private final String cfr_renamed_1;
    public static final sprjaf cfr_renamed_2 = new sprjaf(spryyf.cfr_renamed_1);
    public static final sprjaf cfr_renamed_3 = new sprjaf(spryyf.cfr_renamed_107);
    private static Map cfr_renamed_4 = new HashMap();

    public static sprjaf cfr_renamed_5644(String arg0) {
        return (sprjaf)cfr_renamed_4.get(sprkoe.cfr_renamed_425(arg0));
    }

    static {
        cfr_renamed_4.put(sprogf.cfr_renamed_9("v2}r,{"), cfr_renamed_0);
        cfr_renamed_4.put(sprwwn.cfr_renamed_9("=|6<l?"), cfr_renamed_2);
        cfr_renamed_4.put(sprogf.cfr_renamed_9("v2}q+u"), cfr_renamed_3);
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ sprjaf(spryyf spryyf2) {
        this.cfr_renamed_1 = spryyf2.cfr_renamed_313();
    }
}


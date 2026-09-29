/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprjgg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprwlp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprwwe
implements AlgorithmParameterSpec {
    public static final sprwwe cfr_renamed_0;
    private final String cfr_renamed_1;
    public static final sprwwe cfr_renamed_2;
    public static final sprwwe cfr_renamed_3;
    private static Map cfr_renamed_4;

    public String cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    public static sprwwe cfr_renamed_5644(String arg0) {
        return (sprwwe)cfr_renamed_4.get(sprkoe.cfr_renamed_425(arg0));
    }

    private /* synthetic */ sprwwe(sprjgg sprjgg2) {
        this.cfr_renamed_1 = sprjgg2.cfr_renamed_313();
    }

    static {
        cfr_renamed_3 = new sprwwe(sprjgg.cfr_renamed_4);
        cfr_renamed_2 = new sprwwe(sprjgg.cfr_renamed_1);
        cfr_renamed_0 = new sprwwe(sprjgg.cfr_renamed_112);
        cfr_renamed_4 = new HashMap();
        cfr_renamed_4.put(sprwlp.cfr_renamed_9("m\u001dd\u0011>F7"), cfr_renamed_3);
        cfr_renamed_4.put(sprhfd.cfr_renamed_9("\nE\u0003IY\u0015Z"), cfr_renamed_2);
        cfr_renamed_4.put(sprwlp.cfr_renamed_9("m\u001dd\u0011=A9"), cfr_renamed_0);
    }
}


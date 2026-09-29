/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprsxy;
import com.spire.presentation.packages.sprtyba;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class spruxe
implements AlgorithmParameterSpec {
    public static final spruxe cfr_renamed_1 = new spruxe(sprbbg.cfr_renamed_0);
    public static final spruxe cfr_renamed_2 = new spruxe(sprbbg.cfr_renamed_2);
    private static Map cfr_renamed_3 = new HashMap();
    private final String cfr_renamed_4;

    private /* synthetic */ spruxe(sprbbg sprbbg2) {
        this.cfr_renamed_4 = sprkoe.cfr_renamed_116(sprbbg2.cfr_renamed_313());
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    static {
        cfr_renamed_3.put(sprtyba.cfr_renamed_9("\u000f$\u0005&\u0006+DpXw"), cfr_renamed_1);
        cfr_renamed_3.put(sprsxy.cfr_renamed_9("YKSIPD\u0012\u001b\u000f\u0018\u000b"), cfr_renamed_2);
    }

    public static spruxe cfr_renamed_5644(String arg0) {
        return (spruxe)cfr_renamed_3.get(sprkoe.cfr_renamed_425(arg0));
    }
}


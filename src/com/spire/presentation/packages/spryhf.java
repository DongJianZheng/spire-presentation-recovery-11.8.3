/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.spec.AlgorithmParameterSpec;

public class spryhf
implements AlgorithmParameterSpec {
    public static final String cfr_renamed_2 = "SHA3-256";
    private final String cfr_renamed_3;
    public static final String cfr_renamed_4 = "SHA512-256";

    public spryhf() {
        this(cfr_renamed_4);
    }

    public spryhf(String string) {
        this.cfr_renamed_3 = string;
    }

    public String cfr_renamed_3234() {
        return this.cfr_renamed_3;
    }
}


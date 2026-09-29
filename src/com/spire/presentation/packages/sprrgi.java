/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfmr;
import com.spire.presentation.packages.sprtu;
import java.security.spec.AlgorithmParameterSpec;

public class sprrgi
implements AlgorithmParameterSpec {
    public static final String cfr_renamed_2 = "X448";
    private final String cfr_renamed_3;
    public static final String cfr_renamed_4 = "X25519";

    public String cfr_renamed_9198() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprrgi(String string) {
        void arg0;
        if (string.equalsIgnoreCase(cfr_renamed_4)) {
            this.cfr_renamed_3 = cfr_renamed_4;
            return;
        }
        if (arg0.equalsIgnoreCase(cfr_renamed_2)) {
            this.cfr_renamed_3 = cfr_renamed_2;
            return;
        }
        if (arg0.equals(sprtu.cfr_renamed_3.cfr_renamed_19())) {
            this.cfr_renamed_3 = cfr_renamed_4;
            return;
        }
        if (arg0.equals(sprtu.cfr_renamed_4.cfr_renamed_19())) {
            this.cfr_renamed_3 = cfr_renamed_2;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfmr.cfr_renamed_9("ZW]\\LVHWFCJ]\u000fZZKY\\\u000fWNTJ\u0003\u000f")).append((String)arg0).toString());
    }
}


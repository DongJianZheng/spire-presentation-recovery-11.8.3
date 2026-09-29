/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkci;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprpzh
implements AlgorithmParameterSpec {
    private final List<String> cfr_renamed_3;
    private final List<AlgorithmParameterSpec> cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpzh(sprkci sprkci2) {
        void arg0;
        sprpzh sprpzh2 = this;
        this.cfr_renamed_3 = Collections.unmodifiableList(new ArrayList(sprkci.cfr_renamed_9212((sprkci)arg0)));
        sprpzh2.cfr_renamed_4 = Collections.unmodifiableList(new ArrayList(sprkci.cfr_renamed_9213((sprkci)arg0)));
    }

    public List<AlgorithmParameterSpec> cfr_renamed_7470() {
        return this.cfr_renamed_4;
    }

    public List<String> cfr_renamed_7469() {
        return this.cfr_renamed_3;
    }
}


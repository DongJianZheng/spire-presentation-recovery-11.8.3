/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprbgk
implements sprbj {
    private sprbj cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprbgk(sprbj arg0) {
        this(arg0, null);
    }

    public sprbj cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbgk(sprbj sprbj2, SecureRandom secureRandom) {
        void arg1;
        sprbgk sprbgk2 = this;
        sprbgk2.cfr_renamed_4 = sprybl.cfr_renamed_5688((SecureRandom)arg1);
        sprbgk2.cfr_renamed_3 = sprbj2;
    }

    public SecureRandom cfr_renamed_1295() {
        return this.cfr_renamed_4;
    }
}


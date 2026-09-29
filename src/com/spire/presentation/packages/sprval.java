/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprgye;
import java.security.SecureRandom;

public class sprval
extends sprgye {
    private sprcuk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprval(SecureRandom secureRandom, sprcuk sprcuk2) {
        super((SecureRandom)arg0, sprval.cfr_renamed_9981((sprcuk)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprcuk2;
    }

    public static int cfr_renamed_9981(sprcuk arg0) {
        if (arg0.cfr_renamed_2331() != 0) {
            return arg0.cfr_renamed_2331();
        }
        return arg0.cfr_renamed_1155().bitLength();
    }

    public sprcuk cfr_renamed_284() {
        return this.cfr_renamed_4;
    }
}


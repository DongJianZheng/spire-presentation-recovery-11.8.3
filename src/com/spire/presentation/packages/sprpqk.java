/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprwsk;
import java.security.SecureRandom;

public class sprpqk
extends sprgye {
    private sprwsk cfr_renamed_4;

    public static int cfr_renamed_9991(sprwsk arg0) {
        if (arg0.cfr_renamed_2331() != 0) {
            return arg0.cfr_renamed_2331();
        }
        return arg0.cfr_renamed_1155().bitLength();
    }

    public sprwsk cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprpqk(SecureRandom secureRandom, sprwsk sprwsk2) {
        super((SecureRandom)arg0, sprpqk.cfr_renamed_9991((sprwsk)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprwsk2;
    }
}


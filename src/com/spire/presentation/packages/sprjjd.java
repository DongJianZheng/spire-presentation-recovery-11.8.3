/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprygd;
import java.security.SecureRandom;

public class sprjjd
extends sprccb {
    private sprygd cfr_renamed_4;

    public sprygd cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjjd(SecureRandom secureRandom, sprygd sprygd2) {
        super((SecureRandom)arg0, sprjjd.cfr_renamed_3387((sprygd)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprygd2;
    }

    public static int cfr_renamed_3387(sprygd arg0) {
        return arg0.cfr_renamed_1155().bitLength();
    }
}


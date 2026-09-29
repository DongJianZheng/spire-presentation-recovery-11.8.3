/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprpgd;
import java.security.SecureRandom;

public class spryjd
extends sprccb {
    private sprpgd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryjd(SecureRandom secureRandom, sprpgd sprpgd2) {
        super((SecureRandom)arg0, spryjd.cfr_renamed_3372((sprpgd)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprpgd2;
    }

    public sprpgd cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public static int cfr_renamed_3372(sprpgd arg0) {
        if (arg0.cfr_renamed_2331() != 0) {
            return arg0.cfr_renamed_2331();
        }
        return arg0.cfr_renamed_1155().bitLength();
    }
}


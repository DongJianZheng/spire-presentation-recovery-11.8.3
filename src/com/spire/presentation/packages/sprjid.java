/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprzmd;
import java.security.SecureRandom;

public class sprjid
extends sprccb {
    private sprzmd cfr_renamed_4;

    public sprzmd cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public static int cfr_renamed_3377(sprzmd arg0) {
        if (arg0.cfr_renamed_2331() != 0) {
            return arg0.cfr_renamed_2331();
        }
        return arg0.cfr_renamed_1155().bitLength();
    }

    /*
     * WARNING - void declaration
     */
    public sprjid(SecureRandom secureRandom, sprzmd sprzmd2) {
        super((SecureRandom)arg0, sprjid.cfr_renamed_3377((sprzmd)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprzmd2;
    }
}


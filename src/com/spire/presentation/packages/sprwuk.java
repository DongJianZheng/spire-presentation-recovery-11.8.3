/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprzyk;
import java.security.SecureRandom;

public class sprwuk
extends sprgye {
    private sprzyk cfr_renamed_4;

    public sprzyk cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwuk(SecureRandom secureRandom, sprzyk sprzyk2) {
        super((SecureRandom)arg0, sprwuk.cfr_renamed_9996((sprzyk)arg1));
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprzyk2;
    }

    public static int cfr_renamed_9996(sprzyk arg0) {
        return arg0.cfr_renamed_1155().bitLength();
    }
}


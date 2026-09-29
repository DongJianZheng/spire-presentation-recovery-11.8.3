/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.spruxk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprzyk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkxk {
    private int cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    public static /* synthetic */ BigInteger cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    public sprzyk cfr_renamed_2493() {
        sprkxk sprkxk2 = this;
        BigInteger bigInteger = spruxk.cfr_renamed_3519(sprkxk2.cfr_renamed_1, sprkxk2.cfr_renamed_3, this.cfr_renamed_2)[1];
        BigInteger bigInteger2 = spruxk.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger3 = spruxk.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger4 = bigInteger2;
        while (bigInteger4.equals(bigInteger3)) {
            bigInteger3 = spruxk.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
            bigInteger4 = bigInteger2;
        }
        return new sprzyk(bigInteger, bigInteger2, bigInteger3, sprohl.cfr_renamed_7529());
    }

    public sprzyk cfr_renamed_10185(sprwsk arg0) {
        sprwsk sprwsk2 = arg0;
        BigInteger bigInteger = sprwsk2.cfr_renamed_1155();
        BigInteger bigInteger2 = sprwsk2.cfr_renamed_1145();
        BigInteger bigInteger3 = spruxk.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger4 = bigInteger2;
        while (bigInteger4.equals(bigInteger3)) {
            bigInteger3 = spruxk.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
            bigInteger4 = bigInteger2;
        }
        return new sprzyk(bigInteger, bigInteger2, bigInteger3, sprohl.cfr_renamed_7529());
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprkxk sprkxk2 = this;
        this.cfr_renamed_1 = arg0;
        sprkxk2.cfr_renamed_3 = arg1;
        sprkxk2.cfr_renamed_2 = secureRandom;
    }
}


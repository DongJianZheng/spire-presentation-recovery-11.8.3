/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spryfd;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprbgd {
    private SecureRandom cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(2L);
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprbgd sprbgd2 = this;
        this.cfr_renamed_4 = arg0;
        sprbgd2.cfr_renamed_3 = arg1;
        sprbgd2.cfr_renamed_1 = secureRandom;
    }

    public sprzmd cfr_renamed_2493() {
        sprbgd sprbgd2 = this;
        BigInteger[] bigIntegerArray = spryfd.cfr_renamed_3519(sprbgd2.cfr_renamed_4, sprbgd2.cfr_renamed_3, this.cfr_renamed_1);
        BigInteger bigInteger = bigIntegerArray[0];
        BigInteger bigInteger2 = bigIntegerArray[1];
        BigInteger bigInteger3 = spryfd.cfr_renamed_3520(bigInteger, bigInteger2, this.cfr_renamed_1);
        return new sprzmd(bigInteger, bigInteger3, bigInteger2, cfr_renamed_2, null);
    }
}


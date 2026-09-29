/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtvk;
import com.spire.presentation.packages.sprwsk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprjrk {
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(2L);
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprjrk sprjrk2 = this;
        this.cfr_renamed_2 = arg0;
        sprjrk2.cfr_renamed_3 = arg1;
        sprjrk2.cfr_renamed_4 = secureRandom;
    }

    public sprwsk cfr_renamed_2493() {
        sprjrk sprjrk2 = this;
        BigInteger[] bigIntegerArray = sprtvk.cfr_renamed_3519(sprjrk2.cfr_renamed_2, sprjrk2.cfr_renamed_3, this.cfr_renamed_4);
        BigInteger bigInteger = bigIntegerArray[0];
        BigInteger bigInteger2 = bigIntegerArray[1];
        BigInteger bigInteger3 = sprtvk.cfr_renamed_3520(bigInteger, bigInteger2, this.cfr_renamed_4);
        return new sprwsk(bigInteger, bigInteger3, bigInteger2, cfr_renamed_1, null);
    }
}


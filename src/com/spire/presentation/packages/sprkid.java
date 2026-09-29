/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprygd;
import com.spire.presentation.packages.sprykd;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkid {
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(1L);
    private SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprygd cfr_renamed_2493() {
        sprkid sprkid2 = this;
        BigInteger bigInteger = sprykd.cfr_renamed_3519(sprkid2.cfr_renamed_4, sprkid2.cfr_renamed_3, this.cfr_renamed_2)[1];
        BigInteger bigInteger2 = sprykd.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger3 = sprykd.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger4 = bigInteger2;
        while (bigInteger4.equals(bigInteger3)) {
            bigInteger3 = sprykd.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
            bigInteger4 = bigInteger2;
        }
        return new sprygd(bigInteger, bigInteger2, bigInteger3, new sprtfd());
    }

    public static /* synthetic */ BigInteger cfr_renamed_2413() {
        return cfr_renamed_1;
    }

    public sprygd cfr_renamed_3532(sprzmd arg0) {
        sprzmd sprzmd2 = arg0;
        BigInteger bigInteger = sprzmd2.cfr_renamed_1155();
        BigInteger bigInteger2 = sprzmd2.cfr_renamed_1145();
        BigInteger bigInteger3 = sprykd.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger4 = bigInteger2;
        while (bigInteger4.equals(bigInteger3)) {
            bigInteger3 = sprykd.cfr_renamed_3531(bigInteger, this.cfr_renamed_2);
            bigInteger4 = bigInteger2;
        }
        return new sprygd(bigInteger, bigInteger2, bigInteger3, new sprtfd());
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2492(int n, int n2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprkid sprkid2 = this;
        this.cfr_renamed_4 = arg0;
        sprkid2.cfr_renamed_3 = arg1;
        sprkid2.cfr_renamed_2 = secureRandom;
    }
}


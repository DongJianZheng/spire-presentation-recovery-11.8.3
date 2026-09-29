/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgw;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprsxy;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprxlk
implements sprgw {
    private BigInteger cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(0L);

    @Override
    public BigInteger cfr_renamed_3208() {
        BigInteger bigInteger;
        int n = this.cfr_renamed_2.bitLength();
        while ((bigInteger = sprhdf.cfr_renamed_5230(n, this.cfr_renamed_3)).equals(cfr_renamed_4) || bigInteger.compareTo(this.cfr_renamed_2) >= 0) {
        }
        return bigInteger;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3214(BigInteger bigInteger, SecureRandom secureRandom) {
        void arg0;
        sprxlk sprxlk2 = this;
        sprxlk2.cfr_renamed_2 = arg0;
        sprxlk2.cfr_renamed_3 = secureRandom;
    }

    @Override
    public void cfr_renamed_2420(BigInteger arg0, BigInteger arg1, byte[] arg2) {
        throw new IllegalStateException(sprsxy.cfr_renamed_9("pZZX^^VEQ\nQEK\nL_OZPXKO["));
    }

    @Override
    public boolean cfr_renamed_3209() {
        return false;
    }
}


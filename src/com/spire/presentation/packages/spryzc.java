/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtoba;
import com.spire.presentation.packages.sprvf;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryzc
implements sprvf {
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(0L);
    private SecureRandom cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public boolean cfr_renamed_3209() {
        return false;
    }

    @Override
    public void cfr_renamed_2420(BigInteger arg0, BigInteger arg1, byte[] arg2) {
        throw new IllegalStateException(sprtoba.cfr_renamed_9("\u001b\u007f1}5{=`:/:` /'z$\u007f;} j0"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3214(BigInteger bigInteger, SecureRandom secureRandom) {
        void arg0;
        spryzc spryzc2 = this;
        spryzc2.cfr_renamed_4 = arg0;
        spryzc2.cfr_renamed_3 = secureRandom;
    }

    @Override
    public BigInteger cfr_renamed_3208() {
        BigInteger bigInteger;
        int n = this.cfr_renamed_4.bitLength();
        while ((bigInteger = new BigInteger(n, this.cfr_renamed_3)).equals(cfr_renamed_2) || bigInteger.compareTo(this.cfr_renamed_4) >= 0) {
        }
        return bigInteger;
    }
}


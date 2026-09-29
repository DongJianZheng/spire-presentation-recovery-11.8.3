/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprixz;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprucaa;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprmfd {
    private static BigInteger cfr_renamed_1 = BigInteger.valueOf(0L);
    private SecureRandom cfr_renamed_2;
    private static BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprmtc cfr_renamed_4;

    public BigInteger cfr_renamed_3502() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprixz.cfr_renamed_9("EuLuPqV\u007fP0L\u007fV0K~KdKqNyQuF"));
        }
        BigInteger bigInteger3 = this.cfr_renamed_4.cfr_renamed_2295();
        int n = bigInteger3.bitLength() - 1;
        do {
            bigInteger2 = new BigInteger(n, this.cfr_renamed_2);
            bigInteger = bigInteger2.gcd(bigInteger3);
        } while (bigInteger2.equals(cfr_renamed_1) || bigInteger2.equals(cfr_renamed_3) || !bigInteger.equals(cfr_renamed_3));
        return bigInteger2;
    }

    public void cfr_renamed_1524(sprt arg0) {
        sprmfd sprmfd2;
        if (arg0 instanceof spraed) {
            spraed spraed2 = (spraed)arg0;
            this.cfr_renamed_4 = (sprmtc)spraed2.cfr_renamed_284();
            sprmfd2 = this;
            this.cfr_renamed_2 = spraed2.cfr_renamed_1295();
        } else {
            this.cfr_renamed_4 = (sprmtc)arg0;
            sprmfd2 = this;
            this.cfr_renamed_2 = new SecureRandom();
        }
        if (sprmfd2.cfr_renamed_4 instanceof sprisc) {
            throw new IllegalArgumentException(sprucaa.cfr_renamed_9("S\u0000Z\u0000F\u0004@\nFEF\u0000E\u0010]\u0017Q\u0016\u00147g$\u0014\u0015A\u0007X\fWE_\u0000M"));
        }
    }
}


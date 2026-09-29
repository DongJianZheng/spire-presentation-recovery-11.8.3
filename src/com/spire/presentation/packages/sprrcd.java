/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcjd;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprksa;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvpa;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprrcd
implements sprh {
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(1L);
    private sprmtc cfr_renamed_2;
    private sprcjd cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprrcd() {
        sprrcd sprrcd2 = this;
        sprrcd2.cfr_renamed_3 = new sprcjd();
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprt sprt2 = arg1;
        this.cfr_renamed_3.cfr_renamed_1217(arg0, sprt2);
        if (sprt2 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            this.cfr_renamed_2 = (sprmtc)spraed2.cfr_renamed_284();
            this.cfr_renamed_4 = spraed2.cfr_renamed_1295();
            return;
        }
        this.cfr_renamed_2 = (sprmtc)arg1;
        sprrcd sprrcd2 = this;
        sprrcd2.cfr_renamed_4 = new SecureRandom();
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_3.cfr_renamed_1344();
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        BigInteger bigInteger;
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprksa.cfr_renamed_9("7y$\n\u0000D\u0002C\u000bOED\n^EC\u000bC\u0011C\u0004F\fY\u0000N"));
        }
        sprrcd sprrcd2 = this;
        BigInteger bigInteger2 = sprrcd2.cfr_renamed_3.cfr_renamed_3612(arg0, arg1, arg2);
        if (sprrcd2.cfr_renamed_2 instanceof sprisc) {
            sprisc sprisc2 = (sprisc)this.cfr_renamed_2;
            BigInteger bigInteger3 = sprisc2.cfr_renamed_2296();
            if (bigInteger3 != null) {
                BigInteger bigInteger4 = sprisc2.cfr_renamed_2295();
                BigInteger bigInteger5 = sprvpa.cfr_renamed_513(cfr_renamed_1, bigInteger4.subtract(cfr_renamed_1), this.cfr_renamed_4);
                BigInteger bigInteger6 = bigInteger5.modPow(bigInteger3, bigInteger4).multiply(bigInteger2).mod(bigInteger4);
                BigInteger bigInteger7 = this.cfr_renamed_3.cfr_renamed_3611(bigInteger6);
                BigInteger bigInteger8 = bigInteger5.modInverse(bigInteger4);
                bigInteger = bigInteger7.multiply(bigInteger8).mod(bigInteger4);
            } else {
                bigInteger = this.cfr_renamed_3.cfr_renamed_3611(bigInteger2);
            }
        } else {
            bigInteger = this.cfr_renamed_3.cfr_renamed_3611(bigInteger2);
        }
        return this.cfr_renamed_3.cfr_renamed_3610(bigInteger);
    }

    @Override
    public int cfr_renamed_1339() {
        return this.cfr_renamed_3.cfr_renamed_1339();
    }
}


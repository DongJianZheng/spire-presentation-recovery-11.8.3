/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhdaa;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.spriyk;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprmtk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprwmaa;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzrk;
import com.spire.presentation.packages.sprzvk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryek
implements sprjp {
    public sprzvk cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger[] bigIntegerArray;
        BigInteger bigInteger;
        byte[] byArray = sproze.cfr_renamed_537(arg0);
        BigInteger bigInteger2 = new BigInteger(1, byArray);
        spriyk spriyk2 = this.cfr_renamed_3.cfr_renamed_284();
        while ((bigInteger = sprhdf.cfr_renamed_5230(spriyk2.cfr_renamed_1604().bitLength(), this.cfr_renamed_4)).compareTo(spriyk2.cfr_renamed_1604()) >= 0) {
        }
        BigInteger bigInteger3 = spriyk2.cfr_renamed_1778().modPow(bigInteger, spriyk2.cfr_renamed_1155()).mod(spriyk2.cfr_renamed_1604());
        BigInteger bigInteger4 = bigInteger.multiply(bigInteger2).add(((sprzrk)this.cfr_renamed_3).cfr_renamed_1980().multiply(bigInteger3)).mod(spriyk2.cfr_renamed_1604());
        BigInteger[] bigIntegerArray2 = bigIntegerArray = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger4;
        return bigIntegerArray2;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                spryek spryek2 = this;
                spryek2.cfr_renamed_4 = sprbgk2.cfr_renamed_1295();
                spryek2.cfr_renamed_3 = (sprzrk)sprbgk2.cfr_renamed_284();
            } else {
                this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
                this.cfr_renamed_3 = (sprzrk)arg1;
            }
        } else {
            this.cfr_renamed_3 = (sprmtk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9920(sprhdaa.cfr_renamed_9(";~/eO\u0005M\u0001"), this.cfr_renamed_3, arg0));
    }

    @Override
    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1604();
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        byte[] byArray = sproze.cfr_renamed_537(arg0);
        BigInteger bigInteger = new BigInteger(1, byArray);
        spriyk spriyk2 = this.cfr_renamed_3.cfr_renamed_284();
        BigInteger bigInteger2 = BigInteger.valueOf(0L);
        if (bigInteger2.compareTo(arg1) >= 0 || spriyk2.cfr_renamed_1604().compareTo(arg1) <= 0) {
            return false;
        }
        if (bigInteger2.compareTo(arg2) >= 0 || spriyk2.cfr_renamed_1604().compareTo(arg2) <= 0) {
            return false;
        }
        BigInteger bigInteger3 = bigInteger.modPow(spriyk2.cfr_renamed_1604().subtract(new BigInteger(sprwmaa.cfr_renamed_9("F"))), spriyk2.cfr_renamed_1604());
        BigInteger bigInteger4 = arg2.multiply(bigInteger3).mod(spriyk2.cfr_renamed_1604());
        spriyk spriyk3 = spriyk2;
        BigInteger bigInteger5 = spriyk2.cfr_renamed_1604().subtract(arg1).multiply(bigInteger3).mod(spriyk3.cfr_renamed_1604());
        bigInteger4 = spriyk3.cfr_renamed_1778().modPow(bigInteger4, spriyk2.cfr_renamed_1155());
        bigInteger5 = ((sprmtk)this.cfr_renamed_3).spr\u3181().modPow(bigInteger5, spriyk2.cfr_renamed_1155());
        return bigInteger4.multiply(bigInteger5).mod(spriyk2.cfr_renamed_1155()).mod(spriyk2.cfr_renamed_1604()).equals(arg1);
    }
}


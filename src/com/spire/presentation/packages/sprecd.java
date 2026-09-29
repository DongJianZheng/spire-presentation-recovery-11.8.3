/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcfd;
import com.spire.presentation.packages.sprpcd;
import com.spire.presentation.packages.sprsgd;
import com.spire.presentation.packages.sprshd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtmn;
import com.spire.presentation.packages.spruj;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprecd
implements spruj {
    public SecureRandom cfr_renamed_3;
    public sprsgd cfr_renamed_4;

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            byArray[++n] = arg0[byArray.length - 1 - n];
            n2 = n;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        sprcfd sprcfd2 = this.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger2 = BigInteger.valueOf(0L);
        if (bigInteger2.compareTo(arg1) >= 0 || sprcfd2.cfr_renamed_1604().compareTo(arg1) <= 0) {
            return false;
        }
        if (bigInteger2.compareTo(arg2) >= 0 || sprcfd2.cfr_renamed_1604().compareTo(arg2) <= 0) {
            return false;
        }
        BigInteger bigInteger3 = bigInteger.modPow(sprcfd2.cfr_renamed_1604().subtract(new BigInteger(sprtmn.cfr_renamed_9("x"))), sprcfd2.cfr_renamed_1604());
        BigInteger bigInteger4 = arg2.multiply(bigInteger3).mod(sprcfd2.cfr_renamed_1604());
        sprcfd sprcfd3 = sprcfd2;
        BigInteger bigInteger5 = sprcfd2.cfr_renamed_1604().subtract(arg1).multiply(bigInteger3).mod(sprcfd3.cfr_renamed_1604());
        bigInteger4 = sprcfd3.cfr_renamed_1778().modPow(bigInteger4, sprcfd2.cfr_renamed_1155());
        bigInteger5 = ((sprpcd)this.cfr_renamed_4).spr\u3181().modPow(bigInteger5, sprcfd2.cfr_renamed_1155());
        return bigInteger4.multiply(bigInteger5).mod(sprcfd2.cfr_renamed_1155()).mod(sprcfd2.cfr_renamed_1604()).equals(arg1);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprecd sprecd2 = this;
                sprecd2.cfr_renamed_3 = spraed2.cfr_renamed_1295();
                sprecd2.cfr_renamed_4 = (sprshd)spraed2.cfr_renamed_284();
                return;
            }
            this.cfr_renamed_3 = new SecureRandom();
            this.cfr_renamed_4 = (sprshd)arg1;
            return;
        }
        this.cfr_renamed_4 = (sprpcd)arg1;
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger[] bigIntegerArray;
        BigInteger bigInteger;
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            byArray[++n] = arg0[byArray.length - 1 - n];
            n2 = n;
        }
        BigInteger bigInteger2 = new BigInteger(1, byArray);
        sprcfd sprcfd2 = this.cfr_renamed_4.cfr_renamed_284();
        while ((bigInteger = new BigInteger(sprcfd2.cfr_renamed_1604().bitLength(), this.cfr_renamed_3)).compareTo(sprcfd2.cfr_renamed_1604()) >= 0) {
        }
        BigInteger bigInteger3 = sprcfd2.cfr_renamed_1778().modPow(bigInteger, sprcfd2.cfr_renamed_1155()).mod(sprcfd2.cfr_renamed_1604());
        BigInteger bigInteger4 = bigInteger.multiply(bigInteger2).add(((sprshd)this.cfr_renamed_4).cfr_renamed_1980().multiply(bigInteger3)).mod(sprcfd2.cfr_renamed_1604());
        BigInteger[] bigIntegerArray2 = bigIntegerArray = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger4;
        return bigIntegerArray2;
    }
}


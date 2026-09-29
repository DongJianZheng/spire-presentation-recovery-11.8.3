/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsmk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprghk
implements sprjp {
    public sprmuk cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprghk sprghk2 = this;
                sprghk2.cfr_renamed_4 = sprbgk2.cfr_renamed_1295();
                sprghk2.cfr_renamed_3 = (sprzuk)sprbgk2.cfr_renamed_284();
            } else {
                this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
                this.cfr_renamed_3 = (sprzuk)arg1;
            }
        } else {
            this.cfr_renamed_3 = (sprnzk)arg1;
        }
        sprybl.cfr_renamed_9170(sprsmk.cfr_renamed_9916("ECGOST3410", this.cfr_renamed_3, arg0));
    }

    @Override
    public BigInteger cfr_renamed_1932() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1146();
    }

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        byte[] byArray = sproze.cfr_renamed_537(arg0);
        BigInteger bigInteger4 = new BigInteger(1, byArray);
        sprghk sprghk2 = this;
        sprqxk sprqxk2 = sprghk2.cfr_renamed_3.cfr_renamed_284();
        BigInteger bigInteger5 = sprqxk2.cfr_renamed_1146();
        BigInteger bigInteger6 = ((sprzuk)sprghk2.cfr_renamed_3).cfr_renamed_2112();
        sprfe sprfe2 = this.cfr_renamed_3284();
        while ((bigInteger3 = sprhdf.cfr_renamed_5230(bigInteger5.bitLength(), this.cfr_renamed_4)).equals(sprck.cfr_renamed_0) || (bigInteger2 = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger3).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger5)).equals(sprck.cfr_renamed_0) || (bigInteger = bigInteger3.multiply(bigInteger4).add(bigInteger6.multiply(bigInteger2)).mod(bigInteger5)).equals(sprck.cfr_renamed_0)) {
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        spreuh spreuh2;
        byte[] byArray = sproze.cfr_renamed_537(arg0);
        BigInteger bigInteger = new BigInteger(1, byArray);
        BigInteger bigInteger2 = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1146();
        if (arg1.compareTo(sprck.cfr_renamed_4) < 0 || arg1.compareTo(bigInteger2) >= 0) {
            return false;
        }
        if (arg2.compareTo(sprck.cfr_renamed_4) < 0 || arg2.compareTo(bigInteger2) >= 0) {
            return false;
        }
        BigInteger bigInteger3 = bigInteger2;
        BigInteger bigInteger4 = sprhdf.cfr_renamed_5232(bigInteger3, bigInteger);
        BigInteger bigInteger5 = arg2.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigInteger6 = bigInteger3.subtract(arg1).multiply(bigInteger4).mod(bigInteger2);
        sprghk sprghk2 = this;
        spreuh spreuh3 = sprghk2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1145();
        spreuh spreuh4 = sprmvh.cfr_renamed_8958(spreuh3, bigInteger5, spreuh2 = ((sprnzk)sprghk2.cfr_renamed_3).cfr_renamed_1604(), bigInteger6).cfr_renamed_1775();
        if (spreuh4.cfr_renamed_1952()) {
            return false;
        }
        return spreuh4.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2).equals(arg1);
    }
}


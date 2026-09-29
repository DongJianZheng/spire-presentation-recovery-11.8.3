/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprfld;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprwmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkzc
implements spruj {
    public SecureRandom cfr_renamed_3;
    public sprfld cfr_renamed_4;

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            byArray[++n] = arg0[byArray.length - 1 - n];
            n2 = n;
        }
        BigInteger bigInteger4 = new BigInteger(1, byArray);
        sprkzc sprkzc2 = this;
        sprqid sprqid2 = sprkzc2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger5 = sprqid2.cfr_renamed_1146();
        BigInteger bigInteger6 = ((spreed)sprkzc2.cfr_renamed_4).cfr_renamed_2112();
        spreb spreb2 = this.cfr_renamed_3284();
        while ((bigInteger3 = new BigInteger(bigInteger5.bitLength(), this.cfr_renamed_3)).equals(sprpb.cfr_renamed_1) || (bigInteger2 = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger3).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger5)).equals(sprpb.cfr_renamed_1) || (bigInteger = bigInteger3.multiply(bigInteger4).add(bigInteger6.multiply(bigInteger2)).mod(bigInteger5)).equals(sprpb.cfr_renamed_1)) {
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprkzc sprkzc2 = this;
                sprkzc2.cfr_renamed_3 = spraed2.cfr_renamed_1295();
                sprkzc2.cfr_renamed_4 = (spreed)spraed2.cfr_renamed_284();
                return;
            }
            this.cfr_renamed_3 = new SecureRandom();
            this.cfr_renamed_4 = (spreed)arg1;
            return;
        }
        this.cfr_renamed_4 = (sprwmd)arg1;
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprrlb sprrlb2;
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            byArray[++n] = arg0[byArray.length - 1 - n];
            n2 = n;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        BigInteger bigInteger2 = this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1146();
        if (arg1.compareTo(sprpb.cfr_renamed_0) < 0 || arg1.compareTo(bigInteger2) >= 0) {
            return false;
        }
        if (arg2.compareTo(sprpb.cfr_renamed_0) < 0 || arg2.compareTo(bigInteger2) >= 0) {
            return false;
        }
        BigInteger bigInteger3 = bigInteger.modInverse(bigInteger2);
        BigInteger bigInteger4 = arg2.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger5 = bigInteger2.subtract(arg1).multiply(bigInteger3).mod(bigInteger2);
        sprkzc sprkzc2 = this;
        sprrlb sprrlb3 = sprkzc2.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1145();
        sprrlb sprrlb4 = sprunb.cfr_renamed_2006(sprrlb3, bigInteger4, sprrlb2 = ((sprwmd)sprkzc2.cfr_renamed_4).cfr_renamed_1604(), bigInteger5).cfr_renamed_1775();
        if (sprrlb4.cfr_renamed_1952()) {
            return false;
        }
        return sprrlb4.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2).equals(arg1);
    }
}


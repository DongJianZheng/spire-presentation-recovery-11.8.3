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
import com.spire.presentation.packages.sprvf;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.spryzc;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprbsc
implements sprpb,
spruj {
    private final sprvf cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprfld cfr_renamed_4;

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprrlb sprrlb2;
        sprbsc sprbsc2 = this;
        sprqid sprqid2 = sprbsc2.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        BigInteger bigInteger2 = sprbsc2.cfr_renamed_3285(bigInteger, arg0);
        if (arg1.compareTo(cfr_renamed_0) < 0 || arg1.compareTo(bigInteger) >= 0) {
            return false;
        }
        if (arg2.compareTo(cfr_renamed_0) < 0 || arg2.compareTo(bigInteger) >= 0) {
            return false;
        }
        BigInteger bigInteger3 = arg2.modInverse(bigInteger);
        BigInteger bigInteger4 = bigInteger2.multiply(bigInteger3).mod(bigInteger);
        BigInteger bigInteger5 = arg1.multiply(bigInteger3).mod(bigInteger);
        sprrlb sprrlb3 = sprqid2.cfr_renamed_1145();
        sprrlb sprrlb4 = sprunb.cfr_renamed_2006(sprrlb3, bigInteger4, sprrlb2 = ((sprwmd)this.cfr_renamed_4).cfr_renamed_1604(), bigInteger5).cfr_renamed_1775();
        if (sprrlb4.cfr_renamed_1952()) {
            return false;
        }
        return sprrlb4.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger).equals(arg1);
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        sprbsc sprbsc2;
        sprbsc sprbsc3 = this;
        sprqid sprqid2 = sprbsc3.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger4 = sprqid2.cfr_renamed_1146();
        BigInteger bigInteger5 = sprbsc3.cfr_renamed_3285(bigInteger4, arg0);
        BigInteger bigInteger6 = ((spreed)sprbsc3.cfr_renamed_4).cfr_renamed_2112();
        if (this.cfr_renamed_2.cfr_renamed_3209()) {
            sprbsc sprbsc4 = this;
            sprbsc2 = sprbsc4;
            sprbsc4.cfr_renamed_2.cfr_renamed_2420(bigInteger4, bigInteger6, arg0);
        } else {
            sprbsc sprbsc5 = this;
            sprbsc2 = sprbsc5;
            sprbsc5.cfr_renamed_2.cfr_renamed_3214(bigInteger4, this.cfr_renamed_3);
        }
        spreb spreb2 = sprbsc2.cfr_renamed_3284();
        do {
            bigInteger2 = this.cfr_renamed_2.cfr_renamed_3208();
        } while ((bigInteger3 = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger2).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger4)).equals(cfr_renamed_1) || (bigInteger = bigInteger2.modInverse(bigInteger4).multiply(bigInteger5.add(bigInteger6.multiply(bigInteger3))).mod(bigInteger4)).equals(cfr_renamed_1));
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    public sprbsc(sprvf sprvf2) {
        this.cfr_renamed_2 = sprvf2;
    }

    public SecureRandom cfr_renamed_3286(boolean arg0, SecureRandom arg1) {
        if (!arg0) {
            return null;
        }
        if (arg1 != null) {
            return arg1;
        }
        return new SecureRandom();
    }

    public sprbsc() {
        sprbsc sprbsc2 = this;
        sprbsc2.cfr_renamed_2 = new spryzc();
    }

    /*
     * WARNING - void declaration
     */
    public BigInteger cfr_renamed_3285(BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        int n = arg0.bitLength();
        int n2 = byArray.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, (byte[])arg1);
        if (n < n2) {
            bigInteger2 = bigInteger2.shiftRight(n2 - n);
        }
        return bigInteger2;
    }

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        SecureRandom secureRandom;
        boolean bl;
        sprbsc sprbsc2;
        SecureRandom secureRandom2 = null;
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                this.cfr_renamed_4 = (spreed)spraed2.cfr_renamed_284();
                secureRandom2 = spraed2.cfr_renamed_1295();
                sprbsc2 = this;
            } else {
                this.cfr_renamed_4 = (spreed)arg1;
                sprbsc2 = this;
            }
        } else {
            this.cfr_renamed_4 = (sprwmd)arg1;
            sprbsc2 = this;
        }
        if (arg0 && !this.cfr_renamed_2.cfr_renamed_3209()) {
            bl = true;
            secureRandom = secureRandom2;
        } else {
            bl = false;
            secureRandom = secureRandom2;
        }
        sprbsc2.cfr_renamed_3 = this.cfr_renamed_3286(bl, secureRandom);
    }
}


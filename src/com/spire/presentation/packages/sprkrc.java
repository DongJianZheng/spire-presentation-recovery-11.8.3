/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprfld;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkrc
implements spruj {
    private SecureRandom cfr_renamed_2;
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprfld cfr_renamed_4;

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            sprkrc sprkrc2;
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprkrc2 = this;
                this.cfr_renamed_2 = spraed2.cfr_renamed_1295();
                arg1 = spraed2.cfr_renamed_284();
            } else {
                sprkrc2 = this;
                this.cfr_renamed_2 = new SecureRandom();
            }
            sprkrc2.cfr_renamed_4 = (spreed)arg1;
            return;
        }
        this.cfr_renamed_4 = (sprwmd)arg1;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3287(BigInteger arg0, SecureRandom arg1) {
        return new BigInteger(arg0.bitLength() - 1, arg1);
    }

    @Override
    public BigInteger[] cfr_renamed_125(byte[] arg0) {
        BigInteger bigInteger;
        sprwtb sprwtb2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        sprwtb sprwtb3;
        sprqid sprqid2 = this.cfr_renamed_4.cfr_renamed_284();
        sprpib sprpib2 = sprqid2.cfr_renamed_1769();
        sprwtb sprwtb4 = sprkrc.cfr_renamed_3288(sprpib2, arg0);
        if (sprwtb4.cfr_renamed_805()) {
            sprwtb4 = sprpib2.cfr_renamed_1652(cfr_renamed_3);
        }
        BigInteger bigInteger4 = sprqid2.cfr_renamed_1146();
        BigInteger bigInteger5 = ((spreed)this.cfr_renamed_4).cfr_renamed_2112();
        spreb spreb2 = this.cfr_renamed_3284();
        do {
            bigInteger3 = sprkrc.cfr_renamed_3287(bigInteger4, this.cfr_renamed_2);
        } while ((sprwtb3 = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger3).cfr_renamed_1775().cfr_renamed_1969()).cfr_renamed_805() || (bigInteger2 = sprkrc.cfr_renamed_3289((sprwtb2 = sprwtb4.cfr_renamed_1833(sprwtb3)).cfr_renamed_1779(), bigInteger4.bitLength() - 1)).signum() == 0 || (bigInteger = bigInteger2.multiply(bigInteger5).add(bigInteger3).mod(bigInteger4)).signum() == 0);
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    @Override
    public boolean cfr_renamed_2474(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        sprrlb sprrlb2;
        if (arg1.signum() <= 0 || arg2.signum() <= 0) {
            return false;
        }
        sprqid sprqid2 = this.cfr_renamed_4.cfr_renamed_284();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        if (arg1.compareTo(bigInteger) >= 0 || arg2.compareTo(bigInteger) >= 0) {
            return false;
        }
        sprpib sprpib2 = sprqid2.cfr_renamed_1769();
        sprwtb sprwtb2 = sprkrc.cfr_renamed_3288(sprpib2, arg0);
        if (sprwtb2.cfr_renamed_805()) {
            sprwtb2 = sprpib2.cfr_renamed_1652(cfr_renamed_3);
        }
        if ((sprrlb2 = sprunb.cfr_renamed_2006(sprqid2.cfr_renamed_1145(), arg2, ((sprwmd)this.cfr_renamed_4).cfr_renamed_1604(), arg1).cfr_renamed_1775()).cfr_renamed_1952()) {
            return false;
        }
        sprwtb sprwtb3 = sprwtb2.cfr_renamed_1833(sprrlb2.cfr_renamed_1969());
        return sprkrc.cfr_renamed_3289(sprwtb3.cfr_renamed_1779(), bigInteger.bitLength() - 1).compareTo(arg1) == 0;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3289(BigInteger arg0, int arg1) {
        if (arg0.bitLength() > arg1) {
            arg0 = arg0.mod(cfr_renamed_3.shiftLeft(arg1));
        }
        return arg0;
    }

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    private static /* synthetic */ sprwtb cfr_renamed_3288(sprpib arg0, byte[] arg1) {
        byte[] byArray = sprzra.cfr_renamed_537(arg1);
        sprpib sprpib2 = arg0;
        sprpib sprpib3 = arg0;
        return sprpib3.cfr_renamed_1652(sprkrc.cfr_renamed_3289(new BigInteger(1, byArray), sprpib3.cfr_renamed_1938()));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprggd;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtnd;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprzf;
import java.math.BigInteger;

public class sprpzca
implements sprzf {
    public sprtnd cfr_renamed_4;

    @Override
    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }

    private /* synthetic */ sprrlb cfr_renamed_3946(sprqid arg0, spreed arg1, spreed arg2, sprwmd arg3, sprwmd arg4, sprwmd arg5) {
        sprqid sprqid2 = arg0;
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        int n = (bigInteger.bitLength() + 1) / 2;
        BigInteger bigInteger2 = sprpb.cfr_renamed_0.shiftLeft(n);
        sprpib sprpib2 = sprqid2.cfr_renamed_1769();
        sprrlb[] sprrlbArray = new sprrlb[3];
        sprrlbArray[0] = sprunb.cfr_renamed_2007(sprpib2, arg3 == null ? arg0.cfr_renamed_1145().cfr_renamed_1830(arg2.cfr_renamed_2112()) : arg3.cfr_renamed_1604());
        sprrlbArray[1] = sprunb.cfr_renamed_2007(sprpib2, arg4.cfr_renamed_1604());
        sprrlbArray[2] = sprunb.cfr_renamed_2007(sprpib2, arg5.cfr_renamed_1604());
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprpib2.cfr_renamed_1805(sprrlbArray2);
        sprrlb sprrlb2 = sprrlbArray2[0];
        sprrlb sprrlb3 = sprrlbArray2[1];
        sprrlb sprrlb4 = sprrlbArray2[2];
        BigInteger bigInteger3 = sprrlb2.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2).setBit(n);
        BigInteger bigInteger4 = arg1.cfr_renamed_2112().multiply(bigInteger3).add(arg2.cfr_renamed_2112()).mod(bigInteger);
        BigInteger bigInteger5 = sprrlb4.cfr_renamed_1969().cfr_renamed_1779().mod(bigInteger2).setBit(n);
        BigInteger bigInteger6 = arg0.cfr_renamed_1153().multiply(bigInteger4).mod(bigInteger);
        return sprunb.cfr_renamed_2006(sprrlb3, bigInteger5.multiply(bigInteger6).mod(bigInteger), sprrlb4, bigInteger6);
    }

    @Override
    public BigInteger cfr_renamed_2501(sprt arg0) {
        sprggd sprggd2 = (sprggd)arg0;
        spreed spreed2 = this.cfr_renamed_4.cfr_renamed_2095();
        sprpzca sprpzca2 = this;
        sprrlb sprrlb2 = sprpzca2.cfr_renamed_3946(spreed2.cfr_renamed_284(), spreed2, sprpzca2.cfr_renamed_4.cfr_renamed_2094(), this.cfr_renamed_4.cfr_renamed_2096(), sprggd2.cfr_renamed_3351(), sprggd2.cfr_renamed_2096()).cfr_renamed_1775();
        if (sprrlb2.cfr_renamed_1952()) {
            throw new IllegalStateException(sprcmn.cfr_renamed_9("Z4u3}3g#33`z}5gzrze;\u007f3wzr=a?v7v4gze;\u007f/vzu5az^\u000bE"));
        }
        return sprrlb2.cfr_renamed_1969().cfr_renamed_1779();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        this.cfr_renamed_4 = (sprtnd)arg0;
    }
}


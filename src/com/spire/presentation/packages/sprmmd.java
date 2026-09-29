/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbld;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprijd;
import com.spire.presentation.packages.sprjjd;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.sprygd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprmmd
implements spry {
    private sprjjd cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    private /* synthetic */ BigInteger cfr_renamed_3533(BigInteger arg0, SecureRandom arg1) {
        return sprvpa.cfr_renamed_513(cfr_renamed_4, arg0.subtract(cfr_renamed_4), arg1);
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        sprmmd sprmmd2 = this;
        sprygd sprygd2 = sprmmd2.cfr_renamed_3.cfr_renamed_284();
        sprbld sprbld2 = sprmmd2.cfr_renamed_3534(sprmmd2.cfr_renamed_3.cfr_renamed_1295(), sprygd2);
        sprijd sprijd2 = sprmmd2.cfr_renamed_3535(sprygd2, sprbld2);
        sprbld2.cfr_renamed_3381(sprijd2);
        return new sprwnd(sprijd2, sprbld2);
    }

    private /* synthetic */ sprijd cfr_renamed_3535(sprygd arg0, sprbld arg1) {
        sprygd sprygd2 = arg0;
        BigInteger bigInteger = sprygd2.cfr_renamed_1944();
        BigInteger bigInteger2 = sprygd2.cfr_renamed_1946();
        BigInteger bigInteger3 = sprygd2.cfr_renamed_1155();
        BigInteger bigInteger4 = bigInteger;
        BigInteger bigInteger5 = bigInteger4.modPow(arg1.cfr_renamed_3380(), bigInteger3).multiply(bigInteger2.modPow(arg1.cfr_renamed_3384(), bigInteger3));
        BigInteger bigInteger6 = bigInteger4.modPow(arg1.cfr_renamed_3385(), bigInteger3).multiply(bigInteger2.modPow(arg1.cfr_renamed_3386(), bigInteger3));
        BigInteger bigInteger7 = bigInteger4.modPow(arg1.cfr_renamed_3383(), bigInteger3);
        return new sprijd(arg0, bigInteger5, bigInteger6, bigInteger7);
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_3 = (sprjjd)arg0;
    }

    private /* synthetic */ sprbld cfr_renamed_3534(SecureRandom arg0, sprygd arg1) {
        BigInteger bigInteger = arg1.cfr_renamed_1155();
        return new sprbld(arg1, this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0), this.cfr_renamed_3533(bigInteger, arg0));
    }
}


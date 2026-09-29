/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhf;
import com.spire.presentation.packages.sprsgf;
import com.spire.presentation.packages.sprxaf;
import java.math.BigInteger;

public class sprrff
extends sprhhf {
    public BigInteger cfr_renamed_3;

    public static sprrff cfr_renamed_5446(sprrff arg0, sprrff arg1) {
        sprrff sprrff2 = arg0;
        BigInteger bigInteger = sprrff2.cfr_renamed_3;
        BigInteger bigInteger2 = arg1.cfr_renamed_3;
        BigInteger bigInteger3 = bigInteger.multiply(bigInteger2);
        sprxaf sprxaf2 = sprxaf.cfr_renamed_736(bigInteger2, bigInteger);
        sprsgf sprsgf2 = (sprsgf)((sprsgf)((Object)sprrff2.cfr_renamed_3)).clone();
        sprsgf2.cfr_renamed_737(sprxaf2.cfr_renamed_3.multiply(bigInteger2));
        sprsgf sprsgf3 = (sprsgf)((sprsgf)((Object)arg1.cfr_renamed_3)).clone();
        sprsgf3.cfr_renamed_737(sprxaf2.cfr_renamed_4.multiply(bigInteger));
        sprsgf sprsgf4 = sprsgf2;
        sprsgf4.cfr_renamed_5445(sprsgf3);
        sprsgf4.cfr_renamed_738(bigInteger3);
        return new sprrff(sprsgf2, null, bigInteger3);
    }

    /*
     * WARNING - void declaration
     */
    public sprrff(sprsgf sprsgf2, BigInteger bigInteger, BigInteger bigInteger2) {
        super((sprsgf)arg0, (BigInteger)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_3 = bigInteger2;
    }
}


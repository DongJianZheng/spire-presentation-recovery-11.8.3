/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprvqa;
import com.spire.presentation.packages.sprwna;
import java.math.BigInteger;

public class sprgna
extends sprvqa {
    public BigInteger cfr_renamed_4;

    public static sprgna cfr_renamed_735(sprgna arg0, sprgna arg1) {
        sprgna sprgna2 = arg0;
        BigInteger bigInteger = sprgna2.cfr_renamed_4;
        BigInteger bigInteger2 = arg1.cfr_renamed_4;
        BigInteger bigInteger3 = bigInteger.multiply(bigInteger2);
        sprfma sprfma2 = sprfma.cfr_renamed_736(bigInteger2, bigInteger);
        sprwna sprwna2 = (sprwna)((sprwna)((Object)sprgna2.cfr_renamed_4)).clone();
        sprwna2.cfr_renamed_737(sprfma2.cfr_renamed_2.multiply(bigInteger2));
        sprwna sprwna3 = (sprwna)((sprwna)((Object)arg1.cfr_renamed_4)).clone();
        sprwna3.cfr_renamed_737(sprfma2.cfr_renamed_3.multiply(bigInteger));
        sprwna sprwna4 = sprwna2;
        sprwna4.cfr_renamed_733(sprwna3);
        sprwna4.cfr_renamed_738(bigInteger3);
        return new sprgna(sprwna2, null, bigInteger3);
    }

    /*
     * WARNING - void declaration
     */
    public sprgna(sprwna sprwna2, BigInteger bigInteger, BigInteger bigInteger2) {
        super((sprwna)arg0, (BigInteger)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = bigInteger2;
    }
}


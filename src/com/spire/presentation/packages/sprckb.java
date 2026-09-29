/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprckb
extends sprmqb {
    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        sprrlb sprrlb2 = arg0;
        sprrlb sprrlb3 = sprrlb2.cfr_renamed_1769().cfr_renamed_1770();
        sprrlb sprrlb4 = sprrlb2;
        BigInteger bigInteger = arg1;
        int n = bigInteger.bitLength();
        int n2 = bigInteger.getLowestSetBit();
        sprrlb4 = sprrlb2.cfr_renamed_1771(n2);
        int n3 = n2;
        while (++n3 < n) {
            sprrlb3 = sprrlb3.cfr_renamed_1772(arg1.testBit(n3) ? sprrlb4 : sprrlb4.cfr_renamed_1773());
            sprrlb4 = sprrlb4.cfr_renamed_1774();
        }
        sprrlb3 = sprrlb3.cfr_renamed_1772(sprrlb4);
        return sprrlb3;
    }
}


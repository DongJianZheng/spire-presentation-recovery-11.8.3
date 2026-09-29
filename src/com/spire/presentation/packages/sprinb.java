/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprinb
extends sprmqb {
    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        sprrlb sprrlb2 = arg0.cfr_renamed_1775();
        sprrlb sprrlb3 = sprrlb2.cfr_renamed_1773();
        sprrlb sprrlb4 = sprrlb2;
        BigInteger bigInteger = arg1;
        int n = bigInteger.bitLength();
        int n2 = bigInteger.getLowestSetBit();
        int n3 = n;
        while (--n3 > n2) {
            sprrlb4 = sprrlb4.cfr_renamed_1697(arg1.testBit(n3) ? sprrlb2 : sprrlb3);
        }
        sprrlb4 = sprrlb4.cfr_renamed_1771(n2);
        return sprrlb4;
    }
}


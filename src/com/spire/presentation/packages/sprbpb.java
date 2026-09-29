/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprbpb
extends sprmqb {
    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = arg0.cfr_renamed_1769().cfr_renamed_1770();
        sprrlbArray[1] = arg0;
        sprrlb[] sprrlbArray2 = sprrlbArray;
        int n = arg1.bitLength();
        while (--n >= 0) {
            int n2;
            int n3 = arg1.testBit(n) ? 1 : 0;
            int n4 = n2 = 1 - n3;
            sprrlbArray2[n4] = sprrlbArray2[n4].cfr_renamed_1772(sprrlbArray2[n3]);
            sprrlbArray2[n3] = sprrlbArray2[n3].cfr_renamed_1774();
        }
        return sprrlbArray2[0];
    }
}


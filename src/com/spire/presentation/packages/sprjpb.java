/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprjpb
extends sprmqb {
    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        int n;
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = arg0.cfr_renamed_1769().cfr_renamed_1770();
        sprrlbArray[1] = arg0;
        sprrlb[] sprrlbArray2 = sprrlbArray;
        int n2 = arg1.bitLength();
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            int n5 = arg1.testBit(n) ? 1 : 0;
            int n6 = n4 = 1 - n5;
            sprrlbArray2[n6] = sprrlbArray2[n6].cfr_renamed_1697(sprrlbArray2[n5]);
            n3 = ++n;
        }
        return sprrlbArray2[0];
    }
}


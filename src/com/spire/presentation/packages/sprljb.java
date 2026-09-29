/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprljb
extends sprmqb {
    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        int n;
        int[] nArray = sprotb.cfr_renamed_1812(arg1);
        sprrlb sprrlb2 = arg0;
        sprrlb sprrlb3 = sprrlb2.cfr_renamed_1769().cfr_renamed_1770();
        sprrlb sprrlb4 = sprrlb2;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < nArray.length) {
            int n4 = nArray[n];
            int n5 = n4 >> 16;
            sprrlb4 = sprrlb4.cfr_renamed_1771(n2 += n4 & 0xFFFF);
            sprrlb3 = sprrlb3.cfr_renamed_1772(n5 < 0 ? sprrlb4.cfr_renamed_1773() : sprrlb4);
            n2 = 1;
            n3 = ++n;
        }
        return sprrlb3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprcmb
extends sprmqb {
    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        int[] nArray = sprotb.cfr_renamed_1812(arg1);
        sprrlb sprrlb2 = arg0;
        sprrlb sprrlb3 = sprrlb2.cfr_renamed_1775();
        sprrlb sprrlb4 = sprrlb3.cfr_renamed_1773();
        sprrlb sprrlb5 = sprrlb2.cfr_renamed_1769().cfr_renamed_1770();
        int n = nArray.length;
        while (--n >= 0) {
            int n2 = nArray[n];
            int n3 = n2 >> 16;
            int n4 = n2 & 0xFFFF;
            sprrlb5 = sprrlb5.cfr_renamed_1697(n3 < 0 ? sprrlb4 : sprrlb3);
            sprrlb5 = sprrlb5.cfr_renamed_1771(n4);
        }
        return sprrlb5;
    }
}


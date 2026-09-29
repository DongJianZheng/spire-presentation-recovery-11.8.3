/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapb;
import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.sprvib;
import java.math.BigInteger;

public class sprelb
extends sprmqb {
    public int cfr_renamed_1943(int arg0) {
        if (arg0 > 257) {
            return 6;
        }
        return 5;
    }

    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        int n;
        sprpib sprpib2 = arg0.cfr_renamed_1769();
        int n2 = sprvib.cfr_renamed_1937(sprpib2);
        if (arg1.bitLength() > n2) {
            throw new IllegalStateException(sprtkc.cfr_renamed_9("=R#^?\u0016+T2U/\u001b8T6Y{_4^(U|O{H.K+T)O{H8Z7Z)H{W:I<^)\u001b/S:U{O3^{X.I-^{T)_>I"));
        }
        int n3 = this.cfr_renamed_1943(n2);
        sprapb sprapb2 = sprvib.cfr_renamed_1939(arg0, n3);
        sprrlb[] sprrlbArray = sprapb2.cfr_renamed_1777();
        int n4 = sprapb2.cfr_renamed_1942();
        int n5 = (n2 + n4 - 1) / n4;
        sprrlb sprrlb2 = sprpib2.cfr_renamed_1770();
        int n6 = n5 * n4 - 1;
        int n7 = n = 0;
        while (n7 < n5) {
            int n8 = 0;
            int n9 = n6 - n;
            while (n9 >= 0) {
                int n10;
                n8 <<= 1;
                if (arg1.testBit(n10)) {
                    n8 |= 1;
                }
                n9 = n10 - n5;
            }
            sprrlb2 = sprrlb2.cfr_renamed_1697(sprrlbArray[n8]);
            n7 = ++n;
        }
        return sprrlb2;
    }
}


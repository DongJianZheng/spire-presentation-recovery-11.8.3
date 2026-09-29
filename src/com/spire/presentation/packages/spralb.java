/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfmb;
import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprxob;
import java.math.BigInteger;

public class spralb
extends sprmqb {
    public int cfr_renamed_1807(int arg0) {
        return sprotb.cfr_renamed_1807(arg0);
    }

    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        sprrlb[] sprrlbArray;
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = Math.max(2, Math.min(16, this.cfr_renamed_1807(arg1.bitLength())));
        sprrlb sprrlb2 = arg0;
        sprxob sprxob2 = sprotb.cfr_renamed_1796(sprrlb2, n5, true);
        sprrlb[] sprrlbArray2 = sprxob2.cfr_renamed_1777();
        sprrlb[] sprrlbArray3 = sprxob2.cfr_renamed_1806();
        int[] nArray = sprotb.cfr_renamed_1811(n5, arg1);
        sprrlb sprrlb3 = sprrlb2.cfr_renamed_1769().cfr_renamed_1770();
        int n6 = nArray.length;
        if (n6 > 1) {
            sprrlb sprrlb4;
            n4 = nArray[--n6];
            n3 = n4 >> 16;
            n2 = n4 & 0xFFFF;
            n = Math.abs(n3);
            sprrlb[] sprrlbArray4 = sprrlbArray = n3 < 0 ? sprrlbArray3 : sprrlbArray2;
            if (n << 2 < 1 << n5) {
                byte by = sprfmb.cfr_renamed_3[n];
                int n7 = n5 - by;
                int n8 = n ^ 1 << by - 1;
                int n9 = (1 << n5 - 1) - 1;
                int n10 = (n8 << n7) + 1;
                sprrlb3 = sprrlbArray[n9 >>> 1].cfr_renamed_1772(sprrlbArray[n10 >>> 1]);
                n2 -= n7;
                sprrlb4 = sprrlb3;
            } else {
                sprrlb4 = sprrlb3 = sprrlbArray[n >>> 1];
            }
            sprrlb3 = sprrlb4.cfr_renamed_1771(n2);
        }
        int n11 = n6;
        while (n11 > 0) {
            n4 = nArray[--n6];
            n3 = n4 >> 16;
            n2 = n4 & 0xFFFF;
            n = Math.abs(n3);
            sprrlbArray = n3 < 0 ? sprrlbArray3 : sprrlbArray2;
            sprrlb sprrlb5 = sprrlbArray[n >>> 1];
            sprrlb3 = sprrlb3.cfr_renamed_1697(sprrlb5);
            sprrlb3 = sprrlb3.cfr_renamed_1771(n2);
            n11 = n6;
        }
        return sprrlb3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtb;
import java.math.BigInteger;

public class sprvib {
    public static final String cfr_renamed_4 = "bc_fixed_point";

    public static int cfr_renamed_1937(sprpib arg0) {
        BigInteger bigInteger = arg0.cfr_renamed_1932();
        if (bigInteger == null) {
            return arg0.cfr_renamed_1938() + 1;
        }
        return bigInteger.bitLength();
    }

    public static sprapb cfr_renamed_1939(sprrlb arg0, int arg1) {
        sprpib sprpib2 = arg0.cfr_renamed_1769();
        int n = 1 << arg1;
        sprapb sprapb2 = sprvib.cfr_renamed_1940(sprpib2.cfr_renamed_1784(arg0, cfr_renamed_4));
        sprrlb[] sprrlbArray = sprapb2.cfr_renamed_1777();
        if (sprrlbArray == null || sprrlbArray.length < n) {
            int n2;
            int n3 = (sprvib.cfr_renamed_1937(sprpib2) + arg1 - 1) / arg1;
            sprrlb[] sprrlbArray2 = new sprrlb[arg1];
            sprrlbArray2[0] = arg0;
            int n4 = n2 = 1;
            while (n4 < arg1) {
                sprrlbArray2[++n2] = sprrlbArray2[n2 - 1].cfr_renamed_1771(n3);
                n4 = n2;
            }
            sprpib2.cfr_renamed_1805(sprrlbArray2);
            sprrlbArray = new sprrlb[n];
            sprrlbArray[0] = sprpib2.cfr_renamed_1770();
            int n5 = n2 = arg1 - 1;
            while (n5 >= 0) {
                int n6;
                int n7;
                sprrlb sprrlb2 = sprrlbArray2[n2];
                int n8 = n7 = (n6 = 1 << n2);
                while (n8 < n) {
                    int n9 = n7;
                    sprrlbArray[n9] = sprrlbArray[n7 - n6].cfr_renamed_1772(sprrlb2);
                    n8 = n9 + (n6 << 1);
                }
                n5 = --n2;
            }
            sprapb sprapb3 = sprapb2;
            sprpib2.cfr_renamed_1805(sprrlbArray);
            sprapb3.cfr_renamed_1801(sprrlbArray);
            sprapb3.cfr_renamed_1941(arg1);
            sprpib2.cfr_renamed_1789(arg0, cfr_renamed_4, sprapb2);
        }
        return sprapb2;
    }

    public static sprapb cfr_renamed_1940(sprtb arg0) {
        if (arg0 != null && arg0 instanceof sprapb) {
            return (sprapb)arg0;
        }
        return new sprapb();
    }
}


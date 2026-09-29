/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprcwh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprpg;
import com.spire.presentation.packages.sprzxh;
import com.spire.presentation.packages.sprzyh;
import java.math.BigInteger;

public abstract class sprqvh {
    public static final String cfr_renamed_4 = "bc_endo";

    private static /* synthetic */ BigInteger cfr_renamed_1951(BigInteger arg0, BigInteger arg1, int arg2) {
        boolean bl = arg1.signum() < 0;
        BigInteger bigInteger = arg0.multiply(arg1.abs());
        boolean bl2 = bigInteger.testBit(arg2 - 1);
        bigInteger = bigInteger.shiftRight(arg2);
        if (bl2) {
            bigInteger = bigInteger.add(sprck.cfr_renamed_4);
        }
        if (bl) {
            return bigInteger.negate();
        }
        return bigInteger;
    }

    public static spreuh cfr_renamed_8898(sprpg arg0, spreuh arg1) {
        return ((sprcwh)arg1.cfr_renamed_1769().cfr_renamed_8628(arg1, cfr_renamed_4, new sprzxh(arg0, arg1))).cfr_renamed_8914();
    }

    public static BigInteger[] cfr_renamed_8913(sprzyh arg0, BigInteger arg1) {
        int n = arg0.cfr_renamed_1949();
        BigInteger bigInteger = arg1;
        BigInteger bigInteger2 = sprqvh.cfr_renamed_1951(bigInteger, arg0.cfr_renamed_1944(), n);
        BigInteger bigInteger3 = sprqvh.cfr_renamed_1951(bigInteger, arg0.cfr_renamed_1946(), n);
        BigInteger bigInteger4 = bigInteger.subtract(bigInteger2.multiply(arg0.cfr_renamed_8910()).add(bigInteger3.multiply(arg0.cfr_renamed_8911())));
        BigInteger bigInteger5 = bigInteger2.multiply(arg0.cfr_renamed_8908()).add(bigInteger3.multiply(arg0.cfr_renamed_8909())).negate();
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger4;
        bigIntegerArray[1] = bigInteger5;
        return bigIntegerArray;
    }
}


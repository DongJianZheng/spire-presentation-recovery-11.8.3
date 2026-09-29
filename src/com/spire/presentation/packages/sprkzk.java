/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprwsk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkzk {
    private static final BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    public static final sprkzk cfr_renamed_4;

    private /* synthetic */ sprkzk() {
    }

    static {
        cfr_renamed_4 = new sprkzk();
        cfr_renamed_2 = BigInteger.valueOf(1L);
        cfr_renamed_3 = BigInteger.valueOf(2L);
    }

    public BigInteger cfr_renamed_10181(sprwsk arg0, SecureRandom arg1) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int n = arg0.cfr_renamed_2331();
        if (n != 0) {
            BigInteger bigInteger3;
            int n2 = n >>> 2;
            while (sprdvh.cfr_renamed_1794(bigInteger3 = sprhdf.cfr_renamed_5230(n, arg1).setBit(n - 1)) < n2) {
            }
            return bigInteger3;
        }
        BigInteger bigInteger4 = cfr_renamed_3;
        int n3 = arg0.cfr_renamed_1186();
        if (n3 != 0) {
            bigInteger4 = cfr_renamed_2.shiftLeft(n3 - 1);
        }
        if ((bigInteger2 = arg0.cfr_renamed_1604()) == null) {
            bigInteger2 = arg0.cfr_renamed_1155();
        }
        BigInteger bigInteger5 = bigInteger2.subtract(cfr_renamed_3);
        int n4 = bigInteger5.bitLength() >>> 2;
        while (sprdvh.cfr_renamed_1794(bigInteger = sprhdf.cfr_renamed_513(bigInteger4, bigInteger5, arg1)) < n4) {
        }
        return bigInteger;
    }

    public BigInteger cfr_renamed_10182(sprwsk arg0, BigInteger arg1) {
        return arg0.cfr_renamed_1145().modPow(arg1, arg0.cfr_renamed_1155());
    }
}


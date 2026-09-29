/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.sprhdf;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprtvk {
    private static final BigInteger cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    static {
        cfr_renamed_4 = BigInteger.valueOf(1L);
        cfr_renamed_3 = BigInteger.valueOf(2L);
    }

    public static BigInteger[] cfr_renamed_3519(int arg0, int arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int n = arg0 - 1;
        int n2 = arg0 >>> 2;
        int n3 = n;
        while (true) {
            if (!(bigInteger2 = (bigInteger = sprhdf.cfr_renamed_5236(n3, 2, arg2)).shiftLeft(1).add(cfr_renamed_4)).isProbablePrime(arg1)) {
                n3 = n;
                continue;
            }
            if (arg1 > 2 && !bigInteger.isProbablePrime(arg1 - 2)) {
                n3 = n;
                continue;
            }
            if (sprdvh.cfr_renamed_1794(bigInteger2) >= n2) break;
            n3 = n;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }

    public static BigInteger cfr_renamed_3520(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0.subtract(cfr_renamed_3);
        while ((bigInteger = sprhdf.cfr_renamed_513(cfr_renamed_3, bigInteger2, arg2).modPow(cfr_renamed_3, arg0)).equals(cfr_renamed_4)) {
        }
        return bigInteger;
    }
}


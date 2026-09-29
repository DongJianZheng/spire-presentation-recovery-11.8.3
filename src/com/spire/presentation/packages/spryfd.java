/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprvpa;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryfd {
    private static final BigInteger cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    public static BigInteger cfr_renamed_3520(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = arg0.subtract(cfr_renamed_3);
        while ((bigInteger = sprvpa.cfr_renamed_513(cfr_renamed_3, bigInteger2, arg2).modPow(cfr_renamed_3, arg0)).equals(cfr_renamed_4)) {
        }
        return bigInteger;
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(1L);
        cfr_renamed_3 = BigInteger.valueOf(2L);
    }

    public static BigInteger[] cfr_renamed_3519(int arg0, int arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int n = arg0 - 1;
        int n2 = arg0 >>> 2;
        while (!(bigInteger2 = (bigInteger = new BigInteger(n, 2, arg2)).shiftLeft(1).add(cfr_renamed_4)).isProbablePrime(arg1) || arg1 > 2 && !bigInteger.isProbablePrime(arg1 - 2) || sprotb.cfr_renamed_1794(bigInteger2) < n2) {
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }
}


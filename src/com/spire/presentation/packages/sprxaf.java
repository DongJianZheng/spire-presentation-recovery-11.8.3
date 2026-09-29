/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public class sprxaf {
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public static sprxaf cfr_renamed_736(BigInteger arg0, BigInteger arg1) {
        BigInteger[] bigIntegerArray;
        BigInteger bigInteger = BigInteger.ZERO;
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger bigInteger4 = BigInteger.ZERO;
        BigInteger bigInteger5 = arg1;
        while (!bigInteger5.equals(BigInteger.ZERO)) {
            BigInteger bigInteger6 = arg0;
            bigIntegerArray = bigInteger6.divideAndRemainder(arg1);
            BigInteger bigInteger7 = bigIntegerArray[0];
            BigInteger bigInteger8 = bigInteger6;
            arg0 = arg1;
            arg1 = bigIntegerArray[1];
            bigInteger8 = bigInteger;
            bigInteger = bigInteger2.subtract(bigInteger7.multiply(bigInteger));
            bigInteger2 = bigInteger8;
            bigInteger8 = bigInteger3;
            bigInteger3 = bigInteger4.subtract(bigInteger7.multiply(bigInteger3));
            bigInteger4 = bigInteger8;
            bigInteger5 = arg1;
        }
        bigIntegerArray = new sprxaf();
        bigIntegerArray.cfr_renamed_3 = bigInteger2;
        bigIntegerArray.cfr_renamed_4 = bigInteger4;
        bigIntegerArray.cfr_renamed_2 = arg0;
        return bigIntegerArray;
    }

    private /* synthetic */ sprxaf() {
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public class sprfma {
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public static sprfma cfr_renamed_736(BigInteger arg0, BigInteger arg1) {
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
        bigIntegerArray = new sprfma();
        bigIntegerArray.cfr_renamed_2 = bigInteger2;
        bigIntegerArray.cfr_renamed_3 = bigInteger4;
        bigIntegerArray.cfr_renamed_4 = arg0;
        return bigIntegerArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ sprfma() {
    }
}


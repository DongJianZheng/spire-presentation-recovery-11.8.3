/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprzid {
    private static final BigInteger cfr_renamed_2;
    public static final sprzid cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_3521(sprzmd arg0, SecureRandom arg1) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int n = arg0.cfr_renamed_2331();
        if (n != 0) {
            BigInteger bigInteger3;
            int n2 = n >>> 2;
            while (sprotb.cfr_renamed_1794(bigInteger3 = new BigInteger(n, arg1).setBit(n - 1)) < n2) {
            }
            return bigInteger3;
        }
        BigInteger bigInteger4 = cfr_renamed_2;
        int n3 = arg0.cfr_renamed_1186();
        if (n3 != 0) {
            bigInteger4 = cfr_renamed_4.shiftLeft(n3 - 1);
        }
        if ((bigInteger2 = arg0.cfr_renamed_1604()) == null) {
            bigInteger2 = arg0.cfr_renamed_1155();
        }
        BigInteger bigInteger5 = bigInteger2.subtract(cfr_renamed_2);
        int n4 = bigInteger5.bitLength() >>> 2;
        while (sprotb.cfr_renamed_1794(bigInteger = sprvpa.cfr_renamed_513(bigInteger4, bigInteger5, arg1)) < n4) {
        }
        return bigInteger;
    }

    private /* synthetic */ sprzid() {
    }

    static {
        cfr_renamed_3 = new sprzid();
        cfr_renamed_4 = BigInteger.valueOf(1L);
        cfr_renamed_2 = BigInteger.valueOf(2L);
    }

    public BigInteger cfr_renamed_3522(sprzmd arg0, BigInteger arg1) {
        return arg0.cfr_renamed_1145().modPow(arg1, arg0.cfr_renamed_1155());
    }
}


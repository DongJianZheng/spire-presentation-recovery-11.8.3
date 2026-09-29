/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpb;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprbhd {
    public static BigInteger cfr_renamed_3743(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger;
        int n = arg0.bitLength();
        while ((bigInteger = new BigInteger(n, arg1)).equals(sprpb.cfr_renamed_1) || bigInteger.compareTo(arg0) >= 0) {
        }
        return bigInteger;
    }
}


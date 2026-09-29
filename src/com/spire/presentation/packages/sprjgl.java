/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprhdf;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprjgl {
    public static BigInteger cfr_renamed_3743(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger;
        int n = arg0.bitLength();
        while ((bigInteger = sprhdf.cfr_renamed_5230(n, arg1)).equals(sprck.cfr_renamed_0) || bigInteger.compareTo(arg0) >= 0) {
        }
        return bigInteger;
    }
}


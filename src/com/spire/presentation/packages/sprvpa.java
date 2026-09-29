/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprsdn;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class sprvpa {
    private static final int cfr_renamed_3 = 1000;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(0L);

    public static BigInteger cfr_renamed_511(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = arg0;
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        }
        return new BigInteger(1, byArray);
    }

    public static byte[] cfr_renamed_512(int arg0, BigInteger arg1) {
        byte[] byArray = arg1.toByteArray();
        if (byArray.length == arg0) {
            return byArray;
        }
        int n = byArray[0] == 0 ? 1 : 0;
        int n2 = byArray.length - n;
        if (n2 > arg0) {
            throw new IllegalArgumentException(sprsdn.cfr_renamed_9("\u0004[\u0016A\u0013N\u0005KWC\u0012A\u0010[\u001f\u000f\u0012W\u0014J\u0012K\u0012KWI\u0018]WY\u0016C\u0002J"));
        }
        byte[] byArray2 = new byte[arg0];
        System.arraycopy(byArray, n, byArray2, byArray2.length - n2, n2);
        return byArray2;
    }

    public static BigInteger cfr_renamed_513(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        int n;
        int n2 = arg0.compareTo(arg1);
        if (n2 >= 0) {
            if (n2 > 0) {
                throw new IllegalArgumentException(sprnnp.cfr_renamed_9("o3!0o~%?1~&1<~*;h9:;)*-,h* ?&~o3)&o"));
            }
            return arg0;
        }
        if (arg0.bitLength() > arg1.bitLength() / 2) {
            return sprvpa.cfr_renamed_513(cfr_renamed_4, arg1.subtract(arg0), arg2).add(arg0);
        }
        int n3 = n = 0;
        while (n3 < 1000) {
            BigInteger bigInteger = new BigInteger(arg1.bitLength(), arg2);
            if (bigInteger.compareTo(arg0) >= 0 && bigInteger.compareTo(arg1) <= 0) {
                return bigInteger;
            }
            n3 = ++n;
        }
        return new BigInteger(arg1.subtract(arg0).bitLength() - 1, arg2).add(arg0);
    }

    public static byte[] cfr_renamed_514(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (byArray[0] == 0) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return byArray;
    }

    public static BigInteger cfr_renamed_515(byte[] arg0) {
        return new BigInteger(1, arg0);
    }
}


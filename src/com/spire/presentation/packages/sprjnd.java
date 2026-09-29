/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprspq;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprvpa;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprjnd {
    private static BigInteger cfr_renamed_3 = BigInteger.valueOf(0L);
    private static BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ BigInteger cfr_renamed_3887(sprlc sprlc2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        sprlc arg0;
        void arg4;
        void arg3;
        void arg1;
        int n = (arg1.bitLength() + 7) / 8;
        byte[] byArray = sprjnd.cfr_renamed_3888(bigInteger2, n);
        byte[] byArray2 = sprjnd.cfr_renamed_3888((BigInteger)arg3, n);
        byte[] byArray3 = sprjnd.cfr_renamed_3888((BigInteger)arg4, n);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        arg0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        arg0.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprlc sprlc3 = arg0;
        byte[] byArray4 = new byte[sprlc3.cfr_renamed_1218()];
        sprlc3.cfr_renamed_1219(byArray4, 0);
        return new BigInteger(1, byArray4);
    }

    private static /* synthetic */ byte[] cfr_renamed_3888(BigInteger arg0, int arg1) {
        byte[] byArray = sprvpa.cfr_renamed_514(arg0);
        if (byArray.length < arg1) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray2, arg1 - byArray.length, byArray.length);
            byArray = byArray2;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public static BigInteger cfr_renamed_3889(sprlc sprlc2, BigInteger bigInteger, BigInteger bigInteger2) {
        sprlc arg0;
        void arg1;
        byte[] byArray = sprjnd.cfr_renamed_3888(bigInteger2, (arg1.bitLength() + 7) / 8);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprlc sprlc3 = arg0;
        byte[] byArray2 = new byte[sprlc3.cfr_renamed_1218()];
        sprlc3.cfr_renamed_1219(byArray2, 0);
        return new BigInteger(1, byArray2);
    }

    public static BigInteger cfr_renamed_2792(BigInteger arg0, BigInteger arg1) throws sprvmd {
        if ((arg1 = arg1.mod(arg0)).equals(cfr_renamed_3)) {
            throw new sprvmd(sprspq.cfr_renamed_9("f\u0015Y\u001aC\u0012K[_\u000eM\u0017F\u0018\u000f\rN\u0017Z\u001e\u0015[\u001f"));
        }
        return arg1;
    }

    public static BigInteger cfr_renamed_3890(sprlc arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4) {
        return sprjnd.cfr_renamed_3887(arg0, arg1, arg2, arg3, arg4);
    }

    public static BigInteger cfr_renamed_3891(sprlc arg0, BigInteger arg1, BigInteger arg2) {
        BigInteger bigInteger = arg1;
        return sprjnd.cfr_renamed_3892(arg0, bigInteger, bigInteger, arg2);
    }

    public static BigInteger cfr_renamed_3893(sprlc arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        return sprjnd.cfr_renamed_3892(arg0, arg1, arg2, arg3);
    }

    public static BigInteger cfr_renamed_3894(sprlc arg0, BigInteger arg1, BigInteger arg2, SecureRandom arg3) {
        int n = Math.min(256, arg1.bitLength() / 2);
        BigInteger bigInteger = cfr_renamed_4.shiftLeft(n - 1);
        BigInteger bigInteger2 = arg1.subtract(cfr_renamed_4);
        return sprvpa.cfr_renamed_513(bigInteger, bigInteger2, arg3);
    }

    public static BigInteger cfr_renamed_3895(sprlc arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4) {
        return sprjnd.cfr_renamed_3887(arg0, arg1, arg2, arg3, arg4);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ BigInteger cfr_renamed_3892(sprlc sprlc2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        sprlc arg0;
        void arg3;
        void arg1;
        int n = (arg1.bitLength() + 7) / 8;
        byte[] byArray = sprjnd.cfr_renamed_3888(bigInteger2, n);
        byte[] byArray2 = sprjnd.cfr_renamed_3888((BigInteger)arg3, n);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        arg0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprlc sprlc3 = arg0;
        byte[] byArray3 = new byte[sprlc3.cfr_renamed_1218()];
        sprlc3.cfr_renamed_1219(byArray3, 0);
        return new BigInteger(1, byArray3);
    }

    public static BigInteger cfr_renamed_3886(sprlc arg0, BigInteger arg1, byte[] arg2, byte[] arg3, byte[] arg4) {
        sprlc sprlc2 = arg0;
        byte[] byArray = new byte[sprlc2.cfr_renamed_1218()];
        sprlc2.cfr_renamed_1197(arg3, 0, arg3.length);
        sprlc sprlc3 = arg0;
        sprlc3.cfr_renamed_1221((byte)58);
        sprlc3.cfr_renamed_1197(arg4, 0, arg4.length);
        sprlc sprlc4 = arg0;
        sprlc4.cfr_renamed_1219(byArray, 0);
        sprlc4.cfr_renamed_1197(arg2, 0, arg2.length);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        arg0.cfr_renamed_1219(byArray, 0);
        return new BigInteger(1, byArray);
    }
}


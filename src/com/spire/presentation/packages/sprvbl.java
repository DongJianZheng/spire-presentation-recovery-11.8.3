/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprmml;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprvbl {
    private static BigInteger cfr_renamed_3;
    private static BigInteger cfr_renamed_4;

    public static BigInteger cfr_renamed_10592(sprgf arg0, BigInteger arg1, byte[] arg2, byte[] arg3, byte[] arg4) {
        sprgf sprgf2 = arg0;
        byte[] byArray = new byte[sprgf2.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1197(arg3, 0, arg3.length);
        sprgf sprgf3 = arg0;
        sprgf3.cfr_renamed_1221((byte)58);
        sprgf3.cfr_renamed_1197(arg4, 0, arg4.length);
        sprgf sprgf4 = arg0;
        sprgf4.cfr_renamed_1219(byArray, 0);
        sprgf4.cfr_renamed_1197(arg2, 0, arg2.length);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        arg0.cfr_renamed_1219(byArray, 0);
        return new BigInteger(1, byArray);
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(0L);
        cfr_renamed_3 = BigInteger.valueOf(1L);
    }

    public static BigInteger cfr_renamed_10595(sprgf arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        return sprvbl.cfr_renamed_10596(arg0, arg1, arg2, arg3);
    }

    public static BigInteger cfr_renamed_10597(sprgf arg0, BigInteger arg1, BigInteger arg2, SecureRandom arg3) {
        int n = Math.min(256, arg1.bitLength() / 2);
        BigInteger bigInteger = cfr_renamed_3.shiftLeft(n - 1);
        BigInteger bigInteger2 = arg1.subtract(cfr_renamed_3);
        return sprhdf.cfr_renamed_513(bigInteger, bigInteger2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public static BigInteger cfr_renamed_10598(sprgf sprgf2, BigInteger bigInteger, BigInteger bigInteger2) {
        sprgf arg0;
        void arg1;
        byte[] byArray = sprvbl.cfr_renamed_3888(bigInteger2, (arg1.bitLength() + 7) / 8);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprgf sprgf3 = arg0;
        byte[] byArray2 = new byte[sprgf3.cfr_renamed_1218()];
        sprgf3.cfr_renamed_1219(byArray2, 0);
        return new BigInteger(1, byArray2);
    }

    public static BigInteger cfr_renamed_10599(sprgf arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4) {
        return sprvbl.cfr_renamed_10600(arg0, arg1, arg2, arg3, arg4);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ BigInteger cfr_renamed_10596(sprgf sprgf2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        sprgf arg0;
        void arg3;
        void arg1;
        int n = (arg1.bitLength() + 7) / 8;
        byte[] byArray = sprvbl.cfr_renamed_3888(bigInteger2, n);
        byte[] byArray2 = sprvbl.cfr_renamed_3888((BigInteger)arg3, n);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        arg0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprgf sprgf3 = arg0;
        byte[] byArray3 = new byte[sprgf3.cfr_renamed_1218()];
        sprgf3.cfr_renamed_1219(byArray3, 0);
        return new BigInteger(1, byArray3);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ BigInteger cfr_renamed_10600(sprgf sprgf2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        sprgf arg0;
        void arg4;
        void arg3;
        void arg1;
        int n = (arg1.bitLength() + 7) / 8;
        byte[] byArray = sprvbl.cfr_renamed_3888(bigInteger2, n);
        byte[] byArray2 = sprvbl.cfr_renamed_3888((BigInteger)arg3, n);
        byte[] byArray3 = sprvbl.cfr_renamed_3888((BigInteger)arg4, n);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        arg0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        arg0.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprgf sprgf3 = arg0;
        byte[] byArray4 = new byte[sprgf3.cfr_renamed_1218()];
        sprgf3.cfr_renamed_1219(byArray4, 0);
        return new BigInteger(1, byArray4);
    }

    public static BigInteger cfr_renamed_10601(sprgf arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4) {
        return sprvbl.cfr_renamed_10600(arg0, arg1, arg2, arg3, arg4);
    }

    public static BigInteger cfr_renamed_2792(BigInteger arg0, BigInteger arg1) throws sprmml {
        if ((arg1 = arg1.mod(arg0)).equals(cfr_renamed_4)) {
            throw new sprmml(DataColumn.cfr_renamed_9(";\u001f\u0004\u0010\u001e\u0018\u0016Q\u0002\u0004\u0010\u001d\u001b\u0012R\u0007\u0013\u001d\u0007\u0014HQB"));
        }
        return arg1;
    }

    public static BigInteger cfr_renamed_10602(sprgf arg0, BigInteger arg1, BigInteger arg2) {
        BigInteger bigInteger = arg1;
        return sprvbl.cfr_renamed_10596(arg0, bigInteger, bigInteger, arg2);
    }

    private static /* synthetic */ byte[] cfr_renamed_3888(BigInteger arg0, int arg1) {
        byte[] byArray = sprhdf.cfr_renamed_514(arg0);
        if (byArray.length < arg1) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray2, arg1 - byArray.length, byArray.length);
            byArray = byArray2;
        }
        return byArray;
    }
}


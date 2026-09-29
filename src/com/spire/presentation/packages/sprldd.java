/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebb;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprrzp;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtn;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprxed;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprldd
implements sprtn {
    private sprib cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private sprmtc cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    @Override
    public sprt cfr_renamed_3485(byte[] arg0, int arg1, int arg2) throws IllegalArgumentException {
        if (this.cfr_renamed_2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprebb.cfr_renamed_9("\f\u0001>\u00185\u0017|\u001f9\r|\u00069\u0005)\u001d.\u00118T:\u001b.T9\u001a?\u0006%\u0004(\u001d3\u001a"));
        }
        sprldd sprldd2 = this;
        BigInteger bigInteger = sprldd2.cfr_renamed_2.cfr_renamed_2295();
        BigInteger bigInteger2 = sprldd2.cfr_renamed_2.cfr_renamed_360();
        BigInteger bigInteger3 = sprvpa.cfr_renamed_513(cfr_renamed_4, bigInteger.subtract(cfr_renamed_1), this.cfr_renamed_3);
        BigInteger bigInteger4 = bigInteger3.modPow(bigInteger2, bigInteger);
        byte[] byArray = sprvpa.cfr_renamed_512((bigInteger.bitLength() + 7) / 8, bigInteger4);
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        return this.cfr_renamed_3486(bigInteger, bigInteger3, arg2);
    }

    @Override
    public sprt cfr_renamed_1456(byte[] arg0, int arg1, int arg2, int arg3) throws IllegalArgumentException {
        if (!this.cfr_renamed_2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprrzp.cfr_renamed_9("dW]SUQQ\u0005_@M\u0005F@EP]WQA\u0014C[W\u0014AQFF\\DQ]JZ"));
        }
        sprldd sprldd2 = this;
        BigInteger bigInteger = sprldd2.cfr_renamed_2.cfr_renamed_2295();
        BigInteger bigInteger2 = sprldd2.cfr_renamed_2.cfr_renamed_360();
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, byArray.length);
        BigInteger bigInteger3 = new BigInteger(1, byArray).modPow(bigInteger2, bigInteger);
        return this.cfr_renamed_3486(bigInteger, bigInteger3, arg3);
    }

    public sprt cfr_renamed_3487(byte[] arg0, int arg1) {
        return this.cfr_renamed_3485(arg0, 0, arg1);
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprmtc)) {
            throw new IllegalArgumentException(sprebb.cfr_renamed_9("\u000e'\u001dT7\u0011%T.\u0011-\u00015\u00069\u0010"));
        }
        this.cfr_renamed_2 = (sprmtc)arg0;
    }

    public sprnld cfr_renamed_3486(BigInteger arg0, BigInteger arg1, int arg2) {
        byte[] byArray = sprvpa.cfr_renamed_512((arg0.bitLength() + 7) / 8, arg1);
        sprldd sprldd2 = this;
        sprldd2.cfr_renamed_0.cfr_renamed_2342(new sprxed(byArray, null));
        byte[] byArray2 = new byte[arg2];
        sprldd2.cfr_renamed_0.cfr_renamed_2341(byArray2, 0, byArray2.length);
        return new sprnld(byArray2);
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(0L);
        cfr_renamed_1 = BigInteger.valueOf(1L);
    }

    public sprt cfr_renamed_3488(byte[] arg0, int arg1) {
        return this.cfr_renamed_1456(arg0, 0, arg0.length, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprldd(sprib sprib2, SecureRandom secureRandom) {
        void arg0;
        sprldd sprldd2 = this;
        sprldd2.cfr_renamed_0 = arg0;
        sprldd2.cfr_renamed_3 = secureRandom;
    }
}


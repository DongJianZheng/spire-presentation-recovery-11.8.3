/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpoy;
import com.spire.presentation.packages.sprys;
import java.math.BigInteger;

public class sprwmk
implements sprys {
    public static final sprwmk cfr_renamed_4 = new sprwmk();

    @Override
    public byte[] cfr_renamed_9388(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        int n = sprhdf.cfr_renamed_5229(arg0);
        byte[] byArray = new byte[n * 2];
        sprwmk sprwmk2 = this;
        sprwmk2.cfr_renamed_9932(arg0, arg1, byArray, 0, n);
        int n2 = n;
        sprwmk2.cfr_renamed_9932(arg0, arg2, byArray, n2, n2);
        return byArray;
    }

    public BigInteger cfr_renamed_9933(BigInteger arg0, byte[] arg1, int arg2, int arg3) {
        int n = arg2;
        byte[] byArray = sproze.cfr_renamed_533(arg1, n, n + arg3);
        return this.cfr_renamed_9921(arg0, new BigInteger(1, byArray));
    }

    public BigInteger cfr_renamed_9921(BigInteger arg0, BigInteger arg1) {
        if (arg1.signum() < 0 || arg1.compareTo(arg0) >= 0) {
            throw new IllegalArgumentException(sprhsh.cfr_renamed_9("\u00172-&$s.&5s.5a! =&6"));
        }
        return arg1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public BigInteger[] cfr_renamed_9387(BigInteger bigInteger, byte[] byArray) {
        void arg1;
        void arg0;
        int n = sprhdf.cfr_renamed_5229((BigInteger)arg0);
        if (byArray.length != n * 2) {
            throw new IllegalArgumentException(sprpoy.cfr_renamed_9("W\u007fq~vx|v2ysb2x|r}c`tqe2}w\u007fuez"));
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = this.cfr_renamed_9933((BigInteger)arg0, (byte[])arg1, 0, n);
        int n2 = n;
        bigIntegerArray[1] = this.cfr_renamed_9933((BigInteger)arg0, (byte[])arg1, n2, n2);
        return bigIntegerArray;
    }

    private /* synthetic */ void cfr_renamed_9932(BigInteger arg0, BigInteger arg1, byte[] arg2, int arg3, int arg4) {
        byte[] byArray = this.cfr_renamed_9921(arg0, arg1).toByteArray();
        int n = Math.max(0, byArray.length - arg4);
        int n2 = byArray.length - n;
        int n3 = arg4 - n2;
        int n4 = arg3;
        sproze.cfr_renamed_5214(arg2, n4, n4 + n3, (byte)0);
        System.arraycopy(byArray, n, arg2, arg3 + n3, n2);
    }
}


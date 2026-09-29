/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprsrp;
import java.math.BigInteger;

public class sprpfd {
    public BigInteger cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer2.append(sprsrp.cfr_renamed_9("#\u001dl\f") + this.cfr_renamed_2.toString());
        stringBuffer.append(new StringBuilder().insert(0, sprqxe.cfr_renamed_9("a:YuK")).append(this.cfr_renamed_4.toString()).toString());
        stringBuffer.append(new StringBuilder().insert(0, sprsrp.cfr_renamed_9("\\Il\f")).append(this.cfr_renamed_1.toString()).toString());
        stringBuffer.append(new StringBuilder().insert(0, sprqxe.cfr_renamed_9("E\u001duK")).append(this.cfr_renamed_3.toString()).toString());
        return stringBuffer2.toString();
    }

    public sprpfd() {
    }

    public sprpfd(byte[] arg0) {
        sprpfd sprpfd2 = this;
        sprpfd sprpfd3 = this;
        int n = 0;
        byte[] byArray = new byte[4];
        System.arraycopy(arg0, n, byArray, 0, 4);
        int n2 = sprpfd3.cfr_renamed_3691(byArray);
        byte[] byArray2 = new byte[n2];
        int n3 = n += 4;
        System.arraycopy(arg0, n3, byArray2, 0, n2);
        n = n3 + n2;
        sprpfd2.cfr_renamed_2 = new BigInteger(byArray2);
        System.arraycopy(arg0, n, byArray, 0, 4);
        n2 = this.cfr_renamed_3691(byArray);
        byArray2 = new byte[n2];
        int n4 = n += 4;
        System.arraycopy(arg0, n4, byArray2, 0, n2);
        n = n4 + n2;
        sprpfd2.cfr_renamed_4 = new BigInteger(byArray2);
        System.arraycopy(arg0, n, byArray, 0, 4);
        n2 = sprpfd2.cfr_renamed_3691(byArray);
        byArray2 = new byte[n2];
        int n5 = n += 4;
        System.arraycopy(arg0, n5, byArray2, 0, n2);
        n = n5 + n2;
        sprpfd2.cfr_renamed_1 = new BigInteger(byArray2);
        System.arraycopy(arg0, n, byArray, 0, 4);
        n2 = sprpfd2.cfr_renamed_3691(byArray);
        byArray2 = new byte[n2];
        int n6 = n += 4;
        System.arraycopy(arg0, n6, byArray2, 0, n2);
        n = n6 + n2;
        sprpfd2.cfr_renamed_3 = new BigInteger(byArray2);
    }

    public void cfr_renamed_3692(BigInteger arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_3693(BigInteger arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public BigInteger cfr_renamed_3694() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprpfd(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        void arg2;
        void arg1;
        void arg0;
        sprpfd sprpfd2 = this;
        sprpfd sprpfd3 = this;
        sprpfd3.cfr_renamed_2 = arg0;
        sprpfd3.cfr_renamed_4 = arg1;
        sprpfd2.cfr_renamed_1 = arg2;
        sprpfd2.cfr_renamed_3 = bigInteger4;
    }

    public void cfr_renamed_3695(BigInteger arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ byte[] cfr_renamed_3696(int arg0) {
        int n;
        byte[] byArray = new byte[4];
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = 3 - n;
            byte by = (byte)(arg0 >>> n * 8);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    public byte[] cfr_renamed_954() {
        byte[] byArray = this.cfr_renamed_2.toByteArray();
        int n = byArray.length;
        byte[] byArray2 = this.cfr_renamed_4.toByteArray();
        int n2 = byArray2.length;
        byte[] byArray3 = this.cfr_renamed_1.toByteArray();
        int n3 = byArray3.length;
        byte[] byArray4 = this.cfr_renamed_3.toByteArray();
        int n4 = byArray4.length;
        int n5 = 0;
        byte[] byArray5 = new byte[n + n2 + n3 + n4 + 16];
        sprpfd sprpfd2 = this;
        sprpfd sprpfd3 = this;
        System.arraycopy(sprpfd3.cfr_renamed_3696(n), 0, byArray5, 0, 4);
        System.arraycopy(byArray, 0, byArray5, n5 += 4, n);
        System.arraycopy(sprpfd3.cfr_renamed_3696(n2), 0, byArray5, n5 += n, 4);
        System.arraycopy(byArray2, 0, byArray5, n5 += 4, n2);
        System.arraycopy(sprpfd2.cfr_renamed_3696(n3), 0, byArray5, n5 += n2, 4);
        System.arraycopy(byArray3, 0, byArray5, n5 += 4, n3);
        System.arraycopy(sprpfd2.cfr_renamed_3696(n4), 0, byArray5, n5 += n3, 4);
        System.arraycopy(byArray4, 0, byArray5, n5 += 4, n4);
        return byArray5;
    }

    public void cfr_renamed_3697(BigInteger arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public BigInteger cfr_renamed_3686() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_3688() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_3687() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ int cfr_renamed_3691(byte[] arg0) {
        int n;
        if (arg0.length != 4) {
            return -1;
        }
        int n2 = 0;
        int n3 = n = 3;
        while (n3 >= 0) {
            byte by = arg0[n];
            int n4 = (3 - n) * 8;
            n2 += by << n4;
            n3 = --n;
        }
        return n2;
    }
}


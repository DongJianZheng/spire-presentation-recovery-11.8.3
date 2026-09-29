/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvro;
import java.math.BigInteger;

public class sprall {
    public BigInteger cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_3694() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_3687() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_3686() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_3688() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_3693(BigInteger arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprall(byte[] arg0) {
        int n;
        sprall sprall2 = this;
        int n2 = n = 0;
        int n3 = sprpxe.cfr_renamed_446(arg0, n2);
        int n4 = n += 4;
        byte[] byArray = sproze.cfr_renamed_533(arg0, n4, n4 + n3);
        sprall sprall3 = this;
        sprall2.cfr_renamed_4 = new BigInteger(byArray);
        n3 = sprpxe.cfr_renamed_446(arg0, n += n3);
        int n5 = n += 4;
        byArray = sproze.cfr_renamed_533(arg0, n5, n5 + n3);
        sprall3.cfr_renamed_3 = new BigInteger(byArray);
        n3 = sprpxe.cfr_renamed_446(arg0, n += n3);
        int n6 = n += 4;
        byArray = sproze.cfr_renamed_533(arg0, n6, n6 + n3);
        sprall2.cfr_renamed_1 = new BigInteger(byArray);
        n3 = sprpxe.cfr_renamed_446(arg0, n += n3);
        int n7 = n += 4;
        byArray = sproze.cfr_renamed_533(arg0, n7, n7 + n3);
        n += n3;
        sprall2.cfr_renamed_2 = new BigInteger(byArray);
    }

    public byte[] cfr_renamed_954() {
        byte[] byArray = this.cfr_renamed_4.toByteArray();
        int n = byArray.length;
        byte[] byArray2 = this.cfr_renamed_3.toByteArray();
        int n2 = byArray2.length;
        byte[] byArray3 = this.cfr_renamed_1.toByteArray();
        int n3 = byArray3.length;
        byte[] byArray4 = this.cfr_renamed_2.toByteArray();
        int n4 = byArray4.length;
        int n5 = 0;
        byte[] byArray5 = new byte[n + n2 + n3 + n4 + 16];
        sprpxe.cfr_renamed_442(n, byArray5, n5);
        System.arraycopy(byArray, 0, byArray5, n5 += 4, n);
        sprpxe.cfr_renamed_442(n2, byArray5, n5 += n);
        System.arraycopy(byArray2, 0, byArray5, n5 += 4, n2);
        sprpxe.cfr_renamed_442(n3, byArray5, n5 += n2);
        System.arraycopy(byArray3, 0, byArray5, n5 += 4, n3);
        sprpxe.cfr_renamed_442(n4, byArray5, n5 += n3);
        System.arraycopy(byArray4, 0, byArray5, n5 += 4, n4);
        n5 += n4;
        return byArray5;
    }

    /*
     * WARNING - void declaration
     */
    public sprall(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        void arg2;
        void arg1;
        void arg0;
        sprall sprall2 = this;
        sprall sprall3 = this;
        sprall3.cfr_renamed_4 = arg0;
        sprall3.cfr_renamed_3 = arg1;
        sprall2.cfr_renamed_1 = arg2;
        sprall2.cfr_renamed_2 = bigInteger4;
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer2.append(sprvro.cfr_renamed_9("7|xm") + this.cfr_renamed_4.toString());
        stringBuffer.append(new StringBuilder().insert(0, sprnsc.cfr_renamed_9("o)WfE")).append(this.cfr_renamed_3.toString()).toString());
        stringBuffer.append(new StringBuilder().insert(0, sprvro.cfr_renamed_9("H(xm")).append(this.cfr_renamed_1.toString()).toString());
        stringBuffer.append(new StringBuilder().insert(0, sprnsc.cfr_renamed_9("V\u0013fE")).append(this.cfr_renamed_2.toString()).toString());
        return stringBuffer2.toString();
    }

    public void cfr_renamed_3695(BigInteger arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_3697(BigInteger arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprall() {
    }

    public void cfr_renamed_3692(BigInteger arg0) {
        this.cfr_renamed_1 = arg0;
    }
}


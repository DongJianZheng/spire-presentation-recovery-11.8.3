/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfxd;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprnml;
import com.spire.presentation.packages.sproze;

public class sprscf {
    private static char[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprscf(byte[] byArray, boolean bl) {
        void arg0;
        if (bl) {
            this.cfr_renamed_4 = sprscf.cfr_renamed_5207((byte[])arg0);
            return;
        }
        this.cfr_renamed_4 = sprscf.cfr_renamed_5208((byte[])arg0);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprscf) {
            return sproze.cfr_renamed_92(((sprscf)arg0).cfr_renamed_4, this.cfr_renamed_4);
        }
        return false;
    }

    static {
        char[] cArray = new char[16];
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 56;
        cArray[9] = 57;
        cArray[10] = 97;
        cArray[11] = 98;
        cArray[12] = 99;
        cArray[13] = 100;
        cArray[14] = 101;
        cArray[15] = 102;
        cfr_renamed_3 = cArray;
    }

    public sprscf(byte[] arg0) {
        this(arg0, 160);
    }

    public static byte[] cfr_renamed_5207(byte[] arg0) {
        sprnml sprnml2 = new sprnml(160);
        sprnml2.cfr_renamed_1197(arg0, 0, arg0.length);
        sprnml sprnml3 = sprnml2;
        byte[] byArray = new byte[sprnml3.cfr_renamed_1218()];
        sprnml3.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_5209() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public static byte[] cfr_renamed_5208(byte[] arg0) {
        return sprscf.cfr_renamed_5210(arg0, 160);
    }

    /*
     * WARNING - void declaration
     */
    public sprscf(byte[] byArray, int n) {
        void arg1;
        this.cfr_renamed_4 = sprscf.cfr_renamed_5210(byArray, (int)arg1);
    }

    public static byte[] cfr_renamed_5210(byte[] arg0, int arg1) {
        if (arg1 % 8 != 0) {
            throw new IllegalArgumentException(sprfxd.cfr_renamed_9("{^m{|Y~Cq\u0017tBjC9U|\u0017x\u0017tBuCpGuR9X\u007f\u0017!"));
        }
        sprnil sprnil2 = new sprnil(256);
        sprnil2.cfr_renamed_1197(arg0, 0, arg0.length);
        byte[] byArray = new byte[arg1 / 8];
        sprnil2.cfr_renamed_1199(byArray, 0, arg1 / 8);
        return byArray;
    }

    public String toString() {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (n > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(cfr_renamed_3[this.cfr_renamed_4[n] >>> 4 & 0xF]);
            int n3 = this.cfr_renamed_4[n] & 0xF;
            stringBuffer.append(cfr_renamed_3[n3]);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }
}


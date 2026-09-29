/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprpcba;
import com.spire.presentation.packages.sprqhca;
import com.spire.presentation.packages.sprt;

public class sprifb {
    private final sprc cfr_renamed_2;
    private final sprlc cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprifb(sprc sprc2, sprlc sprlc2) {
        void arg0;
        sprifb sprifb2 = this;
        sprifb2.cfr_renamed_2 = arg0;
        sprifb2.cfr_renamed_3 = sprlc2;
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprpcba.cfr_renamed_9("O,i0s2~+d%*\u0010o3\u007f+x'ybZ7h.c!*\to;$"));
        }
        if (arg0 == false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprqhca.cfr_renamed_9("@ g7}5p,j\"$\u0017a4q,v weT7m3e1aeO }k"));
        }
        sprifb sprifb2 = this;
        sprifb2.cfr_renamed_41();
        sprifb2.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1237() {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprpcba.cfr_renamed_9("\u000fi\u0007f+o!o\te k0k\u000bg#c\u0006c%o1~\u0001c2b'xbd-~bc,c6c#f+y'nbl-xbo,i0s2~+d%$"));
        }
        sprifb sprifb2 = this;
        byte[] byArray = new byte[sprifb2.cfr_renamed_3.cfr_renamed_1218()];
        sprifb2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = null;
        try {
            return this.cfr_renamed_2.cfr_renamed_136(byArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray2;
        }
    }

    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1214(byte[] arg0) {
        byte[] byArray = null;
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprqhca.cfr_renamed_9("I&A)m g O*f$v$M(e,@,c w1G,t-a7$+k1$,j,p,e)m6a!$#k7$!a&v<t1m+ck"));
        }
        try {
            return this.cfr_renamed_2.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }
}


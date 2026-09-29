/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjcs;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprzmq;

public class sprrab {
    private boolean cfr_renamed_2;
    private final sprc cfr_renamed_3;
    private final sprlc cfr_renamed_4;

    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1237() {
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprzmq.cfr_renamed_9("k.c!O(E(v\u0006e\u001eb$A(U9e$V%C?\u0006#I9\u0006$H$R$G!O>C)\u0006+I?\u0006(H.T4V9O#Ac"));
        }
        sprrab sprrab2 = this;
        byte[] byArray = new byte[sprrab2.cfr_renamed_4.cfr_renamed_1218()];
        sprrab2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = null;
        try {
            return this.cfr_renamed_3.cfr_renamed_136(byArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprjcs.cfr_renamed_9("1a\u0017}\r\u007f\u0000f\u001ahT]\u0011~\u0001f\u0006j\u0007/$z\u0016c\u001dlTD\u0011vZ"));
        }
        if (arg0 == false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprzmq.cfr_renamed_9("b(E?_=R$H*\u0006\u001fC<S$T(Umv?O;G9Cmm(_c"));
        }
        sprrab sprrab2 = this;
        sprrab2.cfr_renamed_41();
        sprrab2.cfr_renamed_3.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1214(byte[] arg0) {
        byte[] byArray = null;
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprjcs.cfr_renamed_9("B\u0017J\u0018f\u0011l\u0011_?L'K\u001dh\u0011|\u0000L\u001d\u007f\u001cj\u0006/\u001a`\u0000/\u001da\u001d{\u001dn\u0018f\u0007j\u0010/\u0012`\u0006/\u0010j\u0017}\r\u007f\u0000f\u001ahZ"));
        }
        try {
            return this.cfr_renamed_3.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrab(sprc sprc2, sprlc sprlc2) {
        void arg0;
        sprrab sprrab2 = this;
        sprrab2.cfr_renamed_3 = arg0;
        sprrab2.cfr_renamed_4 = sprlc2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnzja;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzcf;

public class sprvlm
extends sprqqe {
    private sprktm cfr_renamed_3;
    private sprndm[] cfr_renamed_4;

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_5023();
    }

    private /* synthetic */ sprndm[] cfr_renamed_11224(sprndm[] arg0) {
        int n;
        sprndm[] sprndmArray = new sprndm[arg0.length];
        int n2 = n = 0;
        while (n2 != sprndmArray.length) {
            int n3 = n++;
            sprndmArray[n3] = arg0[n3];
            n2 = n;
        }
        return sprndmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprocn(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvlm(sprszm sprszm2) {
        int n;
        void arg0;
        sprvlm sprvlm2 = this;
        sprvlm2.cfr_renamed_3 = new sprktm(0L);
        if (sprszm2 == null || arg0.cfr_renamed_84() == 0) {
            throw new IllegalArgumentException(sprnzja.cfr_renamed_9("xLzU6Vd\u0019sTfMo\u0019e\\gLsWu\\6IwJe\\r\u0017"));
        }
        if (arg0.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzcf.cfr_renamed_9("(]\u0002\\\u0013A\u0004P\u0015\u0013\u0012V\u0010F\u0004]\u0002VA@\bI\u0004\tA")).append(arg0.cfr_renamed_84()).toString());
        }
        void v1 = arg0;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(0));
        spridn spridn2 = spridn.cfr_renamed_23(v1.cfr_renamed_85(1));
        this.cfr_renamed_4 = new sprndm[spridn2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprndm.cfr_renamed_23(spridn2.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public static sprvlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvlm) {
            return (sprvlm)arg0;
        }
        if (arg0 != null) {
            return new sprvlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprndm[] cfr_renamed_4646() {
        sprvlm sprvlm2 = this;
        return sprvlm2.cfr_renamed_11224(sprvlm2.cfr_renamed_4);
    }

    public sprvlm(sprndm[] sprndmArray) {
        sprvlm sprvlm2 = this;
        this.cfr_renamed_3 = new sprktm(0L);
        this.cfr_renamed_4 = this.cfr_renamed_11224(sprndmArray);
    }
}


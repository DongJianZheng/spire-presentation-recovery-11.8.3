/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxgf;

public class sprelm
extends sprqqe {
    private boolean cfr_renamed_3;
    private spruom[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3) {
            return new sprqcn(this.cfr_renamed_4);
        }
        return new sprfdn(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprelm(sprszm sprszm2) {
        void arg0;
        int n;
        sprelm sprelm2 = this;
        sprelm2.cfr_renamed_3 = true;
        sprelm2.cfr_renamed_4 = new spruom[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = spruom.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        this.cfr_renamed_3 = arg0 instanceof sprqcn;
    }

    public sprelm(spruom[] spruomArray) {
        this.cfr_renamed_3 = true;
        this.cfr_renamed_4 = this.cfr_renamed_11201(spruomArray);
    }

    public static sprelm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprelm) {
            return (sprelm)arg0;
        }
        if (arg0 != null) {
            return new sprelm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spruom[] cfr_renamed_2442() {
        sprelm sprelm2 = this;
        return sprelm2.cfr_renamed_11201(sprelm2.cfr_renamed_4);
    }

    private /* synthetic */ spruom[] cfr_renamed_11201(spruom[] arg0) {
        spruom[] spruomArray = new spruom[arg0.length];
        System.arraycopy(arg0, 0, spruomArray, 0, spruomArray.length);
        return spruomArray;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprbcn
extends sprqqe {
    private final sprddm cfr_renamed_2;
    private final sprgbf cfr_renamed_3;
    private final sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbcn(sprszm sprszm2) {
        sprbcn sprbcn2;
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_2 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        int n = 1;
        if (v0.cfr_renamed_85(1) instanceof sprnvm) {
            sprbcn2 = this;
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
            this.cfr_renamed_4 = sprszm.cfr_renamed_23(sprnvm2.cfr_renamed_10766(true, 16));
        } else {
            sprbcn2 = this;
            this.cfr_renamed_4 = null;
        }
        sprbcn2.cfr_renamed_3 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(n));
    }

    public sprndm[] cfr_renamed_617() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprndm[] sprndmArray = new sprndm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprndmArray.length) {
            int n3 = n++;
            sprndmArray[n3] = sprndm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprndmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprbcn(sprddm sprddm2, byte[] byArray) {
        void arg1;
        void arg0;
        sprbcn sprbcn2 = this;
        sprbcn2.cfr_renamed_2 = arg0;
        sprbcn2.cfr_renamed_4 = null;
        sprbcn sprbcn3 = this;
        sprbcn2.cfr_renamed_3 = new sprdye(sproze.cfr_renamed_158((byte[])arg1));
    }

    public sprgbf cfr_renamed_79() {
        return new sprdye(this.cfr_renamed_3.cfr_renamed_81(), this.cfr_renamed_3.cfr_renamed_106());
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_2;
    }

    public static sprbcn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbcn) {
            return (sprbcn)arg0;
        }
        if (arg0 != null) {
            return new sprbcn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprbcn sprbcn2 = this;
        sprrvm2.cfr_renamed_5004(sprbcn2.cfr_renamed_2);
        if (sprbcn2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_4));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprbcn(sprddm sprddm2, sprndm[] sprndmArray, byte[] byArray) {
        void arg2;
        void arg1;
        this.cfr_renamed_2 = sprddm2;
        sprbcn sprbcn2 = this;
        this.cfr_renamed_4 = new sprcen((sprco[])arg1);
        sprbcn2.cfr_renamed_3 = new sprdye(sproze.cfr_renamed_158((byte[])arg2));
    }
}


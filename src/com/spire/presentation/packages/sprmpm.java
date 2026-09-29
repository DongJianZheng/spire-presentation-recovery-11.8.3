/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqlm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprmpm
extends sprqqe {
    private sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmpm(sprqlm sprqlm2) {
        void arg0;
        sprmpm sprmpm2 = this;
        sprmpm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    public static sprmpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmpm) {
            return (sprmpm)arg0;
        }
        if (arg0 != null) {
            return new sprmpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprqlm[] cfr_renamed_4377() {
        int n;
        sprqlm[] sprqlmArray = new sprqlm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqlmArray.length) {
            int n3 = n++;
            sprqlmArray[n3] = sprqlm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprqlmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprmpm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmpm(sprqlm[] sprqlmArray) {
        void arg0;
        sprmpm sprmpm2 = this;
        sprmpm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }
}


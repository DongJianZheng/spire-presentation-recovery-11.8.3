/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcnm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprbom
extends sprqqe {
    private final sprszm cfr_renamed_4;

    public static sprbom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbom) {
            return (sprbom)arg0;
        }
        if (arg0 != null) {
            return new sprbom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprcnm[] cfr_renamed_4844() {
        int n;
        sprcnm[] sprcnmArray = new sprcnm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprcnmArray.length) {
            int n3 = n++;
            sprcnmArray[n3] = sprcnm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprcnmArray;
    }

    private /* synthetic */ sprbom(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbom(sprcnm[] sprcnmArray) {
        void arg0;
        sprbom sprbom2 = this;
        sprbom2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprbom(sprcnm sprcnm2) {
        void arg0;
        sprbom sprbom2 = this;
        sprbom2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }
}


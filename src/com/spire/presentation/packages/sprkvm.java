/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkvm
extends sprqqe {
    private sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkvm(sprbvm sprbvm2) {
        void arg0;
        sprkvm sprkvm2 = this;
        sprkvm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprkvm(sprbvm[] sprbvmArray) {
        void arg0;
        sprkvm sprkvm2 = this;
        sprkvm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    public sprbvm[] cfr_renamed_4827() {
        int n;
        sprbvm[] sprbvmArray = new sprbvm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprbvmArray.length) {
            int n3 = n++;
            sprbvmArray[n3] = sprbvm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprbvmArray;
    }

    public static sprkvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkvm) {
            return (sprkvm)arg0;
        }
        if (arg0 != null) {
            return new sprkvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprkvm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.sprxgf;

public class sprypm
extends sprqqe {
    private spridn cfr_renamed_4;

    private /* synthetic */ sprypm(spridn spridn2) {
        this.cfr_renamed_4 = spridn2;
    }

    /*
     * WARNING - void declaration
     */
    public sprypm(sprrvm sprrvm2) {
        void arg0;
        sprypm sprypm2 = this;
        sprypm2.cfr_renamed_4 = new sprsgn((sprrvm)arg0);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public spruem[] cfr_renamed_82() {
        int n;
        spruem[] spruemArray = new spruem[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spruemArray.length) {
            int n3 = n++;
            spruemArray[n3] = spruem.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return spruemArray;
    }

    public static sprypm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprypm) {
            return (sprypm)arg0;
        }
        if (arg0 != null) {
            return new sprypm(spridn.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprypm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprypm.cfr_renamed_23(spridn.cfr_renamed_5085(arg0, arg1));
    }
}


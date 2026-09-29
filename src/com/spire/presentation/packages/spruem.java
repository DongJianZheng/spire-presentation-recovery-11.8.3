/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class spruem
extends sprqqe {
    private sprlem cfr_renamed_3;
    private spridn cfr_renamed_4;

    public spridn cfr_renamed_206() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spruem(sprlem sprlem2, spridn spridn2) {
        void arg0;
        spruem spruem2 = this;
        spruem2.cfr_renamed_3 = arg0;
        spruem2.cfr_renamed_4 = spridn2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruem(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = (sprlem)sprszm2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (spridn)arg0.cfr_renamed_85(1);
    }

    public static spruem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruem) {
            return (spruem)arg0;
        }
        if (arg0 != null) {
            return new spruem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprco[] cfr_renamed_4528() {
        return this.cfr_renamed_4.cfr_renamed_4529();
    }

    public sprlem cfr_renamed_204() {
        return this.cfr_renamed_3;
    }
}


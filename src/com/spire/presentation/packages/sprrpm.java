/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprrpm
extends sprqqe {
    private final sprszm cfr_renamed_4;

    private /* synthetic */ sprrpm(sprszm sprszm2) {
        this.cfr_renamed_4 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprrpm(sprffm sprffm2) {
        void arg0;
        sprrpm sprrpm2 = this;
        sprrpm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    public sprffm[] cfr_renamed_4891() {
        int n;
        sprffm[] sprffmArray = new sprffm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprffmArray.length) {
            int n3 = n++;
            sprffmArray[n3] = sprffm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprffmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprrpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrpm) {
            return (sprrpm)arg0;
        }
        if (arg0 != null) {
            return new sprrpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


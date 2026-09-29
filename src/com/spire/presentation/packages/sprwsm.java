/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhcaa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprwsm
extends sprqqe {
    private final sprybn cfr_renamed_3;
    private final sprszm cfr_renamed_4;

    public static sprwsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwsm) {
            return (sprwsm)arg0;
        }
        if (arg0 != null) {
            return new sprwsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwsm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprhcaa.cfr_renamed_9("?K5J$W3F\"\u0005%@'P3K5@vV?_3"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprybn.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprybn[] cfr_renamed_11393() {
        int n;
        sprybn[] sprybnArray = new sprybn[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprybnArray[n3] = sprybn.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprybnArray;
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
    public sprwsm(sprybn sprybn2, sprszm sprszm2) {
        void arg0;
        sprwsm sprwsm2 = this;
        sprwsm2.cfr_renamed_3 = arg0;
        sprwsm2.cfr_renamed_4 = sprszm2;
    }

    public sprybn cfr_renamed_11394() {
        return this.cfr_renamed_3;
    }
}


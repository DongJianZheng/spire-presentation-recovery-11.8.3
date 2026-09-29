/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprrog
extends sprqqe {
    private final sprktm cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final int cfr_renamed_4;

    public static sprrog cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrog) {
            return (sprrog)arg0;
        }
        if (arg0 != null) {
            return new sprrog(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprrog(int n, sprddm sprddm2) {
        void arg0;
        sprrog sprrog2 = this;
        sprrog sprrog3 = this;
        sprrog3.cfr_renamed_2 = new sprktm(0L);
        sprrog2.cfr_renamed_4 = arg0;
        sprrog2.cfr_renamed_3 = sprddm2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrog(sprszm sprszm2) {
        void arg0;
        sprrog sprrog2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprrog2.cfr_renamed_4 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(1)).cfr_renamed_5023();
        sprrog2.cfr_renamed_3 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_3234() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_4;
    }
}


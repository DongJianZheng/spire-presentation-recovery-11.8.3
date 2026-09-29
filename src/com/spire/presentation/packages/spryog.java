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

public class spryog
extends sprqqe {
    private final int cfr_renamed_1;
    private final sprktm cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final int cfr_renamed_4;

    public sprddm cfr_renamed_3234() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1134() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public spryog(int n, int n2, sprddm sprddm2) {
        void arg1;
        void arg0;
        spryog spryog2 = this;
        spryog spryog3 = this;
        this.cfr_renamed_2 = new sprktm(0L);
        this.cfr_renamed_1 = arg0;
        spryog2.cfr_renamed_4 = arg1;
        spryog2.cfr_renamed_3 = sprddm2;
    }

    public static spryog cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryog) {
            return (spryog)arg0;
        }
        if (arg0 != null) {
            return new spryog(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryog(sprszm sprszm2) {
        void arg0;
        spryog spryog2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(1)).cfr_renamed_5023();
        spryog2.cfr_renamed_4 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(2)).cfr_renamed_5023();
        spryog2.cfr_renamed_3 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(3));
    }
}


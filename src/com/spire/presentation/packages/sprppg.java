/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprppg
extends sprqqe {
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final spraye cfr_renamed_4;

    public static sprppg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprppg) {
            return (sprppg)arg0;
        }
        if (arg0 != null) {
            return new sprppg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spraye cfr_renamed_1145() {
        return new spraye(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_2));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4.cfr_renamed_91()));
        return new sprcen(sprrvm2);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprppg(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_2 = ((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        this.cfr_renamed_3 = ((sprktm)arg0.cfr_renamed_85(1)).cfr_renamed_5023();
        sprppg sprppg2 = this;
        sprppg2.cfr_renamed_4 = new spraye(((sproug)arg0.cfr_renamed_85(2)).cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprppg(int n, int n2, spraye spraye2) {
        void arg2;
        void arg0;
        sprppg sprppg2 = this;
        sprppg2.cfr_renamed_2 = arg0;
        sprppg2.cfr_renamed_3 = n2;
        sprppg sprppg3 = this;
        sprppg2.cfr_renamed_4 = new spraye((spraye)arg2);
    }
}


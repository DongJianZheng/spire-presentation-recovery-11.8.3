/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkhg
extends sprqqe {
    private final sprddm cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final spraye cfr_renamed_4;

    public int cfr_renamed_1146() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4.cfr_renamed_91()));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        return new sprcen(sprrvm2);
    }

    public spraye cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkhg(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_3 = ((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        this.cfr_renamed_2 = ((sprktm)arg0.cfr_renamed_85(1)).cfr_renamed_5023();
        sprkhg sprkhg2 = this;
        sprkhg2.cfr_renamed_4 = new spraye(((sproug)arg0.cfr_renamed_85(2)).cfr_renamed_186());
        this.cfr_renamed_1 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(3));
    }

    public sprddm cfr_renamed_580() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprkhg(int n, int n2, spraye spraye2, sprddm sprddm2) {
        void arg2;
        void arg1;
        void arg0;
        sprkhg sprkhg2 = this;
        this.cfr_renamed_3 = arg0;
        sprkhg2.cfr_renamed_2 = arg1;
        sprkhg sprkhg3 = this;
        sprkhg2.cfr_renamed_4 = new spraye(arg2.cfr_renamed_91());
        sprkhg2.cfr_renamed_1 = sprddm2;
    }

    public static sprkhg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkhg) {
            return (sprkhg)arg0;
        }
        if (arg0 != null) {
            return new sprkhg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_2;
    }
}


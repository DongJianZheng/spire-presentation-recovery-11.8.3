/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprtlm
extends sprqqe {
    private final sprktm cfr_renamed_1;
    private final sproug cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    public sprddm cfr_renamed_1472() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprtlm(sproug sproug2, sprddm sprddm2, sprktm sprktm2, sprddm sprddm3) {
        void arg2;
        void arg1;
        void arg0;
        sprtlm sprtlm2 = this;
        sprtlm sprtlm3 = this;
        sprtlm3.cfr_renamed_2 = arg0;
        sprtlm3.cfr_renamed_4 = arg1;
        sprtlm2.cfr_renamed_1 = arg2;
        sprtlm2.cfr_renamed_3 = sprddm3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtlm(sprszm sprszm2) {
        void arg0;
        sprtlm sprtlm2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprtlm2.cfr_renamed_1 = sprktm.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprtlm2.cfr_renamed_3 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(3));
    }

    public sproug cfr_renamed_1477() {
        return this.cfr_renamed_2;
    }

    public sprktm cfr_renamed_1478() {
        return this.cfr_renamed_1;
    }

    public sprddm cfr_renamed_4336() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtlm(byte[] byArray, sprddm sprddm2, int n, sprddm sprddm3) {
        this(new sprfvg((byte[])arg0), (sprddm)arg1, new sprktm((long)arg2), (sprddm)arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
    }

    public static sprtlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtlm) {
            return (sprtlm)arg0;
        }
        if (arg0 != null) {
            return new sprtlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(4);
        sprtlm sprtlm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(sprtlm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprtlm2.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }
}


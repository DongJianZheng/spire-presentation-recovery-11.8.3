/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sproqm
extends sprqqe {
    private final sprddm cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    public sprddm cfr_renamed_7445() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sproqm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprhtc.cfr_renamed_9("\u0001F\u000e;q5\u0013P\u0011@\u0005[\u0003P`f(z5y$5\"p`z&5,p.r4}`'"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprddm cfr_renamed_7446() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sproqm(sprddm sprddm2, sprddm sprddm3) {
        void arg0;
        sproqm sproqm2 = this;
        sproqm2.cfr_renamed_4 = arg0;
        sproqm2.cfr_renamed_3 = sprddm3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sproqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproqm) {
            return (sproqm)arg0;
        }
        if (arg0 != null) {
            return new sproqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


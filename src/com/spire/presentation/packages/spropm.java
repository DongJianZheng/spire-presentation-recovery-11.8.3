/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdgha;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class spropm
extends sprqqe {
    public static final sprddm cfr_renamed_91 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);
    private sprddm cfr_renamed_0;
    public static final sprddm cfr_renamed_1;
    private sprddm cfr_renamed_2;
    public static final sprddm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spropm(sprddm sprddm2, sprddm sprddm3, sprddm sprddm4) {
        void arg1;
        void arg0;
        spropm spropm2 = this;
        this.cfr_renamed_4 = arg0;
        spropm2.cfr_renamed_0 = arg1;
        spropm2.cfr_renamed_2 = sprddm4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (!this.cfr_renamed_4.equals(cfr_renamed_91)) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        if (!this.cfr_renamed_0.equals(cfr_renamed_3)) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_0));
        }
        if (!this.cfr_renamed_2.equals(cfr_renamed_1)) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }

    static {
        cfr_renamed_3 = new sprddm(sprdl.cfr_renamed_135, cfr_renamed_91);
        cfr_renamed_1 = new sprddm(sprdl.cfr_renamed_1472, new sprfvg(new byte[0]));
    }

    public static spropm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spropm) {
            return (spropm)arg0;
        }
        if (arg0 != null) {
            return new spropm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_4599() {
        return this.cfr_renamed_2;
    }

    public spropm() {
        this.cfr_renamed_4 = cfr_renamed_91;
        this.cfr_renamed_0 = cfr_renamed_3;
        this.cfr_renamed_2 = cfr_renamed_1;
    }

    public sprddm cfr_renamed_579() {
        return this.cfr_renamed_4;
    }

    public sprddm cfr_renamed_4596() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spropm(sprszm sprszm2) {
        int n;
        this.cfr_renamed_4 = cfr_renamed_91;
        this.cfr_renamed_0 = cfr_renamed_3;
        this.cfr_renamed_2 = cfr_renamed_1;
        int n2 = n = 0;
        void arg0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(n);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_4 = sprddm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_0 = sprddm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 2: {
                    this.cfr_renamed_2 = sprddm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprdgha.cfr_renamed_9("[\fE\fA\u0015@BZ\u0003I"));
                }
            }
            n2 = ++n;
        }
        return;
    }
}


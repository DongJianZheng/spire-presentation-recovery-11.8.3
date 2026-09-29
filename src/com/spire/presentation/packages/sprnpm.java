/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprnpm
extends sprqqe {
    private final sprddm cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnpm(sprddm sprddm2, sprddm sprddm3, byte[] byArray) {
        void arg1;
        void arg0;
        sprnpm sprnpm2 = this;
        this.cfr_renamed_2 = arg0;
        sprnpm2.cfr_renamed_4 = arg1;
        sprnpm2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnpm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprqyo.cfr_renamed_9("1\u0004;\u0005*\u0018=\t,J+\u000f)\u001f=\u0004;\u000fx\u00191\u0010="));
        }
        void v0 = arg0;
        this.cfr_renamed_2 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v0.cfr_renamed_85(2)).cfr_renamed_186());
    }

    public sprddm cfr_renamed_11374() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_4894() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public sprddm cfr_renamed_4202() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4894()));
        return new sprcen(sprrvm2);
    }

    public static sprnpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnpm) {
            return (sprnpm)arg0;
        }
        if (arg0 != null) {
            return new sprnpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


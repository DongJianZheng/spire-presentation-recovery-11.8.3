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
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwpm;
import com.spire.presentation.packages.sprxgf;

public class spruzm
extends sprqqe {
    private final sproug cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprwpm cfr_renamed_4;

    public static spruzm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruzm) {
            return (spruzm)arg0;
        }
        if (arg0 != null) {
            return new spruzm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprwpm cfr_renamed_9304() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruzm(sprszm sprszm2) {
        void arg0;
        spruzm spruzm2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v1.cfr_renamed_85(0));
        spruzm2.cfr_renamed_4 = sprwpm.cfr_renamed_23(v1.cfr_renamed_85(1));
        spruzm2.cfr_renamed_2 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
    }

    /*
     * WARNING - void declaration
     */
    public spruzm(sprddm sprddm2, sprwpm sprwpm2, byte[] byArray) {
        void arg2;
        void arg0;
        spruzm spruzm2 = this;
        spruzm2.cfr_renamed_3 = arg0;
        spruzm2.cfr_renamed_4 = sprwpm2;
        spruzm spruzm3 = this;
        spruzm2.cfr_renamed_2 = new sprfvg(sproze.cfr_renamed_158((byte[])arg2));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        spruzm spruzm2 = this;
        sprrvm2.cfr_renamed_5004(spruzm2.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(spruzm2.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprddm cfr_renamed_4202() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1472() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2.cfr_renamed_186());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;

public class sprmwm
extends sprqqe {
    private final sprddm cfr_renamed_2;
    private final sprybn cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public static sprmwm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmwm) {
            return (sprmwm)arg0;
        }
        if (arg0 != null) {
            return new sprmwm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_11402() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmwm(sprybn sprybn2, sprddm sprddm2, byte[] byArray) {
        void arg1;
        void arg0;
        sprmwm sprmwm2 = this;
        this.cfr_renamed_3 = arg0;
        sprmwm2.cfr_renamed_2 = arg1;
        sprmwm2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_11403() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmwm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprixl.cfr_renamed_9("&U,T=I*X;\u001b<^>N*U,^oH&A*"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprybn.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v0.cfr_renamed_85(2)).cfr_renamed_186());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public sprybn cfr_renamed_11361() {
        return this.cfr_renamed_3;
    }
}


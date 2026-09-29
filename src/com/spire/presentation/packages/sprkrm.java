/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhln;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprkrm
extends sprqqe {
    private final byte[] cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkrm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprhln.cfr_renamed_9("ngdfu{bjs)tlv|bgdl'znsb"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v0.cfr_renamed_85(2)).cfr_renamed_186());
    }

    public sprddm cfr_renamed_11395() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4894()));
        return new sprcen(sprrvm2);
    }

    public static sprkrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkrm) {
            return (sprkrm)arg0;
        }
        if (arg0 != null) {
            return new sprkrm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_4894() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public sprddm cfr_renamed_11396() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprkrm(sprddm sprddm2, sprddm sprddm3, byte[] byArray) {
        void arg1;
        void arg0;
        sprkrm sprkrm2 = this;
        this.cfr_renamed_4 = arg0;
        sprkrm2.cfr_renamed_3 = arg1;
        sprkrm2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }
}


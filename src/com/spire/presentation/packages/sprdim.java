/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprdim
extends sprqqe {
    private sprddm cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_580() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprddm cfr_renamed_1473() {
        return this.cfr_renamed_3;
    }

    public sprdim(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_4 = sproug.cfr_renamed_23(enumeration.nextElement()).cfr_renamed_186();
    }

    public static sprdim cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdim) {
            return (sprdim)arg0;
        }
        if (arg0 != null) {
            return new sprdim(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdim(sprddm sprddm2, byte[] byArray) {
        void arg1;
        sprdim sprdim2 = this;
        sprdim2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
        sprdim2.cfr_renamed_3 = sprddm2;
    }

    public static sprdim cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprdim.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprang
extends sprqqe {
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprang(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprang sprang2 = this;
        sprang2.cfr_renamed_4 = arg0;
        sprang2.cfr_renamed_3 = byArray2;
    }

    public static sprang cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprang) {
            return (sprang)arg0;
        }
        if (arg0 != null) {
            return new sprang(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprang(sprszm sprszm2) {
        void arg0;
        sprang sprang2 = this;
        sprang2.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_186());
        sprang2.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_186());
    }

    public byte[] cfr_renamed_5971() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_5970() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}


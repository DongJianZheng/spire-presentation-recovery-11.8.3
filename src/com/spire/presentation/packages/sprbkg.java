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

public class sprbkg
extends sprqqe {
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbkg(byte[] byArray, byte[] byArray2) {
        void arg0;
        sprbkg sprbkg2 = this;
        sprbkg2.cfr_renamed_3 = arg0;
        sprbkg2.cfr_renamed_4 = byArray2;
    }

    public byte[] cfr_renamed_7243() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbkg(sprszm sprszm2) {
        void arg0;
        sprbkg sprbkg2 = this;
        sprbkg2.cfr_renamed_3 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_186());
        sprbkg2.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_186());
    }

    public byte[] cfr_renamed_1997() {
        return this.cfr_renamed_4;
    }

    public static sprbkg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbkg) {
            return (sprbkg)arg0;
        }
        if (arg0 != null) {
            return new sprbkg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


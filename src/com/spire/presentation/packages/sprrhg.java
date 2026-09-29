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

public class sprrhg
extends sprqqe {
    private byte[] cfr_renamed_4;

    public static sprrhg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrhg) {
            return (sprrhg)arg0;
        }
        if (arg0 != null) {
            return new sprrhg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrhg(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_1153() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public sprrhg(sprszm sprszm2) {
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_186());
    }
}


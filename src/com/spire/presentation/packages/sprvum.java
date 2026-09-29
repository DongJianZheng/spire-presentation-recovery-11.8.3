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

public class sprvum
extends sprqqe {
    public sproug cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(1);
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    public byte[] cfr_renamed_1205() {
        if (this.cfr_renamed_4 != null) {
            return sproze.cfr_renamed_158(this.cfr_renamed_4.cfr_renamed_186());
        }
        return null;
    }

    public static sprvum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvum) {
            return (sprvum)arg0;
        }
        if (arg0 != null) {
            return new sprvum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvum(sprszm sprszm2) {
        if (sprszm2.cfr_renamed_84() == 1) {
            void arg0;
            this.cfr_renamed_4 = (sproug)arg0.cfr_renamed_85(0);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvum(byte[] byArray) {
        void arg0;
        sprvum sprvum2 = this;
        sprvum2.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
    }
}


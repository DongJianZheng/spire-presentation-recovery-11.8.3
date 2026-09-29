/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprznm
extends sprqqe {
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        if (this.cfr_renamed_3 != 12) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public int cfr_renamed_4837() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprznm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_186();
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_5023();
            return;
        }
        this.cfr_renamed_3 = 12;
    }

    /*
     * WARNING - void declaration
     */
    public sprznm(byte[] byArray, int n) {
        void arg0;
        sprznm sprznm2 = this;
        sprznm2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        sprznm2.cfr_renamed_3 = n;
    }

    public static sprznm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprznm) {
            return (sprznm)arg0;
        }
        if (arg0 != null) {
            return new sprznm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_596() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}


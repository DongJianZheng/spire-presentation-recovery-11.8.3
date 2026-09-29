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

public class sprtnk
extends sprqqe {
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ sprtnk(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_186();
        if (sprszm2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_5023();
            return;
        }
        this.cfr_renamed_4 = 12;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        if (this.cfr_renamed_4 != 12) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public static sprtnk cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtnk) {
            return (sprtnk)arg0;
        }
        if (arg0 != null) {
            return new sprtnk(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprtnk(byte[] byArray, int n) {
        void arg0;
        sprtnk sprtnk2 = this;
        sprtnk2.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
        sprtnk2.cfr_renamed_4 = n;
    }

    public int cfr_renamed_4837() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_596() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }
}


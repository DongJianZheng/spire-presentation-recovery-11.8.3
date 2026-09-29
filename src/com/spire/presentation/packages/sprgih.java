/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprctg;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvir;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprywg;

public class sprgih
extends sprqqe {
    private final sprywg cfr_renamed_3;
    private final sprctg cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgih(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprvir.cfr_renamed_9("j\u001b\u007f\u0006l\u0017j\u0007/\u0010j\u0012z\u0006a\u0000jC|\nu\u0006/\fiC="));
        }
        this.cfr_renamed_4 = sprctg.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprenh.cfr_renamed_8135(sprywg.class, arg0.cfr_renamed_85(1));
    }

    public sprywg cfr_renamed_8221() {
        return this.cfr_renamed_3;
    }

    public static sprgih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgih) {
            return (sprgih)arg0;
        }
        if (arg0 != null) {
            return new sprgih(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgih(sprctg sprctg2, sprywg sprywg2) {
        void arg0;
        sprgih sprgih2 = this;
        sprgih2.cfr_renamed_4 = arg0;
        sprgih2.cfr_renamed_3 = sprywg2;
    }

    public sprctg cfr_renamed_8470() {
        return this.cfr_renamed_4;
    }
}


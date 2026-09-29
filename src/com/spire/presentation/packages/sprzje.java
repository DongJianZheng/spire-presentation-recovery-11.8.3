/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprzje
extends sprkra {
    private sprije cfr_renamed_4;

    public static sprzje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzje) {
            return (sprzje)arg0;
        }
        if (arg0 != null) {
            return new sprzje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprzje(sprbne sprbne2) {
        this.cfr_renamed_4 = sprije.cfr_renamed_23(sprbne2);
    }

    public spra cfr_renamed_284() {
        return this.cfr_renamed_4.cfr_renamed_284();
    }

    public sprtzd cfr_renamed_593() {
        return this.cfr_renamed_4.cfr_renamed_593();
    }

    /*
     * WARNING - void declaration
     */
    public sprzje(sprtzd sprtzd2, spra spra2) {
        void arg1;
        void arg0;
        sprzje sprzje2 = this;
        sprzje2.cfr_renamed_4 = new sprije((sprtzd)arg0, (spra)arg1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }
}


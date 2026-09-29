/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprgfe
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprbne cfr_renamed_4;

    public sprtzd cfr_renamed_4684() {
        return this.cfr_renamed_3;
    }

    public static sprgfe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgfe) {
            return (sprgfe)arg0;
        }
        return new sprgfe(sprbne.cfr_renamed_23(arg0));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgfe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = (sprbne)arg0.cfr_renamed_85(1);
        }
    }

    public sprbne cfr_renamed_4685() {
        return this.cfr_renamed_4;
    }

    public sprgfe(sprtzd sprtzd2) {
        this.cfr_renamed_3 = sprtzd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgfe(sprtzd sprtzd2, sprbne sprbne2) {
        void arg0;
        sprgfe sprgfe2 = this;
        sprgfe2.cfr_renamed_3 = arg0;
        sprgfe2.cfr_renamed_4 = sprbne2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprgfe sprgfe2 = this;
        sprlre2.cfr_renamed_49(sprgfe2.cfr_renamed_3);
        if (sprgfe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}


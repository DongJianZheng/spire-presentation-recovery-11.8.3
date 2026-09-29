/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprkbe
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    public static sprkbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkbe) {
            return (sprkbe)arg0;
        }
        if (arg0 != null) {
            return new sprkbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(new sprhse(0, this.cfr_renamed_4));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprkbe(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprkbe sprkbe2 = this;
        sprkbe2.cfr_renamed_3 = arg0;
        sprkbe2.cfr_renamed_4 = spra2;
    }

    public spra cfr_renamed_1460() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkbe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = ((sprhse)arg0.cfr_renamed_85(1)).cfr_renamed_2456();
    }

    public sprtzd cfr_renamed_4603() {
        return this.cfr_renamed_3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprhue
extends sprkra {
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhue(sprbne sprbne2) {
        void arg0;
        sprhue sprhue2 = this;
        sprhue2.cfr_renamed_4 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprhue2.cfr_renamed_3 = sprbne2.cfr_renamed_85(1);
    }

    public static sprhue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhue) {
            return (sprhue)arg0;
        }
        if (arg0 != null) {
            return new sprhue(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public spra cfr_renamed_3365() {
        return this.cfr_renamed_3;
    }

    public static sprhue cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprhue.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprtzd cfr_renamed_4114() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprhue(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprhue sprhue2 = this;
        sprhue2.cfr_renamed_4 = arg0;
        sprhue2.cfr_renamed_3 = spra2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjie;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrke;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprsee
extends sprkra {
    public sprrke cfr_renamed_3;
    public sprjie cfr_renamed_4;

    public static sprsee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsee) {
            return (sprsee)arg0;
        }
        if (arg0 != null) {
            return new sprsee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjie cfr_renamed_4297() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprsee(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprrke.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprjie.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), true);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprsee(sprrke sprrke2, sprjie sprjie2) {
        void arg0;
        sprsee sprsee2 = this;
        sprsee2.cfr_renamed_3 = arg0;
        sprsee2.cfr_renamed_4 = sprjie2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprsee sprsee2 = this;
        sprlre2.cfr_renamed_49(sprsee2.cfr_renamed_3);
        if (sprsee2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    public sprrke cfr_renamed_4295() {
        return this.cfr_renamed_3;
    }

    public static sprsee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprsee.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}


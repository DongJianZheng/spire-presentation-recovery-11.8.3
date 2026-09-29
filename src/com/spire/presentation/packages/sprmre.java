/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprmre
extends sprkra {
    private sprije cfr_renamed_2;
    private sprnte cfr_renamed_3;
    private sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmre(sprije sprije2, sprnte sprnte2) {
        void arg0;
        sprmre sprmre2 = this;
        sprmre sprmre3 = this;
        sprmre3.cfr_renamed_4 = new sprooe(0L);
        sprmre2.cfr_renamed_2 = arg0;
        sprmre2.cfr_renamed_3 = sprnte2;
    }

    public sprnte cfr_renamed_2589() {
        return this.cfr_renamed_3;
    }

    public static sprmre cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmre.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprmre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmre) {
            return (sprmre)arg0;
        }
        if (arg0 != null) {
            return new sprmre(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprmre sprmre2 = this;
        sprlre2.cfr_renamed_49(sprmre2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprmre2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprjve(sprlre2);
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmre(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = (sprooe)sprbne2.cfr_renamed_85(0);
        sprmre sprmre2 = this;
        sprmre2.cfr_renamed_2 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(1));
        sprmre2.cfr_renamed_3 = sprnte.cfr_renamed_23(arg0.cfr_renamed_85(2));
    }

    public sprije cfr_renamed_4187() {
        return this.cfr_renamed_2;
    }
}


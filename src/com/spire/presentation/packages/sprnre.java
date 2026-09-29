/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhre;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprnre
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprhre cfr_renamed_4;

    public sprxue cfr_renamed_4010() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnre(sprbne sprbne2) {
        void arg0;
        sprnre sprnre2 = this;
        sprnre2.cfr_renamed_4 = sprhre.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprnre2.cfr_renamed_3 = (sprxue)sprbne2.cfr_renamed_85(1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprhre cfr_renamed_4028() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprnre(sprhre sprhre2, sprxue sprxue2) {
        void arg0;
        sprnre sprnre2 = this;
        sprnre2.cfr_renamed_4 = arg0;
        sprnre2.cfr_renamed_3 = sprxue2;
    }

    public static sprnre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnre) {
            return (sprnre)arg0;
        }
        if (arg0 != null) {
            return new sprnre(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprnre cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnre.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}


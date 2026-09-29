/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.util.Enumeration;

public class sprkke
extends sprkra {
    public sprooe cfr_renamed_3;
    public sprxue cfr_renamed_4;

    public int cfr_renamed_4644() {
        return this.cfr_renamed_3.cfr_renamed_97().intValue();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public static sprkke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkke) {
            return (sprkke)arg0;
        }
        if (arg0 != null) {
            return new sprkke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprkke(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_4 = sprxue.cfr_renamed_23(enumeration.nextElement());
    }

    /*
     * WARNING - void declaration
     */
    public sprkke(int n, sprxue sprxue2) {
        void arg0;
        sprkke sprkke2 = this;
        this.cfr_renamed_3 = new sprooe((long)arg0);
        this.cfr_renamed_4 = sprxue2;
    }

    public sprxue cfr_renamed_4645() {
        return this.cfr_renamed_4;
    }
}


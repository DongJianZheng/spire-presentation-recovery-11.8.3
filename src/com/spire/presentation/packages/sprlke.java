/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpce;
import com.spire.presentation.packages.sprpde;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprlke
extends sprkra {
    private sprpde cfr_renamed_3;
    private sprpce cfr_renamed_4;

    public static sprlke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlke) {
            return (sprlke)arg0;
        }
        if (arg0 != null) {
            return new sprlke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlke(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdso.cfr_renamed_9(".w\b6\u001fs\u001dc\tx\u000fsLe\u0005l\t,L")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprpde.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprpce.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprpce cfr_renamed_4674() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprlke(sprpde sprpde2, sprpce sprpce2) {
        void arg0;
        sprlke sprlke2 = this;
        sprlke2.cfr_renamed_3 = arg0;
        sprlke2.cfr_renamed_4 = sprpce2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_3.cfr_renamed_119());
        if (null != this.cfr_renamed_4) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4.cfr_renamed_119());
        }
        return new sprpse(sprlre2);
    }

    public sprpde cfr_renamed_4675() {
        return this.cfr_renamed_3;
    }

    public sprlke(sprpde arg0) {
        this(arg0, null);
    }
}


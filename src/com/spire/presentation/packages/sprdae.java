/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class sprdae
extends sprkra {
    public sprnte cfr_renamed_3;
    public sprkme cfr_renamed_4;

    public static sprdae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdae) {
            return (sprdae)arg0;
        }
        if (arg0 != null) {
            return new sprdae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprnte cfr_renamed_652() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprdae(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_4 = sprkme.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_3 = sprnte.cfr_renamed_23(enumeration.nextElement());
        }
    }

    public sprkme cfr_renamed_648() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdae(sprkme sprkme2, sprnte sprnte2) {
        void arg0;
        sprdae sprdae2 = this;
        sprdae2.cfr_renamed_4 = arg0;
        sprdae2.cfr_renamed_3 = sprnte2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdae sprdae2 = this;
        sprlre2.cfr_renamed_49(sprdae2.cfr_renamed_4);
        if (sprdae2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }
}


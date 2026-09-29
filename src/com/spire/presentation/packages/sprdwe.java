/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprdwe
extends sprkra {
    private sprnte cfr_renamed_3;
    private sproje cfr_renamed_4;

    public sproje cfr_renamed_3095() {
        return this.cfr_renamed_4;
    }

    public sprnte cfr_renamed_652() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdwe sprdwe2 = this;
        sprlre2.cfr_renamed_49(sprdwe2.cfr_renamed_3);
        if (sprdwe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public static sprdwe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdwe) {
            return (sprdwe)arg0;
        }
        if (arg0 != null) {
            return new sprdwe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprdwe(sprnte sprnte2) {
        this.cfr_renamed_3 = sprnte2;
    }

    private /* synthetic */ sprdwe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprnte.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sproje.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sproje cfr_renamed_2126() {
        return this.cfr_renamed_4;
    }
}


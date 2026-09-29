/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprtoe
extends sprkra {
    private sprooe cfr_renamed_3;
    private sprmee cfr_renamed_4;

    public sprmee cfr_renamed_4811() {
        return this.cfr_renamed_4;
    }

    public static sprtoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtoe) {
            return (sprtoe)arg0;
        }
        if (arg0 != null) {
            return new sprtoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprtoe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprmee.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprtoe sprtoe2 = this;
        sprlre2.cfr_renamed_49(sprtoe2.cfr_renamed_3);
        if (sprtoe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}


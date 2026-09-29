/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlue;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprise
extends sprkra {
    private sprlue cfr_renamed_3;
    private sprdne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprlue cfr_renamed_2573() {
        return this.cfr_renamed_3;
    }

    public static sprise cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprise) {
            return (sprise)arg0;
        }
        if (arg0 != null) {
            return new sprise(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprise(sprbne sprbne2) {
        void arg0;
        sprise sprise2 = this;
        sprise2.cfr_renamed_4 = sprdne.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprise2.cfr_renamed_3 = sprlue.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
    }

    /*
     * WARNING - void declaration
     */
    public sprise(sprdne sprdne2, sprlue sprlue2) {
        void arg0;
        sprise sprise2 = this;
        sprise2.cfr_renamed_4 = arg0;
        sprise2.cfr_renamed_3 = sprlue2;
    }

    public sprdne cfr_renamed_4409() {
        return this.cfr_renamed_4;
    }
}


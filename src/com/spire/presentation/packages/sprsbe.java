/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprery;
import com.spire.presentation.packages.sprkae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;

public class sprsbe
extends sprkra {
    private sprrpe cfr_renamed_3;
    private sprkae cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsbe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprery.cfr_renamed_9("oYI\u0018^]\\MHVN]\rKDBH\u0002\r")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprkae.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = (sprrpe)v0.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprsbe(sprkae sprkae2, sprrpe sprrpe2) {
        void arg0;
        sprsbe sprsbe2 = this;
        sprsbe2.cfr_renamed_4 = arg0;
        sprsbe2.cfr_renamed_3 = sprrpe2;
    }

    public static sprsbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsbe) {
            return (sprsbe)arg0;
        }
        if (arg0 != null) {
            return new sprsbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprrpe cfr_renamed_4279() {
        return this.cfr_renamed_3;
    }

    public sprkae cfr_renamed_4673() {
        return this.cfr_renamed_4;
    }
}


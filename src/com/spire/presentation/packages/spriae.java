/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class spriae
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprbne cfr_renamed_4;

    public static spriae cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spriae) {
            return (spriae)arg0;
        }
        return new spriae(sprbne.cfr_renamed_23(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public spriae(sprtzd sprtzd2, sprbne sprbne2) {
        void arg0;
        spriae spriae2 = this;
        spriae2.cfr_renamed_3 = arg0;
        spriae2.cfr_renamed_4 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriae(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjgka.cfr_renamed_9("\u0001\u0003'B0\u00072\u0017&\f \u0007c\u0011*\u0018&Xc")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
    }

    public sprbne cfr_renamed_332() {
        return this.cfr_renamed_4;
    }

    public sprtzd cfr_renamed_330() {
        return this.cfr_renamed_3;
    }

    public spriae(sprtzd sprtzd2) {
        this.cfr_renamed_3 = sprtzd2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spriae spriae2 = this;
        sprlre2.cfr_renamed_49(spriae2.cfr_renamed_3);
        if (spriae2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }
}


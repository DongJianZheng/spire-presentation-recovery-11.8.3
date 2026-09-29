/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprxzd
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprxzd sprxzd2 = this;
        sprlre2.cfr_renamed_49(sprxzd2.cfr_renamed_3);
        if (sprxzd2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxzd(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = arg0.cfr_renamed_85(1);
        }
    }

    public spra cfr_renamed_4502() {
        return this.cfr_renamed_4;
    }

    public sprxzd(sprtzd arg0) {
        this(arg0, null);
    }

    public sprtzd cfr_renamed_4683() {
        return this.cfr_renamed_3;
    }

    public static sprxzd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxzd) {
            return (sprxzd)arg0;
        }
        if (arg0 != null) {
            return new sprxzd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxzd(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprxzd sprxzd2 = this;
        sprxzd2.cfr_renamed_3 = arg0;
        sprxzd2.cfr_renamed_4 = spra2;
    }
}


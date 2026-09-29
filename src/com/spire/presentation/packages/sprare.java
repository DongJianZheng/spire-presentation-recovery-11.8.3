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

public class sprare
extends sprkra {
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    private /* synthetic */ sprare(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprtzd.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() > 1) {
            this.cfr_renamed_3 = arg0.cfr_renamed_85(1);
        }
    }

    public static sprare cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprare) {
            return (sprare)arg0;
        }
        if (arg0 != null) {
            return new sprare(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public spra cfr_renamed_4886() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprare(sprtzd sprtzd2) {
        void arg0;
        sprare sprare2 = this;
        sprare2.cfr_renamed_4 = arg0;
        sprare2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprare(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprare sprare2 = this;
        sprare2.cfr_renamed_4 = arg0;
        sprare2.cfr_renamed_3 = spra2;
    }

    public sprtzd cfr_renamed_4887() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprare sprare2 = this;
        sprlre2.cfr_renamed_49(sprare2.cfr_renamed_4);
        if (sprare2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }
}


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
import com.spire.presentation.packages.sprxte;

public class sprjce
extends sprkra {
    private sprtzd cfr_renamed_3;
    private sprxte cfr_renamed_4;

    public static sprjce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjce) {
            return (sprjce)arg0;
        }
        if (arg0 != null) {
            return new sprjce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjce(sprbne sprbne2) {
        void arg0;
        spra spra2 = sprbne2.cfr_renamed_85(0);
        if (spra2.cfr_renamed_119() instanceof sprxte) {
            sprjce sprjce2 = this;
            sprjce2.cfr_renamed_4 = sprxte.cfr_renamed_23(spra2);
            sprjce2.cfr_renamed_3 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_3 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjce(sprtzd sprtzd2) {
        void arg0;
        sprjce sprjce2 = this;
        sprjce2.cfr_renamed_3 = arg0;
        sprjce2.cfr_renamed_4 = null;
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_3;
    }

    public sprxte cfr_renamed_4650() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjce(sprtzd sprtzd2, sprxte sprxte2) {
        void arg0;
        sprjce sprjce2 = this;
        sprjce2.cfr_renamed_3 = arg0;
        sprjce2.cfr_renamed_4 = sprxte2;
    }
}


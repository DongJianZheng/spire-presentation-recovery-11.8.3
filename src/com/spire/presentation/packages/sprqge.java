/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfib;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprqge
extends sprkra {
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public spra cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public sprtzd cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqge(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprqge sprqge2 = this;
        sprqge2.cfr_renamed_4 = arg0;
        sprqge2.cfr_renamed_3 = spra2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqge(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_3 = arg0.cfr_renamed_85(1);
    }

    public static sprqge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqge) {
            return (sprqge)arg0;
        }
        if (arg0 != null) {
            return new sprqge(sprbne.cfr_renamed_23(arg0));
        }
        throw new IllegalArgumentException(sprfib.cfr_renamed_9("/9- a:  4)a%/l&)5\u0005/?5-//$dh"));
    }
}


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

public class sprkse
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprkse(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprkse sprkse2 = this;
        sprkse2.cfr_renamed_3 = arg0;
        sprkse2.cfr_renamed_4 = spra2;
    }

    public static sprkse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkse) {
            return (sprkse)arg0;
        }
        if (arg0 != null) {
            return new sprkse(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtzd cfr_renamed_4834() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprkse(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = arg0.cfr_renamed_85(1);
    }

    public spra cfr_renamed_4835() {
        return this.cfr_renamed_4;
    }
}


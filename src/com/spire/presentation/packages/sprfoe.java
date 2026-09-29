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

public class sprfoe
extends sprkra {
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public sprtzd cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprfoe(String string, spra spra2) {
        this(new sprtzd((String)arg0), (spra)arg1);
        void arg1;
        void arg0;
    }

    public spra cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprfoe(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprfoe sprfoe2 = this;
        sprfoe2.cfr_renamed_4 = arg0;
        sprfoe2.cfr_renamed_3 = spra2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfoe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_3 = arg0.cfr_renamed_85(1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public static sprfoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfoe) {
            return (sprfoe)arg0;
        }
        if (arg0 != null) {
            return new sprfoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


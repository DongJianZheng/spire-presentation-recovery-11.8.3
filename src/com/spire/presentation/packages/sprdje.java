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

public class sprdje
extends sprkra {
    private spra cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public static sprdje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdje) {
            return (sprdje)arg0;
        }
        if (arg0 != null) {
            return new sprdje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprtzd cfr_renamed_4653() {
        return new sprtzd(this.cfr_renamed_4.cfr_renamed_19());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdje(sprbne sprbne2) {
        void arg0;
        sprdje sprdje2 = this;
        sprdje2.cfr_renamed_4 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprdje2.cfr_renamed_3 = sprbne2.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdje(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprdje sprdje2 = this;
        sprdje2.cfr_renamed_4 = arg0;
        sprdje2.cfr_renamed_3 = spra2;
    }

    public spra cfr_renamed_4654() {
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
}


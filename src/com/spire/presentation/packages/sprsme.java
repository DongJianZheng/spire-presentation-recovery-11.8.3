/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprsme
extends sprkra {
    private sprtzd cfr_renamed_2;
    private sprtzd cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public static sprsme cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprsme.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprtzd cfr_renamed_2105() {
        return this.cfr_renamed_3;
    }

    public sprtzd cfr_renamed_2107() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprsme sprsme2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprsme2.cfr_renamed_2);
        if (sprsme2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprsme(sprtzd sprtzd2, sprtzd sprtzd3) {
        void arg1;
        void arg0;
        sprsme sprsme2 = this;
        this.cfr_renamed_4 = arg0;
        sprsme2.cfr_renamed_2 = arg1;
        sprsme2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprsme(sprtzd sprtzd2, sprtzd sprtzd3, sprtzd sprtzd4) {
        void arg1;
        void arg0;
        sprsme sprsme2 = this;
        this.cfr_renamed_4 = arg0;
        sprsme2.cfr_renamed_2 = arg1;
        sprsme2.cfr_renamed_3 = sprtzd4;
    }

    public static sprsme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsme) {
            return (sprsme)arg0;
        }
        if (arg0 != null) {
            return new sprsme(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprsme(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = (sprtzd)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_2 = (sprtzd)arg0.cfr_renamed_85(1);
        if (arg0.cfr_renamed_84() > 2) {
            this.cfr_renamed_3 = (sprtzd)arg0.cfr_renamed_85(2);
        }
    }

    public sprtzd cfr_renamed_2106() {
        return this.cfr_renamed_4;
    }
}


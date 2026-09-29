/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryge;

public class sprwjb
extends sprkra {
    public spryge cfr_renamed_2;
    public sprije cfr_renamed_3;
    public sprmra cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwjb(spryge spryge2, sprije sprije2, sprmra sprmra2) {
        void arg1;
        void arg0;
        sprwjb sprwjb2 = this;
        sprwjb sprwjb3 = this;
        sprwjb sprwjb4 = this;
        sprwjb4.cfr_renamed_2 = null;
        sprwjb4.cfr_renamed_3 = null;
        sprwjb3.cfr_renamed_4 = null;
        sprwjb3.cfr_renamed_2 = arg0;
        sprwjb2.cfr_renamed_3 = arg1;
        sprwjb2.cfr_renamed_4 = sprmra2;
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_3;
    }

    public spryge cfr_renamed_1486() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwjb(sprbne sprbne2) {
        void arg0;
        sprwjb sprwjb2 = this;
        void v1 = arg0;
        sprwjb sprwjb3 = this;
        this.cfr_renamed_2 = null;
        sprwjb3.cfr_renamed_3 = null;
        sprwjb3.cfr_renamed_4 = null;
        this.cfr_renamed_2 = spryge.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprwjb2.cfr_renamed_3 = sprije.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprwjb2.cfr_renamed_4 = (sprmra)sprbne2.cfr_renamed_85(2);
    }

    public sprmra cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprwjb sprwjb2 = this;
        sprlre2.cfr_renamed_49(sprwjb2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprwjb2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprwjb() {
        sprwjb sprwjb2 = this;
        this.cfr_renamed_2 = null;
        sprwjb2.cfr_renamed_3 = null;
        sprwjb2.cfr_renamed_4 = null;
    }

    public static sprwjb cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwjb) {
            return (sprwjb)arg0;
        }
        if (arg0 != null) {
            return new sprwjb(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


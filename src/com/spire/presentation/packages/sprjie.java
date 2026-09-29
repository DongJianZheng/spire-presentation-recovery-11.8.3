/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprjie
extends sprkra {
    public sprmra cfr_renamed_2;
    public sprije cfr_renamed_3;
    public sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprjie sprjie2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprjie2.cfr_renamed_2);
        if (sprjie2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjie(sprije sprije2, sprmra sprmra2) {
        void arg0;
        sprjie sprjie2 = this;
        sprjie2.cfr_renamed_3 = arg0;
        sprjie2.cfr_renamed_2 = sprmra2;
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_3;
    }

    public static sprjie cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprjie.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjie(sprbne sprbne2) {
        void arg0;
        sprjie sprjie2 = this;
        sprjie2.cfr_renamed_3 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprjie2.cfr_renamed_2 = (sprmra)sprbne2.cfr_renamed_85(1);
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sprbne.cfr_renamed_341((spryte)arg0.cfr_renamed_85(2), true);
        }
    }

    public sprbne cfr_renamed_626() {
        return this.cfr_renamed_4;
    }

    public static sprjie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjie) {
            return (sprjie)arg0;
        }
        if (arg0 != null) {
            return new sprjie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmra cfr_renamed_79() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprjie(sprije sprije2, sprmra sprmra2, sprbne sprbne2) {
        void arg1;
        void arg0;
        sprjie sprjie2 = this;
        this.cfr_renamed_3 = arg0;
        sprjie2.cfr_renamed_2 = arg1;
        sprjie2.cfr_renamed_4 = sprbne2;
    }
}


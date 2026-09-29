/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprige;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprsce
extends sprkra {
    private sprije cfr_renamed_1;
    private sprbne cfr_renamed_2;
    private sprige cfr_renamed_3;
    private sprmra cfr_renamed_4;

    public sprige cfr_renamed_4315() {
        return this.cfr_renamed_3;
    }

    public static sprsce cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprsce.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprmra cfr_renamed_79() {
        return this.cfr_renamed_4;
    }

    public sprbne cfr_renamed_626() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprsce sprsce2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        sprlre2.cfr_renamed_49(sprsce2.cfr_renamed_4);
        if (sprsce2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprsce(sprige sprige2, sprije sprije2, sprmra sprmra2, sprbne sprbne2) {
        void arg2;
        void arg1;
        void arg0;
        sprsce sprsce2 = this;
        sprsce sprsce3 = this;
        sprsce3.cfr_renamed_3 = arg0;
        sprsce3.cfr_renamed_1 = arg1;
        sprsce2.cfr_renamed_4 = arg2;
        sprsce2.cfr_renamed_2 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsce(sprbne sprbne2) {
        void arg0;
        sprsce sprsce2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = sprige.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprsce2.cfr_renamed_1 = sprije.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprsce2.cfr_renamed_4 = (sprmra)sprbne2.cfr_renamed_85(2);
        if (arg0.cfr_renamed_84() > 3) {
            this.cfr_renamed_2 = sprbne.cfr_renamed_341((spryte)arg0.cfr_renamed_85(3), true);
        }
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_1;
    }

    public static sprsce cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsce) {
            return (sprsce)arg0;
        }
        if (arg0 != null) {
            return new sprsce(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


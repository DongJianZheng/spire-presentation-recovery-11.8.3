/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprpae
extends sprkra {
    public sprxue cfr_renamed_1;
    public sprooe cfr_renamed_2;
    public sprxue cfr_renamed_3;
    public sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpae(sprije sprije2, sprxue sprxue2, sprxue sprxue3, sprooe sprooe2) {
        void arg2;
        void arg1;
        void arg0;
        sprpae sprpae2 = this;
        sprpae sprpae3 = this;
        sprpae3.cfr_renamed_4 = arg0;
        sprpae3.cfr_renamed_1 = arg1;
        sprpae2.cfr_renamed_3 = arg2;
        sprpae2.cfr_renamed_2 = sprooe2;
    }

    public static sprpae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpae) {
            return (sprpae)arg0;
        }
        if (arg0 != null) {
            return new sprpae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprpae sprpae2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprpae2.cfr_renamed_1);
        sprlre3.cfr_renamed_49(sprpae2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    public sprxue cfr_renamed_4306() {
        return this.cfr_renamed_3;
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_4;
    }

    public sprxue cfr_renamed_4302() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpae(sprbne sprbne2) {
        void arg0;
        sprpae sprpae2 = this;
        sprpae2.cfr_renamed_4 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprpae2.cfr_renamed_1 = (sprxue)sprbne2.cfr_renamed_85(1);
        this.cfr_renamed_3 = (sprxue)arg0.cfr_renamed_85(2);
        this.cfr_renamed_2 = (sprooe)arg0.cfr_renamed_85(3);
    }

    public static sprpae cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprpae.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}


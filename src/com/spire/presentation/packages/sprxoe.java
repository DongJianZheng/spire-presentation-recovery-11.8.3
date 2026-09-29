/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprsve;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprvme;
import com.spire.presentation.packages.sprvva;

public class sprxoe
extends sprkra {
    private sprszd cfr_renamed_0;
    private sprsve cfr_renamed_1;
    private sprrpe cfr_renamed_2;
    private sprvme cfr_renamed_3;
    private sprrpe cfr_renamed_4;

    private /* synthetic */ sprxoe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        sprxoe sprxoe2 = this;
        sprbne sprbne3 = arg0;
        this.cfr_renamed_3 = sprvme.cfr_renamed_23(sprbne3.cfr_renamed_85(0));
        sprxoe2.cfr_renamed_1 = sprsve.cfr_renamed_23(sprbne3.cfr_renamed_85(1));
        sprxoe2.cfr_renamed_4 = sprrpe.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_2 = sprrpe.cfr_renamed_23(sprbne2.cfr_renamed_85(3));
        if (sprbne2.cfr_renamed_84() > 4) {
            this.cfr_renamed_0 = sprszd.cfr_renamed_23(arg0.cfr_renamed_85(4));
        }
    }

    public sprszd cfr_renamed_4850() {
        return this.cfr_renamed_0;
    }

    public sprrpe cfr_renamed_4851() {
        return this.cfr_renamed_2;
    }

    public sprsve cfr_renamed_2443() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprxoe sprxoe2 = this;
        sprlre sprlre3 = sprlre2;
        sprxoe sprxoe3 = this;
        sprlre2.cfr_renamed_49(sprxoe3.cfr_renamed_3);
        sprlre3.cfr_renamed_49(sprxoe3.cfr_renamed_1);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprxoe2.cfr_renamed_2);
        if (sprxoe2.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        return new sprpse(sprlre2);
    }

    public sprrpe cfr_renamed_4852() {
        return this.cfr_renamed_4;
    }

    public sprvme cfr_renamed_648() {
        return this.cfr_renamed_3;
    }

    public static sprxoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxoe) {
            return (sprxoe)arg0;
        }
        if (arg0 != null) {
            return new sprxoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwke;
import com.spire.presentation.packages.spryte;

public class sprwae
extends sprkra {
    private sprrpe cfr_renamed_3;
    private sprwke cfr_renamed_4;

    private /* synthetic */ sprwae(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprrpe.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() > 1) {
            this.cfr_renamed_4 = sprwke.cfr_renamed_23(sprune.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), true));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprwae sprwae2 = this;
        sprlre2.cfr_renamed_49(sprwae2.cfr_renamed_3);
        if (sprwae2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    public static sprwae cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprwae.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprwae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwae) {
            return (sprwae)arg0;
        }
        if (arg0 != null) {
            return new sprwae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprwae(sprrpe sprrpe2, sprwke sprwke2) {
        void arg0;
        sprwae sprwae2 = this;
        sprwae2.cfr_renamed_3 = arg0;
        sprwae2.cfr_renamed_4 = sprwke2;
    }

    public sprrpe cfr_renamed_4274() {
        return this.cfr_renamed_3;
    }

    public sprwke cfr_renamed_4273() {
        return this.cfr_renamed_4;
    }
}


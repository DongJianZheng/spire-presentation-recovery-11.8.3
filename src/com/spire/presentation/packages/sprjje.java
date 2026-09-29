/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpae;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprjje
extends sprkra {
    public sprpae cfr_renamed_3;
    public sprszd cfr_renamed_4;

    public static sprjje cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprjje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprjje(sprpae sprpae2, sprszd sprszd2) {
        void arg0;
        sprjje sprjje2 = this;
        sprjje2.cfr_renamed_3 = arg0;
        sprjje2.cfr_renamed_4 = sprszd2;
    }

    public static sprjje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjje) {
            return (sprjje)arg0;
        }
        if (arg0 != null) {
            return new sprjje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprjje sprjje2 = this;
        sprlre2.cfr_renamed_49(sprjje2.cfr_renamed_3);
        if (sprjje2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    public sprpae cfr_renamed_4281() {
        return this.cfr_renamed_3;
    }

    public sprszd cfr_renamed_4282() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprjje(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprpae.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() == 2) {
            this.cfr_renamed_4 = sprszd.cfr_renamed_341((spryte)arg0.cfr_renamed_85(1), true);
        }
    }
}


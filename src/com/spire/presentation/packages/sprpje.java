/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sproge;
import com.spire.presentation.packages.sprpae;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprpje
extends sprkra {
    private sproge cfr_renamed_0;
    private sprpae cfr_renamed_1;
    private sprszd cfr_renamed_2;
    private sprrpe cfr_renamed_3;
    private sprrpe cfr_renamed_4;

    private /* synthetic */ sprpje(sprbne arg0) {
        sprbne sprbne2 = arg0;
        sprpje sprpje2 = this;
        sprpje2.cfr_renamed_1 = sprpae.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprpje2.cfr_renamed_0 = sproge.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_3 = sprrpe.cfr_renamed_23(sprbne2.cfr_renamed_85(2));
        if (sprbne2.cfr_renamed_84() > 4) {
            this.cfr_renamed_4 = sprrpe.cfr_renamed_341((spryte)arg0.cfr_renamed_85(3), true);
            this.cfr_renamed_2 = sprszd.cfr_renamed_341((spryte)arg0.cfr_renamed_85(4), true);
            return;
        }
        if (arg0.cfr_renamed_84() > 3) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(3);
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_4 = sprrpe.cfr_renamed_341(spryte2, true);
                return;
            }
            this.cfr_renamed_2 = sprszd.cfr_renamed_341(spryte2, true);
        }
    }

    public sprszd cfr_renamed_4271() {
        return this.cfr_renamed_2;
    }

    public sprrpe cfr_renamed_2132() {
        return this.cfr_renamed_3;
    }

    public sprrpe cfr_renamed_2133() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprpje(sprpae sprpae2, sproge sproge2, sprrpe sprrpe2, sprrpe sprrpe3, sprszd sprszd2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprpje sprpje2 = this;
        sprpje sprpje3 = this;
        this.cfr_renamed_1 = arg0;
        sprpje3.cfr_renamed_0 = arg1;
        sprpje3.cfr_renamed_3 = arg2;
        sprpje2.cfr_renamed_4 = arg3;
        sprpje2.cfr_renamed_2 = sprszd2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprpje sprpje2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        sprlre3.cfr_renamed_49(this.cfr_renamed_0);
        sprlre2.cfr_renamed_49(sprpje2.cfr_renamed_3);
        if (sprpje2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_4));
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    public static sprpje cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprpje.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprpae cfr_renamed_4270() {
        return this.cfr_renamed_1;
    }

    public static sprpje cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpje) {
            return (sprpje)arg0;
        }
        if (arg0 != null) {
            return new sprpje(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproge cfr_renamed_2161() {
        return this.cfr_renamed_0;
    }

    public sprpje(sprpae arg0, sproge arg1, sprrpe arg2, sprrpe arg3, sprude arg4) {
        this(arg0, arg1, arg2, arg3, sprszd.cfr_renamed_23(arg4));
    }
}


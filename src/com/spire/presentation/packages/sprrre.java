/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnoe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprupe;
import com.spire.presentation.packages.sprvva;

public class sprrre
extends sprkra {
    private sprupe cfr_renamed_2;
    private sprnoe cfr_renamed_3;
    private sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrre(int n, sprupe sprupe2, sprnoe sprnoe2) {
        this(new sprooe((long)arg0), (sprupe)arg1, (sprnoe)arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    public sprnoe cfr_renamed_4378() {
        return this.cfr_renamed_3;
    }

    public sprupe cfr_renamed_4351() {
        return this.cfr_renamed_2;
    }

    public sprooe cfr_renamed_4420() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprrre(sprooe sprooe2, sprupe sprupe2, sprnoe sprnoe2) {
        void arg1;
        void arg0;
        sprrre sprrre2 = this;
        this.cfr_renamed_4 = arg0;
        sprrre2.cfr_renamed_2 = arg1;
        sprrre2.cfr_renamed_3 = sprnoe2;
    }

    public static sprrre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrre) {
            return (sprrre)arg0;
        }
        if (arg0 != null) {
            return new sprrre(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprrre sprrre2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprrre2.cfr_renamed_2);
        if (sprrre2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprrre(sprbne arg0) {
        sprbne sprbne2 = arg0;
        sprrre sprrre2 = this;
        sprrre2.cfr_renamed_4 = new sprooe(sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_97());
        this.cfr_renamed_2 = sprupe.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
        if (sprbne2.cfr_renamed_84() > 2) {
            this.cfr_renamed_3 = sprnoe.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }
}


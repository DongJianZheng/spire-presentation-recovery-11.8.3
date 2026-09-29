/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmwe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprdve
extends sprkra {
    private sprmwe cfr_renamed_0;
    private sprxue cfr_renamed_1;
    private sprooe cfr_renamed_2;
    private sprcae cfr_renamed_3;
    private sprqre cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdve(sprbne sprbne2) {
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(v0.cfr_renamed_85(0));
        int n = 1;
        if (v0.cfr_renamed_85(1) instanceof sprcae) {
            this.cfr_renamed_3 = sprcae.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_85(n) instanceof sprmwe || arg0.cfr_renamed_85(n) instanceof sprbne) {
            this.cfr_renamed_0 = sprmwe.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (arg0.cfr_renamed_85(n) instanceof sprxue) {
            this.cfr_renamed_1 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        this.cfr_renamed_4 = sprqre.cfr_renamed_23(arg0.cfr_renamed_85(n));
    }

    public static sprdve cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprdve) {
            return (sprdve)arg0;
        }
        return new sprdve(sprbne.cfr_renamed_23(arg0));
    }

    public sprqre cfr_renamed_684() {
        return this.cfr_renamed_4;
    }

    public sprxue cfr_renamed_480() {
        return this.cfr_renamed_1;
    }

    public sprmwe cfr_renamed_683() {
        return this.cfr_renamed_0;
    }

    public sprcae cfr_renamed_695() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprdve sprdve2 = this;
        sprlre2.cfr_renamed_49(sprdve2.cfr_renamed_2);
        if (sprdve2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_0 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_0);
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        return new sprjve(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdve(sprcae sprcae2, sprmwe sprmwe2, sprxue sprxue2, sprqre sprqre2) {
        void arg2;
        void arg1;
        void arg0;
        sprdve sprdve2 = this;
        sprdve sprdve3 = this;
        sprdve sprdve4 = this;
        sprdve4.cfr_renamed_2 = new sprooe(1L);
        sprdve3.cfr_renamed_3 = arg0;
        sprdve3.cfr_renamed_0 = arg1;
        sprdve2.cfr_renamed_1 = arg2;
        sprdve2.cfr_renamed_4 = sprqre2;
    }
}


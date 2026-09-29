/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprrke
extends sprkra {
    public sprmee cfr_renamed_91;
    public sprooe cfr_renamed_0;
    public sprbne cfr_renamed_1;
    public sprszd cfr_renamed_2;
    private static final sprooe cfr_renamed_3 = new sprooe(0L);
    public boolean cfr_renamed_4;

    public sprszd cfr_renamed_3091() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprrke(sprmee sprmee2, sprbne sprbne2, sprude sprude2) {
        void arg1;
        void arg0;
        sprrke sprrke2 = this;
        this.cfr_renamed_0 = cfr_renamed_3;
        this.cfr_renamed_91 = arg0;
        sprrke2.cfr_renamed_1 = arg1;
        sprrke2.cfr_renamed_2 = sprszd.cfr_renamed_23(sprude2);
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_0;
    }

    public sprmee cfr_renamed_4296() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrke(sprbne sprbne2) {
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_85(0) instanceof spryte) {
            if (((spryte)arg0.cfr_renamed_85(0)).cfr_renamed_312() == 0) {
                sprrke sprrke2 = this;
                sprrke2.cfr_renamed_4 = true;
                ++n;
                sprrke2.cfr_renamed_0 = sprooe.cfr_renamed_341((spryte)arg0.cfr_renamed_85(0), true);
            } else {
                this.cfr_renamed_0 = cfr_renamed_3;
            }
        } else {
            this.cfr_renamed_0 = cfr_renamed_3;
        }
        if (arg0.cfr_renamed_85(n) instanceof spryte) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            ++n;
            this.cfr_renamed_91 = sprmee.cfr_renamed_341(spryte2, true);
        }
        this.cfr_renamed_1 = (sprbne)arg0.cfr_renamed_85(n);
        if (arg0.cfr_renamed_84() == ++n + 1) {
            this.cfr_renamed_2 = sprszd.cfr_renamed_341((spryte)arg0.cfr_renamed_85(n), true);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrke(sprmee sprmee2, sprbne sprbne2, sprszd sprszd2) {
        void arg1;
        void arg0;
        sprrke sprrke2 = this;
        this.cfr_renamed_0 = cfr_renamed_3;
        this.cfr_renamed_91 = arg0;
        sprrke2.cfr_renamed_1 = arg1;
        sprrke2.cfr_renamed_2 = sprszd2;
    }

    public sprbne cfr_renamed_4300() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (!this.cfr_renamed_0.equals(cfr_renamed_3) || this.cfr_renamed_4) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_0));
        }
        if (this.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_91));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    public static sprrke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrke) {
            return (sprrke)arg0;
        }
        if (arg0 != null) {
            return new sprrke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprrke cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprrke.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}


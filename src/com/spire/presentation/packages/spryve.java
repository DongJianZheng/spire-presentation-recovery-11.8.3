/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzra;

public class spryve
extends sprkra {
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ spryve(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprxue.cfr_renamed_23(sprbne2.cfr_renamed_85(0)).cfr_renamed_186();
        if (sprbne2.cfr_renamed_84() == 2) {
            this.cfr_renamed_3 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_97().intValue();
            return;
        }
        this.cfr_renamed_3 = 12;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_4));
        if (this.cfr_renamed_3 != 12) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public int cfr_renamed_4837() {
        return this.cfr_renamed_3;
    }

    public static spryve cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryve) {
            return (spryve)arg0;
        }
        if (arg0 != null) {
            return new spryve(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_596() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public spryve(byte[] byArray, int n) {
        void arg0;
        spryve spryve2 = this;
        spryve2.cfr_renamed_4 = sprzra.cfr_renamed_158((byte[])arg0);
        spryve2.cfr_renamed_3 = n;
    }
}


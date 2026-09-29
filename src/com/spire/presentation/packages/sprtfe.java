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

public class sprtfe
extends sprkra {
    public sprxue cfr_renamed_3;
    public sprooe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtfe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprxue)sprbne2.cfr_renamed_85(0);
        this.cfr_renamed_4 = (sprooe)arg0.cfr_renamed_85(1);
    }

    /*
     * WARNING - void declaration
     */
    public sprtfe(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprtfe sprtfe2 = this;
        this.cfr_renamed_3 = new sprlqe((byte[])arg0);
        sprtfe2.cfr_renamed_4 = new sprooe((long)arg1);
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    public int cfr_renamed_4600() {
        return this.cfr_renamed_4.cfr_renamed_97().intValue();
    }

    public static sprtfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtfe) {
            return (sprtfe)arg0;
        }
        if (arg0 != null) {
            return new sprtfe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


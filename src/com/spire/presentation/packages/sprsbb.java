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
import com.spire.presentation.packages.sprwsga;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzra;

public class sprsbb
extends sprkra {
    private byte[] cfr_renamed_3;
    private sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsbb(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwsga.cfr_renamed_9("-&$*~ 8o-*/oco")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprxue.cfr_renamed_23(v0.cfr_renamed_85(1)).cfr_renamed_186();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        return new sprpse(sprlre2);
    }

    public sprsbb(byte[] byArray) {
        sprsbb sprsbb2 = this;
        this.cfr_renamed_4 = new sprooe(0L);
        this.cfr_renamed_3 = byArray;
    }

    public byte[] cfr_renamed_1157() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprsbb cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsbb) {
            return (sprsbb)arg0;
        }
        if (arg0 != null) {
            return new sprsbb(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


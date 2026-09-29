/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class spride
extends sprkra {
    public byte[] cfr_renamed_3;
    public sprije cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public spride(sprije sprije2, byte[] byArray) {
        void arg0;
        spride spride2 = this;
        spride2.cfr_renamed_4 = arg0;
        spride2.cfr_renamed_3 = byArray;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_4;
    }

    public static spride cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spride) {
            return (spride)arg0;
        }
        if (arg0 != null) {
            return new spride(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spride(sprbne sprbne2) {
        void arg0;
        spride spride2 = this;
        spride2.cfr_renamed_4 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(0));
        spride2.cfr_renamed_3 = sprxue.cfr_renamed_23(sprbne2.cfr_renamed_85(1)).cfr_renamed_186();
    }

    public byte[] cfr_renamed_595() {
        return this.cfr_renamed_3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprxve
extends sprkra {
    private sprxue cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprxue cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxve(sprbne sprbne2) {
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_84() == 3) {
            this.cfr_renamed_3 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        sprxve sprxve2 = this;
        void v1 = arg0;
        sprxve2.cfr_renamed_4 = sprxue.cfr_renamed_23(v1.cfr_renamed_85(n));
        sprxve2.cfr_renamed_2 = sprxue.cfr_renamed_23(v1.cfr_renamed_85(++n));
    }

    public byte[] cfr_renamed_2366() {
        return this.cfr_renamed_2.cfr_renamed_186();
    }

    public static sprxve cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxve) {
            return (sprxve)arg0;
        }
        if (arg0 != null) {
            return new sprxve(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxve(sprije sprije2, byte[] byArray, byte[] byArray2) {
        void arg2;
        void arg1;
        this.cfr_renamed_3 = sprije2;
        sprxve sprxve2 = this;
        this.cfr_renamed_4 = new sprlqe((byte[])arg1);
        sprxve2.cfr_renamed_2 = new sprlqe((byte[])arg2);
    }

    public byte[] cfr_renamed_4894() {
        return this.cfr_renamed_4.cfr_renamed_186();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprxve sprxve2 = this;
        sprlre sprlre3 = sprlre2;
        sprxve2.cfr_renamed_4825(sprlre3, this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprxve2.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    public sprije cfr_renamed_4336() {
        return this.cfr_renamed_3;
    }

    public sprxve(byte[] arg0, byte[] arg1) {
        this(null, arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_4825(sprlre arg0, spra arg1) {
        if (arg1 != null) {
            arg0.cfr_renamed_49(arg1);
        }
    }
}


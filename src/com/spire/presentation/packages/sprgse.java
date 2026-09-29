/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprgse
extends sprkra {
    private sprije cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprxue cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public static sprgse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgse) {
            return (sprgse)arg0;
        }
        if (arg0 != null) {
            return new sprgse(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprije cfr_renamed_4336() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprgse sprgse2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprgse2.cfr_renamed_1);
        sprlre3.cfr_renamed_49(sprgse2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprgse(sprxue sprxue2, sprije sprije2, sprooe sprooe2, sprije sprije3) {
        void arg2;
        void arg1;
        void arg0;
        sprgse sprgse2 = this;
        sprgse sprgse3 = this;
        sprgse3.cfr_renamed_3 = arg0;
        sprgse3.cfr_renamed_1 = arg1;
        sprgse2.cfr_renamed_4 = arg2;
        sprgse2.cfr_renamed_2 = sprije3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgse(byte[] byArray, sprije sprije2, int n, sprije sprije3) {
        this(new sprlqe((byte[])arg0), (sprije)arg1, new sprooe((long)arg2), (sprije)arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
    }

    public sprije cfr_renamed_1472() {
        return this.cfr_renamed_2;
    }

    public sprxue cfr_renamed_1477() {
        return this.cfr_renamed_3;
    }

    public sprooe cfr_renamed_1478() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgse(sprbne sprbne2) {
        void arg0;
        sprgse sprgse2 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprije.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprgse2.cfr_renamed_4 = sprooe.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprgse2.cfr_renamed_2 = sprije.cfr_renamed_23(sprbne2.cfr_renamed_85(3));
    }
}


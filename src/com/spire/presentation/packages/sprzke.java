/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrje;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.util.Enumeration;

public class sprzke
extends sprkra {
    private sprrje cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprcae cfr_renamed_3;
    private sprxue cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprzke sprzke2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(sprzke2.cfr_renamed_4);
        if (sprzke2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprzke(sprbne arg0) {
        sprzke sprzke2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprzke2.cfr_renamed_1 = sprrje.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_2 = sprije.cfr_renamed_23(enumeration.nextElement());
        sprzke2.cfr_renamed_4 = sprxue.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_3 = sprcae.cfr_renamed_23(enumeration.nextElement());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzke(sprrje sprrje2, sprije sprije2, sprxue sprxue2, sprcae sprcae2) {
        void arg2;
        void arg1;
        void arg0;
        sprzke sprzke2 = this;
        sprzke sprzke3 = this;
        sprzke3.cfr_renamed_1 = arg0;
        sprzke3.cfr_renamed_2 = arg1;
        sprzke2.cfr_renamed_4 = arg2;
        sprzke2.cfr_renamed_3 = sprcae2;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_2;
    }

    public sprcae cfr_renamed_4498() {
        return this.cfr_renamed_3;
    }

    public sprrje cfr_renamed_4499() {
        return this.cfr_renamed_1;
    }

    public static sprzke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzke) {
            return (sprzke)arg0;
        }
        if (arg0 != null) {
            return new sprzke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxue cfr_renamed_4500() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzke(sprrje sprrje2, sprije sprije2, sprxue sprxue2) {
        void arg2;
        void arg1;
        void arg0;
        sprzke sprzke2 = this;
        sprzke sprzke3 = this;
        sprzke3.cfr_renamed_1 = arg0;
        sprzke3.cfr_renamed_2 = arg1;
        sprzke2.cfr_renamed_4 = arg2;
        sprzke2.cfr_renamed_3 = null;
    }
}


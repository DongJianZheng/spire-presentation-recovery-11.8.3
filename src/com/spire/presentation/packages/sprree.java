/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvje;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprree
extends sprkra {
    private sprvje cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private sprooe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprree sprree2 = this;
        sprlre2.cfr_renamed_49(sprree2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprree2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public BigInteger cfr_renamed_359() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public static sprree cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprree) {
            return (sprree)arg0;
        }
        if (arg0 != null) {
            return new sprree(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvje cfr_renamed_358() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprree(sprbne arg0) {
        sprree sprree2 = this;
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprree2.cfr_renamed_2 = sprvje.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_4 = sprooe.cfr_renamed_23(enumeration.nextElement());
        sprree2.cfr_renamed_3 = sprooe.cfr_renamed_23(enumeration.nextElement());
    }

    public BigInteger cfr_renamed_360() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprree(sprvje sprvje2, int n, int n2) {
        void arg2;
        void arg1;
        this.cfr_renamed_2 = sprvje2;
        sprree sprree2 = this;
        this.cfr_renamed_4 = new sprooe((long)arg1);
        sprree2.cfr_renamed_3 = new sprooe((long)arg2);
    }
}


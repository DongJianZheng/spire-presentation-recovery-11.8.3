/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrte;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprbte
extends sprkra {
    private sprxue cfr_renamed_1;
    private sprrte cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprxue cfr_renamed_4010() {
        return this.cfr_renamed_1;
    }

    public sprrte cfr_renamed_4020() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbte(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = (sprooe)sprbne2.cfr_renamed_85(0);
        sprbte sprbte2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sprrte.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprbte2.cfr_renamed_3 = sprije.cfr_renamed_23(v1.cfr_renamed_85(2));
        sprbte2.cfr_renamed_1 = (sprxue)arg0.cfr_renamed_85(3);
    }

    public sprije cfr_renamed_4000() {
        return this.cfr_renamed_3;
    }

    public static sprbte cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbte) {
            return (sprbte)arg0;
        }
        if (arg0 != null) {
            return new sprbte(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbte(sprrte sprrte2, sprije sprije2, sprxue sprxue2) {
        void arg2;
        void arg1;
        void arg0;
        sprbte sprbte2;
        if (sprrte2.cfr_renamed_119() instanceof spryte) {
            sprbte2 = this;
            this.cfr_renamed_4 = new sprooe(2L);
        } else {
            sprbte2 = this;
            this.cfr_renamed_4 = new sprooe(0L);
        }
        sprbte2.cfr_renamed_2 = arg0;
        sprbte sprbte3 = this;
        sprbte3.cfr_renamed_3 = arg1;
        sprbte3.cfr_renamed_1 = arg2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprbte sprbte2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprbte2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprbte2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        return new sprpse(sprlre2);
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_4;
    }
}


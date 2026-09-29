/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdee;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class sprvre
extends sprkra {
    private sprooe cfr_renamed_3;
    private spruhe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvre(spruib spruib2, sprooe sprooe2) {
        void arg0;
        sprvre sprvre2 = this;
        sprvre2.cfr_renamed_4 = spruhe.cfr_renamed_23(arg0);
        sprvre2.cfr_renamed_3 = sprooe2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvre(sprcge sprcge2) {
        void arg0;
        sprvre sprvre2 = this;
        sprvre2.cfr_renamed_4 = arg0.cfr_renamed_102();
        sprvre2.cfr_renamed_3 = sprcge2.cfr_renamed_114();
    }

    /*
     * WARNING - void declaration
     */
    public sprvre(spruhe spruhe2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_4 = spruhe2;
        sprvre sprvre2 = this;
        this.cfr_renamed_3 = new sprooe((BigInteger)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprvre(spruib spruib2, BigInteger bigInteger) {
        void arg1;
        this.cfr_renamed_4 = spruhe.cfr_renamed_23(spruib2);
        sprvre sprvre2 = this;
        this.cfr_renamed_3 = new sprooe((BigInteger)arg1);
    }

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvre(sprbne sprbne2) {
        void arg0;
        sprvre sprvre2 = this;
        sprvre2.cfr_renamed_4 = spruhe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprvre2.cfr_renamed_3 = (sprooe)sprbne2.cfr_renamed_85(1);
    }

    public static sprvre cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvre) {
            return (sprvre)arg0;
        }
        if (arg0 != null) {
            return new sprvre(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprvre(sprdee sprdee2) {
        void arg0;
        sprvre sprvre2 = this;
        sprvre2.cfr_renamed_4 = arg0.cfr_renamed_102();
        sprvre2.cfr_renamed_3 = sprdee2.cfr_renamed_114();
    }

    public spruhe cfr_renamed_313() {
        return this.cfr_renamed_4;
    }
}


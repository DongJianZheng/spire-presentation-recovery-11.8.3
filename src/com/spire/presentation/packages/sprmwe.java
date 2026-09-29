/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;

public class sprmwe
extends sprkra {
    private sprcae cfr_renamed_1;
    private sprxte cfr_renamed_2;
    private sprtre cfr_renamed_3;
    private sprnpe cfr_renamed_4;

    public boolean cfr_renamed_688() {
        return this.cfr_renamed_4.cfr_renamed_587();
    }

    public sprtre cfr_renamed_671() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmwe(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = sprnpe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        int n = 1;
        if (1 < arg0.cfr_renamed_84() && arg0.cfr_renamed_85(n) instanceof sprxte) {
            this.cfr_renamed_2 = sprxte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84() && arg0.cfr_renamed_85(n) instanceof sprcae) {
            this.cfr_renamed_1 = sprcae.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
        if (n < arg0.cfr_renamed_84()) {
            this.cfr_renamed_3 = sprtre.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
        }
    }

    public sprxte cfr_renamed_678() {
        return this.cfr_renamed_2;
    }

    public sprcae cfr_renamed_675() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprmwe sprmwe2 = this;
        sprlre2.cfr_renamed_49(sprmwe2.cfr_renamed_4);
        if (sprmwe2.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprmwe(sprnpe sprnpe2, sprxte sprxte2, sprcae sprcae2, sprtre sprtre2) {
        void arg2;
        void arg1;
        void arg0;
        sprmwe sprmwe2 = this;
        sprmwe sprmwe3 = this;
        sprmwe3.cfr_renamed_4 = arg0;
        sprmwe3.cfr_renamed_2 = arg1;
        sprmwe2.cfr_renamed_1 = arg2;
        sprmwe2.cfr_renamed_3 = sprtre2;
    }

    public static sprmwe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmwe) {
            return (sprmwe)arg0;
        }
        if (arg0 != null) {
            return new sprmwe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


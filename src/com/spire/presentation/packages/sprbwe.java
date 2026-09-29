/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;

public class sprbwe
extends sprkra {
    private sprooe cfr_renamed_2;
    private sprere cfr_renamed_3;
    private spreoe cfr_renamed_4;

    public sprbwe(spreoe arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprbwe(spreoe spreoe2, sprere sprere2) {
        void arg0;
        void arg1;
        sprbwe sprbwe2 = this;
        sprbwe2.cfr_renamed_2 = new sprooe(arg1 == null ? 0L : 2L);
        sprbwe sprbwe3 = this;
        sprbwe3.cfr_renamed_4 = arg0;
        sprbwe3.cfr_renamed_3 = arg1;
    }

    public spreoe cfr_renamed_4172() {
        return this.cfr_renamed_4;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public static sprbwe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbwe) {
            return (sprbwe)arg0;
        }
        if (arg0 != null) {
            return new sprbwe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprbwe sprbwe2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(sprbwe2.cfr_renamed_4);
        if (sprbwe2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprdpe(false, 1, this.cfr_renamed_3));
        }
        return new sprjve(sprlre2);
    }

    public sprere cfr_renamed_4176() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprbwe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = spreoe.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
        if (sprbne2.cfr_renamed_84() == 3) {
            this.cfr_renamed_3 = sprere.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }
}


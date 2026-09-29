/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;

public class sprspe
extends sprkra {
    private final spra cfr_renamed_3;
    private final sprmke cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprspe sprspe2 = this;
        sprlre2.cfr_renamed_49(sprspe2.cfr_renamed_4);
        if (sprspe2.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprspe(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_4 = sprmke.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
        if (sprbne2.cfr_renamed_84() > 1) {
            if (!(arg0.cfr_renamed_85(1) instanceof sprxte)) {
                this.cfr_renamed_3 = sprmee.cfr_renamed_23(arg0.cfr_renamed_85(1));
                return;
            }
            this.cfr_renamed_3 = arg0.cfr_renamed_85(1);
            return;
        }
        this.cfr_renamed_3 = null;
    }

    public boolean cfr_renamed_4815() {
        return this.cfr_renamed_3 instanceof sprxte;
    }

    /*
     * WARNING - void declaration
     */
    public sprspe(sprmke sprmke2, sprmee sprmee2) {
        void arg0;
        sprspe sprspe2 = this;
        sprspe2.cfr_renamed_4 = arg0;
        sprspe2.cfr_renamed_3 = sprmee2;
    }

    public spra cfr_renamed_4028() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprspe(sprmke sprmke2) {
        void arg0;
        sprspe sprspe2 = this;
        sprspe2.cfr_renamed_4 = arg0;
        sprspe2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprspe(sprmke sprmke2, sprxte sprxte2) {
        void arg0;
        sprspe sprspe2 = this;
        sprspe2.cfr_renamed_4 = arg0;
        sprspe2.cfr_renamed_3 = sprxte2;
    }

    public boolean cfr_renamed_4816() {
        return this.cfr_renamed_3 != null;
    }

    public sprmke cfr_renamed_1369() {
        return this.cfr_renamed_4;
    }

    public static sprspe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprspe) {
            return (sprspe)arg0;
        }
        if (arg0 != null) {
            return new sprspe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


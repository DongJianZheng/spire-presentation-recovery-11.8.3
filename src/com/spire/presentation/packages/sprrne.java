/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.sprvva;

public class sprrne
extends sprkra {
    private sprtne cfr_renamed_2;
    private sprtne cfr_renamed_3;
    private sprtne cfr_renamed_4;

    public sprtne cfr_renamed_4900() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprrne sprrne2 = this;
        sprlre2.cfr_renamed_49(sprrne2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprrne2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrne(sprtne sprtne2, sprtne sprtne3, sprtne sprtne4) {
        void arg1;
        void arg0;
        sprrne sprrne2 = this;
        this.cfr_renamed_2 = arg0;
        sprrne2.cfr_renamed_3 = arg1;
        sprrne2.cfr_renamed_4 = sprtne4;
    }

    public sprtne cfr_renamed_4901() {
        return this.cfr_renamed_3;
    }

    public static sprrne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrne) {
            return (sprrne)arg0;
        }
        if (arg0 != null) {
            return new sprrne(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrne(sprbne sprbne2) {
        void arg0;
        sprrne sprrne2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = sprtne.cfr_renamed_23(v1.cfr_renamed_85(0));
        sprrne2.cfr_renamed_3 = sprtne.cfr_renamed_23(v1.cfr_renamed_85(1));
        sprrne2.cfr_renamed_4 = sprtne.cfr_renamed_23(sprbne2.cfr_renamed_85(2));
    }

    public sprtne cfr_renamed_4902() {
        return this.cfr_renamed_2;
    }
}


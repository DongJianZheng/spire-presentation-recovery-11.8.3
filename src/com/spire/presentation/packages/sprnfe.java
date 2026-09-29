/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.spruee;
import com.spire.presentation.packages.sprvva;

public class sprnfe
extends sprkra {
    public spruee cfr_renamed_2;
    public sprmra cfr_renamed_3;
    public sprije cfr_renamed_4;

    public static sprnfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnfe) {
            return (sprnfe)arg0;
        }
        if (arg0 != null) {
            return new sprnfe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmra cfr_renamed_80() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprnfe sprnfe2 = this;
        sprlre2.cfr_renamed_49(sprnfe2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(sprnfe2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprpse(sprlre2);
    }

    public spruee cfr_renamed_83() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnfe(spruee spruee2, sprije sprije2, sprmra sprmra2) {
        void arg1;
        void arg0;
        sprnfe sprnfe2 = this;
        this.cfr_renamed_2 = arg0;
        sprnfe2.cfr_renamed_4 = arg1;
        sprnfe2.cfr_renamed_3 = sprmra2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnfe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtkm.cfr_renamed_9("\u001dB;\u0003,F.V:M<F\u007fP6Y:\u0019\u007f")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_2 = spruee.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprije.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_3 = sprmra.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_4;
    }
}


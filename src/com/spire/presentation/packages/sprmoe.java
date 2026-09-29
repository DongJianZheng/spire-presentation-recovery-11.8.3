/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprmoe
extends sprkra {
    private sprije cfr_renamed_3;
    private sprmra cfr_renamed_4;

    public static sprmoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmoe) {
            return (sprmoe)arg0;
        }
        if (arg0 != null) {
            return new sprmoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmoe(sprgse sprgse2, sprmra sprmra2) {
        this(new sprije(sprsd.cfr_renamed_79, (spra)arg0), (sprmra)arg1);
        void arg1;
        void arg0;
    }

    public sprije cfr_renamed_4333() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprmra cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmoe(sprije sprije2, sprmra sprmra2) {
        void arg0;
        sprmoe sprmoe2 = this;
        sprmoe2.cfr_renamed_3 = arg0;
        sprmoe2.cfr_renamed_4 = sprmra2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmoe(sprbne sprbne2) {
        void arg0;
        sprmoe sprmoe2 = this;
        sprmoe2.cfr_renamed_3 = sprije.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprmoe2.cfr_renamed_4 = sprmra.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
    }

    public static sprmoe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmoe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}


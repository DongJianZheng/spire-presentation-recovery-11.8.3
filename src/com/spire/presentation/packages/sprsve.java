/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprsve
extends sprkra {
    private sprmee cfr_renamed_3;
    private sprooe cfr_renamed_4;

    public sprooe cfr_renamed_114() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprsve(sprmee sprmee2, sprooe sprooe2) {
        void arg0;
        sprsve sprsve2 = this;
        sprsve2.cfr_renamed_3 = arg0;
        sprsve2.cfr_renamed_4 = sprooe2;
    }

    public sprmee cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public static sprsve cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsve) {
            return (sprsve)arg0;
        }
        if (arg0 != null) {
            return new sprsve(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsve(sprbne sprbne2) {
        void arg0;
        sprsve sprsve2 = this;
        sprsve2.cfr_renamed_3 = sprmee.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprsve2.cfr_renamed_4 = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
    }

    public static sprsve cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprsve.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprsve(sprmee arg0, BigInteger arg1) {
        this(arg0, new sprooe(arg1));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtoe;
import com.spire.presentation.packages.sprvva;

public class sprole
extends sprkra {
    private sprbne cfr_renamed_3;
    private sprooe cfr_renamed_4;

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
    private /* synthetic */ sprole(sprbne sprbne2) {
        void arg0;
        sprole sprole2 = this;
        sprole2.cfr_renamed_4 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprole2.cfr_renamed_3 = sprbne.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
    }

    public sprooe cfr_renamed_4812() {
        return this.cfr_renamed_4;
    }

    public sprtoe[] cfr_renamed_4813() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprtoe[] sprtoeArray = new sprtoe[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprtoeArray.length) {
            int n3 = n++;
            sprtoeArray[n3] = sprtoe.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprtoeArray;
    }

    public static sprole cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprole) {
            return (sprole)arg0;
        }
        if (arg0 != null) {
            return new sprole(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


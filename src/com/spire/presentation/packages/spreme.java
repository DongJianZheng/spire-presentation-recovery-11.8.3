/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsve;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class spreme
extends sprkra {
    private sprsve cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprmra cfr_renamed_4;

    public sprije cfr_renamed_4881() {
        return this.cfr_renamed_3;
    }

    public spreme(sprije arg0, sprsve arg1, byte[] arg2) {
        this(arg0, arg1, new sprmra(arg2));
    }

    public sprsve cfr_renamed_2443() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public spreme(sprije sprije2, sprsve sprsve2, sprmra sprmra2) {
        void arg1;
        void arg0;
        spreme spreme2 = this;
        this.cfr_renamed_3 = arg0;
        spreme2.cfr_renamed_2 = arg1;
        spreme2.cfr_renamed_4 = sprmra2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spreme spreme2 = this;
        sprlre sprlre3 = sprlre2;
        spreme spreme3 = this;
        spreme3.cfr_renamed_4814(sprlre2, 0, spreme3.cfr_renamed_3);
        spreme2.cfr_renamed_4814(sprlre3, 1, this.cfr_renamed_2);
        sprlre3.cfr_renamed_49(spreme2.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public static spreme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreme) {
            return (spreme)arg0;
        }
        if (arg0 != null) {
            return new spreme(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmra cfr_renamed_4882() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_4814(sprlre arg0, int arg1, spra arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_49(new sprhse(true, arg1, arg2));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spreme(sprbne sprbne2) {
        int n;
        sprbne sprbne3 = sprbne2;
        int n2 = sprbne3.cfr_renamed_84() - 1;
        this.cfr_renamed_4 = sprmra.cfr_renamed_23(sprbne3.cfr_renamed_85(n2));
        int n3 = n = --n2;
        while (n3 >= 0) {
            void arg0;
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            if (spryte2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = sprije.cfr_renamed_341(spryte2, true);
            } else {
                this.cfr_renamed_2 = sprsve.cfr_renamed_341(spryte2, true);
            }
            n3 = --n;
        }
    }
}


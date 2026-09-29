/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhle;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprvva;

public class sprzie
extends sprkra {
    private boolean cfr_renamed_3;
    private sproce[] cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4[n++]);
            n2 = n;
        }
        if (this.cfr_renamed_3) {
            return new sprjve(sprlre2);
        }
        return new sprhle(sprlre2);
    }

    public sprzie(sproce[] sproceArray) {
        sprzie sprzie2 = this;
        sprzie2.cfr_renamed_3 = true;
        sprzie2.cfr_renamed_4 = sproceArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzie(sprbne sprbne2) {
        void arg0;
        int n;
        sprzie sprzie2 = this;
        sprzie2.cfr_renamed_3 = true;
        sprzie2.cfr_renamed_4 = new sproce[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sproce.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        this.cfr_renamed_3 = arg0 instanceof sprjve;
    }

    public static sprzie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzie) {
            return (sprzie)arg0;
        }
        if (arg0 != null) {
            return new sprzie(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproce[] cfr_renamed_2442() {
        return this.cfr_renamed_4;
    }
}


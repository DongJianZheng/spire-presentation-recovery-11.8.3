/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprbue
extends sprkra {
    private sprbne cfr_renamed_4;

    private /* synthetic */ sprbue(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbue(sproje sproje2) {
        void arg0;
        sprbue sprbue2 = this;
        sprbue2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

    public static sprbue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbue) {
            return (sprbue)arg0;
        }
        if (arg0 != null) {
            return new sprbue(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproje[] cfr_renamed_4891() {
        int n;
        sproje[] sprojeArray = new sproje[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprojeArray.length) {
            int n3 = n++;
            sprojeArray[n3] = sproje.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprojeArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}


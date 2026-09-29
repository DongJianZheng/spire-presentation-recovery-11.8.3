/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;

public class sprsne
extends sprkra {
    private sprbne cfr_renamed_4;

    public static sprsne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsne) {
            return (sprsne)arg0;
        }
        if (arg0 != null) {
            return new sprsne(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprfse[] cfr_renamed_4426() {
        int n;
        sprfse[] sprfseArray = new sprfse[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprfseArray.length) {
            int n3 = n++;
            sprfseArray[n3] = sprfse.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprfseArray;
    }

    private /* synthetic */ sprsne(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }
}


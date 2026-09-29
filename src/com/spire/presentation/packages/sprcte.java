/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;

public class sprcte
extends sprkra {
    private sprbne cfr_renamed_4;

    public sprooe[] cfr_renamed_4853() {
        int n;
        sprooe[] sprooeArray = new sprooe[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprooeArray.length) {
            int n3 = n++;
            sprooeArray[n3] = sprooe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprooeArray;
    }

    private /* synthetic */ sprcte(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    public static sprcte cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprcte) {
            return (sprcte)arg0;
        }
        if (arg0 != null) {
            return new sprcte(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}


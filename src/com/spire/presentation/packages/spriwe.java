/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxve;

public class spriwe
extends sprkra {
    private sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprxve[] cfr_renamed_4854() {
        int n;
        sprxve[] sprxveArray = new sprxve[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprxveArray.length) {
            int n3 = n++;
            sprxveArray[n3] = sprxve.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprxveArray;
    }

    public static spriwe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriwe) {
            return (spriwe)arg0;
        }
        if (arg0 != null) {
            return new spriwe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ spriwe(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }
}


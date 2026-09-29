/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdje;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprode
extends sprkra {
    public sprbne cfr_renamed_4;

    public sprode(sprdje[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprode cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprode) {
            return (sprode)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprode(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprode(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    public sprdje cfr_renamed_4652(int arg0) {
        return sprdje.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(arg0));
    }
}


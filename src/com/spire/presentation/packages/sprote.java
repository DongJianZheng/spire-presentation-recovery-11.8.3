/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqoe;
import com.spire.presentation.packages.sprvva;

public class sprote
extends sprkra {
    private sprbne cfr_renamed_4;

    private /* synthetic */ sprote(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    /*
     * WARNING - void declaration
     */
    public sprote(sprqoe sprqoe2) {
        void arg0;
        sprote sprote2 = this;
        sprote2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

    public sprqoe[] cfr_renamed_4827() {
        int n;
        sprqoe[] sprqoeArray = new sprqoe[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqoeArray.length) {
            int n3 = n++;
            sprqoeArray[n3] = sprqoe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprqoeArray;
    }

    public sprote(sprqoe[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprote cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprote) {
            return (sprote)arg0;
        }
        if (arg0 != null) {
            return new sprote(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


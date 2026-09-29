/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfoe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprnoe
extends sprkra {
    private sprbne cfr_renamed_4;

    public sprnoe(sprfoe[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    private /* synthetic */ sprnoe(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprfoe[] cfr_renamed_4377() {
        int n;
        sprfoe[] sprfoeArray = new sprfoe[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprfoeArray.length) {
            int n3 = n++;
            sprfoeArray[n3] = sprfoe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprfoeArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprnoe(sprfoe sprfoe2) {
        void arg0;
        sprnoe sprnoe2 = this;
        sprnoe2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

    public static sprnoe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnoe) {
            return (sprnoe)arg0;
        }
        if (arg0 != null) {
            return new sprnoe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


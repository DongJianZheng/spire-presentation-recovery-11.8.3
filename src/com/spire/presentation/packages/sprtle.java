/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprare;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;

public class sprtle
extends sprkra {
    private sprbne cfr_renamed_4;

    public static sprtle cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtle) {
            return (sprtle)arg0;
        }
        if (arg0 != null) {
            return new sprtle(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprare[] cfr_renamed_4888() {
        int n;
        sprare[] sprareArray = new sprare[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprareArray.length) {
            int n3 = n++;
            sprareArray[n3] = sprare.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprareArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtle(sprare sprare2) {
        void arg0;
        sprtle sprtle2 = this;
        sprtle2.cfr_renamed_4 = new sprpse((spra)arg0);
    }

    public sprtle(sprare[] arg0) {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprlre2.cfr_renamed_49(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    private /* synthetic */ sprtle(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }
}


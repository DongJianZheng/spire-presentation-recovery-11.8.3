/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqge;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprnke
extends sprkra {
    private sprere cfr_renamed_4;

    public sprqge[] cfr_renamed_4540() {
        int n;
        sprqge[] sprqgeArray = new sprqge[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqgeArray.length) {
            int n3 = n++;
            sprqgeArray[n3] = sprqge.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprqgeArray;
    }

    public sprqge cfr_renamed_4541() {
        if (this.cfr_renamed_4.cfr_renamed_84() == 0) {
            return null;
        }
        return sprqge.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(0));
    }

    public sprnke(sprtzd sprtzd2, spra spra2) {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(sprtzd2);
        sprlre3.cfr_renamed_49(spra2);
        sprnke sprnke2 = this;
        sprnke2.cfr_renamed_4 = new sprcwe(new sprpse(sprlre2));
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    private /* synthetic */ sprnke(sprere sprere2) {
        this.cfr_renamed_4 = sprere2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnke(sprqge sprqge2) {
        void arg0;
        sprnke sprnke2 = this;
        sprnke2.cfr_renamed_4 = new sprcwe((spra)arg0);
    }

    public static sprnke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnke) {
            return (sprnke)arg0;
        }
        if (arg0 != null) {
            return new sprnke(sprere.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnke(sprqge[] sprqgeArray) {
        void arg0;
        sprnke sprnke2 = this;
        sprnke2.cfr_renamed_4 = new sprcwe((spra[])arg0);
    }

    public boolean cfr_renamed_4539() {
        return this.cfr_renamed_4.cfr_renamed_84() > 1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprede;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class spruae
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spruae(String string) {
        void arg0;
        this.cfr_renamed_3 = sprede.cfr_renamed_4;
        spruae spruae2 = this;
        spruae2.cfr_renamed_4 = new sprcae((String)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruae(sprtzd sprtzd2, spra spra2) {
        void arg0;
        spruae spruae2 = this;
        spruae2.cfr_renamed_3 = arg0;
        spruae2.cfr_renamed_4 = spra2;
    }

    /*
     * WARNING - void declaration
     */
    public spruae(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprizc.cfr_renamed_9("\\}z<myoi{r}y>owf{&>")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprtzd.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = v0.cfr_renamed_85(1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprtzd cfr_renamed_4501() {
        return this.cfr_renamed_3;
    }

    public spra cfr_renamed_4502() {
        return this.cfr_renamed_4;
    }

    public static spruae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruae) {
            return (spruae)arg0;
        }
        if (arg0 != null) {
            return new spruae(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


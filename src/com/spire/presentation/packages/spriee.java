/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spran;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spree;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.util.Enumeration;

public class spriee
extends sprkra
implements spree,
spran {
    public spra cfr_renamed_112;
    public sprtzd cfr_renamed_119;

    public spra cfr_renamed_357() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public spriee(sprtzd sprtzd2) {
        void arg0;
        spriee spriee2 = this;
        spriee2.cfr_renamed_119 = arg0;
        spriee2.cfr_renamed_112 = null;
    }

    public sprtzd cfr_renamed_356() {
        return this.cfr_renamed_119;
    }

    public static spriee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spriee) {
            return (spriee)arg0;
        }
        if (arg0 != null) {
            return new spriee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ spriee(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_119 = sprtzd.cfr_renamed_23(enumeration.nextElement());
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_112 = (spra)enumeration.nextElement();
        }
    }

    /*
     * WARNING - void declaration
     */
    public spriee(sprtzd sprtzd2, spra spra2) {
        void arg0;
        spriee spriee2 = this;
        spriee2.cfr_renamed_119 = arg0;
        spriee2.cfr_renamed_112 = spra2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        spriee spriee2 = this;
        sprlre2.cfr_renamed_49(spriee2.cfr_renamed_119);
        if (spriee2.cfr_renamed_112 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_112);
        }
        return new sprpse(sprlre2);
    }
}


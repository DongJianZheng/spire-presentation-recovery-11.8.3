/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprlfe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzje;
import java.util.Enumeration;

public class sprdfe
extends sprije
implements sprm {
    private sprzje cfr_renamed_805;
    private sprlfe cfr_renamed_131;
    private sprtzd cfr_renamed_722;

    /*
     * WARNING - void declaration
     */
    public sprdfe(sprbne sprbne2) {
        super((sprbne)arg0);
        sprdfe sprdfe2;
        void arg0;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_722 = (sprtzd)enumeration.nextElement();
        enumeration = ((sprbne)enumeration.nextElement()).cfr_renamed_329();
        sprbne sprbne3 = (sprbne)enumeration.nextElement();
        if (sprbne3.cfr_renamed_85(0).equals(cfr_renamed_1217)) {
            sprdfe2 = this;
            this.cfr_renamed_805 = new sprzje(cfr_renamed_1217, sprkee.cfr_renamed_23(sprbne3.cfr_renamed_85(1)));
        } else {
            sprdfe2 = this;
            this.cfr_renamed_805 = sprzje.cfr_renamed_23(sprbne3);
        }
        sprdfe2.cfr_renamed_131 = sprlfe.cfr_renamed_23(enumeration.nextElement());
    }

    public sprvva cfr_renamed_4601() {
        sprlre sprlre2 = new sprlre();
        sprlre sprlre3 = new sprlre();
        sprlre sprlre4 = sprlre2;
        sprlre4.cfr_renamed_49(this.cfr_renamed_722);
        sprlre3.cfr_renamed_49(this.cfr_renamed_805);
        sprlre3.cfr_renamed_49(this.cfr_renamed_131);
        sprlre sprlre5 = sprlre2;
        sprlre4.cfr_renamed_49(new sprpse(sprlre3));
        return new sprpse(sprlre2);
    }

    @Override
    public sprtzd cfr_renamed_90() {
        return this.cfr_renamed_722;
    }

    public sprlfe cfr_renamed_2430() {
        return this.cfr_renamed_131;
    }

    public sprzje cfr_renamed_2429() {
        return this.cfr_renamed_805;
    }
}


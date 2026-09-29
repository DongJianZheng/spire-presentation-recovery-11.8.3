/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlfe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzje;
import java.util.Enumeration;

public class sprgbe
extends sprkra
implements sprm {
    private sprzje cfr_renamed_3;
    private sprlfe cfr_renamed_4;

    public sprzje cfr_renamed_2429() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgbe(sprzje sprzje2, sprlfe sprlfe2) {
        void arg0;
        sprgbe sprgbe2 = this;
        sprgbe2.cfr_renamed_3 = arg0;
        sprgbe2.cfr_renamed_4 = sprlfe2;
    }

    public static sprgbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgbe) {
            return (sprgbe)arg0;
        }
        if (arg0 != null) {
            return new sprgbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    private /* synthetic */ sprgbe(sprbne sprbne2) {
        sprgbe sprgbe2;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        sprbne sprbne3 = sprbne.cfr_renamed_23(((spra)enumeration.nextElement()).cfr_renamed_119());
        if (sprbne3.cfr_renamed_85(0).equals(cfr_renamed_1217)) {
            sprgbe2 = this;
            this.cfr_renamed_3 = new sprzje(cfr_renamed_1217, sprkee.cfr_renamed_23(sprbne3.cfr_renamed_85(1)));
        } else {
            sprgbe2 = this;
            this.cfr_renamed_3 = sprzje.cfr_renamed_23(sprbne3);
        }
        sprgbe2.cfr_renamed_4 = sprlfe.cfr_renamed_23(enumeration.nextElement());
    }

    public sprlfe cfr_renamed_2430() {
        return this.cfr_renamed_4;
    }
}


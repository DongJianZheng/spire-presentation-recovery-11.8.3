/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdfq;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;

public class sprdge
extends sprkra {
    public sprrpe cfr_renamed_3;
    public sprrpe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdge(sprrpe sprrpe2, sprrpe sprrpe3) {
        void arg0;
        sprdge sprdge2 = this;
        sprdge2.cfr_renamed_3 = arg0;
        sprdge2.cfr_renamed_4 = sprrpe3;
    }

    public sprrpe cfr_renamed_109() {
        return this.cfr_renamed_4;
    }

    public sprrpe cfr_renamed_111() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdge(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfq.cfr_renamed_9("S\u000fuNb\u000b`\u001bt\u0000r\u000b1\u001dx\u0014tT1")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprrpe.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprrpe.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public static sprdge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdge) {
            return (sprdge)arg0;
        }
        if (arg0 != null) {
            return new sprdge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


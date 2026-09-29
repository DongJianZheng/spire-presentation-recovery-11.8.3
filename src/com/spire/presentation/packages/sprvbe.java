/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprluda;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class sprvbe
extends sprkra {
    public sprvva cfr_renamed_2;
    public sprbne cfr_renamed_3;
    public sprtzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvbe(sprbne sprbne2) {
        void arg0;
        if (((sprooe)sprbne2.cfr_renamed_85(0)).cfr_renamed_97().intValue() != 0) {
            throw new IllegalArgumentException(sprluda.cfr_renamed_9("x4z$n?h4+?d%+'n#x8d?+a"));
        }
        this.cfr_renamed_3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprooe(0L));
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        return new sprjve(sprlre2);
    }

    public static sprvbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvbe) {
            return (sprvbe)arg0;
        }
        if (arg0 != null) {
            return new sprvbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxue cfr_renamed_480() {
        if (this.cfr_renamed_3.cfr_renamed_84() == 3) {
            return sprxue.cfr_renamed_341(spryte.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(2)), false);
        }
        return null;
    }

    public sprtzd cfr_renamed_696() {
        return sprtzd.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(0));
    }

    public sprije cfr_renamed_1445() {
        return sprije.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(1));
    }

    public sprvbe(sprtzd arg0, sprije arg1, spra arg2) {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(arg1.cfr_renamed_119());
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprdpe(0 != 0, 0, arg2));
        this.cfr_renamed_3 = new sprjve(sprlre2);
    }
}


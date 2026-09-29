/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdpo;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprtge
extends sprkra {
    public static final sprtzd cfr_renamed_93;
    public static final sprtzd cfr_renamed_86;
    private spra cfr_renamed_152;
    public static final sprtzd cfr_renamed_112;
    public static final sprtzd cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    private sprtzd cfr_renamed_2;
    public static final sprtzd cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    public spra cfr_renamed_284() {
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    public sprtge(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_2 = (sprtzd)sprbne2.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            this.cfr_renamed_152 = (sprvva)arg0.cfr_renamed_85(1);
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprtge sprtge2 = this;
        sprlre2.cfr_renamed_49(sprtge2.cfr_renamed_2);
        if (sprtge2.cfr_renamed_152 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_152);
        }
        return new sprpse(sprlre2);
    }

    static {
        cfr_renamed_86 = sprm.cfr_renamed_152;
        cfr_renamed_93 = sprm.cfr_renamed_1600;
        cfr_renamed_1 = sprm.cfr_renamed_272;
        cfr_renamed_4 = new sprtzd("1.3.14.3.2.7");
        cfr_renamed_119 = sprm.cfr_renamed_1262;
        cfr_renamed_0 = sprm.cfr_renamed_1435;
        cfr_renamed_3 = sprdg.cfr_renamed_287;
        cfr_renamed_112 = sprdg.cfr_renamed_152;
        cfr_renamed_91 = sprdg.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     */
    public sprtge(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprtge sprtge2 = this;
        sprtge2.cfr_renamed_2 = arg0;
        sprtge2.cfr_renamed_152 = spra2;
    }

    public static sprtge cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtge) {
            return (sprtge)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprtge((sprbne)arg0);
        }
        throw new IllegalArgumentException(sprdpo.cfr_renamed_9("THkGqOy\u0006NkTkXe|V|DtJtRd"));
    }

    public sprtzd cfr_renamed_4590() {
        return this.cfr_renamed_2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprage;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdqz;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;

public class sprgde
extends sprkra
implements sprm {
    private sproce cfr_renamed_3;
    private sprage cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgde(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_4 = null;
        if (((sprooe)sprbne2.cfr_renamed_85(0)).cfr_renamed_97().intValue() != 3) {
            throw new IllegalArgumentException(sprdqz.cfr_renamed_9("{/c3k}z8~.e2b}j2~}\\\u001bT}\\\u0019Y"));
        }
        this.cfr_renamed_3 = sproce.cfr_renamed_23(arg0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sprage.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprgde sprgde2 = this;
        sprlre2.cfr_renamed_49(new sprooe(3L));
        sprlre2.cfr_renamed_49(sprgde2.cfr_renamed_3);
        if (sprgde2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprjve(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprgde(sproce sproce2, sprage sprage2) {
        void arg0;
        sprgde sprgde2 = this;
        this.cfr_renamed_4 = null;
        sprgde2.cfr_renamed_3 = arg0;
        sprgde2.cfr_renamed_4 = sprage2;
    }

    public sprage cfr_renamed_1470() {
        return this.cfr_renamed_4;
    }

    public sproce cfr_renamed_1475() {
        return this.cfr_renamed_3;
    }

    public static sprgde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgde) {
            return (sprgde)arg0;
        }
        if (arg0 != null) {
            return new sprgde(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}


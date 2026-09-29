/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprmqe
extends sprkra {
    private sprtzd cfr_renamed_3;
    private spra cfr_renamed_4;

    public static sprmqe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmqe) {
            return (sprmqe)arg0;
        }
        if (arg0 != null) {
            return new sprmqe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmqe(sprtzd sprtzd2, spra spra2) {
        void arg0;
        sprmqe sprmqe2 = this;
        sprmqe2.cfr_renamed_3 = arg0;
        sprmqe2.cfr_renamed_4 = spra2;
    }

    public static sprmqe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmqe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public spra cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprtzd cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprmqe(sprbne sprbne2) {
        void arg0;
        sprmqe sprmqe2 = this;
        sprmqe2.cfr_renamed_3 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprmqe2.cfr_renamed_4 = sprbne2.cfr_renamed_85(1);
    }
}


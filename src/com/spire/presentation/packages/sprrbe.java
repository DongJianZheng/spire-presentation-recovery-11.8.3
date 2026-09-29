/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcie;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprode;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxgk;

public class sprrbe
extends sprkra {
    private sprcie cfr_renamed_2;
    private sprtzd cfr_renamed_3;
    private sprode cfr_renamed_4;

    public sprode cfr_renamed_4660() {
        return this.cfr_renamed_4;
    }

    public sprrbe(sprtzd arg0, sprcie arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprrbe sprrbe2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprrbe2.cfr_renamed_2);
        if (sprrbe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public static sprrbe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrbe) {
            return (sprrbe)arg0;
        }
        if (arg0 != null) {
            return new sprrbe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprrbe(sprtzd sprtzd2, sprcie sprcie2, sprode sprode2) {
        void arg1;
        void arg0;
        sprrbe sprrbe2 = this;
        this.cfr_renamed_3 = arg0;
        sprrbe2.cfr_renamed_2 = arg1;
        sprrbe2.cfr_renamed_4 = sprode2;
    }

    public sprtzd cfr_renamed_4661() {
        return new sprtzd(this.cfr_renamed_3.cfr_renamed_19());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrbe(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() != 2 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxgk.cfr_renamed_9("APg\u0011pTrDf_`T#BjKf\u000b#")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprtzd.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprcie.cfr_renamed_23(v0.cfr_renamed_85(1));
        if (arg0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sprode.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public sprcie cfr_renamed_4662() {
        return this.cfr_renamed_2;
    }
}


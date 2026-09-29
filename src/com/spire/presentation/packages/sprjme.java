/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spreue;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprome;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrnr;
import com.spire.presentation.packages.sprtbz;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprjme
extends sprkra {
    private spreue cfr_renamed_2;
    private sprome cfr_renamed_3;
    private sprmee cfr_renamed_4;

    private /* synthetic */ sprjme(sprbne arg0) {
        sprbne sprbne2 = arg0;
        this.cfr_renamed_3 = sprome.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_2 = spreue.cfr_renamed_23(sprbne2.cfr_renamed_85(1));
        if (sprbne2.cfr_renamed_84() > 2) {
            this.cfr_renamed_4 = sprmee.cfr_renamed_23(arg0.cfr_renamed_85(2));
        }
    }

    public String toString() {
        return new StringBuilder().insert(0, sprrnr.cfr_renamed_9("j\u0013m\u0016| _0K6ZeUO\\ _0K6Z\f@#A7C$Z,A+\u0014e")).append(this.cfr_renamed_3).append("\n").append(sprtbz.cfr_renamed_9("M,],\u0013m")).append(this.cfr_renamed_2).append("\n").append(this.cfr_renamed_4 != null ? new StringBuilder().insert(0, sprrnr.cfr_renamed_9("1\\$@6O&Z,A+g!K+Z,H,K7\u0014e")).append(this.cfr_renamed_4).append("\n").toString() : "").append(sprtbz.cfr_renamed_9("TG")).toString();
    }

    public static sprjme cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprjme.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprjme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjme) {
            return (sprjme)arg0;
        }
        if (arg0 != null) {
            return new sprjme(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjme(sprome arg0, spreue arg1) {
        this(arg0, arg1, null);
    }

    public sprome cfr_renamed_2608() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjme(sprome sprome2, spreue spreue2, sprmee sprmee2) {
        void arg1;
        void arg0;
        sprjme sprjme2 = this;
        this.cfr_renamed_3 = arg0;
        sprjme2.cfr_renamed_2 = arg1;
        sprjme2.cfr_renamed_4 = sprmee2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprjme sprjme2 = this;
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(sprjme2.cfr_renamed_2);
        if (sprjme2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        return new sprpse(sprlre2);
    }

    public sprmee cfr_renamed_2607() {
        return this.cfr_renamed_4;
    }

    public spreue cfr_renamed_2609() {
        return this.cfr_renamed_2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcff;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprqee
extends sprkra {
    public sprtzd cfr_renamed_119;
    public sprije cfr_renamed_91;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 2;
    public sprmra cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public sprune cfr_renamed_4;

    public static sprqee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprqee.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public sprtzd cfr_renamed_415() {
        return this.cfr_renamed_119;
    }

    public sprije cfr_renamed_410() {
        return this.cfr_renamed_91;
    }

    public static sprqee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqee) {
            return (sprqee)arg0;
        }
        if (arg0 != null) {
            return new sprqee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprqee sprqee2 = this;
        sprlre2.cfr_renamed_49(sprqee2.cfr_renamed_4);
        if (sprqee2.cfr_renamed_119 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_119);
        }
        sprlre sprlre3 = sprlre2;
        sprqee sprqee3 = this;
        sprlre3.cfr_renamed_49(sprqee3.cfr_renamed_91);
        sprlre3.cfr_renamed_49(sprqee3.cfr_renamed_2);
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqee(int n, sprtzd sprtzd2, sprije sprije2, byte[] byArray) {
        void arg3;
        void arg2;
        void arg0;
        sprqee sprqee2 = this;
        sprqee2.cfr_renamed_4 = new sprune((int)arg0);
        if (n == 2) {
            void arg1;
            this.cfr_renamed_119 = arg1;
        }
        sprqee sprqee3 = this;
        sprqee3.cfr_renamed_91 = arg2;
        sprqee3.cfr_renamed_2 = new sprmra((byte[])arg3);
    }

    public sprune cfr_renamed_411() {
        return this.cfr_renamed_4;
    }

    public sprmra cfr_renamed_412() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqee(sprbne sprbne2) {
        void arg0;
        if (sprbne2.cfr_renamed_84() > 4 || arg0.cfr_renamed_84() < 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcff.cfr_renamed_9("p\u0016VWA\u0012C\u0002W\u0019Q\u0012\u0012\u0004[\rWM\u0012")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_4 = sprune.cfr_renamed_23(arg0.cfr_renamed_85(0));
        int n = 0;
        if (arg0.cfr_renamed_84() == 4) {
            ++n;
            this.cfr_renamed_119 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(1));
        }
        void v0 = arg0;
        this.cfr_renamed_91 = sprije.cfr_renamed_23(v0.cfr_renamed_85(1 + n));
        this.cfr_renamed_2 = sprmra.cfr_renamed_23(v0.cfr_renamed_85(2 + n));
    }
}


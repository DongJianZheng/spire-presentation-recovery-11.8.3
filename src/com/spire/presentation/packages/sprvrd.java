/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhrc;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtkk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class sprvrd
extends sprkra
implements sprtk {
    private sprvva cfr_renamed_1344;
    private sprtzd cfr_renamed_1472;

    public static sprvrd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvrd) {
            return (sprvrd)arg0;
        }
        if (arg0 != null) {
            return new sprvrd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvrd(int arg0, int arg1) {
        this(arg0, arg1, 0, 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvrd(BigInteger bigInteger) {
        void arg0;
        this.cfr_renamed_1472 = cfr_renamed_86;
        sprvrd sprvrd2 = this;
        sprvrd2.cfr_renamed_1344 = new sprooe((BigInteger)arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvrd(sprbne sprbne2) {
        void arg0;
        sprvrd sprvrd2 = this;
        sprvrd2.cfr_renamed_1472 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprvrd2.cfr_renamed_1344 = sprbne2.cfr_renamed_85(1).cfr_renamed_119();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_1472);
        sprlre3.cfr_renamed_49(this.cfr_renamed_1344);
        return new sprpse(sprlre2);
    }

    public sprtzd cfr_renamed_4028() {
        return this.cfr_renamed_1472;
    }

    public sprvrd(int arg0, int arg1, int arg2, int arg3) {
        sprvrd sprvrd2;
        this.cfr_renamed_1472 = cfr_renamed_272;
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(new sprooe(arg0));
        if (arg2 == 0) {
            if (arg3 != 0) {
                throw new IllegalArgumentException(sprtkk.cfr_renamed_9("\u0003[\tZ\u0004F\u0003F\u001eP\u0004AJ^JC\u000bY\u001fP\u0019"));
            }
            sprlre sprlre3 = sprlre2;
            sprlre3.cfr_renamed_49(cfr_renamed_805);
            sprlre3.cfr_renamed_49(new sprooe(arg1));
            sprvrd2 = this;
        } else {
            if (arg2 <= arg1 || arg3 <= arg2) {
                throw new IllegalArgumentException(sprhrc.cfr_renamed_9("<b6c;\u007f<\u007f!i;xuguz4` i&"));
            }
            sprlre sprlre4 = sprlre2;
            sprlre4.cfr_renamed_49(cfr_renamed_114);
            sprlre sprlre5 = new sprlre();
            sprlre5.cfr_renamed_49(new sprooe(arg1));
            sprlre5.cfr_renamed_49(new sprooe(arg2));
            sprlre5.cfr_renamed_49(new sprooe(arg3));
            sprlre4.cfr_renamed_49(new sprpse(sprlre5));
            sprvrd2 = this;
        }
        sprvrd2.cfr_renamed_1344 = new sprpse(sprlre2);
    }

    public sprvva cfr_renamed_284() {
        return this.cfr_renamed_1344;
    }
}


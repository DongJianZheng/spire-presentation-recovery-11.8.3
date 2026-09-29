/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprxle
extends sprkra {
    private sprxue cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public sprxle(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_3 = (sprxue)enumeration.nextElement();
        this.cfr_renamed_4 = (sprtzd)enumeration.nextElement();
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_3.cfr_renamed_186();
    }

    public sprtzd cfr_renamed_2105() {
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

    public static sprxle cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxle) {
            return (sprxle)arg0;
        }
        if (arg0 != null) {
            return new sprxle(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprxle cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprxle.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}


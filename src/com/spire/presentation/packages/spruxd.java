/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sproci;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class spruxd
extends sprkra
implements sprkj {
    private sprvva cfr_renamed_4;

    public spruxd(sprvva sprvva2) {
        spruxd spruxd2 = this;
        spruxd2.cfr_renamed_4 = null;
        spruxd2.cfr_renamed_4 = sprvva2;
    }

    public sprvva cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_2317() {
        return this.cfr_renamed_4 instanceof sprtzd;
    }

    public static spruxd cfr_renamed_341(spryte arg0, boolean arg1) {
        return spruxd.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    public spruxd(sprfpd sprfpd2) {
        spruxd spruxd2 = this;
        spruxd2.cfr_renamed_4 = null;
        spruxd2.cfr_renamed_4 = sprfpd2.cfr_renamed_119();
    }

    public static spruxd cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spruxd) {
            return (spruxd)arg0;
        }
        if (arg0 instanceof sprvva) {
            return new spruxd((sprvva)arg0);
        }
        throw new IllegalArgumentException(sproci.cfr_renamed_9("\u0017a\ta\rx\f/\rm\bj\u0001{Bf\f/\u0005j\u0016F\f|\u0016n\fl\u0007'K"));
    }

    public boolean cfr_renamed_2320() {
        return this.cfr_renamed_4 instanceof sprcre;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public spruxd(sprtzd sprtzd2) {
        spruxd spruxd2 = this;
        spruxd2.cfr_renamed_4 = null;
        spruxd2.cfr_renamed_4 = sprtzd2;
    }
}


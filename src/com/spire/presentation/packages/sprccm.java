/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprxgf;

public class sprccm
extends sprqqe {
    private final sprddm cfr_renamed_4;

    public sprddm cfr_renamed_593() {
        return this.cfr_renamed_4;
    }

    public sprccm(sprddm sprddm2) {
        this.cfr_renamed_4 = sprddm2;
    }

    public static sprccm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprccm) {
            return (sprccm)arg0;
        }
        if (arg0 != null) {
            return new sprccm(sprddm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprccm(sprlem arg0) {
        this(arg0, null);
    }

    public static sprccm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprccm.cfr_renamed_23(sprddm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprccm(sprlem sprlem2, sprco sprco2) {
        void arg1;
        void arg0;
        sprccm sprccm2 = this;
        sprccm2.cfr_renamed_4 = new sprddm((sprlem)arg0, (sprco)arg1);
    }

    public static sprccm cfr_renamed_5322(sprhgm arg0) {
        return sprccm.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_132));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }
}


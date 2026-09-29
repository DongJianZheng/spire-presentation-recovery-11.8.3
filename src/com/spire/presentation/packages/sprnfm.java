/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprxgf;

public class sprnfm
extends sprqqe {
    private final sprgbf cfr_renamed_4;

    public static sprnfm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnfm) {
            return (sprnfm)arg0;
        }
        if (arg0 != null) {
            return new sprnfm(sprgbf.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprnfm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprnfm.cfr_renamed_23(sprgbf.cfr_renamed_5085(arg0, arg1));
    }

    private /* synthetic */ sprnfm(sprgbf sprgbf2) {
        this.cfr_renamed_4 = sprgbf2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprnfm(byte[] byArray) {
        void arg0;
        sprnfm sprnfm2 = this;
        sprnfm2.cfr_renamed_4 = new sprdye((byte[])arg0);
    }

    public static sprnfm cfr_renamed_5322(sprhgm arg0) {
        return sprnfm.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_112));
    }

    public sprgbf cfr_renamed_79() {
        return this.cfr_renamed_4;
    }
}


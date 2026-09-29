/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprzih
extends sprqqe {
    private final sprfvg cfr_renamed_4;

    public static sprzih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzih) {
            return (sprzih)arg0;
        }
        if (arg0 != null) {
            return new sprzih(sprfvg.cfr_renamed_23(arg0).cfr_renamed_186());
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprzih(sprfvg sprfvg2) {
        this.cfr_renamed_4 = sprfvg2;
    }

    public sprfvg cfr_renamed_314() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzih(byte[] byArray) {
        void arg0;
        sprzih sprzih2 = this;
        sprzih2.cfr_renamed_4 = new sprfvg(sproze.cfr_renamed_158((byte[])arg0));
    }
}


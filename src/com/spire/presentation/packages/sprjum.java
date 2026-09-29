/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprjum
extends sprqqe {
    private sprqhm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprqhm cfr_renamed_4617() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprjum(sprqhm sprqhm2) {
        this.cfr_renamed_4 = sprqhm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprjum(String string) {
        void arg0;
        sprjum sprjum2 = this;
        sprjum2.cfr_renamed_4 = new sprqhm((String)arg0);
    }

    public static sprjum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjum) {
            return (sprjum)arg0;
        }
        if (arg0 != null) {
            return new sprjum(sprqhm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


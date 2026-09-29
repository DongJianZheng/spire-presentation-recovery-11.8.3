/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprdjm
extends sprqqe {
    private sprlem cfr_renamed_4;

    public String cfr_renamed_19() {
        return this.cfr_renamed_4.cfr_renamed_19();
    }

    private /* synthetic */ sprdjm(sprlem sprlem2) {
        this.cfr_renamed_4 = sprlem2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprdjm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdjm) {
            return (sprdjm)arg0;
        }
        if (arg0 != null) {
            return new sprdjm(sprlem.cfr_renamed_23(arg0));
        }
        return null;
    }
}


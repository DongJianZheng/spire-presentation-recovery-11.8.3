/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprbfh
extends sprqqe {
    public static final int cfr_renamed_2 = 64;
    private final sprgbf cfr_renamed_3;
    public static final int cfr_renamed_4 = 128;

    public static sprbfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbfh) {
            return (sprbfh)arg0;
        }
        if (arg0 != null) {
            return new sprbfh(sprgbf.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbfh(int n) {
        this(new sprdye((int)arg0));
        void arg0;
    }

    public sprgbf cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprbfh(sprgbf sprgbf2) {
        this.cfr_renamed_3 = sprgbf2;
    }
}


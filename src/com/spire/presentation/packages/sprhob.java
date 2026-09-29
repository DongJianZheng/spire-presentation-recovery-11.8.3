/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzfe;

public class sprhob
extends sprkra {
    public static final int cfr_renamed_86 = 32768;
    public static final int cfr_renamed_152 = 4;
    public static final int cfr_renamed_112 = 16;
    public static final int cfr_renamed_119 = 1;
    public static final int cfr_renamed_91 = 32;
    private int cfr_renamed_0;
    public static final int cfr_renamed_1 = 64;
    public static final int cfr_renamed_2 = 8;
    public static final int cfr_renamed_3 = 128;
    public static final int cfr_renamed_4 = 2;

    public sprhob(int n) {
        sprhob sprhob2 = this;
        sprhob2.cfr_renamed_0 = 0;
        sprhob2.cfr_renamed_0 = n;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprzfe(this.cfr_renamed_0).cfr_renamed_119();
    }
}


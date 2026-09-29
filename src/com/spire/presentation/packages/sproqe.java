/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprkiaa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;

public class sproqe
extends sprkra {
    private sprcre cfr_renamed_4;

    public static sproqe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sproqe) {
            return (sproqe)arg0;
        }
        if (arg0 instanceof sprcre) {
            return new sproqe((sprcre)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprkiaa.cfr_renamed_9("Q!n.t&|ow-r*{;\"o")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sproqe() {
        this.cfr_renamed_4 = sprume.cfr_renamed_3;
    }

    private /* synthetic */ sproqe(sprcre sprcre2) {
        this.cfr_renamed_4 = sprcre2;
    }
}


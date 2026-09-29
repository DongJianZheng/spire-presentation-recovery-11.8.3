/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprulh
extends sprqqe {
    private final int cfr_renamed_4;

    private /* synthetic */ sprulh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public sprulh(BigInteger bigInteger) {
        this.cfr_renamed_4 = sprhdf.cfr_renamed_5225(bigInteger);
    }

    public static sprulh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprulh) {
            return (sprulh)arg0;
        }
        if (arg0 != null) {
            return new sprulh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprulh(int n) {
        this.cfr_renamed_4 = n;
    }

    public int cfr_renamed_7832() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }
}


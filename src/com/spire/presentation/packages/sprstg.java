/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprobh;
import com.spire.presentation.packages.sprvrg;
import java.math.BigInteger;

public class sprstg
extends sprobh {
    public static long cfr_renamed_4 = sprvrg.cfr_renamed_4 * 1000L;

    public long cfr_renamed_8337() {
        return (sprhdf.cfr_renamed_5226(this.cfr_renamed_97()) + cfr_renamed_4) / 1000L;
    }

    public sprstg(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    public sprstg(sprobh arg0) {
        this(arg0.cfr_renamed_97());
    }

    public static sprstg cfr_renamed_8338(long arg0) {
        return new sprstg(arg0 * 1000L - cfr_renamed_4);
    }

    public sprstg(BigInteger arg0) {
        super(arg0);
    }

    public static sprstg cfr_renamed_8339() {
        return new sprstg(1000L * System.currentTimeMillis() - cfr_renamed_4);
    }

    public static sprstg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprobh) {
            return new sprstg((sprobh)arg0);
        }
        if (arg0 != null) {
            return new sprstg(sprktm.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }
}


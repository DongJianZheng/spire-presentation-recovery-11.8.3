/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprozg;
import java.math.BigInteger;
import java.util.Date;

public class sprvrg
extends sprozg {
    public static long cfr_renamed_4 = 1072915200000L;

    public static sprvrg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprozg) {
            return new sprvrg((sprozg)arg0);
        }
        if (arg0 != null) {
            return new sprvrg(sprktm.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }

    public String toString() {
        return new Date(this.cfr_renamed_8337()).toString();
    }

    public sprvrg(BigInteger arg0) {
        super(arg0);
    }

    public sprvrg(sprozg arg0) {
        this(arg0.cfr_renamed_97());
    }

    public sprvrg(long arg0) {
        super(arg0);
    }

    public static sprvrg cfr_renamed_8339() {
        return sprvrg.cfr_renamed_8338(System.currentTimeMillis());
    }

    public static sprvrg cfr_renamed_8338(long arg0) {
        return new sprvrg((arg0 - cfr_renamed_4) / 1000L);
    }

    public long cfr_renamed_8337() {
        return this.cfr_renamed_97().longValue() * 1000L + cfr_renamed_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfo;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.spruwf;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprvzl
extends sprqqe {
    private BigInteger cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }

    public sprvzl(BigInteger arg0) {
        if (sprhdf.cfr_renamed_0.compareTo(arg0) > 0) {
            throw new IllegalArgumentException(spruwf.cfr_renamed_9("f\"Y-C%Kll\u001eclA9B.J>\u000fv\u000f\"@8\u000f%Al\u0007|\u0001bb\rwe"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public static sprvzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvzl) {
            return (sprvzl)arg0;
        }
        if (arg0 != null) {
            return new sprvzl(sprktm.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprbfo.cfr_renamed_9("O\u0014`(y\u000bn\u0003~\\,")).append(this.cfr_renamed_4525()).toString();
    }

    public BigInteger cfr_renamed_4525() {
        return this.cfr_renamed_4;
    }
}


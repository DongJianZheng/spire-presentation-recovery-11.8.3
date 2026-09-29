/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprzwg;
import java.math.BigInteger;

public class sprnah
extends sprzwg {
    public sprnah(BigInteger arg0) {
        super(arg0);
    }

    private /* synthetic */ sprnah(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public static sprnah cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnah) {
            return (sprnah)arg0;
        }
        if (arg0 != null) {
            return new sprnah(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprnah(long arg0) {
        super(arg0);
    }
}


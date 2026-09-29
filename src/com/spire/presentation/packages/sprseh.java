/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprxzg;
import java.math.BigInteger;

public class sprseh
extends sprxzg {
    public sprseh(long arg0) {
        super(arg0);
    }

    private /* synthetic */ sprseh(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    public sprseh(BigInteger arg0) {
        super(arg0);
    }

    public static sprseh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprseh) {
            return (sprseh)arg0;
        }
        if (arg0 != null) {
            return new sprseh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }
}


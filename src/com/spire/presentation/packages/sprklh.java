/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprrfh;
import java.math.BigInteger;

public class sprklh
extends sprrfh {
    public sprklh(BigInteger arg0) {
        super(arg0);
    }

    public static sprklh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprklh) {
            return (sprklh)arg0;
        }
        if (arg0 != null) {
            return new sprklh(sprktm.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }

    public sprklh(int arg0) {
        super(arg0);
    }
}


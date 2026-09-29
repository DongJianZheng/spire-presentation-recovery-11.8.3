/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprhmh
extends sprqqe {
    private final BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprhmh(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    public sprhmh(BigInteger bigInteger) {
        this.cfr_renamed_4 = bigInteger;
    }

    public sprhmh(sprktm sprktm2) {
        this.cfr_renamed_4 = sprktm2.cfr_renamed_97();
    }

    public static sprhmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbvg) {
            return (sprhmh)arg0;
        }
        if (arg0 != null) {
            return new sprhmh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }

    public sprhmh(int arg0) {
        this(BigInteger.valueOf(arg0));
    }
}


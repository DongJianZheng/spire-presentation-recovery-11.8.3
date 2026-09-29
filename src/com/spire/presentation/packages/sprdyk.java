/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbao;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprqal;
import java.math.BigInteger;

public class sprdyk
extends sprqal {
    @Override
    public boolean cfr_renamed_10164(BigInteger arg0, BigInteger arg1) {
        return arg0.compareTo(cfr_renamed_4) < 0 || arg0.compareTo(arg1.subtract(sprhdf.cfr_renamed_2)) >= 0;
    }

    public sprdyk() {
        super(sprbao.cfr_renamed_9(".KOM\u0018\u007f:c\u0013"));
    }
}


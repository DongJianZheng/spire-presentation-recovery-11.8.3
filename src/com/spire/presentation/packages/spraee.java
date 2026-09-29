/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprljg;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class spraee
extends sprkra {
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_4525() {
        return this.cfr_renamed_4;
    }

    public spraee(BigInteger bigInteger) {
        this.cfr_renamed_4 = bigInteger;
    }

    public static spraee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraee) {
            return (spraee)arg0;
        }
        if (arg0 != null) {
            return new spraee(sprooe.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprljg.cfr_renamed_9("[nTrmQzYj\u00068")).append(this.cfr_renamed_4525()).toString();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprooe(this.cfr_renamed_4);
    }
}


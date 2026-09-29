/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class sprmde
extends sprkra {
    private sprune cfr_renamed_119;
    public static final int cfr_renamed_91 = 5;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 6;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_119.cfr_renamed_97();
    }

    private /* synthetic */ sprmde(sprune sprune2) {
        this.cfr_renamed_119 = sprune2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmde(int n) {
        this(new sprune((int)arg0));
        void arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_119;
    }

    public static sprmde cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmde) {
            return (sprmde)arg0;
        }
        if (arg0 != null) {
            return new sprmde(sprune.cfr_renamed_23(arg0));
        }
        return null;
    }
}


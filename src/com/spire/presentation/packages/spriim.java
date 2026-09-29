/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlhz;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprvzaa;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class spriim
extends sprqqe {
    private sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spriim(sprktm sprktm2) {
        void arg0;
        if (sprktm2 == null) {
            throw new IllegalArgumentException(sprlhz.cfr_renamed_9("|D|\u001d8\\5S4I{_>\u001d5H7Q"));
        }
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spriim(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null) {
            throw new IllegalArgumentException(sprvzaa.cfr_renamed_9("=L=\u0015yTt[uA:W\u007f\u0015t@vY"));
        }
        this.cfr_renamed_4 = new sprktm((BigInteger)arg0);
    }

    public static spriim cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spriim.cfr_renamed_23(sprktm.cfr_renamed_5085(arg0, arg1));
    }

    public static spriim cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spriim) {
            return (spriim)arg0;
        }
        if (arg0 instanceof sprktm) {
            return new spriim((sprktm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlhz.cfr_renamed_9("t5K:Q2Y{y\u0013m._7T8v>Da\u001d")).append(arg0.getClass().getName()).toString());
    }

    public BigInteger spr\u3181() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }
}


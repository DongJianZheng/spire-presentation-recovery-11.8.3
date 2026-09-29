/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfym;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprsfh
extends sprqqe {
    private final BigInteger cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4;
    }

    public static sprsfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsfh) {
            return (sprsfh)arg0;
        }
        if (arg0 != null) {
            return new sprsfh(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsfh(sprktm sprktm2) {
        void arg0;
        int n = sprhdf.cfr_renamed_5225(sprktm2.cfr_renamed_97());
        if (n < 0 || n > 65535) {
            throw new IllegalArgumentException(sprfym.cfr_renamed_9("\r[\u0017O\u001e\u001a\u0014O\u000f\u001a\u0014\\[H\u001aT\u001c_"));
        }
        this.cfr_renamed_4 = arg0.cfr_renamed_97();
    }
}


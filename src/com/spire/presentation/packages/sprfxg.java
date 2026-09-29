/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcty;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprfxg
extends sprqqe {
    private final BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_8305() {
        return this.cfr_renamed_4;
    }

    public static sprfxg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfxg) {
            return (sprfxg)arg0;
        }
        if (arg0 != null) {
            return new sprfxg(sprktm.cfr_renamed_23(arg0).cfr_renamed_97());
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_4);
    }

    public sprfxg(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprfxg(BigInteger bigInteger) {
        void arg0;
        if (bigInteger.signum() < 0) {
            throw new IllegalStateException(sprcty.cfr_renamed_9("4(-?d61(0{&>d<6>%/!)d/,:*{>>64"));
        }
        this.cfr_renamed_4 = arg0;
    }
}


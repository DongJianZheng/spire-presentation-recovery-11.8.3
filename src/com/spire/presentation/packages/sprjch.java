/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfmr;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprqvg;
import java.math.BigInteger;

public class sprjch
extends sprqvg {
    public static final sprjch cfr_renamed_3;
    public static final sprjch cfr_renamed_4;

    private /* synthetic */ sprjch(sprqvg arg0) {
        this(arg0.cfr_renamed_97());
    }

    public void cfr_renamed_8326() {
        switch (sprhdf.cfr_renamed_5225(this.cfr_renamed_97())) {
            case 0: 
            case 1: {
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfmr.cfr_renamed_9("PAONUF]\u000f\\ALB\\]X[P@W\u000fONUZ\\\u000f")).append(this.cfr_renamed_97()).toString());
    }

    public sprjch(BigInteger arg0) {
        sprjch sprjch2 = this;
        super(arg0);
        sprjch2.cfr_renamed_8326();
    }

    public static sprjch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjch) {
            return (sprjch)arg0;
        }
        if (arg0 != null) {
            return new sprjch(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }

    static {
        cfr_renamed_4 = new sprjch(BigInteger.ZERO);
        cfr_renamed_3 = new sprjch(sprhdf.cfr_renamed_2);
    }
}


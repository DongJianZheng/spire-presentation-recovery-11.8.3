/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprqvg;
import java.math.BigInteger;

public class sprrah
extends sprqvg {
    public static final sprrah cfr_renamed_4 = new sprrah(BigInteger.ZERO);

    public sprrah(BigInteger arg0) {
        sprrah sprrah2 = this;
        super(arg0);
        sprrah2.cfr_renamed_8326();
    }

    public void cfr_renamed_8326() {
        switch (sprhdf.cfr_renamed_5225(this.cfr_renamed_97())) {
            case 0: {
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcmf.cfr_renamed_9("T}KrQzY3X}H~Xa\\gT|S3KrQfX3")).append(this.cfr_renamed_97()).toString());
    }

    private /* synthetic */ sprrah(sprqvg arg0) {
        sprrah sprrah2 = this;
        super(arg0.cfr_renamed_97());
        sprrah2.cfr_renamed_8326();
    }

    public static sprrah cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrah) {
            return (sprrah)arg0;
        }
        if (arg0 != null) {
            return new sprrah(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }
}


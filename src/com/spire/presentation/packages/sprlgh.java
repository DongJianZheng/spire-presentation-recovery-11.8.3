/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprquo;
import com.spire.presentation.packages.sprqvg;
import java.math.BigInteger;

public class sprlgh
extends sprqvg {
    public static final sprlgh cfr_renamed_3 = new sprlgh(BigInteger.ZERO);
    public static final sprlgh cfr_renamed_4 = new sprlgh(BigInteger.ONE);

    public sprlgh(BigInteger arg0) {
        sprlgh sprlgh2 = this;
        super(arg0);
        sprlgh2.cfr_renamed_8326();
    }

    private /* synthetic */ sprlgh(sprqvg arg0) {
        this(arg0.cfr_renamed_97());
    }

    public void cfr_renamed_8326() {
        if (this.cfr_renamed_97().compareTo(BigInteger.ZERO) < 0 || this.cfr_renamed_97().compareTo(sprhdf.cfr_renamed_2) > 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprquo.cfr_renamed_9("MARNHF@\u000fAAQBA]E[M@J\u000fRNHZA\u000f")).append(this.cfr_renamed_97()).toString());
        }
    }

    public static sprlgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlgh) {
            return (sprlgh)arg0;
        }
        if (arg0 != null) {
            return new sprlgh(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }
}


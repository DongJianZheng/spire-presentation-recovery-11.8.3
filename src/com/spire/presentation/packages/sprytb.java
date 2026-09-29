/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbb;
import java.math.BigInteger;

public class sprytb
implements sprbb {
    public final BigInteger cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    @Override
    public BigInteger cfr_renamed_1762() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_1763() {
        return 1;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprytb)) {
            return false;
        }
        sprytb sprytb2 = (sprytb)arg0;
        return this.cfr_renamed_4.equals(sprytb2.cfr_renamed_4);
    }

    public sprytb(BigInteger bigInteger) {
        this.cfr_renamed_4 = bigInteger;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjd;
import java.math.BigInteger;

public class sprbdh
implements sprjd {
    public final BigInteger cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprbdh)) {
            return false;
        }
        sprbdh sprbdh2 = (sprbdh)arg0;
        return this.cfr_renamed_4.equals(sprbdh2.cfr_renamed_4);
    }

    @Override
    public BigInteger cfr_renamed_1762() {
        return this.cfr_renamed_4;
    }

    public sprbdh(BigInteger bigInteger) {
        this.cfr_renamed_4 = bigInteger;
    }

    @Override
    public int cfr_renamed_1763() {
        return 1;
    }
}


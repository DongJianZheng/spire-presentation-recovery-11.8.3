/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprjtk;
import java.math.BigInteger;

public class sprssk
extends sprjtk {
    private BigInteger cfr_renamed_4;

    public BigInteger spr\u3181() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprssk)) {
            return false;
        }
        return ((sprssk)arg0).spr\u3181().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprssk(BigInteger bigInteger, sprcuk sprcuk2) {
        super(false, (sprcuk)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }
}


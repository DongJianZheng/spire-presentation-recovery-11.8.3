/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnid;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;

public class sprmgd
extends sprnid {
    private BigInteger cfr_renamed_4;

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprmgd)) {
            return false;
        }
        return ((sprmgd)arg0).spr\u3181().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmgd(BigInteger bigInteger, sprzmd sprzmd2) {
        super(false, (sprzmd)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }

    public BigInteger spr\u3181() {
        return this.cfr_renamed_4;
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }
}


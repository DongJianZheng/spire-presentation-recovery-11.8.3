/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnid;
import com.spire.presentation.packages.sprzmd;
import java.math.BigInteger;

public class sprrkd
extends sprnid {
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrkd(BigInteger bigInteger, sprzmd sprzmd2) {
        super(true, (sprzmd)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprrkd)) {
            return false;
        }
        return ((sprrkd)arg0).cfr_renamed_1980().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }
}


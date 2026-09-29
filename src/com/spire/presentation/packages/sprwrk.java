/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprjtk;
import java.math.BigInteger;

public class sprwrk
extends sprjtk {
    private BigInteger cfr_renamed_4;

    @Override
    public int hashCode() {
        return this.cfr_renamed_1980().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprwrk(BigInteger bigInteger, sprcuk sprcuk2) {
        super(true, (sprcuk)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }

    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprwrk)) {
            return false;
        }
        if (!((sprwrk)arg0).cfr_renamed_1980().equals(this.cfr_renamed_4)) {
            return false;
        }
        return super.equals(arg0);
    }
}


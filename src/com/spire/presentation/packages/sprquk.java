/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprztk;
import java.math.BigInteger;

public class sprquk
extends sprztk {
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprquk)) {
            return false;
        }
        return ((sprquk)arg0).cfr_renamed_1980().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprquk(BigInteger bigInteger, sprwsk sprwsk2) {
        super(true, (sprwsk)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }
}


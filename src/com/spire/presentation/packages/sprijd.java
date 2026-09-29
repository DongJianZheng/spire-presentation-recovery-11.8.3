/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprygd;
import com.spire.presentation.packages.sprzdd;
import java.math.BigInteger;

public class sprijd
extends sprzdd {
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprijd(sprygd sprygd2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg2;
        void arg1;
        void arg0;
        sprijd sprijd2 = this;
        super(false, (sprygd)arg0);
        this.cfr_renamed_3 = arg1;
        sprijd2.cfr_renamed_4 = arg2;
        sprijd2.cfr_renamed_2 = bigInteger3;
    }

    public BigInteger cfr_renamed_3369() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprijd)) {
            return false;
        }
        sprijd sprijd2 = (sprijd)arg0;
        return sprijd2.cfr_renamed_3369().equals(this.cfr_renamed_3) && sprijd2.cfr_renamed_2112().equals(this.cfr_renamed_4) && sprijd2.cfr_renamed_1153().equals(this.cfr_renamed_2) && super.equals(arg0);
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_2;
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_4.hashCode() ^ this.cfr_renamed_2.hashCode() ^ super.hashCode();
    }
}


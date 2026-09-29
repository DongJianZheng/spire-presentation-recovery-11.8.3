/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprprk;
import com.spire.presentation.packages.sprzyk;
import java.math.BigInteger;

public class sprbxk
extends sprprk {
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprbxk)) {
            return false;
        }
        sprbxk sprbxk2 = (sprbxk)arg0;
        return sprbxk2.cfr_renamed_3369().equals(this.cfr_renamed_3) && sprbxk2.cfr_renamed_2112().equals(this.cfr_renamed_2) && sprbxk2.cfr_renamed_1153().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    public BigInteger cfr_renamed_3369() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprbxk(sprzyk sprzyk2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg2;
        void arg1;
        void arg0;
        sprbxk sprbxk2 = this;
        super(false, (sprzyk)arg0);
        this.cfr_renamed_3 = arg1;
        sprbxk2.cfr_renamed_2 = arg2;
        sprbxk2.cfr_renamed_4 = bigInteger3;
    }

    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_2;
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }
}


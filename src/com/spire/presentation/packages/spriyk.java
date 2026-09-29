/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spriwk;
import java.math.BigInteger;

public class spriyk
implements sprbj {
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private spriwk cfr_renamed_4;

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof spriyk)) {
            return false;
        }
        spriyk spriyk2 = (spriyk)arg0;
        return spriyk2.cfr_renamed_1155().equals(this.cfr_renamed_3) && spriyk2.cfr_renamed_1604().equals(this.cfr_renamed_2) && spriyk2.cfr_renamed_1778().equals(this.cfr_renamed_1);
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2;
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_1.hashCode();
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public spriyk(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, spriwk spriwk2) {
        void arg1;
        void arg0;
        void arg2;
        spriyk spriyk2 = this;
        spriyk spriyk3 = this;
        spriyk3.cfr_renamed_1 = arg2;
        spriyk3.cfr_renamed_3 = arg0;
        spriyk2.cfr_renamed_2 = arg1;
        spriyk2.cfr_renamed_4 = spriwk2;
    }

    /*
     * WARNING - void declaration
     */
    public spriyk(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg1;
        void arg0;
        spriyk spriyk2 = this;
        this.cfr_renamed_3 = arg0;
        spriyk2.cfr_renamed_2 = arg1;
        spriyk2.cfr_renamed_1 = bigInteger3;
    }

    public spriwk cfr_renamed_3371() {
        return this.cfr_renamed_4;
    }
}


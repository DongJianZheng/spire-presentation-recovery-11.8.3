/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqld;
import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class sprcld
implements sprt {
    private BigInteger cfr_renamed_1;
    private sprqld cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprcld)) {
            return false;
        }
        sprcld sprcld2 = (sprcld)arg0;
        return sprcld2.cfr_renamed_1155().equals(this.cfr_renamed_3) && sprcld2.cfr_renamed_1604().equals(this.cfr_renamed_4) && sprcld2.cfr_renamed_1145().equals(this.cfr_renamed_1);
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1604().hashCode() ^ this.cfr_renamed_1145().hashCode();
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprcld(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg0;
        void arg2;
        sprcld sprcld2 = this;
        this.cfr_renamed_1 = arg2;
        sprcld2.cfr_renamed_3 = arg0;
        sprcld2.cfr_renamed_4 = bigInteger2;
    }

    public sprqld cfr_renamed_3371() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprcld(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprqld sprqld2) {
        void arg1;
        void arg0;
        void arg2;
        sprcld sprcld2 = this;
        sprcld sprcld3 = this;
        sprcld3.cfr_renamed_1 = arg2;
        sprcld3.cfr_renamed_3 = arg0;
        sprcld2.cfr_renamed_4 = arg1;
        sprcld2.cfr_renamed_2 = sprqld2;
    }
}


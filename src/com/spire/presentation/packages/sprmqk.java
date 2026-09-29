/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprizk;
import java.math.BigInteger;

public class sprmqk
implements sprbj {
    private BigInteger cfr_renamed_1;
    private sprizk cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public sprizk cfr_renamed_3371() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmqk(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg0;
        void arg2;
        sprmqk sprmqk2 = this;
        this.cfr_renamed_4 = arg2;
        sprmqk2.cfr_renamed_1 = arg0;
        sprmqk2.cfr_renamed_3 = bigInteger2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmqk(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprizk sprizk2) {
        void arg1;
        void arg0;
        void arg2;
        sprmqk sprmqk2 = this;
        sprmqk sprmqk3 = this;
        sprmqk3.cfr_renamed_4 = arg2;
        sprmqk3.cfr_renamed_1 = arg0;
        sprmqk2.cfr_renamed_3 = arg1;
        sprmqk2.cfr_renamed_2 = sprizk2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1604().hashCode() ^ this.cfr_renamed_1145().hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprmqk)) {
            return false;
        }
        sprmqk sprmqk2 = (sprmqk)arg0;
        return sprmqk2.cfr_renamed_1155().equals(this.cfr_renamed_1) && sprmqk2.cfr_renamed_1604().equals(this.cfr_renamed_3) && sprmqk2.cfr_renamed_1145().equals(this.cfr_renamed_4);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class sprcfd
implements sprt {
    private sprjfd cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprcfd)) {
            return false;
        }
        sprcfd sprcfd2 = (sprcfd)arg0;
        return sprcfd2.cfr_renamed_1155().equals(this.cfr_renamed_3) && sprcfd2.cfr_renamed_1604().equals(this.cfr_renamed_2) && sprcfd2.cfr_renamed_1778().equals(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprcfd(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprjfd sprjfd2) {
        void arg1;
        void arg0;
        void arg2;
        sprcfd sprcfd2 = this;
        sprcfd sprcfd3 = this;
        sprcfd3.cfr_renamed_4 = arg2;
        sprcfd3.cfr_renamed_3 = arg0;
        sprcfd2.cfr_renamed_2 = arg1;
        sprcfd2.cfr_renamed_1 = sprjfd2;
    }

    public sprjfd cfr_renamed_3371() {
        return this.cfr_renamed_1;
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_4.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprcfd(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg1;
        void arg0;
        sprcfd sprcfd2 = this;
        this.cfr_renamed_3 = arg0;
        sprcfd2.cfr_renamed_2 = arg1;
        sprcfd2.cfr_renamed_4 = bigInteger3;
    }
}


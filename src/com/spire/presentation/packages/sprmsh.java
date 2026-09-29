/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;

public class sprmsh {
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmsh(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        void arg1;
        void arg0;
        sprmsh sprmsh2 = this;
        this.cfr_renamed_3 = arg0;
        sprmsh2.cfr_renamed_4 = arg1;
        sprmsh2.cfr_renamed_2 = bigInteger3;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprmsh) {
            sprmsh sprmsh2 = (sprmsh)arg0;
            return this.cfr_renamed_2.equals(sprmsh2.cfr_renamed_2) && this.cfr_renamed_3.equals(sprmsh2.cfr_renamed_3) && this.cfr_renamed_4.equals(sprmsh2.cfr_renamed_4);
        }
        return false;
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_4.hashCode();
    }
}


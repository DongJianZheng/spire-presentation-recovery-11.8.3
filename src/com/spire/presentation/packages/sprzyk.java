/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhx;
import java.math.BigInteger;

public class sprzyk
implements sprbj {
    private sprgf cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzyk)) {
            return false;
        }
        sprzyk sprzyk2 = (sprzyk)arg0;
        return sprzyk2.cfr_renamed_1155().equals(this.cfr_renamed_3) && sprzyk2.cfr_renamed_1944().equals(this.cfr_renamed_4) && sprzyk2.cfr_renamed_1946().equals(this.cfr_renamed_2);
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzyk(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprgf sprgf2) {
        void arg2;
        void arg1;
        void arg0;
        sprzyk sprzyk2 = this;
        sprzyk sprzyk3 = this;
        sprzyk3.cfr_renamed_3 = arg0;
        sprzyk3.cfr_renamed_4 = arg1;
        sprzyk2.cfr_renamed_2 = arg2;
        sprzyk2.cfr_renamed_1 = (sprgf)((Object)((sprhx)((Object)sprgf2)).cfr_renamed_461());
        this.cfr_renamed_1.cfr_renamed_41();
    }

    public BigInteger cfr_renamed_1946() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1944() {
        return this.cfr_renamed_4;
    }

    public sprgf cfr_renamed_1153() {
        return (sprgf)((Object)((sprhx)((Object)this.cfr_renamed_1)).cfr_renamed_461());
    }

    public int hashCode() {
        return this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1944().hashCode() ^ this.cfr_renamed_1946().hashCode();
    }
}


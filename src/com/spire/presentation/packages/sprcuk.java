/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import java.math.BigInteger;

public class sprcuk
implements sprbj {
    private int cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public sprcuk(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, 0);
    }

    public int hashCode() {
        return (this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1145().hashCode()) + this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprcuk)) {
            return false;
        }
        sprcuk sprcuk2 = (sprcuk)arg0;
        return sprcuk2.cfr_renamed_1155().equals(this.cfr_renamed_4) && sprcuk2.cfr_renamed_1145().equals(this.cfr_renamed_3) && sprcuk2.cfr_renamed_2331() == this.cfr_renamed_2;
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprcuk(BigInteger bigInteger, BigInteger bigInteger2, int n) {
        void arg0;
        void arg1;
        sprcuk sprcuk2 = this;
        this.cfr_renamed_3 = arg1;
        sprcuk2.cfr_renamed_4 = arg0;
        sprcuk2.cfr_renamed_2 = n;
    }
}


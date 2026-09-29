/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class sprpgd
implements sprt {
    private int cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprpgd)) {
            return false;
        }
        sprpgd sprpgd2 = (sprpgd)arg0;
        return sprpgd2.cfr_renamed_1155().equals(this.cfr_renamed_3) && sprpgd2.cfr_renamed_1145().equals(this.cfr_renamed_4) && sprpgd2.cfr_renamed_2331() == this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprpgd(BigInteger bigInteger, BigInteger bigInteger2, int n) {
        void arg0;
        void arg1;
        sprpgd sprpgd2 = this;
        this.cfr_renamed_4 = arg1;
        sprpgd2.cfr_renamed_3 = arg0;
        sprpgd2.cfr_renamed_2 = n;
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_2;
    }

    public sprpgd(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, 0);
    }

    public int hashCode() {
        return (this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1145().hashCode()) + this.cfr_renamed_2;
    }
}


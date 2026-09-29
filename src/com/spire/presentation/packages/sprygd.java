/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprt;
import java.math.BigInteger;

public class sprygd
implements sprt {
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public sprlc cfr_renamed_1153() {
        sprygd sprygd2 = this;
        sprygd2.cfr_renamed_3.cfr_renamed_41();
        return sprygd2.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1944() {
        return this.cfr_renamed_1;
    }

    public int hashCode() {
        return this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1944().hashCode() ^ this.cfr_renamed_1946().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprygd(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, sprlc sprlc2) {
        void arg2;
        void arg1;
        void arg0;
        sprygd sprygd2 = this;
        sprygd sprygd3 = this;
        sprygd3.cfr_renamed_4 = arg0;
        sprygd3.cfr_renamed_1 = arg1;
        sprygd2.cfr_renamed_2 = arg2;
        sprygd2.cfr_renamed_3 = sprlc2;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprcld)) {
            return false;
        }
        sprygd sprygd2 = (sprygd)arg0;
        return sprygd2.cfr_renamed_1155().equals(this.cfr_renamed_4) && sprygd2.cfr_renamed_1944().equals(this.cfr_renamed_1) && sprygd2.cfr_renamed_1946().equals(this.cfr_renamed_2);
    }

    public BigInteger cfr_renamed_1946() {
        return this.cfr_renamed_2;
    }
}


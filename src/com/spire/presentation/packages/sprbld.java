/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprijd;
import com.spire.presentation.packages.sprygd;
import com.spire.presentation.packages.sprzdd;
import java.math.BigInteger;

public class sprbld
extends sprzdd {
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private sprijd cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_1.hashCode() ^ this.cfr_renamed_0.hashCode() ^ this.cfr_renamed_91.hashCode() ^ this.cfr_renamed_4.hashCode() ^ super.hashCode();
    }

    public BigInteger cfr_renamed_3380() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_3381(sprijd arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprijd cfr_renamed_3382() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_3383() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_3384() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_3385() {
        return this.cfr_renamed_0;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprbld)) {
            return false;
        }
        sprbld sprbld2 = (sprbld)arg0;
        return sprbld2.cfr_renamed_3380().equals(this.cfr_renamed_3) && sprbld2.cfr_renamed_3384().equals(this.cfr_renamed_1) && sprbld2.cfr_renamed_3385().equals(this.cfr_renamed_0) && sprbld2.cfr_renamed_3386().equals(this.cfr_renamed_91) && sprbld2.cfr_renamed_3383().equals(this.cfr_renamed_4) && super.equals(arg0);
    }

    public BigInteger cfr_renamed_3386() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprbld(sprygd sprygd2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbld sprbld2 = this;
        sprbld sprbld3 = this;
        super(true, (sprygd)arg0);
        this.cfr_renamed_3 = arg1;
        sprbld3.cfr_renamed_1 = arg2;
        sprbld3.cfr_renamed_0 = arg3;
        sprbld2.cfr_renamed_91 = arg4;
        sprbld2.cfr_renamed_4 = bigInteger5;
    }
}


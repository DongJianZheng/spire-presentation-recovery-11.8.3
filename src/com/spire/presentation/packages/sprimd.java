/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprpld;
import java.math.BigInteger;

public class sprimd
extends sprpld {
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprimd(BigInteger bigInteger, sprpgd sprpgd2) {
        super(true, (sprpgd)arg1);
        void arg1;
        this.cfr_renamed_4 = bigInteger;
    }

    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprimd)) {
            return false;
        }
        if (!((sprimd)arg0).cfr_renamed_1980().equals(this.cfr_renamed_4)) {
            return false;
        }
        return super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_1980().hashCode();
    }
}


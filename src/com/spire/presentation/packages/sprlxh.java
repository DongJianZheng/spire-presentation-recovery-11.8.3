/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfo;
import java.math.BigInteger;

public class sprlxh
implements sprfo<BigInteger> {
    private final int cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlxh(int n, BigInteger bigInteger) {
        void arg0;
        sprlxh sprlxh2 = this;
        sprlxh2.cfr_renamed_3 = arg0;
        sprlxh2.cfr_renamed_4 = bigInteger;
    }

    @Override
    public byte cfr_renamed_324() {
        return 4;
    }

    @Override
    public long cfr_renamed_806() {
        int n = this.cfr_renamed_4.toByteArray().length;
        if (n % 8 == 0) {
            return n;
        }
        return n + (8 - n % 8);
    }

    @Override
    public sprfo cfr_renamed_9004() {
        return this;
    }

    @Override
    public int cfr_renamed_8159() {
        return this.cfr_renamed_3;
    }

    @Override
    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4;
    }
}


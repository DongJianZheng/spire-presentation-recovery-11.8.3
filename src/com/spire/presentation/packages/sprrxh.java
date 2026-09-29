/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class sprrxh
implements AlgorithmParameterSpec {
    private byte[] cfr_renamed_0;
    private spreuh cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private sprgxh cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprrxh)) {
            return false;
        }
        sprrxh sprrxh2 = (sprrxh)arg0;
        return this.cfr_renamed_1769().cfr_renamed_8896(sprrxh2.cfr_renamed_1769()) && this.cfr_renamed_1145().cfr_renamed_8927(sprrxh2.cfr_renamed_1145());
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_3;
    }

    public sprgxh cfr_renamed_1769() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        return this.cfr_renamed_1769().hashCode() ^ this.cfr_renamed_1145().hashCode();
    }

    public spreuh cfr_renamed_1145() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprrxh(sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprrxh sprrxh2 = this;
        sprrxh sprrxh3 = this;
        this.cfr_renamed_4 = arg0;
        sprrxh3.cfr_renamed_1 = arg1.cfr_renamed_1775();
        sprrxh3.cfr_renamed_3 = arg2;
        sprrxh2.cfr_renamed_2 = arg3;
        sprrxh2.cfr_renamed_0 = byArray;
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprrxh(sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprrxh sprrxh2 = this;
        sprrxh sprrxh3 = this;
        this.cfr_renamed_4 = arg0;
        sprrxh3.cfr_renamed_1 = arg1.cfr_renamed_1775();
        sprrxh3.cfr_renamed_3 = arg2;
        sprrxh2.cfr_renamed_2 = BigInteger.valueOf(1L);
        sprrxh2.cfr_renamed_0 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprrxh(sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger, BigInteger bigInteger2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprrxh sprrxh2 = this;
        sprrxh sprrxh3 = this;
        this.cfr_renamed_4 = arg0;
        sprrxh3.cfr_renamed_1 = arg1.cfr_renamed_1775();
        sprrxh3.cfr_renamed_3 = arg2;
        sprrxh2.cfr_renamed_2 = arg3;
        sprrxh2.cfr_renamed_0 = null;
    }
}


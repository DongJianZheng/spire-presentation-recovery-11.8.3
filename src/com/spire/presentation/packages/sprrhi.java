/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprsuk;
import com.spire.presentation.packages.sprwsk;
import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

public class sprrhi
extends DHParameterSpec {
    private sprsuk cfr_renamed_1;
    private final BigInteger cfr_renamed_2;
    private final int cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrhi(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int n, int n2) {
        void arg3;
        void arg1;
        void arg5;
        void arg2;
        void arg0;
        sprrhi sprrhi2 = this;
        super((BigInteger)arg0, (BigInteger)arg2, (int)arg5);
        this.cfr_renamed_4 = arg1;
        sprrhi2.cfr_renamed_2 = arg3;
        sprrhi2.cfr_renamed_3 = n;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprrhi(sprwsk sprwsk2) {
        this(arg0.cfr_renamed_1155(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_1145(), arg0.cfr_renamed_2616(), arg0.cfr_renamed_1186(), arg0.cfr_renamed_2331());
        void arg0;
        this.cfr_renamed_1 = sprwsk2.cfr_renamed_3371();
    }

    public sprrhi(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3) {
        this(arg0, arg1, arg2, null, arg3);
    }

    public sprrhi(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, 0, arg4);
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_3;
    }

    public sprrhi(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, null, 0);
    }

    public sprwsk cfr_renamed_3373() {
        sprrhi sprrhi2 = this;
        sprrhi sprrhi3 = this;
        return new sprwsk(this.getP(), this.getG(), sprrhi2.cfr_renamed_4, sprrhi2.cfr_renamed_3, this.getL(), sprrhi3.cfr_renamed_2, sprrhi3.cfr_renamed_1);
    }

    public BigInteger cfr_renamed_2616() {
        return this.cfr_renamed_2;
    }
}


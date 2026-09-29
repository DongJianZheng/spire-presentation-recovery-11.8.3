/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class sprtdi
extends DHPublicKeySpec {
    private final DHParameterSpec cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtdi(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        super((BigInteger)arg0, arg1.getP(), arg1.getG());
        void arg1;
        void arg0;
        this.cfr_renamed_4 = dHParameterSpec;
    }

    public DHParameterSpec cfr_renamed_2110() {
        return this.cfr_renamed_4;
    }
}


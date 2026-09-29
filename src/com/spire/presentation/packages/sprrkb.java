/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

public abstract class sprrkb
extends AlgorithmParameterGeneratorSpi {
    public int cfr_renamed_3 = 1024;
    public SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        sprrkb sprrkb2 = this;
        sprrkb2.cfr_renamed_3 = arg0;
        sprrkb2.cfr_renamed_4 = secureRandom;
    }
}


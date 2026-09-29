/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprrr;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public abstract class spraci
extends AlgorithmParameterGeneratorSpi {
    public SecureRandom cfr_renamed_2;
    public int cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    public final AlgorithmParameters cfr_renamed_9250(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.cfr_renamed_4.cfr_renamed_1540(arg0);
    }

    public spraci() {
        spraci spraci2 = this;
        this.cfr_renamed_4 = new sprdki();
        this.cfr_renamed_3 = 1024;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        spraci spraci2 = this;
        spraci2.cfr_renamed_3 = arg0;
        spraci2.cfr_renamed_2 = secureRandom;
    }
}


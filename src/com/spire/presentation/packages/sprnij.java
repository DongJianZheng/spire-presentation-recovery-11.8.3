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

public abstract class sprnij
extends AlgorithmParameterGeneratorSpi {
    private final sprrr cfr_renamed_4;

    public final AlgorithmParameters cfr_renamed_9250(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.cfr_renamed_4.cfr_renamed_1540(arg0);
    }

    public sprnij() {
        sprnij sprnij2 = this;
        sprnij2.cfr_renamed_4 = new sprdki();
    }
}


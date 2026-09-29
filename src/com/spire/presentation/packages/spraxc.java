/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgd;
import com.spire.presentation.packages.sprrwja;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.sprzmd;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class spraxc
extends AlgorithmParameterGeneratorSpi {
    public SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprbgd sprbgd2;
        sprbgd sprbgd3 = new sprbgd();
        if (this.cfr_renamed_2 != null) {
            sprbgd sprbgd4 = sprbgd3;
            sprbgd2 = sprbgd4;
            sprbgd4.cfr_renamed_2492(this.cfr_renamed_4, 20, this.cfr_renamed_2);
        } else {
            sprbgd sprbgd5 = sprbgd3;
            sprbgd2 = sprbgd5;
            sprbgd5.cfr_renamed_2492(this.cfr_renamed_4, 20, new SecureRandom());
        }
        sprzmd sprzmd2 = sprbgd2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(sprrwja.cfr_renamed_9("/U"), "BC");
            algorithmParameters.init(new DHParameterSpec(sprzmd2.cfr_renamed_1155(), sprzmd2.cfr_renamed_1145(), this.cfr_renamed_3));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprtkm.cfr_renamed_9("\u001bk\u007fS>Q>N:W:Q\u007fD:M:Q>W0Q\u007fQ:R*J-F,\u0003>\u0003\u001bk\u0018F1s>Q>N:W:Q\fS:@\u007fE0Q\u007fJ1J+J>O6P>W6L1"));
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec)arg0;
        spraxc spraxc2 = this;
        DHGenParameterSpec dHGenParameterSpec2 = dHGenParameterSpec;
        this.cfr_renamed_4 = dHGenParameterSpec2.getPrimeSize();
        spraxc2.cfr_renamed_3 = dHGenParameterSpec2.getExponentSize();
        spraxc2.cfr_renamed_2 = arg1;
    }

    public spraxc() {
        spraxc spraxc2 = this;
        spraxc2.cfr_renamed_4 = 1024;
        spraxc2.cfr_renamed_3 = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        spraxc spraxc2 = this;
        spraxc2.cfr_renamed_4 = arg0;
        spraxc2.cfr_renamed_2 = secureRandom;
    }
}


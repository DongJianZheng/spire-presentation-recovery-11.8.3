/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnhl;
import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.spryvd;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class sprjnc
extends AlgorithmParameterGeneratorSpi {
    public SecureRandom cfr_renamed_2;
    public int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException(spryvd.cfr_renamed_9("\u0019I}q<s<l8u8s}f8o8s<u2s}s8p(h/d.!<!\u0019I\u001ad3Q<s<l8u8s\u000eq8b}g2s}h3h)h<m4r<u4n3"));
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec)arg0;
        sprjnc sprjnc2 = this;
        DHGenParameterSpec dHGenParameterSpec2 = dHGenParameterSpec;
        this.cfr_renamed_3 = dHGenParameterSpec2.getPrimeSize();
        sprjnc2.cfr_renamed_4 = dHGenParameterSpec2.getExponentSize();
        sprjnc2.cfr_renamed_2 = arg1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        sprjnc sprjnc2 = this;
        sprjnc2.cfr_renamed_3 = arg0;
        sprjnc2.cfr_renamed_2 = secureRandom;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprvnd sprvnd2;
        sprvnd sprvnd3 = new sprvnd();
        if (this.cfr_renamed_2 != null) {
            sprvnd sprvnd4 = sprvnd3;
            sprvnd2 = sprvnd4;
            sprvnd4.cfr_renamed_2492(this.cfr_renamed_3, 20, this.cfr_renamed_2);
        } else {
            sprvnd sprvnd5 = sprvnd3;
            sprvnd2 = sprvnd5;
            sprvnd5.cfr_renamed_2492(this.cfr_renamed_3, 20, new SecureRandom());
        }
        sprpgd sprpgd2 = sprvnd2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(sprnhl.cfr_renamed_9("]5_8u8t"), "BC");
            algorithmParameters.init(new DHParameterSpec(sprpgd2.cfr_renamed_1155(), sprpgd2.cfr_renamed_1145(), this.cfr_renamed_4));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public sprjnc() {
        sprjnc sprjnc2 = this;
        sprjnc2.cfr_renamed_3 = 1024;
        sprjnc2.cfr_renamed_4 = 0;
    }
}


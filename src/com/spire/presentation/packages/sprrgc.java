/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfd;
import com.spire.presentation.packages.sprhur;
import com.spire.presentation.packages.sprnnb;
import com.spire.presentation.packages.sprqjd;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprtxc;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public abstract class sprrgc
extends AlgorithmParameterGeneratorSpi {
    public SecureRandom cfr_renamed_3;
    public int cfr_renamed_4 = 1024;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprqjd sprqjd2;
        sprqjd sprqjd3 = new sprqjd();
        if (this.cfr_renamed_3 != null) {
            sprqjd sprqjd4 = sprqjd3;
            sprqjd2 = sprqjd4;
            sprqjd4.cfr_renamed_2492(this.cfr_renamed_4, 2, this.cfr_renamed_3);
        } else {
            sprqjd sprqjd5 = sprqjd3;
            sprqjd2 = sprqjd5;
            sprqjd5.cfr_renamed_2492(this.cfr_renamed_4, 2, new SecureRandom());
        }
        sprcfd sprcfd2 = sprqjd2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(sprtxc.cfr_renamed_9("o\u0007{\u001c\u001b|\u0019x"), "BC");
            algorithmParameters.init(new sprnnb(new sprrob(sprcfd2.cfr_renamed_1155(), sprcfd2.cfr_renamed_1604(), sprcfd2.cfr_renamed_1778())));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprhur.cfr_renamed_9("\u001ecp\u007f%| c\"x5hpM<k?~9x8a\u0000m\"m=i$i\"_ i3,6c\",\u0017C\u0003Xc8a<p|1~1a5x5~pk5b5~1x9c>\""));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        sprrgc sprrgc2 = this;
        sprrgc2.cfr_renamed_4 = arg0;
        sprrgc2.cfr_renamed_3 = secureRandom;
    }
}


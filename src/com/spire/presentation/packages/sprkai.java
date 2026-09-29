/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprtkh;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class sprkai
extends KeyGeneratorSpi {
    public boolean cfr_renamed_0;
    public sprjyk cfr_renamed_1;
    public int cfr_renamed_2;
    public int cfr_renamed_3;
    public String cfr_renamed_4;

    @Override
    public void engineInit(SecureRandom arg0) {
        if (arg0 != null) {
            this.cfr_renamed_1.cfr_renamed_5536(new sprgye(arg0, this.cfr_renamed_2));
            this.cfr_renamed_0 = false;
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprtkh.cfr_renamed_9("'T\u001d\u001b V\u0019W\fV\fU\u001d^\r"));
    }

    /*
     * WARNING - void declaration
     */
    public sprkai(String string, int n, sprjyk sprjyk2) {
        void arg2;
        void arg0;
        sprkai sprkai2 = this;
        this.cfr_renamed_0 = true;
        sprkai2.cfr_renamed_4 = arg0;
        sprkai2.cfr_renamed_3 = sprkai2.cfr_renamed_2 = n;
        this.cfr_renamed_1 = arg2;
    }

    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_0) {
            this.cfr_renamed_1.cfr_renamed_5536(new sprgye(sprybl.cfr_renamed_2794(), this.cfr_renamed_2));
            this.cfr_renamed_0 = false;
        }
        return new SecretKeySpec(this.cfr_renamed_1.cfr_renamed_2405(), this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        try {
            if (arg1 == null) {
                arg1 = sprybl.cfr_renamed_2794();
            }
            this.cfr_renamed_1.cfr_renamed_5536(new sprgye(arg1, arg0));
            this.cfr_renamed_0 = false;
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new InvalidParameterException(illegalArgumentException.getMessage());
        }
    }
}


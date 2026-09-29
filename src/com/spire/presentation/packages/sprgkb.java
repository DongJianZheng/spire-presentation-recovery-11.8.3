/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprwed;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class sprgkb
extends KeyGeneratorSpi {
    public int cfr_renamed_0;
    public sprwed cfr_renamed_1;
    public int cfr_renamed_2;
    public boolean cfr_renamed_3;
    public String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprgkb(String string, int n, sprwed sprwed2) {
        void arg2;
        void arg0;
        sprgkb sprgkb2 = this;
        this.cfr_renamed_3 = true;
        sprgkb2.cfr_renamed_4 = arg0;
        sprgkb2.cfr_renamed_0 = sprgkb2.cfr_renamed_2 = n;
        this.cfr_renamed_1 = arg2;
    }

    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_3) {
            this.cfr_renamed_1.cfr_renamed_1222(new sprccb(new SecureRandom(), this.cfr_renamed_2));
            this.cfr_renamed_3 = false;
        }
        return new SecretKeySpec(this.cfr_renamed_1.cfr_renamed_2405(), this.cfr_renamed_4);
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        if (arg0 != null) {
            this.cfr_renamed_1.cfr_renamed_1222(new sprccb(arg0, this.cfr_renamed_2));
            this.cfr_renamed_3 = false;
        }
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
                arg1 = new SecureRandom();
            }
            this.cfr_renamed_1.cfr_renamed_1222(new sprccb(arg1, arg0));
            this.cfr_renamed_3 = false;
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new InvalidParameterException(illegalArgumentException.getMessage());
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprbjk.cfr_renamed_9("}3G|z1C0V1V2G9W"));
    }
}


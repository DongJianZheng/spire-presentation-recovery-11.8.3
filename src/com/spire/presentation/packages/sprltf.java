/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spreff;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprhqf;
import com.spire.presentation.packages.sprlya;
import com.spire.presentation.packages.sprppf;
import com.spire.presentation.packages.sprvcf;
import com.spire.presentation.packages.spryye;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public class sprltf
extends sprhqf
implements sprdl,
sprhl {
    private spreff cfr_renamed_4;

    @Override
    public void cfr_renamed_1208(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        spryye spryye2 = sprppf.cfr_renamed_1220((PrivateKey)arg0);
        sprltf sprltf2 = this;
        sprltf2.cfr_renamed_4.cfr_renamed_5535(false, spryye2);
        sprltf2.cfr_renamed_1 = sprltf2.cfr_renamed_4.cfr_renamed_1;
        sprltf2.cfr_renamed_0 = sprltf2.cfr_renamed_4.cfr_renamed_4;
    }

    @Override
    public String cfr_renamed_313() {
        return sprlya.cfr_renamed_9("KWCXoQeQV\u007fEg");
    }

    @Override
    public int cfr_renamed_1204(Key arg0) throws InvalidKeyException {
        sprltf sprltf2;
        sprvcf sprvcf2;
        if (arg0 instanceof PublicKey) {
            sprvcf2 = (sprvcf)sprppf.cfr_renamed_1216((PublicKey)arg0);
            sprltf2 = this;
        } else {
            sprvcf2 = (sprvcf)sprppf.cfr_renamed_1220((PrivateKey)arg0);
            sprltf2 = this;
        }
        return sprltf2.cfr_renamed_4.cfr_renamed_5633(sprvcf2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_4.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            throw new IllegalBlockSizeException(exception.getMessage());
        }
    }

    public sprltf(spreff spreff2) {
        this.cfr_renamed_4 = spreff2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_136(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_4.cfr_renamed_136(arg0);
        }
        catch (Exception exception) {
            throw new IllegalBlockSizeException(exception.getMessage());
        }
    }

    @Override
    public void cfr_renamed_1210(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprbj sprbj2 = sprppf.cfr_renamed_1216((PublicKey)arg0);
        sprbj2 = new sprbgk(sprbj2, arg2);
        sprltf sprltf2 = this;
        sprltf2.cfr_renamed_4.cfr_renamed_5535(true, sprbj2);
        sprltf2.cfr_renamed_1 = sprltf2.cfr_renamed_4.cfr_renamed_1;
        sprltf2.cfr_renamed_0 = sprltf2.cfr_renamed_4.cfr_renamed_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradi;
import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprbag;
import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprmyf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwnf;
import com.spire.presentation.packages.sprwpf;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprdkf
extends KeyGeneratorSpi {
    private spriai cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprcii cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg0;
        void arg1;
        this.cfr_renamed_3 = arg1;
        if (algorithmParameterSpec instanceof sprcii) {
            this.cfr_renamed_4 = (sprcii)arg0;
            this.cfr_renamed_2 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            sprdkf sprdkf2 = this;
            sprdkf2.cfr_renamed_4 = null;
            sprdkf2.cfr_renamed_2 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(spravo.cfr_renamed_9("</\"/&6'a:1,\""));
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(spradi.cfr_renamed_9("Z'p%t#|8{w{8awf\"e'z%a2q"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_4 == null) {
            sprwpf sprwpf2 = (sprwpf)this.cfr_renamed_2.cfr_renamed_1369();
            sprmyf sprmyf2 = new sprmyf(sprwpf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_2.cfr_renamed_5684();
            byte[] byArray2 = sprmyf2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_2.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprwnf sprwnf2 = (sprwnf)this.cfr_renamed_4.cfr_renamed_1157();
        sprbag sprbag2 = new sprbag(this.cfr_renamed_3);
        sprki sprki2 = sprbag2.cfr_renamed_5686(sprwnf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_4.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(spravo.cfr_renamed_9("\"$0a*-, '49a/  -,%"));
        }
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(spradi.cfr_renamed_9("Z'p%t#|8{w{8awf\"e'z%a2q"));
    }
}


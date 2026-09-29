/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprezh;
import com.spire.presentation.packages.sprhtf;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprjjf;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpjg;
import com.spire.presentation.packages.sprshha;
import com.spire.presentation.packages.spruhg;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprblf
extends KeyGeneratorSpi {
    private spriai cfr_renamed_2;
    private sprcii cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprezh.cfr_renamed_9("H~b|fznai.ias.t{w~h|skc"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_3 == null) {
            sprjjf sprjjf2 = (sprjjf)this.cfr_renamed_2.cfr_renamed_1369();
            sprpjg sprpjg2 = new sprpjg(sprjjf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_2.cfr_renamed_5684();
            byte[] byArray2 = sprpjg2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_2.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprhtf sprhtf2 = (sprhtf)this.cfr_renamed_3.cfr_renamed_1157();
        spruhg spruhg2 = new spruhg(this.cfr_renamed_4);
        sprki sprki2 = spruhg2.cfr_renamed_5686(sprhtf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_3.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprshha.cfr_renamed_9(".I<\f&@ M+Y5\f#M,@ H"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg0;
        void arg1;
        this.cfr_renamed_4 = arg1;
        if (algorithmParameterSpec instanceof sprcii) {
            this.cfr_renamed_3 = (sprcii)arg0;
            this.cfr_renamed_2 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            sprblf sprblf2 = this;
            sprblf2.cfr_renamed_3 = null;
            sprblf2.cfr_renamed_2 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprezh.cfr_renamed_9("{ieiap`'}wkd"));
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprshha.cfr_renamed_9("c5I7M1E*BeB*Xe_0\\5C7X H"));
    }
}


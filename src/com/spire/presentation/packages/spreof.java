/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpf;
import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprdvf;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprmvz;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwjaa;
import com.spire.presentation.packages.sprzsf;
import com.spire.presentation.packages.sprzvf;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class spreof
extends KeyGeneratorSpi {
    private sprcii cfr_renamed_2;
    private spriai cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg0;
        void arg1;
        this.cfr_renamed_4 = arg1;
        if (algorithmParameterSpec instanceof sprcii) {
            this.cfr_renamed_2 = (sprcii)arg0;
            this.cfr_renamed_3 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            spreof spreof2 = this;
            spreof2.cfr_renamed_2 = null;
            spreof2.cfr_renamed_3 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprwjaa.cfr_renamed_9("\u0016i\bi\fp\r'\u0010w\u0006d"));
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprmvz.cfr_renamed_9("k1A3E5M.JaJ.PaW4T1K3P$@"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_2 == null) {
            sprbpf sprbpf2 = (sprbpf)this.cfr_renamed_3.cfr_renamed_1369();
            sprdvf sprdvf2 = new sprdvf(sprbpf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_3.cfr_renamed_5684();
            byte[] byArray2 = sprdvf2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_3.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprzsf sprzsf2 = (sprzsf)this.cfr_renamed_2.cfr_renamed_1157();
        sprzvf sprzvf2 = new sprzvf(this.cfr_renamed_4);
        sprki sprki2 = sprzvf2.cfr_renamed_5686(sprzsf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_2.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprwjaa.cfr_renamed_9("\bb\u001a'\u0000k\u0006f\rr\u0013'\u0005f\nk\u0006c"));
        }
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprmvz.cfr_renamed_9("k1A3E5M.JaJ.PaW4T1K3P$@"));
    }
}


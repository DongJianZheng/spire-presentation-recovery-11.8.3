/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprlbf;
import com.spire.presentation.packages.sprotf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprseg;
import com.spire.presentation.packages.sprxze;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprzgf
extends KeyGeneratorSpi {
    private sprcii cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private spriai cfr_renamed_4;

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprfto.cfr_renamed_9("\u001et4v0p8k?$?k%$\"q!t>v%a5"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_2 == null) {
            sprxze sprxze2 = (sprxze)this.cfr_renamed_4.cfr_renamed_1369();
            sprotf sprotf2 = new sprotf(sprxze2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_5684();
            byte[] byArray2 = sprotf2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_4.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprlbf sprlbf2 = (sprlbf)this.cfr_renamed_2.cfr_renamed_1157();
        sprseg sprseg2 = new sprseg(this.cfr_renamed_3);
        sprki sprki2 = sprseg2.cfr_renamed_5686(sprlbf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_2.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprcye.cfr_renamed_9("\u001e9\f|\u00160\u0010=\u001b)\u0005|\u0013=\u001c0\u00108"));
        }
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprfto.cfr_renamed_9("\u001et4v0p8k?$?k%$\"q!t>v%a5"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg0;
        void arg1;
        this.cfr_renamed_3 = arg1;
        if (algorithmParameterSpec instanceof sprcii) {
            this.cfr_renamed_2 = (sprcii)arg0;
            this.cfr_renamed_4 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            sprzgf sprzgf2 = this;
            sprzgf2.cfr_renamed_2 = null;
            sprzgf2.cfr_renamed_4 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprcye.cfr_renamed_9("\u00002\u001e2\u001a+\u001b|\u0006,\u0010?"));
    }
}


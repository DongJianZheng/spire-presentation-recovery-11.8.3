/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprhrf;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprnlf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprueg;
import com.spire.presentation.packages.sprwdg;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprnnf
extends KeyGeneratorSpi {
    private SecureRandom cfr_renamed_2;
    private sprcii cfr_renamed_3;
    private spriai cfr_renamed_4;

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprrob.cfr_renamed_9("\u0005_/]+[#@$\u000f$@>\u000f9Z:_%]>J."));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_3 == null) {
            sprnlf sprnlf2 = (sprnlf)this.cfr_renamed_4.cfr_renamed_1369();
            sprwdg sprwdg2 = new sprwdg(sprnlf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_5684();
            byte[] byArray2 = sprwdg2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_4.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprhrf sprhrf2 = (sprhrf)this.cfr_renamed_3.cfr_renamed_1157();
        sprueg sprueg2 = new sprueg(this.cfr_renamed_2);
        sprki sprki2 = sprueg2.cfr_renamed_5686(sprhrf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_3.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprraja.cfr_renamed_9(":K(\u000e2B4O?[!\u000e7O8B4J"));
        }
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprrob.cfr_renamed_9("\u0005_/]+[#@$\u000f$@>\u000f9Z:_%]>J."));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg0;
        void arg1;
        this.cfr_renamed_2 = arg1;
        if (algorithmParameterSpec instanceof sprcii) {
            this.cfr_renamed_3 = (sprcii)arg0;
            this.cfr_renamed_4 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            sprnnf sprnnf2 = this;
            sprnnf2.cfr_renamed_3 = null;
            sprnnf2.cfr_renamed_4 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprraja.cfr_renamed_9("$@:@>Y?\u000e\"^4M"));
    }
}


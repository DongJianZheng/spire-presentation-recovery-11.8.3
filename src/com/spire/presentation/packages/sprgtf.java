/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprgrf;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprlcg;
import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprmxf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprukf;
import com.spire.presentation.packages.sprzyaa;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprgtf
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
            sprgtf sprgtf2 = this;
            sprgtf2.cfr_renamed_4 = null;
            sprgtf2.cfr_renamed_2 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprzyaa.cfr_renamed_9("\u000fF\u0011F\u0015_\u0014\b\tX\u001fK"));
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprlyy.cfr_renamed_9("F9l;h=`&gig&}iz<y9f;},m"));
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprzyaa.cfr_renamed_9("g\nM\bI\u000eA\u0015FZF\u0015\\Z[\u000fX\nG\b\\\u001fL"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_4 == null) {
            sprukf sprukf2 = (sprukf)this.cfr_renamed_2.cfr_renamed_1369();
            sprlcg sprlcg2 = new sprlcg(sprukf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_2.cfr_renamed_5684();
            byte[] byArray2 = sprlcg2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_2.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprgrf sprgrf2 = (sprgrf)this.cfr_renamed_4.cfr_renamed_1157();
        sprmxf sprmxf2 = new sprmxf(this.cfr_renamed_3);
        sprki sprki2 = sprmxf2.cfr_renamed_5686(sprgrf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_4.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprlyy.cfr_renamed_9("\"l0)*e,h'|9)/h e,m"));
        }
    }
}


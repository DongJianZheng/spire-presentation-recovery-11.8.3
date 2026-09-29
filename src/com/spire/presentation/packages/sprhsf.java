/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcg;
import com.spire.presentation.packages.sprbmf;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpdo;
import com.spire.presentation.packages.spruyf;
import com.spire.presentation.packages.sprvlf;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprhsf
extends KeyGeneratorSpi {
    private spriai cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprcii cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_4 == null) {
            sprvlf sprvlf2 = (sprvlf)this.cfr_renamed_2.cfr_renamed_1369();
            spruyf spruyf2 = new spruyf(sprvlf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_2.cfr_renamed_5684();
            byte[] byArray2 = spruyf2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_2.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprbmf sprbmf2 = (sprbmf)this.cfr_renamed_4.cfr_renamed_1157();
        sprbcg sprbcg2 = new sprbcg(this.cfr_renamed_3);
        sprki sprki2 = sprbcg2.cfr_renamed_5686(sprbmf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_4.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprbva.cfr_renamed_9("Iv[3A\u007fGrLfR3DrK\u007fGw"));
        }
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprpdo.cfr_renamed_9("T3~1z7r,ucu,och6k3t1o&\u007f"));
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
            this.cfr_renamed_4 = (sprcii)arg0;
            this.cfr_renamed_2 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            sprhsf sprhsf2 = this;
            sprhsf2.cfr_renamed_4 = null;
            sprhsf2.cfr_renamed_2 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprbva.cfr_renamed_9("W}I}MdL3QcGp"));
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprpdo.cfr_renamed_9("T3~1z7r,ucu,och6k3t1o&\u007f"));
    }
}


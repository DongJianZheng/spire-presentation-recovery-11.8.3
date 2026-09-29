/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprejf;
import com.spire.presentation.packages.spreno;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprnhg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsgg;
import com.spire.presentation.packages.spruof;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprxqf
extends KeyGeneratorSpi {
    private SecureRandom cfr_renamed_2;
    private spriai cfr_renamed_3;
    private sprcii cfr_renamed_4;

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(spreno.cfr_renamed_9("+\u0017\u0001\u0015\u0005\u0013\r\b\nG\n\b\u0010G\u0017\u0012\u0014\u0017\u000b\u0015\u0010\u0002\u0000"));
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
            this.cfr_renamed_4 = (sprcii)arg0;
            this.cfr_renamed_3 = null;
            return;
        }
        if (arg0 instanceof spriai) {
            sprxqf sprxqf2 = this;
            sprxqf2.cfr_renamed_4 = null;
            sprxqf2.cfr_renamed_3 = (spriai)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprlxg.cfr_renamed_9("O.Q.U7T`I0_#"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_4 == null) {
            spruof spruof2 = (spruof)this.cfr_renamed_3.cfr_renamed_1369();
            sprsgg sprsgg2 = new sprsgg(spruof2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_3.cfr_renamed_5684();
            byte[] byArray2 = sprsgg2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_3.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprejf sprejf2 = (sprejf)this.cfr_renamed_4.cfr_renamed_1157();
        sprnhg sprnhg2 = new sprnhg(this.cfr_renamed_2);
        sprki sprki2 = sprnhg2.cfr_renamed_5686(sprejf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_4.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(spreno.cfr_renamed_9("\f\u0001\u001eD\u0004\b\u0002\u0005\t\u0011\u0017D\u0001\u0005\u000e\b\u0002\u0000"));
        }
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprlxg.cfr_renamed_9("\u000fJ%H!N)U.\u001a.U4\u001a3O0J/H4_$"));
    }
}


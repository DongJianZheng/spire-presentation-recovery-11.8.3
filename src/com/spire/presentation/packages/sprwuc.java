/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprfhd;
import com.spire.presentation.packages.sprfxc;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprpcka;
import com.spire.presentation.packages.sprred;
import com.spire.presentation.packages.sprtzc;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprxrq;
import com.spire.presentation.packages.sprynd;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;

public class sprwuc
extends KeyPairGenerator {
    public sprred cfr_renamed_91;
    public boolean cfr_renamed_0;
    public int cfr_renamed_1;
    public SecureRandom cfr_renamed_2;
    public sprfhd cfr_renamed_3;
    public int cfr_renamed_4;

    public sprwuc() {
        sprwuc sprwuc2 = this;
        super("DSA");
        sprwuc sprwuc3 = this;
        this.cfr_renamed_91 = new sprred();
        this.cfr_renamed_4 = 1024;
        sprwuc2.cfr_renamed_1 = 20;
        sprwuc2.cfr_renamed_2 = new SecureRandom();
        sprwuc2.cfr_renamed_0 = false;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        if (arg0 < 512 || arg0 > 4096 || arg0 < 1024 && arg0 % 64 != 0 || arg0 >= 1024 && arg0 % 1024 != 0) {
            throw new InvalidParameterException(sprpcka.cfr_renamed_9("NUODSFII\u001dLHRI\u0001_D\u001dGONP\u0001\b\u0010\u000f\u0001\u0010\u0001\t\u0011\u0004\u0017\u001d@SE\u001d@\u001dLHMIHMMX\u0001RG\u001d\u0010\r\u0013\t\u0001\\CRWX\u0001\f\u0011\u000f\u0015"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = arg1;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprxrq.cfr_renamed_9(">V<V#R:R<\u0017!U$R-CnY!CnVns\u001dv\u001eV<V#R:R<d>R-"));
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec)arg0;
        sprwuc sprwuc2 = this;
        this.cfr_renamed_3 = new sprfhd(arg1, new sprcld(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.cfr_renamed_91.cfr_renamed_1222(this.cfr_renamed_3);
        this.cfr_renamed_0 = true;
    }

    @Override
    public KeyPair generateKeyPair() {
        Object object;
        if (!this.cfr_renamed_0) {
            object = new sprynd();
            sprwuc sprwuc2 = this;
            sprwuc sprwuc3 = this;
            ((sprynd)object).cfr_renamed_2492(sprwuc2.cfr_renamed_4, sprwuc3.cfr_renamed_1, sprwuc3.cfr_renamed_2);
            sprwuc sprwuc4 = this;
            this.cfr_renamed_3 = new sprfhd(this.cfr_renamed_2, ((sprynd)object).cfr_renamed_2493());
            sprwuc2.cfr_renamed_91.cfr_renamed_1222(this.cfr_renamed_3);
            sprwuc2.cfr_renamed_0 = true;
        }
        object = this.cfr_renamed_91.cfr_renamed_1223();
        spruld spruld2 = (spruld)((sprwnd)object).cfr_renamed_1224();
        sprlnd sprlnd2 = (sprlnd)((sprwnd)object).cfr_renamed_1225();
        return new KeyPair(new sprtzc(spruld2), new sprfxc(sprlnd2));
    }
}


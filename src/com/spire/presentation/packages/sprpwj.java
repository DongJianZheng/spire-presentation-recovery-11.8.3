/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfsj;
import com.spire.presentation.packages.sprieba;
import com.spire.presentation.packages.sprjrk;
import com.spire.presentation.packages.sprnij;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class sprpwj
extends sprnij {
    public int cfr_renamed_2;
    private int cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        sprpwj sprpwj2 = this;
        sprpwj2.cfr_renamed_2 = arg0;
        sprpwj2.cfr_renamed_4 = secureRandom;
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprtdm.cfr_renamed_9("*~NF\u000fD\u000f[\u000bB\u000bDNQ\u000bX\u000bD\u000fB\u0001DND\u000bG\u001b_\u001cS\u001d\u0016\u000f\u0016*~)S\u0000f\u000fD\u000f[\u000bB\u000bD=F\u000bUNP\u0001DN_\u0000_\u001a_\u000fZ\u0007E\u000fB\u0007Y\u0000"));
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec)arg0;
        sprpwj sprpwj2 = this;
        DHGenParameterSpec dHGenParameterSpec2 = dHGenParameterSpec;
        this.cfr_renamed_2 = dHGenParameterSpec2.getPrimeSize();
        sprpwj2.cfr_renamed_3 = dHGenParameterSpec2.getExponentSize();
        sprpwj2.cfr_renamed_4 = arg1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprjrk sprjrk2 = new sprjrk();
        int n = sprfsj.cfr_renamed_9372(this.cfr_renamed_2);
        sprjrk2.cfr_renamed_2492(this.cfr_renamed_2, n, sprybl.cfr_renamed_5688(this.cfr_renamed_4));
        sprwsk sprwsk2 = sprjrk2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = this.cfr_renamed_9250(sprieba.cfr_renamed_9("v^"));
            algorithmParameters.init(new DHParameterSpec(sprwsk2.cfr_renamed_1155(), sprwsk2.cfr_renamed_1145(), this.cfr_renamed_3));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public sprpwj() {
        sprpwj sprpwj2 = this;
        sprpwj2.cfr_renamed_2 = 2048;
        sprpwj2.cfr_renamed_3 = 0;
    }
}


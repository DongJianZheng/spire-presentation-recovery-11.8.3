/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabl;
import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprkxy;
import com.spire.presentation.packages.sprljn;
import com.spire.presentation.packages.sprnij;
import com.spire.presentation.packages.sprybl;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class sprkqj
extends sprnij {
    public SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    public int cfr_renamed_4;

    public sprkqj() {
        sprkqj sprkqj2 = this;
        sprkqj2.cfr_renamed_4 = 1024;
        sprkqj2.cfr_renamed_3 = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(int n, SecureRandom secureRandom) {
        void arg0;
        sprkqj sprkqj2 = this;
        sprkqj2.cfr_renamed_4 = arg0;
        sprkqj2.cfr_renamed_2 = secureRandom;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprabl sprabl2;
        sprabl sprabl3 = new sprabl();
        if (this.cfr_renamed_2 != null) {
            sprabl sprabl4 = sprabl3;
            sprabl2 = sprabl4;
            sprabl4.cfr_renamed_2492(this.cfr_renamed_4, 20, this.cfr_renamed_2);
        } else {
            sprabl sprabl5 = sprabl3;
            sprabl2 = sprabl5;
            sprabl5.cfr_renamed_2492(this.cfr_renamed_4, 20, sprybl.cfr_renamed_2794());
        }
        sprcuk sprcuk2 = sprabl2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = this.cfr_renamed_9250(sprkxy.cfr_renamed_9("i%k(A(@"));
            algorithmParameters.init(new DHParameterSpec(sprcuk2.cfr_renamed_1155(), sprcuk2.cfr_renamed_1145(), this.cfr_renamed_3));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprljn.cfr_renamed_9("4xP@\u0011B\u0011]\u0015D\u0015BPW\u0015^\u0015B\u0011D\u001fBPB\u0015A\u0005Y\u0002U\u0003\u0010\u0011\u00104x7U\u001e`\u0011B\u0011]\u0015D\u0015B#@\u0015SPV\u001fBPY\u001eY\u0004Y\u0011\\\u0019C\u0011D\u0019_\u001e"));
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec)arg0;
        sprkqj sprkqj2 = this;
        DHGenParameterSpec dHGenParameterSpec2 = dHGenParameterSpec;
        this.cfr_renamed_4 = dHGenParameterSpec2.getPrimeSize();
        sprkqj2.cfr_renamed_3 = dHGenParameterSpec2.getExponentSize();
        sprkqj2.cfr_renamed_2 = arg1;
    }
}


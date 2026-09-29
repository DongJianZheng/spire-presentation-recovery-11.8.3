/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgf;
import com.spire.presentation.packages.sprerz;
import com.spire.presentation.packages.sprhbf;
import com.spire.presentation.packages.sproof;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprsjf;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzef;
import com.spire.presentation.packages.sprzwe;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprjnf
extends KeyPairGenerator {
    private sprhbf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg1;
        this.cfr_renamed_4 = new sprhbf();
        sprbgf sprbgf2 = new sprbgf((SecureRandom)arg1, new sprzwe());
        this.cfr_renamed_4.cfr_renamed_5536(sprbgf2);
    }

    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        sprjnf sprjnf2 = this;
        sprjnf2.cfr_renamed_4 = new sprhbf();
        sprzef sprzef2 = (sprzef)algorithmParameterSpec;
        sprbgf sprbgf2 = new sprbgf(sprybl.cfr_renamed_2794(), new sprzwe(sprzef2.cfr_renamed_1186(), sprzef2.cfr_renamed_1144(), sprzef2.cfr_renamed_580()));
        this.cfr_renamed_4.cfr_renamed_5536(sprbgf2);
    }

    public sprjnf() {
        super(sprerz.cfr_renamed_9("%q-~\u0001w\u000bwEQ+SZ"));
    }

    @Override
    public KeyPair generateKeyPair() {
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprwxe sprwxe2 = (sprwxe)sprsil2.cfr_renamed_1225();
        sprvef sprvef2 = (sprvef)sprsil2.cfr_renamed_1224();
        return new KeyPair(new sproof(sprvef2), new sprsjf(sprwxe2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg1;
        sprjnf sprjnf2 = this;
        sprjnf2.cfr_renamed_4 = new sprhbf();
        sprzef sprzef2 = (sprzef)algorithmParameterSpec;
        sprbgf sprbgf2 = new sprbgf((SecureRandom)arg1, new sprzwe(sprzef2.cfr_renamed_1186(), sprzef2.cfr_renamed_1144(), sprzef2.cfr_renamed_580()));
        this.cfr_renamed_4.cfr_renamed_5536(sprbgf2);
    }
}


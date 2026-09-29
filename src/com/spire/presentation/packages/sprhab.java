/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfb;
import com.spire.presentation.packages.sprkgb;
import com.spire.presentation.packages.sprlql;
import com.spire.presentation.packages.sprndb;
import com.spire.presentation.packages.sprrpa;
import com.spire.presentation.packages.sprtbb;
import com.spire.presentation.packages.sprtfb;
import com.spire.presentation.packages.sprudda;
import com.spire.presentation.packages.spruxa;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprygb;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprhab
extends KeyPairGenerator {
    public spruxa cfr_renamed_0;
    public sprtbb cfr_renamed_1;
    public boolean cfr_renamed_2;
    public int cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    public sprhab() {
        sprhab sprhab2 = this;
        super(sprudda.cfr_renamed_9("}<F3M2X"));
        sprhab sprhab3 = this;
        sprhab3.cfr_renamed_1 = new sprtbb();
        sprhab2.cfr_renamed_3 = 1024;
        sprhab2.cfr_renamed_4 = new SecureRandom();
        sprhab2.cfr_renamed_2 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof sprrpa)) {
            throw new InvalidAlgorithmParameterException(sprlql.cfr_renamed_9("m\u0006o\u0006p\u0002i\u0002oGr\u0005w\u0002~\u0013=\tr\u0013=\u0006=5|\u000es\u0005r\u0010M\u0006o\u0006p\u0002i\u0002o4m\u0002~"));
        }
        sprrpa sprrpa2 = (sprrpa)arg0;
        sprhab sprhab2 = this;
        this.cfr_renamed_0 = new spruxa(arg1, new sprkgb(sprrpa2.cfr_renamed_1139()));
        this.cfr_renamed_1.cfr_renamed_1222(this.cfr_renamed_0);
        this.cfr_renamed_2 = true;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_2) {
            sprhab sprhab2 = this;
            this.cfr_renamed_0 = new spruxa(this.cfr_renamed_4, new sprkgb(new sprrpa().cfr_renamed_1139()));
            this.cfr_renamed_1.cfr_renamed_1222(this.cfr_renamed_0);
            this.cfr_renamed_2 = true;
        }
        sprwnd sprwnd2 = this.cfr_renamed_1.cfr_renamed_1223();
        sprhfb sprhfb2 = (sprhfb)sprwnd2.cfr_renamed_1224();
        sprygb sprygb2 = (sprygb)sprwnd2.cfr_renamed_1225();
        return new KeyPair(new sprndb(sprhfb2), new sprtfb(sprygb2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprhab sprhab2 = this;
        sprhab2.cfr_renamed_3 = arg0;
        sprhab2.cfr_renamed_4 = secureRandom;
    }
}


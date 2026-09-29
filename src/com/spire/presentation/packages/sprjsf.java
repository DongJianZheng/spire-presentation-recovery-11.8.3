/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sprowf;
import com.spire.presentation.packages.sprqif;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprssf;
import com.spire.presentation.packages.sprwzf;
import com.spire.presentation.packages.sprxgi;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryvf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprjsf
extends KeyPairGenerator {
    public sprowf cfr_renamed_2;
    public boolean cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            this.cfr_renamed_2.cfr_renamed_5536(new sprgye(this.cfr_renamed_4, 1024));
            this.cfr_renamed_3 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_2.cfr_renamed_1223();
        spryvf spryvf2 = (spryvf)sprsil2.cfr_renamed_1224();
        sprwzf sprwzf2 = (sprwzf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprqif(spryvf2), new sprssf(sprwzf2));
    }

    public sprjsf() {
        sprjsf sprjsf2 = this;
        super(sprxgi.cfr_renamed_9("va"));
        sprjsf sprjsf3 = this;
        sprjsf2.cfr_renamed_2 = new sprowf();
        sprjsf2.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        sprjsf2.cfr_renamed_3 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(spronq.cfr_renamed_9("EzGzX~A~G;Zy_~Vo\u0015uZo\u0015iPxZ|[rF~Q"));
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        if (arg0 != 1024) {
            throw new IllegalArgumentException(sprxgi.cfr_renamed_9("K]JLVNLA\u0018DMZL\tZL\u0018\u0018\b\u001b\f\tZ@LZ"));
        }
        this.cfr_renamed_2.cfr_renamed_5536(new sprgye(arg1, 1024));
        this.cfr_renamed_3 = true;
    }
}


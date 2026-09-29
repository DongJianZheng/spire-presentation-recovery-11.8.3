/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprjmf;
import com.spire.presentation.packages.sprjog;
import com.spire.presentation.packages.sprkbg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqif;
import com.spire.presentation.packages.sprssf;
import com.spire.presentation.packages.sprsvf;
import com.spire.presentation.packages.spryvd;
import com.spire.presentation.packages.spryvf;
import com.spire.presentation.packages.spryye;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.ShortBufferException;

public class sprgqf
extends sprjmf {
    private sprsvf cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprkbg cfr_renamed_3;
    private sprqif cfr_renamed_4;

    @Override
    public byte[] engineGenerateSecret() throws IllegalStateException {
        sprgqf sprgqf2 = this;
        byte[] byArray = sproze.cfr_renamed_158(sprgqf2.cfr_renamed_2);
        sproze.cfr_renamed_492(sprgqf2.cfr_renamed_2, (byte)0);
        return byArray;
    }

    public sprgqf() {
        super(spryvd.cfr_renamed_9("O\u0015"), null);
    }

    @Override
    public void cfr_renamed_5691(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprfvd.cfr_renamed_9("\fk5F-~'.&a'}b`-zb|'\u007f7g0kb~#|#c'z'|1"));
    }

    @Override
    public void engineInit(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        if (arg0 != null) {
            this.cfr_renamed_1 = new sprsvf();
            this.cfr_renamed_1.cfr_renamed_5692(((sprssf)arg0).cfr_renamed_5650());
            return;
        }
        this.cfr_renamed_3 = new sprkbg(arg1);
    }

    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        if (!arg1) {
            throw new IllegalStateException(spryvd.cfr_renamed_9("O8v\u0015n-d}b<o}n3m$!?d}c8u*d8o}u*n}q<s)h8rs"));
        }
        this.cfr_renamed_4 = (sprqif)arg0;
        if (this.cfr_renamed_3 != null) {
            sprgqf sprgqf2 = this;
            sprjog sprjog2 = sprgqf2.cfr_renamed_3.cfr_renamed_5693((spryye)sprgqf2.cfr_renamed_4.cfr_renamed_5650());
            this.cfr_renamed_2 = sprjog2.cfr_renamed_5694();
            return new sprqif((spryvf)sprjog2.cfr_renamed_1157());
        }
        sprgqf sprgqf3 = this;
        sprgqf3.cfr_renamed_2 = sprgqf3.cfr_renamed_1.cfr_renamed_5695(sprgqf3.cfr_renamed_4.cfr_renamed_5650());
        return null;
    }

    @Override
    public int engineGenerateSecret(byte[] arg0, int arg1) throws IllegalStateException, ShortBufferException {
        System.arraycopy(this.cfr_renamed_2, 0, arg0, arg1, this.cfr_renamed_2.length);
        sprgqf sprgqf2 = this;
        sproze.cfr_renamed_492(sprgqf2.cfr_renamed_2, (byte)0);
        return sprgqf2.cfr_renamed_2.length;
    }

    @Override
    public byte[] cfr_renamed_5696() {
        return this.engineGenerateSecret();
    }
}


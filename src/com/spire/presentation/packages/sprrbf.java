/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprauf;
import com.spire.presentation.packages.sprgcf;
import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnml;
import com.spire.presentation.packages.sproyf;
import com.spire.presentation.packages.sprpze;
import com.spire.presentation.packages.sprryf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwag;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxvc;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryhf;
import com.spire.presentation.packages.sprzfl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprrbf
extends KeyPairGenerator {
    public sprauf cfr_renamed_0;
    public boolean cfr_renamed_1;
    public SecureRandom cfr_renamed_2;
    public sprlem cfr_renamed_3;
    public sproyf cfr_renamed_4;

    public sprrbf() {
        sprrbf sprrbf2 = this;
        super(sprinh.cfr_renamed_9("\u0012\n\t\u0013\u000f\u0019\u0012htl"));
        this.cfr_renamed_3 = sprwr.cfr_renamed_499;
        sprrbf sprrbf3 = this;
        sprrbf2.cfr_renamed_0 = new sprauf();
        sprrbf2.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        sprrbf2.cfr_renamed_1 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprrbf sprrbf2;
        if (!(arg0 instanceof spryhf)) {
            throw new InvalidAlgorithmParameterException(sprxvc.cfr_renamed_9("!~#~<z%z#?>};z2kqq>kq~qL\u0001W\u0018Q\u0012Lc*gT4f\u0016z?O0m0r4k4m\u0002o4|"));
        }
        spryhf spryhf2 = (spryhf)arg0;
        if (spryhf2.cfr_renamed_3234().equals("SHA512-256")) {
            sprrbf sprrbf3 = this;
            sprrbf3.cfr_renamed_3 = sprwr.cfr_renamed_499;
            sprrbf2 = this;
            sprrbf3.cfr_renamed_4 = new sproyf(arg1, new sprnml(256));
        } else {
            if (spryhf2.cfr_renamed_3234().equals("SHA3-256")) {
                sprrbf sprrbf4 = this;
                sprrbf4.cfr_renamed_3 = sprwr.cfr_renamed_129;
                sprrbf4.cfr_renamed_4 = new sproyf(arg1, new sprzfl(256));
            }
            sprrbf2 = this;
        }
        sprrbf2.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_4);
        this.cfr_renamed_1 = true;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprinh.cfr_renamed_9("4)$z\u00006&53352,\n ( 7$.$(\u0012*$9"));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_1) {
            sprrbf sprrbf2 = this;
            this.cfr_renamed_4 = new sproyf(this.cfr_renamed_2, new sprnml(256));
            this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_4);
            this.cfr_renamed_1 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_0.cfr_renamed_1223();
        sprryf sprryf2 = (sprryf)sprsil2.cfr_renamed_1224();
        sprwag sprwag2 = (sprwag)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprpze(this.cfr_renamed_3, sprryf2), new sprgcf(this.cfr_renamed_3, sprwag2));
    }
}


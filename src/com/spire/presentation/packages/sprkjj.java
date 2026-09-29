/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.spreqj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprys;
import com.spire.presentation.packages.spryye;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprkjj
extends spreqj {
    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        spryye spryye2 = sprdbk.cfr_renamed_1216(arg0);
        sprkjj sprkjj2 = this;
        sprkjj2.cfr_renamed_4.cfr_renamed_41();
        sprkjj2.cfr_renamed_3.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        spryye spryye2 = sprdbk.cfr_renamed_1220(arg0);
        sprkjj sprkjj2 = this;
        sprkjj2.cfr_renamed_4.cfr_renamed_41();
        if (sprkjj2.appRandom != null) {
            this.cfr_renamed_3.cfr_renamed_5535(true, new sprbgk(spryye2, this.appRandom));
            return;
        }
        this.cfr_renamed_3.cfr_renamed_5535(true, spryye2);
    }

    public sprkjj(sprgf arg0, sprjp arg1, sprys arg2) {
        super(arg0, arg1, arg2);
    }
}


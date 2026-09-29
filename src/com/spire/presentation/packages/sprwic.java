/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprec;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprjlc;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.spruj;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprwic
extends sprjlc {
    public sprwic(sprlc arg0, spruj arg1, sprec arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprhgb sprhgb2 = sprjkc.cfr_renamed_1220(arg0);
        sprwic sprwic2 = this;
        sprwic2.cfr_renamed_4.cfr_renamed_41();
        if (sprwic2.appRandom != null) {
            this.cfr_renamed_2.cfr_renamed_1217(true, new spraed(sprhgb2, this.appRandom));
            return;
        }
        this.cfr_renamed_2.cfr_renamed_1217(true, sprhgb2);
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprhgb sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
        sprwic sprwic2 = this;
        sprwic2.cfr_renamed_4.cfr_renamed_41();
        sprwic2.cfr_renamed_2.cfr_renamed_1217(false, sprhgb2);
    }
}


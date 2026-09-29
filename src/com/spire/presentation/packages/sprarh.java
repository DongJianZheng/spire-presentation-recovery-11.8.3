/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnn;
import com.spire.presentation.packages.sprqwg;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;

public class sprarh
implements KeySpec,
sprnn {
    private PublicKey cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    @Override
    public String getAlgorithm() {
        return sprqwg.cfr_renamed_9("\u001eW\u0004");
    }

    @Override
    public PublicKey cfr_renamed_1224() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprarh(PrivateKey privateKey, PublicKey publicKey) {
        void arg0;
        sprarh sprarh2 = this;
        sprarh2.cfr_renamed_4 = arg0;
        sprarh2.cfr_renamed_3 = publicKey;
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public PrivateKey cfr_renamed_1225() {
        return this.cfr_renamed_4;
    }

    @Override
    public byte[] getEncoded() {
        return null;
    }
}


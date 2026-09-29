/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprob;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;

public class sprsjb
implements KeySpec,
sprob {
    private PublicKey cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsjb(PrivateKey privateKey, PublicKey publicKey) {
        void arg0;
        sprsjb sprsjb2 = this;
        sprsjb2.cfr_renamed_4 = arg0;
        sprsjb2.cfr_renamed_3 = publicKey;
    }

    @Override
    public PrivateKey cfr_renamed_1225() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getAlgorithm() {
        return sprghha.cfr_renamed_9("PdJ");
    }

    @Override
    public PublicKey cfr_renamed_1224() {
        return this.cfr_renamed_3;
    }

    @Override
    public byte[] getEncoded() {
        return null;
    }

    @Override
    public String getFormat() {
        return null;
    }
}


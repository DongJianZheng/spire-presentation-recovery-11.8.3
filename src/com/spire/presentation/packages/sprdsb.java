/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqm;
import com.spire.presentation.packages.sprqb;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;

public class sprdsb
implements KeySpec,
sprqb {
    private PrivateKey cfr_renamed_2;
    private PublicKey cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public PrivateKey cfr_renamed_2094() {
        return this.cfr_renamed_4;
    }

    public sprdsb(PrivateKey arg0, PrivateKey arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public PrivateKey cfr_renamed_2095() {
        return this.cfr_renamed_2;
    }

    @Override
    public byte[] getEncoded() {
        return null;
    }

    @Override
    public String getAlgorithm() {
        return sprcqm.cfr_renamed_9("RDZVA");
    }

    @Override
    public PublicKey cfr_renamed_2096() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprdsb(PrivateKey privateKey, PrivateKey privateKey2, PublicKey publicKey) {
        void arg1;
        void arg0;
        sprdsb sprdsb2 = this;
        this.cfr_renamed_2 = arg0;
        sprdsb2.cfr_renamed_4 = arg1;
        sprdsb2.cfr_renamed_3 = publicKey;
    }
}


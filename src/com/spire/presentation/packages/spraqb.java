/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrb;
import com.spire.presentation.packages.sprwvj;
import java.security.PublicKey;
import java.security.spec.KeySpec;

public class spraqb
implements KeySpec,
sprrb {
    private PublicKey cfr_renamed_3;
    private PublicKey cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraqb(PublicKey publicKey, PublicKey publicKey2) {
        void arg0;
        spraqb spraqb2 = this;
        spraqb2.cfr_renamed_4 = arg0;
        spraqb2.cfr_renamed_3 = publicKey2;
    }

    @Override
    public PublicKey cfr_renamed_2092() {
        return this.cfr_renamed_3;
    }

    @Override
    public PublicKey cfr_renamed_2093() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public String getAlgorithm() {
        return sprwvj.cfr_renamed_9("*\u000f\"\u001d9");
    }

    @Override
    public byte[] getEncoded() {
        return null;
    }
}


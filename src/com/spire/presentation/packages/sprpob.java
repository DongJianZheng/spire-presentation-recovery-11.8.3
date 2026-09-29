/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import javax.crypto.SecretKey;

public class sprpob
implements SecretKey {
    private String cfr_renamed_4;

    @Override
    public byte[] getEncoded() {
        return null;
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_4;
    }

    public sprpob(String string) {
        this.cfr_renamed_4 = string;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import javax.crypto.SecretKey;

public final class sprkdk
implements SecretKey {
    private final byte[] cfr_renamed_3;
    private final SecretKey cfr_renamed_4;

    public boolean equals(Object arg0) {
        return this.cfr_renamed_4.equals(arg0);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_4.getAlgorithm();
    }

    /*
     * WARNING - void declaration
     */
    public sprkdk(SecretKey secretKey, byte[] byArray) {
        void arg0;
        sprkdk sprkdk2 = this;
        sprkdk2.cfr_renamed_4 = arg0;
        sprkdk2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    @Override
    public byte[] getEncoded() {
        return this.cfr_renamed_4.getEncoded();
    }

    @Override
    public String getFormat() {
        return this.cfr_renamed_4.getFormat();
    }

    public byte[] cfr_renamed_5684() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }
}


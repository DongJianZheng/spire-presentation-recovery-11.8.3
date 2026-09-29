/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.OutputStream;
import java.security.KeyStore;

public class sprvkb
implements KeyStore.LoadStoreParameter {
    private OutputStream cfr_renamed_2;
    private KeyStore.ProtectionParameter cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_2284(OutputStream arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_2285(KeyStore.ProtectionParameter arg0) {
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2286(char[] cArray) {
        void arg0;
        sprvkb sprvkb2 = this;
        sprvkb2.cfr_renamed_3 = new KeyStore.PasswordProtection((char[])arg0);
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_2287(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public boolean cfr_renamed_2288() {
        return this.cfr_renamed_4;
    }
}


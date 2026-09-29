/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.OutputStream;
import java.security.KeyStore;

public class sprrhc
implements KeyStore.LoadStoreParameter {
    private final OutputStream cfr_renamed_2;
    private final KeyStore.ProtectionParameter cfr_renamed_3;
    private final boolean cfr_renamed_4;

    @Override
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.cfr_renamed_3;
    }

    public sprrhc(OutputStream arg0, char[] arg1, boolean arg2) {
        this(arg0, new KeyStore.PasswordProtection(arg1), arg2);
    }

    public boolean cfr_renamed_2447() {
        return this.cfr_renamed_4;
    }

    public sprrhc(OutputStream arg0, KeyStore.ProtectionParameter arg1) {
        this(arg0, arg1, false);
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprrhc(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean bl) {
        void arg1;
        void arg0;
        sprrhc sprrhc2 = this;
        this.cfr_renamed_2 = arg0;
        sprrhc2.cfr_renamed_3 = arg1;
        sprrhc2.cfr_renamed_4 = bl;
    }

    public sprrhc(OutputStream arg0, char[] arg1) {
        this(arg0, arg1, false);
    }
}


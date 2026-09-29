/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprolj;
import java.io.OutputStream;
import java.security.KeyStore;

public class sprpjj
extends sprolj {
    public sprpjj(OutputStream arg0, KeyStore.ProtectionParameter arg1) {
        super(arg0, arg1, false);
    }

    public sprpjj(OutputStream arg0, KeyStore.ProtectionParameter arg1, boolean arg2) {
        super(arg0, arg1, arg2);
    }

    public sprpjj(OutputStream arg0, char[] arg1) {
        super(arg0, arg1, false);
    }

    public sprpjj(OutputStream arg0, char[] arg1, boolean arg2) {
        super(arg0, new KeyStore.PasswordProtection(arg1), arg2);
    }
}


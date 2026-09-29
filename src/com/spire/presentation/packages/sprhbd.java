/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtuc;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;

public class sprhbd
extends sprtuc {
    private final Provider cfr_renamed_4;

    @Override
    public Signature cfr_renamed_1539(String arg0) throws NoSuchAlgorithmException {
        return Signature.getInstance(arg0, this.cfr_renamed_4);
    }

    public sprhbd(Provider provider) {
        this.cfr_renamed_4 = provider;
    }
}


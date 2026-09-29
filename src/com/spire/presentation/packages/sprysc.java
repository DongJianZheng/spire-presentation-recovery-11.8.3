/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtuc;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

public class sprysc
extends sprtuc {
    private final String cfr_renamed_4;

    @Override
    public Signature cfr_renamed_1539(String arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return Signature.getInstance(arg0, this.cfr_renamed_4);
    }

    public sprysc(String string) {
        this.cfr_renamed_4 = string;
    }
}


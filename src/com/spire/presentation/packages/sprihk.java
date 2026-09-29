/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehk;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

public class sprihk
extends sprehk {
    private final String cfr_renamed_4;

    public sprihk(String string) {
        this.cfr_renamed_4 = string;
    }

    @Override
    public Signature cfr_renamed_1539(String arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return Signature.getInstance(arg0, this.cfr_renamed_4);
    }
}


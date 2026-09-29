/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spryo;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class sprfgk
implements spryo {
    private final String cfr_renamed_4;

    @Override
    public KeyFactory cfr_renamed_1511(String arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return KeyFactory.getInstance(arg0, this.cfr_renamed_4);
    }

    public sprfgk(String string) {
        this.cfr_renamed_4 = string;
    }
}


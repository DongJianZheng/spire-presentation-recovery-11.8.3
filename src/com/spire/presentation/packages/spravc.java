/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdc;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class spravc
implements sprdc {
    private final Provider cfr_renamed_4;

    public spravc(Provider provider) {
        this.cfr_renamed_4 = provider;
    }

    @Override
    public KeyFactory cfr_renamed_1511(String arg0) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(arg0, this.cfr_renamed_4);
    }
}


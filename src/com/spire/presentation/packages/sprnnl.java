/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprvol;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class sprnnl
extends sprvol {
    private final String cfr_renamed_4;

    @Override
    public CertificateFactory cfr_renamed_1550(String arg0) throws CertificateException, NoSuchProviderException {
        return CertificateFactory.getInstance(arg0, this.cfr_renamed_4);
    }

    public sprnnl(String string) {
        this.cfr_renamed_4 = string;
    }
}


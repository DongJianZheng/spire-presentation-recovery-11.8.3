/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmtd;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class sprhzd
extends sprmtd {
    private final Provider cfr_renamed_4;

    public sprhzd(Provider provider) {
        this.cfr_renamed_4 = provider;
    }

    @Override
    public CertificateFactory cfr_renamed_1550(String arg0) throws CertificateException {
        return CertificateFactory.getInstance(arg0, this.cfr_renamed_4);
    }
}


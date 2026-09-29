/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public abstract class sprvol {
    public abstract CertificateFactory cfr_renamed_1550(String var1) throws CertificateException, NoSuchProviderException;

    public CertificateFactory cfr_renamed_4317(String arg0) throws NoSuchProviderException, CertificateException {
        return this.cfr_renamed_1550(arg0);
    }
}


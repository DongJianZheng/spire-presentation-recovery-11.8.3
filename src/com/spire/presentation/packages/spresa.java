/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.cert.CertificateEncodingException;

public class spresa
extends CertificateEncodingException {
    public Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spresa(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


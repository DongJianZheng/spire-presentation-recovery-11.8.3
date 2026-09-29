/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhy;
import java.security.cert.CertificateEncodingException;

public class sprjfi
extends CertificateEncodingException
implements sprhy {
    private Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjfi(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


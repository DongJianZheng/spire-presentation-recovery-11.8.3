/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.cert.CRLException;

public class sprenc
extends CRLException {
    public Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprenc(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


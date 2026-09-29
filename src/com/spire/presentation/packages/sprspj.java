/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.cert.CRLException;

public class sprspj
extends CRLException {
    public Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprspj(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcc;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

public class sprmsb
extends CertPathBuilderException
implements sprcc {
    private Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmsb(String string, Throwable throwable, CertPath certPath, int n) {
        super((String)arg0, (Throwable)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmsb(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


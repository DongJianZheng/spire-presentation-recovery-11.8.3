/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhy;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

public class sprggi
extends CertPathBuilderException
implements sprhy {
    private Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprggi(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    /*
     * WARNING - void declaration
     */
    public sprggi(String string, Throwable throwable, CertPath certPath, int n) {
        super((String)arg0, (Throwable)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


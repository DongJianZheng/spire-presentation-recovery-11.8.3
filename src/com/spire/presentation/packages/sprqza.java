/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkza;

public class sprqza
extends sprkza {
    private Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqza(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public sprqza(String arg0) {
        super(arg0);
    }
}


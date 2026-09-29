/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import javax.crypto.BadPaddingException;

public class sprazh
extends BadPaddingException {
    private final Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprazh(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


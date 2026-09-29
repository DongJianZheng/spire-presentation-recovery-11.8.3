/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;

public class sprwzk
extends IOException {
    private final Throwable cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    /*
     * WARNING - void declaration
     */
    public sprwzk(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_3 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_3;
    }
}


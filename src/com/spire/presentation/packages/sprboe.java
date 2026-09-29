/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;

public class sprboe
extends IOException {
    private Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public sprboe(String arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprboe(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


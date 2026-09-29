/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprine
extends RuntimeException {
    private Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprine(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


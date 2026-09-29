/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprioe
extends IllegalStateException {
    private Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprioe(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


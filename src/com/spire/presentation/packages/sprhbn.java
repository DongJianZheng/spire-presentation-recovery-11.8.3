/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprhbn
extends IllegalStateException {
    private Throwable cfr_renamed_4;

    public sprhbn(String arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprhbn(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


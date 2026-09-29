/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spruxc
extends Exception {
    private static final long cfr_renamed_3 = 389345256020131488L;
    private Throwable cfr_renamed_4;

    public spruxc(String arg0) {
        super(arg0);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spruxc(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


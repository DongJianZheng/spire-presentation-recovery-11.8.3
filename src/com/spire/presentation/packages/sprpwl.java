/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprpwl
extends Exception {
    private Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprpwl(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public sprpwl(String arg0) {
        super(arg0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprcol
extends RuntimeException {
    public Exception cfr_renamed_4;

    public Exception cfr_renamed_584() {
        return this.cfr_renamed_4;
    }

    public sprcol(String arg0) {
        super(arg0);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprcol(String string, Exception exception) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = exception;
    }
}


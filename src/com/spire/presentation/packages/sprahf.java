/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprahf
extends Exception {
    public Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public sprahf(String arg0) {
        super(arg0);
    }

    public Exception cfr_renamed_584() {
        return (Exception)this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprahf(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


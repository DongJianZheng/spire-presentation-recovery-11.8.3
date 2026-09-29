/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprcsl
extends Exception {
    private Throwable cfr_renamed_4;

    public sprcsl(String arg0) {
        this(arg0, null);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprcsl(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }
}


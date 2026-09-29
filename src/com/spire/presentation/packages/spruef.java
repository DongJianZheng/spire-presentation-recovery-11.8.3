/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spruef
extends Exception {
    private final Throwable cfr_renamed_4;

    public spruef(String arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public spruef(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


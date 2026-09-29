/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spritl
extends Exception {
    private final Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spritl(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public spritl(String arg0) {
        this(arg0, null);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


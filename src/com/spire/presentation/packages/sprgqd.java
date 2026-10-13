/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprgqd
extends RuntimeException {
    private Throwable cfr_renamed_4;

    public sprgqd(String string, Throwable throwable) {
        super((String)string);
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


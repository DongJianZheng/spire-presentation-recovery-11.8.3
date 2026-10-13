/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprese
extends Exception {
    public Throwable cfr_renamed_4;

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public sprese(String string, Throwable throwable) {
        super((String)string);
        this.cfr_renamed_4 = throwable;
    }
}


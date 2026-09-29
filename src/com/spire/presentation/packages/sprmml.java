/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprmml
extends Exception {
    private Throwable cfr_renamed_4;

    public sprmml(String arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmml(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public sprmml() {
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


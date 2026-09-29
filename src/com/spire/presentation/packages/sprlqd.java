/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprlqd
extends Exception {
    public Exception cfr_renamed_4;

    public Exception cfr_renamed_584() {
        return this.cfr_renamed_4;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public sprlqd(String arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprlqd(String string, Exception exception) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = exception;
    }
}


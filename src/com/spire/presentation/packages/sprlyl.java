/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprlyl
extends Exception {
    public Exception cfr_renamed_4;

    public sprlyl(String arg0) {
        super(arg0);
    }

    public Exception cfr_renamed_584() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprlyl(String string, Exception exception) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = exception;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


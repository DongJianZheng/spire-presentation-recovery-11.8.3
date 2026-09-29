/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;

public class spragg
extends IOException {
    public Exception cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spragg(String string, Exception exception) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = exception;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    public Exception cfr_renamed_584() {
        return this.cfr_renamed_4;
    }

    public spragg(String arg0) {
        super(arg0);
    }
}


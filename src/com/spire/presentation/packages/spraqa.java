/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;

public class spraqa
extends IOException {
    public Throwable cfr_renamed_4;

    public Exception cfr_renamed_584() {
        return (Exception)this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spraqa(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public spraqa(String arg0) {
        super(arg0);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


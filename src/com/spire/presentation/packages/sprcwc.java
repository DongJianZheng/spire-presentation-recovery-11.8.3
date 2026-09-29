/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;

public class sprcwc
extends IOException {
    private Throwable cfr_renamed_4;

    public sprcwc(String arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprcwc(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


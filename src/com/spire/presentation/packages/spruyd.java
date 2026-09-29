/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;

public class spruyd
extends IOException {
    private final Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spruyd(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    /*
     * WARNING - void declaration
     */
    public spruyd(String string) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = null;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragg;

public class sprcah
extends spragg {
    private Throwable cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcah(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public sprcah(String arg0) {
        super(arg0);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


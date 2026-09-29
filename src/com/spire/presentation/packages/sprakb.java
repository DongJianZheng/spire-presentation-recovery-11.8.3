/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcc;

public class sprakb
extends Exception
implements sprcc {
    private Throwable cfr_renamed_4;

    public sprakb(String arg0) {
        this(arg0, null);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprakb(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public Throwable cfr_renamed_584() {
        return this.cfr_renamed_4;
    }
}


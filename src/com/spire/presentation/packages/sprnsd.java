/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrsd;

public class sprnsd
extends sprrsd {
    public Exception cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnsd(String string, Exception exception) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = exception;
    }

    @Override
    public Exception cfr_renamed_584() {
        return this.cfr_renamed_4;
    }

    public sprnsd(String arg0) {
        super(arg0);
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


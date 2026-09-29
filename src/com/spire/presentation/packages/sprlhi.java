/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhy;

public class sprlhi
extends Exception
implements sprhy {
    private Throwable cfr_renamed_4;

    public sprlhi(String arg0) {
        this(arg0, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprlhi(String string, Throwable throwable) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_4 = throwable;
    }

    public Throwable cfr_renamed_584() {
        return this.cfr_renamed_4;
    }

    @Override
    public Throwable getCause() {
        return this.cfr_renamed_4;
    }
}


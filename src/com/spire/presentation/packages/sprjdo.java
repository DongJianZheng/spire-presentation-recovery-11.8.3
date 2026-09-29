/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprjdo {
    private Object cfr_renamed_3;
    private long cfr_renamed_4;

    public sprjdo(long l) {
        sprjdo sprjdo2 = this;
        sprjdo sprjdo3 = this;
        sprjdo2.cfr_renamed_3 = new Object();
        sprjdo2.cfr_renamed_4 = l;
    }

    public long cfr_renamed_15298() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public long cfr_renamed_15162() {
        Object object = this.cfr_renamed_3;
        // MONITORENTER : object
        // MONITOREXIT : object
        return ++this.cfr_renamed_4;
    }
}


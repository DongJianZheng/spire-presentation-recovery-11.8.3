/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkhh;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprzl;

public class sprakh
implements sprzl {
    private sprvlh cfr_renamed_3;
    private final sprkhh cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvlh cfr_renamed_1451() {
        sprakh sprakh2 = this;
        synchronized (sprakh2) {
            if (this.cfr_renamed_3 == null) {
                this.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_1451();
            }
            return this.cfr_renamed_3;
        }
    }

    public sprakh(sprkhh sprkhh2) {
        this.cfr_renamed_4 = sprkhh2;
    }
}


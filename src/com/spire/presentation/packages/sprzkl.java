/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;

public abstract class sprzkl {
    private sprgxh cfr_renamed_3;
    private sprhfm cfr_renamed_4;

    public sprgxh cfr_renamed_11114() {
        return this.cfr_renamed_4436().cfr_renamed_1769();
    }

    public synchronized sprgxh cfr_renamed_1769() {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_11114();
        }
        return this.cfr_renamed_3;
    }

    public synchronized sprhfm cfr_renamed_284() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_4436();
        }
        return this.cfr_renamed_4;
    }

    public abstract sprhfm cfr_renamed_4436();
}


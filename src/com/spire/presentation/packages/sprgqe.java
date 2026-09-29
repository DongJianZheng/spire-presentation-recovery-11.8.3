/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxre;
import java.io.InputStream;

public abstract class sprgqe
extends InputStream {
    private int cfr_renamed_3;
    public final InputStream cfr_renamed_4;

    public int cfr_renamed_4583() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgqe(InputStream inputStream, int n) {
        void arg0;
        sprgqe sprgqe2 = this;
        sprgqe2.cfr_renamed_4 = arg0;
        sprgqe2.cfr_renamed_3 = n;
    }

    public void cfr_renamed_4609(boolean arg0) {
        if (this.cfr_renamed_4 instanceof sprxre) {
            ((sprxre)this.cfr_renamed_4).cfr_renamed_4610(arg0);
        }
    }
}


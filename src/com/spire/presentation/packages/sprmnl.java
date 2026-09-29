/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjj;
import java.io.OutputStream;

public class sprmnl
implements sprjj {
    private final sprjj cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public sprddm cfr_renamed_615() {
        return this.cfr_renamed_3.cfr_renamed_615();
    }

    @Override
    public byte[] cfr_renamed_580() {
        sprmnl sprmnl2 = this;
        byte[] byArray = new byte[sprmnl2.cfr_renamed_4];
        System.arraycopy(sprmnl2.cfr_renamed_3.cfr_renamed_580(), 0, byArray, 0, byArray.length);
        return byArray;
    }

    public sprmnl(sprjj arg0) {
        this(arg0, 28);
    }

    @Override
    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_3.cfr_renamed_470();
    }

    /*
     * WARNING - void declaration
     */
    public sprmnl(sprjj sprjj2, int n) {
        void arg0;
        sprmnl sprmnl2 = this;
        sprmnl2.cfr_renamed_3 = arg0;
        sprmnl2.cfr_renamed_4 = n;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjue;
import java.io.OutputStream;

public class sprjjg
implements sprcf {
    private final sprcf cfr_renamed_3;
    private final OutputStream cfr_renamed_4;

    @Override
    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprddm cfr_renamed_615() {
        return this.cfr_renamed_3.cfr_renamed_615();
    }

    /*
     * WARNING - void declaration
     */
    public sprjjg(sprcf sprcf2) {
        void arg0;
        this.cfr_renamed_3 = sprcf2;
        sprjjg sprjjg2 = this;
        this.cfr_renamed_4 = new sprjue(arg0.cfr_renamed_470());
    }

    /*
     * WARNING - void declaration
     */
    public sprjjg(sprcf sprcf2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = sprcf2;
        sprjjg sprjjg2 = this;
        this.cfr_renamed_4 = new sprjue(arg0.cfr_renamed_470(), (int)arg1);
    }

    @Override
    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_79();
    }
}


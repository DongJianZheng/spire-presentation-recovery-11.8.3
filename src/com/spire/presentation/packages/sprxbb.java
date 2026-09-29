/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprzla;
import java.io.OutputStream;

public class sprxbb
implements sprqa {
    private final sprqa cfr_renamed_3;
    private final OutputStream cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxbb(sprqa sprqa2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = sprqa2;
        sprxbb sprxbb2 = this;
        this.cfr_renamed_4 = new sprzla(arg0.cfr_renamed_470(), (int)arg1);
    }

    @Override
    public sprije cfr_renamed_615() {
        return this.cfr_renamed_3.cfr_renamed_615();
    }

    /*
     * WARNING - void declaration
     */
    public sprxbb(sprqa sprqa2) {
        void arg0;
        this.cfr_renamed_3 = sprqa2;
        sprxbb sprxbb2 = this;
        this.cfr_renamed_4 = new sprzla(arg0.cfr_renamed_470());
    }

    @Override
    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_4;
    }

    @Override
    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_79();
    }
}


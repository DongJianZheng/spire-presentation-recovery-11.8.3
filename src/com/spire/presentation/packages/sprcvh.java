/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfo;
import com.spire.presentation.packages.sproze;

public class sprcvh
implements sprfo {
    private final byte[] cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcvh(int n, byte[] byArray) {
        void arg0;
        sprcvh sprcvh2 = this;
        sprcvh2.cfr_renamed_4 = arg0;
        sprcvh2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }

    @Override
    public long cfr_renamed_806() {
        return this.cfr_renamed_3.length;
    }

    @Override
    public byte cfr_renamed_324() {
        return 8;
    }

    @Override
    public sprfo cfr_renamed_9004() {
        return this;
    }

    public Object cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_8159() {
        return this.cfr_renamed_4;
    }
}


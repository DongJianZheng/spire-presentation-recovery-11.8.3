/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriqf;
import com.spire.presentation.packages.sprpxe;

public abstract class spryof {
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private final long cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryof(spriqf spriqf2) {
        void arg0;
        spryof spryof2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = spriqf.cfr_renamed_5860((spriqf)arg0);
        this.cfr_renamed_3 = spriqf.cfr_renamed_5861((spriqf)v1);
        spryof2.cfr_renamed_4 = spriqf.cfr_renamed_5862((spriqf)v1);
        spryof2.cfr_renamed_1 = spriqf.cfr_renamed_5863(spriqf2);
    }

    public final long cfr_renamed_5736() {
        return this.cfr_renamed_3;
    }

    public final int cfr_renamed_5734() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_954() {
        byte[] byArray = new byte[32];
        spryof spryof2 = this;
        sprpxe.cfr_renamed_442(spryof2.cfr_renamed_2, byArray, 0);
        sprpxe.cfr_renamed_450(spryof2.cfr_renamed_3, byArray, 4);
        sprpxe.cfr_renamed_442(spryof2.cfr_renamed_4, byArray, 12);
        sprpxe.cfr_renamed_442(spryof2.cfr_renamed_1, byArray, 28);
        return byArray;
    }

    public final int cfr_renamed_5746() {
        return this.cfr_renamed_1;
    }

    public final int cfr_renamed_324() {
        return this.cfr_renamed_4;
    }
}


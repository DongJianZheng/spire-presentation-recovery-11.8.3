/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriqf;
import com.spire.presentation.packages.sprklf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.spryof;

public final class sprrqf
extends spryof {
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private static final int cfr_renamed_3 = 0;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrqf(sprtsf sprtsf2) {
        void arg0;
        sprrqf sprrqf2 = this;
        void v1 = arg0;
        super((spriqf)arg0);
        this.cfr_renamed_4 = sprtsf.cfr_renamed_5881((sprtsf)v1);
        sprrqf2.cfr_renamed_2 = sprtsf.cfr_renamed_5882((sprtsf)v1);
        sprrqf2.cfr_renamed_1 = sprtsf.cfr_renamed_5883(sprtsf2);
    }

    public int cfr_renamed_5877() {
        return this.cfr_renamed_2;
    }

    @Override
    public byte[] cfr_renamed_954() {
        sprrqf sprrqf2 = this;
        byte[] byArray = super.cfr_renamed_954();
        sprpxe.cfr_renamed_442(sprrqf2.cfr_renamed_4, byArray, 16);
        sprpxe.cfr_renamed_442(sprrqf2.cfr_renamed_2, byArray, 20);
        sprpxe.cfr_renamed_442(sprrqf2.cfr_renamed_1, byArray, 24);
        return byArray;
    }

    public /* synthetic */ sprrqf(sprtsf arg0, sprklf arg1) {
        this(arg0);
    }

    public int cfr_renamed_5738() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_5875() {
        return this.cfr_renamed_1;
    }
}


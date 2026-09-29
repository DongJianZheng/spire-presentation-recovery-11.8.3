/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhnf;
import com.spire.presentation.packages.spriqf;
import com.spire.presentation.packages.sprnmf;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.spryof;

public final class sprdjf
extends spryof {
    private static final int cfr_renamed_1 = 1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_954() {
        sprdjf sprdjf2 = this;
        byte[] byArray = super.cfr_renamed_954();
        sprpxe.cfr_renamed_442(sprdjf2.cfr_renamed_2, byArray, 16);
        sprpxe.cfr_renamed_442(sprdjf2.cfr_renamed_3, byArray, 20);
        sprpxe.cfr_renamed_442(sprdjf2.cfr_renamed_4, byArray, 24);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdjf(sprhnf sprhnf2) {
        void arg0;
        sprdjf sprdjf2 = this;
        void v1 = arg0;
        super((spriqf)arg0);
        this.cfr_renamed_2 = sprhnf.cfr_renamed_5884((sprhnf)v1);
        sprdjf2.cfr_renamed_3 = sprhnf.cfr_renamed_5885((sprhnf)v1);
        sprdjf2.cfr_renamed_4 = sprhnf.cfr_renamed_5886(sprhnf2);
    }

    public int cfr_renamed_5744() {
        return this.cfr_renamed_4;
    }

    public /* synthetic */ sprdjf(sprhnf arg0, sprnmf arg1) {
        this(arg0);
    }

    public int cfr_renamed_5747() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_5819() {
        return this.cfr_renamed_2;
    }
}


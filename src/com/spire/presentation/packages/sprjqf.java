/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriqf;
import com.spire.presentation.packages.sprjof;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprxjf;
import com.spire.presentation.packages.spryof;

public final class sprjqf
extends spryof {
    private static final int cfr_renamed_0 = 2;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final int cfr_renamed_4 = 0;

    public int cfr_renamed_5888() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_5744() {
        return this.cfr_renamed_2;
    }

    @Override
    public byte[] cfr_renamed_954() {
        sprjqf sprjqf2 = this;
        byte[] byArray = super.cfr_renamed_954();
        sprpxe.cfr_renamed_442(sprjqf2.cfr_renamed_3, byArray, 16);
        sprpxe.cfr_renamed_442(sprjqf2.cfr_renamed_1, byArray, 20);
        sprpxe.cfr_renamed_442(sprjqf2.cfr_renamed_2, byArray, 24);
        return byArray;
    }

    public int cfr_renamed_5747() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjqf(sprxjf sprxjf2) {
        void arg0;
        sprjqf sprjqf2 = this;
        super((spriqf)arg0);
        this.cfr_renamed_3 = 0;
        sprjqf2.cfr_renamed_1 = sprxjf.cfr_renamed_5889((sprxjf)arg0);
        sprjqf2.cfr_renamed_2 = sprxjf.cfr_renamed_5890(sprxjf2);
    }

    public /* synthetic */ sprjqf(sprxjf arg0, sprjof arg1) {
        this(arg0);
    }
}


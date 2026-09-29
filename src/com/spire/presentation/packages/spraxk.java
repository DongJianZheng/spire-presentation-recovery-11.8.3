/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpek;
import com.spire.presentation.packages.sprtpk;

public final class spraxk
implements sprbj {
    private final byte[] cfr_renamed_1;
    private final sprpek cfr_renamed_2;
    private final sprtpk cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public boolean cfr_renamed_9208() {
        return this.cfr_renamed_4;
    }

    public sprpek cfr_renamed_9209() {
        return this.cfr_renamed_2;
    }

    public spraxk(sprtpk arg0, int arg1, byte[] arg2) {
        this(arg0, arg1, arg2, false);
    }

    public byte[] cfr_renamed_3339() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public spraxk(sprtpk arg0, int arg1, byte[] arg2, boolean arg3) {
        this(arg0, new sprpek(arg1), arg2, arg3);
    }

    public sprtpk cfr_renamed_1521() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spraxk(sprtpk sprtpk2, sprpek sprpek2, byte[] byArray, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        spraxk spraxk2 = this;
        spraxk spraxk3 = this;
        spraxk3.cfr_renamed_3 = arg0;
        spraxk3.cfr_renamed_2 = arg1;
        spraxk2.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg2);
        spraxk2.cfr_renamed_4 = bl;
    }

    public int cfr_renamed_9210() {
        return this.cfr_renamed_2.cfr_renamed_9210();
    }
}


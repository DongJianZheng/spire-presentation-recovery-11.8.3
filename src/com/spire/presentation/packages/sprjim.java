/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnl;

public class sprjim
extends sprpnl {
    public byte[] cfr_renamed_5209() {
        return sproze.cfr_renamed_533(this.cfr_renamed_2, 1, this.cfr_renamed_2.length);
    }

    public int cfr_renamed_11067() {
        return this.cfr_renamed_2[0] & 0xFF;
    }

    public sprjim(boolean arg0, boolean arg1, byte[] arg2) {
        super(35, arg0, arg1, arg2);
    }

    public sprjim(boolean arg0, int arg1, byte[] arg2) {
        super(35, arg0, false, sproze.cfr_renamed_560(arg2, (byte)arg1));
    }
}


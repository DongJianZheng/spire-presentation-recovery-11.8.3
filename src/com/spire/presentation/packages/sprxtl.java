/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnl;

public class sprxtl
extends sprpnl {
    public int cfr_renamed_11048() {
        return this.cfr_renamed_2[0] & 0xFF;
    }

    public byte[] cfr_renamed_11049() {
        return sproze.cfr_renamed_533(this.cfr_renamed_2, 2, this.cfr_renamed_2.length);
    }

    public sprxtl(boolean arg0, int arg1, int arg2, byte[] arg3) {
        byte[] byArray = new byte[2];
        byArray[false] = (byte)arg1;
        byArray[1] = (byte)arg2;
        super(31, arg0, false, sproze.cfr_renamed_543(byArray, arg3));
    }

    public sprxtl(boolean arg0, boolean arg1, byte[] arg2) {
        super(31, arg0, arg1, arg2);
    }

    public int cfr_renamed_579() {
        return this.cfr_renamed_2[1] & 0xFF;
    }
}


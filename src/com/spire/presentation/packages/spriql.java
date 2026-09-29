/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class spriql
extends sprpnl {
    public spriql(boolean arg0, int arg1, int arg2) {
        super(5, arg0, false, spriql.cfr_renamed_11046(arg1, arg2));
    }

    private static /* synthetic */ byte[] cfr_renamed_11046(int arg0, int arg1) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[2];
        byArray2[0] = (byte)arg0;
        byArray[1] = (byte)arg1;
        return byArray2;
    }

    public int cfr_renamed_11047() {
        return this.cfr_renamed_2[1] & 0xFF;
    }

    public int cfr_renamed_6518() {
        return this.cfr_renamed_2[0] & 0xFF;
    }

    public spriql(boolean arg0, boolean arg1, byte[] arg2) {
        super(5, arg0, arg1, arg2);
    }
}


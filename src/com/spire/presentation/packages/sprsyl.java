/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprsyl
extends sprpnl {
    public byte cfr_renamed_11054() {
        return this.cfr_renamed_2[0];
    }

    public sprsyl(boolean arg0, boolean arg1, byte[] arg2) {
        super(12, arg0, arg1, arg2);
    }

    public int cfr_renamed_593() {
        return this.cfr_renamed_2[1] & 0xFF;
    }

    private static /* synthetic */ byte[] cfr_renamed_11055(byte arg0, byte arg1, byte[] arg2) {
        byte[] byArray = new byte[2 + arg2.length];
        byArray[0] = arg0;
        byArray[1] = arg1;
        System.arraycopy(arg2, 0, byArray, 2, arg2.length);
        return byArray;
    }

    public sprsyl(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        super(12, arg0, false, sprsyl.cfr_renamed_11055(arg1, (byte)arg2, arg3));
    }

    public byte[] cfr_renamed_5209() {
        byte[] byArray = new byte[this.cfr_renamed_2.length - 2];
        System.arraycopy(this.cfr_renamed_2, 2, byArray, 0, byArray.length);
        return byArray;
    }
}


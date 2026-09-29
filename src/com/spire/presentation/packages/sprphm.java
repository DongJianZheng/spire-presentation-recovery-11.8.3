/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprphm
extends sprpnl {
    public static byte[] cfr_renamed_11050(long arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byArray[0] = (byte)(arg0 >> 24);
        byArray[1] = (byte)(arg0 >> 16);
        byArray2[2] = (byte)(arg0 >> 8);
        byArray[3] = (byte)arg0;
        return byArray2;
    }

    public sprphm(boolean arg0, long arg1) {
        super(9, arg0, false, sprphm.cfr_renamed_11050(arg1));
    }

    public sprphm(boolean arg0, boolean arg1, byte[] arg2) {
        super(9, arg0, arg1, arg2);
    }

    public long cfr_renamed_2147() {
        return (long)(this.cfr_renamed_2[0] & 0xFF) << 24 | (long)((this.cfr_renamed_2[1] & 0xFF) << 16) | (long)((this.cfr_renamed_2[2] & 0xFF) << 8) | (long)(this.cfr_renamed_2[3] & 0xFF);
    }
}


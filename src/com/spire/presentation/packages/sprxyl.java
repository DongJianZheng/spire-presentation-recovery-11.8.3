/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprxyl
extends sprpnl {
    public sprxyl(boolean arg0, boolean arg1, byte[] arg2) {
        super(16, arg0, arg1, arg2);
    }

    public sprxyl(boolean arg0, long arg1) {
        super(16, arg0, false, sprxyl.cfr_renamed_11066(arg1));
    }

    public static byte[] cfr_renamed_11066(long arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[8];
        byArray[0] = (byte)(arg0 >> 56);
        byArray[1] = (byte)(arg0 >> 48);
        byArray[2] = (byte)(arg0 >> 40);
        byArray[3] = (byte)(arg0 >> 32);
        byArray[4] = (byte)(arg0 >> 24);
        byArray[5] = (byte)(arg0 >> 16);
        byArray2[6] = (byte)(arg0 >> 8);
        byArray[7] = (byte)arg0;
        return byArray2;
    }

    public long cfr_renamed_7541() {
        return (long)(this.cfr_renamed_2[0] & 0xFF) << 56 | (long)(this.cfr_renamed_2[1] & 0xFF) << 48 | (long)(this.cfr_renamed_2[2] & 0xFF) << 40 | (long)(this.cfr_renamed_2[3] & 0xFF) << 32 | (long)(this.cfr_renamed_2[4] & 0xFF) << 24 | (long)((this.cfr_renamed_2[5] & 0xFF) << 16) | (long)((this.cfr_renamed_2[6] & 0xFF) << 8) | (long)(this.cfr_renamed_2[7] & 0xFF);
    }
}


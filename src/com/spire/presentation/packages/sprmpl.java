/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;
import java.util.Date;

public class sprmpl
extends sprpnl {
    public sprmpl(boolean arg0, Date arg1) {
        super(2, arg0, false, sprmpl.cfr_renamed_11051(arg1));
    }

    public static byte[] cfr_renamed_11051(Date arg0) {
        byte[] byArray = new byte[4];
        long l = arg0.getTime() / 1000L;
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >> 24);
        byArray[1] = (byte)(l >> 16);
        byArray2[2] = (byte)(l >> 8);
        byArray[3] = (byte)l;
        return byArray2;
    }

    public Date cfr_renamed_2147() {
        long l = (long)(this.cfr_renamed_2[0] & 0xFF) << 24 | (long)((this.cfr_renamed_2[1] & 0xFF) << 16) | (long)((this.cfr_renamed_2[2] & 0xFF) << 8) | (long)(this.cfr_renamed_2[3] & 0xFF);
        return new Date(l * 1000L);
    }

    public sprmpl(boolean arg0, boolean arg1, byte[] arg2) {
        super(2, arg0, arg1, arg2);
    }
}


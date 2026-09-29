/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprcjm
extends sprpnl {
    public static final byte cfr_renamed_2 = 4;
    public static final byte cfr_renamed_3 = 2;
    public static final byte cfr_renamed_4 = 1;

    public sprcjm(boolean arg0, int arg1) {
        super(30, arg0, false, sprcjm.cfr_renamed_11068((byte)arg1));
    }

    private static final /* synthetic */ byte[] cfr_renamed_11068(byte arg0) {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return byArray;
    }

    public boolean cfr_renamed_11069() {
        return this.cfr_renamed_11070((byte)1);
    }

    public sprcjm(boolean arg0, boolean arg1, byte[] arg2) {
        super(30, arg0, arg1, arg2);
    }

    public sprcjm(boolean arg0, byte arg1) {
        super(30, arg0, false, sprcjm.cfr_renamed_11068(arg1));
    }

    public boolean cfr_renamed_11070(byte arg0) {
        return (this.cfr_renamed_2[0] & arg0) != 0;
    }

    public byte cfr_renamed_7597() {
        return (byte)this.cfr_renamed_2[0];
    }
}


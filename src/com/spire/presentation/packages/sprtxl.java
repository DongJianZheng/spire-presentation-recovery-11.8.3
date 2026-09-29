/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpnl;

public class sprtxl
extends sprpnl {
    public String cfr_renamed_11052() {
        byte[] byArray = this.cfr_renamed_2609();
        if (byArray.length == 1) {
            return "";
        }
        byte[] byArray2 = new byte[byArray.length - 1];
        System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
        return sprkoe.cfr_renamed_427(byArray2);
    }

    public byte cfr_renamed_4273() {
        return this.cfr_renamed_2609()[0];
    }

    public sprtxl(boolean arg0, boolean arg1, byte[] arg2) {
        super(29, arg0, arg1, arg2);
    }

    public sprtxl(boolean arg0, byte arg1, String arg2) {
        super(29, arg0, false, sprtxl.cfr_renamed_11053(arg1, arg2));
    }

    private static /* synthetic */ byte[] cfr_renamed_11053(byte arg0, String arg1) {
        byte[] byArray = sprkoe.cfr_renamed_431(arg1);
        byte[] byArray2 = new byte[1 + byArray.length];
        byArray2[0] = arg0;
        System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
        return byArray2;
    }
}


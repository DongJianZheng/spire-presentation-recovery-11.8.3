/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprhjm
extends sprpnl {
    public sprhjm(boolean arg0, boolean arg1, byte[] arg2) {
        super(7, arg0, arg1, arg2);
    }

    public boolean cfr_renamed_7622() {
        return this.cfr_renamed_2[0] != 0;
    }

    public sprhjm(boolean arg0, boolean arg1) {
        super(7, arg0, false, sprhjm.cfr_renamed_11056(arg1));
    }

    private static /* synthetic */ byte[] cfr_renamed_11056(boolean arg0) {
        byte[] byArray = new byte[1];
        if (arg0) {
            byArray[0] = 1;
            return byArray;
        }
        return byArray;
    }
}


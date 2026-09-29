/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprvyl
extends sprpnl {
    public sprvyl(boolean arg0, boolean arg1) {
        super(4, arg0, false, sprvyl.cfr_renamed_11056(arg1));
    }

    public sprvyl(boolean arg0, boolean arg1, byte[] arg2) {
        super(4, arg0, arg1, arg2);
    }

    private static /* synthetic */ byte[] cfr_renamed_11056(boolean arg0) {
        byte[] byArray = new byte[1];
        if (arg0) {
            byArray[0] = 1;
            return byArray;
        }
        return byArray;
    }

    public boolean cfr_renamed_7615() {
        return this.cfr_renamed_2[0] != 0;
    }
}


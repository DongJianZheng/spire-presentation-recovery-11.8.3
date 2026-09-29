/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprrwja;

public class sprsam
extends sprpnl {
    public String cfr_renamed_11057() {
        return sprkoe.cfr_renamed_5148(this.cfr_renamed_2, 0, this.cfr_renamed_2.length - 1);
    }

    private static /* synthetic */ byte[] cfr_renamed_11058(String arg0) {
        return sproze.cfr_renamed_555(sprkoe.cfr_renamed_431(arg0), (byte)0);
    }

    /*
     * WARNING - void declaration
     */
    public sprsam(boolean bl, boolean bl2, byte[] byArray) {
        super(6, (boolean)arg0, (boolean)arg1, (byte[])arg2);
        void arg2;
        void arg1;
        void arg0;
        if (byArray[byArray.length - 1] != 0) {
            throw new IllegalArgumentException(sprrwja.cfr_renamed_9("\u000f|\u001f|Kt\u0005=\u0019x\fx\u0013=\u0006t\u0018n\u0002s\f=\u0005h\u0007qKi\u000eo\u0006t\u0005|\u001ft\u0004s"));
        }
    }

    public sprsam(boolean arg0, String arg1) {
        super(6, arg0, false, sprsam.cfr_renamed_11058(arg1));
    }

    public byte[] cfr_renamed_11059() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }
}


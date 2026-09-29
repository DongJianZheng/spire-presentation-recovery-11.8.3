/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprscm
extends sprpnl {
    public sprscm(int arg0, boolean arg1, int[] arg2) {
        super(arg0, arg1, false, sprscm.cfr_renamed_11060(arg2));
    }

    public sprscm(int arg0, boolean arg1, boolean arg2, byte[] arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    private static /* synthetic */ byte[] cfr_renamed_11060(int[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n++;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    public int[] cfr_renamed_7599() {
        int n;
        int[] nArray = new int[this.cfr_renamed_2.length];
        int n2 = n = 0;
        while (n2 != nArray.length) {
            int n3 = n++;
            nArray[n3] = this.cfr_renamed_2[n3] & 0xFF;
            n2 = n;
        }
        return nArray;
    }
}


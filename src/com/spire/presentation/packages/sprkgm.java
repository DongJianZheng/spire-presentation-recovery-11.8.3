/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnl;

public class sprkgm
extends sprpnl {
    public static final int cfr_renamed_112 = 4;
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 16;
    public static final int cfr_renamed_0 = 8;
    public static final int cfr_renamed_1 = 128;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 32;

    public sprkgm(boolean arg0, int arg1) {
        super(27, arg0, false, sprkgm.cfr_renamed_3696(arg1));
    }

    public sprkgm(boolean arg0, boolean arg1, byte[] arg2) {
        super(27, arg0, arg1, arg2);
    }

    private static /* synthetic */ byte[] cfr_renamed_3696(int arg0) {
        int n;
        byte[] byArray = new byte[4];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != 4) {
            int n4 = n;
            byArray[n4] = (byte)(arg0 >> n4 * 8);
            if (byArray[n] != 0) {
                n2 = n;
            }
            n3 = ++n;
        }
        byte[] byArray2 = new byte[n2 + 1];
        System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
        return byArray2;
    }

    public int cfr_renamed_4690() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != ((int)this.cfr_renamed_2).length) {
            int n4 = this.cfr_renamed_2[n] & 0xFF;
            int n5 = n * 8;
            n2 |= n4 << n5;
            n3 = ++n;
        }
        return n2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxf;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprud;

public class sprezf {
    private final sprud cfr_renamed_4 = new sprnil(256);

    private static /* synthetic */ void cfr_renamed_1122(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprezf(byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_4.cfr_renamed_1197((byte[])v0, 0, ((void)v0).length);
        if (arg1 != null) {
            void v1 = arg1;
            this.cfr_renamed_4.cfr_renamed_1197((byte[])v1, 0, ((void)v1).length);
        }
        sproze.cfr_renamed_492((byte[])arg0, (byte)0);
    }

    public byte[] cfr_renamed_6417(byte[] arg0) {
        byte[] byArray = new byte[arg0.length];
        this.cfr_renamed_4.cfr_renamed_1199(byArray, 0, byArray.length);
        sprezf.cfr_renamed_1122(arg0, byArray);
        sproze.cfr_renamed_492(byArray, (byte)0);
        return arg0;
    }

    public /* synthetic */ sprezf(byte[] arg0, byte[] arg1, sprcxf arg2) {
        this(arg0, arg1);
    }
}


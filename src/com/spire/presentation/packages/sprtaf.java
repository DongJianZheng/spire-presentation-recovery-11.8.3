/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sproel;

public class sprtaf {
    public static final int cfr_renamed_3 = 168;
    public static final int cfr_renamed_4 = 136;

    public static void cfr_renamed_5564(byte[] arg0, int arg1, int arg2, short arg3, byte[] arg4, int arg5, int arg6) {
        sproel sproel2;
        byte[] byArray = new byte[2];
        byArray[0] = (byte)arg3;
        byArray[1] = (byte)(arg3 >> 8);
        sproel sproel3 = sproel2 = new sproel(128, null, byArray);
        sproel3.cfr_renamed_1197(arg4, arg5, arg6);
        sproel3.cfr_renamed_1199(arg0, arg1, arg2);
    }

    public static void cfr_renamed_5578(byte[] arg0, int arg1, int arg2, short arg3, byte[] arg4, int arg5, int arg6) {
        sproel sproel2;
        byte[] byArray = new byte[2];
        byArray[0] = (byte)arg3;
        byArray[1] = (byte)(arg3 >> 8);
        sproel sproel3 = sproel2 = new sproel(256, null, byArray);
        sproel3.cfr_renamed_1197(arg4, arg5, arg6);
        sproel3.cfr_renamed_1199(arg0, arg1, arg2);
    }

    public static void cfr_renamed_5553(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        sprnil sprnil2;
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        sprnil3.cfr_renamed_1197(arg3, arg4, arg5);
        sprnil3.cfr_renamed_1199(arg0, arg1, arg2);
    }

    public static void cfr_renamed_5586(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        sprnil sprnil2;
        sprnil sprnil3 = sprnil2 = new sprnil(128);
        sprnil3.cfr_renamed_1197(arg3, arg4, arg5);
        sprnil3.cfr_renamed_1199(arg0, arg1, arg2);
    }
}


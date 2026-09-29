/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprbwf {
    public static final int cfr_renamed_2 = 18;
    public static final int cfr_renamed_3 = 12287;
    public static final int cfr_renamed_4 = 262143;

    public static short cfr_renamed_6401(int arg0) {
        int n = arg0 * 12287;
        n &= 0x3FFFF;
        n *= 12289;
        return (short)((n += arg0) >>> 18);
    }

    public static short cfr_renamed_6402(short arg0) {
        int n = arg0 & 0xFFFF;
        int n2 = n * 5 >>> 16;
        return (short)(n - (n2 *= 12289));
    }
}


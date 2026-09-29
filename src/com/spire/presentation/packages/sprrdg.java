/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprrdg {
    public static short cfr_renamed_6972(int arg0) {
        int n = (short)(arg0 * 62209) * 3329;
        n = arg0 - n;
        return (short)(n >>= 16);
    }

    public static short cfr_renamed_6973(short arg0) {
        arg0 = (short)(arg0 - 3329);
        arg0 = (short)(arg0 + (arg0 >> 15 & 0xD01));
        return arg0;
    }

    public static short cfr_renamed_6974(short arg0) {
        short s = (short)((short)((0x4000000L + 1664L) / 3329L) * arg0 >> 26);
        s = (short)(s * 3329);
        return (short)(arg0 - s);
    }
}


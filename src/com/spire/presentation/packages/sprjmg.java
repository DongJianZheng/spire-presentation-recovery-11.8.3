/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprjmg {
    public static int cfr_renamed_7052(int arg0) {
        int n = arg0;
        arg0 = n + (n >> 31 & 0x7FE001);
        return arg0;
    }

    public static int cfr_renamed_7053(int arg0) {
        int n = arg0 + 0x400000 >> 23;
        n = arg0 - n * 8380417;
        return n;
    }

    public static int cfr_renamed_7054(long arg0) {
        int n = (int)(arg0 * 58728449L);
        n = (int)(arg0 - (long)n * 8380417L >>> 32);
        return n;
    }
}


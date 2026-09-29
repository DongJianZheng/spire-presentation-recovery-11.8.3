/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprtwe {
    public static final int cfr_renamed_3 = 64;
    public static final int cfr_renamed_4 = 8;

    public static long cfr_renamed_5184(long arg0) {
        return Long.lowestOneBit(arg0);
    }

    public static long cfr_renamed_5185(long arg0) {
        return Long.highestOneBit(arg0);
    }

    public static long cfr_renamed_5186(long arg0, int arg1) {
        return Long.rotateRight(arg0, arg1);
    }

    public static Long cfr_renamed_5187(long arg0) {
        return arg0;
    }

    public static int cfr_renamed_5188(long arg0) {
        return Long.numberOfTrailingZeros(arg0);
    }

    public static long cfr_renamed_3467(long arg0, int arg1) {
        return Long.rotateLeft(arg0, arg1);
    }

    public static long cfr_renamed_5189(long arg0) {
        return Long.reverse(arg0);
    }

    public static int cfr_renamed_5190(long arg0) {
        return Long.numberOfLeadingZeros(arg0);
    }

    public static long cfr_renamed_5191(long arg0) {
        return Long.reverseBytes(arg0);
    }
}


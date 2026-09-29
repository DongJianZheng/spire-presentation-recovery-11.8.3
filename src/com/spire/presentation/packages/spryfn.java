/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class spryfn {
    private static final int cfr_renamed_2 = 65521;
    private static final int cfr_renamed_3 = 3800;
    private static final int cfr_renamed_4 = 16;

    public static long cfr_renamed_12268(byte[] arg0, int arg1, int arg2) {
        long l = 1L;
        long[] lArray = new long[1];
        lArray[0] = l;
        long[] lArray2 = lArray;
        spryfn.cfr_renamed_12235(lArray2, arg0, arg1, arg2);
        l = lArray2[0];
        return l;
    }

    public static void cfr_renamed_12235(long[] arg0, byte[] arg1, int arg2, int arg3) {
        long l = arg0[0];
        long l2 = l & 0xFFFFFFFFL & 0xFFFFL;
        long l3 = (l & 0xFFFFFFFFL) >> 16;
        int n = arg3;
        while (n > 0) {
            int n2 = Math.min(arg3, 3800);
            arg3 -= n2;
            while (--n2 >= 0) {
                int n3 = arg1[arg2] & 0xFF;
                ++arg2;
                l2 = (l2 & 0xFFFFFFFFL) + ((long)(n3 & 0x7F) & 0xFFFFFFFFL);
                l3 = (l3 & 0xFFFFFFFFL) + (l2 & 0xFFFFFFFFL);
            }
            l2 = (l2 & 0xFFFFFFFFL) % 65521L;
            l3 = (l3 & 0xFFFFFFFFL) % 65521L;
            n = arg3;
        }
        l = l3 << 16 & 0xFFFFFFFFL | l2 & 0xFFFFFFFFL;
        arg0[0] = l & 0xFFFFFFFFL;
    }
}


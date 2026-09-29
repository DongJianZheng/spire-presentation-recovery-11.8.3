/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprggn {
    private static int cfr_renamed_3 = 65521;
    private static int cfr_renamed_4 = 5552;

    @sprtea
    public static long cfr_renamed_11567(long arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        if (arg1 == null) {
            return 1L;
        }
        long l = arg0 & 0xFFFFL;
        long l2 = arg0 >> 16 & 0xFFFFL;
        int n2 = n = arg3;
        while (n2 > 0) {
            int n3 = n < cfr_renamed_4 ? n : cfr_renamed_4;
            n -= n3;
            int n4 = n3;
            while (n4 >= 16) {
                int n5 = arg1[arg2] & 0xFF;
                l2 += (l += (long)(n5 & 0xFF));
                int n6 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n6 & 0xFF));
                int n7 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n7 & 0xFF));
                int n8 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n8 & 0xFF));
                int n9 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n9 & 0xFF));
                int n10 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n10 & 0xFF));
                int n11 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n11 & 0xFF));
                int n12 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n12 & 0xFF));
                int n13 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n13 & 0xFF));
                int n14 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n14 & 0xFF));
                int n15 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n15 & 0xFF));
                int n16 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n16 & 0xFF));
                int n17 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n17 & 0xFF));
                int n18 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n18 & 0xFF));
                int n19 = arg1[++arg2] & 0xFF;
                l2 += (l += (long)(n19 & 0xFF));
                int n20 = arg1[++arg2] & 0xFF;
                ++arg2;
                l2 += (l += (long)(n20 & 0xFF));
                n4 = n3 -= 16;
            }
            if (n3 != 0) {
                do {
                    int n21 = arg1[arg2] & 0xFF;
                    ++arg2;
                    l2 += (l += (long)(n21 & 0xFF));
                } while (--n3 != 0);
            }
            l %= (long)cfr_renamed_3;
            l2 %= (long)cfr_renamed_3;
            n2 = n;
        }
        return l2 << 16 | l;
    }
}


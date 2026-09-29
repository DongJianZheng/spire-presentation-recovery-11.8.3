/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.spryrb;
import java.math.BigInteger;

public class sprdqb {
    private static final int cfr_renamed_0 = -1;
    private static final long cfr_renamed_1 = 0xFFFFFFFFL;
    public static final int[] cfr_renamed_2;
    public static final int[] cfr_renamed_3;
    private static final int cfr_renamed_4 = -1;

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1627(arg0, nArray);
        sprdqb.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1636(arg0, arg1, nArray);
        sprdqb.cfr_renamed_2028(nArray, arg2);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = spryrb.cfr_renamed_1652(arg0);
        if (nArray[7] == -1 && spryrb.cfr_renamed_1649(nArray, cfr_renamed_3)) {
            spryrb.cfr_renamed_1650(cfr_renamed_3, nArray);
        }
        return nArray;
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[6] = 1;
        nArray[7] = -1;
        cfr_renamed_3 = nArray;
        int[] nArray2 = new int[16];
        nArray2[0] = 1;
        nArray2[1] = 0;
        nArray2[2] = 0;
        nArray2[3] = -2;
        nArray2[4] = -1;
        nArray2[5] = -1;
        nArray2[6] = -2;
        nArray2[7] = 1;
        nArray2[8] = -2;
        nArray2[9] = 1;
        nArray2[10] = -2;
        nArray2[11] = 1;
        nArray2[12] = 1;
        nArray2[13] = -2;
        nArray2[14] = 2;
        nArray2[15] = -2;
        cfr_renamed_2 = nArray2;
    }

    private static /* synthetic */ void cfr_renamed_2036(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) - 1L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            arg0[1] = (int)(l += (long)arg0[1] & 0xFFFFFFFFL);
            l >>= 32;
            arg0[2] = (int)(l += (long)arg0[2] & 0xFFFFFFFFL);
            l >>= 32;
        }
        long l2 = l += ((long)arg0[3] & 0xFFFFFFFFL) + 1L;
        arg0[3] = (int)l2;
        l = l2 >> 32;
        if (l != 0L) {
            arg0[4] = (int)(l += (long)arg0[4] & 0xFFFFFFFFL);
            l >>= 32;
            arg0[5] = (int)(l += (long)arg0[5] & 0xFFFFFFFFL);
            l >>= 32;
        }
        arg0[6] = (int)(l += ((long)arg0[6] & 0xFFFFFFFFL) + 1L);
        l >>= 32;
        arg0[7] = (int)(l += ((long)arg0[7] & 0xFFFFFFFFL) - 1L);
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (spryrb.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[7] == -1 && spryrb.cfr_renamed_1649(arg2, cfr_renamed_3)) {
            sprdqb.cfr_renamed_2035(arg2);
        }
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1627(arg0, nArray);
        sprdqb.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            spryrb.cfr_renamed_1627(arg2, nArray);
            sprdqb.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprrpb.cfr_renamed_1678(8, arg0, 0, arg1);
            return;
        }
        int n = spryrb.cfr_renamed_1654(arg0, cfr_renamed_3, arg1);
        sprrpb.cfr_renamed_1725(8, arg1, n);
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = (long)arg0[8] & 0xFFFFFFFFL;
        long l2 = (long)arg0[9] & 0xFFFFFFFFL;
        long l3 = (long)arg0[10] & 0xFFFFFFFFL;
        long l4 = (long)arg0[11] & 0xFFFFFFFFL;
        long l5 = (long)arg0[12] & 0xFFFFFFFFL;
        long l6 = (long)arg0[13] & 0xFFFFFFFFL;
        long l7 = (long)arg0[14] & 0xFFFFFFFFL;
        long l8 = (long)arg0[15] & 0xFFFFFFFFL;
        long l9 = (l -= 6L) + l2;
        long l10 = l2 + l3;
        long l11 = l3 + l4 - l8;
        long l12 = l4 + l5;
        long l13 = l5 + l6;
        long l14 = l6 + l7;
        long l15 = l7 + l8;
        long l16 = 0L;
        l16 = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + l9 - l12 - l14);
        int[] nArray = arg1;
        arg1[0] = (int)l16;
        l16 >>= 32;
        arg1[1] = (int)(l16 += ((long)arg0[1] & 0xFFFFFFFFL) + l10 - l13 - l15);
        l16 >>= 32;
        arg1[2] = (int)(l16 += ((long)arg0[2] & 0xFFFFFFFFL) + l11 - l14);
        l16 >>= 32;
        arg1[3] = (int)(l16 += ((long)arg0[3] & 0xFFFFFFFFL) + (l12 << 1) + l6 - l8 - l9);
        l16 >>= 32;
        nArray[4] = (int)(l16 += ((long)arg0[4] & 0xFFFFFFFFL) + (l13 << 1) + l7 - l10);
        l16 >>= 32;
        arg1[5] = (int)(l16 += ((long)arg0[5] & 0xFFFFFFFFL) + (l14 << 1) - l11);
        l16 >>= 32;
        nArray[6] = (int)(l16 += ((long)arg0[6] & 0xFFFFFFFFL) + (l15 << 1) + l14 - l9);
        l16 >>= 32;
        nArray[7] = (int)(l16 += ((long)arg0[7] & 0xFFFFFFFFL) + (l8 << 1) + l - l11 - l13);
        l16 >>= 32;
        sprdqb.cfr_renamed_2032((int)(l16 += 6L), arg1);
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (spryrb.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprdqb.cfr_renamed_2036(arg2);
        }
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if (sprrpb.cfr_renamed_1696(16, arg0, arg1, arg2) != 0 || (arg2[15] & 0xFFFFFFFF) == -1 && sprrpb.cfr_renamed_1683(16, arg2, cfr_renamed_2)) {
            sprrpb.cfr_renamed_1687(16, cfr_renamed_2, arg2);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprrpb.cfr_renamed_1702(8, arg0, 0, arg1) != 0 || arg1[7] == -1 && spryrb.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprdqb.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        long l = 0L;
        if (arg0 != 0) {
            long l2 = (long)arg0 & 0xFFFFFFFFL;
            long l3 = l += ((long)arg1[0] & 0xFFFFFFFFL) + l2;
            arg1[0] = (int)l3;
            l = l3 >> 32;
            if (l != 0L) {
                arg1[1] = (int)(l += (long)arg1[1] & 0xFFFFFFFFL);
                l >>= 32;
                arg1[2] = (int)(l += (long)arg1[2] & 0xFFFFFFFFL);
                l >>= 32;
            }
            long l4 = l += ((long)arg1[3] & 0xFFFFFFFFL) - l2;
            arg1[3] = (int)l4;
            l = l4 >> 32;
            if (l != 0L) {
                arg1[4] = (int)(l += (long)arg1[4] & 0xFFFFFFFFL);
                l >>= 32;
                arg1[5] = (int)(l += (long)arg1[5] & 0xFFFFFFFFL);
                l >>= 32;
            }
            arg1[6] = (int)(l += ((long)arg1[6] & 0xFFFFFFFFL) - l2);
            l >>= 32;
            arg1[7] = (int)(l += ((long)arg1[7] & 0xFFFFFFFFL) + l2);
            l >>= 32;
        }
        if (l != 0L || arg1[7] == -1 && spryrb.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprdqb.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprrpb.cfr_renamed_1707(16, arg0, arg1, arg2) != 0) {
            sprrpb.cfr_renamed_1688(16, cfr_renamed_2, arg2);
        }
    }

    private static /* synthetic */ void cfr_renamed_2035(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) + 1L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            arg0[1] = (int)(l += (long)arg0[1] & 0xFFFFFFFFL);
            l >>= 32;
            arg0[2] = (int)(l += (long)arg0[2] & 0xFFFFFFFFL);
            l >>= 32;
        }
        long l2 = l += ((long)arg0[3] & 0xFFFFFFFFL) - 1L;
        arg0[3] = (int)l2;
        l = l2 >> 32;
        if (l != 0L) {
            arg0[4] = (int)(l += (long)arg0[4] & 0xFFFFFFFFL);
            l >>= 32;
            arg0[5] = (int)(l += (long)arg0[5] & 0xFFFFFFFFL);
            l >>= 32;
        }
        arg0[6] = (int)(l += ((long)arg0[6] & 0xFFFFFFFFL) - 1L);
        l >>= 32;
        arg0[7] = (int)(l += ((long)arg0[7] & 0xFFFFFFFFL) + 1L);
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if (spryrb.cfr_renamed_1665(arg0, arg1, arg2) != 0 || (arg2[15] & 0xFFFFFFFF) == -1 && sprrpb.cfr_renamed_1683(16, arg2, cfr_renamed_2)) {
            sprrpb.cfr_renamed_1687(16, cfr_renamed_2, arg2);
        }
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprrpb.cfr_renamed_1719(8, arg0, arg1) != 0 || arg1[7] == -1 && spryrb.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprdqb.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (spryrb.cfr_renamed_1660(arg0)) {
            spryrb.cfr_renamed_1643(arg1);
            return;
        }
        spryrb.cfr_renamed_1641(cfr_renamed_3, arg0, arg1);
    }
}


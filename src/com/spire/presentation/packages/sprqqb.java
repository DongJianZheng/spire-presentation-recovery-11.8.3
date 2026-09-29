/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkjb;
import com.spire.presentation.packages.sprrpb;
import java.math.BigInteger;

public class sprqqb {
    private static final int cfr_renamed_91 = -1;
    public static final int[] cfr_renamed_0;
    public static final int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = -1;
    private static final long cfr_renamed_3 = 0xFFFFFFFFL;
    private static final int[] cfr_renamed_4;

    static {
        int[] nArray = new int[7];
        nArray[0] = 1;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        cfr_renamed_1 = nArray;
        int[] nArray2 = new int[14];
        nArray2[0] = 1;
        nArray2[1] = 0;
        nArray2[2] = 0;
        nArray2[3] = -2;
        nArray2[4] = -1;
        nArray2[5] = -1;
        nArray2[6] = 0;
        nArray2[7] = 2;
        nArray2[8] = 0;
        nArray2[9] = 0;
        nArray2[10] = -2;
        nArray2[11] = -1;
        nArray2[12] = -1;
        nArray2[13] = -1;
        cfr_renamed_0 = nArray2;
        int[] nArray3 = new int[11];
        nArray3[0] = -1;
        nArray3[1] = -1;
        nArray3[2] = -1;
        nArray3[3] = 1;
        nArray3[4] = 0;
        nArray3[5] = 0;
        nArray3[6] = -1;
        nArray3[7] = -3;
        nArray3[8] = -1;
        nArray3[9] = -1;
        nArray3[10] = 1;
        cfr_renamed_4 = nArray3;
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = (long)arg0[10] & 0xFFFFFFFFL;
        long l2 = (long)arg0[11] & 0xFFFFFFFFL;
        long l3 = (long)arg0[12] & 0xFFFFFFFFL;
        long l4 = (long)arg0[13] & 0xFFFFFFFFL;
        long l5 = ((long)arg0[7] & 0xFFFFFFFFL) + l2 - 1L;
        long l6 = ((long)arg0[8] & 0xFFFFFFFFL) + l3;
        long l7 = ((long)arg0[9] & 0xFFFFFFFFL) + l4;
        long l8 = 0L;
        l8 = 0L + (((long)arg0[0] & 0xFFFFFFFFL) - l5);
        long l9 = l8 & 0xFFFFFFFFL;
        l8 >>= 32;
        int[] nArray = arg1;
        arg1[1] = (int)(l8 += ((long)arg0[1] & 0xFFFFFFFFL) - l6);
        l8 >>= 32;
        arg1[2] = (int)(l8 += ((long)arg0[2] & 0xFFFFFFFFL) - l7);
        l8 >>= 32;
        long l10 = (l8 += ((long)arg0[3] & 0xFFFFFFFFL) + l5 - l) & 0xFFFFFFFFL;
        l8 >>= 32;
        nArray[4] = (int)(l8 += ((long)arg0[4] & 0xFFFFFFFFL) + l6 - l2);
        l8 >>= 32;
        arg1[5] = (int)(l8 += ((long)arg0[5] & 0xFFFFFFFFL) + l7 - l3);
        l8 >>= 32;
        nArray[6] = (int)(l8 += ((long)arg0[6] & 0xFFFFFFFFL) + l - l4);
        l8 >>= 32;
        l10 += ++l8;
        nArray[0] = (int)(l9 -= l8);
        l8 = l9 >> 32;
        if (l8 != 0L) {
            arg1[1] = (int)(l8 += (long)arg1[1] & 0xFFFFFFFFL);
            l8 >>= 32;
            arg1[2] = (int)(l8 += (long)arg1[2] & 0xFFFFFFFFL);
            l10 += l8 >> 32;
        }
        arg1[3] = (int)l10;
        l8 = l10 >> 32;
        if (l8 != 0L && sprrpb.cfr_renamed_1675(7, arg1, 4) != 0 || arg1[6] == -1 && sprkjb.cfr_renamed_1649(arg1, cfr_renamed_1)) {
            sprqqb.cfr_renamed_2035(arg1);
        }
    }

    private static /* synthetic */ void cfr_renamed_2035(int[] arg0) {
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
            sprrpb.cfr_renamed_1675(7, arg0, 4);
        }
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        long l = 0L;
        if (arg0 != 0) {
            long l2 = (long)arg0 & 0xFFFFFFFFL;
            long l3 = l += ((long)arg1[0] & 0xFFFFFFFFL) - l2;
            arg1[0] = (int)l3;
            l = l3 >> 32;
            if (l != 0L) {
                arg1[1] = (int)(l += (long)arg1[1] & 0xFFFFFFFFL);
                l >>= 32;
                arg1[2] = (int)(l += (long)arg1[2] & 0xFFFFFFFFL);
                l >>= 32;
            }
            long l4 = l += ((long)arg1[3] & 0xFFFFFFFFL) + l2;
            arg1[3] = (int)l4;
            l = l4 >> 32;
        }
        if (l != 0L && sprrpb.cfr_renamed_1675(7, arg1, 4) != 0 || arg1[6] == -1 && sprkjb.cfr_renamed_1649(arg1, cfr_renamed_1)) {
            sprqqb.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprkjb.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[13] == -1 && sprrpb.cfr_renamed_1683(14, arg2, cfr_renamed_0)) && sprrpb.cfr_renamed_1688(cfr_renamed_4.length, cfr_renamed_4, arg2) != 0) {
            sprrpb.cfr_renamed_1675(14, arg2, cfr_renamed_4.length);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (sprkjb.cfr_renamed_1660(arg0)) {
            sprkjb.cfr_renamed_1643(arg1);
            return;
        }
        sprkjb.cfr_renamed_1641(cfr_renamed_1, arg0, arg1);
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprrpb.cfr_renamed_1678(7, arg0, 0, arg1);
            return;
        }
        int n = sprkjb.cfr_renamed_1654(arg0, cfr_renamed_1, arg1);
        sprrpb.cfr_renamed_1725(7, arg1, n);
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprkjb.cfr_renamed_1633();
        sprkjb.cfr_renamed_1636(arg0, arg1, nArray);
        sprqqb.cfr_renamed_2028(nArray, arg2);
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprkjb.cfr_renamed_1633();
        sprkjb.cfr_renamed_1627(arg0, nArray);
        sprqqb.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprkjb.cfr_renamed_1627(arg2, nArray);
            sprqqb.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprrpb.cfr_renamed_1696(14, arg0, arg1, arg2) != 0 || arg2[13] == -1 && sprrpb.cfr_renamed_1683(14, arg2, cfr_renamed_0)) && sprrpb.cfr_renamed_1688(cfr_renamed_4.length, cfr_renamed_4, arg2) != 0) {
            sprrpb.cfr_renamed_1675(14, arg2, cfr_renamed_4.length);
        }
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprkjb.cfr_renamed_1652(arg0);
        if (nArray[6] == -1 && sprkjb.cfr_renamed_1649(nArray, cfr_renamed_1)) {
            sprkjb.cfr_renamed_1650(cfr_renamed_1, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprrpb.cfr_renamed_1702(7, arg0, 0, arg1) != 0 || arg1[6] == -1 && sprkjb.cfr_renamed_1649(arg1, cfr_renamed_1)) {
            sprqqb.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprrpb.cfr_renamed_1719(7, arg0, arg1) != 0 || arg1[6] == -1 && sprkjb.cfr_renamed_1649(arg1, cfr_renamed_1)) {
            sprqqb.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprkjb.cfr_renamed_1633();
        sprkjb.cfr_renamed_1627(arg0, nArray);
        sprqqb.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprkjb.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[6] == -1 && sprkjb.cfr_renamed_1649(arg2, cfr_renamed_1)) {
            sprqqb.cfr_renamed_2035(arg2);
        }
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprrpb.cfr_renamed_1707(14, arg0, arg1, arg2) != 0 && sprrpb.cfr_renamed_1687(cfr_renamed_4.length, cfr_renamed_4, arg2) != 0) {
            sprrpb.cfr_renamed_1714(14, arg2, cfr_renamed_4.length);
        }
    }

    private static /* synthetic */ void cfr_renamed_2036(int[] arg0) {
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
            sprrpb.cfr_renamed_1714(7, arg0, 4);
        }
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprkjb.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprqqb.cfr_renamed_2036(arg2);
        }
    }
}


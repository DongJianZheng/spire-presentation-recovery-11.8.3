/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.spryrb;
import java.math.BigInteger;

public class sprztb {
    private static final int[] cfr_renamed_0;
    private static final int cfr_renamed_1 = Integer.MAX_VALUE;
    private static final long cfr_renamed_2 = 0xFFFFFFFFL;
    private static final int cfr_renamed_3 = 19;
    public static final int[] cfr_renamed_4;

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1627(arg0, nArray);
        sprztb.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1627(arg0, nArray);
        sprztb.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            spryrb.cfr_renamed_1627(arg2, nArray);
            sprztb.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        sprrpb.cfr_renamed_1696(16, arg0, arg1, arg2);
        if (sprrpb.cfr_renamed_1683(16, arg2, cfr_renamed_0)) {
            sprztb.cfr_renamed_2047(arg2);
        }
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprrpb.cfr_renamed_1678(8, arg0, 0, arg1);
            return;
        }
        spryrb.cfr_renamed_1654(arg0, cfr_renamed_4, arg1);
        sprrpb.cfr_renamed_1725(8, arg1, 0);
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        int n = arg0[7];
        int n2 = spryrb.cfr_renamed_1658(19, arg0, arg1) << 1;
        sprrpb.cfr_renamed_1713(8, arg0, 8, n, arg1, 0);
        int n3 = arg1[7];
        n2 += (n3 >>> 31) - (n >>> 31);
        n3 &= Integer.MAX_VALUE;
        arg1[7] = n3 += sprrpb.cfr_renamed_1674(7, n2 * 19, arg1);
        if (spryrb.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprztb.cfr_renamed_2048(arg1);
        }
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        sprrpb.cfr_renamed_1719(8, arg0, arg1);
        if (spryrb.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprztb.cfr_renamed_2048(arg1);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (spryrb.cfr_renamed_1660(arg0)) {
            spryrb.cfr_renamed_1643(arg1);
            return;
        }
        spryrb.cfr_renamed_1641(cfr_renamed_4, arg0, arg1);
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = spryrb.cfr_renamed_1633();
        spryrb.cfr_renamed_1636(arg0, arg1, nArray);
        sprztb.cfr_renamed_2028(nArray, arg2);
    }

    private static /* synthetic */ int cfr_renamed_2048(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) + 19L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            l = sprrpb.cfr_renamed_1675(7, arg0, 1);
        }
        long l2 = l += ((long)arg0[7] & 0xFFFFFFFFL) - 0x80000000L;
        arg0[7] = (int)l2;
        l = l2 >> 32;
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2037(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        spryrb.cfr_renamed_1665(arg0, (int[])arg1, (int[])arg2);
        if (sprrpb.cfr_renamed_1683(16, (int[])arg2, cfr_renamed_0)) {
            sprztb.cfr_renamed_2047((int[])arg2);
        }
    }

    private static /* synthetic */ int cfr_renamed_2047(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) - ((long)cfr_renamed_0[0] & 0xFFFFFFFFL);
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            l = sprrpb.cfr_renamed_1714(8, arg0, 1);
        }
        long l2 = l += ((long)arg0[8] & 0xFFFFFFFFL) + 19L;
        arg0[8] = (int)l2;
        l = l2 >> 32;
        if (l != 0L) {
            l = sprrpb.cfr_renamed_1675(15, arg0, 9);
        }
        long l3 = l += ((long)arg0[15] & 0xFFFFFFFFL) - ((long)(cfr_renamed_0[15] + 1) & 0xFFFFFFFFL);
        arg0[15] = (int)l3;
        l = l3 >> 32;
        return (int)l;
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (spryrb.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprztb.cfr_renamed_2049(arg2);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        sprrpb.cfr_renamed_1702(8, arg0, 0, arg1);
        if (spryrb.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprztb.cfr_renamed_2048(arg1);
        }
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprrpb.cfr_renamed_1707(16, arg0, arg1, arg2) != 0) {
            sprztb.cfr_renamed_2050(arg2);
        }
    }

    private static /* synthetic */ int cfr_renamed_2049(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) - 19L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            l = sprrpb.cfr_renamed_1714(7, arg0, 1);
        }
        long l2 = l += ((long)arg0[7] & 0xFFFFFFFFL) + 0x80000000L;
        arg0[7] = (int)l2;
        l = l2 >> 32;
        return (int)l;
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        spryrb.cfr_renamed_1654(arg0, arg1, arg2);
        if (spryrb.cfr_renamed_1649(arg2, cfr_renamed_4)) {
            sprztb.cfr_renamed_2048(arg2);
        }
    }

    public static void cfr_renamed_2046(int arg0, int[] arg1) {
        int n = arg1[7];
        int n2 = arg0 << 1 | n >>> 31;
        n &= Integer.MAX_VALUE;
        arg1[7] = n += sprrpb.cfr_renamed_1674(7, n2 * 19, arg1);
        if (spryrb.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprztb.cfr_renamed_2048(arg1);
        }
    }

    private static /* synthetic */ int cfr_renamed_2050(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) + ((long)cfr_renamed_0[0] & 0xFFFFFFFFL);
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            l = sprrpb.cfr_renamed_1675(8, arg0, 1);
        }
        long l2 = l += ((long)arg0[8] & 0xFFFFFFFFL) - 19L;
        arg0[8] = (int)l2;
        l = l2 >> 32;
        if (l != 0L) {
            l = sprrpb.cfr_renamed_1714(15, arg0, 9);
        }
        long l3 = l += ((long)arg0[15] & 0xFFFFFFFFL) + ((long)(cfr_renamed_0[15] + 1) & 0xFFFFFFFFL);
        arg0[15] = (int)l3;
        l = l3 >> 32;
        return (int)l;
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray;
        int[] nArray2 = nArray = spryrb.cfr_renamed_1652(arg0);
        while (spryrb.cfr_renamed_1649(nArray2, cfr_renamed_4)) {
            spryrb.cfr_renamed_1650(cfr_renamed_4, nArray);
            nArray2 = nArray;
        }
        return nArray;
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = -19;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = Integer.MAX_VALUE;
        cfr_renamed_4 = nArray;
        int[] nArray2 = new int[16];
        nArray2[0] = 361;
        nArray2[1] = 0;
        nArray2[2] = 0;
        nArray2[3] = 0;
        nArray2[4] = 0;
        nArray2[5] = 0;
        nArray2[6] = 0;
        nArray2[7] = 0;
        nArray2[8] = -19;
        nArray2[9] = -1;
        nArray2[10] = -1;
        nArray2[11] = -1;
        nArray2[12] = -1;
        nArray2[13] = -1;
        nArray2[14] = -1;
        nArray2[15] = 0x3FFFFFFF;
        cfr_renamed_0 = nArray2;
    }
}


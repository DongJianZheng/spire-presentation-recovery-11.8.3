/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprhqh {
    private static final int cfr_renamed_91 = -1;
    private static final int[] cfr_renamed_0;
    private static final long cfr_renamed_1 = 0xFFFFFFFFL;
    private static final int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = -1;
    public static final int[] cfr_renamed_4;

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprinh.cfr_renamed_1652(arg0);
        if (nArray[5] == -1 && sprinh.cfr_renamed_1649(nArray, cfr_renamed_4)) {
            sprinh.cfr_renamed_1650(cfr_renamed_4, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        long l = 0L;
        if (arg0 != 0) {
            long l2 = (long)arg0 & 0xFFFFFFFFL;
            long l3 = l += ((long)arg1[0] & 0xFFFFFFFFL) + l2;
            arg1[0] = (int)l3;
            l = l3 >> 32;
            if (l != 0L) {
                long l4 = l += (long)arg1[1] & 0xFFFFFFFFL;
                arg1[1] = (int)l4;
                l = l4 >> 32;
            }
            long l5 = l += ((long)arg1[2] & 0xFFFFFFFFL) + l2;
            arg1[2] = (int)l5;
            l = l5 >> 32;
        }
        if (l != 0L && sprvih.cfr_renamed_1675(6, arg1, 3) != 0 || arg1[5] == -1 && sprinh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprhqh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            sprhqh.cfr_renamed_9001(arg0, arg1);
        } while (0 != sprhqh.cfr_renamed_1660(arg1));
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1719(6, arg0, arg1) != 0 || arg1[5] == -1 && sprinh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprhqh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprinh.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[5] == -1 && sprinh.cfr_renamed_1649(arg2, cfr_renamed_4)) {
            sprhqh.cfr_renamed_2035(arg2);
        }
    }

    private static /* synthetic */ void cfr_renamed_2036(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) - 1L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            long l2 = l += (long)arg0[1] & 0xFFFFFFFFL;
            arg0[1] = (int)l2;
            l = l2 >> 32;
        }
        long l3 = l += ((long)arg0[2] & 0xFFFFFFFFL) - 1L;
        arg0[2] = (int)l3;
        l = l3 >> 32;
        if (l != 0L) {
            sprvih.cfr_renamed_1714(6, arg0, 3);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprinh.cfr_renamed_1633();
        sprinh.cfr_renamed_1627(arg0, nArray);
        sprhqh.cfr_renamed_2028(nArray, arg1);
    }

    static {
        int[] nArray = new int[6];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -2;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        cfr_renamed_4 = nArray;
        int[] nArray2 = new int[12];
        nArray2[0] = 1;
        nArray2[1] = 0;
        nArray2[2] = 2;
        nArray2[3] = 0;
        nArray2[4] = 1;
        nArray2[5] = 0;
        nArray2[6] = -2;
        nArray2[7] = -1;
        nArray2[8] = -3;
        nArray2[9] = -1;
        nArray2[10] = -1;
        nArray2[11] = -1;
        cfr_renamed_2 = nArray2;
        int[] nArray3 = new int[9];
        nArray3[0] = -1;
        nArray3[1] = -1;
        nArray3[2] = -3;
        nArray3[3] = -1;
        nArray3[4] = -2;
        nArray3[5] = -1;
        nArray3[6] = 1;
        nArray3[7] = 0;
        nArray3[8] = 2;
        cfr_renamed_0 = nArray3;
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[24];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 6);
        } while (0 == sprvih.cfr_renamed_8550(6, arg1, cfr_renamed_4));
    }

    private static /* synthetic */ void cfr_renamed_2035(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) + 1L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            long l2 = l += (long)arg0[1] & 0xFFFFFFFFL;
            arg0[1] = (int)l2;
            l = l2 >> 32;
        }
        long l3 = l += ((long)arg0[2] & 0xFFFFFFFFL) + 1L;
        arg0[2] = (int)l3;
        l = l3 >> 32;
        if (l != 0L) {
            sprvih.cfr_renamed_1675(6, arg0, 3);
        }
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprvih.cfr_renamed_1696(12, arg0, arg1, arg2) != 0 || arg2[11] == -1 && sprvih.cfr_renamed_1683(12, arg2, cfr_renamed_2)) && sprvih.cfr_renamed_1688(cfr_renamed_0.length, cfr_renamed_0, arg2) != 0) {
            sprvih.cfr_renamed_1675(12, arg2, cfr_renamed_0.length);
        }
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 6) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprinh.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprhqh.cfr_renamed_2036(arg2);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != sprhqh.cfr_renamed_1660(arg0)) {
            sprinh.cfr_renamed_1641(cfr_renamed_4, cfr_renamed_4, arg1);
            return;
        }
        sprinh.cfr_renamed_1641(cfr_renamed_4, arg0, arg1);
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(12, arg0, arg1, arg2) != 0 && sprvih.cfr_renamed_1687(cfr_renamed_0.length, cfr_renamed_0, arg2) != 0) {
            sprvih.cfr_renamed_1714(12, arg2, cfr_renamed_0.length);
        }
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = (long)arg0[6] & 0xFFFFFFFFL;
        long l2 = (long)arg0[7] & 0xFFFFFFFFL;
        long l3 = (long)arg0[8] & 0xFFFFFFFFL;
        long l4 = (long)arg0[9] & 0xFFFFFFFFL;
        long l5 = (long)arg0[10] & 0xFFFFFFFFL;
        long l6 = (long)arg0[11] & 0xFFFFFFFFL;
        long l7 = l + l5;
        long l8 = l2 + l6;
        long l9 = 0L;
        l9 = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + l7);
        int n = (int)l9;
        l9 >>= 32;
        int[] nArray = arg1;
        long l10 = l9 += ((long)arg0[1] & 0xFFFFFFFFL) + l8;
        arg1[1] = (int)l10;
        l9 = l10 >> 32;
        long l11 = (l9 += ((long)arg0[2] & 0xFFFFFFFFL) + (l7 += l3)) & 0xFFFFFFFFL;
        l9 >>= 32;
        nArray[3] = (int)(l9 += ((long)arg0[3] & 0xFFFFFFFFL) + (l8 += l4));
        l9 >>= 32;
        arg1[4] = (int)(l9 += ((long)arg0[4] & 0xFFFFFFFFL) + (l7 -= l));
        l9 >>= 32;
        nArray[5] = (int)(l9 += ((long)arg0[5] & 0xFFFFFFFFL) + (l8 -= l2));
        l11 += (l9 >>= 32);
        nArray[0] = (int)(l9 += (long)n & 0xFFFFFFFFL);
        if ((l9 >>= 32) != 0L) {
            arg1[1] = (int)(l9 += (long)arg1[1] & 0xFFFFFFFFL);
            l11 += l9 >> 32;
        }
        arg1[2] = (int)l11;
        l9 = l11 >> 32;
        if (l9 != 0L && sprvih.cfr_renamed_1675(6, arg1, 3) != 0 || arg1[5] == -1 && sprinh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprhqh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1702(6, arg0, 0, arg1) != 0 || arg1[5] == -1 && sprinh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprhqh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprinh.cfr_renamed_1633();
        sprinh.cfr_renamed_1636(arg0, arg1, nArray);
        sprhqh.cfr_renamed_2028(nArray, arg2);
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprvih.cfr_renamed_1678(6, arg0, 0, arg1);
            return;
        }
        int n = sprinh.cfr_renamed_1654(arg0, cfr_renamed_4, arg1);
        sprvih.cfr_renamed_1725(6, arg1, n);
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprinh.cfr_renamed_1633();
        sprinh.cfr_renamed_1627(arg0, nArray);
        sprhqh.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprinh.cfr_renamed_1627(arg2, nArray);
            sprhqh.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_4, arg0, arg1);
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprinh.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[11] == -1 && sprvih.cfr_renamed_1683(12, arg2, cfr_renamed_2)) && sprvih.cfr_renamed_1688(cfr_renamed_0.length, cfr_renamed_0, arg2) != 0) {
            sprvih.cfr_renamed_1675(12, arg2, cfr_renamed_0.length);
        }
    }
}


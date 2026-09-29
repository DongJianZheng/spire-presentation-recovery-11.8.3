/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprnrh {
    private static final int[] cfr_renamed_119;
    private static final long cfr_renamed_91 = 0xFFFFFFFFL;
    public static final int[] cfr_renamed_0;
    private static final int cfr_renamed_1 = -1;
    private static final int cfr_renamed_2 = -1;
    private static final int[] cfr_renamed_3;
    private static final int cfr_renamed_4 = -2147483647;

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1719(5, arg0, arg1) != 0 || arg1[4] == -1 && sprqkh.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprvih.cfr_renamed_1674(5, -2147483647, arg1);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != sprnrh.cfr_renamed_1660(arg0)) {
            sprqkh.cfr_renamed_1641(cfr_renamed_0, cfr_renamed_0, arg1);
            return;
        }
        sprqkh.cfr_renamed_1641(cfr_renamed_0, arg0, arg1);
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprqkh.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprvih.cfr_renamed_1740(5, -2147483647, arg2);
        }
    }

    static {
        int[] nArray = new int[5];
        nArray[0] = Integer.MAX_VALUE;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        cfr_renamed_0 = nArray;
        int[] nArray2 = new int[10];
        nArray2[0] = 1;
        nArray2[1] = 0x40000001;
        nArray2[2] = 0;
        nArray2[3] = 0;
        nArray2[4] = 0;
        nArray2[5] = -2;
        nArray2[6] = -2;
        nArray2[7] = -1;
        nArray2[8] = -1;
        nArray2[9] = -1;
        cfr_renamed_119 = nArray2;
        int[] nArray3 = new int[7];
        nArray3[0] = -1;
        nArray3[1] = -1073741826;
        nArray3[2] = -1;
        nArray3[3] = -1;
        nArray3[4] = -1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        cfr_renamed_3 = nArray3;
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_0, arg0, arg1);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprqkh.cfr_renamed_1652(arg0);
        if (nArray[4] == -1 && sprqkh.cfr_renamed_1649(nArray, cfr_renamed_0)) {
            sprqkh.cfr_renamed_1650(cfr_renamed_0, nArray);
        }
        return nArray;
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 5) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprqkh.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[9] == -1 && sprvih.cfr_renamed_1683(10, arg2, cfr_renamed_119)) && sprvih.cfr_renamed_1688(cfr_renamed_3.length, cfr_renamed_3, arg2) != 0) {
            sprvih.cfr_renamed_1675(10, arg2, cfr_renamed_3.length);
        }
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprqkh.cfr_renamed_1633();
        sprqkh.cfr_renamed_1627(arg0, nArray);
        sprnrh.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprqkh.cfr_renamed_1627(arg2, nArray);
            sprnrh.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        if (arg0 != 0 && sprqkh.cfr_renamed_8547(-2147483647, arg0, arg1, 0) != 0 || arg1[4] == -1 && sprqkh.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprvih.cfr_renamed_1674(5, -2147483647, arg1);
        }
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = (long)arg0[5] & 0xFFFFFFFFL;
        long l2 = (long)arg0[6] & 0xFFFFFFFFL;
        long l3 = (long)arg0[7] & 0xFFFFFFFFL;
        long l4 = (long)arg0[8] & 0xFFFFFFFFL;
        long l5 = (long)arg0[9] & 0xFFFFFFFFL;
        long l6 = 0L;
        l6 = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + l + (l << 31));
        int[] nArray = arg1;
        long l7 = l6;
        arg1[0] = (int)l7;
        l6 = l7 >>> 32;
        nArray[1] = (int)(l6 += ((long)arg0[1] & 0xFFFFFFFFL) + l2 + (l2 << 31));
        l6 >>>= 32;
        arg1[2] = (int)(l6 += ((long)arg0[2] & 0xFFFFFFFFL) + l3 + (l3 << 31));
        l6 >>>= 32;
        nArray[3] = (int)(l6 += ((long)arg0[3] & 0xFFFFFFFFL) + l4 + (l4 << 31));
        l6 >>>= 32;
        nArray[4] = (int)(l6 += ((long)arg0[4] & 0xFFFFFFFFL) + l5 + (l5 << 31));
        sprnrh.cfr_renamed_2032((int)(l6 >>>= 32), arg1);
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprvih.cfr_renamed_1678(5, arg0, 0, arg1);
            return;
        }
        int n = sprqkh.cfr_renamed_1654(arg0, cfr_renamed_0, arg1);
        sprvih.cfr_renamed_1725(5, arg1, n);
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[20];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 5);
        } while (0 == sprvih.cfr_renamed_8550(5, arg1, cfr_renamed_0));
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprvih.cfr_renamed_1696(10, arg0, arg1, arg2) != 0 || arg2[9] == -1 && sprvih.cfr_renamed_1683(10, arg2, cfr_renamed_119)) && sprvih.cfr_renamed_1688(cfr_renamed_3.length, cfr_renamed_3, arg2) != 0) {
            sprvih.cfr_renamed_1675(10, arg2, cfr_renamed_3.length);
        }
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprqkh.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[4] == -1 && sprqkh.cfr_renamed_1649(arg2, cfr_renamed_0)) {
            sprvih.cfr_renamed_1674(5, -2147483647, arg2);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprqkh.cfr_renamed_1633();
        sprqkh.cfr_renamed_1627(arg0, nArray);
        sprnrh.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprqkh.cfr_renamed_1633();
        sprqkh.cfr_renamed_1636(arg0, arg1, nArray);
        sprnrh.cfr_renamed_2028(nArray, arg2);
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(10, arg0, arg1, arg2) != 0 && sprvih.cfr_renamed_1687(cfr_renamed_3.length, cfr_renamed_3, arg2) != 0) {
            sprvih.cfr_renamed_1714(10, arg2, cfr_renamed_3.length);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1702(5, arg0, 0, arg1) != 0 || arg1[4] == -1 && sprqkh.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprvih.cfr_renamed_1674(5, -2147483647, arg1);
        }
    }

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            sprnrh.cfr_renamed_9001(arg0, arg1);
        } while (0 != sprnrh.cfr_renamed_1660(arg1));
    }
}


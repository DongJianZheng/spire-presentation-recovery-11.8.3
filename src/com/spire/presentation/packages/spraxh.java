/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spraxh {
    private static final int cfr_renamed_91 = 6803;
    private static final int[] cfr_renamed_0;
    private static final int cfr_renamed_1 = -1;
    private static final int[] cfr_renamed_2;
    public static final int[] cfr_renamed_3;
    private static final int cfr_renamed_4 = -1;

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprekh.cfr_renamed_1652(arg0);
        if (nArray[6] == -1 && sprekh.cfr_renamed_1649(nArray, cfr_renamed_3)) {
            sprvih.cfr_renamed_1712(7, 6803, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != spraxh.cfr_renamed_1660(arg0)) {
            sprekh.cfr_renamed_1641(cfr_renamed_3, cfr_renamed_3, arg1);
            return;
        }
        sprekh.cfr_renamed_1641(cfr_renamed_3, arg0, arg1);
    }

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            spraxh.cfr_renamed_9001(arg0, arg1);
        } while (0 != spraxh.cfr_renamed_1660(arg1));
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprekh.cfr_renamed_1633();
        sprekh.cfr_renamed_1627(arg0, nArray);
        spraxh.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprekh.cfr_renamed_1627(arg2, nArray);
            spraxh.cfr_renamed_2028(nArray, arg2);
        }
    }

    static {
        int[] nArray = new int[7];
        nArray[0] = -6803;
        nArray[1] = -2;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        cfr_renamed_3 = nArray;
        int[] nArray2 = new int[14];
        nArray2[0] = 46280809;
        nArray2[1] = 13606;
        nArray2[2] = 1;
        nArray2[3] = 0;
        nArray2[4] = 0;
        nArray2[5] = 0;
        nArray2[6] = 0;
        nArray2[7] = -13606;
        nArray2[8] = -3;
        nArray2[9] = -1;
        nArray2[10] = -1;
        nArray2[11] = -1;
        nArray2[12] = -1;
        nArray2[13] = -1;
        cfr_renamed_0 = nArray2;
        int[] nArray3 = new int[9];
        nArray3[0] = -46280809;
        nArray3[1] = -13607;
        nArray3[2] = -2;
        nArray3[3] = -1;
        nArray3[4] = -1;
        nArray3[5] = -1;
        nArray3[6] = -1;
        nArray3[7] = 13605;
        nArray3[8] = 2;
        cfr_renamed_2 = nArray3;
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(14, arg0, arg1, arg2) != 0 && sprvih.cfr_renamed_1687(cfr_renamed_2.length, cfr_renamed_2, arg2) != 0) {
            sprvih.cfr_renamed_1714(14, arg2, cfr_renamed_2.length);
        }
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprekh.cfr_renamed_1633();
        sprekh.cfr_renamed_1636(arg0, arg1, nArray);
        spraxh.cfr_renamed_2028(nArray, arg2);
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprekh.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[13] == -1 && sprvih.cfr_renamed_1683(14, arg2, cfr_renamed_0)) && sprvih.cfr_renamed_1688(cfr_renamed_2.length, cfr_renamed_2, arg2) != 0) {
            sprvih.cfr_renamed_1675(14, arg2, cfr_renamed_2.length);
        }
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprvih.cfr_renamed_1696(14, arg0, arg1, arg2) != 0 || arg2[13] == -1 && sprvih.cfr_renamed_1683(14, arg2, cfr_renamed_0)) && sprvih.cfr_renamed_1688(cfr_renamed_2.length, cfr_renamed_2, arg2) != 0) {
            sprvih.cfr_renamed_1675(14, arg2, cfr_renamed_2.length);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprekh.cfr_renamed_1633();
        sprekh.cfr_renamed_1627(arg0, nArray);
        spraxh.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1702(7, arg0, 0, arg1) != 0 || arg1[6] == -1 && sprekh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprvih.cfr_renamed_1712(7, 6803, arg1);
        }
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprekh.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[6] == -1 && sprekh.cfr_renamed_1649(arg2, cfr_renamed_3)) {
            sprvih.cfr_renamed_1712(7, 6803, arg2);
        }
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 7) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        if (arg0 != 0 && sprekh.cfr_renamed_1644(6803, arg0, arg1, 0) != 0 || arg1[6] == -1 && sprekh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprvih.cfr_renamed_1712(7, 6803, arg1);
        }
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[28];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 7);
        } while (0 == sprvih.cfr_renamed_8550(7, arg1, cfr_renamed_3));
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1719(7, arg0, arg1) != 0 || arg1[6] == -1 && sprekh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprvih.cfr_renamed_1712(7, 6803, arg1);
        }
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprekh.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprvih.cfr_renamed_1742(7, 6803, arg2);
        }
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_3, arg0, arg1);
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = sprekh.cfr_renamed_1666(6803, arg0, 7, arg0, 0, arg1, 0);
        if (sprekh.cfr_renamed_1667(6803, l, arg1, 0) != 0 || arg1[6] == -1 && sprekh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprvih.cfr_renamed_1712(7, 6803, arg1);
        }
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprvih.cfr_renamed_1678(7, arg0, 0, arg1);
            return;
        }
        int n = sprekh.cfr_renamed_1654(arg0, cfr_renamed_3, arg1);
        sprvih.cfr_renamed_1725(7, arg1, n);
    }
}


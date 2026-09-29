/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqlb;
import com.spire.presentation.packages.sprrpb;
import java.math.BigInteger;

public class sprrmb {
    private static final int cfr_renamed_91 = -1;
    public static final int[] cfr_renamed_0;
    private static final int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = -1;
    public static final int[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 4553;

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprrpb.cfr_renamed_1696(12, arg0, arg1, arg2) != 0 || arg2[11] == -1 && sprrpb.cfr_renamed_1683(12, arg2, cfr_renamed_3)) && sprrpb.cfr_renamed_1688(cfr_renamed_1.length, cfr_renamed_1, arg2) != 0) {
            sprrpb.cfr_renamed_1675(12, arg2, cfr_renamed_1.length);
        }
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprrpb.cfr_renamed_1707(12, arg0, arg1, arg2) != 0 && sprrpb.cfr_renamed_1687(cfr_renamed_1.length, cfr_renamed_1, arg2) != 0) {
            sprrpb.cfr_renamed_1714(12, arg2, cfr_renamed_1.length);
        }
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprrpb.cfr_renamed_1719(6, arg0, arg1) != 0 || arg1[5] == -1 && sprqlb.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprrpb.cfr_renamed_1712(6, 4553, arg1);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (sprqlb.cfr_renamed_1660(arg0)) {
            sprqlb.cfr_renamed_1643(arg1);
            return;
        }
        sprqlb.cfr_renamed_1641(cfr_renamed_0, arg0, arg1);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprqlb.cfr_renamed_1652(arg0);
        if (nArray[5] == -1 && sprqlb.cfr_renamed_1649(nArray, cfr_renamed_0)) {
            sprqlb.cfr_renamed_1650(cfr_renamed_0, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = sprqlb.cfr_renamed_1666(4553, arg0, 6, arg0, 0, arg1, 0);
        if (sprqlb.cfr_renamed_1667(4553, l, arg1, 0) != 0 || arg1[5] == -1 && sprqlb.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprrpb.cfr_renamed_1712(6, 4553, arg1);
        }
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprqlb.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[5] == -1 && sprqlb.cfr_renamed_1649(arg2, cfr_renamed_0)) {
            sprrpb.cfr_renamed_1712(6, 4553, arg2);
        }
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprrpb.cfr_renamed_1678(6, arg0, 0, arg1);
            return;
        }
        int n = sprqlb.cfr_renamed_1654(arg0, cfr_renamed_0, arg1);
        sprrpb.cfr_renamed_1725(6, arg1, n);
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprqlb.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[11] == -1 && sprrpb.cfr_renamed_1683(12, arg2, cfr_renamed_3)) && sprrpb.cfr_renamed_1688(cfr_renamed_1.length, cfr_renamed_1, arg2) != 0) {
            sprrpb.cfr_renamed_1675(12, arg2, cfr_renamed_1.length);
        }
    }

    static {
        int[] nArray = new int[6];
        nArray[0] = -4553;
        nArray[1] = -2;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        cfr_renamed_0 = nArray;
        int[] nArray2 = new int[12];
        nArray2[0] = 20729809;
        nArray2[1] = 9106;
        nArray2[2] = 1;
        nArray2[3] = 0;
        nArray2[4] = 0;
        nArray2[5] = 0;
        nArray2[6] = -9106;
        nArray2[7] = -3;
        nArray2[8] = -1;
        nArray2[9] = -1;
        nArray2[10] = -1;
        nArray2[11] = -1;
        cfr_renamed_3 = nArray2;
        int[] nArray3 = new int[8];
        nArray3[0] = -20729809;
        nArray3[1] = -9107;
        nArray3[2] = -2;
        nArray3[3] = -1;
        nArray3[4] = -1;
        nArray3[5] = -1;
        nArray3[6] = 9105;
        nArray3[7] = 2;
        cfr_renamed_1 = nArray3;
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprqlb.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprrpb.cfr_renamed_1742(6, 4553, arg2);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprqlb.cfr_renamed_1633();
        sprqlb.cfr_renamed_1627(arg0, nArray);
        sprrmb.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprqlb.cfr_renamed_1633();
        sprqlb.cfr_renamed_1627(arg0, nArray);
        sprrmb.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprqlb.cfr_renamed_1627(arg2, nArray);
            sprrmb.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        if (arg0 != 0 && sprqlb.cfr_renamed_1644(4553, arg0, arg1, 0) != 0 || arg1[5] == -1 && sprqlb.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprrpb.cfr_renamed_1712(6, 4553, arg1);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprrpb.cfr_renamed_1702(6, arg0, 0, arg1) != 0 || arg1[5] == -1 && sprqlb.cfr_renamed_1649(arg1, cfr_renamed_0)) {
            sprrpb.cfr_renamed_1712(6, 4553, arg1);
        }
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprqlb.cfr_renamed_1633();
        sprqlb.cfr_renamed_1636(arg0, arg1, nArray);
        sprrmb.cfr_renamed_2028(nArray, arg2);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjlh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprnth {
    private static final int cfr_renamed_3 = 511;
    public static final int[] cfr_renamed_4;

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            sprnth.cfr_renamed_9001(arg0, arg1);
        } while (0 != sprnth.cfr_renamed_1660(arg1));
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        int n = arg0[32];
        int n2 = sprvih.cfr_renamed_1717(16, arg0, 16, 9, n, arg1, 0) >>> 23;
        n2 += n >>> 9;
        if ((n2 += sprvih.cfr_renamed_1688(16, arg0, arg1)) > 511 || n2 == 511 && sprvih.cfr_renamed_1743(16, arg1, cfr_renamed_4)) {
            n2 += sprvih.cfr_renamed_1685(16, arg1);
            n2 &= 0x1FF;
        }
        arg1[16] = n2;
    }

    static {
        int[] nArray = new int[17];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = -1;
        nArray[8] = -1;
        nArray[9] = -1;
        nArray[10] = -1;
        nArray[11] = -1;
        nArray[12] = -1;
        nArray[13] = -1;
        nArray[14] = -1;
        nArray[15] = -1;
        nArray[16] = 511;
        cfr_renamed_4 = nArray;
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprvih.cfr_renamed_1716(33);
        sprnth.cfr_renamed_2030(arg0, arg1, nArray);
        sprnth.cfr_renamed_2028(nArray, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8999(int[] nArray, int n, int[] nArray2, int[] nArray3) {
        void arg1;
        int[] arg0;
        void arg3;
        void v0 = arg3;
        sprnth.cfr_renamed_2029(arg0, (int[])v0);
        sprnth.cfr_renamed_2028((int[])v0, nArray2);
        while (--arg1 > 0) {
            void arg2;
            void v1 = arg2;
            void v2 = arg3;
            sprnth.cfr_renamed_2029((int[])v1, (int[])v2);
            sprnth.cfr_renamed_2028((int[])v2, (int[])v1);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprvih.cfr_renamed_1716(33);
        sprnth.cfr_renamed_2029(arg0, nArray);
        sprnth.cfr_renamed_2028(nArray, arg1);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprvih.cfr_renamed_1720(521, arg0);
        if (sprvih.cfr_renamed_1743(17, nArray, cfr_renamed_4)) {
            sprvih.cfr_renamed_1718(17, nArray);
        }
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2029(int[] nArray, int[] nArray2) {
        int n;
        void arg1;
        int[] arg0;
        sprjlh.cfr_renamed_1627(arg0, (int[])arg1);
        int n2 = n = arg0[16];
        nArray2[32] = sprvih.cfr_renamed_1691(16, n << 1, arg0, 0, (int[])arg1, 16) + n2 * n2;
    }

    public static void cfr_renamed_2023(int[] arg0) {
        int n = arg0[16];
        int n2 = sprvih.cfr_renamed_1674(16, n >>> 9, arg0) + (n & 0x1FF);
        if (n2 > 511 || n2 == 511 && sprvih.cfr_renamed_1743(16, arg0, cfr_renamed_4)) {
            n2 += sprvih.cfr_renamed_1685(16, arg0);
            n2 &= 0x1FF;
        }
        arg0[16] = n2;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2030(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        int[] arg0;
        sprjlh.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg2);
        int n = arg0[16];
        int n2 = nArray2[16];
        nArray3[32] = sprvih.cfr_renamed_1697(16, n, (int[])arg1, n2, arg0, (int[])arg2, 16) + n * n2;
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        int n = sprvih.cfr_renamed_1719(16, arg0, arg1) + arg0[16];
        if (n > 511 || n == 511 && sprvih.cfr_renamed_1743(16, arg1, cfr_renamed_4)) {
            n += sprvih.cfr_renamed_1685(16, arg1);
            n &= 0x1FF;
        }
        arg1[16] = n;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2024(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        int n = arg0[16];
        int n2 = sprvih.cfr_renamed_1702(16, arg0, n << 23, (int[])arg1) | n << 1;
        nArray2[16] = n2 & 0x1FF;
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[68];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 17);
            arg1[16] = arg1[16] & 0x1FF;
        } while (0 == sprvih.cfr_renamed_8550(17, arg1, cfr_renamed_4));
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != sprnth.cfr_renamed_1660(arg0)) {
            sprvih.cfr_renamed_1707(17, cfr_renamed_4, cfr_renamed_4, arg1);
            return;
        }
        sprvih.cfr_renamed_1707(17, cfr_renamed_4, arg0, arg1);
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprvih.cfr_renamed_1716(33);
        sprnth.cfr_renamed_2029(arg0, nArray);
        sprnth.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprnth.cfr_renamed_2029(arg2, nArray);
            sprnth.cfr_renamed_2028(nArray, arg2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8993(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        void arg2;
        void arg3;
        void arg1;
        int[] arg0;
        sprnth.cfr_renamed_2030(arg0, (int[])arg1, (int[])arg3);
        sprnth.cfr_renamed_2028(nArray4, (int[])arg2);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8992(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] arg0;
        void arg2;
        void v0 = arg2;
        sprnth.cfr_renamed_2029(arg0, (int[])v0);
        sprnth.cfr_renamed_2028((int[])v0, nArray2);
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 17) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        int n = sprvih.cfr_renamed_1696(16, arg0, arg1, arg2) + arg0[16] + arg1[16];
        if (n > 511 || n == 511 && sprvih.cfr_renamed_1743(16, arg2, cfr_renamed_4)) {
            n += sprvih.cfr_renamed_1685(16, arg2);
            n &= 0x1FF;
        }
        arg2[16] = n;
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_4, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2031(int[] nArray, int[] nArray2) {
        void arg1;
        int[] arg0;
        int n = arg0[16];
        int n2 = sprvih.cfr_renamed_1678(16, arg0, n, (int[])arg1);
        nArray2[16] = n >>> 1 | n2 >>> 23;
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        int n = sprvih.cfr_renamed_1707(16, arg0, arg1, arg2) + arg0[16] - arg1[16];
        if (n < 0) {
            n += sprvih.cfr_renamed_1693(16, arg2);
            n &= 0x1FF;
        }
        arg2[16] = n;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprwkh;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprbsh {
    private static final long cfr_renamed_91 = 0xFFFFFFFFL;
    private static final int[] cfr_renamed_0;
    public static final int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = -1;
    private static final int cfr_renamed_3 = -1;
    private static final int[] cfr_renamed_4;

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprvih.cfr_renamed_1720(384, arg0);
        if (nArray[11] == -1 && sprvih.cfr_renamed_1683(12, nArray, cfr_renamed_1)) {
            sprvih.cfr_renamed_1687(12, cfr_renamed_1, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprvih.cfr_renamed_1716(24);
        sprwkh.cfr_renamed_1636(arg0, arg1, nArray);
        sprbsh.cfr_renamed_2028(nArray, arg2);
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprvih.cfr_renamed_1716(24);
        sprwkh.cfr_renamed_1627(arg0, nArray);
        sprbsh.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if ((sprvih.cfr_renamed_1696(24, arg0, arg1, arg2) != 0 || arg2[23] == -1 && sprvih.cfr_renamed_1683(24, arg2, cfr_renamed_0)) && sprvih.cfr_renamed_1688(cfr_renamed_4.length, cfr_renamed_4, arg2) != 0) {
            sprvih.cfr_renamed_1675(24, arg2, cfr_renamed_4.length);
        }
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 12) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8992(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] arg0;
        void arg2;
        void v0 = arg2;
        sprwkh.cfr_renamed_1627(arg0, (int[])v0);
        sprbsh.cfr_renamed_2028((int[])v0, nArray2);
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_1, arg0, arg1);
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(24, arg0, arg1, arg2) != 0 && sprvih.cfr_renamed_1687(cfr_renamed_4.length, cfr_renamed_4, arg2) != 0) {
            sprvih.cfr_renamed_1714(24, arg2, cfr_renamed_4.length);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8999(int[] nArray, int n, int[] nArray2, int[] nArray3) {
        void arg1;
        int[] arg0;
        void arg3;
        void v0 = arg3;
        sprwkh.cfr_renamed_1627(arg0, (int[])v0);
        sprbsh.cfr_renamed_2028((int[])v0, nArray2);
        while (--arg1 > 0) {
            void arg2;
            void v1 = arg2;
            void v2 = arg3;
            sprwkh.cfr_renamed_1627((int[])v1, (int[])v2);
            sprbsh.cfr_renamed_2028((int[])v2, (int[])v1);
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
        sprwkh.cfr_renamed_1636(arg0, (int[])arg1, (int[])arg3);
        sprbsh.cfr_renamed_2028(nArray4, (int[])arg2);
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        long l = 0L;
        if (arg0 != 0) {
            long l2 = (long)arg0 & 0xFFFFFFFFL;
            arg1[0] = (int)(l += ((long)arg1[0] & 0xFFFFFFFFL) + l2);
            l >>= 32;
            arg1[1] = (int)(l += ((long)arg1[1] & 0xFFFFFFFFL) - l2);
            if ((l >>= 32) != 0L) {
                long l3 = l += (long)arg1[2] & 0xFFFFFFFFL;
                arg1[2] = (int)l3;
                l = l3 >> 32;
            }
            arg1[3] = (int)(l += ((long)arg1[3] & 0xFFFFFFFFL) + l2);
            l >>= 32;
            arg1[4] = (int)(l += ((long)arg1[4] & 0xFFFFFFFFL) + l2);
            l >>= 32;
        }
        if (l != 0L && sprvih.cfr_renamed_1675(12, arg1, 5) != 0 || arg1[11] == -1 && sprvih.cfr_renamed_1683(12, arg1, cfr_renamed_1)) {
            sprbsh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = (long)arg0[16] & 0xFFFFFFFFL;
        long l2 = (long)arg0[17] & 0xFFFFFFFFL;
        long l3 = (long)arg0[18] & 0xFFFFFFFFL;
        long l4 = (long)arg0[19] & 0xFFFFFFFFL;
        long l5 = (long)arg0[20] & 0xFFFFFFFFL;
        long l6 = (long)arg0[21] & 0xFFFFFFFFL;
        long l7 = (long)arg0[22] & 0xFFFFFFFFL;
        long l8 = (long)arg0[23] & 0xFFFFFFFFL;
        long l9 = ((long)arg0[12] & 0xFFFFFFFFL) + l5 - 1L;
        long l10 = ((long)arg0[13] & 0xFFFFFFFFL) + l7;
        long l11 = ((long)arg0[14] & 0xFFFFFFFFL) + l7 + l8;
        long l12 = ((long)arg0[15] & 0xFFFFFFFFL) + l8;
        long l13 = l2 + l6;
        long l14 = l6 - l8;
        long l15 = l7 - l8;
        long l16 = l9 + l14;
        long l17 = 0L;
        l17 = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + l16);
        int[] nArray = arg1;
        int[] nArray2 = arg1;
        int[] nArray3 = arg1;
        arg1[0] = (int)l17;
        l17 >>= 32;
        arg1[1] = (int)(l17 += ((long)arg0[1] & 0xFFFFFFFFL) + l8 - l9 + l10);
        l17 >>= 32;
        nArray2[2] = (int)(l17 += ((long)arg0[2] & 0xFFFFFFFFL) - l6 - l10 + l11);
        l17 >>= 32;
        nArray3[3] = (int)(l17 += ((long)arg0[3] & 0xFFFFFFFFL) - l11 + l12 + l16);
        l17 >>= 32;
        nArray2[4] = (int)(l17 += ((long)arg0[4] & 0xFFFFFFFFL) + l + l6 + l10 - l12 + l16);
        l17 >>= 32;
        nArray3[5] = (int)(l17 += ((long)arg0[5] & 0xFFFFFFFFL) - l + l10 + l11 + l13);
        l17 >>= 32;
        nArray2[6] = (int)(l17 += ((long)arg0[6] & 0xFFFFFFFFL) + l3 - l2 + l11 + l12);
        l17 >>= 32;
        nArray3[7] = (int)(l17 += ((long)arg0[7] & 0xFFFFFFFFL) + l + l4 - l3 + l12);
        l17 >>= 32;
        nArray[8] = (int)(l17 += ((long)arg0[8] & 0xFFFFFFFFL) + l + l2 + l5 - l4);
        l17 >>= 32;
        arg1[9] = (int)(l17 += ((long)arg0[9] & 0xFFFFFFFFL) + l3 - l5 + l13);
        l17 >>= 32;
        nArray[10] = (int)(l17 += ((long)arg0[10] & 0xFFFFFFFFL) + l3 + l4 - l14 + l15);
        l17 >>= 32;
        nArray[11] = (int)(l17 += ((long)arg0[11] & 0xFFFFFFFFL) + l4 + l5 - l15);
        l17 >>= 32;
        sprbsh.cfr_renamed_2032((int)(++l17), arg1);
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[48];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 12);
        } while (0 == sprvih.cfr_renamed_8550(12, arg1, cfr_renamed_1));
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprvih.cfr_renamed_1716(24);
        sprwkh.cfr_renamed_1627(arg0, nArray);
        sprbsh.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprwkh.cfr_renamed_1627(arg2, nArray);
            sprbsh.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1702(12, arg0, 0, arg1) != 0 || arg1[11] == -1 && sprvih.cfr_renamed_1683(12, arg1, cfr_renamed_1)) {
            sprbsh.cfr_renamed_2035(arg1);
        }
    }

    private static /* synthetic */ void cfr_renamed_2035(int[] nArray) {
        int[] arg0;
        long l = ((long)nArray[0] & 0xFFFFFFFFL) + 1L;
        nArray[0] = (int)l;
        l >>= 32;
        arg0[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) != 0L) {
            long l2 = l += (long)arg0[2] & 0xFFFFFFFFL;
            arg0[2] = (int)l2;
            l = l2 >> 32;
        }
        arg0[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + 1L);
        l >>= 32;
        arg0[4] = (int)(l += ((long)arg0[4] & 0xFFFFFFFFL) + 1L);
        if ((l >>= 32) != 0L) {
            sprvih.cfr_renamed_1675(12, arg0, 5);
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != sprbsh.cfr_renamed_1660(arg0)) {
            sprvih.cfr_renamed_1707(12, cfr_renamed_1, cfr_renamed_1, arg1);
            return;
        }
        sprvih.cfr_renamed_1707(12, cfr_renamed_1, arg0, arg1);
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1719(12, arg0, arg1) != 0 || arg1[11] == -1 && sprvih.cfr_renamed_1683(12, arg1, cfr_renamed_1)) {
            sprbsh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(12, arg0, arg1, arg2) != 0) {
            sprbsh.cfr_renamed_2036(arg2);
        }
    }

    private static /* synthetic */ void cfr_renamed_2036(int[] nArray) {
        int[] arg0;
        long l = ((long)nArray[0] & 0xFFFFFFFFL) - 1L;
        nArray[0] = (int)l;
        l >>= 32;
        arg0[1] = (int)(l += ((long)arg0[1] & 0xFFFFFFFFL) + 1L);
        if ((l >>= 32) != 0L) {
            long l2 = l += (long)arg0[2] & 0xFFFFFFFFL;
            arg0[2] = (int)l2;
            l = l2 >> 32;
        }
        arg0[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) - 1L);
        l >>= 32;
        arg0[4] = (int)(l += ((long)arg0[4] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) != 0L) {
            sprvih.cfr_renamed_1714(12, arg0, 5);
        }
    }

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            sprbsh.cfr_renamed_9001(arg0, arg1);
        } while (0 != sprbsh.cfr_renamed_1660(arg1));
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1696(12, arg0, arg1, arg2) != 0 || arg2[11] == -1 && sprvih.cfr_renamed_1683(12, arg2, cfr_renamed_1)) {
            sprbsh.cfr_renamed_2035(arg2);
        }
    }

    static {
        int[] nArray = new int[12];
        nArray[0] = -1;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = -1;
        nArray[4] = -2;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = -1;
        nArray[8] = -1;
        nArray[9] = -1;
        nArray[10] = -1;
        nArray[11] = -1;
        cfr_renamed_1 = nArray;
        int[] nArray2 = new int[24];
        nArray2[0] = 1;
        nArray2[1] = -2;
        nArray2[2] = 0;
        nArray2[3] = 2;
        nArray2[4] = 0;
        nArray2[5] = -2;
        nArray2[6] = 0;
        nArray2[7] = 2;
        nArray2[8] = 1;
        nArray2[9] = 0;
        nArray2[10] = 0;
        nArray2[11] = 0;
        nArray2[12] = -2;
        nArray2[13] = 1;
        nArray2[14] = 0;
        nArray2[15] = -2;
        nArray2[16] = -3;
        nArray2[17] = -1;
        nArray2[18] = -1;
        nArray2[19] = -1;
        nArray2[20] = -1;
        nArray2[21] = -1;
        nArray2[22] = -1;
        nArray2[23] = -1;
        cfr_renamed_0 = nArray2;
        int[] nArray3 = new int[17];
        nArray3[0] = -1;
        nArray3[1] = 1;
        nArray3[2] = -1;
        nArray3[3] = -3;
        nArray3[4] = -1;
        nArray3[5] = 1;
        nArray3[6] = -1;
        nArray3[7] = -3;
        nArray3[8] = -2;
        nArray3[9] = -1;
        nArray3[10] = -1;
        nArray3[11] = -1;
        nArray3[12] = 1;
        nArray3[13] = -2;
        nArray3[14] = -1;
        nArray3[15] = 1;
        nArray3[16] = 2;
        cfr_renamed_4 = nArray3;
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprvih.cfr_renamed_1678(12, arg0, 0, arg1);
            return;
        }
        int n = sprvih.cfr_renamed_1696(12, arg0, cfr_renamed_1, arg1);
        sprvih.cfr_renamed_1725(12, arg1, n);
    }
}


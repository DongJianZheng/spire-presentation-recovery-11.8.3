/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprthh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprxoh {
    private static final int[] cfr_renamed_91;
    private static final long cfr_renamed_0 = 0xFFFFFFFFL;
    private static final int cfr_renamed_1 = 0x7FFFFFFE;
    private static final int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 0x7FFFFFFE;
    public static final int[] cfr_renamed_4;

    static {
        int[] nArray = new int[4];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -3;
        cfr_renamed_4 = nArray;
        int[] nArray2 = new int[8];
        nArray2[0] = 1;
        nArray2[1] = 0;
        nArray2[2] = 0;
        nArray2[3] = 4;
        nArray2[4] = -2;
        nArray2[5] = -1;
        nArray2[6] = 3;
        nArray2[7] = -4;
        cfr_renamed_91 = nArray2;
        int[] nArray3 = new int[8];
        nArray3[0] = -1;
        nArray3[1] = -1;
        nArray3[2] = -1;
        nArray3[3] = -5;
        nArray3[4] = 1;
        nArray3[5] = 0;
        nArray3[6] = -4;
        nArray3[7] = 3;
        cfr_renamed_2 = nArray3;
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprvih.cfr_renamed_1678(4, arg0, 0, arg1);
            return;
        }
        int n = sprthh.cfr_renamed_1654(arg0, cfr_renamed_4, arg1);
        sprvih.cfr_renamed_1725(4, arg1, n);
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != sprxoh.cfr_renamed_1660(arg0)) {
            sprthh.cfr_renamed_1641(cfr_renamed_4, cfr_renamed_4, arg1);
            return;
        }
        sprthh.cfr_renamed_1641(cfr_renamed_4, arg0, arg1);
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprthh.cfr_renamed_1652(arg0);
        if (nArray[3] >>> 1 >= 0x7FFFFFFE && sprthh.cfr_renamed_1649(nArray, cfr_renamed_4)) {
            sprthh.cfr_renamed_1650(cfr_renamed_4, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprthh.cfr_renamed_1633();
        sprthh.cfr_renamed_1627(arg0, nArray);
        sprxoh.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1702(4, arg0, 0, arg1) != 0 || arg1[3] >>> 1 >= 0x7FFFFFFE && sprthh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprxoh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            sprxoh.cfr_renamed_9001(arg0, arg1);
        } while (0 != sprxoh.cfr_renamed_1660(arg1));
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprthh.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprxoh.cfr_renamed_2036(arg2);
        }
    }

    public static void cfr_renamed_2032(int arg0, int[] arg1) {
        int n = arg0;
        while (n != 0) {
            long l = (long)arg0 & 0xFFFFFFFFL;
            long l2 = ((long)arg1[0] & 0xFFFFFFFFL) + l;
            arg1[0] = (int)l2;
            if ((l2 >>= 32) != 0L) {
                arg1[1] = (int)(l2 += (long)arg1[1] & 0xFFFFFFFFL);
                l2 >>= 32;
                arg1[2] = (int)(l2 += (long)arg1[2] & 0xFFFFFFFFL);
                l2 >>= 32;
            }
            long l3 = l2 += ((long)arg1[3] & 0xFFFFFFFFL) + (l << 1);
            arg1[3] = (int)l3;
            l2 = l3 >> 32;
            n = (int)l2;
        }
        if (arg1[3] >>> 1 >= 0x7FFFFFFE && sprthh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprxoh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_4, arg0, arg1);
    }

    public static void cfr_renamed_2028(int[] arg0, int[] arg1) {
        long l = (long)arg0[0] & 0xFFFFFFFFL;
        long l2 = (long)arg0[1] & 0xFFFFFFFFL;
        long l3 = (long)arg0[2] & 0xFFFFFFFFL;
        long l4 = (long)arg0[3] & 0xFFFFFFFFL;
        long l5 = (long)arg0[4] & 0xFFFFFFFFL;
        long l6 = (long)arg0[5] & 0xFFFFFFFFL;
        long l7 = (long)arg0[6] & 0xFFFFFFFFL;
        long l8 = (long)arg0[7] & 0xFFFFFFFFL;
        l4 += l8;
        l3 += (l7 += l8 << 1);
        l2 += (l6 += l7 << 1);
        l4 += l5 << 1;
        int[] nArray = arg1;
        arg1[0] = (int)(l += (l5 += l6 << 1));
        nArray[1] = (int)(l2 += l >>> 32);
        arg1[2] = (int)(l3 += l2 >>> 32);
        nArray[3] = (int)(l4 += l3 >>> 32);
        sprxoh.cfr_renamed_2032((int)(l4 >>> 32), arg1);
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
        arg0[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) - 2L);
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if (sprmeh.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[7] >>> 1 >= 0x7FFFFFFE && sprmeh.cfr_renamed_1649(arg2, cfr_renamed_91)) {
            sprvih.cfr_renamed_1688(cfr_renamed_2.length, cfr_renamed_2, arg2);
        }
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1719(4, arg0, arg1) != 0 || arg1[3] >>> 1 >= 0x7FFFFFFE && sprthh.cfr_renamed_1649(arg1, cfr_renamed_4)) {
            sprxoh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if (sprthh.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[7] >>> 1 >= 0x7FFFFFFE && sprmeh.cfr_renamed_1649(arg2, cfr_renamed_91)) {
            sprvih.cfr_renamed_1688(cfr_renamed_2.length, cfr_renamed_2, arg2);
        }
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[16];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 4);
        } while (0 == sprvih.cfr_renamed_8550(4, arg1, cfr_renamed_4));
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 4) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(10, arg0, arg1, arg2) != 0) {
            sprvih.cfr_renamed_1687(cfr_renamed_2.length, cfr_renamed_2, arg2);
        }
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprthh.cfr_renamed_1633();
        sprthh.cfr_renamed_1627(arg0, nArray);
        sprxoh.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprthh.cfr_renamed_1627(arg2, nArray);
            sprxoh.cfr_renamed_2028(nArray, arg2);
        }
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprthh.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[3] >>> 1 >= 0x7FFFFFFE && sprthh.cfr_renamed_1649(arg2, cfr_renamed_4)) {
            sprxoh.cfr_renamed_2035(arg2);
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
        arg0[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + 2L);
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprthh.cfr_renamed_1633();
        sprthh.cfr_renamed_1636(arg0, arg1, nArray);
        sprxoh.cfr_renamed_2028(nArray, arg2);
    }
}


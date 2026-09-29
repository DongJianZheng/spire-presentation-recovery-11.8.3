/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprxxh {
    private static final int[] cfr_renamed_0;
    private static final int cfr_renamed_1 = Integer.MAX_VALUE;
    private static final int cfr_renamed_2 = Integer.MAX_VALUE;
    public static final int[] cfr_renamed_3;
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    public static void cfr_renamed_2037(int[] arg0, int[] arg1, int[] arg2) {
        if (sprmeh.cfr_renamed_1665(arg0, arg1, arg2) != 0 || arg2[15] >>> 1 >= Integer.MAX_VALUE && sprvih.cfr_renamed_1683(16, arg2, cfr_renamed_0)) {
            sprvih.cfr_renamed_1687(16, cfr_renamed_0, arg2);
        }
    }

    private static /* synthetic */ void cfr_renamed_2035(int[] arg0) {
        long l = ((long)arg0[0] & 0xFFFFFFFFL) + 1L;
        arg0[0] = (int)l;
        if ((l >>= 32) != 0L) {
            long l2 = l += (long)arg0[1] & 0xFFFFFFFFL;
            arg0[1] = (int)l2;
            l = l2 >> 32;
        }
        arg0[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) - 1L);
        l >>= 32;
        arg0[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) + 1L);
        if ((l >>= 32) != 0L) {
            long l3 = l += (long)arg0[4] & 0xFFFFFFFFL;
            arg0[4] = (int)l3;
            l = l3 >> 32;
            arg0[5] = (int)(l += (long)arg0[5] & 0xFFFFFFFFL);
            l >>= 32;
            arg0[6] = (int)(l += (long)arg0[6] & 0xFFFFFFFFL);
            l >>= 32;
        }
        arg0[7] = (int)(l += ((long)arg0[7] & 0xFFFFFFFFL) + 1L);
    }

    public static void cfr_renamed_9000(SecureRandom arg0, int[] arg1) {
        do {
            sprxxh.cfr_renamed_9001(arg0, arg1);
        } while (0 != sprxxh.cfr_renamed_1660(arg1));
    }

    public static void cfr_renamed_9001(SecureRandom arg0, int[] arg1) {
        byte[] byArray = new byte[32];
        do {
            arg0.nextBytes(byArray);
            sprpxe.cfr_renamed_438(byArray, 0, arg1, 0, 8);
        } while (0 == sprvih.cfr_renamed_8550(8, arg1, cfr_renamed_3));
    }

    public static void cfr_renamed_2031(int[] arg0, int[] arg1) {
        if ((arg0[0] & 1) == 0) {
            sprvih.cfr_renamed_1678(8, arg0, 0, arg1);
            return;
        }
        int n = sprmeh.cfr_renamed_1654(arg0, cfr_renamed_3, arg1);
        sprvih.cfr_renamed_1725(8, arg1, n);
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = 0;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = -2;
        cfr_renamed_3 = nArray;
        int[] nArray2 = new int[16];
        nArray2[0] = 1;
        nArray2[1] = 0;
        nArray2[2] = -2;
        nArray2[3] = 1;
        nArray2[4] = 1;
        nArray2[5] = -2;
        nArray2[6] = 0;
        nArray2[7] = 2;
        nArray2[8] = -2;
        nArray2[9] = -3;
        nArray2[10] = 3;
        nArray2[11] = -2;
        nArray2[12] = -1;
        nArray2[13] = -1;
        nArray2[14] = 0;
        nArray2[15] = -2;
        cfr_renamed_0 = nArray2;
    }

    public static int[] cfr_renamed_1652(BigInteger arg0) {
        int[] nArray = sprmeh.cfr_renamed_1652(arg0);
        if (nArray[7] >>> 1 >= Integer.MAX_VALUE && sprmeh.cfr_renamed_1649(nArray, cfr_renamed_3)) {
            sprmeh.cfr_renamed_1650(cfr_renamed_3, nArray);
        }
        return nArray;
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        if (0 != sprxxh.cfr_renamed_1660(arg0)) {
            sprmeh.cfr_renamed_1641(cfr_renamed_3, cfr_renamed_3, arg1);
            return;
        }
        sprmeh.cfr_renamed_1641(cfr_renamed_3, arg0, arg1);
    }

    public static void cfr_renamed_2033(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1696(16, arg0, arg1, arg2) != 0 || arg2[15] >>> 1 >= Integer.MAX_VALUE && sprvih.cfr_renamed_1683(16, arg2, cfr_renamed_0)) {
            sprvih.cfr_renamed_1687(16, cfr_renamed_0, arg2);
        }
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 8) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_2034(int[] arg0, int[] arg1, int[] arg2) {
        if (sprvih.cfr_renamed_1707(16, arg0, arg1, arg2) != 0) {
            sprvih.cfr_renamed_1688(16, cfr_renamed_0, arg2);
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
        arg0[2] = (int)(l += ((long)arg0[2] & 0xFFFFFFFFL) + 1L);
        l >>= 32;
        arg0[3] = (int)(l += ((long)arg0[3] & 0xFFFFFFFFL) - 1L);
        if ((l >>= 32) != 0L) {
            long l3 = l += (long)arg0[4] & 0xFFFFFFFFL;
            arg0[4] = (int)l3;
            l = l3 >> 32;
            arg0[5] = (int)(l += (long)arg0[5] & 0xFFFFFFFFL);
            l >>= 32;
            arg0[6] = (int)(l += (long)arg0[6] & 0xFFFFFFFFL);
            l >>= 32;
        }
        arg0[7] = (int)(l += ((long)arg0[7] & 0xFFFFFFFFL) - 1L);
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
            arg1[2] = (int)(l += ((long)arg1[2] & 0xFFFFFFFFL) - l2);
            l >>= 32;
            arg1[3] = (int)(l += ((long)arg1[3] & 0xFFFFFFFFL) + l2);
            if ((l >>= 32) != 0L) {
                long l5 = l += (long)arg1[4] & 0xFFFFFFFFL;
                arg1[4] = (int)l5;
                l = l5 >> 32;
                arg1[5] = (int)(l += (long)arg1[5] & 0xFFFFFFFFL);
                l >>= 32;
                arg1[6] = (int)(l += (long)arg1[6] & 0xFFFFFFFFL);
                l >>= 32;
            }
            long l6 = l += ((long)arg1[7] & 0xFFFFFFFFL) + l2;
            arg1[7] = (int)l6;
            l = l6 >> 32;
        }
        if (l != 0L || arg1[7] >>> 1 >= Integer.MAX_VALUE && sprmeh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprxxh.cfr_renamed_2035(arg1);
        }
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
        long l9 = l + l2;
        long l10 = l3 + l4;
        long l11 = l5 + l8;
        long l12 = l6 + l7;
        long l13 = l12 + (l8 << 1);
        long l14 = l9 + l12;
        long l15 = l10 + l11 + l14;
        long l16 = 0L;
        l16 = 0L + (((long)arg0[0] & 0xFFFFFFFFL) + l15 + l6 + l7 + l8);
        int[] nArray = arg1;
        arg1[0] = (int)l16;
        l16 >>= 32;
        arg1[1] = (int)(l16 += ((long)arg0[1] & 0xFFFFFFFFL) + l15 - l + l7 + l8);
        l16 >>= 32;
        arg1[2] = (int)(l16 += ((long)arg0[2] & 0xFFFFFFFFL) - l14);
        l16 >>= 32;
        arg1[3] = (int)(l16 += ((long)arg0[3] & 0xFFFFFFFFL) + l15 - l2 - l3 + l6);
        l16 >>= 32;
        nArray[4] = (int)(l16 += ((long)arg0[4] & 0xFFFFFFFFL) + l15 - l10 - l + l7);
        l16 >>= 32;
        arg1[5] = (int)(l16 += ((long)arg0[5] & 0xFFFFFFFFL) + l13 + l3);
        l16 >>= 32;
        nArray[6] = (int)(l16 += ((long)arg0[6] & 0xFFFFFFFFL) + l4 + l7 + l8);
        l16 >>= 32;
        nArray[7] = (int)(l16 += ((long)arg0[7] & 0xFFFFFFFFL) + l15 + l13 + l5);
        sprxxh.cfr_renamed_2032((int)(l16 >>= 32), arg1);
    }

    public static void cfr_renamed_2025(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1719(8, arg0, arg1) != 0 || arg1[7] >>> 1 >= Integer.MAX_VALUE && sprmeh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprxxh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_2024(int[] arg0, int[] arg1) {
        if (sprvih.cfr_renamed_1702(8, arg0, 0, arg1) != 0 || arg1[7] >>> 1 >= Integer.MAX_VALUE && sprmeh.cfr_renamed_1649(arg1, cfr_renamed_3)) {
            sprxxh.cfr_renamed_2035(arg1);
        }
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        sprqlh.cfr_renamed_8588(cfr_renamed_3, arg0, arg1);
    }

    public static void cfr_renamed_2021(int[] arg0, int[] arg1, int[] arg2) {
        if (sprmeh.cfr_renamed_1641(arg0, arg1, arg2) != 0) {
            sprxxh.cfr_renamed_2036(arg2);
        }
    }

    public static void cfr_renamed_1627(int[] arg0, int[] arg1) {
        int[] nArray = sprmeh.cfr_renamed_1633();
        sprmeh.cfr_renamed_1627(arg0, nArray);
        sprxxh.cfr_renamed_2028(nArray, arg1);
    }

    public static void cfr_renamed_2022(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprmeh.cfr_renamed_1633();
        sprmeh.cfr_renamed_1636(arg0, arg1, nArray);
        sprxxh.cfr_renamed_2028(nArray, arg2);
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        if (sprmeh.cfr_renamed_1654(arg0, arg1, arg2) != 0 || arg2[7] >>> 1 >= Integer.MAX_VALUE && sprmeh.cfr_renamed_1649(arg2, cfr_renamed_3)) {
            sprxxh.cfr_renamed_2035(arg2);
        }
    }

    public static void cfr_renamed_2026(int[] arg0, int arg1, int[] arg2) {
        int[] nArray = sprmeh.cfr_renamed_1633();
        sprmeh.cfr_renamed_1627(arg0, nArray);
        sprxxh.cfr_renamed_2028(nArray, arg2);
        while (--arg1 > 0) {
            sprmeh.cfr_renamed_1627(arg2, nArray);
            sprxxh.cfr_renamed_2028(nArray, arg2);
        }
    }
}


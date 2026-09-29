/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqlh;

public abstract class sprneh {
    private static final int[] cfr_renamed_91;
    public static final int cfr_renamed_0 = 10;
    private static final int cfr_renamed_1 = 0x1FFFFFF;
    private static final int cfr_renamed_2 = 0xFFFFFF;
    private static final int cfr_renamed_3 = 0x3FFFFFF;
    private static final int[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8871(int[] nArray, int n, int[] nArray2) {
        void arg2;
        void arg1;
        int[] arg0;
        sprneh.cfr_renamed_8883(arg0, (int)arg1, (int[])arg2, 0);
        sprneh.cfr_renamed_8883(arg0, (int)(arg1 + 4), (int[])arg2, 5);
        nArray2[9] = nArray2[9] & 0xFFFFFF;
    }

    public static void cfr_renamed_8758(int[] arg0) {
        int n;
        arg0[0] = 1;
        int n2 = n = 1;
        while (n2 < 10) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8798(int[] nArray, int n, byte[] byArray, int n2) {
        void arg3;
        void arg2;
        void arg1;
        int[] arg0;
        sprneh.cfr_renamed_8884(arg0, (int)arg1, (byte[])arg2, (int)arg3);
        sprneh.cfr_renamed_8884(arg0, n + 5, (byte[])arg2, (int)(arg3 + 16));
    }

    public static int[] cfr_renamed_8787(int arg0) {
        return new int[10 * arg0];
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8870(int[] nArray, int[] nArray2, int n) {
        void arg2;
        void arg1;
        int[] arg0;
        sprneh.cfr_renamed_8885(arg0, 0, (int[])arg1, (int)arg2);
        sprneh.cfr_renamed_8885(arg0, 5, (int[])arg1, (int)(arg2 + 4));
    }

    public static int cfr_renamed_1659(int[] arg0) {
        int n;
        int n2 = arg0[0] ^ 1;
        int n3 = n = 1;
        while (n3 < 10) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static int cfr_renamed_1660(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 10) {
            n2 |= arg0[n++];
            n3 = n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
    }

    public static void cfr_renamed_1654(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            int n3 = n;
            int n4 = arg0[n] + arg1[n3];
            arg2[n3] = n4;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_1643(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    public static void cfr_renamed_8744(int[] arg0, int arg1, int[] arg2) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = arg0[4];
        int n6 = arg0[5];
        int n7 = arg0[6];
        int n8 = arg0[7];
        int n9 = arg0[8];
        int n10 = arg0[9];
        long l = (long)n3 * (long)arg1;
        n3 = (int)l & 0x1FFFFFF;
        l >>= 25;
        long l2 = (long)n5 * (long)arg1;
        n5 = (int)l2 & 0x1FFFFFF;
        l2 >>= 25;
        long l3 = (long)n8 * (long)arg1;
        n8 = (int)l3 & 0x1FFFFFF;
        l3 >>= 25;
        long l4 = (long)n10 * (long)arg1;
        n10 = (int)l4 & 0x1FFFFFF;
        l4 >>= 25;
        l4 *= 38L;
        int[] nArray = arg2;
        int[] nArray2 = arg2;
        int[] nArray3 = arg2;
        arg2[0] = (int)(l4 += (long)n * (long)arg1) & 0x3FFFFFF;
        l4 >>= 26;
        arg2[5] = (int)(l2 += (long)n6 * (long)arg1) & 0x3FFFFFF;
        l2 >>= 26;
        nArray2[1] = (int)(l4 += (long)n2 * (long)arg1) & 0x3FFFFFF;
        nArray3[3] = (int)(l += (long)n4 * (long)arg1) & 0x3FFFFFF;
        nArray2[6] = (int)(l2 += (long)n7 * (long)arg1) & 0x3FFFFFF;
        nArray3[8] = (int)(l3 += (long)n9 * (long)arg1) & 0x3FFFFFF;
        nArray[2] = n3 + (int)(l4 >>= 26);
        arg2[4] = n5 + (int)(l >>= 26);
        nArray[7] = n8 + (int)(l2 >>= 26);
        nArray[9] = n10 + (int)(l3 >>= 26);
    }

    public static boolean cfr_renamed_8760(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray;
        int[] nArray2 = sprneh.cfr_renamed_1631();
        int[] nArray3 = nArray = sprneh.cfr_renamed_1631();
        sprneh.cfr_renamed_1636(arg0, arg1, nArray2);
        sprneh.cfr_renamed_8743(arg1, nArray);
        sprneh.cfr_renamed_1636(nArray2, nArray3, nArray2);
        int[] nArray4 = nArray;
        sprneh.cfr_renamed_8743(nArray, nArray4);
        sprneh.cfr_renamed_1636(nArray, nArray2, nArray4);
        int[] nArray5 = sprneh.cfr_renamed_1631();
        int[] nArray6 = sprneh.cfr_renamed_1631();
        sprneh.cfr_renamed_8886(nArray3, nArray5, nArray6);
        int[] nArray7 = nArray6;
        sprneh.cfr_renamed_1636(nArray6, nArray2, nArray7);
        int[] nArray8 = sprneh.cfr_renamed_1631();
        sprneh.cfr_renamed_8743(nArray7, nArray8);
        int[] nArray9 = nArray5;
        sprneh.cfr_renamed_1636(nArray8, arg1, nArray8);
        sprneh.cfr_renamed_1641(nArray8, arg0, nArray9);
        sprneh.cfr_renamed_8746(nArray9);
        if (sprneh.cfr_renamed_8761(nArray5)) {
            sprneh.cfr_renamed_8546(nArray6, 0, arg2, 0);
            return true;
        }
        sprneh.cfr_renamed_1654(nArray8, arg0, nArray5);
        sprneh.cfr_renamed_8746(nArray5);
        if (sprneh.cfr_renamed_8761(nArray5)) {
            sprneh.cfr_renamed_1636(nArray6, cfr_renamed_91, arg2);
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8868(int[] nArray, byte[] byArray) {
        void arg1;
        int[] arg0;
        sprneh.cfr_renamed_8884(arg0, 0, (byte[])arg1, 0);
        sprneh.cfr_renamed_8884(arg0, 5, (byte[])arg1, 16);
    }

    public static boolean cfr_renamed_8812(int[] arg0, int[] arg1) {
        return 0 != sprneh.cfr_renamed_549(arg0, arg1);
    }

    public static boolean cfr_renamed_8761(int[] arg0) {
        return 0 != sprneh.cfr_renamed_1660(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8720(byte[] byArray, int[] nArray) {
        void arg1;
        byte[] arg0;
        sprneh.cfr_renamed_8887(arg0, 0, (int[])arg1, 0);
        sprneh.cfr_renamed_8887(arg0, 16, (int[])arg1, 5);
        nArray[9] = nArray[9] & 0xFFFFFF;
    }

    private static /* synthetic */ void cfr_renamed_8887(byte[] arg0, int arg1, int[] arg2, int arg3) {
        int n = sprneh.cfr_renamed_8727(arg0, arg1 + 0);
        int n2 = sprneh.cfr_renamed_8727(arg0, arg1 + 4);
        int n3 = sprneh.cfr_renamed_8727(arg0, arg1 + 8);
        int n4 = sprneh.cfr_renamed_8727(arg0, arg1 + 12);
        int n5 = arg3;
        arg2[arg3 + 0] = n & 0x3FFFFFF;
        arg2[arg3 + 1] = (n2 << 6 | n >>> 26) & 0x3FFFFFF;
        arg2[n5 + 2] = (n3 << 12 | n2 >>> 20) & 0x1FFFFFF;
        arg2[n5 + 3] = (n4 << 19 | n3 >>> 13) & 0x3FFFFFF;
        arg2[arg3 + 4] = n4 >>> 7;
    }

    public static void cfr_renamed_8759(int[] arg0) {
        arg0[0] = arg0[0] + 1;
    }

    public static boolean cfr_renamed_8872(int[] arg0) {
        return 0 != sprneh.cfr_renamed_1659(arg0);
    }

    public static void cfr_renamed_1641(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            int n3 = n;
            int n4 = arg0[n] - arg1[n3];
            arg2[n3] = n4;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_2027(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            int n3 = n++;
            arg1[n3] = -arg0[n3];
            n2 = n;
        }
    }

    public static void cfr_renamed_8873(int[] arg0, int arg1) {
        int n = arg1;
        arg0[n] = arg0[n] + 1;
    }

    public static void cfr_renamed_8746(int[] arg0) {
        int n = arg0[9] >>> 23 & 1;
        sprneh.cfr_renamed_8867(arg0, n);
        sprneh.cfr_renamed_8867(arg0, -n);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8799(int[] nArray, byte[] byArray, int n) {
        void arg2;
        void arg1;
        int[] arg0;
        sprneh.cfr_renamed_8884(arg0, 0, (byte[])arg1, (int)arg2);
        sprneh.cfr_renamed_8884(arg0, 5, (byte[])arg1, (int)(arg2 + 16));
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_1636(int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        int[] arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        void v2 = arg1;
        int n = arg0[0];
        void var4_4 = v2[0];
        int n2 = arg0[1];
        void var6_6 = v2[1];
        int n3 = arg0[2];
        void var8_8 = arg1[2];
        int n4 = arg0[3];
        void var10_10 = v1[3];
        int n5 = arg0[4];
        void var12_12 = v1[4];
        int n6 = arg0[5];
        void var14_14 = arg1[5];
        int n7 = arg0[6];
        void var16_16 = v0[6];
        int n8 = arg0[7];
        void var18_18 = v0[7];
        int n9 = arg0[8];
        int n10 = nArray2[8];
        int n11 = arg0[9];
        int n12 = nArray2[9];
        long l = (long)n * (long)var4_4;
        long l2 = (long)n * (long)var6_6 + (long)n2 * (long)var4_4;
        long l3 = (long)n * (long)var8_8 + (long)n2 * (long)var6_6 + (long)n3 * (long)var4_4;
        long l4 = (long)n2 * (long)var8_8 + (long)n3 * (long)var6_6;
        l4 <<= 1;
        l4 += (long)n * (long)var10_10 + (long)n4 * (long)var4_4;
        long l5 = (long)n3 * (long)var8_8;
        l5 <<= 1;
        l5 += (long)n * (long)var12_12 + (long)n2 * (long)var10_10 + (long)n4 * (long)var6_6 + (long)n5 * (long)var4_4;
        long l6 = (long)n2 * (long)var12_12 + (long)n3 * (long)var10_10 + (long)n4 * (long)var8_8 + (long)n5 * (long)var6_6;
        l6 <<= 1;
        long l7 = (long)n3 * (long)var12_12 + (long)n5 * (long)var8_8;
        l7 <<= 1;
        l7 += (long)n4 * (long)var10_10;
        long l8 = (long)n4 * (long)var12_12 + (long)n5 * (long)var10_10;
        long l9 = (long)n5 * (long)var12_12;
        l9 <<= 1;
        long l10 = (long)n6 * (long)var14_14;
        long l11 = (long)n6 * (long)var16_16 + (long)n7 * (long)var14_14;
        long l12 = (long)n6 * (long)var18_18 + (long)n7 * (long)var16_16 + (long)n8 * (long)var14_14;
        long l13 = (long)n7 * (long)var18_18 + (long)n8 * (long)var16_16;
        l13 <<= 1;
        l13 += (long)n6 * (long)n10 + (long)n9 * (long)var14_14;
        long l14 = (long)n8 * (long)var18_18;
        l14 <<= 1;
        l14 += (long)n6 * (long)n12 + (long)n7 * (long)n10 + (long)n9 * (long)var16_16 + (long)n11 * (long)var14_14;
        long l15 = (long)n7 * (long)n12 + (long)n8 * (long)n10 + (long)n9 * (long)var18_18 + (long)n11 * (long)var16_16;
        long l16 = (long)n8 * (long)n12 + (long)n11 * (long)var18_18;
        l16 <<= 1;
        long l17 = (long)n9 * (long)n12 + (long)n11 * (long)n10;
        long l18 = (long)n11 * (long)n12;
        l -= l15 * 76L;
        l2 -= (l16 += (long)n9 * (long)n10) * 38L;
        l3 -= l17 * 38L;
        l4 -= l18 * 76L;
        l6 -= l10;
        l7 -= l11;
        l8 -= l12;
        l9 -= l13;
        n += n6;
        var4_4 += var14_14;
        n2 += n7;
        var6_6 += var16_16;
        n3 += n8;
        var8_8 += var18_18;
        n4 += n9;
        var10_10 += n10;
        n5 += n11;
        var12_12 += n12;
        long l19 = (long)n * (long)var4_4;
        long l20 = (long)n * (long)var6_6 + (long)n2 * (long)var4_4;
        long l21 = (long)n * (long)var8_8 + (long)n2 * (long)var6_6 + (long)n3 * (long)var4_4;
        long l22 = (long)n2 * (long)var8_8 + (long)n3 * (long)var6_6;
        l22 <<= 1;
        l22 += (long)n * (long)var10_10 + (long)n4 * (long)var4_4;
        long l23 = (long)n3 * (long)var8_8;
        l23 <<= 1;
        l23 += (long)n * (long)var12_12 + (long)n2 * (long)var10_10 + (long)n4 * (long)var6_6 + (long)n5 * (long)var4_4;
        long l24 = (long)n2 * (long)var12_12 + (long)n3 * (long)var10_10 + (long)n4 * (long)var8_8 + (long)n5 * (long)var6_6;
        l24 <<= 1;
        long l25 = (long)n3 * (long)var12_12 + (long)n5 * (long)var8_8;
        l25 <<= 1;
        l25 += (long)n4 * (long)var10_10;
        long l26 = (long)n4 * (long)var12_12 + (long)n5 * (long)var10_10;
        long l27 = (long)n5 * (long)var12_12;
        l27 <<= 1;
        long l28 = l9 + (l22 - l4);
        int n13 = (int)l28 & 0x3FFFFFF;
        l28 >>= 26;
        int n14 = (int)(l28 += l23 - l5 - l14) & 0x1FFFFFF;
        l28 >>= 25;
        l28 = l + (l28 + l24 - l6) * 38L;
        void v3 = arg2;
        void v4 = arg2;
        void v5 = arg2;
        v5[0] = (int)l28 & 0x3FFFFFF;
        l28 >>= 26;
        v5[1] = (int)(l28 += l2 + (l25 - l7) * 38L) & 0x3FFFFFF;
        l28 >>= 26;
        v4[2] = (int)(l28 += l3 + (l26 - l8) * 38L) & 0x1FFFFFF;
        l28 >>= 25;
        v4[3] = (int)(l28 += l4 + (l27 - l9) * 38L) & 0x3FFFFFF;
        l28 >>= 26;
        v4[4] = (int)(l28 += l5 + l14 * 38L) & 0x1FFFFFF;
        l28 >>= 25;
        v4[5] = (int)(l28 += l6 + (l19 - l)) & 0x3FFFFFF;
        l28 >>= 26;
        v3[6] = (int)(l28 += l7 + (l20 - l2)) & 0x3FFFFFF;
        l28 >>= 26;
        v3[7] = (int)(l28 += l8 + (l21 - l3)) & 0x1FFFFFF;
        l28 >>= 25;
        v3[8] = (int)(l28 += (long)n13) & 0x3FFFFFF;
        v3[9] = n14 + (int)(l28 >>= 26);
    }

    public static void cfr_renamed_8743(int[] arg0, int[] arg1) {
        int n = arg0[0];
        int n2 = arg0[1];
        int n3 = arg0[2];
        int n4 = arg0[3];
        int n5 = arg0[4];
        int n6 = arg0[5];
        int n7 = arg0[6];
        int n8 = arg0[7];
        int n9 = arg0[8];
        int n10 = arg0[9];
        int n11 = n2 * 2;
        int n12 = n3 * 2;
        int n13 = n4 * 2;
        int n14 = n5 * 2;
        long l = (long)n * (long)n;
        long l2 = (long)n * (long)n11;
        long l3 = (long)n * (long)n12 + (long)n2 * (long)n2;
        long l4 = (long)n11 * (long)n12 + (long)n * (long)n13;
        long l5 = (long)n3 * (long)n12 + (long)n * (long)n14 + (long)n2 * (long)n13;
        long l6 = (long)n11 * (long)n14 + (long)n12 * (long)n13;
        long l7 = (long)n12 * (long)n14 + (long)n4 * (long)n4;
        long l8 = (long)n4 * (long)n14;
        long l9 = (long)n5 * (long)n14;
        int n15 = n7 * 2;
        int n16 = n8 * 2;
        int n17 = n9 * 2;
        int n18 = n10 * 2;
        long l10 = (long)n6 * (long)n6;
        long l11 = (long)n6 * (long)n15;
        long l12 = (long)n6 * (long)n16 + (long)n7 * (long)n7;
        long l13 = (long)n15 * (long)n16 + (long)n6 * (long)n17;
        long l14 = (long)n8 * (long)n16 + (long)n6 * (long)n18 + (long)n7 * (long)n17;
        long l15 = (long)n15 * (long)n18 + (long)n16 * (long)n17;
        long l16 = (long)n16 * (long)n18 + (long)n9 * (long)n9;
        long l17 = (long)n9 * (long)n18;
        long l18 = (long)n10 * (long)n18;
        l -= l15 * 38L;
        l2 -= l16 * 38L;
        l3 -= l17 * 38L;
        l4 -= l18 * 38L;
        l6 -= l10;
        l7 -= l11;
        l8 -= l12;
        l9 -= l13;
        n11 = (n2 += n7) * 2;
        n12 = (n3 += n8) * 2;
        n13 = (n4 += n9) * 2;
        n14 = (n5 += n10) * 2;
        long l19 = (long)(n += n6) * (long)n;
        long l20 = (long)n * (long)n11;
        long l21 = (long)n * (long)n12 + (long)n2 * (long)n2;
        long l22 = (long)n11 * (long)n12 + (long)n * (long)n13;
        long l23 = (long)n3 * (long)n12 + (long)n * (long)n14 + (long)n2 * (long)n13;
        long l24 = (long)n11 * (long)n14 + (long)n12 * (long)n13;
        long l25 = (long)n12 * (long)n14 + (long)n4 * (long)n4;
        long l26 = (long)n4 * (long)n14;
        long l27 = (long)n5 * (long)n14;
        long l28 = l9 + (l22 - l4);
        int n19 = (int)l28 & 0x3FFFFFF;
        l28 >>= 26;
        int n20 = (int)(l28 += l23 - l5 - l14) & 0x1FFFFFF;
        l28 >>= 25;
        l28 = l + (l28 + l24 - l6) * 38L;
        int[] nArray = arg1;
        int[] nArray2 = arg1;
        int[] nArray3 = arg1;
        arg1[0] = (int)l28 & 0x3FFFFFF;
        l28 >>= 26;
        arg1[1] = (int)(l28 += l2 + (l25 - l7) * 38L) & 0x3FFFFFF;
        l28 >>= 26;
        nArray2[2] = (int)(l28 += l3 + (l26 - l8) * 38L) & 0x1FFFFFF;
        l28 >>= 25;
        nArray3[3] = (int)(l28 += l4 + (l27 - l9) * 38L) & 0x3FFFFFF;
        l28 >>= 26;
        nArray2[4] = (int)(l28 += l5 + l14 * 38L) & 0x1FFFFFF;
        l28 >>= 25;
        nArray3[5] = (int)(l28 += l6 + (l19 - l)) & 0x3FFFFFF;
        l28 >>= 26;
        nArray[6] = (int)(l28 += l7 + (l20 - l2)) & 0x3FFFFFF;
        l28 >>= 26;
        arg1[7] = (int)(l28 += l8 + (l21 - l3)) & 0x1FFFFFF;
        l28 >>= 25;
        nArray[8] = (int)(l28 += (long)n19) & 0x3FFFFFF;
        nArray[9] = n20 + (int)(l28 >>= 26);
    }

    public static void cfr_renamed_8838(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            int n3 = arg0[n];
            int n4 = arg1[n];
            arg2[n] = n3 + n4;
            arg3[n++] = n3 - n4;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8876(byte[] byArray, int n, int[] nArray) {
        void arg2;
        void arg1;
        byte[] arg0;
        sprneh.cfr_renamed_8887(arg0, (int)arg1, (int[])arg2, 0);
        sprneh.cfr_renamed_8887(arg0, (int)(arg1 + 16), (int[])arg2, 5);
        nArray[9] = nArray[9] & 0xFFFFFF;
    }

    public static void cfr_renamed_8748(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = nArray[0];
        int n2 = nArray2[1];
        int n3 = nArray[2];
        int n4 = nArray2[3];
        int n5 = nArray[4];
        int n6 = nArray2[5];
        int n7 = nArray[6];
        int n8 = nArray2[7];
        int n9 = nArray[8];
        int n10 = nArray2[9];
        n3 += n2 >> 26;
        n2 &= 0x3FFFFFF;
        n5 += n4 >> 26;
        n4 &= 0x3FFFFFF;
        n8 += n7 >> 26;
        n7 &= 0x3FFFFFF;
        n10 += n9 >> 26;
        n9 &= 0x3FFFFFF;
        n4 += n3 >> 25;
        n3 &= 0x1FFFFFF;
        n6 += n5 >> 25;
        n5 &= 0x1FFFFFF;
        n9 += n8 >> 25;
        n8 &= 0x1FFFFFF;
        n += (n10 >> 25) * 38;
        n10 &= 0x1FFFFFF;
        n2 += n >> 26;
        n &= 0x3FFFFFF;
        n7 += n6 >> 26;
        n6 &= 0x3FFFFFF;
        n3 += n2 >> 26;
        n2 &= 0x3FFFFFF;
        n5 += n4 >> 26;
        n4 &= 0x3FFFFFF;
        n8 += n7 >> 26;
        n7 &= 0x3FFFFFF;
        n10 += n9 >> 26;
        n9 &= 0x3FFFFFF;
        nArray[0] = n;
        nArray2[1] = n2;
        nArray[2] = n3;
        nArray2[3] = n4;
        nArray[4] = n5;
        nArray2[5] = n6;
        nArray[6] = n7;
        nArray2[7] = n8;
        nArray[8] = n9;
        nArray2[9] = n10;
    }

    public static void cfr_renamed_8851(int arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = 0 - arg0;
        int n3 = n = 0;
        while (n3 < 10) {
            int n4 = arg1[n];
            int n5 = arg2[n];
            int n6 = n2 & (n4 ^ n5);
            arg1[n] = n4 ^ n6;
            arg2[n++] = n5 ^ n6;
            n3 = n;
        }
    }

    private static /* synthetic */ void cfr_renamed_8886(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5 = nArray4 = arg1;
        int[] nArray6 = arg0;
        sprneh.cfr_renamed_8743(nArray6, nArray4);
        sprneh.cfr_renamed_1636(nArray6, nArray5, nArray5);
        int[] nArray7 = nArray3 = sprneh.cfr_renamed_1631();
        sprneh.cfr_renamed_8743(nArray4, nArray7);
        sprneh.cfr_renamed_1636(arg0, nArray7, nArray3);
        int[] nArray8 = nArray3;
        sprneh.cfr_renamed_8875(nArray3, 2, nArray8);
        sprneh.cfr_renamed_1636(nArray4, nArray8, nArray8);
        int[] nArray9 = sprneh.cfr_renamed_1631();
        sprneh.cfr_renamed_8875(nArray8, 5, nArray9);
        sprneh.cfr_renamed_1636(nArray8, nArray9, nArray9);
        int[] nArray10 = nArray2 = sprneh.cfr_renamed_1631();
        sprneh.cfr_renamed_8875(nArray9, 5, nArray10);
        sprneh.cfr_renamed_1636(nArray8, nArray2, nArray10);
        int[] nArray11 = nArray8;
        sprneh.cfr_renamed_8875(nArray2, 10, nArray11);
        sprneh.cfr_renamed_1636(nArray9, nArray11, nArray11);
        int[] nArray12 = nArray9;
        sprneh.cfr_renamed_8875(nArray11, 25, nArray12);
        sprneh.cfr_renamed_1636(nArray11, nArray12, nArray12);
        int[] nArray13 = nArray2;
        int[] nArray14 = nArray12;
        sprneh.cfr_renamed_8875(nArray14, 25, nArray13);
        sprneh.cfr_renamed_1636(nArray11, nArray13, nArray13);
        int[] nArray15 = nArray = nArray11;
        sprneh.cfr_renamed_8875(nArray13, 50, nArray15);
        sprneh.cfr_renamed_1636(nArray14, nArray, nArray15);
        int[] nArray16 = nArray12;
        int[] nArray17 = nArray;
        sprneh.cfr_renamed_8875(nArray17, 125, nArray16);
        sprneh.cfr_renamed_1636(nArray17, nArray16, nArray16);
        int[] nArray18 = nArray;
        sprneh.cfr_renamed_8875(nArray16, 2, nArray18);
        sprneh.cfr_renamed_1636(nArray18, arg0, arg2);
    }

    public static void cfr_renamed_8805(int[] arg0, int[] arg1) {
        int[] nArray = sprneh.cfr_renamed_1631();
        int[] nArray2 = new int[8];
        sprneh.cfr_renamed_8546(arg0, 0, nArray, 0);
        sprneh.cfr_renamed_8746(nArray);
        sprneh.cfr_renamed_8870(nArray, nArray2, 0);
        sprqlh.cfr_renamed_5235(cfr_renamed_4, nArray2, nArray2);
        sprneh.cfr_renamed_8871(nArray2, 0, arg1);
    }

    private static /* synthetic */ void cfr_renamed_8867(int[] arg0, int arg1) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = nArray[9];
        int n2 = n & 0xFFFFFF;
        n = (n >> 24) + arg1;
        long l = n * 19;
        nArray2[0] = (int)(l += (long)arg0[0]) & 0x3FFFFFF;
        l >>= 26;
        arg0[1] = (int)(l += (long)arg0[1]) & 0x3FFFFFF;
        l >>= 26;
        nArray[2] = (int)(l += (long)arg0[2]) & 0x1FFFFFF;
        l >>= 25;
        nArray2[3] = (int)(l += (long)arg0[3]) & 0x3FFFFFF;
        l >>= 26;
        nArray[4] = (int)(l += (long)arg0[4]) & 0x1FFFFFF;
        l >>= 25;
        nArray2[5] = (int)(l += (long)arg0[5]) & 0x3FFFFFF;
        l >>= 26;
        nArray[6] = (int)(l += (long)arg0[6]) & 0x3FFFFFF;
        l >>= 26;
        nArray2[7] = (int)(l += (long)arg0[7]) & 0x1FFFFFF;
        l >>= 25;
        nArray[8] = (int)(l += (long)arg0[8]) & 0x3FFFFFF;
        nArray2[9] = n2 + (int)(l >>= 26);
    }

    public static void cfr_renamed_8875(int[] arg0, int arg1, int[] arg2) {
        sprneh.cfr_renamed_8743(arg0, arg2);
        while (--arg1 > 0) {
            sprneh.cfr_renamed_8743(arg2, arg2);
        }
    }

    private static /* synthetic */ void cfr_renamed_8884(int[] arg0, int arg1, byte[] arg2, int arg3) {
        int n = arg0[arg1 + 0];
        int n2 = arg0[arg1 + 1];
        int n3 = arg0[arg1 + 2];
        int n4 = arg0[arg1 + 3];
        int n5 = arg0[arg1 + 4];
        sprneh.cfr_renamed_8732(n | n2 << 26, arg2, arg3 + 0);
        sprneh.cfr_renamed_8732(n2 >>> 6 | n3 << 20, arg2, arg3 + 4);
        sprneh.cfr_renamed_8732(n3 >>> 12 | n4 << 13, arg2, arg3 + 8);
        sprneh.cfr_renamed_8732(n4 >>> 19 | n5 << 7, arg2, arg3 + 12);
    }

    public static void cfr_renamed_8546(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            int n3 = arg3 + n;
            int n4 = arg0[arg1 + n];
            arg2[n3] = n4;
            n2 = ++n;
        }
    }

    public static int cfr_renamed_549(int[] arg0, int[] arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 10) {
            int n4 = arg0[n];
            int n5 = arg1[n];
            n2 |= n4 ^ n5;
            n3 = ++n;
        }
        n2 = n2 >>> 1 | n2 & 1;
        return n2 - 1 >> 31;
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
        int[] nArray2 = new int[10];
        nArray2[0] = 34513072;
        nArray2[1] = 59165138;
        nArray2[2] = 4688974;
        nArray2[3] = 3500415;
        nArray2[4] = 6194736;
        nArray2[5] = 33281959;
        nArray2[6] = 54535759;
        nArray2[7] = 32551604;
        nArray2[8] = 163342;
        nArray2[9] = 5703241;
        cfr_renamed_91 = nArray2;
    }

    public static void cfr_renamed_8734(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            int n3 = arg3[arg4 + n];
            int n4 = n3 ^ arg1[arg2 + n];
            int n5 = arg4 + n;
            arg3[n5] = n3 ^= n4 & arg0;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_8788(int[] arg0, int[] arg1) {
        int[] nArray = sprneh.cfr_renamed_1631();
        int[] nArray2 = new int[8];
        sprneh.cfr_renamed_8546(arg0, 0, nArray, 0);
        sprneh.cfr_renamed_8746(nArray);
        sprneh.cfr_renamed_8870(nArray, nArray2, 0);
        sprqlh.cfr_renamed_5233(cfr_renamed_4, nArray2, nArray2);
        sprneh.cfr_renamed_8871(nArray2, 0, arg1);
    }

    public static int[] cfr_renamed_1631() {
        return new int[10];
    }

    public static void cfr_renamed_8767(int arg0, int[] arg1) {
        int n;
        int n2 = 0 - arg0;
        int n3 = n = 0;
        while (n3 < 10) {
            arg1[++n] = (arg1[n] ^ n2) - n2;
            n3 = n;
        }
    }

    private static /* synthetic */ void cfr_renamed_8885(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n = arg0[arg1 + 0];
        int n2 = arg0[arg1 + 1];
        int n3 = arg0[arg1 + 2];
        int n4 = arg0[arg1 + 3];
        int n5 = arg0[arg1 + 4];
        int n6 = arg3;
        arg2[arg3 + 0] = n | n2 << 26;
        arg2[n6 + 1] = n2 >>> 6 | n3 << 20;
        arg2[n6 + 2] = n3 >>> 12 | n4 << 13;
        arg2[arg3 + 3] = n4 >>> 19 | n5 << 7;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8877(byte[] byArray, int n, int[] nArray, int n2) {
        void arg3;
        void arg2;
        void arg1;
        byte[] arg0;
        sprneh.cfr_renamed_8887(arg0, (int)arg1, (int[])arg2, (int)arg3);
        sprneh.cfr_renamed_8887(arg0, (int)(arg1 + 16), (int[])arg2, (int)(arg3 + 5));
        void v0 = arg3 + 9;
        nArray[v0] = nArray[v0] & 0xFFFFFF;
    }

    private static /* synthetic */ int cfr_renamed_8727(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16 | arg0[++arg1] << 24;
        return n4;
    }

    public static void cfr_renamed_8745(int[] arg0) {
        arg0[0] = arg0[0] - 1;
    }

    private static /* synthetic */ void cfr_renamed_8732(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2] = (byte)(arg0 >>> 24);
    }

    private static /* synthetic */ void cfr_renamed_8883(int[] arg0, int arg1, int[] arg2, int arg3) {
        int n = arg0[arg1 + 0];
        int n2 = arg0[arg1 + 1];
        int n3 = arg0[arg1 + 2];
        int n4 = arg0[arg1 + 3];
        int n5 = arg3;
        arg2[arg3 + 0] = n & 0x3FFFFFF;
        arg2[arg3 + 1] = (n2 << 6 | n >>> 26) & 0x3FFFFFF;
        arg2[n5 + 2] = (n3 << 12 | n2 >>> 20) & 0x1FFFFFF;
        arg2[n5 + 3] = (n4 << 19 | n3 >>> 13) & 0x3FFFFFF;
        arg2[arg3 + 4] = n4 >>> 7;
    }
}


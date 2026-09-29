/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqnja;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprwtba;
import java.util.Random;

public abstract class sprqlh {
    private static final long cfr_renamed_3 = 0xFFFFFFFFL;
    private static final int cfr_renamed_4 = 0x3FFFFFFF;

    private static /* synthetic */ void cfr_renamed_8579(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n = 0;
        long l = 0L;
        int n2 = arg0;
        while (n2 > 0) {
            if (n < Math.min(30, arg0)) {
                long l2 = arg1[arg2];
                ++arg2;
                int n3 = n;
                n += 32;
                l |= (l2 & 0xFFFFFFFFL) << n3;
            }
            arg3[arg4++] = (int)l & 0x3FFFFFFF;
            n -= 30;
            l >>>= 30;
            n2 = arg0 -= 30;
        }
    }

    private static /* synthetic */ int cfr_renamed_8580(int arg0, int[] arg1) {
        int n;
        int n2 = 0;
        int n3 = arg0 - 1;
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n2 -= arg1[n];
            arg1[n] = n5 & 0x3FFFFFFF;
            n2 = n5 >> 30;
            n4 = ++n;
        }
        arg1[n3] = n2 -= arg1[n3];
        n2 = arg1[n3] >> 30;
        return n2;
    }

    public static int cfr_renamed_1753(int arg0) {
        int n;
        int n2 = n = arg0;
        int n3 = n = n2 * (2 - arg0 * n2);
        int n4 = n = n3 * (2 - arg0 * n3);
        int n5 = n = n4 * (2 - arg0 * n4);
        n = n5 * (2 - arg0 * n5);
        return n;
    }

    public static int cfr_renamed_5235(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = arg0.length;
        int n3 = (n2 << 5) - spruaf.cfr_renamed_5201(arg0[n2 - 1]);
        int n4 = (n3 + 29) / 30;
        int[] nArray = new int[4];
        int[] nArray2 = new int[n4];
        int[] nArray3 = new int[n4];
        int[] nArray4 = new int[n4];
        int[] nArray5 = new int[n4];
        int[] nArray6 = new int[n4];
        nArray3[0] = 1;
        sprqlh.cfr_renamed_8579(n3, arg1, 0, nArray5, 0);
        sprqlh.cfr_renamed_8579(n3, arg0, 0, nArray6, 0);
        System.arraycopy(nArray6, 0, nArray4, 0, n4);
        int n5 = 0;
        int n6 = sprqlh.cfr_renamed_1753(nArray6[0]);
        int n7 = sprqlh.cfr_renamed_8581(n3);
        int n8 = n = 0;
        while (n8 < n7) {
            n5 = sprqlh.cfr_renamed_8582(n5, nArray4[0], nArray5[0], nArray);
            sprqlh.cfr_renamed_8583(n4, nArray2, nArray3, nArray, n6, nArray6);
            sprqlh.cfr_renamed_8584(n4, nArray4, nArray5, nArray);
            n8 = n += 30;
        }
        n = nArray4[n4 - 1] >> 31;
        sprqlh.cfr_renamed_8585(n4, n, nArray4);
        sprqlh.cfr_renamed_8586(n4, n, nArray2, nArray6);
        sprqlh.cfr_renamed_8587(n3, nArray2, 0, arg2, 0);
        return sprvih.cfr_renamed_8578(n4, nArray4, 1) & sprvih.cfr_renamed_8561(n4, nArray5);
    }

    public static void cfr_renamed_8588(int[] arg0, int[] arg1, int[] arg2) {
        if (0 == sprqlh.cfr_renamed_5235(arg0, arg1, arg2)) {
            throw new ArithmeticException(sprqnja.cfr_renamed_9(":k\u0005`\u0001v\u0016%\u0017j\u0016vSk\u001cqS`\u000bl\u0000q]"));
        }
    }

    private static /* synthetic */ void cfr_renamed_8586(int arg0, int arg1, int[] arg2, int[] arg3) {
        int n;
        int n2;
        int n3 = arg0 - 1;
        int n4 = 0;
        int n5 = arg2[n3] >> 31;
        int n6 = n2 = 0;
        while (n6 < n3) {
            n = arg2[n2] + (arg3[n2] & n5);
            n = (n ^ arg1) - arg1;
            arg2[n2] = (n4 += n) & 0x3FFFFFFF;
            n4 >>= 30;
            n6 = ++n2;
        }
        n2 = arg2[n3] + (arg3[n3] & n5);
        n2 = (n2 ^ arg1) - arg1;
        arg2[n3] = n4 += n2;
        n4 = 0;
        n5 = arg2[n3] >> 31;
        int n7 = n2 = 0;
        while (n7 < n3) {
            n = arg2[n2] + (arg3[n2] & n5);
            arg2[n2] = (n4 += n) & 0x3FFFFFFF;
            n4 >>= 30;
            n7 = ++n2;
        }
        n2 = arg2[n3] + (arg3[n3] & n5);
        arg2[n3] = n4 += n2;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8583(int n, int[] nArray, int[] nArray2, int[] nArray3, int n2, int[] nArray4) {
        int n3;
        void arg4;
        void arg5;
        int arg0;
        void arg1;
        void arg2;
        void arg3;
        void v0 = arg3;
        void var6_6 = v0[0];
        void var7_7 = v0[1];
        void var8_8 = v0[2];
        void var9_9 = v0[3];
        void v1 = arg2;
        void var16_10 = arg1[arg0 - 1] >> 31;
        void var17_11 = v1[arg0 - 1] >> 31;
        int n4 = (var6_6 & var16_10) + (var7_7 & var17_11);
        int n5 = (var8_8 & var16_10) + (var9_9 & var17_11);
        void var15_14 = arg5[0];
        int n6 = nArray[0];
        void var11_16 = v1[0];
        long l = (long)var6_6 * (long)n6 + (long)var7_7 * (long)var11_16;
        long l2 = (long)var8_8 * (long)n6 + (long)var9_9 * (long)var11_16;
        int n7 = n4;
        n4 = n7 - (arg4 * (int)l + n7 & 0x3FFFFFFF);
        int n8 = n5;
        n5 = n8 - (arg4 * (int)l2 + n8 & 0x3FFFFFFF);
        l += (long)var15_14 * (long)n4;
        l2 += (long)var15_14 * (long)n5;
        l >>= 30;
        l2 >>= 30;
        int n9 = n3 = 1;
        while (n9 < arg0) {
            var15_14 = arg5[n3];
            void v5 = arg2;
            n6 = arg1[n3];
            var11_16 = v5[n3];
            arg1[n3 - 1] = (int)(l += (long)var6_6 * (long)n6 + (long)var7_7 * (long)var11_16 + (long)var15_14 * (long)n4) & 0x3FFFFFFF;
            l >>= 30;
            v5[n3 - 1] = (int)(l2 += (long)var8_8 * (long)n6 + (long)var9_9 * (long)var11_16 + (long)var15_14 * (long)n5) & 0x3FFFFFFF;
            l2 >>= 30;
            n9 = ++n3;
        }
        arg1[arg0 - 1] = (int)l;
        arg2[arg0 - 1] = (int)l2;
    }

    private static /* synthetic */ void cfr_renamed_8585(int arg0, int arg1, int[] arg2) {
        int n;
        int n2 = 0;
        int n3 = arg0 - 1;
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n2 += (arg2[n] ^ arg1) - arg1;
            arg2[n] = n5 & 0x3FFFFFFF;
            n2 = n5 >> 30;
            n4 = ++n;
        }
        arg2[n3] = n2 += (arg2[n3] ^ arg1) - arg1;
    }

    public static void cfr_renamed_8589(int[] arg0, int[] arg1, int[] arg2) {
        if (!sprqlh.cfr_renamed_5233(arg0, arg1, arg2)) {
            throw new ArithmeticException(sprwtba.cfr_renamed_9("\u0016V)]-K:\u0018;W:K\u007fV0L\u007f]'Q,Lq"));
        }
    }

    private static /* synthetic */ int cfr_renamed_8582(int arg0, int arg1, int arg2, int[] arg3) {
        int n;
        int n2 = 0x40000000;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0x40000000;
        int n6 = arg1;
        int n7 = arg2;
        int n8 = n = 0;
        while (n8 < 30) {
            int n9 = arg0 >> 31;
            int n10 = -(n7 & 1);
            int n11 = n6 ^ n9;
            int n12 = n2 ^ n9;
            int n13 = n3 ^ n9;
            n7 -= n11 & n10;
            n4 -= n12 & n10;
            n5 -= n13 & n10;
            arg0 = (arg0 ^ (n10 &= ~n9)) - (n10 - 1);
            n6 += n7 & n10;
            n2 += n4 & n10;
            n3 += n5 & n10;
            n7 >>= 1;
            n4 >>= 1;
            n5 >>= 1;
            n8 = ++n;
        }
        arg3[0] = n2;
        arg3[1] = n3;
        arg3[2] = n4;
        arg3[3] = n5;
        return arg0;
    }

    public static boolean cfr_renamed_5233(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int n2;
        int n3 = arg0.length;
        int n4 = (n3 << 5) - spruaf.cfr_renamed_5201(arg0[n3 - 1]);
        int n5 = (n4 + 29) / 30;
        int[] nArray = new int[4];
        int[] nArray2 = new int[n5];
        int[] nArray3 = new int[n5];
        int[] nArray4 = new int[n5];
        int[] nArray5 = new int[n5];
        int[] nArray6 = new int[n5];
        nArray3[0] = 1;
        sprqlh.cfr_renamed_8579(n4, arg1, 0, nArray5, 0);
        sprqlh.cfr_renamed_8579(n4, arg0, 0, nArray6, 0);
        System.arraycopy(nArray6, 0, nArray4, 0, n5);
        int n6 = spruaf.cfr_renamed_5201(nArray5[n5 - 1] | 1) - (n5 * 30 + 2 - n4);
        int n7 = -1 - n6;
        int n8 = n5;
        int n9 = n5;
        int n10 = sprqlh.cfr_renamed_1753(nArray6[0]);
        int n11 = sprqlh.cfr_renamed_8581(n4);
        int n12 = 0;
        while (!sprvih.cfr_renamed_1737(n9, nArray5)) {
            if (n12 >= n11) {
                return false;
            }
            n12 += 30;
            n7 = sprqlh.cfr_renamed_8590(n7, nArray4[0], nArray5[0], nArray);
            sprqlh.cfr_renamed_8583(n8, nArray2, nArray3, nArray, n10, nArray6);
            sprqlh.cfr_renamed_8584(n9, nArray4, nArray5, nArray);
            n2 = nArray4[n9 - 1];
            n = nArray5[n9 - 1];
            int n13 = n9 - 2 >> 31;
            int n14 = n2;
            n13 |= n14 ^ n14 >> 31;
            int n15 = n;
            if ((n13 |= n15 ^ n15 >> 31) != 0) continue;
            int n16 = n9--;
            int[] nArray7 = nArray4;
            int n17 = n16 - 2;
            nArray7[n17] = nArray7[n17] | n2 << 30;
            int n18 = n16 - 2;
            nArray5[n18] = nArray5[n18] | n << 30;
        }
        n2 = nArray4[n9 - 1] >> 31;
        n = nArray2[n8 - 1] >> 31;
        if (n < 0) {
            n = sprqlh.cfr_renamed_8591(n8, nArray2, nArray6);
        }
        if (n2 < 0) {
            n = sprqlh.cfr_renamed_8580(n8, nArray2);
            n2 = sprqlh.cfr_renamed_8580(n9, nArray4);
        }
        if (!sprvih.cfr_renamed_1710(n9, nArray4)) {
            return false;
        }
        if (n < 0) {
            n = sprqlh.cfr_renamed_8591(n8, nArray2, nArray6);
        }
        sprqlh.cfr_renamed_8587(n4, nArray2, 0, arg2, 0);
        return true;
    }

    private static /* synthetic */ int cfr_renamed_8591(int arg0, int[] arg1, int[] arg2) {
        int n;
        int n2 = 0;
        int n3 = arg0 - 1;
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n2 += arg1[n] + arg2[n];
            arg1[n] = n5 & 0x3FFFFFFF;
            n2 = n5 >> 30;
            n4 = ++n;
        }
        arg1[n3] = n2 += arg1[n3] + arg2[n3];
        n2 = arg1[n3] >> 30;
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8584(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        int arg0;
        int n2;
        void arg1;
        void arg3;
        void v0 = arg3;
        void var4_4 = v0[0];
        void var5_5 = v0[1];
        void var6_6 = v0[2];
        void var7_7 = v0[3];
        void var8_8 = arg1[0];
        int n3 = nArray2[0];
        long l = (long)var4_4 * (long)var8_8 + (long)var5_5 * (long)n3;
        long l2 = (long)var6_6 * (long)var8_8 + (long)var7_7 * (long)n3;
        l >>= 30;
        l2 >>= 30;
        int n4 = n2 = 1;
        while (n4 < arg0) {
            void arg2;
            void v2 = arg2;
            var8_8 = arg1[n2];
            n3 = v2[n2];
            arg1[n2 - 1] = (int)(l += (long)var4_4 * (long)var8_8 + (long)var5_5 * (long)n3) & 0x3FFFFFFF;
            l >>= 30;
            v2[n2 - 1] = (int)(l2 += (long)var6_6 * (long)var8_8 + (long)var7_7 * (long)n3) & 0x3FFFFFFF;
            l2 >>= 30;
            n4 = ++n2;
        }
        arg1[arg0 - 1] = (int)l;
        arg2[arg0 - 1] = (int)l2;
    }

    private static /* synthetic */ void cfr_renamed_8587(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int n = 0;
        long l = 0L;
        int n2 = arg0;
        while (n2 > 0) {
            int n3 = n;
            while (n3 < Math.min(32, arg0)) {
                long l2 = arg1[arg2];
                int n4 = n;
                ++arg2;
                l |= l2 << n4;
                n3 = n += 30;
            }
            arg3[arg4++] = (int)l;
            n -= 32;
            l >>>= 32;
            n2 = arg0 -= 32;
        }
    }

    private static /* synthetic */ int cfr_renamed_8581(int arg0) {
        return (49 * arg0 + (arg0 < 46 ? 80 : 47)) / 17;
    }

    public static int[] cfr_renamed_1758(int[] arg0) {
        int n = arg0.length;
        Random random = new Random();
        int[] nArray = sprvih.cfr_renamed_1716(n);
        int n2 = arg0[n - 1];
        n2 |= n2 >>> 1;
        n2 |= n2 >>> 2;
        n2 |= n2 >>> 4;
        n2 |= n2 >>> 8;
        n2 |= n2 >>> 16;
        do {
            int n3;
            int n4 = n3 = 0;
            while (n4 != n) {
                nArray[n3++] = random.nextInt();
                n4 = n3;
            }
            int n5 = n - 1;
            nArray[n5] = nArray[n5] & n2;
        } while (sprvih.cfr_renamed_1683(n, nArray, arg0));
        return nArray;
    }

    private static /* synthetic */ int cfr_renamed_8590(int arg0, int arg1, int arg2, int[] arg3) {
        int n = 1;
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        int n5 = arg1;
        int n6 = arg2;
        int n7 = 30;
        int n8 = n6;
        while (true) {
            int n9;
            int n10;
            int n11;
            int n12;
            int n13 = spruaf.cfr_renamed_5203(n8 | -1 << n7);
            n6 >>= n13;
            n <<= n13;
            n2 <<= n13;
            arg0 -= n13;
            if ((n7 -= n13) <= 0) break;
            if (arg0 < 0) {
                arg0 = -arg0;
                int n14 = n5;
                n5 = n6;
                n6 = -n14;
                int n15 = n;
                n = n3;
                n3 = -n15;
                int n16 = n2;
                n2 = n4;
                n4 = -n16;
                n12 = arg0 + 1 > n7 ? n7 : arg0 + 1;
                n11 = -1 >>> 32 - n12 & 0x3F;
                int n17 = n5;
                n10 = n5 * n6 * (n17 * n17 - 2) & n11;
                n9 = n6;
            } else {
                n12 = arg0 + 1 > n7 ? n7 : arg0 + 1;
                n11 = -1 >>> 32 - n12 & 0xF;
                int n18 = n5;
                n10 = n18 + ((n18 + 1 & 4) << 1);
                n10 = -n10 * n6 & n11;
                n9 = n6;
            }
            n6 = n9 + n5 * n10;
            n3 += n * n10;
            n4 += n2 * n10;
            n8 = n6;
        }
        arg3[0] = n;
        arg3[1] = n2;
        arg3[2] = n3;
        arg3[3] = n4;
        return arg0;
    }
}


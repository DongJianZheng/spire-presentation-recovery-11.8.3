/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;

public class spruxf {
    public static int cfr_renamed_6526(int arg0) {
        return arg0 & 0xFF;
    }

    public static void cfr_renamed_6527(long[] arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg1.length) {
            long[] lArray = arg0;
            arg0[n / 2] = (long)arg1[n] & 0xFFFFFFFFL;
            int n3 = n / 2;
            long l = lArray[n3] | (long)arg1[n + 1] << 32;
            lArray[n3] = l;
            n2 = n += 2;
        }
    }

    public static void cfr_renamed_6528(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        System.arraycopy(arg0, arg1, arg2, arg3, arg4 / 2);
    }

    public static void cfr_renamed_6529(long[] arg0, int arg1, long[] arg2, int arg3, int arg4, int arg5) {
        long l = Long.MAX_VALUE;
        int n = 0;
        if (arg1 < arg3) {
            int n2;
            if (arg1 % 64 != 0) {
                n = 64 - arg1 % 64;
            }
            System.arraycopy(arg2, 0, arg0, 0, arg4);
            int n3 = n2 = 0;
            while (n3 < n) {
                int n4 = arg5 - 1;
                long l2 = arg0[n4] & l >> n2;
                arg0[n4] = l2;
                n3 = ++n2;
            }
        } else {
            System.arraycopy(arg2, 0, arg0, 0, (arg3 + 7) / 8);
        }
    }

    public static void cfr_renamed_6530(int[] arg0, long[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg1.length) {
            arg0[2 * n] = (int)arg1[n];
            int n3 = 2 * n + 1;
            int n4 = (int)(arg1[n] >> 32);
            arg0[n3] = n4;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6531(byte[] arg0, long[] arg1) {
        int n;
        int n2 = arg0.length / 8;
        int n3 = n = 0;
        while (n3 != n2) {
            sprpxe.cfr_renamed_444(arg1[n], arg0, n++ * 8);
            n3 = n;
        }
        if (arg0.length % 8 != 0) {
            n = n2 * 8;
            int n4 = 0;
            int n5 = n;
            while (n5 < arg0.length) {
                int n6 = n++;
                long l = arg1[n2] >>> n4 * 8;
                ++n4;
                arg0[n6] = (byte)l;
                n5 = n;
            }
        }
    }

    public static int cfr_renamed_6532(int arg0) {
        return arg0 & 0xFFFF;
    }

    public static void cfr_renamed_6533(long[] arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg1.length) {
            long[] lArray = arg0;
            long[] lArray2 = arg0;
            int n3 = n;
            long[] lArray3 = arg0;
            arg0[n / 4] = (long)arg1[n] & 0xFFFFL;
            int n4 = n3 / 4;
            lArray3[n4] = lArray3[n4] | (long)arg1[n + 1] << 16;
            int n5 = n3 / 4;
            lArray[n5] = lArray[n5] | (long)arg1[n + 2] << 32;
            int n6 = n / 4;
            long l = lArray2[n6] | (long)arg1[n + 3] << 48;
            lArray2[n6] = l;
            n2 = n += 4;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6534(int[] nArray, long l, int n) {
        void arg1;
        void arg2;
        int[] arg0;
        int[] nArray2 = arg0;
        int[] nArray3 = arg0;
        void v2 = arg2;
        int[] nArray4 = arg0;
        void v4 = arg2 + false;
        arg0[v4] = arg0[v4] ^ (int)arg1 & 0xFFFF;
        void v5 = v2 + true;
        nArray4[v5] = nArray4[v5] ^ (int)(arg1 >>> 16) & 0xFFFF;
        void v6 = v2 + 2;
        nArray2[v6] = nArray2[v6] ^ (int)(arg1 >>> 32) & 0xFFFF;
        int n2 = n + 3;
        nArray3[n2] = nArray3[n2] ^ (int)(arg1 >>> 48) & 0xFFFF;
    }

    public static long cfr_renamed_6535(long arg0, long arg1) {
        return (1L << (int)(arg0 % arg1)) - 1L;
    }

    public static void cfr_renamed_6536(long[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = arg1;
        if (arg1.length % 8 != 0) {
            byArray = new byte[(arg1.length + 7) / 8 * 8];
            System.arraycopy(arg1, 0, byArray, 0, arg1.length);
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            long l = sprpxe.cfr_renamed_443(byArray, n2);
            n2 += 8;
            arg0[n] = l;
            n3 = ++n;
        }
    }

    public static void cfr_renamed_6537(int[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = arg1;
        if (arg1.length % 2 != 0) {
            byArray = new byte[(arg1.length + 1) / 2 * 2];
            System.arraycopy(arg1, 0, byArray, 0, arg1.length);
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4 = sprpxe.cfr_renamed_5180(byArray, n2) & 0xFFFF;
            n2 += 2;
            arg0[n] = n4;
            n3 = ++n;
        }
    }

    public static int cfr_renamed_6538(int arg0) {
        return (arg0 + 63) / 64;
    }

    public static int cfr_renamed_6539(int arg0) {
        return (arg0 + 7) / 8;
    }
}


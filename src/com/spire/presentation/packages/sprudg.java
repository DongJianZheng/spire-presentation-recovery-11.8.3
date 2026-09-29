/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spruaf;

public class sprudg {
    public static int cfr_renamed_6199(int arg0) {
        if (arg0 == 0) {
            return 0;
        }
        return 32 - sprudg.cfr_renamed_6200(arg0 - 1);
    }

    public static void cfr_renamed_6201(byte[] arg0, int arg1, byte arg2) {
        int n = arg1 >>> 3;
        int n2 = arg1 & 7 ^ 7;
        int n3 = arg0[n];
        n3 &= ~(1 << n2);
        arg0[n] = (byte)(n3 |= arg2 << n2);
    }

    public static byte cfr_renamed_6202(byte[] arg0, int arg1) {
        int n = arg1 >>> 2;
        int n2 = arg1 << 1 & 6 ^ 6;
        int n3 = arg0[n] >>> n2;
        return (byte)((n3 & 1) << 1 | (n3 & 2) >> 1);
    }

    public static int cfr_renamed_6203(int[] arg0, int arg1) {
        return sprudg.cfr_renamed_1662(arg0, arg1);
    }

    public static int cfr_renamed_6204(int arg0) {
        if (arg0 == 0) {
            return 0;
        }
        return (arg0 - 1) / 8 + 1;
    }

    public static void cfr_renamed_6205(int[] arg0, int arg1, int arg2) {
        int n = arg1 >>> 5;
        int n2 = arg1 & 0x1F ^ 7;
        int n3 = arg0[n];
        n3 &= ~(1 << n2);
        arg0[n] = n3 |= arg2 << n2;
    }

    public static int cfr_renamed_6206(int arg0) {
        return spruaf.cfr_renamed_931(arg0) & 1;
    }

    public static int cfr_renamed_6207(int arg0) {
        return spruaf.cfr_renamed_931(arg0 & 0xFFFF) & 1;
    }

    public static int cfr_renamed_1662(int[] arg0, int arg1) {
        int n = arg1 >>> 5;
        int n2 = arg1 & 0x1F ^ 7;
        return arg0[n] >>> n2 & 1;
    }

    public static int cfr_renamed_6208(int arg0, int arg1) {
        int n = arg1 ^ 7;
        return arg0 >>> n & 1;
    }

    public static int cfr_renamed_6209(byte[] arg0, int arg1) {
        int n;
        byte by = arg0[0];
        int n2 = n = 1;
        while (n2 < arg1) {
            byte by2 = arg0[n];
            by = (byte)(by ^ by2);
            n2 = ++n;
        }
        return spruaf.cfr_renamed_931(by & 0xFF) & 1;
    }

    private static /* synthetic */ int cfr_renamed_6200(int arg0) {
        if (arg0 == 0) {
            return 32;
        }
        int n = 1;
        if (arg0 >>> 16 == 0) {
            n += 16;
            arg0 <<= 16;
        }
        if (arg0 >>> 24 == 0) {
            n += 8;
            arg0 <<= 8;
        }
        if (arg0 >>> 28 == 0) {
            n += 4;
            arg0 <<= 4;
        }
        if (arg0 >>> 30 == 0) {
            n += 2;
            arg0 <<= 2;
        }
        return n -= arg0 >>> 31;
    }

    public static void cfr_renamed_6210(int[] arg0, int arg1) {
        if ((arg1 & 0x1F) != 0) {
            int n = arg1 >>> 5;
            arg0[n] = arg0[n] & sprudg.cfr_renamed_6211(arg1);
        }
    }

    public static void cfr_renamed_6212(int[] arg0, int arg1, int arg2) {
        sprudg.cfr_renamed_6205(arg0, arg1, arg2);
    }

    public static int cfr_renamed_6213(int arg0, int arg1, int arg2) {
        int n = arg1 ^ 7;
        arg0 &= ~(1 << n);
        return arg0 |= arg2 << n;
    }

    public static int cfr_renamed_6211(int arg0) {
        int n = arg0 & 0xFFFFFFF8;
        int n2 = ~(-1 << n);
        int n3 = arg0 & 7;
        if (n3 != 0) {
            n2 ^= (65280 >>> n3 & 0xFF) << n;
        }
        return n2;
    }

    public static byte cfr_renamed_714(byte[] arg0, int arg1) {
        int n = arg1 >>> 3;
        int n2 = arg1 & 7 ^ 7;
        return (byte)(arg0[n] >>> n2 & 1);
    }
}


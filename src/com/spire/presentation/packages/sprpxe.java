/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public abstract class sprpxe {
    public static byte[] cfr_renamed_448(int[] arg0) {
        byte[] byArray = new byte[4 * arg0.length];
        sprpxe.cfr_renamed_449(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_442(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    public static void cfr_renamed_5163(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = sprpxe.cfr_renamed_446(arg0, arg1);
            arg1 += 4;
            arg2[arg3 + n] = n3;
            n2 = ++n;
        }
    }

    public static byte[] cfr_renamed_451(long arg0) {
        byte[] byArray = new byte[8];
        sprpxe.cfr_renamed_450(arg0, byArray, 0);
        return byArray;
    }

    public static byte[] cfr_renamed_452(long arg0) {
        byte[] byArray = new byte[8];
        sprpxe.cfr_renamed_444(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_5164(long arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = 56;
        arg1[arg2] = (byte)(arg0 >>> n2);
        int n3 = n = 1;
        while (n3 < arg3) {
            int n4 = arg2 + n;
            arg1[n4] = (byte)(arg0 >>> (n2 -= 8));
            n3 = ++n;
        }
    }

    public static int[] cfr_renamed_5165(byte[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg2];
        int n2 = n = 0;
        while (n2 < nArray.length) {
            int n3 = sprpxe.cfr_renamed_439(arg0, arg1);
            arg1 += 4;
            nArray[n] = n3;
            n2 = ++n;
        }
        return nArray;
    }

    public static void cfr_renamed_454(byte[] arg0, int arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            int n3 = sprpxe.cfr_renamed_439(arg0, arg1);
            arg1 += 4;
            arg2[n] = n3;
            n2 = ++n;
        }
    }

    public static int cfr_renamed_5166(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = arg0[arg1] & 0xFF;
        int n3 = 0;
        int n4 = n = 1;
        while (n4 < arg2) {
            int n5 = arg0[arg1 + n] & 0xFF;
            n2 |= n5 << (n3 += 8);
            n4 = ++n;
        }
        return n2;
    }

    public static byte[] cfr_renamed_440(long[] arg0) {
        byte[] byArray = new byte[8 * arg0.length];
        sprpxe.cfr_renamed_441(arg0, byArray, 0);
        return byArray;
    }

    public static byte[] cfr_renamed_5167(short arg0) {
        byte[] byArray = new byte[2];
        sprpxe.cfr_renamed_5168(arg0, byArray, 0);
        return byArray;
    }

    public static long cfr_renamed_443(byte[] arg0, int arg1) {
        int n = sprpxe.cfr_renamed_439(arg0, arg1);
        return ((long)sprpxe.cfr_renamed_439(arg0, arg1 + 4) & 0xFFFFFFFFL) << 32 | (long)n & 0xFFFFFFFFL;
    }

    public static void cfr_renamed_5169(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprpxe.cfr_renamed_442(arg0[arg1 + n], arg3, arg4);
            n2 = ++n;
            arg4 += 4;
        }
    }

    public static byte[] cfr_renamed_453(int arg0) {
        byte[] byArray = new byte[4];
        sprpxe.cfr_renamed_442(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_5170(long[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprpxe.cfr_renamed_450(arg0[arg1 + n], arg3, arg4);
            n2 = ++n;
            arg4 += 8;
        }
    }

    public static void cfr_renamed_450(long arg0, byte[] arg1, int arg2) {
        sprpxe.cfr_renamed_442((int)(arg0 >>> 32), arg1, arg2);
        sprpxe.cfr_renamed_442((int)(arg0 & 0xFFFFFFFFL), arg1, arg2 + 4);
    }

    public static void cfr_renamed_459(long[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprpxe.cfr_renamed_444(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 8;
        }
    }

    public static void cfr_renamed_5171(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprpxe.cfr_renamed_437(arg0[arg1 + n], arg3, arg4);
            n2 = ++n;
            arg4 += 4;
        }
    }

    public static short cfr_renamed_5172(byte[] arg0, int arg1) {
        int n;
        int n2 = n;
        n2 = (arg0[arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        return (short)n2;
    }

    public static void cfr_renamed_437(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2] = (byte)(arg0 >>> 24);
    }

    public static void cfr_renamed_441(long[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprpxe.cfr_renamed_450(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 8;
        }
    }

    public static void cfr_renamed_5173(byte[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            long l = sprpxe.cfr_renamed_443(arg0, arg1);
            arg1 += 8;
            arg2[arg3 + n] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_457(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprpxe.cfr_renamed_442(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 4;
        }
    }

    public static void cfr_renamed_5168(short arg0, byte[] arg1, int arg2) {
        arg1[arg2++] = (byte)arg0;
        arg1[arg2] = (byte)(arg0 >>> 8);
    }

    public static int cfr_renamed_5174(byte[] arg0, int arg1, int arg2) {
        return sprpxe.cfr_renamed_5166(arg0, arg1, arg2) << (4 - arg2 << 3);
    }

    public static void cfr_renamed_5175(byte[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            long l = sprpxe.cfr_renamed_456(arg0, arg1);
            arg1 += 8;
            arg2[arg3 + n] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_438(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = sprpxe.cfr_renamed_439(arg0, arg1);
            arg1 += 4;
            arg2[arg3 + n] = n3;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_455(byte[] arg0, int arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            long l = sprpxe.cfr_renamed_456(arg0, arg1);
            arg1 += 8;
            arg2[n] = l;
            n2 = ++n;
        }
    }

    public static long cfr_renamed_5176(byte[] arg0, int arg1, int arg2) {
        return sprpxe.cfr_renamed_5177(arg0, arg1, arg2) << (8 - arg2 << 3);
    }

    public static int cfr_renamed_439(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16 | arg0[++arg1] << 24;
        return n4;
    }

    public static byte[] cfr_renamed_5178(short arg0) {
        byte[] byArray = new byte[2];
        sprpxe.cfr_renamed_5179(arg0, byArray, 0);
        return byArray;
    }

    public static byte[] cfr_renamed_458(long[] arg0) {
        byte[] byArray = new byte[8 * arg0.length];
        sprpxe.cfr_renamed_459(arg0, byArray, 0);
        return byArray;
    }

    public static short cfr_renamed_5180(byte[] arg0, int arg1) {
        int n;
        int n2 = n;
        n2 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8;
        return (short)n2;
    }

    public static byte[] cfr_renamed_460(int[] arg0) {
        byte[] byArray = new byte[4 * arg0.length];
        sprpxe.cfr_renamed_457(arg0, byArray, 0);
        return byArray;
    }

    public static long cfr_renamed_456(byte[] arg0, int arg1) {
        int n = sprpxe.cfr_renamed_446(arg0, arg1);
        int n2 = sprpxe.cfr_renamed_446(arg0, arg1 + 4);
        return ((long)n & 0xFFFFFFFFL) << 32 | (long)n2 & 0xFFFFFFFFL;
    }

    public static void cfr_renamed_5181(long[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprpxe.cfr_renamed_444(arg0[arg1 + n], arg3, arg4);
            n2 = ++n;
            arg4 += 8;
        }
    }

    public static byte[] cfr_renamed_436(int arg0) {
        byte[] byArray = new byte[4];
        sprpxe.cfr_renamed_437(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_447(byte[] arg0, int arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            long l = sprpxe.cfr_renamed_443(arg0, arg1);
            arg1 += 8;
            arg2[n] = l;
            n2 = ++n;
        }
    }

    public static long cfr_renamed_5177(byte[] arg0, int arg1, int arg2) {
        int n;
        long l = arg0[arg1] & 0xFF;
        int n2 = n = 1;
        while (n2 < arg2) {
            l <<= 8;
            int n3 = arg0[arg1 + n] & 0xFF;
            l |= (long)n3;
            n2 = ++n;
        }
        return l;
    }

    public static int cfr_renamed_446(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        return n4;
    }

    public static void cfr_renamed_3791(long arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3 - 1;
        while (n2 >= 0) {
            long l = arg0;
            arg1[n + arg2] = (byte)(l & 0xFFL);
            arg0 = l >>> 8;
            n2 = --n;
        }
    }

    public static void cfr_renamed_444(long arg0, byte[] arg1, int arg2) {
        sprpxe.cfr_renamed_437((int)(arg0 & 0xFFFFFFFFL), arg1, arg2);
        sprpxe.cfr_renamed_437((int)(arg0 >>> 32), arg1, arg2 + 4);
    }

    public static void cfr_renamed_5179(short arg0, byte[] arg1, int arg2) {
        arg1[arg2++] = (byte)(arg0 >>> 8);
        arg1[arg2] = (byte)arg0;
    }

    public static void cfr_renamed_445(byte[] arg0, int arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            int n3 = sprpxe.cfr_renamed_446(arg0, arg1);
            arg1 += 4;
            arg2[n] = n3;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_449(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprpxe.cfr_renamed_437(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 4;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public abstract class sprxrc {
    public static byte[] cfr_renamed_452(long arg0) {
        byte[] byArray = new byte[8];
        sprxrc.cfr_renamed_444(arg0, byArray, 0);
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static byte[] cfr_renamed_436(int arg0) {
        byte[] byArray = new byte[4];
        sprxrc.cfr_renamed_437(arg0, byArray, 0);
        return byArray;
    }

    public static long cfr_renamed_456(byte[] arg0, int arg1) {
        int n = sprxrc.cfr_renamed_446(arg0, arg1);
        int n2 = sprxrc.cfr_renamed_446(arg0, arg1 + 4);
        return ((long)n & 0xFFFFFFFFL) << 32 | (long)n2 & 0xFFFFFFFFL;
    }

    public static void cfr_renamed_454(byte[] arg0, int arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            int n3 = sprxrc.cfr_renamed_439(arg0, arg1);
            arg1 += 4;
            arg2[n] = n3;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_459(long[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprxrc.cfr_renamed_444(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 8;
        }
    }

    public static void cfr_renamed_437(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2] = (byte)(arg0 >>> 24);
    }

    public static byte[] cfr_renamed_451(long arg0) {
        byte[] byArray = new byte[8];
        sprxrc.cfr_renamed_450(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_444(long arg0, byte[] arg1, int arg2) {
        sprxrc.cfr_renamed_437((int)(arg0 & 0xFFFFFFFFL), arg1, arg2);
        sprxrc.cfr_renamed_437((int)(arg0 >>> 32), arg1, arg2 + 4);
    }

    public static byte[] cfr_renamed_440(long[] arg0) {
        byte[] byArray = new byte[8 * arg0.length];
        sprxrc.cfr_renamed_441(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_438(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = sprxrc.cfr_renamed_439(arg0, arg1);
            arg1 += 4;
            arg2[arg3 + n] = n3;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_447(byte[] arg0, int arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            long l = sprxrc.cfr_renamed_443(arg0, arg1);
            arg1 += 8;
            arg2[n] = l;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_457(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprxrc.cfr_renamed_442(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 4;
        }
    }

    public static void cfr_renamed_449(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprxrc.cfr_renamed_437(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 4;
        }
    }

    public static long cfr_renamed_443(byte[] arg0, int arg1) {
        int n = sprxrc.cfr_renamed_439(arg0, arg1);
        return ((long)sprxrc.cfr_renamed_439(arg0, arg1 + 4) & 0xFFFFFFFFL) << 32 | (long)n & 0xFFFFFFFFL;
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

    public static byte[] cfr_renamed_460(int[] arg0) {
        byte[] byArray = new byte[4 * arg0.length];
        sprxrc.cfr_renamed_457(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_455(byte[] arg0, int arg1, long[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            long l = sprxrc.cfr_renamed_456(arg0, arg1);
            arg1 += 8;
            arg2[n] = l;
            n2 = ++n;
        }
    }

    public static byte[] cfr_renamed_453(int arg0) {
        byte[] byArray = new byte[4];
        sprxrc.cfr_renamed_442(arg0, byArray, 0);
        return byArray;
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

    public static byte[] cfr_renamed_458(long[] arg0) {
        byte[] byArray = new byte[8 * arg0.length];
        sprxrc.cfr_renamed_459(arg0, byArray, 0);
        return byArray;
    }

    public static byte[] cfr_renamed_448(int[] arg0) {
        byte[] byArray = new byte[4 * arg0.length];
        sprxrc.cfr_renamed_449(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_441(long[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprxrc.cfr_renamed_450(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 8;
        }
    }

    public static void cfr_renamed_445(byte[] arg0, int arg1, int[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2.length) {
            int n3 = sprxrc.cfr_renamed_446(arg0, arg1);
            arg1 += 4;
            arg2[n] = n3;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_450(long arg0, byte[] arg1, int arg2) {
        sprxrc.cfr_renamed_442((int)(arg0 >>> 32), arg1, arg2);
        sprxrc.cfr_renamed_442((int)(arg0 & 0xFFFFFFFFL), arg1, arg2 + 4);
    }
}


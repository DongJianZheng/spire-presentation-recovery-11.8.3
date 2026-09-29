/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzjh;

public class sprxlh {
    private static final long cfr_renamed_2 = 0x5555555555555555L;
    private static final long cfr_renamed_3 = 0x55555555L;
    private static final long cfr_renamed_4 = -6148914691236517206L;

    public static long cfr_renamed_8592(long arg0) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xA0A0A0A0A0A0A0AL, 3);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF0F00000F0F0L, 12);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xCC00CC00CC00CCL, 6);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFF00FF00L, 24);
        return arg0;
    }

    public static long cfr_renamed_8594(long arg0) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFFFF0000L, 16);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFF000000FF00L, 8);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF000F000F000F0L, 4);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xC0C0C0C0C0C0C0CL, 2);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0x2222222222222222L, 1);
        return arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 1 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5);
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

    public static long cfr_renamed_8595(long arg0) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xAA00AA00AA00AAL, 7);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xCCCC0000CCCCL, 14);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF0F0F0F0L, 28);
        return arg0;
    }

    public static void cfr_renamed_7199(long[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprxlh.cfr_renamed_8596(arg0[arg1 + n], arg3, arg4);
            n2 = ++n;
            arg4 += 2;
        }
    }

    public static void cfr_renamed_8596(long arg0, long[] arg1, int arg2) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFFFF0000L, 16);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFF000000FF00L, 8);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF000F000F000F0L, 4);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xC0C0C0C0C0C0C0CL, 2);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0x2222222222222222L, 1);
        arg1[arg2] = arg0 & 0x5555555555555555L;
        arg1[arg2 + 1] = arg0 >>> 1 & 0x5555555555555555L;
    }

    public static int cfr_renamed_8597(int arg0) {
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xAA00AA, 7);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 52428, 14);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xF000F0, 4);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 65280, 8);
        return arg0;
    }

    public static long cfr_renamed_8599(int arg0) {
        arg0 = sprzjh.cfr_renamed_8598(arg0, 65280, 8);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xF000F0, 4);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xC0C0C0C, 2);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0x22222222, 1);
        return ((long)(arg0 >>> 1) & 0x55555555L) << 32 | (long)arg0 & 0x55555555L;
    }

    public static int cfr_renamed_8600(int arg0) {
        arg0 &= 0xFF;
        arg0 = (arg0 | arg0 << 4) & 0xF0F;
        arg0 = (arg0 | arg0 << 2) & 0x3333;
        arg0 = (arg0 | arg0 << 1) & 0x5555;
        return arg0;
    }

    public static int cfr_renamed_8601(int arg0) {
        arg0 = sprzjh.cfr_renamed_8598(arg0, 65280, 8);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xF000F0, 4);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 52428, 14);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xAA00AA, 7);
        return arg0;
    }

    public static int cfr_renamed_8602(int arg0) {
        arg0 = sprzjh.cfr_renamed_8598(arg0, 65280, 8);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xF000F0, 4);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xC0C0C0C, 2);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0x22222222, 1);
        return arg0;
    }

    public static int cfr_renamed_7144(int arg0) {
        arg0 &= 0xFFFF;
        arg0 = (arg0 | arg0 << 8) & 0xFF00FF;
        arg0 = (arg0 | arg0 << 4) & 0xF0F0F0F;
        arg0 = (arg0 | arg0 << 2) & 0x33333333;
        arg0 = (arg0 | arg0 << 1) & 0x55555555;
        return arg0;
    }

    public static void cfr_renamed_8603(long arg0, long[] arg1, int arg2) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFFFF0000L, 16);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFF000000FF00L, 8);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF000F000F000F0L, 4);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xC0C0C0C0C0C0C0CL, 2);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0x2222222222222222L, 1);
        arg1[arg2] = arg0 & 0xAAAAAAAAAAAAAAAAL;
        arg1[arg2 + 1] = arg0 << 1 & 0xAAAAAAAAAAAAAAAAL;
    }

    public static long cfr_renamed_8604(long arg0) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0x2222222222222222L, 1);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xC0C0C0C0C0C0C0CL, 2);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF000F000F000F0L, 4);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFF000000FF00L, 8);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFFFF0000L, 16);
        return arg0;
    }

    public static long cfr_renamed_8605(long arg0) {
        return sprxlh.cfr_renamed_8595(arg0);
    }

    public static long cfr_renamed_8606(long arg0) {
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xFF00FF00L, 24);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xCC00CC00CC00CCL, 6);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xF0F00000F0F0L, 12);
        arg0 = sprzjh.cfr_renamed_8593(arg0, 0xA0A0A0A0A0A0A0AL, 3);
        return arg0;
    }

    public static int cfr_renamed_8607(int arg0) {
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0x22222222, 1);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xC0C0C0C, 2);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 0xF000F0, 4);
        arg0 = sprzjh.cfr_renamed_8598(arg0, 65280, 8);
        return arg0;
    }
}


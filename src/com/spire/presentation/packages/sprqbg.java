/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprqbg {
    public static long cfr_renamed_6698(long arg0) {
        long l = arg0;
        arg0 = l ^ l << 1;
        arg0 ^= arg0 << 2;
        return (arg0 & 0x8888888888888888L) * 0x1111111111111111L >>> 63;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 1 << 3;
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

    public static int cfr_renamed_6699(int arg0) {
        int n = arg0;
        arg0 = n | n >>> 1;
        arg0 |= arg0 >>> 2;
        arg0 |= arg0 >>> 4;
        arg0 |= arg0 >>> 8;
        arg0 |= arg0 >>> 16;
        return arg0 ^ arg0 >>> 1;
    }

    public static long cfr_renamed_6626(long arg0) {
        long l = arg0;
        arg0 = l | l << 32;
        arg0 >>>= 32;
        return (arg0 += 0xFFFFFFFFL) >>> 32;
    }

    public static long cfr_renamed_6700(int arg0) {
        if (arg0 != 0) {
            return (1L << arg0) - 1L;
        }
        return -1L;
    }

    public static long cfr_renamed_6656(long arg0) {
        long l = arg0;
        arg0 = l | l << 32;
        arg0 >>>= 32;
        return --arg0 >>> 63;
    }

    public static long cfr_renamed_6701(long arg0, long arg1) {
        return (arg0 >>> 63 ^ arg1 >>> 63) & (arg0 >>> 63) - (arg1 >>> 63) >>> 63 ^ (arg0 >>> 63 ^ arg1 >>> 63 ^ 1L) & (arg0 & Long.MAX_VALUE) - (arg1 & Long.MAX_VALUE) >>> 63;
    }
}


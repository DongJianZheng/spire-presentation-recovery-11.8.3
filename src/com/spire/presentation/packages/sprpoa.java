/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public final class sprpoa {
    public static long cfr_renamed_885(byte[] arg0, int arg1) {
        int n = arg0[arg1] & 0xFF;
        long l = n;
        int n2 = arg0[++arg1] & 0xFF;
        l |= (long)(n2 << 8);
        int n3 = arg0[++arg1] & 0xFF;
        l |= (long)(n3 << 16);
        long l2 = arg0[++arg1];
        l |= (l2 & 0xFFL) << 24;
        long l3 = arg0[++arg1];
        l |= (l3 & 0xFFL) << 32;
        long l4 = arg0[++arg1];
        l |= (l4 & 0xFFL) << 40;
        long l5 = arg0[++arg1];
        l |= (l5 & 0xFFL) << 48;
        long l6 = arg0[++arg1];
        ++arg1;
        return l |= (l6 & 0xFFL) << 56;
    }

    public static byte[] cfr_renamed_886(int arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byArray[0] = (byte)arg0;
        byArray[1] = (byte)(arg0 >>> 8);
        byArray2[2] = (byte)(arg0 >>> 16);
        byArray[3] = (byte)(arg0 >>> 24);
        return byArray2;
    }

    public static int cfr_renamed_887(byte[] arg0) {
        return arg0[0] & 0xFF | (arg0[1] & 0xFF) << 8 | (arg0[2] & 0xFF) << 16 | (arg0[3] & 0xFF) << 24;
    }

    public static byte[] cfr_renamed_888(long arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[8];
        byArray[0] = (byte)arg0;
        byArray[1] = (byte)(arg0 >>> 8);
        byArray[2] = (byte)(arg0 >>> 16);
        byArray[3] = (byte)(arg0 >>> 24);
        byArray[4] = (byte)(arg0 >>> 32);
        byArray[5] = (byte)(arg0 >>> 40);
        byArray2[6] = (byte)(arg0 >>> 48);
        byArray[7] = (byte)(arg0 >>> 56);
        return byArray2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 4;
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

    public static int cfr_renamed_871(byte[] arg0, int arg1) {
        int n = arg0[arg1] & 0xFF;
        int n2 = n;
        int n3 = arg0[++arg1] & 0xFF;
        n2 = n | n3 << 8;
        int n4 = arg0[++arg1] & 0xFF;
        n2 |= n4 << 16;
        return n2 |= (arg0[++arg1] & 0xFF) << 24;
    }

    public static int[] cfr_renamed_889(byte[] arg0) {
        int n;
        int n2 = (arg0.length + 3) / 4;
        int n3 = arg0.length & 3;
        int[] nArray = new int[n2];
        int n4 = 0;
        int n5 = n = 0;
        while (n5 <= n2 - 2) {
            nArray[n++] = sprpoa.cfr_renamed_871(arg0, n4);
            n4 += 4;
            n5 = n;
        }
        if (n3 != 0) {
            nArray[n2 - 1] = sprpoa.cfr_renamed_873(arg0, n4, n3);
            return nArray;
        }
        nArray[n2 - 1] = sprpoa.cfr_renamed_871(arg0, n4);
        return nArray;
    }

    private /* synthetic */ sprpoa() {
    }

    public static void cfr_renamed_877(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2++] = (byte)(arg0 >>> 24);
    }

    public static void cfr_renamed_890(long arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2++] = (byte)(arg0 >>> 24);
        byArray[arg2++] = (byte)(arg0 >>> 32);
        byArray2[arg2++] = (byte)(arg0 >>> 40);
        byArray[arg2++] = (byte)(arg0 >>> 48);
        byArray2[arg2] = (byte)(arg0 >>> 56);
    }

    public static void cfr_renamed_878(int arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3 - 1;
        while (n2 >= 0) {
            int n3 = arg2 + n;
            byte by = (byte)(arg0 >>> 8 * n);
            arg1[n3] = by;
            n2 = --n;
        }
    }

    public static int cfr_renamed_873(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = n = arg2 - 1;
        while (n3 >= 0) {
            int n4 = arg0[arg1 + n] & 0xFF;
            int n5 = 8 * n;
            n2 |= n4 << n5;
            n3 = --n;
        }
        return n2;
    }

    public static byte[] cfr_renamed_891(int[] arg0, int arg1) {
        int n;
        int n2 = arg0.length;
        byte[] byArray = new byte[arg1];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 <= n2 - 2) {
            int n5 = arg0[n];
            sprpoa.cfr_renamed_877(n5, byArray, n3);
            n3 += 4;
            n4 = ++n;
        }
        int n6 = n3;
        sprpoa.cfr_renamed_878(arg0[n2 - 1], byArray, n6, arg1 - n6);
        return byArray;
    }
}


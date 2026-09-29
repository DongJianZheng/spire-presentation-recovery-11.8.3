/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public abstract class sprpuh {
    public static void cfr_renamed_8719(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprpuh.cfr_renamed_8732(arg0[arg1 + n], arg3, arg4 + n++ * 4);
            n2 = n;
        }
    }

    public static void cfr_renamed_8863(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byArray[arg2++] = (byte)arg0;
        arg1[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2] = (byte)(arg0 >>> 16);
    }

    public static void cfr_renamed_8722(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg3 + n;
            int n4 = sprpuh.cfr_renamed_8727(arg0, arg1 + n * 4);
            arg2[n3] = n4;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_8730(long arg0, byte[] arg1, int arg2) {
        sprpuh.cfr_renamed_8732((int)arg0, arg1, arg2);
        sprpuh.cfr_renamed_8863((int)(arg0 >>> 32), arg1, arg2 + 4);
    }

    public static void cfr_renamed_8732(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)arg0;
        byArray2[arg2++] = (byte)(arg0 >>> 8);
        byArray[arg2++] = (byte)(arg0 >>> 16);
        byArray2[arg2] = (byte)(arg0 >>> 24);
    }

    public static int cfr_renamed_8729(byte[] arg0, int arg1) {
        int n;
        int n2 = n;
        n2 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8;
        return n2;
    }

    public static int cfr_renamed_8727(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16 | arg0[++arg1] << 24;
        return n4;
    }

    public static int cfr_renamed_8728(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = n2;
        n3 = n;
        n3 = arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16;
        return n3;
    }
}


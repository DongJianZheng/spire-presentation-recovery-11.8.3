/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproef;
import com.spire.presentation.packages.sprsdz;
import com.spire.presentation.packages.sprzxe;

public final class sprbaf {
    public static int cfr_renamed_887(byte[] arg0) {
        int n;
        if (arg0.length > 4) {
            throw new ArithmeticException(sprsdz.cfr_renamed_9("\bi\u0017f\rn\u0005'\bi\u0011r\u0015'\rb\u000f`\u0015o"));
        }
        if (arg0.length == 0) {
            return 0;
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4 = arg0[n] & 0xFF;
            int n5 = 8 * (arg0.length - 1 - n);
            n2 |= n4 << n5;
            n3 = ++n;
        }
        return n2;
    }

    public static int[] cfr_renamed_889(byte[] arg0) {
        int n;
        int n2 = (arg0.length + 3) / 4;
        int n3 = arg0.length & 3;
        int[] nArray = new int[n2];
        int n4 = 0;
        int n5 = n = 0;
        while (n5 <= n2 - 2) {
            nArray[n++] = sprbaf.cfr_renamed_871(arg0, n4);
            n4 += 4;
            n5 = n;
        }
        if (n3 != 0) {
            nArray[n2 - 1] = sprbaf.cfr_renamed_873(arg0, n4, n3);
            return nArray;
        }
        nArray[n2 - 1] = sprbaf.cfr_renamed_871(arg0, n4);
        return nArray;
    }

    public static byte[] cfr_renamed_1129(int arg0, int arg1) throws ArithmeticException {
        int n;
        if (arg0 < 0) {
            return null;
        }
        int n2 = sproef.cfr_renamed_872(arg0);
        if (n2 > arg1) {
            throw new ArithmeticException(sprzxe.cfr_renamed_9("%B\bM\tWFF\b@\tG\u0003\u0003\u0001J\u0010F\b\u0003\u000fM\u0012F\u0001F\u0014\u0003\u000fM\u0012LFP\u0016F\u0005J\u0000J\u0003GFM\u0013N\u0004F\u0014\u0003\tEFL\u0005W\u0003W\u0015\r"));
        }
        byte[] byArray = new byte[arg1];
        int n3 = n = arg1 - 1;
        while (n3 >= arg1 - n2) {
            int n4 = n;
            byte by = (byte)(arg0 >>> 8 * (arg1 - 1 - n));
            byArray[n4] = by;
            n3 = --n;
        }
        return byArray;
    }

    public static int cfr_renamed_871(byte[] arg0, int arg1) {
        int n = arg0[arg1] & 0xFF;
        int n2 = n << 24;
        int n3 = arg0[++arg1] & 0xFF;
        n2 |= n3 << 16;
        int n4 = arg0[++arg1] & 0xFF;
        n2 |= n4 << 8;
        return n2 |= arg0[++arg1] & 0xFF;
    }

    private /* synthetic */ sprbaf() {
    }

    public static void cfr_renamed_878(int arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3 - 1;
        while (n2 >= 0) {
            int n3 = arg2 + n;
            byte by = (byte)(arg0 >>> 8 * (arg3 - 1 - n));
            arg1[n3] = by;
            n2 = --n;
        }
    }

    public static byte[] cfr_renamed_886(int arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byArray[0] = (byte)(arg0 >>> 24);
        byArray[1] = (byte)(arg0 >>> 16);
        byArray2[2] = (byte)(arg0 >>> 8);
        byArray[3] = (byte)arg0;
        return byArray2;
    }

    public static long cfr_renamed_885(byte[] arg0, int arg1) {
        long l = arg0[arg1];
        long l2 = (l & 0xFFL) << 56;
        long l3 = arg0[++arg1];
        l2 |= (l3 & 0xFFL) << 48;
        long l4 = arg0[++arg1];
        l2 |= (l4 & 0xFFL) << 40;
        long l5 = arg0[++arg1];
        l2 |= (l5 & 0xFFL) << 32;
        long l6 = arg0[++arg1];
        l2 |= (l6 & 0xFFL) << 24;
        int n = arg0[++arg1] & 0xFF;
        l2 |= (long)(n << 16);
        int n2 = arg0[++arg1] & 0xFF;
        l2 |= (long)(n2 << 8);
        return l2 |= (long)(arg0[++arg1] & 0xFF);
    }

    public static void cfr_renamed_877(int arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    public static void cfr_renamed_890(long arg0, byte[] arg1, int arg2) {
        byte[] byArray = arg1;
        byte[] byArray2 = arg1;
        byArray[arg2++] = (byte)(arg0 >>> 56);
        byArray2[arg2++] = (byte)(arg0 >>> 48);
        byArray[arg2++] = (byte)(arg0 >>> 40);
        byArray2[arg2++] = (byte)(arg0 >>> 32);
        byArray[arg2++] = (byte)(arg0 >>> 24);
        byArray2[arg2++] = (byte)(arg0 >>> 16);
        byArray[arg2++] = (byte)(arg0 >>> 8);
        byArray2[arg2] = (byte)arg0;
    }

    public static int cfr_renamed_873(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg0.length == 0 || arg0.length < arg1 + arg2 - 1) {
            return 0;
        }
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = arg0[arg1 + n] & 0xFF;
            int n5 = 8 * (arg2 - n - 1);
            n2 |= n4 << n5;
            n3 = ++n;
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
            sprbaf.cfr_renamed_877(n5, byArray, n3);
            n3 += 4;
            n4 = ++n;
        }
        int n6 = n3;
        sprbaf.cfr_renamed_878(arg0[n2 - 1], byArray, n6, arg1 - n6);
        return byArray;
    }

    public static byte[] cfr_renamed_898(int[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length << 2];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprbaf.cfr_renamed_877(arg0[n], byArray, n++ << 2);
            n2 = n;
        }
        return byArray;
    }

    public static byte[] cfr_renamed_888(long arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[8];
        byArray[0] = (byte)(arg0 >>> 56);
        byArray[1] = (byte)(arg0 >>> 48);
        byArray[2] = (byte)(arg0 >>> 40);
        byArray[3] = (byte)(arg0 >>> 32);
        byArray[4] = (byte)(arg0 >>> 24);
        byArray[5] = (byte)(arg0 >>> 16);
        byArray2[6] = (byte)(arg0 >>> 8);
        byArray[7] = (byte)arg0;
        return byArray2;
    }
}


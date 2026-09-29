/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spruaf;

public abstract class spruch {
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    public static void cfr_renamed_8712(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5) {
        int n = arg1 >>> 5;
        int n2 = arg1 & 0x1F;
        long l = 0L;
        long l2 = 0L;
        if (n2 == 0) {
            int n3;
            int n4 = n3 = n;
            while (n4 <= arg0) {
                l += (long)arg2[n3] & 0xFFFFFFFFL;
                l2 += (long)arg3[n3] & 0xFFFFFFFFL;
                long l3 = l += (long)arg4[n3 - n] & 0xFFFFFFFFL;
                arg2[n3] = (int)l3;
                l = l3 >>> 32;
                arg3[n3] = (int)(l2 += (long)arg5[n3 - n] & 0xFFFFFFFFL);
                l2 >>>= 32;
                n4 = ++n3;
            }
        } else {
            int n5;
            int n6 = 0;
            int n7 = 0;
            int n8 = n5 = n;
            while (n8 <= arg0) {
                int n9 = arg4[n5 - n];
                int n10 = arg5[n5 - n];
                int n11 = n9 << n2 | n6 >>> -n2;
                int n12 = n10 << n2 | n7 >>> -n2;
                n6 = n9;
                n7 = n10;
                l += (long)arg2[n5] & 0xFFFFFFFFL;
                l2 += (long)arg3[n5] & 0xFFFFFFFFL;
                arg2[n5] = (int)(l += (long)n11 & 0xFFFFFFFFL);
                l >>>= 32;
                arg3[n5] = (int)(l2 += (long)n12 & 0xFFFFFFFFL);
                l2 >>>= 32;
                n8 = ++n5;
            }
        }
    }

    public static int cfr_renamed_8713(int arg0, int[] arg1) {
        int n;
        int n2 = n = arg0;
        while (n2 > 0 && arg1[n] == 0) {
            n2 = --n;
        }
        return n * 32 + 32 - spruaf.cfr_renamed_5201(arg1[n]);
    }

    public static boolean cfr_renamed_8550(int arg0, int[] arg1, int[] arg2) {
        int n = arg0;
        do {
            int n2;
            int n3;
            if ((n3 = arg1[n] + Integer.MIN_VALUE) < (n2 = arg2[n] + Integer.MIN_VALUE)) {
                return true;
            }
            if (n3 <= n2) continue;
            return false;
        } while (--n >= 0);
        return false;
    }

    public static void cfr_renamed_8714(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        int n = arg1 >>> 5;
        int n2 = arg1 & 0x1F;
        long l = 0L;
        long l2 = 0L;
        if (n2 == 0) {
            int n3;
            int n4 = n3 = n;
            while (n4 <= arg0) {
                l2 += (long)arg2[n3] & 0xFFFFFFFFL;
                l2 += (long)arg4[n3 - n] & 0xFFFFFFFFL;
                l += (long)arg4[n3] & 0xFFFFFFFFL;
                long l3 = l += (long)arg3[n3 - n] & 0xFFFFFFFFL;
                arg4[n3] = (int)l3;
                l = l3 >>> 32;
                arg2[n3] = (int)(l2 += (long)arg4[n3 - n] & 0xFFFFFFFFL);
                l2 >>>= 32;
                n4 = ++n3;
            }
        } else {
            int n5;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = n5 = n;
            while (n9 <= arg0) {
                int n10 = arg4[n5 - n];
                int n11 = n10 << n2 | n6 >>> -n2;
                n6 = n10;
                l2 += (long)arg2[n5] & 0xFFFFFFFFL;
                l2 += (long)n11 & 0xFFFFFFFFL;
                int n12 = arg3[n5 - n];
                int n13 = n12 << n2 | n8 >>> -n2;
                n8 = n12;
                l += (long)arg4[n5] & 0xFFFFFFFFL;
                arg4[n5] = (int)(l += (long)n13 & 0xFFFFFFFFL);
                l >>>= 32;
                int n14 = arg4[n5 - n];
                int n15 = n14 << n2 | n7 >>> -n2;
                n7 = n14;
                arg2[n5] = (int)(l2 += (long)n15 & 0xFFFFFFFFL);
                l2 >>>= 32;
                n9 = ++n5;
            }
        }
    }

    public static void cfr_renamed_8715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5) {
        int n = arg1 >>> 5;
        int n2 = arg1 & 0x1F;
        long l = 0L;
        long l2 = 0L;
        if (n2 == 0) {
            int n3;
            int n4 = n3 = n;
            while (n4 <= arg0) {
                l += (long)arg2[n3] & 0xFFFFFFFFL;
                l2 += (long)arg3[n3] & 0xFFFFFFFFL;
                long l3 = l -= (long)arg4[n3 - n] & 0xFFFFFFFFL;
                arg2[n3] = (int)l3;
                l = l3 >> 32;
                arg3[n3] = (int)(l2 -= (long)arg5[n3 - n] & 0xFFFFFFFFL);
                l2 >>= 32;
                n4 = ++n3;
            }
        } else {
            int n5;
            int n6 = 0;
            int n7 = 0;
            int n8 = n5 = n;
            while (n8 <= arg0) {
                int n9 = arg4[n5 - n];
                int n10 = arg5[n5 - n];
                int n11 = n9 << n2 | n6 >>> -n2;
                int n12 = n10 << n2 | n7 >>> -n2;
                n6 = n9;
                n7 = n10;
                l += (long)arg2[n5] & 0xFFFFFFFFL;
                l2 += (long)arg3[n5] & 0xFFFFFFFFL;
                arg2[n5] = (int)(l -= (long)n11 & 0xFFFFFFFFL);
                l >>= 32;
                arg3[n5] = (int)(l2 -= (long)n12 & 0xFFFFFFFFL);
                l2 >>= 32;
                n8 = ++n5;
            }
        }
    }

    public static int cfr_renamed_8716(int arg0, int[] arg1) {
        int n = arg0;
        int n2 = arg1[n] >> 31;
        int n3 = n;
        while (n3 > 0 && arg1[n] == n2) {
            n3 = --n;
        }
        return n * 32 + 32 - spruaf.cfr_renamed_5201(arg1[n] ^ n2);
    }

    public static void cfr_renamed_8717(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        int n = arg1 >>> 5;
        int n2 = arg1 & 0x1F;
        long l = 0L;
        long l2 = 0L;
        if (n2 == 0) {
            int n3;
            int n4 = n3 = n;
            while (n4 <= arg0) {
                l2 += (long)arg2[n3] & 0xFFFFFFFFL;
                l2 -= (long)arg4[n3 - n] & 0xFFFFFFFFL;
                l += (long)arg4[n3] & 0xFFFFFFFFL;
                long l3 = l -= (long)arg3[n3 - n] & 0xFFFFFFFFL;
                arg4[n3] = (int)l3;
                l = l3 >> 32;
                arg2[n3] = (int)(l2 -= (long)arg4[n3 - n] & 0xFFFFFFFFL);
                l2 >>= 32;
                n4 = ++n3;
            }
        } else {
            int n5;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = n5 = n;
            while (n9 <= arg0) {
                int n10 = arg4[n5 - n];
                int n11 = n10 << n2 | n6 >>> -n2;
                n6 = n10;
                l2 += (long)arg2[n5] & 0xFFFFFFFFL;
                l2 -= (long)n11 & 0xFFFFFFFFL;
                int n12 = arg3[n5 - n];
                int n13 = n12 << n2 | n8 >>> -n2;
                n8 = n12;
                l += (long)arg4[n5] & 0xFFFFFFFFL;
                arg4[n5] = (int)(l -= (long)n13 & 0xFFFFFFFFL);
                l >>= 32;
                int n14 = arg4[n5 - n];
                int n15 = n14 << n2 | n7 >>> -n2;
                n7 = n14;
                arg2[n5] = (int)(l2 -= (long)n15 & 0xFFFFFFFFL);
                l2 >>= 32;
                n9 = ++n5;
            }
        }
    }
}


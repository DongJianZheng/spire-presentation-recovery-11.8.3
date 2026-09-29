/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spryrb;

public abstract class sprvmb {
    private static final long cfr_renamed_4 = 0xFFFFFFFFL;

    public static void cfr_renamed_1750(int[] arg0, int[] arg1, int[] arg2, int[] arg3) {
        int n;
        int n2 = 0;
        long l = (long)arg1[0] & 0xFFFFFFFFL;
        int n3 = n = 0;
        while (n3 < 8) {
            int n4;
            long l2 = (long)arg0[n] & 0xFFFFFFFFL;
            long l3 = l2 * l + ((long)arg2[0] & 0xFFFFFFFFL);
            long l4 = l3 & 0xFFFFFFFFL;
            l3 = (l3 >>> 32) + l4;
            int n5 = n4 = 1;
            while (n5 < 8) {
                long l5 = l2 * ((long)arg1[n4] & 0xFFFFFFFFL);
                long l6 = l4 * ((long)arg3[n4] & 0xFFFFFFFFL);
                long l7 = l3 += (l5 & 0xFFFFFFFFL) + (l6 & 0xFFFFFFFFL) + ((long)arg2[n4] & 0xFFFFFFFFL);
                arg2[n4 - 1] = (int)l7;
                l3 = (l7 >>> 32) + (l5 >>> 32) + (l6 >>> 32);
                n5 = ++n4;
            }
            long l8 = l3 += (long)n2 & 0xFFFFFFFFL;
            arg2[7] = (int)l8;
            n2 = (int)(l8 >>> 32);
            n3 = ++n;
        }
        if (n2 != 0 || spryrb.cfr_renamed_1649(arg2, arg3)) {
            spryrb.cfr_renamed_1641(arg2, arg3, arg2);
        }
    }

    public static void cfr_renamed_1751(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3;
            long l;
            long l2 = l = (long)arg0[0] & 0xFFFFFFFFL;
            int n4 = n3 = 1;
            while (n4 < 8) {
                long l3 = l2 += l * ((long)arg1[n3] & 0xFFFFFFFFL) + ((long)arg0[n3] & 0xFFFFFFFFL);
                arg0[n3 - 1] = (int)l3;
                l2 = l3 >>> 32;
                n4 = ++n3;
            }
            arg0[7] = (int)l2;
            n2 = ++n;
        }
        if (spryrb.cfr_renamed_1649(arg0, arg1)) {
            spryrb.cfr_renamed_1641(arg0, arg1, arg0);
        }
    }

    public static void cfr_renamed_1752(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        int n;
        int n2 = 0;
        long l = (long)arg1[0] & 0xFFFFFFFFL;
        int n3 = n = 0;
        while (n3 < 8) {
            int n4;
            long l2 = (long)arg2[0] & 0xFFFFFFFFL;
            long l3 = (long)arg0[n] & 0xFFFFFFFFL;
            long l4 = l3 * l;
            long l5 = (l4 & 0xFFFFFFFFL) + l2;
            long l6 = (long)((int)l5 * arg4) & 0xFFFFFFFFL;
            long l7 = l6 * ((long)arg3[0] & 0xFFFFFFFFL);
            l5 += l7 & 0xFFFFFFFFL;
            l5 = (l5 >>> 32) + (l4 >>> 32) + (l7 >>> 32);
            int n5 = n4 = 1;
            while (n5 < 8) {
                l4 = l3 * ((long)arg1[n4] & 0xFFFFFFFFL);
                l7 = l6 * ((long)arg3[n4] & 0xFFFFFFFFL);
                long l8 = l5 += (l4 & 0xFFFFFFFFL) + (l7 & 0xFFFFFFFFL) + ((long)arg2[n4] & 0xFFFFFFFFL);
                arg2[n4 - 1] = (int)l8;
                l5 = (l8 >>> 32) + (l4 >>> 32) + (l7 >>> 32);
                n5 = ++n4;
            }
            long l9 = l5 += (long)n2 & 0xFFFFFFFFL;
            arg2[7] = (int)l9;
            n2 = (int)(l9 >>> 32);
            n3 = ++n;
        }
        if (n2 != 0 || spryrb.cfr_renamed_1649(arg2, arg3)) {
            spryrb.cfr_renamed_1641(arg2, arg3, arg2);
        }
    }

    public static int cfr_renamed_1753(int arg0) {
        int n;
        int n2 = n = arg0;
        int n3 = n = n2 * (2 - arg0 * n2);
        int n4 = n = n3 * (2 - arg0 * n3);
        int n5 = n = n4 * (2 - arg0 * n4);
        n = n5 * (2 - arg0 * n5);
        return n;
    }

    public static void cfr_renamed_1754(int[] arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3;
            int n4 = arg0[0];
            long l = (long)(n4 * arg2) & 0xFFFFFFFFL;
            long l2 = l * ((long)arg1[0] & 0xFFFFFFFFL) + ((long)n4 & 0xFFFFFFFFL);
            l2 >>>= 32;
            int n5 = n3 = 1;
            while (n5 < 8) {
                long l3 = l2 += l * ((long)arg1[n3] & 0xFFFFFFFFL) + ((long)arg0[n3] & 0xFFFFFFFFL);
                arg0[n3 - 1] = (int)l3;
                l2 = l3 >>> 32;
                n5 = ++n3;
            }
            arg0[7] = (int)l2;
            n2 = ++n;
        }
        if (spryrb.cfr_renamed_1649(arg0, arg1)) {
            spryrb.cfr_renamed_1641(arg0, arg1, arg0);
        }
    }
}


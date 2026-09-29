/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprptf;
import com.spire.presentation.packages.sprvtf;

public class sprleg {
    public static final int cfr_renamed_91 = 16;
    public static final int cfr_renamed_0 = 65536;
    public static final int cfr_renamed_1 = 32;
    public static final int cfr_renamed_2 = 13312;
    public static final int cfr_renamed_3 = 32;
    public static final int cfr_renamed_4 = 32;

    public static int cfr_renamed_6061(sprptf arg0, byte[] arg1, int arg2, byte[] arg3, byte[] arg4, byte[] arg5, byte[] arg6) {
        int n;
        int n2;
        byte[] byArray = new byte[0x200000];
        int n3 = arg2;
        byte[] byArray2 = new byte[4194272];
        sprleg.cfr_renamed_6067(byArray, arg4);
        int n4 = n2 = 0;
        while (n4 < 65536) {
            arg0.cfr_renamed_6068(byArray2, (65535 + n2) * 32, byArray, n2++ * 32);
            n4 = n2;
        }
        int n5 = n2 = 0;
        while (n5 < 16) {
            long l = (1 << 16 - n2) - 1;
            long l2 = (1 << 16 - n2 - 1) - 1;
            int n6 = n = 0;
            while (n6 < 1 << 16 - n2 - 1) {
                arg0.cfr_renamed_6054(byArray2, (int)((l2 + (long)(++n)) * 32L), byArray2, (int)((l + (long)(2 * n)) * 32L), arg5, 2 * n2 * 32);
                n6 = n;
            }
            n5 = ++n2;
        }
        int n7 = n = 2016;
        while (n7 < 4064) {
            int n8 = n3++;
            byte by = byArray2[n];
            arg1[n8] = by;
            n7 = ++n;
        }
        int n9 = n2 = 0;
        while (n9 < 32) {
            int n10;
            int n11 = (arg6[2 * n2] & 0xFF) + ((arg6[2 * n2 + 1] & 0xFF) << 8);
            int n12 = n10 = 0;
            while (n12 < 32) {
                int n13 = n3++;
                byte by = byArray[n11 * 32 + n10];
                arg1[n13] = by;
                n12 = ++n10;
            }
            n11 += 65535;
            int n14 = n = 0;
            while (n14 < 10) {
                int n15 = n11;
                n11 = (n11 & 1) != 0 ? n15 + 1 : n15 - 1;
                int n16 = n10 = 0;
                while (n16 < 32) {
                    int n17 = n3++;
                    byte by = byArray2[n11 * 32 + n10];
                    arg1[n17] = by;
                    n16 = ++n10;
                }
                n11 = (n11 - 1) / 2;
                n14 = ++n;
            }
            n9 = ++n2;
        }
        int n18 = n2 = 0;
        while (n18 < 32) {
            int n19 = n2++;
            arg3[n19] = byArray2[n19];
            n18 = n2;
        }
        return 13312;
    }

    public static void cfr_renamed_6067(byte[] arg0, byte[] arg1) {
        sprvtf.cfr_renamed_6046(arg0, 0, 0x200000L, arg1, 0);
    }

    public static int cfr_renamed_6069(sprptf arg0, byte[] arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5) {
        int n;
        int n2;
        byte[] byArray = new byte[1024];
        int n3 = arg3 + 2048;
        int n4 = n2 = 0;
        while (n4 < 32) {
            int n5;
            int n6 = (arg5[2 * n2] & 0xFF) + ((arg5[2 * n2 + 1] & 0xFF) << 8);
            if ((n6 & 1) == 0) {
                arg0.cfr_renamed_6068(byArray, 0, arg2, n3);
                n5 = 0;
                int n7 = n5;
                while (n7 < 32) {
                    int n8 = 32 + n5;
                    byte by = arg2[n3 + 32 + n5];
                    byArray[n8] = by;
                    n7 = ++n5;
                }
            } else {
                arg0.cfr_renamed_6068(byArray, 32, arg2, n3);
                n5 = 0;
                int n9 = n5;
                while (n9 < 32) {
                    int n10 = n5++;
                    byArray[n10] = arg2[n3 + 32 + n10];
                    n9 = n5;
                }
            }
            n3 += 64;
            int n11 = n = 1;
            while (n11 < 10) {
                if (((n6 >>>= 1) & 1) == 0) {
                    arg0.cfr_renamed_6054(byArray, 0, byArray, 0, arg4, 2 * (n - 1) * 32);
                    n5 = 0;
                    int n12 = n5;
                    while (n12 < 32) {
                        int n13 = 32 + n5;
                        byte by = arg2[n3 + n5];
                        byArray[n13] = by;
                        n12 = ++n5;
                    }
                } else {
                    arg0.cfr_renamed_6054(byArray, 32, byArray, 0, arg4, 2 * (n - 1) * 32);
                    n5 = 0;
                    int n14 = n5;
                    while (n14 < 32) {
                        int n15 = n5++;
                        byArray[n15] = arg2[n3 + n15];
                        n14 = n5;
                    }
                }
                n3 += 32;
                n11 = ++n;
            }
            n6 >>>= 1;
            arg0.cfr_renamed_6054(byArray, 0, byArray, 0, arg4, 576);
            n5 = 0;
            int n16 = n5;
            while (n16 < 32) {
                if (arg2[arg3 + n6 * 32 + n5] != byArray[n5]) {
                    int n17 = n5 = 0;
                    while (n17 < 32) {
                        arg1[n5++] = 0;
                        n17 = n5;
                    }
                    return -1;
                }
                n16 = ++n5;
            }
            n4 = ++n2;
        }
        int n18 = n = 0;
        while (n18 < 32) {
            int n19 = n * 32;
            int n20 = arg3 + 2 * n * 32;
            arg0.cfr_renamed_6054(byArray, n19, arg2, n20, arg4, 640);
            n18 = ++n;
        }
        int n21 = n = 0;
        while (n21 < 16) {
            arg0.cfr_renamed_6054(byArray, ++n * 32, byArray, 2 * n * 32, arg4, 704);
            n21 = n;
        }
        int n22 = n = 0;
        while (n22 < 8) {
            arg0.cfr_renamed_6054(byArray, ++n * 32, byArray, 2 * n * 32, arg4, 768);
            n22 = n;
        }
        int n23 = n = 0;
        while (n23 < 4) {
            arg0.cfr_renamed_6054(byArray, ++n * 32, byArray, 2 * n * 32, arg4, 832);
            n23 = n;
        }
        int n24 = n = 0;
        while (n24 < 2) {
            arg0.cfr_renamed_6054(byArray, ++n * 32, byArray, 2 * n * 32, arg4, 896);
            n24 = n;
        }
        arg0.cfr_renamed_6054(arg1, 0, byArray, 0, arg4, 960);
        return 0;
    }
}


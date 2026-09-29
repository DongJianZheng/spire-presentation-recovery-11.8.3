/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraeg;
import com.spire.presentation.packages.spruxf;

public class sprcuf {
    public static void cfr_renamed_6546(int[] arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3 = 8;
        int n4 = 128;
        int n5 = 1 << arg3;
        int[] nArray = new int[n5];
        int[] nArray2 = new int[n5];
        int[] nArray3 = new int[n3 - 1];
        int[] nArray4 = new int[n4];
        int[] nArray5 = new int[n4];
        int[] nArray6 = new int[n3 - 1];
        int[] nArray7 = new int[n4];
        sprcuf.cfr_renamed_6594(nArray6, n3);
        sprcuf.cfr_renamed_6595(nArray7, nArray6, n3 - 1);
        int n6 = arg3;
        sprcuf.cfr_renamed_6596(nArray, nArray2, arg1, n6, n6);
        int n7 = n2 = 0;
        while (n7 < n3 - 1) {
            int n8 = n2;
            int n9 = spraeg.cfr_renamed_838(nArray6[n2], nArray6[n8]) ^ nArray6[n2];
            nArray3[n8] = n9;
            n7 = ++n2;
        }
        sprcuf.cfr_renamed_6597(nArray4, nArray, (arg2 + 1) / 2, n3 - 1, arg3 - 1, nArray3, arg3, n3);
        sprcuf.cfr_renamed_6597(nArray5, nArray2, arg2 / 2, n3 - 1, arg3 - 1, nArray3, arg3, n3);
        n2 = 1;
        n2 = 1 << n3 - 1;
        int[] nArray8 = arg0;
        int n10 = n2;
        System.arraycopy(nArray5, 0, arg0, n10, n10);
        int n11 = n2;
        arg0[0] = nArray4[0];
        nArray8[n11] = nArray8[n11] ^ nArray4[0];
        int n12 = n = 1;
        while (n12 < n2) {
            int[] nArray9 = arg0;
            int n13 = n;
            arg0[n13] = nArray4[n] ^ spraeg.cfr_renamed_838(nArray7[n13], nArray5[n]);
            int n14 = n2 + n;
            int n15 = nArray9[n14] ^ arg0[n];
            nArray9[n14] = n15;
            n12 = ++n;
        }
    }

    public static void cfr_renamed_6597(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        int n;
        int n2 = 1 << arg6 - 2;
        int n3 = 1 << arg7 - 2;
        int[] nArray = new int[n2];
        int[] nArray2 = new int[n2];
        int[] nArray3 = new int[arg7 - 2];
        int[] nArray4 = new int[arg7 - 2];
        int n4 = 1;
        int[] nArray5 = new int[n3];
        int[] nArray6 = new int[n3];
        int[] nArray7 = new int[n3];
        int[] nArray8 = new int[arg7 - arg6 + 1];
        int n5 = 0;
        if (arg4 == 1) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < arg3) {
                int n8 = n6++;
                nArray8[n8] = spraeg.cfr_renamed_838(arg5[n8], arg1[1]);
                n7 = n6;
            }
            arg0[0] = arg1[0];
            n5 = 1;
            int n9 = n6 = 0;
            while (n9 < arg3) {
                int n10;
                int n11 = n10 = 0;
                while (n11 < n5) {
                    arg0[n5 + ++n10] = arg0[n10] ^ nArray8[n6];
                    n11 = n10;
                }
                n5 <<= 1;
                n9 = ++n6;
            }
            return;
        }
        if (arg5[arg3 - 1] != 1) {
            int n12;
            n = 1;
            n5 = 1;
            n5 = 1 << arg4;
            int n13 = n12 = 1;
            while (n13 < n5) {
                n = spraeg.cfr_renamed_838(n, arg5[arg3 - 1]);
                arg1[++n12] = spraeg.cfr_renamed_838(n, arg1[n12]);
                n13 = n12;
            }
        }
        sprcuf.cfr_renamed_6596(nArray, nArray2, arg1, arg4, arg6);
        int n14 = n = 0;
        while (n14 < arg3 - 1) {
            int n15 = n;
            nArray3[n15] = spraeg.cfr_renamed_838(arg5[n15], spraeg.cfr_renamed_817(arg5[arg3 - 1]));
            int n16 = n;
            int n17 = spraeg.cfr_renamed_838(nArray3[n], nArray3[n16]) ^ nArray3[n];
            nArray4[n16] = n17;
            n14 = ++n;
        }
        sprcuf.cfr_renamed_6595(nArray5, nArray3, arg3 - 1);
        sprcuf.cfr_renamed_6597(nArray6, nArray, (arg2 + 1) / 2, arg3 - 1, arg4 - 1, nArray4, arg6, arg7);
        n4 = 1;
        n4 = 1 << (arg3 - 1 & 0xF);
        if (arg2 <= 3) {
            arg0[0] = nArray6[0];
            arg0[n4] = nArray6[0] ^ nArray2[0];
            int n18 = n = 1;
            while (n18 < n4) {
                int n19 = n;
                arg0[n19] = nArray6[n] ^ spraeg.cfr_renamed_838(nArray5[n19], nArray2[0]);
                arg0[n4 + ++n] = arg0[n] ^ nArray2[0];
                n18 = n;
            }
        } else {
            sprcuf.cfr_renamed_6597(nArray7, nArray2, arg2 / 2, arg3 - 1, arg4 - 1, nArray4, arg6, arg7);
            int n20 = n4;
            System.arraycopy(nArray7, 0, arg0, n20, n20);
            int n21 = n4;
            int[] nArray9 = arg0;
            arg0[0] = nArray6[0];
            nArray9[n21] = nArray9[n21] ^ nArray6[0];
            int n22 = n = 1;
            while (n22 < n4) {
                int[] nArray10 = arg0;
                int n23 = n;
                arg0[n23] = nArray6[n] ^ spraeg.cfr_renamed_838(nArray5[n23], nArray7[n]);
                int n24 = n4 + n;
                int n25 = nArray10[n24] ^ arg0[n];
                nArray10[n24] = n25;
                n22 = ++n;
            }
        }
    }

    public static void cfr_renamed_6598(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1;
        n2 = 1 << arg3 - 2;
        int n3 = 1 << arg4 - 2;
        int[] nArray = new int[2 * n3];
        int[] nArray2 = new int[2 * n3];
        int[] nArray3 = new int[n3];
        int[] nArray4 = new int[n3];
        int[] nArray5 = new int[n3];
        int[] nArray6 = new int[n3];
        spruxf.cfr_renamed_6528(arg2, 3 * n2, nArray, 0, 2 * n2);
        int n4 = n2;
        spruxf.cfr_renamed_6528(arg2, 3 * n2, nArray, n4, 2 * n4);
        spruxf.cfr_renamed_6528(arg2, 0, nArray2, 0, 4 * n2);
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = n;
            nArray[n6] = nArray[n6] ^ arg2[2 * n2 + n];
            int n7 = n2 + n;
            int n8 = nArray2[n7] ^ nArray[n];
            nArray2[n7] = n8;
            n5 = ++n;
        }
        sprcuf.cfr_renamed_6596(nArray3, nArray4, nArray, arg3 - 1, arg4);
        sprcuf.cfr_renamed_6596(nArray5, nArray6, nArray2, arg3 - 1, arg4);
        spruxf.cfr_renamed_6528(nArray5, 0, arg0, 0, 2 * n2);
        int n9 = n2;
        spruxf.cfr_renamed_6528(nArray3, 0, arg0, n9, 2 * n9);
        spruxf.cfr_renamed_6528(nArray6, 0, arg1, 0, 2 * n2);
        int n10 = n2;
        spruxf.cfr_renamed_6528(nArray4, 0, arg1, n10, 2 * n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_6596(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        switch (arg3) {
            case 4: {
                arg0[4] = arg2[8] ^ arg2[12];
                arg0[6] = arg2[12] ^ arg2[14];
                arg0[7] = arg2[14] ^ arg2[15];
                arg1[5] = arg2[11] ^ arg2[13];
                arg1[6] = arg2[13] ^ arg2[14];
                arg1[7] = arg2[15];
                arg0[5] = arg2[10] ^ arg2[12] ^ arg1[5];
                arg1[4] = arg2[9] ^ arg2[13] ^ arg0[5];
                arg0[0] = arg2[0];
                arg1[3] = arg2[7] ^ arg2[11] ^ arg2[15];
                arg0[3] = arg2[6] ^ arg2[10] ^ arg2[14] ^ arg1[3];
                arg0[2] = arg2[4] ^ arg0[4] ^ arg0[3] ^ arg1[3];
                arg1[1] = arg2[3] ^ arg2[5] ^ arg2[9] ^ arg2[13] ^ arg1[3];
                arg1[2] = arg2[3] ^ arg1[1] ^ arg0[3];
                arg0[1] = arg2[2] ^ arg0[2] ^ arg1[1];
                arg1[0] = arg2[1] ^ arg0[1];
                return;
            }
            case 3: {
                arg0[0] = arg2[0];
                arg0[2] = arg2[4] ^ arg2[6];
                arg0[3] = arg2[6] ^ arg2[7];
                arg1[1] = arg2[3] ^ arg2[5] ^ arg2[7];
                arg1[2] = arg2[5] ^ arg2[6];
                arg1[3] = arg2[7];
                arg0[1] = arg2[2] ^ arg0[2] ^ arg1[1];
                arg1[0] = arg2[1] ^ arg0[1];
                return;
            }
            case 2: {
                arg0[0] = arg2[0];
                arg0[1] = arg2[2] ^ arg2[3];
                arg1[0] = arg2[1] ^ arg0[1];
                arg1[1] = arg2[3];
                return;
            }
            case 1: {
                arg0[0] = arg2[0];
                arg1[0] = arg2[1];
                return;
            }
        }
        sprcuf.cfr_renamed_6598(arg0, arg1, arg2, arg3, arg4);
    }

    public static void cfr_renamed_6594(int[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1 - 1) {
            int n3 = n++;
            arg0[n3] = 1 << arg1 - 1 - n3;
            n2 = n;
        }
    }

    public static void cfr_renamed_6595(int[] arg0, int[] arg1, int arg2) {
        int n;
        arg0[0] = 0;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 1 << n) {
                arg0[(1 << n) + ++n3] = arg1[n] ^ arg0[n3];
                n4 = n3;
            }
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6547(byte[] arg0, int[] arg1, int arg2, int[] arg3) {
        int n;
        int n2 = 8;
        int n3 = 255;
        int[] nArray = new int[n2 - 1];
        int[] nArray2 = new int[arg2];
        int n4 = arg2;
        byte[] byArray = arg0;
        byte[] byArray2 = arg0;
        sprcuf.cfr_renamed_6594(nArray, n2);
        sprcuf.cfr_renamed_6595(nArray2, nArray, n2 - 1);
        byArray[0] = (byte)(byArray[0] ^ (1 ^ spruxf.cfr_renamed_6532(-arg1[0] >> 15)));
        byArray2[0] = (byte)(byArray2[0] ^ (1 ^ spruxf.cfr_renamed_6532(-arg1[n4] >> 15)));
        int n5 = n = 1;
        while (n5 < n4) {
            int n6 = n3 - arg3[nArray2[n]];
            byte[] byArray3 = arg0;
            byte[] byArray4 = arg0;
            int n7 = n6;
            byArray3[n7] = (byte)(byArray3[n7] ^ (1 ^ Math.abs(-arg1[n] >> 15)));
            n6 = n3 - arg3[nArray2[n] ^ 1];
            byte by = (byte)(byArray4[n6] ^ (1 ^ Math.abs(-arg1[n4 + n] >> 15)));
            byArray4[n6] = by;
            n5 = ++n;
        }
    }
}


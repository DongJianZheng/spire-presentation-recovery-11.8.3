/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrag;
import com.spire.presentation.packages.spruxf;

public class sprjwf {
    private static /* synthetic */ int cfr_renamed_6548(int[] arg0) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < 128) {
            int n6 = arg0[n];
            int n7 = n6 > 0 ? -1 : 0;
            int n8 = n7 & n6 | ~n7 & -n6;
            n3 = n8 > n2 ? n6 : n3;
            n4 = n8 > n2 ? n : n4;
            n2 = n8 > n2 ? n8 : n2;
            n5 = ++n;
        }
        n = n3 > 0 ? 1 : 0;
        return n4 |= 128 * n;
    }

    private static /* synthetic */ void cfr_renamed_6549(int[] arg0, sprrag[] arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 4) {
            int n4 = n = 0;
            while (n4 < 32) {
                long l = arg1[0 + arg2].cfr_renamed_3[n2] >> n & 1;
                int n5 = n2 * 32 + n;
                int n6 = arg1[0 + arg2].cfr_renamed_3[n2] >> n & 1;
                arg0[n5] = n6;
                n4 = ++n;
            }
            n3 = ++n2;
        }
        int n7 = n2 = 1;
        while (n7 < arg3) {
            int n8 = n = 0;
            while (n8 < 4) {
                int n9;
                int n10 = n9 = 0;
                while (n10 < 32) {
                    int n11 = n * 32 + n9;
                    int n12 = arg0[n11] + (arg1[n2 + arg2].cfr_renamed_3[n] >> n9 & 1);
                    arg0[n11] = n12;
                    n10 = ++n9;
                }
                n8 = ++n;
            }
            n7 = ++n2;
        }
    }

    public static void cfr_renamed_6550(sprrag arg0, int arg1) {
        int n = sprjwf.cfr_renamed_6551(arg1 >> 7);
        n ^= sprjwf.cfr_renamed_6551(arg1 >> 0) & 0xAAAAAAAA;
        n ^= sprjwf.cfr_renamed_6551(arg1 >> 1) & 0xCCCCCCCC;
        n ^= sprjwf.cfr_renamed_6551(arg1 >> 2) & 0xF0F0F0F0;
        n ^= sprjwf.cfr_renamed_6551(arg1 >> 3) & 0xFF00FF00;
        sprrag sprrag2 = arg0;
        sprrag sprrag3 = arg0;
        sprrag3.cfr_renamed_3[0] = n ^= sprjwf.cfr_renamed_6551(arg1 >> 4) & 0xFFFF0000;
        sprrag2.cfr_renamed_3[1] = n ^= sprjwf.cfr_renamed_6551(arg1 >> 5);
        sprrag3.cfr_renamed_3[3] = n ^= sprjwf.cfr_renamed_6551(arg1 >> 6);
        sprrag2.cfr_renamed_3[2] = n ^= sprjwf.cfr_renamed_6551(arg1 >> 5);
    }

    public static void cfr_renamed_6552(long[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3;
        byte[] byArray = sproze.cfr_renamed_158(arg1);
        sprrag[] sprragArray = new sprrag[arg2 * arg3];
        int n4 = n3 = 0;
        while (n4 < sprragArray.length) {
            sprragArray[n3++] = new sprrag();
            n4 = n3;
        }
        int n5 = n3 = 0;
        while (n5 < arg2) {
            n2 = n3 * arg3;
            sprjwf.cfr_renamed_6550(sprragArray[n2], byArray[n3]);
            int n6 = n = 1;
            while (n6 < arg3) {
                sprragArray[n2 + ++n] = sprragArray[n2];
                n6 = n;
            }
            n5 = ++n3;
        }
        int[] nArray = new int[sprragArray.length * 4];
        n2 = 0;
        int n7 = n = 0;
        while (n7 < sprragArray.length) {
            int n8 = n2;
            n2 += 4;
            System.arraycopy(sprragArray[n].cfr_renamed_3, 0, nArray, n8, sprragArray[n].cfr_renamed_3.length);
            n7 = ++n;
        }
        spruxf.cfr_renamed_6527(arg0, nArray);
    }

    private static /* synthetic */ int cfr_renamed_6551(int arg0) {
        return -(arg0 & 1) & 0xFFFFFFFF;
    }

    private static /* synthetic */ void cfr_renamed_6553(int[] arg0, int[] arg1) {
        int n;
        int[] nArray = sproze.cfr_renamed_535(arg0);
        int[] nArray2 = sproze.cfr_renamed_535(arg1);
        int n2 = n = 0;
        while (n2 < 7) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 64) {
                int n5 = n3;
                nArray2[n5] = nArray[2 * n5] + nArray[2 * n3 + 1];
                int n6 = n3 + 64;
                int n7 = nArray[2 * n3] - nArray[2 * n3 + 1];
                nArray2[n6] = n7;
                n4 = ++n3;
            }
            int[] nArray3 = nArray;
            nArray = nArray2;
            nArray2 = nArray3;
            n2 = ++n;
        }
        System.arraycopy(nArray2, 0, arg0, 0, arg0.length);
        System.arraycopy(nArray, 0, arg1, 0, arg1.length);
    }

    public static void cfr_renamed_6554(byte[] arg0, long[] arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3;
        byte[] byArray = sproze.cfr_renamed_158(arg0);
        sprrag[] sprragArray = new sprrag[arg1.length / 2];
        int[] nArray = new int[arg1.length * 2];
        spruxf.cfr_renamed_6530(nArray, arg1);
        int n4 = n3 = 0;
        while (n4 < sprragArray.length) {
            sprragArray[n3] = new sprrag();
            int n5 = n2 = 0;
            while (n5 < 4) {
                int n6 = n2++;
                sprragArray[n3].cfr_renamed_3[n6] = nArray[n3 * 4 + n6];
                n5 = n2;
            }
            n4 = ++n3;
        }
        int[] nArray2 = new int[128];
        int n7 = n2 = 0;
        while (n7 < arg2) {
            sprjwf.cfr_renamed_6549(nArray2, sprragArray, n2 * arg3, arg3);
            int[] nArray3 = new int[128];
            sprjwf.cfr_renamed_6553(nArray2, nArray3);
            nArray3[0] = nArray3[0] - 64 * arg3;
            byArray[n2++] = (byte)sprjwf.cfr_renamed_6548(nArray3);
            n7 = n2;
        }
        int[] nArray4 = new int[sprragArray.length * 4];
        int n8 = 0;
        int n9 = n = 0;
        while (n9 < sprragArray.length) {
            int n10 = n8;
            n8 += 4;
            System.arraycopy(sprragArray[n].cfr_renamed_3, 0, nArray4, n10, sprragArray[n].cfr_renamed_3.length);
            n9 = ++n;
        }
        spruxf.cfr_renamed_6527(arg1, nArray4);
        System.arraycopy(byArray, 0, arg0, 0, arg0.length);
    }
}


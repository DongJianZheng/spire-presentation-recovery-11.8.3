/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprud;

public class sprkjg {
    public static void cfr_renamed_7189(byte[] arg0, int arg1, int arg2, sprud arg3) {
        int n;
        byte[] byArray = new byte[4];
        int n2 = n = arg2 - 1;
        while (n2 >= 0) {
            arg3.cfr_renamed_6410(byArray, 0, 4);
            long l = (long)sprpxe.cfr_renamed_439(byArray, 0) & 0xFFFFFFFFL;
            l = l * (long)(arg1 - n) >> 32;
            int n3 = (int)l;
            if (sprkjg.cfr_renamed_7190(arg0, n3 += n) != 0) {
                n3 = n;
            }
            sprkjg.cfr_renamed_7191(arg0, n3);
            n2 = --n;
        }
    }

    public static void cfr_renamed_7191(byte[] arg0, int arg1) {
        int n = arg1 / 8;
        int n2 = arg1 % 8;
        int n3 = n;
        arg0[n3] = (byte)((long)arg0[n3] | 1L << (int)((long)n2));
    }

    public static int cfr_renamed_7190(byte[] arg0, int arg1) {
        int n = arg1 / 8;
        int n2 = arg1 % 8;
        return arg0[n] >>> n2 & 1;
    }

    public static void cfr_renamed_7192(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n;
            byte by = (byte)(arg1[n3] ^ arg0[n]);
            arg1[n3] = by;
            n2 = ++n;
        }
    }

    public static int cfr_renamed_7193(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            n2 += arg0[n++];
            n3 = n;
        }
        return n2;
    }

    public static void cfr_renamed_7194(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n = 0;
        int n2 = 0;
        long l = arg3;
        int n3 = n;
        while ((long)n3 < l) {
            int n4;
            int n5;
            if (n + 8 >= arg3) {
                n5 = arg1[arg2 + n];
                int n6 = arg3 - n - 1;
                while (n6 >= 1) {
                    n5 |= arg1[arg2 + n + n4] << n4--;
                    n6 = n4;
                }
                arg0[n2] = (byte)n5;
            } else {
                n5 = arg1[arg2 + n];
                int n7 = n4 = 7;
                while (n7 >= 1) {
                    n5 |= arg1[arg2 + n + n4] << n4--;
                    n7 = n4;
                }
                arg0[n2] = (byte)n5;
            }
            n3 = n += 8;
            ++n2;
        }
    }
}


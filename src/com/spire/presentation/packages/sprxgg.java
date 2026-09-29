/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfg;
import com.spire.presentation.packages.sprphg;

public class sprxgg
extends sprphg {
    public void cfr_renamed_7183(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        long[] lArray = new long[128];
        long[] lArray2 = new long[128];
        long[] lArray3 = new long[64];
        long[] lArray4 = new long[64];
        if (arg2 == 0) {
            n5 = this.cfr_renamed_2 * 2 + 40;
            n3 = 0;
        } else {
            n5 = this.cfr_renamed_2 * 2 + 40 + 12288;
            n3 = -1024;
        }
        int n6 = n2 = 0;
        while (n6 < 64) {
            lArray[n2 + 0] = sprbfg.cfr_renamed_7134(arg0, n4 + n2 * 16 + 0);
            int n7 = n2 + 64;
            long l = sprbfg.cfr_renamed_7134(arg0, n4 + n2 * 16 + 8);
            lArray[n7] = l;
            n6 = ++n2;
        }
        sprxgg.cfr_renamed_7184(lArray2, lArray, 0);
        sprxgg.cfr_renamed_7184(lArray2, lArray, 64);
        int n8 = n = 0;
        while (n8 <= 6) {
            int n9 = n2 = 0;
            while (n9 < 64) {
                long l = sprbfg.cfr_renamed_7134(arg1, n5);
                n5 += 8;
                lArray3[n2] = l;
                n9 = ++n2;
            }
            n5 += n3;
            sprxgg.cfr_renamed_7185(lArray4, lArray3);
            sprxgg.cfr_renamed_7186(lArray2, lArray4, n++);
            n8 = n;
        }
        sprxgg.cfr_renamed_7184(lArray, lArray2, 0);
        sprxgg.cfr_renamed_7184(lArray, lArray2, 64);
        int n10 = n = 0;
        while (n10 <= 5) {
            int n11 = n2 = 0;
            while (n11 < 64) {
                long l = sprbfg.cfr_renamed_7134(arg1, n5);
                n5 += 8;
                lArray3[n2] = l;
                n11 = ++n2;
            }
            n5 += n3;
            sprxgg.cfr_renamed_7187(lArray, lArray3, n++);
            n10 = n;
        }
        int n12 = n = 4;
        while (n12 >= 0) {
            int n13 = n2 = 0;
            while (n13 < 64) {
                long l = sprbfg.cfr_renamed_7134(arg1, n5);
                n5 += 8;
                lArray3[n2] = l;
                n13 = ++n2;
            }
            n5 += n3;
            sprxgg.cfr_renamed_7187(lArray, lArray3, n--);
            n12 = n;
        }
        sprxgg.cfr_renamed_7184(lArray2, lArray, 0);
        sprxgg.cfr_renamed_7184(lArray2, lArray, 64);
        int n14 = n = 6;
        while (n14 >= 0) {
            int n15 = n2 = 0;
            while (n15 < 64) {
                long l = sprbfg.cfr_renamed_7134(arg1, n5);
                n5 += 8;
                lArray3[n2] = l;
                n15 = ++n2;
            }
            n5 += n3;
            sprxgg.cfr_renamed_7185(lArray4, lArray3);
            sprxgg.cfr_renamed_7186(lArray2, lArray4, n--);
            n14 = n;
        }
        sprxgg.cfr_renamed_7184(lArray, lArray2, 0);
        sprxgg.cfr_renamed_7184(lArray, lArray2, 64);
        int n16 = n2 = 0;
        while (n16 < 64) {
            sprbfg.cfr_renamed_7129(arg0, n4 + n2 * 16 + 0, lArray[0 + n2]);
            int n17 = n4 + n2 * 16 + 8;
            int n18 = 64 + n2;
            sprbfg.cfr_renamed_7129(arg0, n17, lArray[n18]);
            n16 = ++n2;
        }
    }

    public static void cfr_renamed_7186(long[] arg0, long[] arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = 1 << arg2;
        int n4 = n = 0;
        while (n4 < 128) {
            int n5 = n;
            while (n5 < n + n3) {
                int n6;
                long[] lArray = arg0;
                long[] lArray2 = arg0;
                long l = arg0[n6 + 0] ^ arg0[n6 + n3];
                int n7 = n6 + 0;
                lArray2[n7] = lArray2[n7] ^ (l &= arg1[++n2]);
                int n8 = n6 + n3;
                lArray[n8] = lArray[n8] ^ l;
                n5 = ++n6;
            }
            n4 = n + n3 * 2;
        }
    }

    public static void cfr_renamed_7187(long[] arg0, long[] arg1, int arg2) {
        int n;
        int n2 = 0;
        int n3 = 1 << arg2;
        int n4 = n = 0;
        while (n4 < 64) {
            int n5 = n;
            while (n5 < n + n3) {
                int n6;
                long[] lArray = arg0;
                long[] lArray2 = arg0;
                long[] lArray3 = arg0;
                long l = lArray[n6 + 0] ^ arg0[n6 + n3];
                l &= arg1[n2];
                ++n2;
                int n7 = n6 + 0;
                lArray3[n7] = lArray3[n7] ^ l;
                int n8 = n6 + n3;
                lArray2[n8] = lArray2[n8] ^ l;
                l = lArray[64 + n6 + 0] ^ arg0[64 + n6 + n3];
                l &= arg1[n2];
                ++n2;
                int n9 = 64 + n6 + 0;
                lArray2[n9] = lArray2[n9] ^ l;
                int n10 = 64 + n6 + n3;
                lArray[n10] = lArray[n10] ^ l;
                n5 = ++n6;
            }
            n4 = n + n3 * 2;
        }
    }

    @Override
    public void cfr_renamed_7164(short[] arg0, byte[] arg1) {
        int n;
        int n2;
        byte[][] byArray = new byte[this.cfr_renamed_4][(1 << this.cfr_renamed_4) / 8];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_4) {
            int n4 = n = 0;
            while (n4 < (1 << this.cfr_renamed_4) / 8) {
                byArray[n2][n++] = 0;
                n4 = n;
            }
            n3 = ++n2;
        }
        int n5 = n2 = 0;
        while (n5 < 1 << this.cfr_renamed_4) {
            short s = sprbfg.cfr_renamed_7133((short)n2, this.cfr_renamed_4);
            int n6 = n = 0;
            while (n6 < this.cfr_renamed_4) {
                byte[] byArray2 = byArray[n];
                int n7 = n2 / 8;
                byte by = (byte)(byArray2[n7] | (s >> n & 1) << n2 % 8);
                byArray2[n7] = by;
                n6 = ++n;
            }
            n5 = ++n2;
        }
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_4) {
            byte[] byArray3 = byArray[n];
            this.cfr_renamed_7183(byArray3, arg1, 0);
            n8 = ++n;
        }
        int n9 = n2 = 0;
        while (n9 < this.cfr_renamed_1) {
            arg0[n2] = 0;
            int n10 = this.cfr_renamed_4 - 1;
            while (n10 >= 0) {
                short[] sArray = arg0;
                int n11 = n2;
                short[] sArray2 = arg0;
                int n12 = n2;
                sArray[n12] = (short)(sArray[n12] << 1);
                short s = (short)(sArray2[n11] | byArray[n][n2 / 8] >> n2 % 8 & 1);
                sArray2[n11] = s;
                n10 = --n;
            }
            n9 = ++n2;
        }
    }

    public sprxgg(int arg0, int arg1, int arg2) {
        super(arg0, arg1, arg2);
    }
}


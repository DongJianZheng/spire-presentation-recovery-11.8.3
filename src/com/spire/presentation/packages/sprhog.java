/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfg;
import com.spire.presentation.packages.sprphg;

public class sprhog
extends sprphg {
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
        int n8 = n2 = 0;
        while (n8 < this.cfr_renamed_4) {
            byte[] byArray3 = byArray[n2];
            this.cfr_renamed_7183(byArray3, arg1, 0);
            n8 = ++n2;
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

    private /* synthetic */ void cfr_renamed_7183(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2;
        long[] lArray;
        int n3;
        int n4;
        long[] lArray2 = new long[64];
        long[] lArray3 = new long[64];
        int n5 = n4 = 0;
        while (n5 < 64) {
            int n6 = n4++;
            lArray2[n6] = sprbfg.cfr_renamed_7134(arg0, n6 * 8);
            n5 = n4;
        }
        if (arg2 == 0) {
            n3 = 256;
            lArray = lArray2;
            n2 = this.cfr_renamed_2 * 2 + 40;
        } else {
            n3 = -256;
            lArray = lArray2;
            n2 = this.cfr_renamed_2 * 2 + 40 + (2 * this.cfr_renamed_4 - 2) * 256;
        }
        sprhog.cfr_renamed_7185(lArray, lArray2);
        int n7 = n = 0;
        while (n7 <= 5) {
            int n8 = n4 = 0;
            while (n8 < 64) {
                int n9 = n4++;
                lArray3[n9] = sprbfg.cfr_renamed_7131(arg1, n2 + n9 * 4);
                n8 = n4;
            }
            sprhog.cfr_renamed_7185(lArray3, lArray3);
            sprhog.cfr_renamed_7188(lArray2, lArray3, n);
            n2 += n3;
            n7 = ++n;
        }
        sprhog.cfr_renamed_7185(lArray2, lArray2);
        int n10 = n = 0;
        while (n10 <= 5) {
            int n11 = n4 = 0;
            while (n11 < 32) {
                int n12 = n4++;
                lArray3[n12] = sprbfg.cfr_renamed_7134(arg1, n2 + n12 * 8);
                n11 = n4;
            }
            sprhog.cfr_renamed_7188(lArray2, lArray3, n);
            n2 += n3;
            n10 = ++n;
        }
        int n13 = n = 4;
        while (n13 >= 0) {
            int n14 = n4 = 0;
            while (n14 < 32) {
                int n15 = n4++;
                lArray3[n15] = sprbfg.cfr_renamed_7134(arg1, n2 + n15 * 8);
                n14 = n4;
            }
            sprhog.cfr_renamed_7188(lArray2, lArray3, n);
            n2 += n3;
            n13 = --n;
        }
        sprhog.cfr_renamed_7185(lArray2, lArray2);
        int n16 = n = 5;
        while (n16 >= 0) {
            int n17 = n4 = 0;
            while (n17 < 64) {
                int n18 = n4++;
                lArray3[n18] = sprbfg.cfr_renamed_7131(arg1, n2 + n18 * 4);
                n17 = n4;
            }
            sprhog.cfr_renamed_7185(lArray3, lArray3);
            sprhog.cfr_renamed_7188(lArray2, lArray3, n);
            n2 += n3;
            n16 = --n;
        }
        sprhog.cfr_renamed_7185(lArray2, lArray2);
        int n19 = n4 = 0;
        while (n19 < 64) {
            sprbfg.cfr_renamed_7129(arg0, n4 * 8, lArray2[n4++]);
            n19 = n4;
        }
    }

    public sprhog(int arg0, int arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    public static void cfr_renamed_7188(long[] arg0, long[] arg1, int arg2) {
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
}


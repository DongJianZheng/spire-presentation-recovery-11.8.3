/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprp;

public class sprvoa
implements sprp {
    private static final byte[] cfr_renamed_4;

    @Override
    public int spr\ufe34() {
        return 1;
    }

    static {
        byte[] byArray = new byte[16];
        byArray[0] = 48;
        byArray[1] = 49;
        byArray[2] = 50;
        byArray[3] = 51;
        byArray[4] = 52;
        byArray[5] = 53;
        byArray[6] = 54;
        byArray[7] = 55;
        byArray[8] = 56;
        byArray[9] = 57;
        byArray[10] = 97;
        byArray[11] = 98;
        byArray[12] = 99;
        byArray[13] = 100;
        byArray[14] = 101;
        byArray[15] = 102;
        cfr_renamed_4 = byArray;
    }

    @Override
    public int cfr_renamed_2() {
        return 2;
    }

    @Override
    public int cfr_renamed_4(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        int n2 = arg2 / 2;
        int n3 = n = 0;
        while (n3 < n2) {
            byte by;
            byte by2 = arg0[arg1 + n * 2];
            byte by3 = arg0[arg1 + n * 2 + 1];
            if (by2 < 97) {
                by = by3;
                arg3[arg4] = (byte)(by2 - 48 << 4);
            } else {
                arg3[arg4] = (byte)(by2 - 97 + 10 << 4);
                by = by3;
            }
            if (by < 97) {
                int n4 = arg4;
                arg3[n4] = (byte)(arg3[n4] + (byte)(by3 - 48));
            } else {
                int n5 = arg4;
                arg3[n5] = (byte)(arg3[n5] + (byte)(by3 - 97 + 10));
            }
            ++arg4;
            n3 = ++n;
        }
        return n2;
    }

    @Override
    public int cfr_renamed_499(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n = 0;
        int n2 = 0;
        int n3 = n;
        while (n3 < arg2) {
            arg3[arg4 + n2] = cfr_renamed_4[arg0[arg1] >> 4 & 0xF];
            int n4 = arg4 + n2 + 1;
            byte by = cfr_renamed_4[arg0[arg1] & 0xF];
            ++arg1;
            n2 += 2;
            arg3[n4] = by;
            n3 = ++n;
        }
        return arg2 * 2;
    }
}


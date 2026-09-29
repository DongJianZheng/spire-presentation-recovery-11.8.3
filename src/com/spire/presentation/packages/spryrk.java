/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;

public class spryrk {
    public static byte[] cfr_renamed_10032(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, arg0.length - arg1, byArray, 0, arg1);
        return byArray;
    }

    public static byte[] cfr_renamed_10033(byte[] arg0, int arg1) {
        return sproze.cfr_renamed_523(arg0, arg1);
    }

    public static byte[] cfr_renamed_10034(byte[] arg0, int arg1, int arg2) {
        if (arg0.length < arg1 + arg2) {
            arg1 = arg0.length - arg2;
        }
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, arg2, byArray, 0, arg1);
        return byArray;
    }

    public static byte[] cfr_renamed_10035(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n] ^ arg1[n3]);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }
}


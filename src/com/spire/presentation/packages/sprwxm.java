/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriez;
import com.spire.presentation.packages.sprkfha;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprwxm {
    public static long cfr_renamed_12000(long arg0, int arg1) {
        return arg0 >> arg1;
    }

    @sprtea
    public static char[] cfr_renamed_1112(byte[] arg0) {
        return sprkfha.cfr_renamed_11605().cfr_renamed_12001(arg0);
    }

    public static int cfr_renamed_11993(int arg0, int arg1) {
        return (int)(((long)arg0 & 0xFFFFFFFFL) >> arg1);
    }

    @sprtea
    public static byte[] cfr_renamed_433(String arg0) {
        return sprkfha.cfr_renamed_11605().cfr_renamed_11606(arg0);
    }

    public static int cfr_renamed_12002(spriez arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        if (arg1.length == 0) {
            return 0;
        }
        char[] cArray = new char[arg1.length];
        int n2 = arg0.cfr_renamed_12003(cArray, arg2, arg3);
        if (n2 == 0) {
            return -1;
        }
        int n3 = n = arg2;
        while (n3 < arg2 + n2) {
            int n4 = n++;
            arg1[n4] = (byte)cArray[n4];
            n3 = n;
        }
        return n2;
    }
}


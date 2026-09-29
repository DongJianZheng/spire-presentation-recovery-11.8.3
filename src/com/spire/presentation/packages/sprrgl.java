/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;

public class sprrgl {
    public static byte[] cfr_renamed_10471(byte arg0) {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return sproze.cfr_renamed_543(sprrgl.cfr_renamed_10114(8L), byArray);
    }

    public static byte[] cfr_renamed_10112(long arg0) {
        int n;
        long l;
        int n2 = 1;
        long l2 = l = arg0;
        while ((l = l2 >> 8) != 0L) {
            n2 = (byte)(n2 + 1);
            l2 = l;
        }
        byte[] byArray = new byte[n2 + 1];
        int n3 = n2;
        byArray[n3] = n3;
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n;
            byte by = (byte)(arg0 >> 8 * (n2 - n - 1));
            byArray[n5] = by;
            n4 = ++n;
        }
        return byArray;
    }

    public static byte[] cfr_renamed_502(byte[] arg0, int arg1, int arg2) {
        if (arg0.length == arg2) {
            return sproze.cfr_renamed_543(sprrgl.cfr_renamed_10114(arg2 * 8), arg0);
        }
        int n = arg1;
        return sproze.cfr_renamed_543(sprrgl.cfr_renamed_10114(arg2 * 8), sproze.cfr_renamed_533(arg0, n, n + arg2));
    }

    public static byte[] cfr_renamed_10114(long arg0) {
        int n;
        long l;
        int n2 = 1;
        long l2 = l = arg0;
        while ((l = l2 >> 8) != 0L) {
            n2 = (byte)(n2 + 1);
            l2 = l;
        }
        byte[] byArray = new byte[n2 + 1];
        byArray[0] = n2;
        int n3 = n = 1;
        while (n3 <= n2) {
            int n4 = n;
            byte by = (byte)(arg0 >> 8 * (n2 - n));
            byArray[n4] = by;
            n3 = ++n;
        }
        return byArray;
    }
}


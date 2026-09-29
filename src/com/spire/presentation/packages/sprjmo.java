/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhml;
import com.spire.presentation.packages.sprnvn;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprjmo {
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 2;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 3 ^ (3 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ sprjmo() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprhml.cfr_renamed_9(" \r\u0011\u001c:").equals(arg0)) {
            return 0;
        }
        if (sprnvn.cfr_renamed_9("@cqrD").equals(arg0)) {
            return 1;
        }
        if (sprhml.cfr_renamed_9("<\u0000\u0001\u0013\u0006\u0015\u0004\u0017").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprnvn.cfr_renamed_9("Ghyh}q|&WktA`gvowhf@{j~&|g\u007fc<"));
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprhml.cfr_renamed_9(" \r\u0011\u001c:");
            }
            case 1: {
                return sprnvn.cfr_renamed_9("@cqrD");
            }
            case 2: {
                return sprhml.cfr_renamed_9("<\u0000\u0001\u0013\u0006\u0015\u0004\u0017");
            }
        }
        return sprnvn.cfr_renamed_9("S|m|ieh2C\u007f`Utsb{c|rTo~j2psjgc<");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprhml.cfr_renamed_9(" \r\u0011\u001c:");
            }
            case 1: {
                return sprnvn.cfr_renamed_9("@cqrD");
            }
            case 2: {
                return sprhml.cfr_renamed_9("<\u0000\u0001\u0013\u0006\u0015\u0004\u0017");
            }
        }
        return sprnvn.cfr_renamed_9("S|m|ieh2C\u007f`Utsb{c|rTo~j2psjgc<");
    }
}


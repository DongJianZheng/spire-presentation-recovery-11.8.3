/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprupk;

public final class sprggk {
    private final byte[] cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = 5 << 3 ^ 1;
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

    private /* synthetic */ sprggk(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public /* synthetic */ sprggk(byte[] arg0, sprupk arg1) {
        this(arg0);
    }

    public byte[] cfr_renamed_1470() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}


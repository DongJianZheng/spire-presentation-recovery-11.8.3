/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprtgn {
    public static final int cfr_renamed_93 = 33639248;
    public static final int cfr_renamed_86 = 101010256;
    public static final int cfr_renamed_152 = 4;
    public static final int cfr_renamed_112 = 4096;
    public static final short cfr_renamed_119 = 45;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 2;
    public static final long cfr_renamed_1 = 0xFFFFFFFFL;
    public static final int cfr_renamed_2 = 67324752;
    public static final short cfr_renamed_3 = 20;
    public static final int cfr_renamed_4 = 12;

    private /* synthetic */ sprtgn() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 3);
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
}


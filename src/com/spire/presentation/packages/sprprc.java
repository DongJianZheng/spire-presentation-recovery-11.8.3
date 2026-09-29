/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprprc {
    public static final int cfr_renamed_112 = 1;
    public static final int cfr_renamed_119 = 7;
    public static final int cfr_renamed_91 = 2;
    public static final int cfr_renamed_0 = 6;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 0;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4;
        int cfr_ignored_0 = 4 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
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


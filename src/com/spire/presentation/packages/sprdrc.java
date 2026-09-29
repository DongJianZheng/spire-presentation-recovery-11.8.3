/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprdrc {
    public static final short cfr_renamed_86 = 2;
    public static final short cfr_renamed_152 = 5;
    public static final short cfr_renamed_112 = 6;
    public static final short cfr_renamed_119 = 3;
    public static final short cfr_renamed_91 = 65;
    public static final short cfr_renamed_0 = 64;
    public static final short cfr_renamed_1 = 66;
    public static final short cfr_renamed_2 = 20;
    public static final short cfr_renamed_3 = 1;
    public static final short cfr_renamed_4 = 4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1 << 1;
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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


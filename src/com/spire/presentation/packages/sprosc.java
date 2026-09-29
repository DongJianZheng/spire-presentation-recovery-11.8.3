/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprosc {
    public static final int cfr_renamed_82 = 16;
    public static final int cfr_renamed_126 = 12;
    public static final int cfr_renamed_88 = 1;
    public static final int cfr_renamed_31 = 13;
    public static final int cfr_renamed_272 = 22;
    public static final int cfr_renamed_145 = 20;
    public static final int cfr_renamed_114 = 18;
    public static final int cfr_renamed_96 = 24;
    public static final int cfr_renamed_105 = 9;
    public static final int cfr_renamed_137 = 14;
    public static final int cfr_renamed_79 = 0;
    public static final int cfr_renamed_107 = 5;
    public static final int cfr_renamed_132 = 21;
    public static final int cfr_renamed_102 = 23;
    public static final int cfr_renamed_93 = 6;
    public static final int cfr_renamed_86 = 17;
    public static final int cfr_renamed_152 = 11;
    public static final int cfr_renamed_112 = 8;
    public static final int cfr_renamed_119 = 2;
    public static final int cfr_renamed_91 = 7;
    public static final int cfr_renamed_0 = 15;
    public static final int cfr_renamed_1 = 10;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 4;
    public static final int cfr_renamed_4 = 19;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 3 ^ 2;
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


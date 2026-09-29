/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprrpk {
    public static final int cfr_renamed_953 = 2;
    public static final int cfr_renamed_133 = 12;
    public static final int cfr_renamed_185 = 17;
    public static final int spr\ufe34 = 3;
    public static final int cfr_renamed_82 = 13;
    public static final int cfr_renamed_126 = 19;
    public static final int cfr_renamed_88 = 9;
    public static final int cfr_renamed_31 = 27;
    public static final int cfr_renamed_272 = 8;
    public static final int cfr_renamed_145 = 15;
    public static final int cfr_renamed_114 = 11;
    public static final int cfr_renamed_96 = 14;
    public static final int cfr_renamed_105 = 24;
    public static final int cfr_renamed_137 = 21;
    public static final int cfr_renamed_79 = 7;
    public static final int cfr_renamed_107 = 25;
    public static final int cfr_renamed_132 = 22;
    public static final int cfr_renamed_102 = 10;
    public static final int cfr_renamed_93 = 20;
    public static final int cfr_renamed_86 = 26;
    public static final int cfr_renamed_152 = 23;
    public static final int cfr_renamed_112 = 4;
    public static final int cfr_renamed_119 = 28;
    public static final int cfr_renamed_91 = 5;
    public static final int cfr_renamed_0 = 16;
    public static final int cfr_renamed_1 = 29;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 18;
    public static final int cfr_renamed_4 = 6;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 2 ^ 5;
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


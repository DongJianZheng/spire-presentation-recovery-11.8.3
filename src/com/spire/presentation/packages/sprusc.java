/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprusc {
    public static final int cfr_renamed_126 = 6;
    public static final int cfr_renamed_88 = 4;
    public static final int cfr_renamed_31 = 3;
    public static final int cfr_renamed_272 = 7;
    public static final int cfr_renamed_145 = 13;
    public static final int cfr_renamed_114 = 10;
    public static final int cfr_renamed_96 = 14;
    public static final int cfr_renamed_105 = 20;
    public static final int cfr_renamed_137 = 11;
    public static final int cfr_renamed_79 = 17;
    public static final int cfr_renamed_107 = 102;
    public static final int cfr_renamed_132 = 8;
    public static final int cfr_renamed_102 = 101;
    public static final int cfr_renamed_93 = 16;
    public static final int cfr_renamed_86 = 9;
    public static final int cfr_renamed_152 = 12;
    public static final int cfr_renamed_112 = 1;
    public static final int cfr_renamed_119 = 0;
    public static final int cfr_renamed_91 = 18;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 100;
    public static final int cfr_renamed_2 = 5;
    public static final int cfr_renamed_3 = 19;
    public static final int cfr_renamed_4 = 15;

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
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


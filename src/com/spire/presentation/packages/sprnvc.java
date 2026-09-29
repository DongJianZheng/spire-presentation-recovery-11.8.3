/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprnvc {
    public static final int cfr_renamed_724 = 4;
    public static final int cfr_renamed_953 = 19;
    public static final int cfr_renamed_133 = 2;
    public static final int cfr_renamed_185 = 8;
    public static final int spr\ufe34 = 16;
    public static final int cfr_renamed_82 = 11;
    public static final int cfr_renamed_126 = 27;
    public static final int cfr_renamed_88 = 65282;
    public static final int cfr_renamed_31 = 20;
    public static final int cfr_renamed_272 = 25;
    public static final int cfr_renamed_145 = 1;
    public static final int cfr_renamed_114 = 23;
    public static final int cfr_renamed_96 = 15;
    public static final int cfr_renamed_105 = 28;
    public static final int cfr_renamed_137 = 18;
    public static final int cfr_renamed_79 = 24;
    public static final int cfr_renamed_107 = 6;
    public static final int cfr_renamed_132 = 17;
    public static final int cfr_renamed_102 = 3;
    public static final int cfr_renamed_93 = 22;
    public static final int cfr_renamed_86 = 12;
    public static final int cfr_renamed_152 = 21;
    public static final int cfr_renamed_112 = 7;
    public static final int cfr_renamed_119 = 26;
    public static final int cfr_renamed_91 = 65281;
    public static final int cfr_renamed_0 = 14;
    public static final int cfr_renamed_1 = 13;
    public static final int cfr_renamed_2 = 10;
    public static final int cfr_renamed_3 = 5;
    public static final int cfr_renamed_4 = 9;

    public static boolean cfr_renamed_2990(int arg0) {
        return arg0 >= 1 && arg0 <= 28 || arg0 >= 65281 && arg0 <= 65282;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 2;
        int cfr_ignored_0 = 4 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5) << 1;
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

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_3006(int arg0) {
        switch (arg0) {
            case 65281: 
            case 65282: {
                return false;
            }
        }
        return true;
    }
}

